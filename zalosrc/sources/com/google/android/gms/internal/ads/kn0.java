package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes2.dex */
public final class kn0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f23392a;

    /* renamed from: b */
    private final jn0 f23393b;

    /* renamed from: c */
    private boolean f23394c;

    /* renamed from: d */
    private boolean f23395d;

    /* renamed from: e */
    private boolean f23396e;

    /* renamed from: f */
    private float f23397f = 1.0f;

    public kn0(Context context, jn0 jn0Var) {
        this.f23392a = (AudioManager) context.getSystemService("audio");
        this.f23393b = jn0Var;
    }

    /* renamed from: f */
    private final void m23969f() {
        boolean z11 = false;
        if (this.f23395d && !this.f23396e && this.f23397f > 0.0f) {
            if (!this.f23394c) {
                AudioManager audioManager = this.f23392a;
                if (audioManager != null) {
                    if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                        z11 = true;
                    }
                    this.f23394c = z11;
                }
                this.f23393b.zzn();
                return;
            }
            return;
        }
        if (this.f23394c) {
            AudioManager audioManager2 = this.f23392a;
            if (audioManager2 != null) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z11 = true;
                }
                this.f23394c = z11;
            }
            this.f23393b.zzn();
        }
    }

    /* renamed from: a */
    public final float m23970a() {
        float f11 = this.f23396e ? 0.0f : this.f23397f;
        if (this.f23394c) {
            return f11;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void m23971b() {
        this.f23395d = true;
        m23969f();
    }

    /* renamed from: c */
    public final void m23972c() {
        this.f23395d = false;
        m23969f();
    }

    /* renamed from: d */
    public final void m23973d(boolean z11) {
        this.f23396e = z11;
        m23969f();
    }

    /* renamed from: e */
    public final void m23974e(float f11) {
        this.f23397f = f11;
        m23969f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i11) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23394c = z11;
        this.f23393b.zzn();
    }
}
