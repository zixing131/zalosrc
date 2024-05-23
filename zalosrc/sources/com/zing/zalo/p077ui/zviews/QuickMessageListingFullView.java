package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.InterfaceC0733x;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.QuickMessageListingFullView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p649xl.C29874ja;
import p732zy.C32589e;
import p732zy.C32596l;
import p732zy.C32597m;
import p732zy.C32598n;
import p732zy.C32600p;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class QuickMessageListingFullView extends SlidableZaloView implements InterfaceC0733x {
    public static final C14903a Companion = new C14903a(null);

    /* renamed from: P0 */
    private final InterfaceC24854k f76808P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C32597m.class), new C14914l(new C14913k(this)), C14905c.f76812q);

    /* renamed from: Q0 */
    private C29874ja f76809Q0;

    /* renamed from: R0 */
    private C32589e f76810R0;

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$a */
    /* loaded from: classes6.dex */
    public static final class C14903a {
        private C14903a() {
        }

        public /* synthetic */ C14903a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$b */
    /* loaded from: classes6.dex */
    public static final class C14904b implements C32589e.a {
        C14904b() {
        }

        @Override // p732zy.C32589e.a
        /* renamed from: a */
        public void mo83375a() {
            QuickMessageListingFullView.this.m83472sM().m157863P();
        }

        @Override // p732zy.C32589e.a
        /* renamed from: b */
        public void mo83376b(C32596l c32596l) {
            AbstractC19074t.m100208f(c32596l, "item");
            QuickMessageListingFullView.this.m83472sM().m157869V(c32596l);
        }

        @Override // p732zy.C32589e.a
        /* renamed from: c */
        public void mo83377c(C32596l c32596l) {
            AbstractC19074t.m100208f(c32596l, "item");
            QuickMessageListingFullView.this.m83472sM().m157870W(c32596l);
        }

        @Override // p732zy.C32589e.a
        /* renamed from: d */
        public void mo83378d() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$c */
    /* loaded from: classes6.dex */
    static final class C14905c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14905c f76812q = new C14905c();

        C14905c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return new C32598n();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$d */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14906d extends C19071q implements InterfaceC18505l {
        C14906d(Object obj) {
            super(1, obj, QuickMessageListingFullView.class, "onDataQuickMessagesChanged", "onDataQuickMessagesChanged(Ljava/util/ArrayList;)V", 0);
        }

        /* renamed from: h */
        public final void m83481h(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "p0");
            ((QuickMessageListingFullView) this.f94922q).m83479zM(arrayList);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83481h((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14907e extends C19071q implements InterfaceC18505l {
        C14907e(Object obj) {
            super(1, obj, QuickMessageListingFullView.class, "openQuickMessageCreatingView", "openQuickMessageCreatingView(Lcom/zing/zalo/quickmessage/QuickMessageListingFullViewModel$OpenCreatingQuickMessageData;)V", 0);
        }

        /* renamed from: h */
        public final void m83482h(C32597m.a aVar) {
            AbstractC19074t.m100208f(aVar, "p0");
            ((QuickMessageListingFullView) this.f94922q).m83456BM(aVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83482h((C32597m.a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14908f extends C19071q implements InterfaceC18505l {
        C14908f(Object obj) {
            super(1, obj, QuickMessageListingFullView.class, "showDialogMoreAction", "showDialogMoreAction(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83483h(boolean z11) {
            ((QuickMessageListingFullView) this.f94922q).m83458DM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83483h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14909g extends C19071q implements InterfaceC18505l {
        C14909g(Object obj) {
            super(1, obj, QuickMessageListingFullView.class, "showDialogConfirmDeleteQuickMessage", "showDialogConfirmDeleteQuickMessage(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83484h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageListingFullView) this.f94922q).m83457CM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83484h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14910h extends C19071q implements InterfaceC18505l {
        C14910h(Object obj) {
            super(1, obj, QuickMessageListingFullView.class, "showToast", "showToast(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83485h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageListingFullView) this.f94922q).m83459EM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83485h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$i */
    /* loaded from: classes6.dex */
    public static final class C14911i extends SimpleAdapter {

        /* renamed from: p */
        final /* synthetic */ QuickMessageListingFullView f76813p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14911i(List list, QuickMessageListingFullView quickMessageListingFullView, Context context, int i11, String[] strArr, int[] iArr) {
            super(context, list, i11, strArr, iArr);
            this.f76813p = quickMessageListingFullView;
        }

        @Override // android.widget.SimpleAdapter
        public void setViewText(TextView textView, String str) {
            super.setViewText(textView, str);
            if (textView != null) {
                if (textView.getId() == AbstractC8020f0.str_delete) {
                    Context context = this.f76813p.getContext();
                    AbstractC19074t.m100205c(context);
                    textView.setTextColor(AbstractC23136l9.m118641B(context, AbstractC16801x.red));
                    return;
                }
                textView.setTextColor(C23212s8.m119607o(this.f76813p.getContext(), AbstractC21196a.TextColor1));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$j */
    /* loaded from: classes6.dex */
    static final class C14912j implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f76814p;

        C14912j(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f76814p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f76814p;
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
            this.f76814p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$k */
    /* loaded from: classes6.dex */
    public static final class C14913k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f76815q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14913k(ZaloView zaloView) {
            super(0);
            this.f76815q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f76815q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageListingFullView$l */
    /* loaded from: classes6.dex */
    public static final class C14914l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f76816q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14914l(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f76816q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f76816q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: AM */
    public static final void m83455AM(QuickMessageListingFullView quickMessageListingFullView, View view) {
        AbstractC19074t.m100208f(quickMessageListingFullView, "this$0");
        quickMessageListingFullView.m83472sM().m157868U();
    }

    /* renamed from: BM */
    public final void m83456BM(C32597m.a aVar) {
        C24848g0 c24848g0;
        Bundle bundle = new Bundle();
        Long m157877a = aVar.m157877a();
        if (m157877a != null) {
            bundle.putLong("EXTRA_QUICK_MESSAGE_ID", m157877a.longValue());
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null && C32600p.f150676a.m157895b(true)) {
            return;
        }
        bundle.putString("STR_SOURCE_START_VIEW", aVar.m157878b());
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(QuickMessageCreatingView.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: CM */
    public final void m83457CM(String str) {
        m92639EK(1, str);
    }

    /* renamed from: DM */
    public final void m83458DM(boolean z11) {
        if (z11) {
            showDialog(0);
        }
    }

    /* renamed from: EM */
    public final void m83459EM(String str) {
        ToastUtils.showMess(str);
    }

    /* renamed from: sM */
    public final C32597m m83472sM() {
        return (C32597m) this.f76808P0.getValue();
    }

    /* renamed from: tM */
    private final void m83473tM() {
        C29874ja c29874ja = this.f76809Q0;
        C29874ja c29874ja2 = null;
        if (c29874ja == null) {
            AbstractC19074t.m100223u("binding");
            c29874ja = null;
        }
        RecyclerView recyclerView = c29874ja.f138295q.f83582p0;
        if (recyclerView != null) {
            recyclerView.setBackgroundResource(AbstractC17466e.transparent);
        }
        C29874ja c29874ja3 = this.f76809Q0;
        if (c29874ja3 == null) {
            AbstractC19074t.m100223u("binding");
            c29874ja3 = null;
        }
        RecyclerView recyclerView2 = c29874ja3.f138295q.f83582p0;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        C29874ja c29874ja4 = this.f76809Q0;
        if (c29874ja4 == null) {
            AbstractC19074t.m100223u("binding");
            c29874ja4 = null;
        }
        RecyclerView recyclerView3 = c29874ja4.f138295q.f83582p0;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        C29874ja c29874ja5 = this.f76809Q0;
        if (c29874ja5 == null) {
            AbstractC19074t.m100223u("binding");
            c29874ja5 = null;
        }
        RecyclerView recyclerView4 = c29874ja5.f138295q.f83582p0;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(linearLayoutManager);
        }
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        this.f76810R0 = new C32589e(m92689tK);
        C29874ja c29874ja6 = this.f76809Q0;
        if (c29874ja6 == null) {
            AbstractC19074t.m100223u("binding");
            c29874ja6 = null;
        }
        RecyclerView recyclerView5 = c29874ja6.f138295q.f83582p0;
        if (recyclerView5 != null) {
            C32589e c32589e = this.f76810R0;
            if (c32589e == null) {
                AbstractC19074t.m100223u("mAdapter");
                c32589e = null;
            }
            recyclerView5.setAdapter(c32589e);
        }
        C32589e c32589e2 = this.f76810R0;
        if (c32589e2 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c32589e2 = null;
        }
        c32589e2.m157726V(new C14904b());
        C29874ja c29874ja7 = this.f76809Q0;
        if (c29874ja7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29874ja2 = c29874ja7;
        }
        c29874ja2.f138295q.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.na0
            public /* synthetic */ na0() {
            }

            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                QuickMessageListingFullView.m83474uM(QuickMessageListingFullView.this);
            }
        });
    }

    /* renamed from: uM */
    public static final void m83474uM(QuickMessageListingFullView quickMessageListingFullView) {
        AbstractC19074t.m100208f(quickMessageListingFullView, "this$0");
        if (C23055e5.m118272g(true)) {
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.oa0
                public /* synthetic */ oa0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QuickMessageListingFullView.m83475vM(QuickMessageListingFullView.this);
                }
            }, 200L);
            return;
        }
        C29874ja c29874ja = quickMessageListingFullView.f76809Q0;
        if (c29874ja == null) {
            AbstractC19074t.m100223u("binding");
            c29874ja = null;
        }
        c29874ja.f138295q.setRefreshing(false);
    }

    /* renamed from: vM */
    public static final void m83475vM(QuickMessageListingFullView quickMessageListingFullView) {
        AbstractC19074t.m100208f(quickMessageListingFullView, "this$0");
        quickMessageListingFullView.m83472sM().m157873Z();
    }

    /* renamed from: wM */
    public static final void m83476wM(C14911i c14911i, QuickMessageListingFullView quickMessageListingFullView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(c14911i, "$a");
        AbstractC19074t.m100208f(quickMessageListingFullView, "this$0");
        try {
            interfaceC17463d.dismiss();
            Object item = c14911i.getItem(i11);
            AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            Object obj = ((HashMap) item).get("id");
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue == AbstractC8020f0.str_edit) {
                quickMessageListingFullView.m83472sM().m157866S();
            } else if (intValue == AbstractC8020f0.str_delete) {
                quickMessageListingFullView.m83472sM().m157865R();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xM */
    public static final void m83477xM(QuickMessageListingFullView quickMessageListingFullView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(quickMessageListingFullView, "this$0");
        quickMessageListingFullView.m83472sM().m157864Q();
    }

    /* renamed from: yM */
    public static final void m83478yM(QuickMessageListingFullView quickMessageListingFullView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(quickMessageListingFullView, "this$0");
        interfaceC17463d.dismiss();
        quickMessageListingFullView.m83472sM().m157867T();
    }

    /* renamed from: zM */
    public final void m83479zM(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                C32596l c32596l = (C32596l) obj;
                boolean z11 = true;
                if (i11 >= arrayList.size() - 1) {
                    z11 = false;
                }
                arrayList2.add(new C32589e.c(c32596l, false, z11, 2, null));
            }
        } else {
            arrayList2.add(new C32589e.e(2));
        }
        C32589e c32589e = this.f76810R0;
        C29874ja c29874ja = null;
        if (c32589e == null) {
            AbstractC19074t.m100223u("mAdapter");
            c32589e = null;
        }
        c32589e.m157725U(arrayList2);
        C32589e c32589e2 = this.f76810R0;
        if (c32589e2 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c32589e2 = null;
        }
        c32589e2.m10008p();
        C29874ja c29874ja2 = this.f76809Q0;
        if (c29874ja2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29874ja = c29874ja2;
        }
        c29874ja.f138295q.setRefreshing(false);
        C0697c0.Companion.m1054h(getTrackingKey(), "length", Integer.valueOf(arrayList.size()));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m83472sM().m157862N().m9219j(this, new C14912j(new C14906d(this)));
        m83472sM().m157871X().m9219j(this, new C14912j(new C14907e(this)));
        m83472sM().m157875b0().m9219j(this, new C14912j(new C14908f(this)));
        m83472sM().m157874a0().m9219j(this, new C14912j(new C14909g(this)));
        m83472sM().m157876c0().m9219j(this, new C14912j(new C14910h(this)));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return mo49769EJ(i11, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        boolean z11;
        Object obj;
        AbstractC19074t.m100208f(objArr, "objects");
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                obj = objArr[0];
            } else {
                obj = "";
            }
            C8009j.a aVar = new C8009j.a(getContext());
            C8009j.a m43159h = aVar.m43159h(7);
            C19067n0 c19067n0 = C19067n0.f94947a;
            Locale locale = Locale.ENGLISH;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_message_dialog_delete_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(locale, m118743r0, Arrays.copyOf(new Object[]{obj}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            m43159h.m43162k(format).m43173v(3).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.delete), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ma0
                public /* synthetic */ ma0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    QuickMessageListingFullView.m83478yM(QuickMessageListingFullView.this, interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        ArrayList arrayList = new ArrayList();
        HashMap m119451i = AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit), AbstractC8020f0.str_edit);
        AbstractC19074t.m100207e(m119451i, "getNewEntry(...)");
        arrayList.add(m119451i);
        HashMap m119451i2 = AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), AbstractC8020f0.str_delete);
        AbstractC19074t.m100207e(m119451i2, "getNewEntry(...)");
        arrayList.add(m119451i2);
        C14911i c14911i = new C14911i(arrayList, this, getContext(), AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar2 = new C8009j.a(getContext());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_message_dialog_more_title));
        aVar2.m43155d(true);
        aVar2.m43153b(c14911i, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ka0

            /* renamed from: q */
            public final /* synthetic */ QuickMessageListingFullView f80890q;

            public /* synthetic */ ka0(QuickMessageListingFullView this) {
                r2 = this;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                QuickMessageListingFullView.m83476wM(QuickMessageListingFullView.C14911i.this, r2, interfaceC17463d, i12);
            }
        });
        aVar2.m43167p(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.la0
            public /* synthetic */ la0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                QuickMessageListingFullView.m83477xM(QuickMessageListingFullView.this, interfaceC17463d);
            }
        });
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29874ja m148125c = C29874ja.m148125c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148125c, "inflate(...)");
        this.f76809Q0 = m148125c;
        m83473tM();
        C29874ja c29874ja = this.f76809Q0;
        if (c29874ja == null) {
            AbstractC19074t.m100223u("binding");
            c29874ja = null;
        }
        LinearLayout root = c29874ja.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ja0
                public /* synthetic */ ja0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickMessageListingFullView.m83455AM(QuickMessageListingFullView.this, view);
                }
            });
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickMessageListingFullView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("STR_SOURCE_START_VIEW")) {
            String string = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            AbstractC19074t.m100205c(string);
            if (string.length() > 0) {
                C0697c0.Companion.m1054h(getTrackingKey(), "src", string);
            }
        }
    }
}
