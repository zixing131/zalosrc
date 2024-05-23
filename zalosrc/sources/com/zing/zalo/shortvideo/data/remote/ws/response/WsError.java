package com.zing.zalo.shortvideo.data.remote.ws.response;

import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public class WsError extends Exception {

    /* renamed from: p */
    private final String f50347p;

    public WsError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public WsError(String str) {
        super(str);
        this.f50347p = str;
    }

    public /* synthetic */ WsError(String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str);
    }
}
