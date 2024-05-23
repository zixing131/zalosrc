package com.zing.zalo.common;

import android.content.Context;
import com.zing.zalo.common.C7853b;

/* renamed from: com.zing.zalo.common.c */
/* loaded from: classes.dex */
public interface InterfaceC7854c {
    public static final a Companion = a.f42247a;

    /* renamed from: com.zing.zalo.common.c$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f42247a = new a();

        private a() {
        }
    }

    /* renamed from: com.zing.zalo.common.c$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo40164a(InterfaceC7854c interfaceC7854c);
    }

    /* renamed from: com.zing.zalo.common.c$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        boolean mo40166a(InterfaceC7854c interfaceC7854c, int i11, int i12);
    }

    /* renamed from: com.zing.zalo.common.c$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo40165a(InterfaceC7854c interfaceC7854c);
    }

    /* renamed from: a */
    void mo40168a(Context context);

    /* renamed from: b */
    void mo40169b(c cVar);

    /* renamed from: c */
    void mo40170c(b bVar);

    /* renamed from: d */
    void mo40171d(d dVar);

    /* renamed from: e */
    C7853b.f.a mo40172e();

    /* renamed from: f */
    String mo40173f();

    /* renamed from: g */
    int mo40174g(String str);

    long getCurrentPosition();

    long getDuration();

    boolean isPlaying();

    void pause();

    void release();

    void reset();

    void seekTo(long j11);

    void setAudioStreamType(int i11);

    void setLooping(boolean z11);

    void setScreenOnWhilePlaying(boolean z11);

    void setVolume(float f11, float f12);

    void start();

    void stop();
}
