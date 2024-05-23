package com.zing.zalo.feed.mvp.feed.data;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.AbstractC20095b;
import hm0.C20096c;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public class ExceptionFeed extends CancellationException {

    /* renamed from: p */
    private final C20096c f46206p;

    public ExceptionFeed() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public C20096c mo45581a() {
        return this.f46206p;
    }

    public ExceptionFeed(C20096c c20096c) {
        AbstractC19074t.m100208f(c20096c, "errorMessage");
        this.f46206p = c20096c;
    }

    public /* synthetic */ ExceptionFeed(C20096c c20096c, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C20096c(112, AbstractC20095b.f98833e) : c20096c);
    }
}
