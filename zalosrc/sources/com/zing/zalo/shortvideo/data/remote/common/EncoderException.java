package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public final class EncoderException extends RestException {
    public EncoderException() {
        this(0, 1, null);
    }

    public EncoderException(int i11) {
        super(i11, "Encode failed");
    }

    public /* synthetic */ EncoderException(int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1 : i11);
    }
}
