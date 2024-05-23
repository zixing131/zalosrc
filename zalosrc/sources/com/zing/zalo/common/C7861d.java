package com.zing.zalo.common;

import android.content.Context;
import android.media.MediaPlayer;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.common.C7861d;
import com.zing.zalo.common.InterfaceC7854c;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.zing.zalo.common.d */
/* loaded from: classes.dex */
public final class C7861d implements InterfaceC7854c {

    /* renamed from: a */
    private MediaPlayer f42302a;

    /* renamed from: b */
    private String f42303b = "";

    /* renamed from: c */
    private InterfaceC7854c.c f42304c;

    /* renamed from: d */
    private InterfaceC7854c.d f42305d;

    /* renamed from: e */
    private InterfaceC7854c.b f42306e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final boolean m40311n(C7861d c7861d, C7861d c7861d2, MediaPlayer mediaPlayer, int i11, int i12) {
        AbstractC19074t.m100208f(c7861d, "this$0");
        AbstractC19074t.m100208f(c7861d2, "$p");
        InterfaceC7854c.c m40315l = c7861d.m40315l();
        if (m40315l != null) {
            return m40315l.mo40166a(c7861d2, i11, i12);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m40312o(C7861d c7861d, C7861d c7861d2, MediaPlayer mediaPlayer) {
        AbstractC19074t.m100208f(c7861d, "this$0");
        AbstractC19074t.m100208f(c7861d2, "$p");
        InterfaceC7854c.d m40316m = c7861d.m40316m();
        if (m40316m != null) {
            m40316m.mo40165a(c7861d2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m40313p(C7861d c7861d, C7861d c7861d2, MediaPlayer mediaPlayer) {
        AbstractC19074t.m100208f(c7861d, "this$0");
        AbstractC19074t.m100208f(c7861d2, "$p");
        InterfaceC7854c.b m40314k = c7861d.m40314k();
        if (m40314k != null) {
            m40314k.mo40164a(c7861d2);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: a */
    public void mo40168a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        if (this.f42302a == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: vg.l7
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i11, int i12) {
                    boolean m40311n;
                    m40311n = C7861d.m40311n(C7861d.this, this, mediaPlayer2, i11, i12);
                    return m40311n;
                }
            });
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: vg.m7
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    C7861d.m40312o(C7861d.this, this, mediaPlayer2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: vg.n7
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    C7861d.m40313p(C7861d.this, this, mediaPlayer2);
                }
            });
            this.f42302a = mediaPlayer;
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: b */
    public void mo40169b(InterfaceC7854c.c cVar) {
        this.f42304c = cVar;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: c */
    public void mo40170c(InterfaceC7854c.b bVar) {
        this.f42306e = bVar;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: d */
    public void mo40171d(InterfaceC7854c.d dVar) {
        this.f42305d = dVar;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: e */
    public C7853b.f.a mo40172e() {
        return C7853b.f.a.f42237r;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: f */
    public String mo40173f() {
        return this.f42303b;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    /* renamed from: g */
    public int mo40174g(String str) {
        FileInputStream fileInputStream;
        int i11;
        AbstractC19074t.m100208f(str, "path");
        this.f42303b = str;
        File file = new File(str);
        if (file.exists()) {
            fileInputStream = new FileInputStream(file);
            MediaPlayer mediaPlayer = this.f42302a;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(fileInputStream.getFD());
            }
            i11 = 0;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Prepare async:");
            sb2.append(str);
            MediaPlayer mediaPlayer2 = this.f42302a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setDataSource(str);
            }
            fileInputStream = null;
            i11 = 1;
        }
        if (i11 == 1) {
            MediaPlayer mediaPlayer3 = this.f42302a;
            if (mediaPlayer3 != null) {
                mediaPlayer3.prepareAsync();
            }
        } else {
            MediaPlayer mediaPlayer4 = this.f42302a;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepare();
            }
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return i11;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public long getCurrentPosition() {
        if (this.f42302a != null) {
            return r0.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public long getDuration() {
        if (this.f42302a != null) {
            return r0.getDuration();
        }
        return 0L;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    /* renamed from: k */
    public InterfaceC7854c.b m40314k() {
        return this.f42306e;
    }

    /* renamed from: l */
    public InterfaceC7854c.c m40315l() {
        return this.f42304c;
    }

    /* renamed from: m */
    public InterfaceC7854c.d m40316m() {
        return this.f42305d;
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void pause() {
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void release() {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.f42302a = null;
        mo40169b(null);
        mo40171d(null);
        mo40170c(null);
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void reset() {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void seekTo(long j11) {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) j11);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void setAudioStreamType(int i11) {
        int i12;
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            if (i11 != 0) {
                i12 = 0;
            } else {
                i12 = 3;
            }
            mediaPlayer.setAudioStreamType(i12);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void setLooping(boolean z11) {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z11);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void setScreenOnWhilePlaying(boolean z11) {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            mediaPlayer.setScreenOnWhilePlaying(z11);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void setVolume(float f11, float f12) {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f11, f12);
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void start() {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // com.zing.zalo.common.InterfaceC7854c
    public void stop() {
        MediaPlayer mediaPlayer = this.f42302a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }
}
