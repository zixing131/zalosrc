package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class qt3 {

    /* renamed from: a */
    private final AudioManager f26956a;

    /* renamed from: b */
    private final or3 f26957b;

    /* renamed from: c */
    private ps3 f26958c;

    /* renamed from: d */
    private int f26959d;

    /* renamed from: e */
    private float f26960e = 1.0f;

    public qt3(Context context, Handler handler, ps3 ps3Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f26956a = audioManager;
        this.f26958c = ps3Var;
        this.f26957b = new or3(this, handler);
        this.f26959d = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m25877c(qt3 qt3Var, int i11) {
        if (i11 != -3 && i11 != -2) {
            if (i11 != -1) {
                if (i11 != 1) {
                    lr1.m24356e("AudioFocusManager", "Unknown focus change type: " + i11);
                    return;
                }
                qt3Var.m25880g(1);
                qt3Var.m25879f(1);
                return;
            }
            qt3Var.m25879f(-1);
            qt3Var.m25878e();
            return;
        }
        if (i11 != -2) {
            qt3Var.m25880g(3);
        } else {
            qt3Var.m25879f(0);
            qt3Var.m25880g(2);
        }
    }

    /* renamed from: e */
    private final void m25878e() {
        if (this.f26959d == 0) {
            return;
        }
        if (g92.f20474a < 26) {
            this.f26956a.abandonAudioFocus(this.f26957b);
        }
        m25880g(0);
    }

    /* renamed from: f */
    private final void m25879f(int i11) {
        int m27461I;
        ps3 ps3Var = this.f26958c;
        if (ps3Var != null) {
            s24 s24Var = (s24) ps3Var;
            boolean zzq = s24Var.f27510p.zzq();
            w24 w24Var = s24Var.f27510p;
            m27461I = w24.m27461I(zzq, i11);
            w24Var.m27474V(zzq, i11, m27461I);
        }
    }

    /* renamed from: g */
    private final void m25880g(int i11) {
        float f11;
        if (this.f26959d == i11) {
            return;
        }
        this.f26959d = i11;
        if (i11 == 3) {
            f11 = 0.2f;
        } else {
            f11 = 1.0f;
        }
        if (this.f26960e == f11) {
            return;
        }
        this.f26960e = f11;
        ps3 ps3Var = this.f26958c;
        if (ps3Var != null) {
            ((s24) ps3Var).f27510p.m27471S();
        }
    }

    /* renamed from: a */
    public final float m25881a() {
        return this.f26960e;
    }

    /* renamed from: b */
    public final int m25882b(boolean z11, int i11) {
        m25878e();
        if (z11) {
            return 1;
        }
        return -1;
    }

    /* renamed from: d */
    public final void m25883d() {
        this.f26958c = null;
        m25878e();
    }
}
