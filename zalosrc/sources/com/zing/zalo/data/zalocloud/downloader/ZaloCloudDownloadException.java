package com.zing.zalo.data.zalocloud.downloader;

import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class ZaloCloudDownloadException extends Exception {

    /* renamed from: p */
    public int f42993p;

    /* renamed from: q */
    public String f42994q;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZaloCloudDownloadException)) {
            return false;
        }
        ZaloCloudDownloadException zaloCloudDownloadException = (ZaloCloudDownloadException) obj;
        return this.f42993p == zaloCloudDownloadException.f42993p && AbstractC19074t.m100204b(this.f42994q, zaloCloudDownloadException.f42994q);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "(" + this.f42993p + ") " + this.f42994q;
    }

    public int hashCode() {
        return (this.f42993p * 31) + this.f42994q.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ZaloCloudDownloadException(errorCode=" + this.f42993p + ", errorMessage=" + this.f42994q + ")";
    }
}
