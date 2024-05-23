package com.zing.zalo.zmedia.player;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.media.TimedText;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import pl0.C24821b;

/* loaded from: classes7.dex */
public class AndroidMediaPlayer extends AbstractMediaPlayer {
    private static C24821b sMediaInfo;
    private boolean callOnce;
    private String mDataSource;
    private final Object mInitLock;
    private final C17298a mInternalListenerAdapter;
    private final MediaPlayer mInternalMediaPlayer;
    private boolean mIsReleased;
    private MediaDataSource mMediaDataSource;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zmedia.player.AndroidMediaPlayer$a */
    /* loaded from: classes7.dex */
    public class C17298a implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnTimedTextListener {

        /* renamed from: p */
        public final WeakReference f88141p;

        public C17298a(AndroidMediaPlayer androidMediaPlayer) {
            this.f88141p = new WeakReference(androidMediaPlayer);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i11) {
            if (((AndroidMediaPlayer) this.f88141p.get()) == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnBufferingUpdate(i11);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (((AndroidMediaPlayer) this.f88141p.get()) == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnCompletion();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            if (((AndroidMediaPlayer) this.f88141p.get()) != null && AndroidMediaPlayer.this.notifyOnError(i11, i12)) {
                return true;
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
            if (((AndroidMediaPlayer) this.f88141p.get()) != null && AndroidMediaPlayer.this.notifyOnInfo(i11, i12, null)) {
                return true;
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (((AndroidMediaPlayer) this.f88141p.get()) == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnPrepared();
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (((AndroidMediaPlayer) this.f88141p.get()) == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnSeekComplete();
        }

        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
            ZTimedText zTimedText;
            if (((AndroidMediaPlayer) this.f88141p.get()) == null) {
                return;
            }
            if (timedText != null) {
                zTimedText = new ZTimedText(timedText.getBounds(), timedText.getText());
            } else {
                zTimedText = null;
            }
            AndroidMediaPlayer.this.notifyOnTimedText(zTimedText);
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i11, int i12) {
            if (((AndroidMediaPlayer) this.f88141p.get()) == null) {
                return;
            }
            AndroidMediaPlayer.this.notifyOnVideoSizeChanged(i11, i12, 1, 1);
        }
    }

    public AndroidMediaPlayer() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.mInitLock = obj;
        this.callOnce = false;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.mInternalMediaPlayer = mediaPlayer;
        }
        mediaPlayer.setAudioStreamType(3);
        this.mInternalListenerAdapter = new C17298a(this);
        attachInternalListeners();
        notifyOnStateChanged(0);
    }

    private void attachInternalListeners() {
        this.mInternalMediaPlayer.setOnPreparedListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnBufferingUpdateListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnCompletionListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnSeekCompleteListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnVideoSizeChangedListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnErrorListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnInfoListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnTimedTextListener(this.mInternalListenerAdapter);
    }

    private void releaseMediaDataSource() {
        MediaDataSource mediaDataSource = this.mMediaDataSource;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            } catch (IOException unused) {
            }
            this.mMediaDataSource = null;
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getAudioSessionId() {
        return this.mInternalMediaPlayer.getAudioSessionId();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public long getCurrentPosition() {
        try {
            return this.mInternalMediaPlayer.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0L;
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public String getDataSource() {
        return this.mDataSource;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public long getDuration() {
        try {
            return this.mInternalMediaPlayer.getDuration();
        } catch (IllegalStateException unused) {
            return 0L;
        }
    }

    public MediaPlayer getInternalMediaPlayer() {
        return this.mInternalMediaPlayer;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public C24821b getMediaInfo() {
        if (sMediaInfo == null) {
            C24821b c24821b = new C24821b();
            sMediaInfo = c24821b;
            c24821b.f119161b = "android";
            c24821b.f119162c = "HW";
            c24821b.f119163d = "android";
            c24821b.f119164e = "HW";
        }
        return sMediaInfo;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mInternalMediaPlayer.getVideoHeight();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getVideoSarDen() {
        return 1;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getVideoSarNum() {
        return 1;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getVideoWidth() {
        return this.mInternalMediaPlayer.getVideoWidth();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public boolean isLooping() {
        return this.mInternalMediaPlayer.isLooping();
    }

    public boolean isPlayWhenReady() {
        return false;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public boolean isPlayable() {
        return true;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public boolean isPlaying() {
        try {
            return this.mInternalMediaPlayer.isPlaying();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        this.mInternalMediaPlayer.pause();
        notifyOnStateChanged(4);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void prepare() throws Exception {
        if (!this.callOnce) {
            this.callOnce = true;
            notifyOnStateChanged(1);
            this.mInternalMediaPlayer.prepare();
            notifyOnStateChanged(2);
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        if (!this.callOnce) {
            this.callOnce = true;
            this.mInternalMediaPlayer.prepareAsync();
            notifyOnStateChanged(1);
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void release() {
        this.mIsReleased = true;
        this.mInternalMediaPlayer.release();
        releaseMediaDataSource();
        resetListeners();
        attachInternalListeners();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void reset() {
        try {
            this.mInternalMediaPlayer.reset();
        } catch (IllegalStateException unused) {
        }
        releaseMediaDataSource();
        resetListeners();
        attachInternalListeners();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void seekTo(long j11) throws IllegalStateException {
        this.mInternalMediaPlayer.seekTo((int) j11);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setAudioStreamType(int i11) {
        this.mInternalMediaPlayer.setAudioStreamType(i11);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSource(IAndroidDataSource iAndroidDataSource) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSourceAsync(String str, IMediaPlayer.OnDataSourceCheckedListener onDataSourceCheckedListener) throws IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSourceWithFormatOptions(String str, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        synchronized (this.mInitLock) {
            try {
                if (!this.mIsReleased) {
                    this.mInternalMediaPlayer.setDisplay(surfaceHolder);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setKeepInBackground(boolean z11) {
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setLooping(boolean z11) {
        this.mInternalMediaPlayer.setLooping(z11);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z11) {
        this.mInternalMediaPlayer.setScreenOnWhilePlaying(z11);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setSurface(Surface surface) {
        this.mInternalMediaPlayer.setSurface(surface);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setVolume(float f11, float f12) {
        this.mInternalMediaPlayer.setVolume(f11, f12);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setWakeMode(Context context, int i11) {
        this.mInternalMediaPlayer.setWakeMode(context, i11);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void start() throws IllegalStateException {
        this.callOnce = false;
        this.mInternalMediaPlayer.start();
        notifyOnStateChanged(3);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        this.mInternalMediaPlayer.stop();
        notifyOnStateChanged(6);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mInternalMediaPlayer.setDataSource(context, uri);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mInternalMediaPlayer.setDataSource(context, uri, map);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mDataSource = str;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.mInternalMediaPlayer.setDataSource(parse.getPath());
        } else {
            this.mInternalMediaPlayer.setDataSource(str);
        }
    }
}
