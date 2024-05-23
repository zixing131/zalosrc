package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.AbstractC1438d;
import androidx.recyclerview.widget.RecyclerView;
import b20.C2501g;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.view.SearchVideoChannelView;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.et.EnterActionEditText;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.ListClickableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import h20.InterfaceC19733q;
import i20.C20196i;
import m20.InterfaceC22775n1;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25049r1;
import q20.C25097t;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31167h0;

/* loaded from: classes5.dex */
public final class SearchVideoChannelView extends AbstractC10623a implements InterfaceC22775n1 {
    public static final C10409b Companion = new C10409b(null);

    /* renamed from: G0 */
    private static InterfaceC18509p f53221G0;

    /* renamed from: B0 */
    private final InterfaceC19733q f53222B0;

    /* renamed from: C0 */
    private C20196i f53223C0;

    /* renamed from: D0 */
    private C31167h0 f53224D0;

    /* renamed from: E0 */
    private int f53225E0;

    /* renamed from: F0 */
    private String f53226F0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10408a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10408a f53227y = new C10408a();

        C10408a() {
            super(3, C25049r1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchLayoutSearchVideoChannelBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54859h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25049r1 m54859h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25049r1.m129929c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$b */
    /* loaded from: classes5.dex */
    public static final class C10409b {
        private C10409b() {
        }

        public /* synthetic */ C10409b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ SearchVideoChannelView m54860b(C10409b c10409b, String str, InterfaceC18509p interfaceC18509p, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return c10409b.m54861a(str, interfaceC18509p);
        }

        /* renamed from: a */
        public final SearchVideoChannelView m54861a(String str, InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(interfaceC18509p, "action");
            SearchVideoChannelView searchVideoChannelView = new SearchVideoChannelView();
            SearchVideoChannelView.f53221G0 = interfaceC18509p;
            searchVideoChannelView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", str)));
            return searchVideoChannelView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$c */
    /* loaded from: classes5.dex */
    static final class C10410c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25049r1 f53228q;

        /* renamed from: r */
        final /* synthetic */ SearchVideoChannelView f53229r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10410c(C25049r1 c25049r1, SearchVideoChannelView searchVideoChannelView) {
            super(0);
            this.f53228q = c25049r1;
            this.f53229r = searchVideoChannelView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54862a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54862a() {
            this.f53228q.f120228x.m55786j();
            this.f53229r.m54852gL();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$d */
    /* loaded from: classes5.dex */
    static final class C10411d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25049r1 f53230q;

        /* renamed from: r */
        final /* synthetic */ SearchVideoChannelView f53231r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10411d(C25049r1 c25049r1, SearchVideoChannelView searchVideoChannelView) {
            super(0);
            this.f53230q = c25049r1;
            this.f53231r = searchVideoChannelView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54863a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54863a() {
            this.f53230q.f120228x.m55786j();
            this.f53231r.m54852gL();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$e */
    /* loaded from: classes5.dex */
    static final class C10412e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10412e f53232q = new C10412e();

        C10412e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "i");
            return video.m52911t();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$f */
    /* loaded from: classes5.dex */
    public static final class C10413f implements C31167h0.a {
        C10413f() {
        }

        @Override // z10.C31167h0.a
        /* renamed from: a */
        public void mo54865a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            SearchVideoChannelView.this.f53222B0.mo53471xu(SearchVideoChannelView.this.f53226F0, loadMoreInfo);
        }

        @Override // z10.C31167h0.a
        /* renamed from: b */
        public void mo54866b(Video video) {
            EnterActionEditText enterActionEditText;
            AbstractC19074t.m100208f(video, "video");
            C25049r1 c25049r1 = (C25049r1) SearchVideoChannelView.this.m55556SK();
            if (c25049r1 != null && (enterActionEditText = c25049r1.f120224t) != null) {
                AbstractC26112n.m134369J(enterActionEditText);
            }
            SearchVideoChannelView.this.m92649TI().m93060e2(AbstractC27409d.lytSearchVideoChannel, PreviewPageView.Companion.m54696a(video), null, 1, true);
        }

        @Override // z10.C31167h0.a
        /* renamed from: c */
        public void mo54867c(Video video) {
            String str;
            C25049r1 c25049r1;
            EnterActionEditText enterActionEditText;
            AbstractC19074t.m100208f(video, "video");
            Bundle m92642L3 = SearchVideoChannelView.this.m92642L3();
            if (m92642L3 != null) {
                str = m92642L3.getString("SOURCE");
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, "SOURCE_NOTI") && (c25049r1 = (C25049r1) SearchVideoChannelView.this.m55556SK()) != null && (enterActionEditText = c25049r1.f120224t) != null) {
                AbstractC26112n.m134369J(enterActionEditText);
            }
            InterfaceC18509p interfaceC18509p = SearchVideoChannelView.f53221G0;
            if (interfaceC18509p != null) {
                interfaceC18509p.mo240pC(video, SearchVideoChannelView.this.f53226F0);
            }
            SearchVideoChannelView.f53221G0 = null;
            SearchVideoChannelView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$g */
    /* loaded from: classes5.dex */
    static final class C10414g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C25049r1 f53234q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10414g(C25049r1 c25049r1) {
            super(2);
            this.f53234q = c25049r1;
        }

        /* renamed from: a */
        public final void m54868a(int i11, float f11) {
            boolean z11;
            EnterActionEditText enterActionEditText = this.f53234q.f120224t;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            enterActionEditText.setCursorVisible(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54868a(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$h */
    /* loaded from: classes5.dex */
    static final class C10415h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25049r1 f53235q;

        /* renamed from: r */
        final /* synthetic */ SearchVideoChannelView f53236r;

        /* renamed from: s */
        final /* synthetic */ EnterActionEditText f53237s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10415h(C25049r1 c25049r1, SearchVideoChannelView searchVideoChannelView, EnterActionEditText enterActionEditText) {
            super(1);
            this.f53235q = c25049r1;
            this.f53236r = searchVideoChannelView;
            this.f53237s = enterActionEditText;
        }

        /* renamed from: a */
        public final void m54869a(Editable editable) {
            CharSequence m127168X0;
            boolean m127128x;
            if (this.f53235q.f120224t.getText().length() > this.f53236r.f53225E0) {
                EnterActionEditText enterActionEditText = this.f53235q.f120224t;
                enterActionEditText.setText(enterActionEditText.getText().subSequence(0, this.f53236r.f53225E0));
                EnterActionEditText enterActionEditText2 = this.f53235q.f120224t;
                enterActionEditText2.setSelection(enterActionEditText2.getText().length());
                C25097t.f120556a.m130153n(this.f53237s.getContext(), AbstractC27413h.zch_page_search_limit);
                return;
            }
            if (editable != null && editable.length() != 0) {
                m127128x = AbstractC24341v.m127128x(editable);
                if (m127128x) {
                    this.f53235q.f120224t.getText().clear();
                    return;
                }
            }
            if (editable != null && editable.length() != 0) {
                m127168X0 = AbstractC24342w.m127168X0(editable);
                String m127019g = new C24329j("\\s+").m127019g(m127168X0, " ");
                this.f53236r.f53226F0 = m127019g;
                this.f53236r.f53222B0.mo53469XG(m127019g);
                PulseImageView pulseImageView = this.f53235q.f120223s;
                AbstractC19074t.m100207e(pulseImageView, "btnClear");
                AbstractC26112n.m134431w0(pulseImageView);
                return;
            }
            PulseImageView pulseImageView2 = this.f53235q.f120223s;
            AbstractC19074t.m100207e(pulseImageView2, "btnClear");
            AbstractC26112n.m134367H(pulseImageView2);
            this.f53236r.f53226F0 = "";
            this.f53236r.f53222B0.mo53469XG("");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54869a((Editable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$i */
    /* loaded from: classes5.dex */
    static final class C10416i extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C25049r1 f53238q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10416i(C25049r1 c25049r1) {
            super(2);
            this.f53238q = c25049r1;
        }

        /* renamed from: a */
        public final void m54870a(TextView textView, KeyEvent keyEvent) {
            AbstractC19074t.m100208f(textView, "<anonymous parameter 0>");
            EnterActionEditText enterActionEditText = this.f53238q.f120224t;
            AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
            AbstractC26112n.m134369J(enterActionEditText);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54870a((TextView) obj, (KeyEvent) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$j */
    /* loaded from: classes5.dex */
    public static final class C10417j implements OverScrollableRecyclerView.InterfaceC10832c {
        C10417j() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31167h0 c31167h0;
            C31167h0 c31167h02 = SearchVideoChannelView.this.f53224D0;
            if (c31167h02 != null && !c31167h02.m151444M() && (c31167h0 = SearchVideoChannelView.this.f53224D0) != null) {
                c31167h0.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$k */
    /* loaded from: classes5.dex */
    public static final class C10418k extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ C25049r1 f53240a;

        C10418k(C25049r1 c25049r1) {
            this.f53240a = c25049r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 1) {
                EnterActionEditText enterActionEditText = this.f53240a.f120224t;
                AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
                AbstractC26112n.m134369J(enterActionEditText);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SearchVideoChannelView$l */
    /* loaded from: classes5.dex */
    static final class C10419l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25049r1 f53241q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10419l(C25049r1 c25049r1) {
            super(0);
            this.f53241q = c25049r1;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54871a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54871a() {
            EnterActionEditText enterActionEditText = this.f53241q.f120224t;
            AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
            AbstractC26112n.m134369J(enterActionEditText);
        }
    }

    public SearchVideoChannelView() {
        super(C10408a.f53227y);
        this.f53222B0 = AbstractC28684a.Companion.m143672I();
        this.f53225E0 = 200;
        this.f53226F0 = "";
    }

    /* renamed from: eL */
    public static final void m54850eL(C25049r1 c25049r1, SearchVideoChannelView searchVideoChannelView, View view) {
        AbstractC19074t.m100208f(c25049r1, "$this_run");
        AbstractC19074t.m100208f(searchVideoChannelView, "this$0");
        EnterActionEditText enterActionEditText = c25049r1.f120224t;
        AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
        AbstractC26112n.m134369J(enterActionEditText);
        searchVideoChannelView.finish();
    }

    /* renamed from: fL */
    public static final void m54851fL(C25049r1 c25049r1, View view) {
        AbstractC19074t.m100208f(c25049r1, "$this_run");
        c25049r1.f120224t.getText().clear();
        EnterActionEditText enterActionEditText = c25049r1.f120224t;
        AbstractC19074t.m100207e(enterActionEditText, "edtSearch");
        AbstractC26112n.m134427u0(enterActionEditText);
    }

    /* renamed from: gL */
    public final void m54852gL() {
        Editable editable;
        EnterActionEditText enterActionEditText;
        InterfaceC19733q interfaceC19733q = this.f53222B0;
        C25049r1 c25049r1 = (C25049r1) m55556SK();
        if (c25049r1 != null && (enterActionEditText = c25049r1.f120224t) != null) {
            editable = enterActionEditText.getText();
        } else {
            editable = null;
        }
        interfaceC19733q.mo53469XG(String.valueOf(editable));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        getLifecycle().mo9335a(this.f53222B0);
        this.f53222B0.mo52965Lb(this);
        this.f53222B0.mo52970uo(m92642L3());
        C31167h0 c31167h0 = new C31167h0(null, 1, null);
        c31167h0.m151645W(new C10413f());
        this.f53224D0 = c31167h0;
    }

    @Override // m20.InterfaceC22775n1
    /* renamed from: Kt */
    public void mo54853Kt(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C31167h0 c31167h0 = this.f53224D0;
        if (c31167h0 != null) {
            c31167h0.m151445N();
        }
    }

    @Override // m20.InterfaceC22775n1
    /* renamed from: Lz */
    public void mo54854Lz(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25049r1 c25049r1 = (C25049r1) m55556SK();
        if (c25049r1 != null) {
            C31167h0 c31167h0 = this.f53224D0;
            if (c31167h0 != null) {
                c31167h0.m151640R();
            }
            if (th2 instanceof NetworkException) {
                c25049r1.f120228x.m55784g(new C10410c(c25049r1, this));
            } else {
                c25049r1.f120228x.m55783f(new C10411d(c25049r1, this));
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        Boolean bool;
        super.mo37584UJ();
        C31167h0 c31167h0 = this.f53224D0;
        if (c31167h0 != null) {
            bool = Boolean.valueOf(c31167h0.mo151443L());
        } else {
            bool = null;
        }
        if (AbstractC19074t.m100204b(bool, Boolean.FALSE)) {
            this.f53222B0.mo53469XG("");
        }
        C20196i c20196i = this.f53223C0;
        if (c20196i != null) {
            C20196i.m105317q(c20196i, null, 1, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        String str;
        C25049r1 c25049r1;
        EnterActionEditText enterActionEditText;
        super.mo37712VJ();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("SOURCE");
        } else {
            str = null;
        }
        if (!AbstractC19074t.m100204b(str, "SOURCE_NOTI") && (c25049r1 = (C25049r1) m55556SK()) != null && (enterActionEditText = c25049r1.f120224t) != null) {
            AbstractC26112n.m134369J(enterActionEditText);
        }
        C20196i c20196i = this.f53223C0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C25049r1 c25049r1 = (C25049r1) m55556SK();
        if (c25049r1 != null) {
            this.f53223C0 = new C20196i(this, false, new C10414g(c25049r1), 2, null);
            LinearLayout linearLayout = c25049r1.f120226v;
            AbstractC19074t.m100207e(linearLayout, "lytContainer");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                FrameLayout root = c25049r1.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                layoutParams2.topMargin = AbstractC26112n.m134365F(root);
                linearLayout.setLayoutParams(layoutParams2);
                c25049r1.f120222r.setOnClickListener(new View.OnClickListener() { // from class: m20.o1

                    /* renamed from: q */
                    public final /* synthetic */ SearchVideoChannelView f111373q;

                    public /* synthetic */ ViewOnClickListenerC22779o1(SearchVideoChannelView this) {
                        r2 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchVideoChannelView.m54850eL(C25049r1.this, r2, view2);
                    }
                });
                ImageView imageView = c25049r1.f120225u;
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                imageView.setImageDrawable(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_search_line_24, AbstractC27406a.zch_icon_tertiary));
                EnterActionEditText enterActionEditText = c25049r1.f120224t;
                AbstractC19074t.m100205c(enterActionEditText);
                AbstractC26112n.m134400h(enterActionEditText, new C10415h(c25049r1, this, enterActionEditText));
                AbstractC26112n.m134408l(enterActionEditText, new C10416i(c25049r1));
                PulseImageView pulseImageView = c25049r1.f120223s;
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                pulseImageView.setImageDrawable(C27280g.m139659b(m92689tK2, AbstractC23322a.zds_ic_close_circle_solid_16, AbstractC27406a.zch_icon_disabled));
                pulseImageView.setOnClickListener(new View.OnClickListener() { // from class: m20.p1
                    public /* synthetic */ ViewOnClickListenerC22783p1() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchVideoChannelView.m54851fL(C25049r1.this, view2);
                    }
                });
                ListClickableRecyclerView listClickableRecyclerView = c25049r1.f120230z;
                AbstractC19074t.m100205c(listClickableRecyclerView);
                AbstractC26112n.m134421r0(listClickableRecyclerView, AbstractC26105g.m134347n(4));
                Context context = listClickableRecyclerView.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                listClickableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context, 0, false, false, 14, null));
                listClickableRecyclerView.setAdapter(this.f53224D0);
                OverScrollableRecyclerView.m56144i2(listClickableRecyclerView, new C10417j(), 0.0f, 2, null);
                listClickableRecyclerView.m9826E(new C10418k(c25049r1));
                listClickableRecyclerView.setOnListClickListener(new C10419l(c25049r1));
                Context m92689tK3 = m92689tK();
                AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
                listClickableRecyclerView.m9816A(new C2501g(m92689tK3));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Override // m20.InterfaceC22775n1
    /* renamed from: b */
    public void mo54855b(boolean z11) {
        if (z11) {
            m54852gL();
        }
    }

    /* renamed from: dL */
    public final void m54856dL(Video video) {
        AbstractC19074t.m100208f(video, "video");
        InterfaceC18509p interfaceC18509p = f53221G0;
        if (interfaceC18509p != null) {
            interfaceC18509p.mo240pC(video, this.f53226F0);
        }
        f53221G0 = null;
        finish();
    }

    @Override // m20.InterfaceC22775n1
    /* renamed from: j6 */
    public void mo54857j6(String str, Section section) {
        LoadingLayout loadingLayout;
        LoadingLayout loadingLayout2;
        String m92652XI;
        LoadingLayout loadingLayout3;
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(section, "section");
        if (section.m51168m().isEmpty()) {
            C31167h0 c31167h0 = this.f53224D0;
            if (c31167h0 != null) {
                c31167h0.m151640R();
            }
            if (str.length() == 0) {
                m92652XI = m92652XI(AbstractC27413h.zch_search_video_channel_no_available_video);
            } else {
                m92652XI = m92652XI(AbstractC27413h.zch_search_video_channel_no_video_found);
            }
            String str2 = m92652XI;
            C25049r1 c25049r1 = (C25049r1) m55556SK();
            if (c25049r1 != null && (loadingLayout3 = c25049r1.f120228x) != null) {
                LoadingLayout.m55778e(loadingLayout3, null, null, str2, null, null, null, 59, null);
                return;
            }
            return;
        }
        C25049r1 c25049r12 = (C25049r1) m55556SK();
        if (c25049r12 != null && (loadingLayout2 = c25049r12.f120228x) != null) {
            loadingLayout2.m55781c();
        }
        C25049r1 c25049r13 = (C25049r1) m55556SK();
        if (c25049r13 != null && (loadingLayout = c25049r13.f120228x) != null) {
            loadingLayout.m55780b();
        }
        C31167h0 c31167h02 = this.f53224D0;
        if (c31167h02 != null) {
            c31167h02.m151445N();
        }
        C31167h0 c31167h03 = this.f53224D0;
        if (c31167h03 != null) {
            c31167h03.m151646X(section);
            c31167h03.m10008p();
        }
    }

    @Override // m20.InterfaceC22775n1
    /* renamed from: lg */
    public void mo54858lg(String str, Section section) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(section, "section");
        C31167h0 c31167h0 = this.f53224D0;
        if (c31167h0 != null) {
            int mo10003k = c31167h0.mo10003k();
            c31167h0.m151642T().m51163e(section, C10412e.f53232q);
            c31167h0.m10015w(mo10003k, c31167h0.mo10003k() - mo10003k);
        }
        C31167h0 c31167h02 = this.f53224D0;
        if (c31167h02 != null) {
            c31167h02.m151445N();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ImageView imageView;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            C25049r1 c25049r1 = (C25049r1) m55556SK();
            if (c25049r1 != null && (imageView = c25049r1.f120222r) != null) {
                imageView.callOnClick();
            }
            return true;
        }
        return false;
    }
}
