package com.zing.zalo.gifplayer;

import java.io.IOException;

/* loaded from: classes4.dex */
public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;

    /* renamed from: p */
    public final EnumC8918c f47659p;

    private GifIOException(EnumC8918c enumC8918c) {
        super(enumC8918c.m47620d());
        this.f47659p = enumC8918c;
    }

    GifIOException(int i11) {
        this(EnumC8918c.m47619c(i11));
    }
}
