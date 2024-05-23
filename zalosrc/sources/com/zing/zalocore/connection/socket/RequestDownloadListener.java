package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.Keep;
import hm0.C20096c;

@Keep
/* loaded from: classes.dex */
public abstract class RequestDownloadListener<T> {

    /* renamed from: a */
    private final Object f89319a;

    /* renamed from: b */
    int f89320b = 0;

    public RequestDownloadListener(Object obj) {
        this.f89319a = obj;
    }

    /* renamed from: a */
    public Object m93268a() {
        return this.f89319a;
    }

    /* renamed from: b */
    public void m93269b(int i11) {
        this.f89320b = i11;
    }

    @Keep
    public int getLimitSizeDownload() {
        return this.f89320b;
    }

    @Keep
    public abstract void onDownloadBufferComplete(int i11, int i12, byte[] bArr, int i13);

    /* JADX INFO: Access modifiers changed from: protected */
    @Keep
    public void onDownloadFail(C20096c c20096c) {
    }

    @Keep
    public abstract void onDownloadHttpComplete(int i11, int i12, byte[] bArr, int i13, boolean z11);

    @Keep
    public abstract void onProgressUpdate(int i11);
}
