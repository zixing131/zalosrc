package com.zing.zalo.backuprestore.media.exception;

import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class DriveDownloadException extends Exception {

    /* renamed from: p */
    public int f40043p;

    /* renamed from: q */
    public String f40044q;

    public DriveDownloadException(int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f40043p = i11;
        this.f40044q = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveDownloadException)) {
            return false;
        }
        DriveDownloadException driveDownloadException = (DriveDownloadException) obj;
        return this.f40043p == driveDownloadException.f40043p && AbstractC19074t.m100204b(this.f40044q, driveDownloadException.f40044q);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "(" + this.f40043p + ") " + this.f40044q;
    }

    public int hashCode() {
        return (this.f40043p * 31) + this.f40044q.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "DriveDownloadException(errorCode=" + this.f40043p + ", errorMessage=" + this.f40044q + ")";
    }
}
