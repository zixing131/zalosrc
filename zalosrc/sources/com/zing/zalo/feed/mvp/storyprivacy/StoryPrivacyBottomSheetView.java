package com.zing.zalo.feed.mvp.storyprivacy;

import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p401or.C24412b;
import p401or.C24413c;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class StoryPrivacyBottomSheetView extends ZdsModalBottomSheet {

    /* renamed from: S0 */
    private final InterfaceC24854k f47104S0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C24412b.class), new C8793b(new C8792a(this)), new C8794c());

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetView$a */
    /* loaded from: classes4.dex */
    public static final class C8792a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f47105q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8792a(ZaloView zaloView) {
            super(0);
            this.f47105q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f47105q;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetView$b */
    /* loaded from: classes4.dex */
    public static final class C8793b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f47106q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8793b(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f47106q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f47106q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetView$c */
    /* loaded from: classes4.dex */
    static final class C8794c extends AbstractC19075u implements InterfaceC18494a {
        C8794c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return StoryPrivacyBottomSheetView.this.m47031sM();
        }
    }

    /* renamed from: rM */
    private final C24412b m47030rM() {
        return (C24412b) this.f47104S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public final C24413c m47031sM() {
        return new C24413c();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    public void close() {
        super.close();
        m47030rM().m127691c0();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new StoryPrivacyBottomSheetViewBs(m47030rM());
    }
}
