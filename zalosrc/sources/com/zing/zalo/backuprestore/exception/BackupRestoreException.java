package com.zing.zalo.backuprestore.exception;

import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class BackupRestoreException extends Exception {

    /* renamed from: p */
    private final int f40039p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupRestoreException(String str) {
        super(str);
        AbstractC19074t.m100208f(str, "message");
        this.f40039p = -1;
    }

    /* renamed from: a */
    public final int m37266a() {
        return this.f40039p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupRestoreException(int i11, String str) {
        super(str);
        AbstractC19074t.m100208f(str, "message");
        this.f40039p = i11;
    }
}
