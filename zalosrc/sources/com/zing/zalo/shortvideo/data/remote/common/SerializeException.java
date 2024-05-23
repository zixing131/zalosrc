package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public final class SerializeException extends RestException {
    public SerializeException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SerializeException(String str) {
        super(str == null ? "Serialization process failed" : str);
    }

    public /* synthetic */ SerializeException(String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str);
    }
}
