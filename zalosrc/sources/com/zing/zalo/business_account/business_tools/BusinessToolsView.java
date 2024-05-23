package com.zing.zalo.business_account.business_tools;

import ac.InterfaceC0733x;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.business_account.business_tools.AbstractC7404a;
import com.zing.zalo.business_account.business_tools.BusinessToolsView;
import com.zing.zalo.business_account.business_tools.C7407d;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.ZSnackBar;
import com.zing.zalo.p077ui.zviews.AutoReplyListingView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.QuickMessageListingFullView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.productcatalog.p068ui.zview.CatalogsManageView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import de.InterfaceC17894c;
import en0.InterfaceC18494a;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23136l9;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import on0.AbstractC24341v;
import p055ce.C3432a;
import p140ev.C18613b;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29901l1;
import pm0.InterfaceC24854k;
import vg.C28203u6;

/* loaded from: classes3.dex */
public final class BusinessToolsView extends SlidableZaloView implements InterfaceC17894c, InterfaceC0733x {

    /* renamed from: P0 */
    private C29901l1 f40231P0;

    /* renamed from: Q0 */
    private C7405b f40232Q0;

    /* renamed from: R0 */
    private LinearLayoutManager f40233R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f40234S0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C7407d.class), new C7402b(new C7401a(this)), C7403c.f40238q);

    /* renamed from: T0 */
    private final InterfaceC1764d0 f40235T0 = new InterfaceC1764d0() { // from class: de.j
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            BusinessToolsView.m37577iM(BusinessToolsView.this, (List) obj);
        }
    };

    /* renamed from: com.zing.zalo.business_account.business_tools.BusinessToolsView$a */
    /* loaded from: classes3.dex */
    public static final class C7401a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f40236q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7401a(ZaloView zaloView) {
            super(0);
            this.f40236q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f40236q;
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.BusinessToolsView$b */
    /* loaded from: classes3.dex */
    public static final class C7402b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f40237q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7402b(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f40237q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f40237q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.BusinessToolsView$c */
    /* loaded from: classes3.dex */
    static final class C7403c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C7403c f40238q = new C7403c();

        C7403c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C7407d.a();
        }
    }

    /* renamed from: hM */
    private final C7407d m37576hM() {
        return (C7407d) this.f40234S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m37577iM(BusinessToolsView businessToolsView, List list) {
        AbstractC19074t.m100208f(businessToolsView, "this$0");
        AbstractC19074t.m100208f(list, "items");
        C7405b c7405b = businessToolsView.f40232Q0;
        C7405b c7405b2 = null;
        if (c7405b == null) {
            AbstractC19074t.m100223u("adapter");
            c7405b = null;
        }
        c7405b.m37596N(list);
        C7405b c7405b3 = businessToolsView.f40232Q0;
        if (c7405b3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c7405b2 = c7405b3;
        }
        c7405b2.m10008p();
    }

    /* renamed from: jM */
    private final void m37578jM() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(AutoReplyListingView.class, new Bundle(), 1, true);
        }
    }

    /* renamed from: kM */
    private final void m37579kM() {
        m37583oM();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 24);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: lM */
    private final void m37580lM() {
        try {
            String m17237f = C3432a.f14402a.m17237f();
            if (m17237f.length() == 0) {
                AbstractC20110a.f98889a.mo104552e(new Exception("Business Account infoUrl is empty"));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", m17237f);
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93605x);
            bundle.putInt("EXTRA_SOURCE_LINK", 100);
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92692wK = m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            c15403a.m87171F(m92692wK, m17237f, bundle);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: mM */
    private final void m37581mM() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(CatalogsManageView.class, new Bundle(), 1, true);
        }
    }

    /* renamed from: nM */
    private final void m37582nM() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(QuickMessageListingFullView.class, new Bundle(), 1, true);
        }
    }

    /* renamed from: oM */
    private final void m37583oM() {
        ZaloView m92993D0;
        C17487o0 m92662fJ;
        C17487o0 m92662fJ2 = m92662fJ();
        if (m92662fJ2 != null && (m92993D0 = m92662fJ2.m92993D0(FrameLayoutKeepBtmSheetZaloView.class)) != null && (m92993D0 instanceof FrameLayoutKeepBtmSheetZaloView) && ((FrameLayoutKeepBtmSheetZaloView) m92993D0).m79790fM() == 24 && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.mo92702G1(m92993D0, 0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29901l1 m148185c = C29901l1.m148185c(LayoutInflater.from(getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m148185c, "inflate(...)");
        this.f40231P0 = m148185c;
        this.f40232Q0 = new C7405b(this);
        C29901l1 c29901l1 = this.f40231P0;
        C29901l1 c29901l12 = null;
        if (c29901l1 == null) {
            AbstractC19074t.m100223u("binding");
            c29901l1 = null;
        }
        RecyclerView recyclerView = c29901l1.f138543q;
        C7405b c7405b = this.f40232Q0;
        if (c7405b == null) {
            AbstractC19074t.m100223u("adapter");
            c7405b = null;
        }
        recyclerView.setAdapter(c7405b);
        this.f40233R0 = new LinearLayoutManager(getContext(), 1, false);
        C29901l1 c29901l13 = this.f40231P0;
        if (c29901l13 == null) {
            AbstractC19074t.m100223u("binding");
            c29901l13 = null;
        }
        RecyclerView recyclerView2 = c29901l13.f138543q;
        LinearLayoutManager linearLayoutManager = this.f40233R0;
        if (linearLayoutManager == null) {
            AbstractC19074t.m100223u("layoutManager");
            linearLayoutManager = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        C29901l1 c29901l14 = this.f40231P0;
        if (c29901l14 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29901l12 = c29901l14;
        }
        RelativeLayout root = c29901l12.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m37576hM().m37623N().mo9222o(this.f40235T0);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 5400);
        bVar.m124119a().m124117e(this, 161);
        bVar.m124119a().m124117e(this, 163);
        bVar.m124119a().m124117e(this, 164);
        bVar.m124119a().m124117e(this, 166);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m37576hM().m37624O();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m37576hM().m37623N().m9219j(this, this.f40235T0);
        m37576hM().m37625Q();
        m37583oM();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 5400);
        bVar.m124119a().m124115b(this, 161);
        bVar.m124119a().m124115b(this, 163);
        bVar.m124119a().m124115b(this, 164);
        bVar.m124119a().m124115b(this, 166);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BusinessToolsView";
    }

    @Override // de.InterfaceC17894c
    /* renamed from: oj */
    public void mo37585oj(AbstractC7404a abstractC7404a) {
        boolean m127120J;
        String m37592a;
        boolean m127120J2;
        AbstractC19074t.m100208f(abstractC7404a, "action");
        if (abstractC7404a instanceof AbstractC7404a.e) {
            Bundle bundle = new Bundle();
            bundle.putString("linktoShare", ((AbstractC7404a.e) abstractC7404a).m37593a());
            bundle.putBoolean("bol_share_in_app", true);
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(ShareView.class, bundle, 1, true);
                return;
            }
            return;
        }
        if (abstractC7404a instanceof AbstractC7404a.b) {
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, ((AbstractC7404a.b) abstractC7404a).m37590a(), new SensitiveData("clipboard_copy_text_business_tool", "business_tool", null, 4, null));
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null && m92676n2.mo35576n3()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.business_tools_link_copied_toast));
                return;
            }
            ZSnackBar.C13550a c13550a = ZSnackBar.Companion;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_tools_link_copied_toast);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            ZSnackBar m75985a = c13550a.m75985a(m92689tK, m118743r0, "", null);
            C17487o0 m92662fJ2 = m92662fJ();
            AbstractC19074t.m100205c(m92662fJ2);
            m75985a.m75984j(m92662fJ2);
            return;
        }
        if (abstractC7404a instanceof AbstractC7404a.d) {
            AbstractC7404a.d dVar = (AbstractC7404a.d) abstractC7404a;
            m127120J = AbstractC24341v.m127120J(dVar.m37592a(), "http://", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(dVar.m37592a(), "https://", false, 2, null);
                if (!m127120J2) {
                    m37592a = "https://" + dVar.m37592a();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("EXTRA_WEB_URL", m37592a);
                    ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
                    InterfaceC27218a m92676n22 = m92676n2();
                    AbstractC19074t.m100205c(m92676n22);
                    c15403a.m87171F(m92676n22, m37592a, bundle2);
                    return;
                }
            }
            m37592a = dVar.m37592a();
            Bundle bundle22 = new Bundle();
            bundle22.putString("EXTRA_WEB_URL", m37592a);
            ZaloWebView.C15403a c15403a2 = ZaloWebView.Companion;
            InterfaceC27218a m92676n222 = m92676n2();
            AbstractC19074t.m100205c(m92676n222);
            c15403a2.m87171F(m92676n222, m37592a, bundle22);
            return;
        }
        if (abstractC7404a instanceof AbstractC7404a.c) {
            Bundle bundle3 = new Bundle();
            AbstractC7404a.c cVar = (AbstractC7404a.c) abstractC7404a;
            bundle3.putString("EXTRA_WEB_URL", cVar.m37591a());
            ZaloWebView.C15403a c15403a3 = ZaloWebView.Companion;
            InterfaceC27218a m92676n23 = m92676n2();
            AbstractC19074t.m100205c(m92676n23);
            c15403a3.m87171F(m92676n23, cVar.m37591a(), bundle3);
            return;
        }
        if (abstractC7404a instanceof AbstractC7404a.f) {
            m37579kM();
            return;
        }
        if (abstractC7404a instanceof AbstractC7404a.a) {
            int m37610a = ((AbstractC7404a.a) abstractC7404a).m37589a().m37610a();
            if (m37610a != 2) {
                if (m37610a != 3) {
                    if (m37610a != 4) {
                        if (m37610a == 5) {
                            m37578jM();
                            return;
                        }
                        return;
                    }
                    m37582nM();
                    return;
                }
                m37581mM();
                return;
            }
            m37580lM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 != 161 && i11 != 166) {
            if (i11 != 5400) {
                if (i11 != 163 && i11 != 164) {
                    return;
                }
            } else {
                ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, CoreUtility.f89233i, false, 2, null);
                if (m141800i != null && m141800i.m40357A0()) {
                    m37576hM().m37624O();
                    return;
                } else {
                    finish();
                    return;
                }
            }
        }
        m37576hM().m37624O();
    }
}
