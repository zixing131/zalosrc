package org.webrtc.voiceengine;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Process;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import org.webrtc.Logging;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class WebRtcAudioRecord {
    static final int BITS_PER_SAMPLE = 16;
    static final int BUFFERS_PER_SECOND = 100;
    static final int BUFFER_SIZE_FACTOR = 5;
    static final int CALLBACK_BUFFER_SIZE_MS = 10;
    static final boolean DEBUG = false;
    static final String TAG = "WebRtcAudioRecord";
    AudioRecord audioRecord = null;
    AudioRecordThread audioThread = null;
    ByteBuffer byteBuffer;
    final Context context;
    WebRtcAudioEffects effects;
    private int lastError;
    private String lastErrorMessage;
    final long nativeAudioRecord;

    /* loaded from: classes7.dex */
    class AudioRecordThread extends Thread {
        volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super("Z:" + str);
            this.keepAlive = true;
        }

        public void joinThread() {
            this.keepAlive = false;
            while (isAlive()) {
                try {
                    join(1500L);
                    if (isAlive()) {
                        Logging.m127854e(WebRtcAudioRecord.TAG, "interrupt failed, have to stop");
                        WebRtcAudioRecord.this.audioRecord.stop();
                    }
                } catch (InterruptedException unused) {
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            System.nanoTime();
            while (this.keepAlive) {
                try {
                    WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                    AudioRecord audioRecord = webRtcAudioRecord.audioRecord;
                    ByteBuffer byteBuffer = webRtcAudioRecord.byteBuffer;
                    int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
                    if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                        WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                        webRtcAudioRecord2.nativeDataIsRecorded(read, webRtcAudioRecord2.nativeAudioRecord);
                    } else {
                        Logging.m127854e(WebRtcAudioRecord.TAG, "AudioRecord.read failed: " + read);
                        if (read == -3) {
                            this.keepAlive = false;
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            try {
                WebRtcAudioRecord.this.audioRecord.stop();
            } catch (IllegalStateException e12) {
                Logging.m127854e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e12.getMessage());
            }
        }
    }

    WebRtcAudioRecord(Context context, long j11) {
        this.effects = null;
        this.context = context;
        this.nativeAudioRecord = j11;
        this.effects = WebRtcAudioEffects.create();
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

    boolean enableBuiltInAEC(boolean z11) {
        Logging.m127853d(TAG, "enableBuiltInAEC(" + z11 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.m127854e(TAG, "Built-in AEC is not supported on this platform");
            SetLastError(7500, "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z11);
    }

    boolean enableBuiltInAGC(boolean z11) {
        Logging.m127853d(TAG, "enableBuiltInAGC(" + z11 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.m127854e(TAG, "Built-in AGC is not supported on this platform");
            SetLastError(7501, "Built-in AGC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAGC(z11);
    }

    boolean enableBuiltInNS(boolean z11) {
        Logging.m127853d(TAG, "enableBuiltInNS(" + z11 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.m127854e(TAG, "Built-in NS is not supported on this platform");
            SetLastError(7503, "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z11);
    }

    int initRecording(int i11, int i12) {
        return initRecording(i11, i12, 7);
    }

    native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j11);

    native void nativeDataIsRecorded(int i11, long j11);

    boolean startRecording() {
        Logging.m127853d(TAG, "startRecording");
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                Logging.m127854e(TAG, "AudioRecord.startRecording failed");
                SetLastError(7510, "AudioRecord.startRecording failed 2");
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e11) {
            Logging.m127854e(TAG, "AudioRecord.startRecording failed: " + e11.getMessage());
            SetLastError(7509, "AudioRecord.startRecording failed 1: " + e11.getMessage());
            return false;
        }
    }

    boolean stopRecording() {
        Logging.m127853d(TAG, "stopRecording");
        this.audioThread.joinThread();
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        this.audioRecord.release();
        this.audioRecord = null;
        return true;
    }

    int initRecording(int i11, int i12, int i13) {
        Logging.m127853d(TAG, "initRecording(sampleRate=" + i11 + ", channels=" + i12 + ", audioSource=" + i13 + ")");
        int i14 = i13 < 0 ? 7 : i13;
        if (!WebRtcAudioUtils.hasPermission(this.context, "android.permission.RECORD_AUDIO")) {
            Logging.m127854e(TAG, "RECORD_AUDIO permission is missing");
            SetLastError(7504, "RECORD_AUDIO permission is missing");
            return -1;
        }
        if (this.audioRecord != null) {
            Logging.m127854e(TAG, "InitRecording() called twice without StopRecording()");
            SetLastError(7505, "InitRecording() called twice without StopRecording()");
            return -1;
        }
        int i15 = i11 / 100;
        this.byteBuffer = ByteBuffer.allocateDirect(i12 * 2 * i15);
        Logging.m127853d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int minBufferSize = AudioRecord.getMinBufferSize(i11, 16, 2);
        if (minBufferSize != -1 && minBufferSize != -2) {
            Logging.m127853d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize * 5, this.byteBuffer.capacity());
            Logging.m127853d(TAG, "bufferSizeInBytes: " + max);
            try {
                AudioRecord audioRecord = new AudioRecord(i14, i11, 16, 2, max);
                this.audioRecord = audioRecord;
                if (audioRecord.getState() != 1) {
                    Logging.m127854e(TAG, "Failed to create a new AudioRecord Peer");
                    SetLastError(7508, "Failed to create a new AudioRecord Peer");
                    return -1;
                }
                Logging.m127853d(TAG, "AudioRecord session ID: " + this.audioRecord.getAudioSessionId() + ", audio format: " + this.audioRecord.getAudioFormat() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                return i15;
            } catch (IllegalArgumentException e11) {
                Logging.m127854e(TAG, e11.getMessage());
                return -1;
            }
        }
        Logging.m127854e(TAG, "AudioRecord.getMinBufferSize failed: " + minBufferSize);
        SetLastError(7506, "AudioRecord.getMinBufferSize failed: " + minBufferSize);
        return -1;
    }
}
