package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import c30.C3245i;
import fn0.AbstractC19074t;
import y90.EnumC30860d;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.n */
/* loaded from: classes6.dex */
public abstract class AbstractC12964n implements InterfaceC12965o {

    /* renamed from: a */
    private final C3245i f67086a;

    public AbstractC12964n(C3245i c3245i) {
        AbstractC19074t.m100208f(c3245i, "stickerCategory");
        this.f67086a = c3245i;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: a */
    public EnumC30860d mo72857a() {
        return mo72856d();
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: b */
    public long mo72858b() {
        return this.f67086a.f13854b;
    }

    /* renamed from: c */
    public final C3245i m72862c() {
        return this.f67086a;
    }

    /* renamed from: d */
    protected abstract EnumC30860d mo72856d();
}
