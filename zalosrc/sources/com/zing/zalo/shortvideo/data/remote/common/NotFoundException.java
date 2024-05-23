package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public final class NotFoundException extends RestException {
    public NotFoundException() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public NotFoundException(int i11, String str) {
        super(i11, str == null ? "Not found data" : str);
    }

    public /* synthetic */ NotFoundException(int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? null : str);
    }
}
