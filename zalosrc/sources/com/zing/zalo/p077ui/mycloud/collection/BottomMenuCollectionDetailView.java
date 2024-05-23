package com.zing.zalo.p077ui.mycloud.collection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.mycloud.collection.BottomMenuCollectionDetailView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p205hc.InterfaceC19967f;
import p649xl.C29828h0;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class BottomMenuCollectionDetailView extends BottomPickerView implements InterfaceC19967f {
    public static final C12523a Companion = new C12523a(null);

    /* renamed from: U0 */
    private C29828h0 f65497U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f65498V0;

    /* renamed from: W0 */
    private InterfaceC12524b f65499W0;

    /* renamed from: com.zing.zalo.ui.mycloud.collection.BottomMenuCollectionDetailView$a */
    /* loaded from: classes6.dex */
    public static final class C12523a {
        private C12523a() {
        }

        public /* synthetic */ C12523a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final BottomMenuCollectionDetailView m70603a(long j11, InterfaceC12524b interfaceC12524b) {
            AbstractC19074t.m100208f(interfaceC12524b, "listener");
            Bundle m78535kL = BottomPickerView.m78535kL();
            BottomMenuCollectionDetailView bottomMenuCollectionDetailView = new BottomMenuCollectionDetailView();
            bottomMenuCollectionDetailView.m70602sL(interfaceC12524b);
            m78535kL.putLong("EXTRA_PARAM_COLLECTION_ID", j11);
            bottomMenuCollectionDetailView.mo60305zK(m78535kL);
            return bottomMenuCollectionDetailView;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.BottomMenuCollectionDetailView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12524b {
        /* renamed from: a */
        void mo70604a(long j11);

        /* renamed from: b */
        void mo70605b(long j11);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.BottomMenuCollectionDetailView$c */
    /* loaded from: classes6.dex */
    static final class C12525c extends AbstractC19075u implements InterfaceC18494a {
        C12525c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C12554a mo12V4() {
            return C12554a.Companion.m70716a(BottomMenuCollectionDetailView.this.m92642L3());
        }
    }

    public BottomMenuCollectionDetailView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C12525c());
        this.f65498V0 = m129210a;
    }

    /* renamed from: pL */
    private final C12554a m70599pL() {
        return (C12554a) this.f65498V0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qL */
    public static final void m70600qL(BottomMenuCollectionDetailView bottomMenuCollectionDetailView, View view) {
        AbstractC19074t.m100208f(bottomMenuCollectionDetailView, "this$0");
        InterfaceC12524b interfaceC12524b = bottomMenuCollectionDetailView.f65499W0;
        if (interfaceC12524b != null) {
            interfaceC12524b.mo70604a(bottomMenuCollectionDetailView.m70599pL().m70714a());
        }
        bottomMenuCollectionDetailView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rL */
    public static final void m70601rL(BottomMenuCollectionDetailView bottomMenuCollectionDetailView, View view) {
        AbstractC19074t.m100208f(bottomMenuCollectionDetailView, "this$0");
        InterfaceC12524b interfaceC12524b = bottomMenuCollectionDetailView.f65499W0;
        if (interfaceC12524b != null) {
            interfaceC12524b.mo70605b(bottomMenuCollectionDetailView.m70599pL().m70714a());
        }
        bottomMenuCollectionDetailView.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29828h0 c29828h0;
        LinearLayout linearLayout = null;
        if (layoutInflater != null) {
            c29828h0 = C29828h0.m148013c(layoutInflater, viewGroup, false);
        } else {
            c29828h0 = null;
        }
        this.f65497U0 = c29828h0;
        if (c29828h0 != null) {
            c29828h0.f137936s.setOnClickListener(new View.OnClickListener() { // from class: x80.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BottomMenuCollectionDetailView.m70600qL(BottomMenuCollectionDetailView.this, view);
                }
            });
            c29828h0.f137935r.setOnClickListener(new View.OnClickListener() { // from class: x80.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BottomMenuCollectionDetailView.m70601rL(BottomMenuCollectionDetailView.this, view);
                }
            });
        }
        C29828h0 c29828h02 = this.f65497U0;
        if (c29828h02 != null) {
            linearLayout = c29828h02.getRoot();
        }
        AbstractC19074t.m100205c(linearLayout);
        return linearLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.bottom_menu_collection_detail;
    }

    /* renamed from: sL */
    public final void m70602sL(InterfaceC12524b interfaceC12524b) {
        AbstractC19074t.m100208f(interfaceC12524b, "listener");
        this.f65499W0 = interfaceC12524b;
    }
}
