package com.zing.zalo.zmedia.player;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
public class ZMediaHandlerThread extends HandlerThread implements Handler.Callback {
    static final int MSG_NOTIFY_NETWORK_CHANGED = 3;
    static final int MSG_RELEASE_ALL_URLS = 2;
    static final int MSG_RELEASE_URLS_BY_SECTION = 1;
    static final int MSG_STOP_ALL_CACHING_URLS = 4;
    private static ZMediaHandlerThread zMediaHandlerThread;
    private Handler mHandler;
    private final CountDownLatch syncLatch;

    private ZMediaHandlerThread(String str) {
        super("Z:" + str);
        this.syncLatch = new CountDownLatch(1);
    }

    public static synchronized ZMediaHandlerThread getInstance() {
        ZMediaHandlerThread zMediaHandlerThread2;
        synchronized (ZMediaHandlerThread.class) {
            try {
                if (zMediaHandlerThread == null) {
                    ZMediaHandlerThread zMediaHandlerThread3 = new ZMediaHandlerThread("ZMediaHandlerThread");
                    zMediaHandlerThread = zMediaHandlerThread3;
                    zMediaHandlerThread3.start();
                }
                zMediaHandlerThread2 = zMediaHandlerThread;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zMediaHandlerThread2;
    }

    public void execute(Runnable runnable) {
        try {
            this.syncLatch.await();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        ZMediaPlayer._setStopAllUrlCaching();
                        return false;
                    }
                    return false;
                }
                ZMediaPlayer._onNetworkChanged(message.arg1);
                return false;
            }
            ZMediaPlayer._releaseAllUrl();
            return false;
        }
        ZMediaPlayer._releaseUrlBySection(message.arg1);
        return false;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        if (getLooper() != null) {
            this.mHandler = new Handler(getLooper(), this);
        }
        this.syncLatch.countDown();
    }

    public void postCacheUrls(final String[] strArr, final String str, final int i11, final int i12) {
        try {
            this.syncLatch.await();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.zing.zalo.zmedia.player.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZMediaPlayer._cacheUrls(strArr, str, i11, i12);
                    }
                });
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void postNotifyNetworkChanged(int i11) {
        try {
            this.syncLatch.await();
            Handler handler = this.mHandler;
            if (handler != null) {
                this.mHandler.sendMessage(handler.obtainMessage(3, i11, 0));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void postReleaseAllUrls() {
        try {
            this.syncLatch.await();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void postReleaseUrlBySection(int i11) {
        try {
            this.syncLatch.await();
            Handler handler = this.mHandler;
            if (handler != null) {
                this.mHandler.sendMessage(handler.obtainMessage(1, i11, 0));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void postStopAllCachingUrls() {
        try {
            this.syncLatch.await();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendEmptyMessage(4);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
