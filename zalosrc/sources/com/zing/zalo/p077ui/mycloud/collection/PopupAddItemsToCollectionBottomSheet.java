package com.zing.zalo.p077ui.mycloud.collection;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView;
import com.zing.zalo.p077ui.mycloud.collection.PopupAddItemsToCollectionBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kw.C21955a;
import p542ub.InterfaceC27218a;
import p649xl.C29846i0;
import pk.C24799c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import x80.C29492i0;
import x80.InterfaceC29490h0;

/* loaded from: classes6.dex */
public final class PopupAddItemsToCollectionBottomSheet extends BottomSheet implements InterfaceC29490h0 {

    /* renamed from: b1 */
    private final InterfaceC24854k f65551b1;

    /* renamed from: c1 */
    private C29846i0 f65552c1;

    /* renamed from: d1 */
    private final InterfaceC24854k f65553d1;

    /* renamed from: e1 */
    private final InterfaceC24854k f65554e1;

    /* renamed from: com.zing.zalo.ui.mycloud.collection.PopupAddItemsToCollectionBottomSheet$a */
    /* loaded from: classes6.dex */
    static final class C12550a extends AbstractC19075u implements InterfaceC18494a {
        C12550a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C12559f mo12V4() {
            return C12559f.Companion.m70758a(PopupAddItemsToCollectionBottomSheet.this.m92642L3());
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.PopupAddItemsToCollectionBottomSheet$b */
    /* loaded from: classes6.dex */
    static final class C12551b extends AbstractC19075u implements InterfaceC18494a {
        C12551b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CarouselMyCloudCollectionView mo12V4() {
            Context context = PopupAddItemsToCollectionBottomSheet.this.getContext();
            AbstractC19074t.m100205c(context);
            return new CarouselMyCloudCollectionView(context, 1);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.PopupAddItemsToCollectionBottomSheet$c */
    /* loaded from: classes6.dex */
    public static final class C12552c implements CarouselMyCloudCollectionView.InterfaceC12466e {
        C12552c() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: a */
        public void mo70009a() {
            PopupAddItemsToCollectionBottomSheet.this.m70706NL().m146728Ip();
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: b */
        public void mo70010b(boolean z11) {
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: n */
        public void mo70011n(int i11) {
            if (PopupAddItemsToCollectionBottomSheet.this.m70709ML().m69998k(i11) == 0) {
                C24799c m69997j = PopupAddItemsToCollectionBottomSheet.this.m70709ML().m69997j(i11);
                PopupAddItemsToCollectionBottomSheet popupAddItemsToCollectionBottomSheet = PopupAddItemsToCollectionBottomSheet.this;
                popupAddItemsToCollectionBottomSheet.m70706NL().m146729Jp(m69997j, popupAddItemsToCollectionBottomSheet.m70705LL().m70753e(), popupAddItemsToCollectionBottomSheet.m70705LL().m70749a(), popupAddItemsToCollectionBottomSheet.m70705LL().m70752d(), popupAddItemsToCollectionBottomSheet.m70705LL().m70750b());
                popupAddItemsToCollectionBottomSheet.close();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.PopupAddItemsToCollectionBottomSheet$d */
    /* loaded from: classes6.dex */
    static final class C12553d extends AbstractC19075u implements InterfaceC18494a {
        C12553d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29492i0 mo12V4() {
            return new C29492i0(PopupAddItemsToCollectionBottomSheet.this);
        }
    }

    public PopupAddItemsToCollectionBottomSheet() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(new C12550a());
        this.f65551b1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12553d());
        this.f65553d1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C12551b());
        this.f65554e1 = m129210a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public final C12559f m70705LL() {
        return (C12559f) this.f65551b1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public final C29492i0 m70706NL() {
        return (C29492i0) this.f65553d1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public static final void m70707OL(PopupAddItemsToCollectionBottomSheet popupAddItemsToCollectionBottomSheet, View view) {
        AbstractC19074t.m100208f(popupAddItemsToCollectionBottomSheet, "this$0");
        popupAddItemsToCollectionBottomSheet.m70706NL().m146728Ip();
    }

    @Override // x80.InterfaceC29490h0
    /* renamed from: CC */
    public void mo70708CC() {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putInt("viewMode", 0);
        bundle.putBoolean("startCollectionDetail", false);
        bundle.putParcelableArrayList("listMsgId", m70705LL().m70753e());
        bundle.putString("entryPoint", "message_collection_additem");
        bundle.putString("statsMsgType", m70705LL().m70751c());
        bundle.putBoolean("forceShowIcon", m70705LL().m70750b());
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(CreateNewCollectionView.class, bundle, 1, true);
        }
        close();
    }

    /* renamed from: ML */
    public final CarouselMyCloudCollectionView m70709ML() {
        return (CarouselMyCloudCollectionView) this.f65554e1.getValue();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29846i0 c29846i0 = this.f65552c1;
        if (c29846i0 != null) {
            return c29846i0.getRoot();
        }
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29846i0 m148054c = C29846i0.m148054c(layoutInflater, linearLayout, true);
        this.f65552c1 = m148054c;
        if (m148054c != null) {
            m148054c.f138100q.setOnClickListener(new View.OnClickListener() { // from class: x80.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PopupAddItemsToCollectionBottomSheet.m70707OL(PopupAddItemsToCollectionBottomSheet.this, view);
                }
            });
            m70709ML().setListener(new C12552c());
            m70709ML().setBackgroundColor(0);
            m70709ML().m69999u(false);
            m148054c.getRoot().addView(m70709ML());
        }
        C21955a.f108070a.m114644k(m70705LL().m70749a(), m70705LL().m70751c());
        m90533zL(EnumC17017m.HUG_CONTENT);
    }

    @Override // com.zing.zalo.zdesign.layout.ZDSLoadingZaloView, p205hc.InterfaceC19967f
    /* renamed from: wy */
    public void mo70710wy(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "runnable");
    }
}
