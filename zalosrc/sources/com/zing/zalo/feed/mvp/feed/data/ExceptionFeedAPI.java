package com.zing.zalo.feed.mvp.feed.data;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.AbstractC20095b;
import hm0.C20096c;
import p425po.C24880b;

/* loaded from: classes4.dex */
public final class ExceptionFeedAPI extends ExceptionFeed {

    /* renamed from: q */
    private final C20096c f46207q;

    /* renamed from: r */
    private C24880b f46208r;

    public ExceptionFeedAPI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.zing.zalo.feed.mvp.feed.data.ExceptionFeed
    /* renamed from: a */
    public C20096c mo45581a() {
        return this.f46207q;
    }

    /* renamed from: b */
    public final C24880b m45582b() {
        return this.f46208r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionFeedAPI(C20096c c20096c) {
        super(c20096c);
        AbstractC19074t.m100208f(c20096c, "errorMessage");
        this.f46207q = c20096c;
        String m104490b = mo45581a().m104490b();
        if (m104490b == null || m104490b.length() == 0) {
            return;
        }
        int m104491c = mo45581a().m104491c();
        String m104490b2 = mo45581a().m104490b();
        AbstractC19074t.m100207e(m104490b2, "getData(...)");
        this.f46208r = new C24880b(m104491c, m104490b2);
    }

    public /* synthetic */ ExceptionFeedAPI(C20096c c20096c, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C20096c(112, AbstractC20095b.f98833e) : c20096c);
    }

    public ExceptionFeedAPI(int i11, C24880b c24880b) {
        this(new C20096c(i11, AbstractC20095b.f98833e));
        this.f46208r = c24880b;
    }
}
