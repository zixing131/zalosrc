package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23278z2;
import org.json.JSONObject;
import p227i3.C20218v;
import p354n3.C23528a;
import p361nb.C23648e;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p495rx.C25988b;
import p495rx.C26009w;
import p495rx.C26010x;
import p588vw.C28644j;
import p588vw.C28652r;
import p649xl.C29770de;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import vg.C28020b3;

/* loaded from: classes6.dex */
public final class UnpinTopicPinBoardView extends AnimKeepBelowZaloView implements View.OnClickListener, C23744a.c, InterfaceC0733x {
    public static final C15218a Companion = new C15218a(null);

    /* renamed from: V0 */
    private C23528a f78520V0;

    /* renamed from: W0 */
    private C29770de f78521W0;

    /* renamed from: X0 */
    private C26009w f78522X0;

    /* renamed from: Y0 */
    private String f78523Y0 = "";

    /* renamed from: Z0 */
    private final InterfaceC24854k f78524Z0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C26010x.class), new C15229l(new C15228k(this)), new C15220c());

    /* renamed from: a1 */
    private String f78525a1;

    /* renamed from: b1 */
    private String f78526b1;

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$a */
    /* loaded from: classes6.dex */
    public static final class C15218a {
        private C15218a() {
        }

        public /* synthetic */ C15218a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$b */
    /* loaded from: classes6.dex */
    public static final class C15219b implements C26009w.a {
        C15219b() {
        }

        @Override // p495rx.C26009w.a
        /* renamed from: a */
        public void mo85518a(C25988b c25988b) {
            AbstractC19074t.m100208f(c25988b, "topicInfo");
            UnpinTopicPinBoardView.this.m85506JM().m134080q0(c25988b);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$c */
    /* loaded from: classes6.dex */
    static final class C15220c extends AbstractC19075u implements InterfaceC18494a {
        C15220c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            String str;
            Bundle m92642L3 = UnpinTopicPinBoardView.this.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("extra_conversation_id")) == null) {
                str = "";
            }
            return new C26010x.d(str);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$d */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15221d implements InterfaceC1764d0, InterfaceC19066n {
        C15221d() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a */
        public final void mo8524qp(ArrayList arrayList) {
            UnpinTopicPinBoardView.this.m85512PM(arrayList);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, UnpinTopicPinBoardView.this, UnpinTopicPinBoardView.class, "onPinBoardChanged", "onPinBoardChanged(Ljava/util/ArrayList;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15222e implements InterfaceC1764d0, InterfaceC19066n {
        C15222e() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a */
        public final void mo8524qp(C26010x.b bVar) {
            UnpinTopicPinBoardView.this.m85513QM(bVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, UnpinTopicPinBoardView.this, UnpinTopicPinBoardView.class, "showConfirmUnpinTopic", "showConfirmUnpinTopic(Lcom/zing/zalo/pinboard/UnpinTopicPinBoardViewModel$DialogConfirmUnpinTopicExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15223f implements InterfaceC1764d0, InterfaceC19066n {
        C15223f() {
        }

        /* renamed from: a */
        public final void m85522a(boolean z11) {
            UnpinTopicPinBoardView.this.m85509MM(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, UnpinTopicPinBoardView.this, UnpinTopicPinBoardView.class, "onChangeStateLoadingBtnDone", "onChangeStateLoadingBtnDone(Z)V", 0);
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
            m85522a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15224g implements InterfaceC1764d0, InterfaceC19066n {
        C15224g() {
        }

        /* renamed from: a */
        public final void m85523a(boolean z11) {
            UnpinTopicPinBoardView.this.m85515SM(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, UnpinTopicPinBoardView.this, UnpinTopicPinBoardView.class, "stateBtnDoneChanged", "stateBtnDoneChanged(Z)V", 0);
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
            m85523a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15225h implements InterfaceC1764d0, InterfaceC19066n {
        C15225h() {
        }

        /* renamed from: a */
        public final void m85524a(boolean z11) {
            UnpinTopicPinBoardView.this.m85505IM(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, UnpinTopicPinBoardView.this, UnpinTopicPinBoardView.class, "closeView", "closeView(Z)V", 0);
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
            m85524a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$i */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15226i implements InterfaceC1764d0, InterfaceC19066n {
        C15226i() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a */
        public final void mo8524qp(C7904b c7904b) {
            UnpinTopicPinBoardView.this.m85511OM(c7904b);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, UnpinTopicPinBoardView.this, UnpinTopicPinBoardView.class, "onPendingPinTopicChanged", "onPendingPinTopicChanged(Lcom/zing/zalo/control/GroupTopicInfo;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$j */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15227j implements InterfaceC1764d0, InterfaceC19066n {
        C15227j() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a */
        public final void mo8524qp(C26010x.c cVar) {
            AbstractC19074t.m100208f(cVar, "p0");
            UnpinTopicPinBoardView.this.m85514RM(cVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, UnpinTopicPinBoardView.this, UnpinTopicPinBoardView.class, "showEditView", "showEditView(Lcom/zing/zalo/pinboard/UnpinTopicPinBoardViewModel$ShowEditViewExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$k */
    /* loaded from: classes6.dex */
    public static final class C15228k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f78536q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15228k(ZaloView zaloView) {
            super(0);
            this.f78536q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f78536q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UnpinTopicPinBoardView$l */
    /* loaded from: classes6.dex */
    public static final class C15229l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f78537q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15229l(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f78537q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f78537q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: IM */
    public final void m85505IM(boolean z11) {
        if (z11) {
            mo50035CK(-1, null);
        }
        finish();
    }

    /* renamed from: JM */
    public final C26010x m85506JM() {
        return (C26010x) this.f78524Z0.getValue();
    }

    /* renamed from: KM */
    private final void m85507KM() {
        C29770de c29770de = this.f78521W0;
        C29770de c29770de2 = null;
        if (c29770de == null) {
            AbstractC19074t.m100223u("binding");
            c29770de = null;
        }
        ViewGroup.LayoutParams layoutParams = c29770de.f137587u.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = AbstractC17484n.Companion.m92931b() + AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height);
        C29770de c29770de3 = this.f78521W0;
        if (c29770de3 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de3 = null;
        }
        c29770de3.f137587u.setLayoutParams(layoutParams2);
        C29770de c29770de4 = this.f78521W0;
        if (c29770de4 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de4 = null;
        }
        RobotoTextView robotoTextView = c29770de4.f137580D;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unpin_topic_pin_board_view_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(m85506JM().m134071c0())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        this.f78522X0 = new C26009w(m92689tK, new C15219b());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        C29770de c29770de5 = this.f78521W0;
        if (c29770de5 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de5 = null;
        }
        c29770de5.f137591y.setLayoutManager(linearLayoutManager);
        C29770de c29770de6 = this.f78521W0;
        if (c29770de6 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de6 = null;
        }
        c29770de6.f137591y.setAdapter(this.f78522X0);
        C29770de c29770de7 = this.f78521W0;
        if (c29770de7 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de7 = null;
        }
        c29770de7.f137584r.setOnClickListener(this);
        C29770de c29770de8 = this.f78521W0;
        if (c29770de8 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de8 = null;
        }
        c29770de8.f137586t.setOnClickListener(this);
        C29770de c29770de9 = this.f78521W0;
        if (c29770de9 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29770de2 = c29770de9;
        }
        c29770de2.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.iv0
            public /* synthetic */ iv0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnpinTopicPinBoardView.m85508LM(UnpinTopicPinBoardView.this, view);
            }
        });
    }

    /* renamed from: LM */
    public static final void m85508LM(UnpinTopicPinBoardView unpinTopicPinBoardView, View view) {
        AbstractC19074t.m100208f(unpinTopicPinBoardView, "this$0");
        unpinTopicPinBoardView.finish();
    }

    /* renamed from: MM */
    public final void m85509MM(boolean z11) {
        C29770de c29770de = null;
        if (z11) {
            C29770de c29770de2 = this.f78521W0;
            if (c29770de2 == null) {
                AbstractC19074t.m100223u("binding");
                c29770de2 = null;
            }
            c29770de2.f137577A.setVisibility(0);
            C29770de c29770de3 = this.f78521W0;
            if (c29770de3 == null) {
                AbstractC19074t.m100223u("binding");
                c29770de3 = null;
            }
            c29770de3.f137586t.setText((CharSequence) null);
            C29770de c29770de4 = this.f78521W0;
            if (c29770de4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29770de = c29770de4;
            }
            c29770de.f137586t.setEnabled(false);
            return;
        }
        C29770de c29770de5 = this.f78521W0;
        if (c29770de5 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de5 = null;
        }
        c29770de5.f137577A.setVisibility(8);
        C29770de c29770de6 = this.f78521W0;
        if (c29770de6 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de6 = null;
        }
        c29770de6.f137586t.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_pin_topic));
        C29770de c29770de7 = this.f78521W0;
        if (c29770de7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29770de = c29770de7;
        }
        c29770de.f137586t.setEnabled(true);
    }

    /* renamed from: NM */
    public static final void m85510NM(UnpinTopicPinBoardView unpinTopicPinBoardView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(unpinTopicPinBoardView, "this$0");
        interfaceC17463d.dismiss();
        unpinTopicPinBoardView.m85506JM().m134081r0();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0106 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:6:0x000f, B:7:0x0017, B:14:0x0030, B:15:0x0084, B:17:0x0088, B:18:0x008c, B:25:0x009f, B:27:0x00a3, B:28:0x00a7, B:30:0x00ad, B:32:0x00b3, B:33:0x00bc, B:34:0x0119, B:36:0x011d, B:38:0x0121, B:39:0x0126, B:47:0x013d, B:48:0x0140, B:51:0x0145, B:53:0x0155, B:55:0x0174, B:57:0x017c, B:60:0x0181, B:62:0x0185, B:65:0x0195, B:67:0x019f, B:70:0x01a9, B:72:0x01bb, B:75:0x01c5, B:78:0x01c9, B:80:0x01cd, B:81:0x01d2, B:84:0x00b6, B:85:0x00c0, B:87:0x00c4, B:88:0x00c8, B:89:0x00da, B:91:0x00e2, B:93:0x00e6, B:94:0x00ea, B:95:0x00f2, B:97:0x00f6, B:98:0x00fa, B:99:0x0102, B:101:0x0106, B:102:0x010a, B:103:0x003b, B:104:0x0046, B:105:0x0051, B:106:0x005c, B:107:0x0067, B:109:0x006f, B:110:0x007a, B:111:0x01d8, B:113:0x01dc, B:114:0x01e1), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:6:0x000f, B:7:0x0017, B:14:0x0030, B:15:0x0084, B:17:0x0088, B:18:0x008c, B:25:0x009f, B:27:0x00a3, B:28:0x00a7, B:30:0x00ad, B:32:0x00b3, B:33:0x00bc, B:34:0x0119, B:36:0x011d, B:38:0x0121, B:39:0x0126, B:47:0x013d, B:48:0x0140, B:51:0x0145, B:53:0x0155, B:55:0x0174, B:57:0x017c, B:60:0x0181, B:62:0x0185, B:65:0x0195, B:67:0x019f, B:70:0x01a9, B:72:0x01bb, B:75:0x01c5, B:78:0x01c9, B:80:0x01cd, B:81:0x01d2, B:84:0x00b6, B:85:0x00c0, B:87:0x00c4, B:88:0x00c8, B:89:0x00da, B:91:0x00e2, B:93:0x00e6, B:94:0x00ea, B:95:0x00f2, B:97:0x00f6, B:98:0x00fa, B:99:0x0102, B:101:0x0106, B:102:0x010a, B:103:0x003b, B:104:0x0046, B:105:0x0051, B:106:0x005c, B:107:0x0067, B:109:0x006f, B:110:0x007a, B:111:0x01d8, B:113:0x01dc, B:114:0x01e1), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:6:0x000f, B:7:0x0017, B:14:0x0030, B:15:0x0084, B:17:0x0088, B:18:0x008c, B:25:0x009f, B:27:0x00a3, B:28:0x00a7, B:30:0x00ad, B:32:0x00b3, B:33:0x00bc, B:34:0x0119, B:36:0x011d, B:38:0x0121, B:39:0x0126, B:47:0x013d, B:48:0x0140, B:51:0x0145, B:53:0x0155, B:55:0x0174, B:57:0x017c, B:60:0x0181, B:62:0x0185, B:65:0x0195, B:67:0x019f, B:70:0x01a9, B:72:0x01bb, B:75:0x01c5, B:78:0x01c9, B:80:0x01cd, B:81:0x01d2, B:84:0x00b6, B:85:0x00c0, B:87:0x00c4, B:88:0x00c8, B:89:0x00da, B:91:0x00e2, B:93:0x00e6, B:94:0x00ea, B:95:0x00f2, B:97:0x00f6, B:98:0x00fa, B:99:0x0102, B:101:0x0106, B:102:0x010a, B:103:0x003b, B:104:0x0046, B:105:0x0051, B:106:0x005c, B:107:0x0067, B:109:0x006f, B:110:0x007a, B:111:0x01d8, B:113:0x01dc, B:114:0x01e1), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c9 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:6:0x000f, B:7:0x0017, B:14:0x0030, B:15:0x0084, B:17:0x0088, B:18:0x008c, B:25:0x009f, B:27:0x00a3, B:28:0x00a7, B:30:0x00ad, B:32:0x00b3, B:33:0x00bc, B:34:0x0119, B:36:0x011d, B:38:0x0121, B:39:0x0126, B:47:0x013d, B:48:0x0140, B:51:0x0145, B:53:0x0155, B:55:0x0174, B:57:0x017c, B:60:0x0181, B:62:0x0185, B:65:0x0195, B:67:0x019f, B:70:0x01a9, B:72:0x01bb, B:75:0x01c5, B:78:0x01c9, B:80:0x01cd, B:81:0x01d2, B:84:0x00b6, B:85:0x00c0, B:87:0x00c4, B:88:0x00c8, B:89:0x00da, B:91:0x00e2, B:93:0x00e6, B:94:0x00ea, B:95:0x00f2, B:97:0x00f6, B:98:0x00fa, B:99:0x0102, B:101:0x0106, B:102:0x010a, B:103:0x003b, B:104:0x0046, B:105:0x0051, B:106:0x005c, B:107:0x0067, B:109:0x006f, B:110:0x007a, B:111:0x01d8, B:113:0x01dc, B:114:0x01e1), top: B:2:0x0009 }] */
    /* renamed from: OM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m85511OM(C7904b c7904b) {
        Drawable m118665N;
        C29770de c29770de;
        int i11;
        C29770de c29770de2;
        String m118743r0;
        C29770de c29770de3 = null;
        try {
            if (c7904b != null) {
                C29770de c29770de4 = this.f78521W0;
                if (c29770de4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29770de4 = null;
                }
                c29770de4.f137592z.setVisibility(0);
                int i12 = c7904b.f42729a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4) {
                                    if (i12 != 5) {
                                        m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_default_pin);
                                    } else {
                                        m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_pinned_album);
                                    }
                                }
                            } else {
                                m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_poll_color);
                            }
                        } else {
                            m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_message);
                        }
                    } else {
                        m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_note);
                    }
                    c29770de = this.f78521W0;
                    if (c29770de == null) {
                        AbstractC19074t.m100223u("binding");
                        c29770de = null;
                    }
                    c29770de.f137590x.setImageDrawable(m118665N);
                    i11 = c7904b.f42729a;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3 && i11 != 4 && i11 != 5) {
                                    C29770de c29770de5 = this.f78521W0;
                                    if (c29770de5 == null) {
                                        AbstractC19074t.m100223u("binding");
                                        c29770de5 = null;
                                    }
                                    RobotoTextView robotoTextView = c29770de5.f137581E;
                                    String str = c7904b.f42736h;
                                    if (str != null && !TextUtils.isEmpty(str)) {
                                        m118743r0 = c7904b.f42736h;
                                    } else {
                                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unsupported_pin_title);
                                    }
                                    robotoTextView.setText(m118743r0);
                                }
                            } else {
                                C29770de c29770de6 = this.f78521W0;
                                if (c29770de6 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29770de6 = null;
                                }
                                c29770de6.f137581E.setText(C28652r.m143349v().m143357H(c7904b.m40773k()));
                            }
                        } else if (TextUtils.isEmpty(c7904b.f42716D)) {
                            C29770de c29770de7 = this.f78521W0;
                            if (c29770de7 == null) {
                                AbstractC19074t.m100223u("binding");
                                c29770de7 = null;
                            }
                            c29770de7.f137581E.setText(c7904b.f42736h);
                        } else {
                            C29770de c29770de8 = this.f78521W0;
                            if (c29770de8 == null) {
                                AbstractC19074t.m100223u("binding");
                                c29770de8 = null;
                            }
                            c29770de8.f137581E.setText(c7904b.f42716D);
                        }
                        if (c7904b.f42729a == 2) {
                            C29770de c29770de9 = this.f78521W0;
                            if (c29770de9 == null) {
                                AbstractC19074t.m100223u("binding");
                            } else {
                                c29770de3 = c29770de9;
                            }
                            RecyclingImageView recyclingImageView = c29770de3.f137579C;
                            AbstractC19074t.m100207e(recyclingImageView, "thumbImage");
                            int i13 = c7904b.f42746r;
                            if (i13 != 1) {
                                if (i13 != 32 && i13 != 44 && i13 != 49) {
                                    switch (i13) {
                                        case 36:
                                            recyclingImageView.setVisibility(0);
                                            recyclingImageView.setImageResource(AbstractC16803z.no_image2);
                                            if (!TextUtils.isEmpty(c7904b.f42749u)) {
                                                C25630b m143282P0 = C28644j.m143233Y().m143282P0(new C25630b(new JSONObject(c7904b.f42749u)));
                                                AbstractC19074t.m100207e(m143282P0, "prepareStickerInfo(...)");
                                                if (m143282P0.m132448z()) {
                                                    Bitmap m141206w = C28020b3.f130648a.m141206w(m143282P0);
                                                    if (m141206w != null) {
                                                        recyclingImageView.setImageBitmap(m141206w);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                C23528a c23528a = this.f78520V0;
                                                if (c23528a != null) {
                                                    C28020b3.m141166H(C28020b3.f130648a, recyclingImageView, c23528a, m143282P0, null, false, null, 28, null);
                                                    return;
                                                }
                                                return;
                                            }
                                            String m40766d = c7904b.m40766d();
                                            if (!TextUtils.isEmpty(m40766d)) {
                                                AbstractC23268y2.m120031e(this.f78520V0, recyclingImageView, m40766d, C23278z2.m120122e());
                                                return;
                                            }
                                            return;
                                        case 37:
                                        case 38:
                                            break;
                                        default:
                                            recyclingImageView.setVisibility(8);
                                            return;
                                    }
                                }
                                recyclingImageView.setVisibility(0);
                                recyclingImageView.setImageResource(AbstractC16803z.no_image2);
                                String m40766d2 = c7904b.m40766d();
                                if (!TextUtils.isEmpty(m40766d2)) {
                                    AbstractC23268y2.m120031e(this.f78520V0, recyclingImageView, m40766d2, C23278z2.m120122e());
                                    return;
                                }
                                return;
                            }
                            recyclingImageView.setVisibility(8);
                            return;
                        }
                        C29770de c29770de10 = this.f78521W0;
                        if (c29770de10 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c29770de3 = c29770de10;
                        }
                        c29770de3.f137579C.setVisibility(8);
                        return;
                    }
                    c29770de2 = this.f78521W0;
                    if (c29770de2 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29770de2 = null;
                    }
                    c29770de2.f137581E.setText(C28652r.m143349v().m143357H(c7904b.f42754z));
                    if (c7904b.f42729a == 2) {
                    }
                }
                if (c7904b.f42732d > 0) {
                    m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_reminder);
                } else {
                    m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_note);
                }
                c29770de = this.f78521W0;
                if (c29770de == null) {
                }
                c29770de.f137590x.setImageDrawable(m118665N);
                i11 = c7904b.f42729a;
                if (i11 != 0) {
                }
                c29770de2 = this.f78521W0;
                if (c29770de2 == null) {
                }
                c29770de2.f137581E.setText(C28652r.m143349v().m143357H(c7904b.f42754z));
                if (c7904b.f42729a == 2) {
                }
            } else {
                C29770de c29770de11 = this.f78521W0;
                if (c29770de11 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29770de3 = c29770de11;
                }
                c29770de3.f137592z.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: PM */
    public final void m85512PM(ArrayList arrayList) {
        C29770de c29770de = null;
        if (arrayList != null && arrayList.size() > 0) {
            C29770de c29770de2 = this.f78521W0;
            if (c29770de2 == null) {
                AbstractC19074t.m100223u("binding");
                c29770de2 = null;
            }
            c29770de2.f137588v.setVisibility(8);
            C29770de c29770de3 = this.f78521W0;
            if (c29770de3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29770de = c29770de3;
            }
            c29770de.f137591y.setVisibility(0);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                arrayList2.add(new C26009w.c((C7904b) obj));
            }
            C26009w c26009w = this.f78522X0;
            AbstractC19074t.m100205c(c26009w);
            c26009w.m134041O(arrayList2);
            C26009w c26009w2 = this.f78522X0;
            AbstractC19074t.m100205c(c26009w2);
            c26009w2.m10008p();
            return;
        }
        C29770de c29770de4 = this.f78521W0;
        if (c29770de4 == null) {
            AbstractC19074t.m100223u("binding");
            c29770de4 = null;
        }
        c29770de4.f137588v.setVisibility(0);
        C29770de c29770de5 = this.f78521W0;
        if (c29770de5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29770de = c29770de5;
        }
        c29770de.f137591y.setVisibility(8);
    }

    /* renamed from: QM */
    public final void m85513QM(C26010x.b bVar) {
        String str;
        String str2 = null;
        if (bVar != null) {
            str = bVar.m134089b();
        } else {
            str = null;
        }
        this.f78525a1 = str;
        if (bVar != null) {
            str2 = bVar.m134088a();
        }
        this.f78526b1 = str2;
        showDialog(1);
    }

    /* renamed from: RM */
    public final void m85514RM(C26010x.c cVar) {
        if (AbstractC19074t.m100204b(this.f78523Y0, "csc_msgmenu")) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_conversation_id", cVar.m134090a());
            bundle.putString("STR_SOURCE_START_VIEW", cVar.m134091b());
            bundle.putBoolean("BOL_EXTRA_OPENED_AFTER_PIN", true);
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(EditPinBoardView.class, bundle, 2, true);
            }
        }
    }

    /* renamed from: SM */
    public final void m85515SM(boolean z11) {
        C29770de c29770de = this.f78521W0;
        if (c29770de == null) {
            AbstractC19074t.m100223u("binding");
            c29770de = null;
        }
        c29770de.f137586t.setEnabled(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f78520V0 = new C23528a(getContext());
        m85506JM().m134069a0().m9219j(this, new C15221d());
        m85506JM().m134084v0().m9219j(this, new C15222e());
        m85506JM().m134077m0().m9219j(this, new C15223f());
        m85506JM().m134074g0().m9219j(this, new C15224g());
        m85506JM().m134085w0().m9219j(this, new C15225h());
        m85506JM().m134072e0().m9219j(this, new C15226i());
        m85506JM().m134086x0().m9219j(this, new C15227j());
        m78097xM(3);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = null;
        C29770de c29770de = null;
        if (i11 == 1) {
            String str = this.f78525a1;
            String str2 = this.f78526b1;
            C29770de c29770de2 = this.f78521W0;
            if (c29770de2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29770de = c29770de2;
            }
            keyEventCallbackC17462c = AbstractC23089h6.m118434b(str, str2, c29770de.getRoot().getContext(), new InterfaceC17463d.b(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.jv0
                public /* synthetic */ jv0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    UnpinTopicPinBoardView.m85510NM(UnpinTopicPinBoardView.this, interfaceC17463d, i12);
                }
            });
        }
        AbstractC19074t.m100205c(keyEventCallbackC17462c);
        return keyEventCallbackC17462c;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29770de m147868c = C29770de.m147868c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147868c, "inflate(...)");
        this.f78521W0 = m147868c;
        m85507KM();
        C29770de c29770de = this.f78521W0;
        if (c29770de == null) {
            AbstractC19074t.m100223u("binding");
            c29770de = null;
        }
        FrameLayout root = c29770de.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
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
        return "UnpinTopicPinBoardView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_done) {
            m85506JM().m134078o0();
        } else if (id2 == AbstractC6918a0.btn_cancel) {
            m85506JM().m134079p0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView
    /* renamed from: uM */
    protected View mo78095uM() {
        C29770de c29770de = this.f78521W0;
        if (c29770de == null) {
            AbstractC19074t.m100223u("binding");
            c29770de = null;
        }
        RelativeLayout relativeLayout = c29770de.f137587u;
        AbstractC19074t.m100207e(relativeLayout, "container");
        return relativeLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView
    /* renamed from: vM */
    protected View mo78096vM() {
        C29770de c29770de = this.f78521W0;
        if (c29770de == null) {
            AbstractC19074t.m100223u("binding");
            c29770de = null;
        }
        FrameLayout root = c29770de.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        m85506JM().m134076i0(i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("extra_group_topic_info_json");
            if (string != null && string.length() != 0) {
                m85506JM().m134082t0(new C7904b(new JSONObject(string), m85506JM().m134070b0()));
            }
            String string2 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f78523Y0 = string2;
            m85506JM().m134083u0(this.f78523Y0);
            C0815e1.m2075D().m2100V(new C23648e(3, this.f78523Y0, 1, "pinboard_max", m85506JM().m134068Y(), C0815e1.m2075D().m2125z(m85506JM().m134068Y(), AbstractC25495a.m132088m(m92642L3.getString("extra_conversation_id", "")))), false);
        }
        C29770de c29770de = this.f78521W0;
        if (c29770de == null) {
            AbstractC19074t.m100223u("binding");
            c29770de = null;
        }
        c29770de.f137588v.setText(m85506JM().m134075h0());
    }
}
