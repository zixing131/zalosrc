package com.zing.zalo.transfermsg.exception;

import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class TransferDataException extends Exception {

    /* renamed from: p */
    private int f55170p;

    /* renamed from: q */
    private String f55171q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferDataException(int i11, String str) {
        super(str);
        AbstractC19074t.m100208f(str, "errorMes");
        this.f55170p = i11;
        this.f55171q = str;
    }

    /* renamed from: a */
    public final int m56658a() {
        return this.f55170p;
    }

    /* renamed from: b */
    public final String m56659b() {
        return this.f55171q;
    }
}
