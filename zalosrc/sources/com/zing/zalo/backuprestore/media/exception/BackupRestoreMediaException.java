package com.zing.zalo.backuprestore.media.exception;

/* loaded from: classes3.dex */
public class BackupRestoreMediaException extends Exception {

    /* renamed from: p */
    private int f40040p;

    /* renamed from: q */
    private final int f40041q;

    /* renamed from: r */
    private final String f40042r;

    public BackupRestoreMediaException(int i11, int i12, String str) {
        this.f40040p = i11;
        this.f40041q = i12;
        this.f40042r = str;
    }

    /* renamed from: a */
    public final int m37267a() {
        return this.f40041q;
    }

    /* renamed from: b */
    public final String m37268b() {
        return this.f40042r;
    }

    /* renamed from: c */
    public final int m37269c() {
        return this.f40040p;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "(" + this.f40041q + ") " + this.f40042r;
    }
}
