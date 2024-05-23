package com.zing.zalo.zmedia.zanimation;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;
import java.io.InputStream;
import java.nio.ByteBuffer;

@Keep
/* loaded from: classes7.dex */
public class ZAnimation {
    public static final int MODE_AUTO = 0;
    public static final int MODE_MULTI = 2;
    public static final int MODE_SINGLE = 1;
    private static final String TAG = "ZAnimation";
    public static final int TYPE_GIF = 0;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_WEBP = 1;
    private static volatile boolean mIsLibraryLoaded = false;
    private static final Object sLock = new Object();
    private int mFrameCount;
    private int mHeight;
    private int mLoopCount;
    private int mMode;
    private boolean mOpaque;
    private int mType;
    private int mWidth;
    private long zAnimationID;

    @Keep
    /* loaded from: classes7.dex */
    public static class ZState {
        private long zStateID;

        @Keep
        public ZState(long j11) {
            this.zStateID = j11;
        }

        @Keep
        public void destroy() {
            long j11 = this.zStateID;
            if (j11 != 0) {
                ZAnimation._destroyState(j11);
                this.zStateID = 0L;
            }
        }

        @Keep
        public long getFrame(int i11, Bitmap bitmap, int i12) {
            if (bitmap != null && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                long j11 = this.zStateID;
                if (j11 != 0) {
                    return ZAnimation._getFrame(j11, i11, bitmap, i12);
                }
                throw new IllegalStateException("attempted to draw destroyed ZAnimation.ZState");
            }
            throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
        }
    }

    static {
        loadLibraryOnce();
    }

    @Keep
    public ZAnimation(long j11, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
        this.zAnimationID = j11;
        this.mWidth = i11;
        this.mHeight = i12;
        this.mOpaque = z11;
        this.mFrameCount = i13;
        this.mLoopCount = i14;
        this.mType = i15;
        this.mMode = i16;
    }

    @Keep
    private static native long _createState(long j11);

    @Keep
    private static native ZAnimation _decodeByteArray(byte[] bArr, int i11, int i12, int i13);

    @Keep
    private static native ZAnimation _decodeByteBuffer(ByteBuffer byteBuffer, int i11, int i12, int i13);

    @Keep
    private static native ZAnimation _decodeFile(String str, int i11);

    @Keep
    private static native ZAnimation _decodeStream(InputStream inputStream, byte[] bArr, int i11);

    @Keep
    public static native void _destroyAnimation(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static native void _destroyState(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public static native long _getFrame(long j11, int i11, Bitmap bitmap, int i12);

    @Keep
    private static native Bitmap _getThumb(byte[] bArr, int i11, int i12, int i13);

    @Keep
    public static ZAnimation decodeByteArray(byte[] bArr) {
        if (mIsLibraryLoaded) {
            return decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    @Keep
    public static ZAnimation decodeByteArrayAutoMode(byte[] bArr, int i11, int i12) {
        if (!mIsLibraryLoaded) {
            return null;
        }
        if (bArr != null) {
            if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
                return _decodeByteArray(bArr, i11, i12, 0);
            }
            throw new IllegalArgumentException("invalid offset/length parameters");
        }
        throw new IllegalArgumentException();
    }

    @Keep
    public static ZAnimation decodeByteArraySingleMode(byte[] bArr, int i11, int i12) {
        if (!mIsLibraryLoaded) {
            return null;
        }
        if (bArr != null) {
            if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
                return _decodeByteArray(bArr, i11, i12, 1);
            }
            throw new IllegalArgumentException("invalid offset/length parameters");
        }
        throw new IllegalArgumentException();
    }

    @Keep
    public static ZAnimation decodeByteBuffer(ByteBuffer byteBuffer, int i11) {
        if (byteBuffer != null) {
            if (!byteBuffer.isDirect()) {
                if (byteBuffer.hasArray()) {
                    byte[] array = byteBuffer.array();
                    if (i11 == 1) {
                        return decodeByteArraySingleMode(array, byteBuffer.position(), byteBuffer.remaining());
                    }
                    return decodeByteArray(array, byteBuffer.position(), byteBuffer.remaining());
                }
                throw new IllegalArgumentException("Cannot have non-direct ByteBuffer with no byte array");
            }
            return _decodeByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), i11);
        }
        throw new IllegalArgumentException();
    }

    public static ZAnimation decodeStream(InputStream inputStream) {
        if (!mIsLibraryLoaded) {
            return null;
        }
        if (inputStream != null) {
            return _decodeStream(inputStream, new byte[16384], 0);
        }
        throw new IllegalArgumentException();
    }

    @Keep
    public static Bitmap getThumb(byte[] bArr, int i11) {
        if (bArr != null) {
            return _getThumb(bArr, 0, bArr.length, i11);
        }
        throw new IllegalArgumentException();
    }

    public static boolean isLibraryLoaded() {
        if (!mIsLibraryLoaded) {
            loadLibraryOnce();
        }
        return mIsLibraryLoaded;
    }

    static void loadLibraryOnce() {
        synchronized (sLock) {
            try {
                NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84879V);
                mIsLibraryLoaded = true;
            } finally {
            }
        }
    }

    @Keep
    public ZState createState() {
        long j11 = this.zAnimationID;
        if (j11 != 0) {
            long _createState = _createState(j11);
            if (_createState == 0) {
                return null;
            }
            return new ZState(_createState);
        }
        throw new IllegalStateException("attempted to use incorrectly built ZAnimation");
    }

    @Keep
    public void destroy() {
        if (!mIsLibraryLoaded) {
            return;
        }
        long j11 = this.zAnimationID;
        if (j11 != 0) {
            _destroyAnimation(j11);
        }
    }

    @Keep
    protected void finalize() throws Throwable {
        try {
            destroy();
        } finally {
            super.finalize();
        }
    }

    public int getFrameCount() {
        return this.mFrameCount;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getLoopCount() {
        return this.mLoopCount;
    }

    public int getMode() {
        return this.mMode;
    }

    public int getType() {
        return this.mType;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isOpaque() {
        return this.mOpaque;
    }

    public void setLoopCount(int i11) {
        this.mLoopCount = i11;
    }

    @Keep
    public static ZAnimation decodeByteArray(byte[] bArr, int i11) {
        if (mIsLibraryLoaded) {
            return i11 == 1 ? decodeByteArraySingleMode(bArr, 0, bArr.length) : decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    @Keep
    public static ZAnimation decodeByteArray(byte[] bArr, int i11, int i12) {
        if (!mIsLibraryLoaded) {
            return null;
        }
        if (bArr != null) {
            if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
                return _decodeByteArray(bArr, i11, i12, 2);
            }
            throw new IllegalArgumentException("invalid offset/length parameters");
        }
        throw new IllegalArgumentException();
    }
}
