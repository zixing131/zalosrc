package com.zing.zalocore.connection.socket;

import android.text.TextUtils;
import com.zing.zalo.utils.Keep;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class NativeHttpDownload {

    /* renamed from: a */
    private static InterfaceC17518a f89273a = null;

    /* renamed from: b */
    private static int f89274b = 2;

    /* renamed from: c */
    static NativeHttpDownload f89275c;

    /* renamed from: com.zing.zalocore.connection.socket.NativeHttpDownload$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC17518a {
        /* renamed from: a */
        void mo93201a(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr);
    }

    private NativeHttpDownload(InterfaceC17518a interfaceC17518a) {
        LoaderUtils.m93165a();
        f89273a = interfaceC17518a;
    }

    @Keep
    private native void cancelDownload(String str, int i11);

    /* renamed from: d */
    public static synchronized NativeHttpDownload m93195d(InterfaceC17518a interfaceC17518a) {
        NativeHttpDownload nativeHttpDownload;
        synchronized (NativeHttpDownload.class) {
            try {
                if (f89275c == null) {
                    f89275c = new NativeHttpDownload(interfaceC17518a);
                }
                nativeHttpDownload = f89275c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nativeHttpDownload;
    }

    @Keep
    private native void downloadRequest(String str, int i11, String str2, int i12, boolean z11, boolean z12, boolean z13, boolean z14, Object obj, Object obj2, int i13, boolean z15);

    /* renamed from: e */
    public static boolean m93196e() {
        return f89275c != null;
    }

    @Keep
    public static void upDataInfoOQSItem(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr) {
        InterfaceC17518a interfaceC17518a = f89273a;
        if (interfaceC17518a != null) {
            interfaceC17518a.mo93201a(z11, z12, i11, i12, i13, j11, j12, j13, bArr);
        }
    }

    @Keep
    private native boolean updatePriority(String str);

    /* renamed from: a */
    public void m93197a(String str, int i11) {
        if (LoaderUtils.m93166b() && !TextUtils.isEmpty(str)) {
            cancelDownload(str, i11);
        }
    }

    /* renamed from: b */
    public void m93198b(String str, int i11, String str2, int i12, boolean z11, boolean z12, boolean z13, boolean z14, RequestDownloadListener requestDownloadListener, Map map) {
        Map map2;
        if (LoaderUtils.m93166b() && !TextUtils.isEmpty(str) && str2 != null) {
            if (map == null) {
                map2 = new HashMap();
            } else {
                map2 = map;
            }
            downloadRequest(str, i11, str2, i12, z11, z12, z13, z14, requestDownloadListener, map2, f89274b, false);
            return;
        }
        if (requestDownloadListener != null) {
            requestDownloadListener.onDownloadHttpComplete(-99, 0, null, 0, false);
        }
    }

    /* renamed from: c */
    public void m93199c(String str, int i11, String str2, int i12, boolean z11, boolean z12, boolean z13, boolean z14, RequestDownloadListener requestDownloadListener, Map map, int i13, boolean z15) {
        Map map2;
        if (LoaderUtils.m93166b() && !TextUtils.isEmpty(str) && str2 != null) {
            if (map == null) {
                map2 = new HashMap();
            } else {
                map2 = map;
            }
            downloadRequest(str, i11, str2, i12, z11, z12, z13, z14, requestDownloadListener, map2, i13, z15);
            return;
        }
        if (requestDownloadListener != null) {
            requestDownloadListener.onDownloadHttpComplete(-99, 0, null, 0, false);
        }
    }

    /* renamed from: f */
    public boolean m93200f(String str) {
        if (LoaderUtils.m93166b() && !TextUtils.isEmpty(str)) {
            return updatePriority(str);
        }
        return true;
    }
}
