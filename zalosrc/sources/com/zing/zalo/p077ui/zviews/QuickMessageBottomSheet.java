package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.showcase.C13309e;
import com.zing.zalo.p077ui.showcase.WalkThroughOnboardView;
import com.zing.zalo.p077ui.zviews.QuickMessageBottomSheet;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.C23212s8;
import p227i3.C20218v;
import p262jb.AbstractC21196a;
import p361nb.C23648e;
import p649xl.C29838ha;
import p732zy.C32589e;
import p732zy.C32590f;
import p732zy.C32591g;
import p732zy.C32596l;
import p732zy.C32600p;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import sa0.C26209i;
import vg.AbstractC28025b8;
import vg.C28212v6;

/* loaded from: classes6.dex */
public final class QuickMessageBottomSheet extends BottomSheet implements InterfaceC0733x {

    /* renamed from: b1 */
    private final InterfaceC24854k f76778b1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C32590f.class), new C14878n(new C14877m(this)), C14866b.f76784q);

    /* renamed from: c1 */
    private C29838ha f76779c1;

    /* renamed from: d1 */
    private LinearLayoutManager f76780d1;

    /* renamed from: e1 */
    private C32589e f76781e1;

    /* renamed from: f1 */
    private boolean f76782f1;

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C14865a implements C32589e.a {
        C14865a() {
        }

        @Override // p732zy.C32589e.a
        /* renamed from: a */
        public void mo83375a() {
            QuickMessageBottomSheet.this.m83361WL().m157737P("qm_csc_bottomsheet_button_create_empty");
        }

        @Override // p732zy.C32589e.a
        /* renamed from: b */
        public void mo83376b(C32596l c32596l) {
            AbstractC19074t.m100208f(c32596l, "item");
            QuickMessageBottomSheet.this.m83361WL().m157743V(c32596l);
        }

        @Override // p732zy.C32589e.a
        /* renamed from: c */
        public void mo83377c(C32596l c32596l) {
            AbstractC19074t.m100208f(c32596l, "item");
            QuickMessageBottomSheet.this.m83361WL().m157744W(c32596l);
        }

        @Override // p732zy.C32589e.a
        /* renamed from: d */
        public void mo83378d() {
            QuickMessageBottomSheet.this.m83361WL().m157738Q();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$b */
    /* loaded from: classes6.dex */
    static final class C14866b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14866b f76784q = new C14866b();

        C14866b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C32591g();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$c */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14867c extends C19071q implements InterfaceC18505l {
        C14867c(Object obj) {
            super(1, obj, QuickMessageBottomSheet.class, "onDataQuickMessagesChanged", "onDataQuickMessagesChanged(Ljava/util/ArrayList;)V", 0);
        }

        /* renamed from: h */
        public final void m83380h(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "p0");
            ((QuickMessageBottomSheet) this.f94922q).m83366bM(arrayList);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83380h((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$d */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14868d extends C19071q implements InterfaceC18505l {
        C14868d(Object obj) {
            super(1, obj, QuickMessageBottomSheet.class, "openQuickMessageCreatingView", "openQuickMessageCreatingView(Lcom/zing/zalo/quickmessage/QuickMessageBottomSheetViewModel$OpenCreatingQuickMessageData;)V", 0);
        }

        /* renamed from: h */
        public final void m83381h(C32590f.a aVar) {
            AbstractC19074t.m100208f(aVar, "p0");
            ((QuickMessageBottomSheet) this.f94922q).m83367cM(aVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83381h((C32590f.a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14869e extends C19071q implements InterfaceC18505l {
        C14869e(Object obj) {
            super(1, obj, QuickMessageBottomSheet.class, "openQuickMessageListingFullView", "openQuickMessageListingFullView(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83382h(boolean z11) {
            ((QuickMessageBottomSheet) this.f94922q).m83368dM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83382h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14870f extends C19071q implements InterfaceC18505l {
        C14870f(Object obj) {
            super(1, obj, QuickMessageBottomSheet.class, "showDialogMoreAction", "showDialogMoreAction(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83383h(boolean z11) {
            ((QuickMessageBottomSheet) this.f94922q).m83371gM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83383h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14871g extends C19071q implements InterfaceC18505l {
        C14871g(Object obj) {
            super(1, obj, QuickMessageBottomSheet.class, "showDialogConfirmDeleteQuickMessage", "showDialogConfirmDeleteQuickMessage(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83384h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageBottomSheet) this.f94922q).m83370fM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83384h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14872h extends C19071q implements InterfaceC18505l {
        C14872h(Object obj) {
            super(1, obj, QuickMessageBottomSheet.class, "showToast", "showToast(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83385h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageBottomSheet) this.f94922q).m83374jM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83385h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$i */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14873i extends C19071q implements InterfaceC18505l {
        C14873i(Object obj) {
            super(1, obj, QuickMessageBottomSheet.class, "setResultAndFinish", "setResultAndFinish(J)V", 0);
        }

        /* renamed from: h */
        public final void m83386h(long j11) {
            ((QuickMessageBottomSheet) this.f94922q).m83369eM(j11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83386h(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$j */
    /* loaded from: classes6.dex */
    public static final class C14874j extends SimpleAdapter {

        /* renamed from: p */
        final /* synthetic */ QuickMessageBottomSheet f76785p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14874j(List list, QuickMessageBottomSheet quickMessageBottomSheet, Context context, int i11, String[] strArr, int[] iArr) {
            super(context, list, i11, strArr, iArr);
            this.f76785p = quickMessageBottomSheet;
        }

        @Override // android.widget.SimpleAdapter
        public void setViewText(TextView textView, String str) {
            super.setViewText(textView, str);
            if (textView != null) {
                if (textView.getId() == AbstractC8020f0.str_delete) {
                    Context context = this.f76785p.getContext();
                    AbstractC19074t.m100205c(context);
                    textView.setTextColor(AbstractC23136l9.m118641B(context, AbstractC16801x.red));
                    return;
                }
                textView.setTextColor(C23212s8.m119607o(this.f76785p.getContext(), AbstractC21196a.TextColor1));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$k */
    /* loaded from: classes6.dex */
    static final class C14875k implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f76786p;

        C14875k(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f76786p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f76786p;
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
            this.f76786p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$l */
    /* loaded from: classes6.dex */
    public static final class C14876l implements WalkThroughOnboardView.InterfaceC13300b {
        C14876l() {
        }

        @Override // com.zing.zalo.p077ui.showcase.WalkThroughOnboardView.InterfaceC13300b
        /* renamed from: a */
        public void mo74659a(WalkThroughOnboardView walkThroughOnboardView) {
            AbstractC19074t.m100208f(walkThroughOnboardView, "walkThroughOnboardView");
            QuickMessageBottomSheet.this.f76782f1 = false;
            ArrayList arrayList = (ArrayList) C32600p.f150676a.m157898e().m157926o().mo9215f();
            if (arrayList != null && arrayList.size() > 0) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_qm_tip_onboarding_done);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{"/" + ((C32596l) arrayList.get(0)).m157831f()}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                C28212v6 c28212v6 = new C28212v6(format);
                c28212v6.f131577c = "tip.quickmessage.onboard_done";
                long currentTimeMillis = System.currentTimeMillis();
                c28212v6.f131587m = currentTimeMillis;
                c28212v6.f131588n = currentTimeMillis + 86400000;
                c28212v6.f131575a = 1;
                AbstractC28025b8.m141438I("tip.quickmessage.onboard_done", c28212v6);
            }
            C0815e1.m2075D().m2100V(new C23648e(43, "qm_csc_bottomsheet", 1, "qm_onboard_done", new String[0]), false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$m */
    /* loaded from: classes6.dex */
    public static final class C14877m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f76788q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14877m(ZaloView zaloView) {
            super(0);
            this.f76788q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f76788q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheet$n */
    /* loaded from: classes6.dex */
    public static final class C14878n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f76789q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14878n(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f76789q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f76789q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: VL */
    private final void m83360VL() {
        FrameLayout frameLayout;
        View findViewWithTag;
        ZaloView m92650VI = m92650VI();
        AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.ZdsModalBottomSheet");
        View m87195jM = ((ZdsModalBottomSheet) m92650VI).m87195jM();
        if (m87195jM instanceof FrameLayout) {
            frameLayout = (FrameLayout) m87195jM;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null && (findViewWithTag = frameLayout.findViewWithTag("WalkThroughOnboardView")) != null) {
            AbstractC19074t.m100205c(findViewWithTag);
            frameLayout.removeView(findViewWithTag);
        }
        this.f76782f1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WL */
    public final C32590f m83361WL() {
        return (C32590f) this.f76778b1.getValue();
    }

    /* renamed from: XL */
    private final void m83362XL() {
        m90527vL(0);
        m90533zL(EnumC17017m.HUG_CONTENT);
        Bundle m92642L3 = m92642L3();
        int i11 = -1;
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("EXTRA_MAX_HEIGHT_VIEW", -1);
        }
        if (i11 > 0) {
            m90523rL(i11);
        }
        this.f76780d1 = new LinearLayoutManager(getContext());
        C29838ha c29838ha = this.f76779c1;
        C29838ha c29838ha2 = null;
        if (c29838ha == null) {
            AbstractC19074t.m100223u("binding");
            c29838ha = null;
        }
        c29838ha.f138029u.setLayoutManager(this.f76780d1);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        this.f76781e1 = new C32589e(m92689tK);
        C29838ha c29838ha3 = this.f76779c1;
        if (c29838ha3 == null) {
            AbstractC19074t.m100223u("binding");
            c29838ha3 = null;
        }
        RecyclerView recyclerView = c29838ha3.f138029u;
        C32589e c32589e = this.f76781e1;
        if (c32589e == null) {
            AbstractC19074t.m100223u("mAdapter");
            c32589e = null;
        }
        recyclerView.setAdapter(c32589e);
        C32589e c32589e2 = this.f76781e1;
        if (c32589e2 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c32589e2 = null;
        }
        c32589e2.m157726V(new C14865a());
        C29838ha c29838ha4 = this.f76779c1;
        if (c29838ha4 == null) {
            AbstractC19074t.m100223u("binding");
            c29838ha4 = null;
        }
        c29838ha4.f138025q.setOnClickListener(this);
        C29838ha c29838ha5 = this.f76779c1;
        if (c29838ha5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29838ha2 = c29838ha5;
        }
        c29838ha2.f138026r.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YL */
    public static final void m83363YL(C14874j c14874j, QuickMessageBottomSheet quickMessageBottomSheet, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(c14874j, "$a");
        AbstractC19074t.m100208f(quickMessageBottomSheet, "this$0");
        try {
            interfaceC17463d.dismiss();
            Object item = c14874j.getItem(i11);
            AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            Object obj = ((HashMap) item).get("id");
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue == AbstractC8020f0.str_edit) {
                quickMessageBottomSheet.m83361WL().m157741T();
            } else if (intValue == AbstractC8020f0.str_delete) {
                quickMessageBottomSheet.m83361WL().m157740S();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public static final void m83364ZL(QuickMessageBottomSheet quickMessageBottomSheet, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(quickMessageBottomSheet, "this$0");
        quickMessageBottomSheet.m83361WL().m157739R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public static final void m83365aM(QuickMessageBottomSheet quickMessageBottomSheet, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(quickMessageBottomSheet, "this$0");
        interfaceC17463d.dismiss();
        quickMessageBottomSheet.m83361WL().m157742U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public final void m83366bM(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                arrayList2.add(new C32589e.c((C32596l) obj, true, false, 4, null));
            }
            arrayList2.add(new C32589e.e(1));
        } else {
            arrayList2.add(new C32589e.e(3));
        }
        C32589e c32589e = this.f76781e1;
        C32589e c32589e2 = null;
        if (c32589e == null) {
            AbstractC19074t.m100223u("mAdapter");
            c32589e = null;
        }
        c32589e.m157725U(arrayList2);
        C32589e c32589e3 = this.f76781e1;
        if (c32589e3 == null) {
            AbstractC19074t.m100223u("mAdapter");
        } else {
            c32589e2 = c32589e3;
        }
        c32589e2.m10008p();
        C0697c0.Companion.m1054h(getTrackingKey(), "length", Integer.valueOf(arrayList.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cM */
    public final void m83367cM(C32590f.a aVar) {
        C24848g0 c24848g0;
        C17487o0 m92662fJ;
        Bundle bundle = new Bundle();
        Long m157752a = aVar.m157752a();
        if (m157752a != null) {
            bundle.putLong("EXTRA_QUICK_MESSAGE_ID", m157752a.longValue());
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null && C32600p.f150676a.m157895b(true)) {
            return;
        }
        bundle.putString("STR_SOURCE_START_VIEW", aVar.m157753b());
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null && (m92662fJ = m92650VI.m92662fJ()) != null) {
            m92662fJ.m93066i2(QuickMessageCreatingView.class, bundle, 0, 2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dM */
    public final void m83368dM(boolean z11) {
        C17487o0 m92662fJ;
        if (z11) {
            Bundle bundle = new Bundle();
            bundle.putString("STR_SOURCE_START_VIEW", "qm_csc_bottomsheet");
            ZaloView m92650VI = m92650VI();
            if (m92650VI != null && (m92662fJ = m92650VI.m92662fJ()) != null) {
                m92662fJ.m93066i2(QuickMessageListingFullView.class, bundle, 0, 2, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public final void m83369eM(long j11) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_QUICK_MESSAGE_ID", j11);
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public final void m83370fM(String str) {
        m92639EK(1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public final void m83371gM(boolean z11) {
        if (z11) {
            showDialog(0);
        }
    }

    /* renamed from: hM */
    private final void m83372hM() {
        if (this.f76782f1) {
            return;
        }
        this.f76782f1 = true;
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.ea0
            @Override // java.lang.Runnable
            public final void run() {
                QuickMessageBottomSheet.m83373iM(QuickMessageBottomSheet.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m83373iM(QuickMessageBottomSheet quickMessageBottomSheet) {
        FrameLayout frameLayout;
        int i11;
        AbstractC19074t.m100208f(quickMessageBottomSheet, "this$0");
        ZaloView m92650VI = quickMessageBottomSheet.m92650VI();
        AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.ZdsModalBottomSheet");
        View m87195jM = ((ZdsModalBottomSheet) m92650VI).m87195jM();
        C32589e c32589e = null;
        if (m87195jM instanceof FrameLayout) {
            frameLayout = (FrameLayout) m87195jM;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            C13309e c13309e = new C13309e(frameLayout);
            C29838ha c29838ha = quickMessageBottomSheet.f76779c1;
            if (c29838ha == null) {
                AbstractC19074t.m100223u("binding");
                c29838ha = null;
            }
            C26209i c26209i = new C26209i(c29838ha.f138026r);
            String m92652XI = quickMessageBottomSheet.m92652XI(AbstractC8020f0.str_quick_message_onboarding_create_button);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            WalkThroughOnboardView.C13302d c13302d = new WalkThroughOnboardView.C13302d("", m92652XI, c26209i, null, 8, null);
            c13302d.m74674n(4);
            c13309e.m74724b(c13302d);
            LinearLayoutManager linearLayoutManager = quickMessageBottomSheet.f76780d1;
            if (linearLayoutManager != null) {
                i11 = linearLayoutManager.m9737T1();
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                C29838ha c29838ha2 = quickMessageBottomSheet.f76779c1;
                if (c29838ha2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29838ha2 = null;
                }
                View childAt = c29838ha2.f138029u.getChildAt(i11);
                if (childAt != null) {
                    AbstractC19074t.m100205c(childAt);
                    C32589e c32589e2 = quickMessageBottomSheet.f76781e1;
                    if (c32589e2 == null) {
                        AbstractC19074t.m100223u("mAdapter");
                    } else {
                        c32589e = c32589e2;
                    }
                    if (c32589e.mo10005m(i11) == 0) {
                        C26209i c26209i2 = new C26209i(childAt);
                        String m92652XI2 = quickMessageBottomSheet.m92652XI(AbstractC8020f0.str_quick_message_onboarding_listitem);
                        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                        WalkThroughOnboardView.C13302d c13302d2 = new WalkThroughOnboardView.C13302d("", m92652XI2, c26209i2, null, 8, null);
                        c13302d2.m74674n(4);
                        c13309e.m74724b(c13302d2);
                    }
                }
            }
            c13309e.m74728g(new C14876l());
            c13309e.m74729h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public final void m83374jM(String str) {
        ToastUtils.showMess(str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m83361WL().m157736N().m9219j(this, new C14875k(new C14867c(this)));
        m83361WL().m157745X().m9219j(this, new C14875k(new C14868d(this)));
        m83361WL().m157746Y().m9219j(this, new C14875k(new C14869e(this)));
        m83361WL().m157750c0().m9219j(this, new C14875k(new C14870f(this)));
        m83361WL().m157749b0().m9219j(this, new C14875k(new C14871g(this)));
        m83361WL().m157751e0().m9219j(this, new C14875k(new C14872h(this)));
        m83361WL().m157748a0().m9219j(this, new C14875k(new C14873i(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return mo49769EJ(i11, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
            m43159h.m43162k(format).m43173v(3).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.delete), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.da0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    QuickMessageBottomSheet.m83365aM(QuickMessageBottomSheet.this, interfaceC17463d, i12);
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
        final C14874j c14874j = new C14874j(arrayList, this, getContext(), AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar2 = new C8009j.a(getContext());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_message_dialog_more_title));
        aVar2.m43155d(true);
        aVar2.m43153b(c14874j, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ba0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                QuickMessageBottomSheet.m83363YL(QuickMessageBottomSheet.C14874j.this, this, interfaceC17463d, i12);
            }
        });
        aVar2.m43167p(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.ca0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                QuickMessageBottomSheet.m83364ZL(QuickMessageBottomSheet.this, interfaceC17463d);
            }
        });
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29838ha c29838ha = this.f76779c1;
        if (c29838ha == null) {
            AbstractC19074t.m100223u("binding");
            c29838ha = null;
        }
        RecyclerView recyclerView = c29838ha.f138029u;
        AbstractC19074t.m100207e(recyclerView, "rvQuickMessageList");
        return recyclerView;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickMessageBottomSheetView";
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29838ha m148039c = C29838ha.m148039c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148039c, "inflate(...)");
        this.f76779c1 = m148039c;
        m83362XL();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: nL */
    public void mo66255nL() {
        super.mo66255nL();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("EXTRA_SHOW_ONBOARDING", false)) {
            m92642L3.remove("EXTRA_SHOW_ONBOARDING");
            m83372hM();
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_back) {
            close();
        } else if (id2 == AbstractC6918a0.btn_createnew) {
            m83361WL().m157737P("qm_csc_bottomsheet_button_create_bottom");
        }
        super.onClick(view);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && this.f76782f1) {
            m83360VL();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zview.ZaloView
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
