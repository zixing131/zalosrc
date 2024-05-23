package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzdk zzb;
    private VideoLifecycleCallbacks zzc;

    /* loaded from: classes2.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z11) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public int getPlaybackState() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return 0;
            }
            try {
                return zzdkVar.zzh();
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call getPlaybackState on video controller.", e11);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z11;
        synchronized (this.zza) {
            if (this.zzb != null) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return false;
            }
            try {
                return zzdkVar.zzo();
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call isClickToExpandEnabled.", e11);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return false;
            }
            try {
                return zzdkVar.zzp();
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call isUsingCustomPlayerControls.", e11);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return true;
            }
            try {
                return zzdkVar.zzq();
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call isMuted on video controller.", e11);
                return true;
            }
        }
    }

    public void mute(boolean z11) {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzj(z11);
                } catch (RemoteException e11) {
                    yk0.zzh("Unable to call mute on video controller.", e11);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzk();
                } catch (RemoteException e11) {
                    yk0.zzh("Unable to call pause on video controller.", e11);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzl();
                } catch (RemoteException e11) {
                    yk0.zzh("Unable to call play on video controller.", e11);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfe zzfeVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                if (videoLifecycleCallbacks == null) {
                    zzfeVar = null;
                } else {
                    try {
                        zzfeVar = new zzfe(videoLifecycleCallbacks);
                    } catch (RemoteException e11) {
                        yk0.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e11);
                    }
                }
                zzdkVar.zzm(zzfeVar);
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzn();
                } catch (RemoteException e11) {
                    yk0.zzh("Unable to call stop on video controller.", e11);
                }
            }
        }
    }

    public final zzdk zza() {
        zzdk zzdkVar;
        synchronized (this.zza) {
            zzdkVar = this.zzb;
        }
        return zzdkVar;
    }

    public final void zzb(zzdk zzdkVar) {
        synchronized (this.zza) {
            try {
                this.zzb = zzdkVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
