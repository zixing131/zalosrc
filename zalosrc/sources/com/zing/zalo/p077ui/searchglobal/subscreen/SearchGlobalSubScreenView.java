package com.zing.zalo.p077ui.searchglobal.subscreen;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import au.AbstractC2379w;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.searchglobal.subscreen.SearchGlobalSubScreenView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.ZaloView;
import dj.C17945a0;
import ea0.C18316b;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import en0.InterfaceC18505l;
import fa0.C18850p;
import fa0.InterfaceC18835a;
import fa0.InterfaceC18836b;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.Arrays;
import java.util.List;
import p056cj.AbstractC3552t;
import p239ih.C20556f;
import p363nh.C23744a;
import p510sq.C26365a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29076h;
import p612wk.AbstractC29080l;
import p612wk.C29070b;
import p612wk.C29078j;
import p649xl.C29713ab;
import pm0.C24848g0;

/* loaded from: classes6.dex */
public final class SearchGlobalSubScreenView extends SlidableZaloView implements InterfaceC18836b, C23744a.c, InterfaceC18319c, InterfaceC0733x {

    /* renamed from: P0 */
    private final String f67295P0 = "SearchGlobalSubScreenView";

    /* renamed from: Q0 */
    private InterfaceC18835a f67296Q0;

    /* renamed from: R0 */
    private C29713ab f67297R0;

    /* renamed from: S0 */
    private C8009j f67298S0;

    /* renamed from: com.zing.zalo.ui.searchglobal.subscreen.SearchGlobalSubScreenView$a */
    /* loaded from: classes6.dex */
    static final class C13028a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ AbstractC29069a f67300r;

        /* renamed from: s */
        final /* synthetic */ AbstractC3552t f67301s;

        /* renamed from: t */
        final /* synthetic */ int f67302t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13028a(AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t, int i11) {
            super(1);
            this.f67300r = abstractC29069a;
            this.f67301s = abstractC3552t;
            this.f67302t = i11;
        }

        /* renamed from: a */
        public final void m73236a(int i11) {
            InterfaceC18835a interfaceC18835a = SearchGlobalSubScreenView.this.f67296Q0;
            if (interfaceC18835a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC18835a = null;
            }
            interfaceC18835a.mo98816Hf(this.f67300r, this.f67301s, this.f67302t, i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73236a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: iM */
    private final void m73217iM() {
        C29713ab c29713ab = this.f67297R0;
        C29713ab c29713ab2 = null;
        if (c29713ab == null) {
            AbstractC19074t.m100223u("binding");
            c29713ab = null;
        }
        AbstractC2379w.m12430d(c29713ab.getRoot());
        C29713ab c29713ab3 = this.f67297R0;
        if (c29713ab3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29713ab2 = c29713ab3;
        }
        c29713ab2.f137246q.setActionResponder(this);
    }

    /* renamed from: kM */
    private final void m73218kM() {
        AbstractC19444a.m101695c(new Runnable() { // from class: fa0.t
            @Override // java.lang.Runnable
            public final void run() {
                SearchGlobalSubScreenView.m73219lM(SearchGlobalSubScreenView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m73219lM(SearchGlobalSubScreenView searchGlobalSubScreenView) {
        AbstractC19074t.m100208f(searchGlobalSubScreenView, "this$0");
        if (!searchGlobalSubScreenView.m92677nJ() && !searchGlobalSubScreenView.m92681pJ() && searchGlobalSubScreenView.m92674mJ()) {
            InterfaceC18835a interfaceC18835a = searchGlobalSubScreenView.f67296Q0;
            if (interfaceC18835a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC18835a = null;
            }
            interfaceC18835a.mo98817Ii();
        }
    }

    /* renamed from: mM */
    private final void m73220mM() {
        C23744a.Companion.m124119a().m124115b(this, 6);
    }

    /* renamed from: nM */
    private final void m73221nM() {
        C23744a.Companion.m124119a().m124117e(this, 6);
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: Bt */
    public void mo73222Bt(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        C18333g1.m97283w(C18333g1.f92667a, this, str, 0, 4, null);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C18850p c18850p = new C18850p(this);
        this.f67296Q0 = c18850p;
        InterfaceC18835a interfaceC18835a = null;
        c18850p.mo995Nd(C13029a.Companion.m73245a(m92642L3()), null);
        InterfaceC18835a interfaceC18835a2 = this.f67296Q0;
        if (interfaceC18835a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC18835a = interfaceC18835a2;
        }
        interfaceC18835a.mo98826nc();
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: F5 */
    public void mo73223F5(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        C18333g1 c18333g1 = C18333g1.f92667a;
        C29713ab c29713ab = this.f67297R0;
        if (c29713ab == null) {
            AbstractC19074t.m100223u("binding");
            c29713ab = null;
        }
        c18333g1.m97288F(c29713ab.f137246q.getAdapter(), messageId);
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: G1 */
    public void mo73224G1(String str) {
        AbstractC19074t.m100208f(str, "text");
        C18333g1.f92667a.m97295q(this, str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29713ab m147732c = C29713ab.m147732c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147732c, "inflate(...)");
        this.f67297R0 = m147732c;
        if (m147732c == null) {
            AbstractC19074t.m100223u("binding");
            m147732c = null;
        }
        RelativeLayout root = m147732c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        InterfaceC18835a interfaceC18835a = this.f67296Q0;
        if (interfaceC18835a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18835a = null;
        }
        interfaceC18835a.mo994F2();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        InterfaceC18835a interfaceC18835a = this.f67296Q0;
        if (interfaceC18835a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18835a = null;
        }
        interfaceC18835a.mo98832wk();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (!z11 && this.f77813M0) {
            InterfaceC18835a interfaceC18835a = this.f67296Q0;
            if (interfaceC18835a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC18835a = null;
            }
            interfaceC18835a.mo98825mm();
        }
        super.mo59740N7(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            InterfaceC18835a interfaceC18835a = this.f67296Q0;
            if (interfaceC18835a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC18835a = null;
            }
            m87077NK.setMiddleTitle(interfaceC18835a.mo98814C9());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        InterfaceC18835a interfaceC18835a = this.f67296Q0;
        if (interfaceC18835a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18835a = null;
        }
        interfaceC18835a.mo98824l(i11);
        return super.mo37491QJ(i11);
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: Qw */
    public void mo73225Qw(boolean z11) {
        C29713ab c29713ab = this.f67297R0;
        if (c29713ab == null) {
            AbstractC19074t.m100223u("binding");
            c29713ab = null;
        }
        c29713ab.f137246q.m73422q(z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m73221nM();
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: Rt */
    public void mo73226Rt(AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t, int i11, List list) {
        AbstractC19074t.m100208f(abstractC29069a, "data");
        AbstractC19074t.m100208f(abstractC3552t, "media");
        AbstractC19074t.m100208f(list, "list");
        this.f67298S0 = C18333g1.f92667a.m97284A(this, list, new C13028a(abstractC29069a, abstractC3552t, i11));
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f67298S0;
        if (c8009j != null) {
            c8009j.dismiss();
        }
        m73221nM();
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: W */
    public void mo73227W(C20556f c20556f) {
        AbstractC19074t.m100208f(c20556f, "fileWrapper");
        C18333g1.f92667a.m97297u(this, c20556f);
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: Wk */
    public void mo73228Wk(int i11) {
        C29713ab c29713ab = this.f67297R0;
        if (c29713ab == null) {
            AbstractC19074t.m100223u("binding");
            c29713ab = null;
        }
        c29713ab.f137246q.setBackgroundResource(i11);
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: Yc */
    public void mo73229Yc(int i11, MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        C18333g1 c18333g1 = C18333g1.f92667a;
        C29713ab c29713ab = this.f67297R0;
        if (c29713ab == null) {
            AbstractC19074t.m100223u("binding");
            c29713ab = null;
        }
        c18333g1.m97287E(c29713ab.f137246q.getAdapter(), messageId);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m73217iM();
        m73218kM();
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: gE */
    public void mo73230gE(String str, AbstractC29080l abstractC29080l, AbstractC29076h abstractC29076h, String str2, String str3, int i11, long j11, int i12) {
        AbstractC19074t.m100208f(str, "textSearch");
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "ownerDisplayName");
        C18333g1.f92667a.m97299x(this, str, abstractC29080l, abstractC29076h, str2, str3, i11, j11, i12);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SearchGlobalSubScreenView";
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: jM, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC29069a.a aVar;
        C17945a0 m145141e;
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        InterfaceC18835a interfaceC18835a = null;
        switch (m97246b.hashCode()) {
            case -1976584376:
                if (!m97246b.equals("ACTION_GET_PAGE_DATA")) {
                    return null;
                }
                String m97246b2 = c18316b.m97246b();
                InterfaceC18835a interfaceC18835a2 = this.f67296Q0;
                if (interfaceC18835a2 == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC18835a2 = null;
                }
                C29078j mo98815Gh = interfaceC18835a2.mo98815Gh();
                InterfaceC18835a interfaceC18835a3 = this.f67296Q0;
                if (interfaceC18835a3 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC18835a = interfaceC18835a3;
                }
                return new C18316b(m97246b2, mo98815Gh, interfaceC18835a.mo98833y0(), null, 8, null);
            case -1898143184:
                if (!m97246b.equals("GET_BOUND_ZALO_VIEW")) {
                    return null;
                }
                return new C18316b("RETURN_RESULT", this, null, null, 12, null);
            case -1659355660:
                if (!m97246b.equals("Search.Result.LongClickItem") || !(c18316b.m97245a() instanceof AbstractC29069a) || !(c18316b.m97247c() instanceof Integer)) {
                    return null;
                }
                if (c18316b.m97248d() instanceof AbstractC3552t) {
                    InterfaceC18835a interfaceC18835a4 = this.f67296Q0;
                    if (interfaceC18835a4 == null) {
                        AbstractC19074t.m100223u("presenter");
                        interfaceC18835a4 = null;
                    }
                    interfaceC18835a4.mo98823ib((AbstractC29069a) c18316b.m97245a(), (AbstractC3552t) c18316b.m97248d(), ((Number) c18316b.m97247c()).intValue());
                    return null;
                }
                InterfaceC18835a interfaceC18835a5 = this.f67296Q0;
                if (interfaceC18835a5 == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC18835a5 = null;
                }
                interfaceC18835a5.mo98822Vg((AbstractC29069a) c18316b.m97245a(), ((Number) c18316b.m97247c()).intValue());
                return null;
            case -1167406192:
                if (!m97246b.equals("Search.Result.ClickItem")) {
                    return null;
                }
                if ((c18316b.m97245a() instanceof AbstractC29069a.a) && (c18316b.m97247c() instanceof Integer)) {
                    if (c18316b.m97248d() instanceof AbstractC3552t) {
                        InterfaceC18835a interfaceC18835a6 = this.f67296Q0;
                        if (interfaceC18835a6 == null) {
                            AbstractC19074t.m100223u("presenter");
                            interfaceC18835a6 = null;
                        }
                        interfaceC18835a6.mo98828og((AbstractC29069a.a) c18316b.m97245a(), (AbstractC3552t) c18316b.m97248d(), ((Number) c18316b.m97247c()).intValue());
                        return null;
                    }
                    InterfaceC18835a interfaceC18835a7 = this.f67296Q0;
                    if (interfaceC18835a7 == null) {
                        AbstractC19074t.m100223u("presenter");
                        interfaceC18835a7 = null;
                    }
                    interfaceC18835a7.mo98821Uj((AbstractC29069a) c18316b.m97245a(), ((Number) c18316b.m97247c()).intValue());
                    return null;
                }
                if (!(c18316b.m97245a() instanceof AbstractC29069a.f)) {
                    return null;
                }
                InterfaceC18835a interfaceC18835a8 = this.f67296Q0;
                if (interfaceC18835a8 == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC18835a8 = null;
                }
                interfaceC18835a8.mo98831ql((AbstractC29069a.f) c18316b.m97245a());
                return null;
            case 346572025:
                if (!m97246b.equals("GET_BOUND_ACTIVITY")) {
                    return null;
                }
                return new C18316b("RETURN_RESULT", m92648SI(), null, null, 12, null);
            case 1517742221:
                if (!m97246b.equals("Search.Result.ToggleUploadDownloadCallback")) {
                    return null;
                }
                Object m97245a = c18316b.m97245a();
                if (m97245a instanceof AbstractC29069a.a) {
                    aVar = (AbstractC29069a.a) m97245a;
                } else {
                    aVar = null;
                }
                if (aVar == null || (m145141e = aVar.m145141e()) == null) {
                    return null;
                }
                InterfaceC18835a interfaceC18835a9 = this.f67296Q0;
                if (interfaceC18835a9 == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC18835a9 = null;
                }
                interfaceC18835a9.mo98827no(m145141e, AbstractC19074t.m100204b(c18316b.m97247c(), Boolean.TRUE));
                return null;
            case 1576917232:
                if (!m97246b.equals("ACTION_ON_PAGE_SCROLL_REACH_BOTTOM") || !(c18316b.m97245a() instanceof C29070b)) {
                    return null;
                }
                InterfaceC18835a interfaceC18835a10 = this.f67296Q0;
                if (interfaceC18835a10 == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC18835a10 = null;
                }
                interfaceC18835a10.mo98818Oe((C29070b) c18316b.m97245a());
                return null;
            case 1917340633:
                if (!m97246b.equals("ACTION_CLICK_ITEM_SEE_MORE_COMPACT_MESSAGE") || !(c18316b.m97245a() instanceof AbstractC29069a.a) || !(c18316b.m97247c() instanceof Integer)) {
                    return null;
                }
                InterfaceC18835a interfaceC18835a11 = this.f67296Q0;
                if (interfaceC18835a11 == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC18835a11 = null;
                }
                interfaceC18835a11.mo98830pf((AbstractC29069a.a) c18316b.m97245a(), ((Number) c18316b.m97247c()).intValue());
                return null;
            default:
                return null;
        }
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: lE */
    public void mo73232lE(AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t) {
        AbstractC19074t.m100208f(abstractC29069a, "data");
        AbstractC19074t.m100208f(abstractC3552t, "media");
        C18333g1.f92667a.m97301z(this, abstractC29069a, abstractC3552t);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if (m93012K0 != null && m93012K0.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            InterfaceC18835a interfaceC18835a = this.f67296Q0;
            if (interfaceC18835a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC18835a = null;
            }
            interfaceC18835a.mo98819Q();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m73220mM();
        InterfaceC18835a interfaceC18835a = this.f67296Q0;
        if (interfaceC18835a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18835a = null;
        }
        interfaceC18835a.mo98829p5(true);
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: q2 */
    public void mo73233q2(C26365a c26365a, int i11) {
        AbstractC19074t.m100208f(c26365a, "profileParam");
        C18333g1.f92667a.m97292L(this, c26365a, i11);
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: vs */
    public void mo73234vs() {
        C23744a.Companion.m124119a().m124116d(7000, new C18316b(this.f67295P0, null, null, null, 14, null));
    }

    @Override // fa0.InterfaceC18836b
    /* renamed from: wk */
    public void mo73235wk(String str, MessageId messageId, Integer num, String str2) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(messageId, "messageId");
        C18333g1.f92667a.m97291K(this, str, messageId, num, str2);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        InterfaceC18835a interfaceC18835a = this.f67296Q0;
        if (interfaceC18835a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC18835a = null;
        }
        interfaceC18835a.mo98820U(i11, Arrays.copyOf(objArr, objArr.length));
    }
}
