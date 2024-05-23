package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class gy2 extends ContentObserver {

    /* renamed from: a */
    private final Context f21463a;

    /* renamed from: b */
    private final AudioManager f21464b;

    /* renamed from: c */
    private final ey2 f21465c;

    /* renamed from: d */
    private float f21466d;

    /* renamed from: e */
    private final oy2 f21467e;

    public gy2(Handler handler, Context context, ey2 ey2Var, oy2 oy2Var, byte[] bArr) {
        super(handler);
        this.f21463a = context;
        this.f21464b = (AudioManager) context.getSystemService("audio");
        this.f21465c = ey2Var;
        this.f21467e = oy2Var;
    }

    /* renamed from: c */
    private final float m22640c() {
        int streamVolume = this.f21464b.getStreamVolume(3);
        int streamMaxVolume = this.f21464b.getStreamMaxVolume(3);
        float f11 = 0.0f;
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f12 = streamVolume / streamMaxVolume;
            f11 = 1.0f;
            if (f12 <= 1.0f) {
                return f12;
            }
        }
        return f11;
    }

    /* renamed from: d */
    private final void m22641d() {
        this.f21467e.m25360d(this.f21466d);
    }

    /* renamed from: a */
    public final void m22642a() {
        this.f21466d = m22640c();
        m22641d();
        this.f21463a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void m22643b() {
        this.f21463a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        super.onChange(z11);
        float m22640c = m22640c();
        if (m22640c != this.f21466d) {
            this.f21466d = m22640c;
            m22641d();
        }
    }
}
