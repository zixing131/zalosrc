package p679yf;

import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: yf.g */
/* loaded from: classes3.dex */
public final class C30927g implements InterfaceC30925e {

    /* renamed from: a */
    private IMediaPlayer f142637a;

    /* renamed from: b */
    private C30923c f142638b;

    /* renamed from: c */
    private boolean f142639c;

    public C30927g(IMediaPlayer iMediaPlayer, C30923c c30923c, boolean z11) {
        AbstractC19074t.m100208f(iMediaPlayer, "mMediaPlayer");
        this.f142637a = iMediaPlayer;
        this.f142638b = c30923c;
        this.f142639c = z11;
    }

    @Override // p679yf.InterfaceC30925e
    /* renamed from: a */
    public boolean mo150224a(int i11) {
        IMediaPlayer iMediaPlayer = this.f142637a;
        if ((iMediaPlayer instanceof ZMediaPlayer) && this.f142639c) {
            AbstractC19074t.m100206d(iMediaPlayer, "null cannot be cast to non-null type com.zing.zalo.zmedia.player.ZMediaPlayer");
            ((ZMediaPlayer) iMediaPlayer).fastSeekTo(i11);
        }
        return this.f142639c;
    }

    @Override // p679yf.InterfaceC30925e
    /* renamed from: b */
    public void mo150225b(float f11) {
        boolean z11;
        C30923c c30923c = this.f142638b;
        if (c30923c != null) {
            AbstractC19074t.m100205c(c30923c);
            c30923c.f142629k = f11;
        }
        IMediaPlayer iMediaPlayer = this.f142637a;
        if (iMediaPlayer instanceof ZMediaPlayer) {
            AbstractC19074t.m100206d(iMediaPlayer, "null cannot be cast to non-null type com.zing.zalo.zmedia.player.ZMediaPlayer");
            ((ZMediaPlayer) iMediaPlayer).setSpeed(f11);
            IMediaPlayer iMediaPlayer2 = this.f142637a;
            AbstractC19074t.m100206d(iMediaPlayer2, "null cannot be cast to non-null type com.zing.zalo.zmedia.player.ZMediaPlayer");
            ZMediaPlayer zMediaPlayer = (ZMediaPlayer) iMediaPlayer2;
            if (f11 == 1.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            zMediaPlayer.setMuted(!z11);
        }
    }

    @Override // p679yf.InterfaceC30925e
    /* renamed from: c */
    public void mo150226c(long j11) {
        if (this.f142639c) {
            IMediaPlayer iMediaPlayer = this.f142637a;
            AbstractC19074t.m100206d(iMediaPlayer, "null cannot be cast to non-null type com.zing.zalo.zmedia.player.ZMediaPlayer");
            ((ZMediaPlayer) iMediaPlayer).setPlayDuration(j11);
        }
    }

    @Override // p679yf.InterfaceC30925e
    /* renamed from: d */
    public boolean mo150227d() {
        if (this.f142639c) {
            this.f142637a.start();
        }
        return this.f142639c;
    }

    @Override // p679yf.InterfaceC30925e
    public int getDuration() {
        if (this.f142639c) {
            return (int) this.f142637a.getDuration();
        }
        return -1;
    }

    @Override // p679yf.InterfaceC30925e
    public boolean isPlaying() {
        if (this.f142639c) {
            return this.f142637a.isPlaying();
        }
        return false;
    }

    @Override // p679yf.InterfaceC30925e
    public boolean pause() {
        if (this.f142639c) {
            this.f142637a.pause();
        }
        return this.f142639c;
    }

    @Override // p679yf.InterfaceC30925e
    public boolean seekTo(int i11) {
        if (this.f142639c) {
            this.f142637a.seekTo(i11);
        }
        return this.f142639c;
    }

    @Override // p679yf.InterfaceC30925e
    public void setVolume(float f11, float f12) {
        this.f142637a.setVolume(f11, f12);
    }
}
