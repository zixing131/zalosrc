package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import y90.EnumC30860d;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.e */
/* loaded from: classes6.dex */
public final class C12955e implements InterfaceC12965o {

    /* renamed from: a */
    private final int f67082a;

    public C12955e(int i11) {
        this.f67082a = i11;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: a */
    public EnumC30860d mo72857a() {
        int i11 = this.f67082a;
        if (i11 != -2) {
            if (i11 != -1) {
                return EnumC30860d.f142407r;
            }
            return EnumC30860d.f142402B;
        }
        return EnumC30860d.f142403C;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: b */
    public long mo72858b() {
        return this.f67082a;
    }

    /* renamed from: c */
    public final int m72859c() {
        return this.f67082a;
    }
}
