package com.zing.zalo.feed.mvp.feedzshort.data;

import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class ExceptionLoadZShortInfo extends Exception {

    /* renamed from: p */
    private final String f46293p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionLoadZShortInfo(String str) {
        super(str);
        AbstractC19074t.m100208f(str, "err");
        this.f46293p = str;
    }
}
