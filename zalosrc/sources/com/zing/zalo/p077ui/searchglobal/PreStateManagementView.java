package com.zing.zalo.p077ui.searchglobal;

import android.os.Bundle;
import android.view.View;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.searchglobal.PreStateManagementView;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalPreStateLayout;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19325g1;
import ga0.C19348o0;
import gg0.AbstractC19444a;
import ha0.C19955h;
import p363nh.C23744a;
import p578vk.AbstractC28275a;
import p578vk.C28276b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class PreStateManagementView extends SlidableZaloView implements InterfaceC18319c {

    /* renamed from: P0 */
    private final String f67223P0;

    /* renamed from: Q0 */
    private C19348o0 f67224Q0;

    /* renamed from: R0 */
    private final C19325g1 f67225R0;

    /* renamed from: S0 */
    private boolean f67226S0;

    /* renamed from: T0 */
    private final InterfaceC24854k f67227T0;

    /* renamed from: com.zing.zalo.ui.searchglobal.PreStateManagementView$a */
    /* loaded from: classes6.dex */
    static final class C13006a extends AbstractC19075u implements InterfaceC18494a {
        C13006a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchGlobalPreStateLayout mo12V4() {
            return (SearchGlobalPreStateLayout) PreStateManagementView.this.m92691vK().findViewById(AbstractC6918a0.preStateLayout);
        }
    }

    public PreStateManagementView() {
        super(AbstractC7409c0.search_global_prestate_management);
        InterfaceC24854k m129210a;
        this.f67223P0 = "PreStateManagementView";
        C19325g1 c19325g1 = new C19325g1();
        c19325g1.m101243v().m142523k(true);
        this.f67225R0 = c19325g1;
        m129210a = AbstractC24856m.m129210a(new C13006a());
        this.f67227T0 = m129210a;
    }

    /* renamed from: hM */
    private final SearchGlobalPreStateLayout m73049hM() {
        Object value = this.f67227T0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SearchGlobalPreStateLayout) value;
    }

    /* renamed from: kM */
    private final void m73050kM() {
        if (this.f67226S0) {
            this.f67226S0 = false;
            AbstractC19444a.m101695c(new Runnable() { // from class: ea0.d
                @Override // java.lang.Runnable
                public final void run() {
                    PreStateManagementView.m73051lM(PreStateManagementView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m73051lM(PreStateManagementView preStateManagementView) {
        AbstractC19074t.m100208f(preStateManagementView, "this$0");
        C23744a.Companion.m124119a().m124116d(7000, new C18316b(preStateManagementView.f67223P0, null, null, null, 14, null));
    }

    /* renamed from: mM */
    private final void m73052mM() {
        C19348o0 c19348o0 = this.f67224Q0;
        if (c19348o0 != null) {
            c19348o0.m101436c();
        }
        C19348o0 c19348o02 = new C19348o0(this, null, 2, null);
        this.f67224Q0 = c19348o02;
        c19348o02.m101442j();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C19955h.f98250a.m103733y(this.f67225R0.m101243v(), null, "1", "1");
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: KB */
    public void mo73053KB() {
        super.mo73053KB();
        if (this.f77813M0) {
            m73050kM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m73050kM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: YJ */
    public void mo49153YJ(boolean z11, boolean z12) {
        super.mo49153YJ(z11, z12);
        if (!z11 && z12) {
            m73050kM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m73054iM(view);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PreStateManagementView";
    }

    /* renamed from: iM */
    public final void m73054iM(View view) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC2379w.m12430d(view);
        m73049hM().setActionResponder(this);
        m73052mM();
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: jM, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        switch (m97246b.hashCode()) {
            case -1905588127:
                if (m97246b.equals("Search.PreState.ClickItem")) {
                    Object m97245a = c18316b.m97245a();
                    if (m97245a instanceof AbstractC28275a.f) {
                        Object m97245a2 = c18316b.m97245a();
                        if (AbstractC19074t.m100204b(m97245a2, AbstractC28275a.f.a.f131903a) || AbstractC19074t.m100204b(m97245a2, AbstractC28275a.f.b.f131904a) || AbstractC19074t.m100204b(m97245a2, AbstractC28275a.f.c.f131905a)) {
                            C19348o0 c19348o0 = new C19348o0(this, new C18316b("Search.Task.UpdatePreStateSettingFunction", c18316b.m97245a(), Boolean.TRUE, null, 8, null));
                            this.f67224Q0 = c19348o0;
                            c19348o0.m101442j();
                            return null;
                        }
                        if (!AbstractC19074t.m100204b(m97245a2, AbstractC28275a.f.d.f131906a)) {
                            AbstractC19074t.m100204b(m97245a2, AbstractC28275a.f.e.f131907a);
                            return null;
                        }
                        return null;
                    }
                    if ((m97245a instanceof AbstractC28275a.x) && (c18316b.m97247c() instanceof Boolean)) {
                        C19348o0 c19348o02 = new C19348o0(this, new C18316b("Search.Task.UpdatePreStateSettingToggle", c18316b.m97245a(), c18316b.m97247c(), Boolean.TRUE));
                        this.f67224Q0 = c19348o02;
                        c19348o02.m101442j();
                        return null;
                    }
                    return null;
                }
                return null;
            case -677165960:
                if (m97246b.equals("Search.PreState.DeleteItem") && (c18316b.m97245a() instanceof AbstractC28275a)) {
                    C19348o0 c19348o03 = new C19348o0(this, new C18316b("Search.Task.UpdatePreStateSettingFunction", c18316b.m97245a(), Boolean.TRUE, null, 8, null));
                    this.f67224Q0 = c19348o03;
                    c19348o03.m101442j();
                    return null;
                }
                return null;
            case -223529488:
                if (m97246b.equals("Search.PreState.SubmitList") && (c18316b.m97245a() instanceof C28276b)) {
                    m73049hM().m73394c(((C28276b) c18316b.m97245a()).m142508a());
                    return null;
                }
                return null;
            case -20103104:
                if (m97246b.equals("Search.PreState.IsEditorState")) {
                    new C18316b("Search.PreState.IsEditorState", Boolean.valueOf(this.f67225R0.m101243v().m142520h()), null, null, 12, null);
                    return null;
                }
                return null;
            case 866207848:
                if (m97246b.equals("Search.GetSearchSessionData")) {
                    return new C18316b("Search.GetSearchSessionData", this.f67225R0, null, null, 12, null);
                }
                return null;
            case 896897635:
                if (m97246b.equals("Search.Task.FinishUpdatePreStateSetting")) {
                    this.f67226S0 = true;
                    return null;
                }
                return null;
            case 961448216:
                if (m97246b.equals("Search.RefreshRecentSearch")) {
                    m73052mM();
                    return null;
                }
                return null;
            default:
                return null;
        }
    }
}
