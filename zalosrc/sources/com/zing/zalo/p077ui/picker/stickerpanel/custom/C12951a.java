package com.zing.zalo.p077ui.picker.stickerpanel.custom;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.a */
/* loaded from: classes6.dex */
public class C12951a implements InterfaceC12972v {

    /* renamed from: a */
    private boolean f67079a;

    public C12951a(boolean z11) {
        this.f67079a = z11;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12972v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(this.f67079a);
    }

    /* renamed from: b */
    public void m72855b(boolean z11) {
        this.f67079a = z11;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12972v
    public /* bridge */ /* synthetic */ void set(Object obj) {
        m72855b(((Boolean) obj).booleanValue());
    }
}
