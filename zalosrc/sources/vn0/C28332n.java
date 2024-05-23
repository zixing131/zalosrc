package vn0;

import fn0.AbstractC19074t;

/* renamed from: vn0.n */
/* loaded from: classes7.dex */
public final class C28332n extends C28330m {

    /* renamed from: c */
    private final boolean f132071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28332n(InterfaceC28337p0 interfaceC28337p0, boolean z11) {
        super(interfaceC28337p0);
        AbstractC19074t.m100208f(interfaceC28337p0, "writer");
        this.f132071c = z11;
    }

    @Override // vn0.C28330m
    /* renamed from: m */
    public void mo142744m(String str) {
        AbstractC19074t.m100208f(str, "value");
        if (this.f132071c) {
            super.mo142744m(str);
        } else {
            super.m142741j(str);
        }
    }
}
