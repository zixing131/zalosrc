package com.zing.zalo.zvideoutil;

import com.zing.zalo.utils.Keep;
import com.zing.zalo.zvideoutil.event.IProcessStateListener;
import com.zing.zalo.zvideoutil.event.IProgressChangedListener;
import java.lang.ref.WeakReference;

@Keep
/* loaded from: classes7.dex */
public class ZVideoUtilGIFToMP4 extends ZAbstractBase {
    private static volatile int CONCURRENT_SIZE = 1;
    private static volatile int QUEUE_SIZE = 4;
    private static volatile boolean mIsProcessInitialized = false;

    @Keep
    private long zProcessStateListenerID;

    @Keep
    private long zProgressChangedListenerID;

    @Keep
    private long zVideoUtilGIFToMP4ID;

    public ZVideoUtilGIFToMP4() {
        init();
        if (!mIsProcessInitialized) {
            return;
        }
        _create(new WeakReference(this));
    }

    @Keep
    private native void _create(Object obj);

    @Keep
    private native void _destroy();

    @Keep
    private static native void _flush();

    @Keep
    private static native void _init(int i11, int i12);

    @Keep
    private native void _process(IProcessStateListener iProcessStateListener, IProgressChangedListener iProgressChangedListener, String str, String str2, int i11);

    @Keep
    private static native void _terminate();

    public static void flush() {
        _flush();
    }

    private void init() {
        if (!ZAbstractBase.mIsLibraryLoaded) {
            ZAbstractBase.loadLibrariesOnce();
        }
        if (!mIsProcessInitialized && ZAbstractBase.mIsLibraryLoaded) {
            synchronized (ZVideoUtilGIFToMP4.class) {
                try {
                    if (!mIsProcessInitialized) {
                        _init(QUEUE_SIZE, CONCURRENT_SIZE);
                        mIsProcessInitialized = true;
                    }
                } finally {
                }
            }
        }
    }

    public static void terminate() {
        synchronized (ZVideoUtilGIFToMP4.class) {
            mIsProcessInitialized = false;
            _terminate();
        }
    }

    public void destroy() {
        _destroy();
    }

    public void process(IProcessStateListener iProcessStateListener, IProgressChangedListener iProgressChangedListener, String str, String str2, int i11) {
        _process(iProcessStateListener, iProgressChangedListener, ZAbstractBase.reformatVideoPath(str), str2, i11);
    }
}
