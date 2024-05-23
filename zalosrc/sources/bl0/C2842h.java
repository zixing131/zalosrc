package bl0;

import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19060k;
import nk0.C23855s0;
import vk0.C28284f;

/* renamed from: bl0.h */
/* loaded from: classes7.dex */
public final class C2842h extends C2839e {

    /* renamed from: c */
    private final C23855s0 f11342c;

    public /* synthetic */ C2842h(C23855s0 c23855s0, ZOMDocument zOMDocument, C28284f c28284f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : c23855s0, (i11 & 2) != 0 ? null : zOMDocument, (i11 & 4) != 0 ? null : c28284f);
    }

    @Override // vk0.AbstractC28288j
    /* renamed from: d */
    public boolean mo13723d() {
        C23855s0 c23855s0;
        if (super.mo13723d() && (c23855s0 = this.f11342c) != null && c23855s0.m124646t((ZOMDocument) m142538c())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final C23855s0 m13724e() {
        return this.f11342c;
    }

    public C2842h(C23855s0 c23855s0, ZOMDocument zOMDocument, C28284f c28284f) {
        super(zOMDocument, c28284f);
        this.f11342c = c23855s0;
    }
}
