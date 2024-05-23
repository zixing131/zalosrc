package com.zing.zalo.common;

import android.content.Context;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.common.C7862e;
import com.zing.zalo.common.InterfaceC7854c;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.File;

/* renamed from: com.zing.zalo.common.e */
/* loaded from: classes3.dex */
public final class C7862e implements InterfaceC7854c {

    /* renamed from: a */
    private ZMediaPlayer f42307a;

    /* renamed from: b */
    private InterfaceC7854c.c f42308b;

    /* renamed from: c */
    private InterfaceC7854c.d f42309c;

    /* renamed from: d */
    private InterfaceC7854c.b f42310d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final boolean m40320n(C7862e c7862e, C7862e c7862e2, IMediaPlayer iMediaPlayer, int i11, int i12) {
        AbstractC19074t.m100208f(c7862e, "this$0");
        AbstractC19074t.m100208f(c7862e2, "$p");
        InterfaceC7854c.c m40324l = c7862e.m40324l();
        if (m40324l != null) {
            m40324l.mo40166a(c7862e2, 0, 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m40321o(C7862e c7862e, C7862e c7862e2, IMediaPlayer iMediaPlayer) {
        AbstractC19074t.m100208f(c7862e, "this$0");
        AbstractC19074t.m100208f(c7862e2, "$p");
        InterfaceC7854c.d m40325m = c7862e.m40325m();
        if (m40325m != null) {
            m40325m.mo40165a(c7862e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m40322p(C7862e c7862e, C7862e c7862e2, IMediaPlayer iMediaPlayer) {
        AbstractC19074t.m100208f(c7862e, "this$0");
        AbstractC19074t.m100208f(c7862e2, "$p");
        InterfaceC7854c.b m40323k = c7862e.m40323k();
        if (m40323k != null) {
            m40323k.mo40164a(c7862e2);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: a */
    public void mo40168a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        if (this.f42307a == null) {
            this.f42307a = new ZMediaPlayer();
        }
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: vg.o7
                @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                    boolean m40320n;
                    m40320n = C7862e.m40320n(C7862e.this, this, iMediaPlayer, i11, i12);
                    return m40320n;
                }
            });
        }
        ZMediaPlayer zMediaPlayer2 = this.f42307a;
        if (zMediaPlayer2 != null) {
            zMediaPlayer2.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: vg.p7
                @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnPreparedListener
                public final void onPrepared(IMediaPlayer iMediaPlayer) {
                    C7862e.m40321o(C7862e.this, this, iMediaPlayer);
                }
            });
        }
        ZMediaPlayer zMediaPlayer3 = this.f42307a;
        if (zMediaPlayer3 != null) {
            zMediaPlayer3.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: vg.q7
                @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
                public final void onVideoCompletion(IMediaPlayer iMediaPlayer) {
                    C7862e.m40322p(C7862e.this, this, iMediaPlayer);
                }
            });
        }
        String cacheDir = ZMediaPlayerSettings.getCacheDir(1);
        ZMediaPlayer zMediaPlayer4 = this.f42307a;
        if (zMediaPlayer4 != null) {
            zMediaPlayer4.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_DISABLE_AUDIO, 0L);
        }
        ZMediaPlayer zMediaPlayer5 = this.f42307a;
        if (zMediaPlayer5 != null) {
            zMediaPlayer5.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_DISABLE_VIDEO, 1L);
        }
        ZMediaPlayer zMediaPlayer6 = this.f42307a;
        if (zMediaPlayer6 != null) {
            zMediaPlayer6.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_PACKET_BUFFERING, 1L);
        }
        ZMediaPlayer zMediaPlayer7 = this.f42307a;
        if (zMediaPlayer7 != null) {
            zMediaPlayer7.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_START_ON_PREPARED, 0L);
        }
        ZMediaPlayer zMediaPlayer8 = this.f42307a;
        if (zMediaPlayer8 != null) {
            zMediaPlayer8.setOption(1, "enable_cached", 1L);
        }
        ZMediaPlayer zMediaPlayer9 = this.f42307a;
        if (zMediaPlayer9 != null) {
            zMediaPlayer9.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_PATH, cacheDir);
        }
        ZMediaPlayer zMediaPlayer10 = this.f42307a;
        if (zMediaPlayer10 != null) {
            zMediaPlayer10.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_OID, "FeedMusic");
        }
        ZMediaPlayer zMediaPlayer11 = this.f42307a;
        if (zMediaPlayer11 != null) {
            zMediaPlayer11.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_INDEX, 0L);
        }
        ZMediaPlayer zMediaPlayer12 = this.f42307a;
        if (zMediaPlayer12 != null) {
            zMediaPlayer12.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_SECTION, "1");
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: b */
    public void mo40169b(InterfaceC7854c.c cVar) {
        this.f42308b = cVar;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: c */
    public void mo40170c(InterfaceC7854c.b bVar) {
        this.f42310d = bVar;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: d */
    public void mo40171d(InterfaceC7854c.d dVar) {
        this.f42309c = dVar;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: e */
    public C7853b.f.a mo40172e() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer == null) {
            return C7853b.f.a.f42237r;
        }
        if (zMediaPlayer != null) {
            zMediaPlayer.start();
        }
        return C7853b.f.a.f42236q;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: f */
    public String mo40173f() {
        String str;
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            str = zMediaPlayer.getDataSource();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: g */
    public int mo40174g(String str) {
        Exception e11;
        int i11;
        AbstractC19074t.m100208f(str, "path");
        try {
            ZMediaPlayer zMediaPlayer = this.f42307a;
            if (zMediaPlayer != null) {
                zMediaPlayer.setDataSource(str);
            }
            i11 = !new File(str).exists() ? 1 : 0;
            try {
                if (i11 == 1) {
                    ZMediaPlayer zMediaPlayer2 = this.f42307a;
                    if (zMediaPlayer2 != null) {
                        zMediaPlayer2.prepareAsync();
                    }
                } else {
                    ZMediaPlayer zMediaPlayer3 = this.f42307a;
                    if (zMediaPlayer3 != null) {
                        zMediaPlayer3.prepare();
                    }
                }
            } catch (Exception e12) {
                e11 = e12;
                AbstractC20110a.f98889a.mo104552e(e11);
                return i11;
            }
        } catch (Exception e13) {
            e11 = e13;
            i11 = 0;
        }
        return i11;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public long getCurrentPosition() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            return zMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public long getDuration() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            return zMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public boolean isPlaying() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            return zMediaPlayer.isPlaying();
        }
        return false;
    }

    /* renamed from: k */
    public InterfaceC7854c.b m40323k() {
        return this.f42310d;
    }

    /* renamed from: l */
    public InterfaceC7854c.c m40324l() {
        return this.f42308b;
    }

    /* renamed from: m */
    public InterfaceC7854c.d m40325m() {
        return this.f42309c;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void pause() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.pause();
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void release() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.release();
        }
        this.f42307a = null;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void reset() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.reset();
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void seekTo(long j11) {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.seekTo(j11);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void setAudioStreamType(int i11) {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.setAudioStreamType(i11);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void setLooping(boolean z11) {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.setLooping(z11);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void setScreenOnWhilePlaying(boolean z11) {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.setScreenOnWhilePlaying(z11);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void setVolume(float f11, float f12) {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.setVolume(f11, f12);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void start() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.start();
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void stop() {
        ZMediaPlayer zMediaPlayer = this.f42307a;
        if (zMediaPlayer != null) {
            zMediaPlayer.stop();
        }
    }
}
