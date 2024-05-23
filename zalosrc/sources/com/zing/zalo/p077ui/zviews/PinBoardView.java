package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2335a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7041d5;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.RecyclerViewWithMaxHeight;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.AbstractC16768f;
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
import ge.C19411c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import p227i3.C20218v;
import p361nb.C23648e;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p495rx.C26003q;
import p495rx.C26004r;
import p649xl.C29855i9;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import sa0.C26203c;
import sa0.EnumC26202b;
import vg.AbstractC28025b8;
import vg.C28212v6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class PinBoardView extends AnimKeepBelowZaloView implements View.OnClickListener, C23744a.c, InterfaceC0733x {
    public static final C14738a Companion = new C14738a(null);

    /* renamed from: V0 */
    private final InterfaceC24854k f75967V0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C26003q.class), new C14759v(new C14758u(this)), new C14739b());

    /* renamed from: W0 */
    public C29855i9 f75968W0;

    /* renamed from: X0 */
    private C7041d5 f75969X0;

    /* renamed from: Y0 */
    private C13306b f75970Y0;

    /* renamed from: Z0 */
    private ShowcaseView f75971Z0;

    /* renamed from: a1 */
    private String f75972a1;

    /* renamed from: b1 */
    private String f75973b1;

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$a */
    /* loaded from: classes6.dex */
    public static final class C14738a {
        private C14738a() {
        }

        public /* synthetic */ C14738a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$b */
    /* loaded from: classes6.dex */
    static final class C14739b extends AbstractC19075u implements InterfaceC18494a {
        C14739b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            String str;
            Bundle m92642L3 = PinBoardView.this.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("extra_conversation_id")) == null) {
                str = "";
            }
            return new C26004r(str);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$c */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14740c implements InterfaceC1764d0, InterfaceC19066n {
        C14740c() {
        }

        /* renamed from: a */
        public final void m82726a(boolean z11) {
            PinBoardView.this.m82673GN(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "showMissingTopicJumpMsgDialog", "showMissingTopicJumpMsgDialog(Z)V", 0);
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
            m82726a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$d */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14741d implements InterfaceC1764d0, InterfaceC19066n {
        C14741d() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(MessageId messageId) {
            AbstractC19074t.m100208f(messageId, "p0");
            PinBoardView.this.m82697dN(messageId);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "closeToChatAndJumpToMsg", "closeToChatAndJumpToMsg(Lcom/zing/zalo/data/entity/chat/message/MessageId;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14742e implements InterfaceC1764d0, InterfaceC19066n {
        C14742e() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C26003q.f fVar) {
            AbstractC19074t.m100208f(fVar, "p0");
            PinBoardView.this.m82664BN(fVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "openPinMessageDetail", "openPinMessageDetail(Lcom/zing/zalo/pinboard/PinBoardViewModel$OpenMessageDetailExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14743f implements InterfaceC1764d0, InterfaceC19066n {
        C14743f() {
        }

        /* renamed from: a */
        public final void m82729a(boolean z11) {
            PinBoardView.this.m82667DN(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "setShowEditPinBoardBtn", "setShowEditPinBoardBtn(Z)V", 0);
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
            m82729a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14744g implements InterfaceC1764d0, InterfaceC19066n {
        C14744g() {
        }

        /* renamed from: a */
        public final void m82730a(boolean z11) {
            PinBoardView.this.m82671FN(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "showDialogMoreAction", "showDialogMoreAction(Z)V", 0);
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
            m82730a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14745h implements InterfaceC1764d0, InterfaceC19066n {
        C14745h() {
        }

        /* renamed from: a */
        public final void m82731a(boolean z11) {
            PinBoardView.this.m82698eN(z11);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "collapsePinBoard", "collapsePinBoard(Z)V", 0);
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
            m82731a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$i */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14746i implements InterfaceC1764d0, InterfaceC19066n {
        C14746i() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C26003q.a aVar) {
            AbstractC19074t.m100208f(aVar, "p0");
            PinBoardView.this.m82669EN(aVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "showConfirmUnpinTopic", "showConfirmUnpinTopic(Lcom/zing/zalo/pinboard/PinBoardViewModel$DialogConfirmUnpinTopicExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$j */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14747j implements InterfaceC1764d0, InterfaceC19066n {
        C14747j() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C26003q.b bVar) {
            AbstractC19074t.m100208f(bVar, "p0");
            PinBoardView.this.m82712uN(bVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "openDetailCollection", "openDetailCollection(Lcom/zing/zalo/pinboard/PinBoardViewModel$OpenDetailCollectionExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$k */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14748k implements InterfaceC1764d0, InterfaceC19066n {
        C14748k() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C26003q.g gVar) {
            AbstractC19074t.m100208f(gVar, "p0");
            PinBoardView.this.m82695bN(gVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "checkShowTipWithDelay", "checkShowTipWithDelay(Lcom/zing/zalo/pinboard/PinBoardViewModel$ShowTipExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$l */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14749l implements InterfaceC1764d0, InterfaceC19066n {
        C14749l() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C19411c c19411c) {
            PinBoardView.this.m82710sN(c19411c);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "onUpcomingEventChanged", "onUpcomingEventChanged(Lcom/zing/zalo/calendar/models/CalendarEvent;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$m */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14750m implements InterfaceC1764d0, InterfaceC19066n {
        C14750m() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(ArrayList arrayList) {
            PinBoardView.this.m82709rN(arrayList);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "onPinBoardDataChanged", "onPinBoardDataChanged(Ljava/util/ArrayList;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$n */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14751n implements InterfaceC1764d0, InterfaceC19066n {
        C14751n() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(String str) {
            AbstractC19074t.m100208f(str, "p0");
            PinBoardView.this.m82714wN(str);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "openGroupBoard", "openGroupBoard(Ljava/lang/String;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$o */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14752o implements InterfaceC1764d0, InterfaceC19066n {
        C14752o() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(String str) {
            AbstractC19074t.m100208f(str, "p0");
            PinBoardView.this.m82715xN(str);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "openGroupCalendar", "openGroupCalendar(Ljava/lang/String;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$p */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14753p implements InterfaceC1764d0, InterfaceC19066n {
        C14753p() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C26003q.c cVar) {
            AbstractC19074t.m100208f(cVar, "p0");
            PinBoardView.this.m82713vN(cVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "openEditPinBoard", "openEditPinBoard(Lcom/zing/zalo/pinboard/PinBoardViewModel$OpenEditPinBoardExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$q */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14754q implements InterfaceC1764d0, InterfaceC19066n {
        C14754q() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C26003q.e eVar) {
            AbstractC19074t.m100208f(eVar, "p0");
            PinBoardView.this.m82662AN(eVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "openGroupPostDetailView", "openGroupPostDetailView(Lcom/zing/zalo/pinboard/PinBoardViewModel$OpenGroupPostDetailExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$r */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14755r implements InterfaceC1764d0, InterfaceC19066n {
        C14755r() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(C26003q.d dVar) {
            AbstractC19074t.m100208f(dVar, "p0");
            PinBoardView.this.m82719zN(dVar);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "openGroupPollVotingView", "openGroupPollVotingView(Lcom/zing/zalo/pinboard/PinBoardViewModel$OpenGroupPollDetailExtra;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$s */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14756s implements InterfaceC1764d0, InterfaceC19066n {
        C14756s() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(String str) {
            AbstractC19074t.m100208f(str, "p0");
            PinBoardView.this.m82717yN(str);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "openGroupEventDetailView", "openGroupEventDetailView(Ljava/lang/String;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$t */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14757t implements InterfaceC1764d0, InterfaceC19066n {
        C14757t() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void mo8524qp(String str) {
            AbstractC19074t.m100208f(str, "p0");
            PinBoardView.this.m82678JN(str);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(1, PinBoardView.this, PinBoardView.class, "showToast", "showToast(Ljava/lang/String;)V", 0);
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

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$u */
    /* loaded from: classes6.dex */
    public static final class C14758u extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f75993q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14758u(ZaloView zaloView) {
            super(0);
            this.f75993q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f75993q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PinBoardView$v */
    /* loaded from: classes6.dex */
    public static final class C14759v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f75994q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14759v(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f75994q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f75994q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public final void m82662AN(C26003q.e eVar) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("extra_topic_id", eVar.m134028b());
            bundle.putString("extra_group_id", eVar.m134027a());
            bundle.putBoolean("extra_shortcut_groupboard", true);
            bundle.putString("STR_SOURCE_START_VIEW", "csc_pinboard_full");
            m92693xK().m93069k2(GroupPostDetailViewV2.class, bundle, 1, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public final void m82664BN(C26003q.f fVar) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_board_gen_id", fVar.m134029a());
        bundle.putString("extra_group_id", fVar.m134030b());
        bundle.putBoolean("extra_shortcut_groupboard", false);
        m92693xK().m93069k2(PinMessageDetailView.class, bundle, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public final void m82667DN(boolean z11) {
        if (z11) {
            m82723gN().f138165u.setVisibility(0);
        } else {
            m82723gN().f138165u.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public final void m82669EN(C26003q.a aVar) {
        this.f75972a1 = aVar.m134022b();
        this.f75973b1 = aVar.m134021a();
        showDialog(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public final void m82671FN(boolean z11) {
        if (z11) {
            showDialog(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public final void m82673GN(boolean z11) {
        if (z11) {
            showDialog(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public static final void m82676IN(PinBoardView pinBoardView, C28212v6 c28212v6, ShowcaseView showcaseView, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        if (showcaseView == pinBoardView.f75971Z0) {
            pinBoardView.f75971Z0 = null;
        }
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public final void m82678JN(String str) {
        ToastUtils.showMess(str);
    }

    /* renamed from: aN */
    private final void m82694aN(final String str, long j11) {
        if (m82700hN().m134007j0()) {
            this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.k50
                @Override // java.lang.Runnable
                public final void run() {
                    PinBoardView.m82696cN(PinBoardView.this, str);
                }
            }, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public final void m82695bN(C26003q.g gVar) {
        m82694aN(gVar.m134032b(), gVar.m134031a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public static final void m82696cN(PinBoardView pinBoardView, String str) {
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        AbstractC19074t.m100208f(str, "$tipCat");
        pinBoardView.m82722ZM(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public final void m82697dN(MessageId messageId) {
        Intent intent = new Intent();
        intent.putExtra("extra_msg_id", messageId);
        mo50035CK(AbstractC2335a.f9831a, intent);
        m82698eN(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public final void m82698eN(boolean z11) {
        if (z11) {
            finish();
        }
    }

    /* renamed from: fN */
    private final void m82699fN(boolean z11) {
        m82723gN().f138166v.setText(m82700hN().m134003e0());
        if (z11) {
            m82723gN().f138162r.setVisibility(0);
            m82723gN().f138161q.setVisibility(0);
        } else {
            m82723gN().f138162r.setVisibility(8);
            m82723gN().f138161q.setVisibility(8);
        }
    }

    /* renamed from: hN */
    private final C26003q m82700hN() {
        return (C26003q) this.f75967V0.getValue();
    }

    /* renamed from: jN */
    private final void m82701jN() {
        m82723gN().f138164t.setOnClickListener(this);
        m82723gN().f138162r.setOnClickListener(this);
        m82723gN().f138161q.setOnClickListener(this);
        m82723gN().f138168x.setLayoutManager(new LinearLayoutManager(getContext()));
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        this.f75969X0 = new C7041d5(m92689tK);
        RecyclerViewWithMaxHeight recyclerViewWithMaxHeight = m82723gN().f138168x;
        C7041d5 c7041d5 = this.f75969X0;
        if (c7041d5 == null) {
            AbstractC19074t.m100223u("mPinboardAdapter");
            c7041d5 = null;
        }
        recyclerViewWithMaxHeight.setAdapter(c7041d5);
        C31784b.m152808a(m82723gN().f138168x).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.d50
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                PinBoardView.m82702kN(PinBoardView.this, recyclerView, i11, view);
            }
        });
        C31784b.m152808a(m82723gN().f138168x).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.e50
            @Override // zc0.C31784b.e
            /* renamed from: T3 */
            public final boolean mo81113T3(RecyclerView recyclerView, int i11, View view) {
                boolean m82703lN;
                m82703lN = PinBoardView.m82703lN(PinBoardView.this, recyclerView, i11, view);
                return m82703lN;
            }
        });
        m82723gN().f138165u.setOnClickListener(this);
        m82700hN().m133990P();
        m82723gN().f138163s.setOnClickListener(this);
        if (m82700hN().m134006i0()) {
            m82723gN().f138161q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_community_board));
            m82723gN().f138162r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_community_calendar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public static final void m82702kN(PinBoardView pinBoardView, RecyclerView recyclerView, int i11, View view) {
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        C7041d5 c7041d5 = pinBoardView.f75969X0;
        C7041d5 c7041d52 = null;
        if (c7041d5 == null) {
            AbstractC19074t.m100223u("mPinboardAdapter");
            c7041d5 = null;
        }
        C7041d5.a m35958L = c7041d5.m35958L(i11);
        C7041d5 c7041d53 = pinBoardView.f75969X0;
        if (c7041d53 == null) {
            AbstractC19074t.m100223u("mPinboardAdapter");
        } else {
            c7041d52 = c7041d53;
        }
        if (c7041d52.mo10005m(i11) == 0 && (m35958L instanceof C7041d5.b)) {
            pinBoardView.m82700hN().m134014t0(((C7041d5.b) m35958L).m35961b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public static final boolean m82703lN(PinBoardView pinBoardView, RecyclerView recyclerView, int i11, View view) {
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        C7041d5 c7041d5 = pinBoardView.f75969X0;
        C7041d5 c7041d52 = null;
        if (c7041d5 == null) {
            AbstractC19074t.m100223u("mPinboardAdapter");
            c7041d5 = null;
        }
        C7041d5.a m35958L = c7041d5.m35958L(i11);
        C7041d5 c7041d53 = pinBoardView.f75969X0;
        if (c7041d53 == null) {
            AbstractC19074t.m100223u("mPinboardAdapter");
        } else {
            c7041d52 = c7041d53;
        }
        if (c7041d52.mo10005m(i11) == 0 && (m35958L instanceof C7041d5.b)) {
            pinBoardView.m82700hN().m134018x0(((C7041d5.b) m35958L).m35961b());
            return true;
        }
        return false;
    }

    /* renamed from: mN */
    private final boolean m82704mN() {
        if (m92649TI().m92996E0("CHAT_DIALOG_VIEW_203") != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final void m82705nN(PinBoardView pinBoardView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        interfaceC17463d.dismiss();
        pinBoardView.m82700hN().m134016v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public static final void m82706oN(SimpleAdapter simpleAdapter, PinBoardView pinBoardView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        try {
            interfaceC17463d.dismiss();
            Object item = simpleAdapter.getItem(i11);
            AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
            Object obj = ((HashMap) item).get("id");
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue == AbstractC8020f0.str_entry_dialog_more_action_unpin_pin_topic) {
                pinBoardView.m82700hN().m134010m0();
            } else if (intValue == AbstractC8020f0.str_entry_dialog_more_action_reorder_pin_topic) {
                pinBoardView.m82700hN().m134009l0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m82707pN(PinBoardView pinBoardView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        pinBoardView.m82700hN().m134008k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public static final void m82708qN(PinBoardView pinBoardView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        interfaceC17463d.dismiss();
        pinBoardView.m82700hN().m134017w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public final void m82709rN(ArrayList arrayList) {
        m82700hN().m134019y0(AbstractC23160o0.m119186C0());
        if (arrayList != null && arrayList.size() > 0) {
            m82723gN().f138166v.setVisibility(8);
            m82723gN().f138168x.setVisibility(0);
            ArrayList arrayList2 = new ArrayList();
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = arrayList.get(i11);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    arrayList2.add(new C7041d5.b((C7904b) obj));
                }
            }
            C7041d5 c7041d5 = this.f75969X0;
            C7041d5 c7041d52 = null;
            if (c7041d5 == null) {
                AbstractC19074t.m100223u("mPinboardAdapter");
                c7041d5 = null;
            }
            c7041d5.m35959M(arrayList2);
            C7041d5 c7041d53 = this.f75969X0;
            if (c7041d53 == null) {
                AbstractC19074t.m100223u("mPinboardAdapter");
            } else {
                c7041d52 = c7041d53;
            }
            c7041d52.m10008p();
            return;
        }
        m82723gN().f138166v.setVisibility(0);
        m82723gN().f138168x.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public final void m82710sN(final C19411c c19411c) {
        if (c19411c != null) {
            m82723gN().f138167w.setVisibility(8);
            m82723gN().f138159B.setVisibility(0);
            m82723gN().f138159B.m75847a(c19411c);
            m82723gN().f138159B.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.f50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinBoardView.m82711tN(PinBoardView.this, c19411c, view);
                }
            });
            return;
        }
        m82723gN().f138167w.setVisibility(0);
        m82723gN().f138159B.setVisibility(8);
        m82723gN().f138159B.setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public static final void m82711tN(PinBoardView pinBoardView, C19411c c19411c, View view) {
        AbstractC19074t.m100208f(pinBoardView, "this$0");
        C26003q m82700hN = pinBoardView.m82700hN();
        String str = c19411c.f96261a;
        AbstractC19074t.m100207e(str, "eventId");
        m82700hN.m134015u0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public final void m82712uN(C26003q.b bVar) {
        ToastUtils.m89266n(AbstractC8020f0.str_feature_disabled, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public final void m82713vN(C26003q.c cVar) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", cVar.m134023a());
        bundle.putString("STR_SOURCE_START_VIEW", cVar.m134024b());
        m92693xK().m93069k2(EditPinBoardView.class, bundle, 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public final void m82714wN(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putString("STR_SOURCE_START_VIEW", "csc_pinboard_full");
        bundle.putBoolean("EXTRA_IS_COMMUNITY", m82700hN().m134006i0());
        m92693xK().m93069k2(GroupBoardView.class, bundle, 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public final void m82715xN(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putString("STR_SOURCE_START_VIEW", "csc_pinboard_full");
        bundle.putString("STR_LOG_CHAT_TYPE", "2");
        bundle.putBoolean("EXTRA_IS_COMMUNITY", m82700hN().m134006i0());
        m92693xK().m93069k2(GroupCalendarView.class, bundle, 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public final void m82717yN(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_event_id", str);
        bundle.putBoolean("extra_shortcut_calendar", true);
        bundle.putString("STR_SOURCE_START_VIEW", "csc_pinboard_full");
        m92693xK().m93069k2(GroupEventDetailView.class, bundle, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public final void m82719zN(C26003q.d dVar) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_poll_id", dVar.m134026b());
        bundle.putString("extra_group_id", dVar.m134025a());
        bundle.putBoolean("extra_shortcut_groupboard", true);
        bundle.putBoolean("extra_show_vote_detail", false);
        bundle.putString("STR_SOURCE_START_VIEW", "csc_pinboard_full");
        m92693xK().m93069k2(GroupPollVotingView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m82700hN().m134004f0().m9219j(this, new C14749l());
        m82700hN().m133994U().m9219j(this, new C14750m());
        m82700hN().m133998Y().m9219j(this, new C14751n());
        m82700hN().m133997X().m9219j(this, new C14752o());
        m82700hN().m133996W().m9219j(this, new C14753p());
        m82700hN().m133985C0().m9219j(this, new C14754q());
        m82700hN().m133984B0().m9219j(this, new C14755r());
        m82700hN().m133983A0().m9219j(this, new C14756s());
        m82700hN().m134002c0().m9219j(this, new C14757t());
        m82700hN().m134001b0().m9219j(this, new C14740c());
        m82700hN().m133992R().m9219j(this, new C14741d());
        m82700hN().m133999Z().m9219j(this, new C14742e());
        m82700hN().m133986D0().m9219j(this, new C14743f());
        m82700hN().m133988F0().m9219j(this, new C14744g());
        m82700hN().m133993S().m9219j(this, new C14745h());
        m82700hN().m133987E0().m9219j(this, new C14746i());
        m82700hN().m134020z0().m9219j(this, new C14747j());
        m82700hN().m133989G0().m9219j(this, new C14748k());
        m78097xM(1);
        this.f75970Y0 = new C13306b(this.f72421L0.getContext());
    }

    /* renamed from: CN */
    public final void m82720CN(C29855i9 c29855i9) {
        AbstractC19074t.m100208f(c29855i9, "<set-?>");
        this.f75968W0 = c29855i9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        String str;
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return AbstractC23089h6.m118434b(this.f75972a1, this.f75973b1, m82723gN().getRoot().getContext(), new InterfaceC17463d.b(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.j50
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                        PinBoardView.m82708qN(PinBoardView.this, interfaceC17463d, i13);
                    }
                });
            }
            ArrayList arrayList = new ArrayList();
            HashMap m119451i = AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_entry_dialog_more_action_unpin_pin_topic), AbstractC8020f0.str_entry_dialog_more_action_unpin_pin_topic);
            AbstractC19074t.m100207e(m119451i, "getNewEntry(...)");
            arrayList.add(m119451i);
            HashMap m119451i2 = AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_entry_dialog_more_action_reorder_pin_topic), AbstractC8020f0.str_entry_dialog_more_action_reorder_pin_topic);
            AbstractC19074t.m100207e(m119451i2, "getNewEntry(...)");
            arrayList.add(m119451i2);
            final SimpleAdapter simpleAdapter = new SimpleAdapter(getContext(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar = new C8009j.a(getContext());
            aVar.m43155d(true);
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.h50
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                    PinBoardView.m82706oN(simpleAdapter, this, interfaceC17463d, i13);
                }
            });
            aVar.m43167p(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.i50
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    PinBoardView.m82707pN(PinBoardView.this, interfaceC17463d);
                }
            });
            C8009j m43152a = aVar.m43152a();
            Bundle m92642L3 = m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("extra_conversation_id")) == null) {
                str = "";
            }
            C0815e1.m2075D().m2100V(new C23648e(3, "csc_pinboard_full", 1, "pinboard_item_menu", m82700hN().m133991Q(), C0815e1.m2075D().m2125z(m82700hN().m133991Q(), AbstractC25495a.m132088m(str))), false);
            return m43152a;
        }
        C8009j.a aVar2 = new C8009j.a(getContext());
        C8009j.a m43172u = aVar2.m43172u(m92652XI(AbstractC8020f0.str_reply_msg_not_found));
        if (m82700hN().m134006i0()) {
            i12 = AbstractC8020f0.f43844xff7bcf46;
        } else {
            i12 = AbstractC8020f0.str_confirm_open_pin_msg_detail_from_not_found_pin_msg_title;
        }
        m43172u.m43162k(m92652XI(i12)).m43165n(m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_media_store_view_confirm), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.g50
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                PinBoardView.m82705nN(PinBoardView.this, interfaceC17463d, i13);
            }
        });
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29855i9 m148077c = C29855i9.m148077c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148077c, "inflate(...)");
        m82720CN(m148077c);
        m82701jN();
        LinearLayout root = m82723gN().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: HN */
    public final boolean m82721HN(final C28212v6 c28212v6, View view) {
        C28212v6.a aVar;
        if (c28212v6 != null && c28212v6.f131579e) {
            if ((c28212v6.m142166e() || ((aVar = c28212v6.f131584j) != null && aVar.m142172a())) && view != null && view.isShown()) {
                String m142164c = c28212v6.m142164c();
                C26203c m134769a = C26203c.m134769a(view.getContext());
                m134769a.m134770b(c28212v6, view.getContext());
                m134769a.f124524o = view;
                if (AbstractC19074t.m100204b(m142164c, "tip.pinboard.edit")) {
                    m134769a.f124507D = EnumC26202b.BOTTOM;
                    m134769a.f124513d = -AbstractC23136l9.m118742r(2.0f);
                }
                ShowcaseView showcaseView = new ShowcaseView(view.getContext());
                showcaseView.setConfigs(m134769a);
                showcaseView.setShowcaseId(m142164c);
                C13306b c13306b = this.f75970Y0;
                if (c13306b == null) {
                    AbstractC19074t.m100223u("mShowcaseManager");
                    c13306b = null;
                }
                showcaseView.setShowcaseManager(c13306b);
                showcaseView.setOnShowcaseFinishedListener(new ShowcaseView.InterfaceC13298d() { // from class: com.zing.zalo.ui.zviews.l50
                    @Override // com.zing.zalo.p077ui.showcase.ShowcaseView.InterfaceC13298d
                    /* renamed from: a */
                    public final void mo39159a(ShowcaseView showcaseView2, int i11, int i12, boolean z11) {
                        PinBoardView.m82676IN(PinBoardView.this, c28212v6, showcaseView2, i11, i12, z11);
                    }
                });
                showcaseView.m74637r();
                this.f75971Z0 = showcaseView;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: TL */
    protected List mo78192TL() {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(3050, 27, 44);
        return m131506n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        m82694aN("tip.pinboard.edit", 100L);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        AbstractC16768f.m89489a(view).m89427V(-16777216);
        AbstractC16768f.m89489a(view).m89426U(Boolean.FALSE);
    }

    /* renamed from: ZM */
    public final void m82722ZM(String str) {
        String str2;
        boolean m131390w;
        if (!this.f72421L0.m92672lJ() || !m92687sJ()) {
            return;
        }
        ShowcaseView showcaseView = this.f75971Z0;
        if (showcaseView != null) {
            AbstractC19074t.m100205c(showcaseView);
            if (showcaseView.getParent() != null) {
                return;
            }
        }
        if (m82704mN()) {
            return;
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 == null || (str2 = m92642L3.getString("extra_conversation_id")) == null) {
            str2 = "";
        }
        ArrayList m141458n = AbstractC28025b8.m141458n(AbstractC28025b8.f130834K, AbstractC25495a.m132088m(str2));
        AbstractC19074t.m100207e(m141458n, "getPromoteNotiInfoList(...)");
        if (m141458n.size() == 0) {
            return;
        }
        int size = m141458n.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            if (!z11) {
                try {
                    Object obj = m141458n.get(i11);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    C28212v6 c28212v6 = (C28212v6) obj;
                    String m142164c = c28212v6.m142164c();
                    if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, m142164c)) {
                        String[] strArr = AbstractC28025b8.f130834K;
                        AbstractC19074t.m100207e(strArr, "ARR_PIN_BOARD_TIPS");
                        m131390w = AbstractC25358n.m131390w(strArr, m142164c);
                        if (m131390w) {
                            AbstractC19074t.m100205c(m142164c);
                            View m82724iN = m82724iN(m142164c);
                            if (m82724iN != null && m82724iN.isShown()) {
                                z11 = m82721HN(c28212v6, m82724iN);
                            }
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: gN */
    public final C29855i9 m82723gN() {
        C29855i9 c29855i9 = this.f75968W0;
        if (c29855i9 != null) {
            return c29855i9;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PinBoardView";
    }

    /* renamed from: iN */
    public final View m82724iN(String str) {
        AbstractC19074t.m100208f(str, "tipCat");
        if (AbstractC19074t.m100204b(str, "tip.pinboard.edit")) {
            return m82723gN().f138165u;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.action_open_group_calendar) {
            m82700hN().m134013p0();
            return;
        }
        if (id2 == AbstractC6918a0.action_open_group_board) {
            m82700hN().m134012o0();
            return;
        }
        if (id2 == AbstractC6918a0.edit_pinboard_btn) {
            m82700hN().m134011n0();
            return;
        }
        if (id2 == AbstractC6918a0.container) {
            C0815e1.m2075D().m2100V(new C23648e(3, "csc_pinboard_full", 0, "pinboard_close_blank", m82700hN().m133991Q()), false);
            m82698eN(true);
        } else if (id2 == AbstractC6918a0.collapse_btn) {
            C0815e1.m2075D().m2100V(new C23648e(3, "csc_pinboard_full", 0, "pinboard_close_button", m82700hN().m133991Q()), false);
            m82698eN(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView
    /* renamed from: uM */
    protected View mo78095uM() {
        LinearLayout linearLayout = m82723gN().f138169y;
        AbstractC19074t.m100207e(linearLayout, "mainLayout");
        return linearLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView
    /* renamed from: vM */
    protected View mo78096vM() {
        LinearLayout linearLayout = m82723gN().f138164t;
        AbstractC19074t.m100207e(linearLayout, "container");
        return linearLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        m82700hN().m134005g0(i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.zviews.AnimKeepBelowZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        super.mo37135xJ(bundle);
        C13306b c13306b = this.f75970Y0;
        if (c13306b == null) {
            AbstractC19074t.m100223u("mShowcaseManager");
            c13306b = null;
        }
        View m92656bJ = m92656bJ();
        AbstractC19074t.m100206d(m92656bJ, "null cannot be cast to non-null type android.view.ViewGroup");
        c13306b.m74687C((ViewGroup) m92656bJ);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            String m133991Q = m82700hN().m133991Q();
            int hashCode = m133991Q.hashCode();
            String str2 = "pinboard_full";
            if (hashCode != 49) {
                if (hashCode != 50) {
                    if (hashCode == 52 && m133991Q.equals("4")) {
                        str = "pinboard_full_ft";
                        str2 = str;
                    }
                } else {
                    m133991Q.equals("2");
                }
                C0815e1.m2075D().m2100V(new C23648e(3, string, 1, str2, m82700hN().m133991Q()), false);
            } else {
                if (m133991Q.equals("1")) {
                    str = "pinboard_full_11";
                    str2 = str;
                }
                C0815e1.m2075D().m2100V(new C23648e(3, string, 1, str2, m82700hN().m133991Q()), false);
            }
        }
        m82699fN(m82700hN().m134007j0());
    }
}
