package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class li4 {

    /* renamed from: a */
    private final Spatializer f23947a;

    /* renamed from: b */
    private final boolean f23948b;

    /* renamed from: c */
    private Handler f23949c;

    /* renamed from: d */
    private Spatializer.OnSpatializerStateChangedListener f23950d;

    private li4(Spatializer spatializer) {
        int immersiveAudioLevel;
        boolean z11;
        this.f23947a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        if (immersiveAudioLevel != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23948b = z11;
    }

    /* renamed from: a */
    public static li4 m24303a(Context context) {
        Spatializer spatializer;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            spatializer = audioManager.getSpatializer();
            return new li4(spatializer);
        }
        return null;
    }

    /* renamed from: b */
    public final void m24304b(si4 si4Var, Looper looper) {
        if (this.f23950d == null && this.f23949c == null) {
            this.f23950d = new di4(this, si4Var);
            Handler handler = new Handler(looper);
            this.f23949c = handler;
            this.f23947a.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.ci4

                /* renamed from: p */
                public final /* synthetic */ Handler f18445p;

                public /* synthetic */ ci4(Handler handler2) {
                    r1 = handler2;
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    r1.post(runnable);
                }
            }, this.f23950d);
        }
    }

    /* renamed from: c */
    public final void m24305c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f23950d;
        if (onSpatializerStateChangedListener != null && this.f23949c != null) {
            this.f23947a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            Handler handler = this.f23949c;
            int i11 = g92.f20474a;
            handler.removeCallbacksAndMessages(null);
            this.f23949c = null;
            this.f23950d = null;
        }
    }

    /* renamed from: d */
    public final boolean m24306d(b44 b44Var, C4671k3 c4671k3) {
        int i11;
        boolean canBeSpatialized;
        if ("audio/eac3-joc".equals(c4671k3.f23099l) && c4671k3.f23112y == 16) {
            i11 = 12;
        } else {
            i11 = c4671k3.f23112y;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(g92.m22326T(i11));
        int i12 = c4671k3.f23113z;
        if (i12 != -1) {
            channelMask.setSampleRate(i12);
        }
        canBeSpatialized = this.f23947a.canBeSpatialized(b44Var.m20400a().f17513a, channelMask.build());
        return canBeSpatialized;
    }

    /* renamed from: e */
    public final boolean m24307e() {
        boolean isAvailable;
        isAvailable = this.f23947a.isAvailable();
        return isAvailable;
    }

    /* renamed from: f */
    public final boolean m24308f() {
        boolean isEnabled;
        isEnabled = this.f23947a.isEnabled();
        return isEnabled;
    }

    /* renamed from: g */
    public final boolean m24309g() {
        return this.f23948b;
    }
}
