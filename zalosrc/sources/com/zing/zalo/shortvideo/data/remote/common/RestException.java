package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19074t;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public class RestException extends CancellationException {

    /* renamed from: p */
    private final int f50186p;

    /* renamed from: q */
    private final String f50187q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestException(int i11, String str) {
        super(str);
        AbstractC19074t.m100208f(str, "message");
        this.f50186p = i11;
        this.f50187q = str;
    }

    /* renamed from: a */
    public final int m51529a() {
        return this.f50186p;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f50187q;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage() + " (" + this.f50186p + ")";
    }

    public RestException(String str) {
        this(-1, str == null ? "Failed" : str);
    }
}
