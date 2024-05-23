package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import com.zing.zalo.adapters.C7157o0;
import fn0.AbstractC19060k;
import y90.EnumC30860d;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.h */
/* loaded from: classes6.dex */
public final class C12958h implements InterfaceC12965o {

    /* renamed from: a */
    private final C7157o0.f f67085a;

    public C12958h(C7157o0.f fVar) {
        this.f67085a = fVar;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: a */
    public EnumC30860d mo72857a() {
        return EnumC30860d.f142408s;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: b */
    public long mo72858b() {
        return mo72857a().hashCode();
    }

    /* renamed from: c */
    public final C7157o0.f m72861c() {
        return this.f67085a;
    }

    public /* synthetic */ C12958h(C7157o0.f fVar, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : fVar);
    }
}
