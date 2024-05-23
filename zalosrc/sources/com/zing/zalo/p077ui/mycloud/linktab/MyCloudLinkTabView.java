package com.zing.zalo.p077ui.mycloud.linktab;

import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import me0.C23212s8;
import p365nk.C23805a;
import u80.InterfaceC27126g2;
import z80.C31713f;

/* loaded from: classes6.dex */
public class MyCloudLinkTabView extends BaseMyCloudTabView {
    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: AM */
    public InterfaceC27126g2 mo70318AM() {
        return new C31713f(this);
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: BM */
    public void mo70320BM() {
        super.mo70320BM();
        m70374vM().getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor));
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyCloudLinkTabView";
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: oM */
    public C23805a.d mo70361oM() {
        return C23805a.d.f115060t;
    }
}
