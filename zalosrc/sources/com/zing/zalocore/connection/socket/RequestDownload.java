package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.Keep;

/* loaded from: classes7.dex */
public class RequestDownload {
    @Keep
    private static native void cancelDownload(String str, int i11);

    @Keep
    private native void downloadRequest(String str, String str2, int i11, boolean z11, Object obj);
}
