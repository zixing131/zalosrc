package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.shortvideo.p072ui.view.ChannelView;
import com.zing.zalo.zview.C17507u0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import s20.AbstractC26112n;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class ChannelBottomSheet extends BaseBottomSheetView implements ChannelView.InterfaceC10143c {
    public static final C9498a Companion = new C9498a(null);

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ChannelBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C9498a {
        private C9498a() {
        }

        public /* synthetic */ C9498a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m51754YK(0.8333333f);
        m51753XK(true);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ChannelView.InterfaceC10143c
    /* renamed from: E3 */
    public boolean mo51855E3(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "pendingAction");
        return m51749TK(interfaceC18494a);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        AbstractC26112n.m134411m0(viewGroup, 0);
        return new View(getContext());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (bundle != null) {
            return;
        }
        C17507u0 m93138e = m92649TI().m92998F(ChannelView.class, false).m93138e(AbstractC27409d.lytContainer);
        Bundle m92688sK = m92688sK();
        AbstractC19074t.m100207e(m92688sK, "requireArguments(...)");
        m93138e.m93139f(m92688sK).m93137d(0).m93136a();
    }
}
