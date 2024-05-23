package com.zing.zalo.feed.mvp.music.data;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class ExceptionUpdateSettingAutoPlayMusicFeed extends Exception {
    public ExceptionUpdateSettingAutoPlayMusicFeed() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionUpdateSettingAutoPlayMusicFeed(String str) {
        super(str);
        AbstractC19074t.m100208f(str, "err");
    }

    public /* synthetic */ ExceptionUpdateSettingAutoPlayMusicFeed(String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
