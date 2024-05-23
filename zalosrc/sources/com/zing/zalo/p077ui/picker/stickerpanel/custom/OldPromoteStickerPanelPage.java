package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.widget.FrameLayout;
import c30.C3245i;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn.C19515b;
import pm0.C24859p;

/* loaded from: classes6.dex */
public final class OldPromoteStickerPanelPage extends FrameLayout implements InterfaceC12966p {
    public static final C12934a Companion = new C12934a(null);

    /* renamed from: p */
    private C3245i f67029p;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.OldPromoteStickerPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12934a {
        private C12934a() {
        }

        public /* synthetic */ C12934a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: g */
    public void mo72819g() {
        throw new C24859p("An operation is not implemented: Not yet implemented");
    }

    public Integer getPageId() {
        C3245i c3245i = this.f67029p;
        if (c3245i != null) {
            return Integer.valueOf(c3245i.m16463e());
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: i */
    public boolean mo72820i() {
        return true;
    }

    public final void setData(C3245i c3245i) {
        AbstractC19074t.m100208f(c3245i, "stickerCategory");
        this.f67029p = c3245i;
        C19515b.Companion.m102006a().m102001g(c3245i.f13854b).getClass();
        throw null;
    }
}
