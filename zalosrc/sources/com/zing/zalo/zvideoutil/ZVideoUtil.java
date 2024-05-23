package com.zing.zalo.zvideoutil;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.utils.Keep;
import com.zing.zalo.zvideoutil.event.IProcessStateListener;
import com.zing.zalo.zvideoutil.event.IProgressChangedListener;
import com.zing.zalo.zvideoutil.event.IThumbCreatedListener;
import java.lang.ref.WeakReference;

@Keep
/* loaded from: classes7.dex */
public final class ZVideoUtil extends ZAbstractBase {
    private static volatile boolean mIsNativeInitialized = false;
    private IProcessStateListener iProcessStateListener;
    private IProgressChangedListener iProgressChangedListener;
    private IThumbCreatedListener iThumbCreatedListener;
    private HandlerC17404b mHandler;

    @Keep
    private long zVideoUtilID;

    /* renamed from: com.zing.zalo.zvideoutil.ZVideoUtil$b */
    /* loaded from: classes7.dex */
    private static class HandlerC17404b extends Handler {

        /* renamed from: a */
        private final WeakReference f88674a;

        public HandlerC17404b(ZVideoUtil zVideoUtil, Looper looper) {
            super(looper);
            this.f88674a = new WeakReference(zVideoUtil);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ZVideoUtil zVideoUtil = (ZVideoUtil) this.f88674a.get();
            if (zVideoUtil == null) {
                return;
            }
            if (zVideoUtil.getProcessStateListener() != null) {
                zVideoUtil.getProcessStateListener().onProcessState(message.arg1);
            }
            if (zVideoUtil.getProgressChangedListener() != null) {
                zVideoUtil.getProgressChangedListener().onProgressChanged(message.arg1);
            }
            if (zVideoUtil.getThumbCreatedListener() != null) {
                if (message.arg1 == 1 && message.obj != null) {
                    zVideoUtil.getThumbCreatedListener().onThumbCreated(true, (Bitmap) message.obj);
                } else {
                    zVideoUtil.getThumbCreatedListener().onThumbCreated(false, null);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.zvideoutil.ZVideoUtil$c */
    /* loaded from: classes7.dex */
    private static class C17405c {

        /* renamed from: a */
        private static final ZVideoUtil f88675a = new ZVideoUtil();
    }

    static {
        ZAbstractBase.loadLibrariesOnce();
    }

    @Keep
    static native Bitmap _extractFirstFrame(String str, int i11, int i12);

    @Keep
    static native void _init(Object obj);

    @Keep
    static native int _isPlayable(String str);

    @Keep
    static native void _terminate();

    public static Bitmap extractFirstFrame(String str, int i11, int i12) {
        return _extractFirstFrame(ZAbstractBase.reformatVideoPath(str), i11, i12);
    }

    public static ZVideoUtil getInstance() {
        if (!ZAbstractBase.mIsLibraryLoaded) {
            ZAbstractBase.loadLibrariesOnce();
        }
        return C17405c.f88675a;
    }

    @Keep
    private static void postEventFromNative(Object obj, int i11, int i12, int i13, Object obj2) {
        ZVideoUtil zVideoUtil;
        HandlerC17404b handlerC17404b;
        if (obj != null && (zVideoUtil = (ZVideoUtil) ((WeakReference) obj).get()) != null && (handlerC17404b = zVideoUtil.mHandler) != null) {
            zVideoUtil.mHandler.sendMessage(handlerC17404b.obtainMessage(i11, i12, i13, obj2));
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        _terminate();
    }

    public IProcessStateListener getProcessStateListener() {
        return this.iProcessStateListener;
    }

    public IProgressChangedListener getProgressChangedListener() {
        return this.iProgressChangedListener;
    }

    public IThumbCreatedListener getThumbCreatedListener() {
        return this.iThumbCreatedListener;
    }

    public boolean isPlayable(String str) {
        if (_isPlayable(str) > 0) {
            return true;
        }
        return false;
    }

    public void setProcessStateListener(IProcessStateListener iProcessStateListener) {
        this.iProcessStateListener = iProcessStateListener;
    }

    public void setProgressChangedListener(IProgressChangedListener iProgressChangedListener) {
        this.iProgressChangedListener = iProgressChangedListener;
    }

    public void setThumbCreatedListener(IThumbCreatedListener iThumbCreatedListener) {
        this.iThumbCreatedListener = iThumbCreatedListener;
    }

    private ZVideoUtil() {
        this.zVideoUtilID = 0L;
        synchronized (ZVideoUtil.class) {
            try {
                if (!mIsNativeInitialized && ZAbstractBase.mIsLibraryLoaded) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null) {
                        this.mHandler = new HandlerC17404b(this, myLooper);
                    } else {
                        Looper mainLooper = Looper.getMainLooper();
                        if (mainLooper != null) {
                            this.mHandler = new HandlerC17404b(this, mainLooper);
                        } else {
                            this.mHandler = null;
                        }
                    }
                    _init(new WeakReference(this));
                    mIsNativeInitialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
