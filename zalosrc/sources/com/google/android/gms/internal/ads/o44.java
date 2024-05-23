package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class o44 {

    /* renamed from: a */
    private final Context f25431a;

    /* renamed from: b */
    private final Handler f25432b;

    /* renamed from: c */
    private final j44 f25433c;

    /* renamed from: d */
    private final AudioManager f25434d;

    /* renamed from: e */
    private m44 f25435e;

    /* renamed from: f */
    private int f25436f;

    /* renamed from: g */
    private int f25437g;

    /* renamed from: h */
    private boolean f25438h;

    public o44(Context context, Handler handler, j44 j44Var) {
        Context applicationContext = context.getApplicationContext();
        this.f25431a = applicationContext;
        this.f25432b = handler;
        this.f25433c = j44Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        v71.m27171b(audioManager);
        this.f25434d = audioManager;
        this.f25436f = 3;
        this.f25437g = m25080g(audioManager, 3);
        this.f25438h = m25082i(audioManager, this.f25436f);
        m44 m44Var = new m44(this, null);
        try {
            g92.m22333a(applicationContext, m44Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f25435e = m44Var;
        } catch (RuntimeException e11) {
            lr1.m24357f("StreamVolumeManager", "Error registering stream volume receiver", e11);
        }
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m25079d(o44 o44Var) {
        o44Var.m25081h();
    }

    /* renamed from: g */
    private static int m25080g(AudioManager audioManager, int i11) {
        try {
            return audioManager.getStreamVolume(i11);
        } catch (RuntimeException e11) {
            lr1.m24357f("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i11, e11);
            return audioManager.getStreamMaxVolume(i11);
        }
    }

    /* renamed from: h */
    public final void m25081h() {
        jo1 jo1Var;
        int m25080g = m25080g(this.f25434d, this.f25436f);
        boolean m25082i = m25082i(this.f25434d, this.f25436f);
        if (this.f25437g == m25080g && this.f25438h == m25082i) {
            return;
        }
        this.f25437g = m25080g;
        this.f25438h = m25082i;
        jo1Var = ((s24) this.f25433c).f27510p.f29724k;
        jo1Var.m23692d(30, new gl1() { // from class: com.google.android.gms.internal.ads.n24

            /* renamed from: a */
            public final /* synthetic */ int f24981a;

            /* renamed from: b */
            public final /* synthetic */ boolean f24982b;

            public /* synthetic */ n24(int m25080g2, boolean m25082i2) {
                r1 = m25080g2;
                r2 = m25082i2;
            }

            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((ih0) obj).mo23267y(r1, r2);
            }
        });
        jo1Var.m23691c();
    }

    /* renamed from: i */
    private static boolean m25082i(AudioManager audioManager, int i11) {
        boolean isStreamMute;
        if (g92.f20474a >= 23) {
            isStreamMute = audioManager.isStreamMute(i11);
            return isStreamMute;
        }
        if (m25080g(audioManager, i11) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int m25083a() {
        return this.f25434d.getStreamMaxVolume(this.f25436f);
    }

    /* renamed from: b */
    public final int m25084b() {
        int streamMinVolume;
        if (g92.f20474a >= 28) {
            streamMinVolume = this.f25434d.getStreamMinVolume(this.f25436f);
            return streamMinVolume;
        }
        return 0;
    }

    /* renamed from: e */
    public final void m25085e() {
        m44 m44Var = this.f25435e;
        if (m44Var != null) {
            try {
                this.f25431a.unregisterReceiver(m44Var);
            } catch (RuntimeException e11) {
                lr1.m24357f("StreamVolumeManager", "Error unregistering stream volume receiver", e11);
            }
            this.f25435e = null;
        }
    }

    /* renamed from: f */
    public final void m25086f(int i11) {
        o44 o44Var;
        vf4 m27466N;
        vf4 vf4Var;
        jo1 jo1Var;
        if (this.f25436f == 3) {
            return;
        }
        this.f25436f = 3;
        m25081h();
        s24 s24Var = (s24) this.f25433c;
        o44Var = s24Var.f27510p.f29738y;
        m27466N = w24.m27466N(o44Var);
        vf4Var = s24Var.f27510p.f29708b0;
        if (!m27466N.equals(vf4Var)) {
            s24Var.f27510p.f29708b0 = m27466N;
            jo1Var = s24Var.f27510p.f29724k;
            jo1Var.m23692d(29, new gl1() { // from class: com.google.android.gms.internal.ads.o24
                public /* synthetic */ o24() {
                }

                @Override // com.google.android.gms.internal.ads.gl1
                public final void zza(Object obj) {
                    ((ih0) obj).mo23252N(vf4.this);
                }
            });
            jo1Var.m23691c();
        }
    }
}
