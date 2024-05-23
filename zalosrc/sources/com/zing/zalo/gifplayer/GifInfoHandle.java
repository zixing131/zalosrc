package com.zing.zalo.gifplayer;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.Surface;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import me0.AbstractC23254w8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GifInfoHandle {

    /* renamed from: b */
    static final EnumC16739a f47660b;

    /* renamed from: c */
    static final GifInfoHandle f47661c;

    /* renamed from: a */
    private volatile long f47662a;

    static {
        EnumC16739a enumC16739a = EnumC16739a.f84899y;
        f47660b = enumC16739a;
        f47661c = new GifInfoHandle();
        try {
            NativeLoader.m89238q(CoreUtility.getAppContext(), enumC16739a);
        } catch (Throwable unused) {
            C8917b.f47669Z = false;
        }
    }

    private GifInfoHandle() {
    }

    private static native void bindSurface(long j11, Surface surface, long[] jArr);

    private static native void free(long j11);

    private static native long getAllocationByteCount(long j11);

    private static native String getComment(long j11);

    private static native int getCurrentFrameIndex(long j11);

    private static native int getCurrentLoop(long j11);

    private static native int getCurrentPosition(long j11);

    private static native int getDuration(long j11);

    private static native int getFrameDuration(long j11, int i11);

    private static native int getHeight(long j11);

    private static native int getLoopCount(long j11);

    private static native int getNativeErrorCode(long j11);

    private static native int getNumberOfFrames(long j11);

    private static native long[] getSavedState(long j11);

    private static native long getSourceLength(long j11);

    private static native int getWidth(long j11);

    private static native void glTexImage2D(long j11, int i11, int i12);

    private static native void glTexSubImage2D(long j11, int i11, int i12);

    private static native void initTexImageDescriptor(long j11);

    private static native boolean isAnimationCompleted(long j11);

    private static native boolean isOpaque(long j11);

    static native long openByteArray(byte[] bArr, boolean z11, int i11) throws GifIOException;

    static native long openDirectByteBuffer(ByteBuffer byteBuffer, boolean z11, int i11) throws GifIOException;

    static native long openFd(FileDescriptor fileDescriptor, long j11, boolean z11, int i11) throws GifIOException;

    static native long openFile(String str, boolean z11, int i11) throws GifIOException;

    static native long openStream(InputStream inputStream, boolean z11, int i11) throws GifIOException;

    private static native void postUnbindSurface(long j11);

    private static native long renderFrame(long j11, Bitmap bitmap);

    private static native boolean reset(long j11);

    private static native long restoreRemainder(long j11);

    private static native int restoreSavedState(long j11, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j11);

    private static native void seekToFrame(long j11, int i11, Bitmap bitmap);

    private static native void seekToFrameGL(long j11, int i11);

    private static native void seekToTime(long j11, int i11, Bitmap bitmap);

    private static native void setLoopCount(long j11, int i11);

    private static native void setOptions(long j11, int i11, boolean z11);

    private static native void setSpeedFactor(long j11, float f11);

    private static native void startDecoderThread(long j11);

    private static native void stopDecoderThread(long j11);

    /* renamed from: a */
    public synchronized int m47591a() {
        return getHeight(this.f47662a);
    }

    /* renamed from: b */
    public synchronized int m47592b() {
        return getWidth(this.f47662a);
    }

    /* renamed from: c */
    public synchronized boolean m47593c() {
        boolean z11;
        if (this.f47662a == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }

    /* renamed from: d */
    synchronized void m47594d() {
        free(this.f47662a);
        this.f47662a = 0L;
    }

    /* renamed from: e */
    public synchronized long m47595e(Bitmap bitmap) {
        return renderFrame(this.f47662a, bitmap);
    }

    /* renamed from: f */
    public synchronized boolean m47596f() {
        return reset(this.f47662a);
    }

    protected void finalize() {
        try {
            m47594d();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public synchronized void m47597g(int i11) {
        if (i11 >= 0 && i11 <= 65535) {
            setLoopCount(this.f47662a, i11);
        } else {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
    }

    public GifInfoHandle(String str, boolean z11, int i11) {
        if (AbstractC23254w8.m119859g(str)) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = CoreUtility.getAppContext().getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r");
                this.f47662a = openFd(openAssetFileDescriptor.getFileDescriptor(), openAssetFileDescriptor.getStartOffset(), z11, i11);
                return;
            } catch (FileNotFoundException e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        this.f47662a = openFile(str, z11, i11);
    }
}
