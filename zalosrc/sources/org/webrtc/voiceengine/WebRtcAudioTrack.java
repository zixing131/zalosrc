package org.webrtc.voiceengine;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import p097db.AbstractC17849h;

/* loaded from: classes7.dex */
class WebRtcAudioTrack {
    static final int BITS_PER_SAMPLE = 16;
    static final int BUFFERS_PER_SECOND = 100;
    static final int CALLBACK_BUFFER_SIZE_MS = 10;
    static final boolean DEBUG = false;
    static final int STREAM_TYPE = 0;
    static final String TAG = "WebRtcAudioTrack";
    final AudioManager audioManager;
    ByteBuffer byteBuffer;
    final Context context;
    private int lastError;
    private String lastErrorMessage;
    final long nativeAudioTrack;
    AudioTrack audioTrack = null;
    AudioTrackThread audioThread = null;

    /* loaded from: classes7.dex */
    class AudioTrackThread extends Thread {
        volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super("Z:" + str);
            this.keepAlive = true;
        }

        public void joinThread() {
            this.keepAlive = false;
            while (isAlive()) {
                try {
                    join();
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i11;
            Process.setThreadPriority(-19);
            try {
                WebRtcAudioTrack.this.audioTrack.play();
                int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
                while (this.keepAlive) {
                    WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                    webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                    try {
                        WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                        i11 = webRtcAudioTrack2.audioTrack.write(webRtcAudioTrack2.byteBuffer, capacity, 0);
                    } catch (Exception e11) {
                        Logging.m127854e(WebRtcAudioTrack.TAG, "AudioTrack.write failed: " + e11.toString());
                        i11 = 0;
                    }
                    if (i11 != capacity) {
                        Logging.m127854e(WebRtcAudioTrack.TAG, "AudioTrack.write failed: " + i11);
                        if (i11 == -3) {
                            this.keepAlive = false;
                        }
                    }
                    WebRtcAudioTrack.this.byteBuffer.rewind();
                }
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                } catch (IllegalStateException e12) {
                    Logging.m127854e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e12.getMessage());
                }
                WebRtcAudioTrack.this.audioTrack.flush();
            } catch (Exception e13) {
                Logging.m127854e(WebRtcAudioTrack.TAG, "AudioTrack.play failed: " + e13.getMessage());
            }
        }
    }

    WebRtcAudioTrack(Context context, long j11) {
        this.context = context;
        this.nativeAudioTrack = j11;
        this.audioManager = (AudioManager) context.getSystemService("audio");
    }

    static void assertTrue(boolean z11) {
        if (z11) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    static int getStreamType() {
        if (AbstractC17849h.m94293b()) {
            return 0;
        }
        return 3;
    }

    public int GetLastError() {
        return this.lastError;
    }

    public String GetLastErrorMessage() {
        return this.lastErrorMessage;
    }

    public void SetLastError(int i11, String str) {
        this.lastError = i11;
        this.lastErrorMessage = str;
    }

    int getStreamMaxVolume() {
        boolean z11;
        Logging.m127853d(TAG, "getStreamMaxVolume");
        if (this.audioManager != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        assertTrue(z11);
        return this.audioManager.getStreamMaxVolume(getStreamType());
    }

    int getStreamVolume() {
        boolean z11;
        Logging.m127853d(TAG, "getStreamVolume");
        if (this.audioManager != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        assertTrue(z11);
        return this.audioManager.getStreamVolume(getStreamType());
    }

    void initPlayout(int i11, int i12) {
        Logging.m127853d(TAG, "initPlayout(sampleRate=" + i11 + ", channels=" + i12 + ")");
        this.byteBuffer = ByteBuffer.allocateDirect(i12 * 2 * (i11 / 100));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.m127853d(TAG, sb2.toString());
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int minBufferSize = AudioTrack.getMinBufferSize(i11, 4, 2);
        Logging.m127853d(TAG, "AudioTrack.getMinBufferSize: " + minBufferSize);
        try {
            this.audioTrack = new AudioTrack(getStreamType(), i11, 4, 2, minBufferSize, 1);
        } catch (IllegalArgumentException e11) {
            Logging.m127853d(TAG, e11.getMessage());
            SetLastError(7600, "Create AudioTrack failed: " + e11.getMessage());
        }
    }

    native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j11);

    native void nativeGetPlayoutData(int i11, long j11);

    boolean setStreamVolume(int i11) {
        boolean z11;
        Logging.m127853d(TAG, "setStreamVolume(" + i11 + ")");
        if (this.audioManager != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        assertTrue(z11);
        if (WebRtcAudioUtils.runningOnLollipopOrHigher() && this.audioManager.isVolumeFixed()) {
            Logging.m127854e(TAG, "The device implements a fixed volume policy.");
            SetLastError(7601, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(getStreamType(), i11, 0);
        return true;
    }

    boolean startPlayout() {
        Logging.m127853d(TAG, "startPlayout");
        AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
        this.audioThread = audioTrackThread;
        audioTrackThread.start();
        return true;
    }

    boolean stopPlayout() {
        Logging.m127853d(TAG, "stopPlayout");
        this.audioThread.joinThread();
        this.audioThread = null;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
            return true;
        }
        return true;
    }
}
