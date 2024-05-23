package com.zing.zalo.feed.mvp.feed.domain.usecase;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import is.C20834z0;
import java.util.List;
import on0.AbstractC24341v;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;
import qm0.AbstractC25366r;

/* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.b */
/* loaded from: classes4.dex */
public final class C8550b extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f46236a;

    public C8550b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        List m131496e;
        AbstractC19074t.m100208f(aVar, "params");
        if (aVar.m45604c()) {
            return;
        }
        C24371m0 c24371m0 = this.f46236a;
        m131496e = AbstractC25366r.m131496e(aVar.m45602a());
        c24371m0.m127474j(m131496e, aVar.m45603b());
        if (this.f46236a.m127477m().isEmpty()) {
            AbstractC20826v0.m108770L0(true);
        } else {
            C20834z0.f102412a.m108927f(true);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f46237a;

        /* renamed from: b */
        private final boolean f46238b;

        /* renamed from: c */
        private final boolean f46239c;

        public a(String str, boolean z11) {
            boolean m127128x;
            AbstractC19074t.m100208f(str, "feedItemId");
            this.f46237a = str;
            this.f46238b = z11;
            m127128x = AbstractC24341v.m127128x(str);
            this.f46239c = m127128x;
        }

        /* renamed from: a */
        public final String m45602a() {
            return this.f46237a;
        }

        /* renamed from: b */
        public final boolean m45603b() {
            return this.f46238b;
        }

        /* renamed from: c */
        public final boolean m45604c() {
            return this.f46239c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f46237a, aVar.f46237a) && this.f46238b == aVar.f46238b;
        }

        public int hashCode() {
            return (this.f46237a.hashCode() * 31) + AbstractC2144f.m11520a(this.f46238b);
        }

        public String toString() {
            return "Params(feedItemId=" + this.f46237a + ", isHideFeed=" + this.f46238b + ")";
        }

        public /* synthetic */ a(String str, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? false : z11);
        }
    }

    public /* synthetic */ C8550b(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    public C8550b(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f46236a = c24371m0;
    }
}
