package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public final class NetworkException extends RestException {
    public NetworkException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public NetworkException(String str) {
        super(str == null ? "Network error" : str);
    }

    public /* synthetic */ NetworkException(String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str);
    }
}
