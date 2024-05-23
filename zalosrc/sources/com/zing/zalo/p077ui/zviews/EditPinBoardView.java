package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.C1919l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7211t;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import p227i3.C20218v;
import p361nb.C23648e;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p495rx.C25987a;
import p649xl.C29777e3;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import zc0.C31787e;
import zc0.InterfaceC31786d;

/* loaded from: classes6.dex */
public final class EditPinBoardView extends AnimKeepBelowZaloView implements View.OnClickListener, C23744a.c, InterfaceC0733x {
    public static final C14235a Companion = new C14235a(null);

    /* renamed from: V0 */
    private C7211t f73192V0;

    /* renamed from: W0 */
    private C1919l f73193W0;

    /* renamed from: X0 */
    private C29777e3 f73194X0;

    /* renamed from: Y0 */
    private boolean f73195Y0;

    /* renamed from: Z0 */
    private final InterfaceC24854k f73196Z0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C25987a.class), new C14245k(new C14244j(this)), new C14238d());

    /* renamed from: a1 */
    private String f73197a1;

    /* renamed from: b1 */
    private String f73198b1;

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$a */
    /* loaded from: classes6.dex */
    public static final class C14235a {
        private C14235a() {
        }

        public /* synthetic */ C14235a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$b */
    /* loaded from: classes6.dex */
    public static final class C14236b implements C7211t.d {
        C14236b() {
        }

        @Override // com.zing.zalo.adapters.C7211t.d
        /* renamed from: a */
        public void mo36712a(String str, int i11) {
            EditPinBoardView.this.m79448KM().m133888m0();
        }

        @Override // com.zing.zalo.adapters.C7211t.d
        /* renamed from: b */
        public void mo36713b(String str, int i11) {
            C25987a m79448KM = EditPinBoardView.this.m79448KM();
            AbstractC19074t.m100205c(str);
            m79448KM.m133890o0(str, i11, EditPinBoardView.this.f73195Y0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$c */
    /* loaded from: classes6.dex */
    public static final class C14237c implements InterfaceC31786d {
        C14237c() {
        }

        @Override // zc0.InterfaceC31786d
        /* renamed from: a */
        public void mo79461a() {
        }

        @Override // zc0.InterfaceC31786d
        /* renamed from: b */
        public void mo79462b(int i11, int i12) {
            EditPinBoardView.this.m79448KM().m133892q0(i11, i12);
        }

        @Override // zc0.InterfaceC31786d
        /* renamed from: c */
        public void mo79463c(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            String str;
            AbstractC19074t.m100208f(abstractC1876c0, "viewHolder");
            if (EditPinBoardView.this.m79460LM() != null) {
                C1919l m79460LM = EditPinBoardView.this.m79460LM();
                AbstractC19074t.m100205c(m79460LM);
                m79460LM.m10566H(abstractC1876c0);
            }
            if (EditPinBoardView.this.f73195Y0) {
                str = "csc_pinboard_afterpin";
            } else {
                str = "csc_pinboard_edit";
            }
            C0815e1.m2075D().m2100V(new C23648e(3, str, 0, "pinboard_reorder", EditPinBoardView.this.m79448KM().m133878V()), false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$d */
    /* loaded from: classes6.dex */
    static final class C14238d extends AbstractC19075u implements InterfaceC18494a {
        C14238d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            String str;
            Bundle m92642L3 = EditPinBoardView.this.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("extra_conversation_id")) == null) {
                str = "";
            }
            return new C25987a.c(str);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14239e implements InterfaceC1764d0, InterfaceC19066n {
        C14239e() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(ArrayList arrayList) {
            EditPinBoardView.this.m79455SM(arrayList);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, EditPinBoardView.this, EditPinBoardView.class, "onEditPinBoardChanged", "onEditPinBoardChanged(Ljava/util/ArrayList;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14240f implements InterfaceC1764d0, InterfaceC19066n {
        C14240f() {
        }

        /* renamed from: a */
        public final void m79466a(boolean z11) {
            EditPinBoardView.this.m79451OM(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, EditPinBoardView.this, EditPinBoardView.class, "onChangeStateLoadingBtnDone", "onChangeStateLoadingBtnDone(Z)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public /* bridge */ /* synthetic */ void mo8524qp(Object obj) {
            m79466a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14241g implements InterfaceC1764d0, InterfaceC19066n {
        C14241g() {
        }

        /* renamed from: a */
        public final void m79467a(boolean z11) {
            EditPinBoardView.this.m79447JM(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, EditPinBoardView.this, EditPinBoardView.class, "closeView", "closeView(Z)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public /* bridge */ /* synthetic */ void mo8524qp(Object obj) {
            m79467a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14242h implements InterfaceC1764d0, InterfaceC19066n {
        C14242h() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C25987a.b bVar) {
            EditPinBoardView.this.m79456TM(bVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, EditPinBoardView.this, EditPinBoardView.class, "showConfirmUnpinTopic", "showConfirmUnpinTopic(Lcom/zing/zalo/pinboard/EditPinBoardViewModel$DialogConfirmUnpinTopicExtra;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$i */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14243i implements InterfaceC1764d0, InterfaceC19066n {
        C14243i() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "p0");
            EditPinBoardView.this.m79457UM(c24848g0);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, EditPinBoardView.this, EditPinBoardView.class, "showInterruptDialog", "showInterruptDialog(Lkotlin/Unit;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$j */
    /* loaded from: classes6.dex */
    public static final class C14244j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f73207q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14244j(ZaloView zaloView) {
            super(0);
            this.f73207q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f73207q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditPinBoardView$k */
    /* loaded from: classes6.dex */
    public static final class C14245k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f73208q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14245k(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f73208q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f73208q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final void m79447JM(boolean z11) {
        if (z11) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public final C25987a m79448KM() {
        return (C25987a) this.f73196Z0.getValue();
    }

    /* renamed from: MM */
    private final void m79449MM() {
        C29777e3 c29777e3 = this.f73194X0;
        C29777e3 c29777e32 = null;
        if (c29777e3 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e3 = null;
        }
        ViewGroup.LayoutParams layoutParams = c29777e3.f137645t.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = AbstractC17484n.Companion.m92931b() + AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height);
        C29777e3 c29777e33 = this.f73194X0;
        if (c29777e33 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e33 = null;
        }
        c29777e33.f137645t.setLayoutParams(layoutParams2);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        this.f73192V0 = new C7211t(m92689tK, new C14236b(), new C14237c());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        C29777e3 c29777e34 = this.f73194X0;
        if (c29777e34 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e34 = null;
        }
        c29777e34.f137648w.setLayoutManager(linearLayoutManager);
        C29777e3 c29777e35 = this.f73194X0;
        if (c29777e35 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e35 = null;
        }
        c29777e35.f137648w.setAdapter(this.f73192V0);
        C1919l c1919l = new C1919l(new C31787e(this.f73192V0));
        this.f73193W0 = c1919l;
        AbstractC19074t.m100205c(c1919l);
        C29777e3 c29777e36 = this.f73194X0;
        if (c29777e36 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e36 = null;
        }
        c1919l.m10568m(c29777e36.f137648w);
        C29777e3 c29777e37 = this.f73194X0;
        if (c29777e37 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e37 = null;
        }
        c29777e37.f137644s.setOnClickListener(this);
        C29777e3 c29777e38 = this.f73194X0;
        if (c29777e38 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29777e32 = c29777e38;
        }
        c29777e32.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.wc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditPinBoardView.m79450NM(EditPinBoardView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m79450NM(EditPinBoardView editPinBoardView, View view) {
        AbstractC19074t.m100208f(editPinBoardView, "this$0");
        editPinBoardView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public final void m79451OM(boolean z11) {
        C29777e3 c29777e3 = null;
        if (z11) {
            C29777e3 c29777e32 = this.f73194X0;
            if (c29777e32 == null) {
                AbstractC19074t.m100223u("binding");
                c29777e32 = null;
            }
            c29777e32.f137649x.setVisibility(0);
            C29777e3 c29777e33 = this.f73194X0;
            if (c29777e33 == null) {
                AbstractC19074t.m100223u("binding");
                c29777e33 = null;
            }
            c29777e33.f137644s.setText((CharSequence) null);
            C29777e3 c29777e34 = this.f73194X0;
            if (c29777e34 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29777e3 = c29777e34;
            }
            c29777e3.f137644s.setEnabled(false);
            return;
        }
        C29777e3 c29777e35 = this.f73194X0;
        if (c29777e35 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e35 = null;
        }
        c29777e35.f137649x.setVisibility(8);
        C29777e3 c29777e36 = this.f73194X0;
        if (c29777e36 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e36 = null;
        }
        c29777e36.f137644s.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_done_reorder_pin_board));
        C29777e3 c29777e37 = this.f73194X0;
        if (c29777e37 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29777e3 = c29777e37;
        }
        c29777e3.f137644s.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m79452PM(EditPinBoardView editPinBoardView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(editPinBoardView, "this$0");
        interfaceC17463d.dismiss();
        editPinBoardView.m79448KM().m133891p0(editPinBoardView.f73195Y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m79453QM(EditPinBoardView editPinBoardView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(editPinBoardView, "this$0");
        interfaceC17463d.dismiss();
        editPinBoardView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m79454RM(EditPinBoardView editPinBoardView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(editPinBoardView, "this$0");
        interfaceC17463d.dismiss();
        editPinBoardView.m79448KM().m133889n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public final void m79455SM(ArrayList arrayList) {
        C29777e3 c29777e3 = null;
        if (arrayList != null && arrayList.size() > 0) {
            C29777e3 c29777e32 = this.f73194X0;
            if (c29777e32 == null) {
                AbstractC19074t.m100223u("binding");
                c29777e32 = null;
            }
            c29777e32.f137646u.setVisibility(8);
            C29777e3 c29777e33 = this.f73194X0;
            if (c29777e33 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29777e3 = c29777e33;
            }
            c29777e3.f137648w.setVisibility(0);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                arrayList2.add(new C7211t.b((C7904b) obj));
            }
            C7211t c7211t = this.f73192V0;
            AbstractC19074t.m100205c(c7211t);
            c7211t.m36696T(arrayList2);
            C7211t c7211t2 = this.f73192V0;
            AbstractC19074t.m100205c(c7211t2);
            c7211t2.m10008p();
            return;
        }
        C29777e3 c29777e34 = this.f73194X0;
        if (c29777e34 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e34 = null;
        }
        c29777e34.f137646u.setVisibility(0);
        C29777e3 c29777e35 = this.f73194X0;
        if (c29777e35 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29777e3 = c29777e35;
        }
        c29777e3.f137648w.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public final void m79456TM(C25987a.b bVar) {
        String str;
        String str2 = null;
        if (bVar != null) {
            str = bVar.m133898b();
        } else {
            str = null;
        }
        this.f73197a1 = str;
        if (bVar != null) {
            str2 = bVar.m133897a();
        }
        this.f73198b1 = str2;
        showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public final void m79457UM(C24848g0 c24848g0) {
        showDialog(2);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m79448KM().m133880Y().m9219j(this, new C14239e());
        m79448KM().m133886k0().m9219j(this, new C14240f());
        m79448KM().m133894u0().m9219j(this, new C14241g());
        m79448KM().m133893s0().m9219j(this, new C14242h());
        m79448KM().m133895v0().m9219j(this, new C14243i());
        m78097xM(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C29777e3 c29777e3 = null;
        KeyEventCallbackC17462c m118434b = null;
        if (i11 != 1) {
            if (i11 == 2) {
                C8009j.a aVar = new C8009j.a(getContext());
                aVar.m43159h(4);
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_interrupt_reorder_pin_error_title));
                aVar.m43173v(2);
                aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_interrupt_reorder_pin_error_message));
                aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_interrupt_reorder_pin_error_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.yc
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        EditPinBoardView.m79453QM(EditPinBoardView.this, interfaceC17463d, i12);
                    }
                });
                aVar.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.zc
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        EditPinBoardView.m79454RM(EditPinBoardView.this, interfaceC17463d, i12);
                    }
                });
                m118434b = aVar.m43152a();
            }
        } else {
            String str = this.f73197a1;
            String str2 = this.f73198b1;
            C29777e3 c29777e32 = this.f73194X0;
            if (c29777e32 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29777e3 = c29777e32;
            }
            m118434b = AbstractC23089h6.m118434b(str, str2, c29777e3.getRoot().getContext(), new InterfaceC17463d.b(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.xc
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    EditPinBoardView.m79452PM(EditPinBoardView.this, interfaceC17463d, i12);
                }
            });
        }
        AbstractC19074t.m100205c(m118434b);
        return m118434b;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29777e3 m147886c = C29777e3.m147886c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147886c, "inflate(...)");
        this.f73194X0 = m147886c;
        m79449MM();
        C29777e3 c29777e3 = this.f73194X0;
        if (c29777e3 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e3 = null;
        }
        FrameLayout root = c29777e3.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: LM */
    public final C1919l m79460LM() {
        return this.f73193W0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: TL */
    protected List mo78192TL() {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(27);
        return m131506n;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "EditPinBoardView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (view.getId() == AbstractC6918a0.btn_done) {
            m79448KM().m133887l0(this.f73195Y0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView
    /* renamed from: uM */
    protected View mo78095uM() {
        C29777e3 c29777e3 = this.f73194X0;
        if (c29777e3 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e3 = null;
        }
        RelativeLayout relativeLayout = c29777e3.f137645t;
        AbstractC19074t.m100207e(relativeLayout, "container");
        return relativeLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView
    /* renamed from: vM */
    protected View mo78096vM() {
        C29777e3 c29777e3 = this.f73194X0;
        if (c29777e3 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e3 = null;
        }
        FrameLayout root = c29777e3.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        m79448KM().m133885g0(i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        C29777e3 c29777e3 = null;
        if (m92642L3 != null) {
            boolean z11 = false;
            C0815e1.m2075D().m2100V(new C23648e(3, m92642L3.getString("STR_SOURCE_START_VIEW", ""), 1, "pinboard_edit", m79448KM().m133878V(), C0815e1.m2075D().m2125z(m79448KM().m133878V(), AbstractC25495a.m132088m(m92642L3.getString("extra_conversation_id", "")))), false);
            if (m92642L3.containsKey("BOL_EXTRA_OPENED_AFTER_PIN") && m92642L3.getBoolean("BOL_EXTRA_OPENED_AFTER_PIN")) {
                z11 = true;
            }
            this.f73195Y0 = z11;
            if (z11) {
                C29777e3 c29777e32 = this.f73194X0;
                if (c29777e32 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29777e32 = null;
                }
                c29777e32.f137640A.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_after_pin_title));
            }
        }
        C29777e3 c29777e33 = this.f73194X0;
        if (c29777e33 == null) {
            AbstractC19074t.m100223u("binding");
            c29777e33 = null;
        }
        c29777e33.f137651z.setText(m79448KM().m133883e0());
        C29777e3 c29777e34 = this.f73194X0;
        if (c29777e34 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29777e3 = c29777e34;
        }
        c29777e3.f137646u.setText(m79448KM().m133884f0());
    }
}
