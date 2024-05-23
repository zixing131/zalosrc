package com.zing.zalo.shortvideo.p072ui.presenter;

import com.zing.zalo.shortvideo.data.model.BreakSlot;

/* renamed from: com.zing.zalo.shortvideo.ui.presenter.e */
/* loaded from: classes5.dex */
public interface InterfaceC10057e extends InterfaceC10053a {

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m53675a(InterfaceC10057e interfaceC10057e, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = false;
                }
                interfaceC10057e.mo53359Q8(z11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitOnboarding");
        }
    }

    /* renamed from: Q8 */
    void mo53359Q8(boolean z11);

    /* renamed from: Y8 */
    void mo53360Y8();

    /* renamed from: r1 */
    BreakSlot mo53361r1();
}
