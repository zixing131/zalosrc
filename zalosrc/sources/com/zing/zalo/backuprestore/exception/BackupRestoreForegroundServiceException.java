package com.zing.zalo.backuprestore.exception;

import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class BackupRestoreForegroundServiceException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupRestoreForegroundServiceException(String str, Throwable th2) {
        super(str, th2);
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(th2, "cause");
    }
}
