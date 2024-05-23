package com.zing.zalo.p077ui.mycloud.collection;

import java.util.List;
import java.util.Map;
import p205hc.InterfaceC19966e;
import q90.C25199b;
import q90.C25201d;

/* renamed from: com.zing.zalo.ui.mycloud.collection.e */
/* loaded from: classes6.dex */
public interface InterfaceC12558e extends InterfaceC19966e {

    /* renamed from: com.zing.zalo.ui.mycloud.collection.e$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m70748a(InterfaceC12558e interfaceC12558e, CharSequence charSequence, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    z11 = true;
                }
                interfaceC12558e.mo70746da(charSequence, z11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSearchTextChanged");
        }
    }

    /* renamed from: Fj */
    void mo70741Fj(long j11, String str);

    /* renamed from: N1 */
    List mo70742N1();

    /* renamed from: Wm */
    C25199b.a mo70743Wm();

    /* renamed from: a0 */
    List mo70744a0();

    /* renamed from: cn */
    Map mo70745cn();

    /* renamed from: da */
    void mo70746da(CharSequence charSequence, boolean z11);

    /* renamed from: e1 */
    C25201d.a mo70747e1();
}
