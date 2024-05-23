package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;

@Deprecated
/* loaded from: classes2.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;

    @Deprecated
    public static final int ORIENTATION_ANY = 0;

    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;

    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final int zze;
    private final VideoOptions zzf;
    private final boolean zzg;

    /* loaded from: classes2.dex */
    public @interface AdChoicesPlacement {
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private VideoOptions zze;
        private boolean zza = false;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = false;
        private int zzf = 1;
        private boolean zzg = false;

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i11) {
            this.zzf = i11;
            return this;
        }

        @Deprecated
        public Builder setImageOrientation(int i11) {
            this.zzb = i11;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i11) {
            this.zzc = i11;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z11) {
            this.zzg = z11;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z11) {
            this.zzd = z11;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z11) {
            this.zza = z11;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.zze = videoOptions;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public @interface NativeMediaAspectRatio {
    }

    /* synthetic */ NativeAdOptions(Builder builder, zzd zzdVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
        this.zze = builder.zzf;
        this.zzf = builder.zze;
        this.zzg = builder.zzg;
    }

    public int getAdChoicesPlacement() {
        return this.zze;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.zzb;
    }

    public int getMediaAspectRatio() {
        return this.zzc;
    }

    public VideoOptions getVideoOptions() {
        return this.zzf;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzd;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zzg;
    }
}
