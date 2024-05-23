package com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonelist;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonelist.C11223a;
import com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import is.AbstractC20826v0;
import java.util.List;
import m50.C22868a;
import me0.AbstractC23136l9;
import me0.C23055e5;
import n50.C23570d;
import n50.C23571e;
import n50.InterfaceC23567a;
import p205hc.C19964c;
import p227i3.C20218v;
import p509sp.AbstractC26363l;
import p649xl.C30086va;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class RingtoneBottomSheet extends BottomSheetZaloViewWithAnim implements C22868a.a {

    /* renamed from: X0 */
    private C30086va f56370X0;

    /* renamed from: Y0 */
    private C22868a f56371Y0;

    /* renamed from: Z0 */
    private C22868a f56372Z0;

    /* renamed from: a1 */
    private LinearLayoutManager f56373a1;

    /* renamed from: W0 */
    private final InterfaceC24854k f56369W0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C11223a.class), new C11221m(new C11220l(this)), C11222n.f56388q);

    /* renamed from: b1 */
    private final Runnable f56374b1 = new Runnable() { // from class: o50.a
        @Override // java.lang.Runnable
        public final void run() {
            RingtoneBottomSheet.m58759HM(RingtoneBottomSheet.this);
        }
    };

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C11209a extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        final /* synthetic */ C30086va f56375a;

        /* renamed from: b */
        final /* synthetic */ RingtoneBottomSheet f56376b;

        C11209a(C30086va c30086va, RingtoneBottomSheet ringtoneBottomSheet) {
            this.f56375a = c30086va;
            this.f56376b = ringtoneBottomSheet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            int m118742r = AbstractC23136l9.m118742r(12.0f);
            int m118742r2 = AbstractC23136l9.m118742r(4.0f) / 2;
            int m9817A0 = this.f56375a.f139693u.m9817A0(view);
            if (m9817A0 != 0) {
                C22868a c22868a = this.f56376b.f56372Z0;
                if (c22868a == null) {
                    AbstractC19074t.m100223u("tabsAdapter");
                    c22868a = null;
                }
                if (m9817A0 == c22868a.mo10003k() - 1) {
                    rect.set(m118742r2, 0, m118742r, 0);
                    return;
                } else {
                    rect.set(m118742r2, 0, m118742r2, 0);
                    return;
                }
            }
            rect.set(m118742r, 0, m118742r2, 0);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C11210b extends RecyclerView.AbstractC1892s {
        C11210b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 1) {
                RingtoneBottomSheet.this.m58769xM().m58844O0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$c */
    /* loaded from: classes5.dex */
    public static final class C11211c extends RecyclerView.AbstractC1887n {
        C11211c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            rect.set(AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(6.0f));
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$d */
    /* loaded from: classes5.dex */
    public static final class C11212d extends RecyclerView.AbstractC1892s {

        /* renamed from: b */
        final /* synthetic */ NoPredictiveItemAnimLinearLayoutMngr f56379b;

        C11212d(NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr) {
            this.f56379b = noPredictiveItemAnimLinearLayoutMngr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "view");
            if (i11 == 0) {
                RingtoneBottomSheet.this.m58769xM().m58845P0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                int m9745c2 = this.f56379b.m9745c2();
                int m10127i = this.f56379b.m10127i();
                if (i12 > 0) {
                    RingtoneBottomSheet.this.m58769xM().m58842M0();
                }
                if (i12 != 0) {
                    RingtoneBottomSheet.this.m58769xM().m58843N0(m9745c2, m10127i);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$e */
    /* loaded from: classes5.dex */
    public static final class C11213e extends AbstractC18391a {
        C11213e() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11;
            C30086va c30086va = RingtoneBottomSheet.this.f56370X0;
            if (c30086va == null) {
                AbstractC19074t.m100223u("binding");
                c30086va = null;
            }
            ImageView imageView = c30086va.f139691s;
            if (editable != null && editable.toString().length() > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            imageView.setVisibility(i11);
            RingtoneBottomSheet.this.m58769xM().m58840K0(String.valueOf(editable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$f */
    /* loaded from: classes5.dex */
    public static final class C11214f extends AbstractC19075u implements InterfaceC18505l {
        C11214f() {
            super(1);
        }

        /* renamed from: a */
        public final void m58776a(List list) {
            C22868a c22868a = null;
            C30086va c30086va = null;
            if (list.size() <= 1) {
                C30086va c30086va2 = RingtoneBottomSheet.this.f56370X0;
                if (c30086va2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30086va2 = null;
                }
                c30086va2.f139687C.setVisibility(8);
                C30086va c30086va3 = RingtoneBottomSheet.this.f56370X0;
                if (c30086va3 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30086va = c30086va3;
                }
                c30086va.f139693u.setVisibility(8);
                return;
            }
            C30086va c30086va4 = RingtoneBottomSheet.this.f56370X0;
            if (c30086va4 == null) {
                AbstractC19074t.m100223u("binding");
                c30086va4 = null;
            }
            c30086va4.f139687C.setVisibility(0);
            C30086va c30086va5 = RingtoneBottomSheet.this.f56370X0;
            if (c30086va5 == null) {
                AbstractC19074t.m100223u("binding");
                c30086va5 = null;
            }
            c30086va5.f139693u.setVisibility(0);
            C22868a c22868a2 = RingtoneBottomSheet.this.f56372Z0;
            if (c22868a2 == null) {
                AbstractC19074t.m100223u("tabsAdapter");
                c22868a2 = null;
            }
            AbstractC19074t.m100205c(list);
            c22868a2.m117544O(list);
            C22868a c22868a3 = RingtoneBottomSheet.this.f56372Z0;
            if (c22868a3 == null) {
                AbstractC19074t.m100223u("tabsAdapter");
            } else {
                c22868a = c22868a3;
            }
            c22868a.m10008p();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58776a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$g */
    /* loaded from: classes5.dex */
    public static final class C11215g extends AbstractC19075u implements InterfaceC18505l {
        C11215g() {
            super(1);
        }

        /* renamed from: a */
        public final void m58777a(List list) {
            C22868a c22868a = RingtoneBottomSheet.this.f56371Y0;
            C22868a c22868a2 = null;
            if (c22868a == null) {
                AbstractC19074t.m100223u("ringtoneAdapter");
                c22868a = null;
            }
            AbstractC19074t.m100205c(list);
            c22868a.m117544O(list);
            C22868a c22868a3 = RingtoneBottomSheet.this.f56371Y0;
            if (c22868a3 == null) {
                AbstractC19074t.m100223u("ringtoneAdapter");
            } else {
                c22868a2 = c22868a3;
            }
            c22868a2.m10008p();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58777a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$h */
    /* loaded from: classes5.dex */
    public static final class C11216h extends AbstractC19075u implements InterfaceC18505l {
        C11216h() {
            super(1);
        }

        /* renamed from: a */
        public final void m58778a(C23570d c23570d) {
            C22868a c22868a = RingtoneBottomSheet.this.f56371Y0;
            if (c22868a == null) {
                AbstractC19074t.m100223u("ringtoneAdapter");
                c22868a = null;
            }
            AbstractC19074t.m100205c(c23570d);
            c22868a.m117546Q(c23570d);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58778a((C23570d) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$i */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11217i extends C19071q implements InterfaceC18505l {
        C11217i(Object obj) {
            super(1, obj, RingtoneBottomSheet.class, "handleTriggerEvent", "handleTriggerEvent(Lcom/zing/zalo/arch/ui/Event;)V", 0);
        }

        /* renamed from: h */
        public final void m58779h(C19964c c19964c) {
            AbstractC19074t.m100208f(c19964c, "p0");
            ((RingtoneBottomSheet) this.f94922q).m58774yM(c19964c);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58779h((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$j */
    /* loaded from: classes5.dex */
    public static final class C11218j extends AbstractC19075u implements InterfaceC18505l {
        C11218j() {
            super(1);
        }

        /* renamed from: a */
        public final void m58780a(C19964c c19964c) {
            Boolean bool = (Boolean) c19964c.m103749a();
            if (bool != null) {
                RingtoneBottomSheet ringtoneBottomSheet = RingtoneBottomSheet.this;
                bool.booleanValue();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_updated));
                ringtoneBottomSheet.close();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58780a((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$k */
    /* loaded from: classes5.dex */
    public static final class C11219k implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f56385p;

        C11219k(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f56385p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f56385p;
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
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f56385p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$l */
    /* loaded from: classes5.dex */
    public static final class C11220l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f56386q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11220l(ZaloView zaloView) {
            super(0);
            this.f56386q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f56386q;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$m */
    /* loaded from: classes5.dex */
    public static final class C11221m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f56387q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11221m(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f56387q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f56387q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.RingtoneBottomSheet$n */
    /* loaded from: classes5.dex */
    static final class C11222n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11222n f56388q = new C11222n();

        C11222n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C11223a.p();
        }
    }

    public RingtoneBottomSheet() {
        m78539iM(true);
    }

    /* renamed from: AM */
    private final void m58752AM(C30086va c30086va, Context context) {
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(context);
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        c30086va.f139686B.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        c30086va.f139686B.setVisibility(0);
        c30086va.f139686B.setScrollbarFadingEnabled(false);
        c30086va.f139686B.m9816A(new C11211c());
        c30086va.f139686B.m9826E(new C11212d(noPredictiveItemAnimLinearLayoutMngr));
        C22868a c22868a = new C22868a(context);
        this.f56371Y0 = c22868a;
        c22868a.m9999J(true);
        C22868a c22868a2 = this.f56371Y0;
        C22868a c22868a3 = null;
        if (c22868a2 == null) {
            AbstractC19074t.m100223u("ringtoneAdapter");
            c22868a2 = null;
        }
        c22868a2.m117545P(this);
        RecyclerView recyclerView = c30086va.f139686B;
        C22868a c22868a4 = this.f56371Y0;
        if (c22868a4 == null) {
            AbstractC19074t.m100223u("ringtoneAdapter");
        } else {
            c22868a3 = c22868a4;
        }
        recyclerView.setAdapter(c22868a3);
    }

    /* renamed from: BM */
    private final void m58753BM(final C30086va c30086va) {
        c30086va.f139695w.setSingleLine(true);
        c30086va.f139695w.setEnableClearText(false);
        CustomEditText customEditText = c30086va.f139695w;
        customEditText.setClearDrawable(AbstractC23136l9.m118665N(customEditText.getContext(), AbstractC17466e.transparent));
        c30086va.f139695w.addTextChangedListener(new C11213e());
        c30086va.f139685A.setOnTouchListener(new View.OnTouchListener() { // from class: o50.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m58754CM;
                m58754CM = RingtoneBottomSheet.m58754CM(RingtoneBottomSheet.this, c30086va, view, motionEvent);
                return m58754CM;
            }
        });
        c30086va.f139696x.setOnTouchListener(new View.OnTouchListener() { // from class: o50.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m58755DM;
                m58755DM = RingtoneBottomSheet.m58755DM(RingtoneBottomSheet.this, c30086va, view, motionEvent);
                return m58755DM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final boolean m58754CM(RingtoneBottomSheet ringtoneBottomSheet, C30086va c30086va, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(ringtoneBottomSheet, "this$0");
        AbstractC19074t.m100208f(c30086va, "$this_initSearchInput");
        if (motionEvent.getAction() == 0) {
            RelativeLayout relativeLayout = c30086va.f139696x;
            AbstractC19074t.m100207e(relativeLayout, "layoutInput");
            if (m58768vM(ringtoneBottomSheet, relativeLayout, motionEvent.getX(), motionEvent.getY(), 0, 8, null)) {
                ringtoneBottomSheet.m58773wM(true);
            }
            ringtoneBottomSheet.removeCallbacks(ringtoneBottomSheet.f56374b1);
            ringtoneBottomSheet.mo78955kl(ringtoneBottomSheet.f56374b1, 500L);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final boolean m58755DM(RingtoneBottomSheet ringtoneBottomSheet, C30086va c30086va, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(ringtoneBottomSheet, "this$0");
        AbstractC19074t.m100208f(c30086va, "$this_initSearchInput");
        if (motionEvent.getAction() == 0) {
            ImageView imageView = c30086va.f139691s;
            AbstractC19074t.m100207e(imageView, "clearInput");
            if (m58768vM(ringtoneBottomSheet, imageView, motionEvent.getX(), motionEvent.getY(), 0, 8, null)) {
                C30086va c30086va2 = ringtoneBottomSheet.f56370X0;
                C30086va c30086va3 = null;
                if (c30086va2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30086va2 = null;
                }
                c30086va2.f139695w.setText("");
                C30086va c30086va4 = ringtoneBottomSheet.f56370X0;
                if (c30086va4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30086va3 = c30086va4;
                }
                c30086va3.f139695w.setSelection(0);
            }
        }
        return false;
    }

    /* renamed from: EM */
    private final void m58756EM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C30086va c30086va = this.f56370X0;
        if (c30086va == null) {
            AbstractC19074t.m100223u("binding");
            c30086va = null;
        }
        m58752AM(c30086va, m92689tK);
        m58770zM(c30086va, m92689tK);
        m58753BM(c30086va);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        bottomSheetLayout.setPadding(0, AbstractC23136l9.m118737p0() + ((int) bottomSheetLayout.getResources().getDimension(AbstractC17454d.action_bar_default_height)), 0, 0);
        bottomSheetLayout.setEnableScrollY(true);
        bottomSheetLayout.setEnableToggleWHenClickNoConsume(false);
        bottomSheetLayout.setCanOverTranslateMaxY(true);
        m78539iM(false);
        bottomSheetLayout.setMaxTranslationY(mo37128eM());
        bottomSheetLayout.setMinTranslationY(mo37128eM());
        bottomSheetLayout.setMinimized(true);
        bottomSheetLayout.setOnTouchListener(new View.OnTouchListener() { // from class: o50.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m58757FM;
                m58757FM = RingtoneBottomSheet.m58757FM(RingtoneBottomSheet.this, view, motionEvent);
                return m58757FM;
            }
        });
        m58769xM().m58847o0().m9219j(this, new C11219k(new C11214f()));
        m58769xM().m58850x0().m9219j(this, new C11219k(new C11215g()));
        m58769xM().m58848v0().m9219j(this, new C11219k(new C11216h()));
        m58769xM().m58836A0().m9219j(this, new C11219k(new C11217i(this)));
        m58769xM().m58849w0().m9219j(this, new C11219k(new C11218j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final boolean m58757FM(RingtoneBottomSheet ringtoneBottomSheet, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(ringtoneBottomSheet, "this$0");
        if (motionEvent.getAction() == 1) {
            float y11 = motionEvent.getY();
            C30086va c30086va = ringtoneBottomSheet.f56370X0;
            if (c30086va == null) {
                AbstractC19074t.m100223u("binding");
                c30086va = null;
            }
            if (y11 < c30086va.f139698z.getY()) {
                ringtoneBottomSheet.close();
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: GM */
    private final void m58758GM(int i11) {
        C30086va c30086va = this.f56370X0;
        if (c30086va == null) {
            AbstractC19074t.m100223u("binding");
            c30086va = null;
        }
        FeedRecyclerView feedRecyclerView = c30086va.f139693u;
        AbstractC19074t.m100207e(feedRecyclerView, "horizontalRecyclerView");
        AbstractC26363l.m135708b(feedRecyclerView, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m58759HM(RingtoneBottomSheet ringtoneBottomSheet) {
        AbstractC19074t.m100208f(ringtoneBottomSheet, "this$0");
        ringtoneBottomSheet.m58769xM().m58846Q0();
    }

    /* renamed from: vM */
    public static /* synthetic */ boolean m58768vM(RingtoneBottomSheet ringtoneBottomSheet, View view, float f11, float f12, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = AbstractC23136l9.m118742r(20.0f);
        }
        return ringtoneBottomSheet.m58772uM(view, f11, f12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final C11223a m58769xM() {
        return (C11223a) this.f56369W0.getValue();
    }

    /* renamed from: zM */
    private final void m58770zM(C30086va c30086va, Context context) {
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(context);
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        this.f56373a1 = noPredictiveItemAnimLinearLayoutMngr;
        c30086va.f139693u.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        c30086va.f139693u.setVisibility(0);
        c30086va.f139693u.m9816A(new C11209a(c30086va, this));
        c30086va.f139693u.m9826E(new C11210b());
        AbstractC20826v0.m108780Q0(c30086va.f139693u);
        C22868a c22868a = new C22868a(context);
        this.f56372Z0 = c22868a;
        c22868a.m117545P(this);
        FeedRecyclerView feedRecyclerView = c30086va.f139693u;
        C22868a c22868a2 = this.f56372Z0;
        if (c22868a2 == null) {
            AbstractC19074t.m100223u("tabsAdapter");
            c22868a2 = null;
        }
        feedRecyclerView.setAdapter(c22868a2);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C30086va c30086va = this.f56370X0;
        if (c30086va == null) {
            AbstractC19074t.m100223u("binding");
            c30086va = null;
        }
        LinearLayout linearLayout = c30086va.f139689q;
        AbstractC19074t.m100207e(linearLayout, "bottomSheetContainer");
        return linearLayout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m58769xM().onPause();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: X0 */
    public boolean mo37120X0(float f11, boolean z11, float f12) {
        if (f11 > AbstractC23136l9.m118742r(100.0f)) {
            close();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim
    public void close() {
        m58769xM().m58839J0();
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, new Intent());
        }
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C30086va m148622c = C30086va.m148622c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m148622c, "inflate(...)");
        this.f56370X0 = m148622c;
        C30086va c30086va = null;
        if (m148622c == null) {
            AbstractC19074t.m100223u("binding");
            m148622c = null;
        }
        this.f72455N0 = m148622c.f139689q;
        C30086va c30086va2 = this.f56370X0;
        if (c30086va2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30086va = c30086va2;
        }
        this.f72456O0 = c30086va.f139694v;
        m58756EM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "RingtoneBottomSheet";
    }

    @Override // n50.InterfaceC23568b
    /* renamed from: i5 */
    public void mo58771i5(InterfaceC23567a interfaceC23567a) {
        AbstractC19074t.m100208f(interfaceC23567a, "event");
        m58769xM().mo58771i5(interfaceC23567a);
    }

    /* renamed from: uM */
    public final boolean m58772uM(View view, float f11, float f12, int i11) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i11;
        rect.left -= i11;
        rect.bottom += i11;
        rect.right += i11;
        return rect.contains((int) f11, (int) f12);
    }

    /* renamed from: wM */
    public final void m58773wM(boolean z11) {
        int i11;
        C30086va c30086va = null;
        if (z11) {
            C30086va c30086va2 = this.f56370X0;
            if (c30086va2 == null) {
                AbstractC19074t.m100223u("binding");
                c30086va2 = null;
            }
            AbstractC2379w.m12432f(c30086va2.f139695w);
        } else {
            C30086va c30086va3 = this.f56370X0;
            if (c30086va3 == null) {
                AbstractC19074t.m100223u("binding");
                c30086va3 = null;
            }
            AbstractC2379w.m12430d(c30086va3.f139695w);
        }
        C30086va c30086va4 = this.f56370X0;
        if (c30086va4 == null) {
            AbstractC19074t.m100223u("binding");
            c30086va4 = null;
        }
        c30086va4.f139695w.setCursorVisible(z11);
        C30086va c30086va5 = this.f56370X0;
        if (c30086va5 == null) {
            AbstractC19074t.m100223u("binding");
            c30086va5 = null;
        }
        RelativeLayout relativeLayout = c30086va5.f139696x;
        C30086va c30086va6 = this.f56370X0;
        if (c30086va6 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30086va = c30086va6;
        }
        Context context = c30086va.f139696x.getContext();
        if (z11) {
            i11 = AbstractC16803z.bg_border_input_search_music_focus;
        } else {
            i11 = AbstractC16803z.bg_border_input_search_music;
        }
        relativeLayout.setBackground(AbstractC23136l9.m118665N(context, i11));
    }

    /* renamed from: yM */
    public final void m58774yM(C19964c c19964c) {
        AbstractC19074t.m100208f(c19964c, "ev");
        C11223a.k kVar = (C11223a.k) c19964c.m103749a();
        if (kVar instanceof C11223a.m) {
            C30086va c30086va = this.f56370X0;
            if (c30086va == null) {
                AbstractC19074t.m100223u("binding");
                c30086va = null;
            }
            RecyclerView.AbstractC1888o layoutManager = c30086va.f139686B.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo9756v1(0);
                return;
            }
            return;
        }
        if (kVar instanceof C11223a.l) {
            m58758GM(((C11223a.l) kVar).m58877a());
        } else if (kVar instanceof C11223a.o) {
            mo78936E(((C11223a.o) kVar).m58878a());
        } else if (kVar instanceof C11223a.j) {
            m58773wM(!((C11223a.j) kVar).m58875a());
        }
    }

    @Override // com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneEmptyContentViewCell.InterfaceC11246a
    /* renamed from: ze */
    public void mo58775ze(C23571e c23571e) {
        AbstractC19074t.m100208f(c23571e, "emptyContentData");
        if (c23571e.m123663r() == 1) {
            C30086va c30086va = null;
            if (C23055e5.m118273h(false, 1, null)) {
                if (c23571e.m123667v() == 1) {
                    C11223a m58769xM = m58769xM();
                    C30086va c30086va2 = this.f56370X0;
                    if (c30086va2 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30086va = c30086va2;
                    }
                    m58769xM.m58840K0(String.valueOf(c30086va.f139695w.getText()));
                    return;
                }
                m58769xM().m58841L0();
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.network_error));
        }
    }
}
