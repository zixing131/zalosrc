package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.AbstractC1438d;
import androidx.lifecycle.InterfaceC1801w;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.RecyclerView;
import b20.C2497c;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.CtaItem;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.data.remote.common.CommentInvalidException;
import com.zing.zalo.shortvideo.data.remote.common.LockCommentException;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.data.remote.common.NotKycException;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.CommentIdentitiesBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.CommentUserBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c;
import com.zing.zalo.shortvideo.p072ui.receiver.CommentReceiver;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.view.CommentLayout;
import com.zing.zalo.shortvideo.p072ui.view.CommentView;
import com.zing.zalo.shortvideo.p072ui.view.SearchVideoChannelView;
import com.zing.zalo.shortvideo.p072ui.widget.CommentBox;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.ListClickableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.utils.other.CommentSource;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import i20.C20196i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m20.InterfaceC22809w;
import mj0.AbstractC23322a;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C24993c1;
import q20.C25084g;
import q20.C25097t;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import s20.AbstractC26112n;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import z10.C31168i;

/* loaded from: classes5.dex */
public final class CommentView extends AbstractC10623a implements InterfaceC22809w {
    public static final C10180c Companion = new C10180c(null);

    /* renamed from: B0 */
    private final InterfaceC10055c f52671B0;

    /* renamed from: C0 */
    private C20196i f52672C0;

    /* renamed from: D0 */
    private CommentReceiver f52673D0;

    /* renamed from: E0 */
    private C31168i f52674E0;

    /* renamed from: F0 */
    private boolean f52675F0;

    /* renamed from: G0 */
    private boolean f52676G0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10178a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10178a f52677y = new C10178a();

        C10178a() {
            super(3, C24993c1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchLayoutCommentBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54169h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24993c1 m54169h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24993c1.m129776c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10179b {
        /* renamed from: E3 */
        boolean mo54170E3(InterfaceC18494a interfaceC18494a);

        /* renamed from: Jn */
        void mo54171Jn();

        /* renamed from: Pt */
        void mo54172Pt();

        /* renamed from: fh */
        void mo54173fh();

        /* renamed from: gr */
        void mo54174gr(boolean z11);

        /* renamed from: qa */
        void mo54175qa(String str);

        /* renamed from: ye */
        void mo54176ye();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$c */
    /* loaded from: classes5.dex */
    public static final class C10180c {
        private C10180c() {
        }

        public /* synthetic */ C10180c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m54177a(CommentSource commentSource, String str, String str2, int i11, String str3, String str4, String str5, Integer num, Integer num2, boolean z11) {
            AbstractC19074t.m100208f(commentSource, "cmtSource");
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("CMT_SOURCE", commentSource), AbstractC24866w.m129235a("COMMENT_ID", str), AbstractC24866w.m129235a("PARENT_CMT_ID", str2), AbstractC24866w.m129235a("INPUT_TYPE", Integer.valueOf(i11)), AbstractC24866w.m129235a("FOOTER_COMMENT", str3), AbstractC24866w.m129235a("AD_ID", str4), AbstractC24866w.m129235a("AD_SOURCE", str5), AbstractC24866w.m129235a("AD_INDEX", num), AbstractC24866w.m129235a("AD_DISPLAYED_COUNT", num2), AbstractC24866w.m129235a("EXPAND_DESC", Boolean.valueOf(z11)));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$d */
    /* loaded from: classes5.dex */
    static final class C10181d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24993c1 f52678q;

        /* renamed from: r */
        final /* synthetic */ CommentView f52679r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10181d(C24993c1 c24993c1, CommentView commentView) {
            super(0);
            this.f52678q = c24993c1;
            this.f52679r = commentView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54178a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54178a() {
            this.f52678q.f119814v.m55786j();
            InterfaceC10055c.a.m53672a(this.f52679r.f52671B0, null, null, 3, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$e */
    /* loaded from: classes5.dex */
    static final class C10182e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24993c1 f52680q;

        /* renamed from: r */
        final /* synthetic */ CommentView f52681r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10182e(C24993c1 c24993c1, CommentView commentView) {
            super(0);
            this.f52680q = c24993c1;
            this.f52681r = commentView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54179a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54179a() {
            this.f52680q.f119814v.m55786j();
            InterfaceC10055c.a.m53672a(this.f52681r.f52671B0, null, null, 3, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$f */
    /* loaded from: classes5.dex */
    public static final class C10183f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Section f52683r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10183f(Section section) {
            super(0);
            this.f52683r = section;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54180a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54180a() {
            CommentView.this.mo54168xn(this.f52683r);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$g */
    /* loaded from: classes5.dex */
    public static final class RunnableC10184g implements Runnable {

        /* renamed from: p */
        final /* synthetic */ CommentBox f52684p;

        /* renamed from: q */
        final /* synthetic */ Integer f52685q;

        RunnableC10184g(CommentBox commentBox, Integer num) {
            this.f52684p = commentBox;
            this.f52685q = num;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:            if (r1.intValue() == 1) goto L28;     */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z11;
            if (!this.f52684p.getIdentityInfo().m50858h()) {
                CommentBox commentBox = this.f52684p;
                Integer num = this.f52685q;
                if (num != null) {
                    z11 = true;
                }
                z11 = false;
                if (!commentBox.m55695Q(z11)) {
                    this.f52684p.post(this);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$h */
    /* loaded from: classes5.dex */
    static final class C10185h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f52687r;

        /* renamed from: s */
        final /* synthetic */ ConfirmPopupView f52688s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10185h(String str, ConfirmPopupView confirmPopupView) {
            super(0);
            this.f52687r = str;
            this.f52688s = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54181a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54181a() {
            Map m131401f;
            CommentView.this.m54132Bt(this.f52687r);
            String m92652XI = this.f52688s.m92652XI(AbstractC27413h.zch_action_key_ekyc_comment);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("ekyc_action", 2));
            c19205a.m100713L(m92652XI, m131401f);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$i */
    /* loaded from: classes5.dex */
    static final class C10186i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ConfirmPopupView f52689q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10186i(ConfirmPopupView confirmPopupView) {
            super(0);
            this.f52689q = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54182a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54182a() {
            Map m131401f;
            String m92652XI = this.f52689q.m92652XI(AbstractC27413h.zch_action_key_ekyc_comment);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("ekyc_action", 1));
            c19205a.m100713L(m92652XI, m131401f);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$j */
    /* loaded from: classes5.dex */
    public static final class C10187j implements OverScrollableRecyclerView.InterfaceC10832c {
        C10187j() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31168i c31168i = CommentView.this.f52674E0;
            if (c31168i != null) {
                c31168i.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$k */
    /* loaded from: classes5.dex */
    static final class C10188k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24993c1 f52691q;

        /* renamed from: r */
        final /* synthetic */ CommentView f52692r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10188k(C24993c1 c24993c1, CommentView commentView) {
            super(0);
            this.f52691q = c24993c1;
            this.f52692r = commentView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54183a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54183a() {
            this.f52691q.f119809q.m55703x();
            this.f52692r.m54149kL();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$l */
    /* loaded from: classes5.dex */
    public static final class C10189l extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ C24993c1 f52693a;

        /* renamed from: b */
        final /* synthetic */ CommentView f52694b;

        C10189l(C24993c1 c24993c1, CommentView commentView) {
            this.f52693a = c24993c1;
            this.f52694b = commentView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 1) {
                this.f52693a.f119809q.m55703x();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            this.f52694b.m54149kL();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$m */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10190m extends C19071q implements InterfaceC18494a {
        C10190m(Object obj) {
            super(0, obj, CommentView.class, "shouldShowFooterMessage", "shouldShowFooterMessage()Z", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h */
        public final Boolean mo12V4() {
            return Boolean.valueOf(((CommentView) this.f94922q).m54151nL());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$n */
    /* loaded from: classes5.dex */
    public static final class C10191n implements CommentBox.InterfaceC10658a {

        /* renamed from: b */
        final /* synthetic */ CommentBox f52696b;

        /* renamed from: c */
        final /* synthetic */ C24993c1 f52697c;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$n$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ C24993c1 f52698q;

            /* renamed from: r */
            final /* synthetic */ CommentView f52699r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C24993c1 c24993c1, CommentView commentView) {
                super(2);
                this.f52698q = c24993c1;
                this.f52699r = commentView;
            }

            /* renamed from: a */
            public final void m54194a(Video video, String str) {
                Map m131407l;
                AbstractC19074t.m100208f(video, "video");
                AbstractC19074t.m100208f(str, "kw");
                this.f52698q.f119809q.setAttachedVideo(video);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = this.f52699r.m92652XI(AbstractC27413h.zch_action_key_video_attach_select);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("search_kw", str), AbstractC24866w.m129235a("attached_video_id", video.m52911t()));
                c19205a.m100713L(m92652XI, m131407l);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m54194a((Video) obj, (String) obj2);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$n$b */
        /* loaded from: classes5.dex */
        public static final class b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ C24993c1 f52700p;

            /* renamed from: q */
            final /* synthetic */ boolean f52701q;

            /* renamed from: r */
            final /* synthetic */ Comment f52702r;

            /* renamed from: s */
            final /* synthetic */ CommentView f52703s;

            b(C24993c1 c24993c1, boolean z11, Comment comment, CommentView commentView) {
                this.f52700p = c24993c1;
                this.f52701q = z11;
                this.f52702r = comment;
                this.f52703s = commentView;
            }

            @Override // java.lang.Runnable
            public void run() {
                String m50839m;
                if (this.f52700p.f119809q.getKeyboardHeight() == 0 && !this.f52700p.f119809q.isLayoutRequested()) {
                    String str = null;
                    if (this.f52701q) {
                        Comment comment = this.f52702r;
                        if (comment != null && (m50839m = comment.m50839m()) != null) {
                            str = m50839m;
                        } else {
                            Comment comment2 = this.f52702r;
                            if (comment2 != null) {
                                str = comment2.m50833g();
                            }
                        }
                        if (str != null) {
                            this.f52703s.m54152oL(str);
                            return;
                        }
                        return;
                    }
                    CommentView.m54154qL(this.f52703s, false, 1, null);
                    return;
                }
                this.f52700p.f119809q.post(this);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$n$c */
        /* loaded from: classes5.dex */
        public static final class c implements CommentIdentitiesBottomSheet.InterfaceC9503a {

            /* renamed from: a */
            final /* synthetic */ CommentView f52704a;

            /* renamed from: b */
            final /* synthetic */ CommentIdentitiesBottomSheet f52705b;

            c(CommentView commentView, CommentIdentitiesBottomSheet commentIdentitiesBottomSheet) {
                this.f52704a = commentView;
                this.f52705b = commentIdentitiesBottomSheet;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentIdentitiesBottomSheet.InterfaceC9503a
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void mo51876a(int i11) {
                String m92652XI;
                String str;
                Map m131407l;
                CommentReceiver.Companion.m53712c(i11);
                String m56274g = this.f52704a.f52671B0.mo53126h().m56274g();
                if (m56274g != null) {
                    int hashCode = m56274g.hashCode();
                    if (hashCode != -507563187) {
                        if (hashCode != 596808987) {
                            if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                                m92652XI = this.f52705b.m92652XI(AbstractC27413h.zch_action_key_friend_switch_to_identity);
                            }
                        } else if (m56274g.equals("SOURCE_FOR_U")) {
                            m92652XI = this.f52705b.m92652XI(AbstractC27413h.zch_action_key_foru_switch_to_identity);
                        }
                    } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                        m92652XI = this.f52705b.m92652XI(AbstractC27413h.zch_action_key_following_switch_to_identity);
                    }
                    if (i11 != 1) {
                        str = C27417l.f129055a.m140378b().m51234g();
                    } else {
                        Channel m140377a = C27417l.f129055a.m140377a();
                        if (m140377a == null || (str = m140377a.m50769l()) == null) {
                            str = "";
                        }
                    }
                    C19205a c19205a = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("switch_to_type", Integer.valueOf(i11)), AbstractC24866w.m129235a("switch_to_id", str));
                    c19205a.m100713L(m92652XI, m131407l);
                }
                m92652XI = this.f52705b.m92652XI(AbstractC27413h.zch_action_key_player_switch_to_identity);
                if (i11 != 1) {
                }
                C19205a c19205a2 = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("switch_to_type", Integer.valueOf(i11)), AbstractC24866w.m129235a("switch_to_id", str));
                c19205a2.m100713L(m92652XI, m131407l);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$n$d */
        /* loaded from: classes5.dex */
        static final class d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CommentBox f52706q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(CommentBox commentBox) {
                super(0);
                this.f52706q = commentBox;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54195a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54195a() {
                if (!this.f52706q.getIdentityInfo().m50858h()) {
                    this.f52706q.m55700Z();
                }
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$n$e */
        /* loaded from: classes5.dex */
        static final class e extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CommentBox f52707q;

            /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$n$e$a */
            /* loaded from: classes5.dex */
            public static final class a implements Runnable {

                /* renamed from: p */
                final /* synthetic */ CommentBox f52708p;

                a(CommentBox commentBox) {
                    this.f52708p = commentBox;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (!this.f52708p.getIdentityInfo().m50858h() && !this.f52708p.m55701a0()) {
                        this.f52708p.post(this);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(CommentBox commentBox) {
                super(0);
                this.f52707q = commentBox;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54196a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54196a() {
                CommentBox commentBox = this.f52707q;
                commentBox.post(new a(commentBox));
            }
        }

        C10191n(CommentBox commentBox, C24993c1 c24993c1) {
            this.f52696b = commentBox;
            this.f52697c = c24993c1;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0270  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0277  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x027e  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x028d  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x029c  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01a9  */
        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo54185a(Comment.Identity identity, String str, boolean z11, Comment comment, Video video) {
            String str2;
            String m50833g;
            boolean z12;
            Comment comment2;
            String m56274g;
            String m92652XI;
            String string;
            String string2;
            Integer valueOf;
            Integer valueOf2;
            String str3;
            Map m131408m;
            Comment.Identity m50838l;
            String m50854d;
            Comment.Identity m50838l2;
            Comment.Identity m50838l3;
            AbstractC19074t.m100208f(identity, "identity");
            AbstractC19074t.m100208f(str, "content");
            boolean z13 = (AbstractC19074t.m100204b(this.f52697c.f119809q.getIdentityInfo().m50854d(), (comment == null || (m50838l3 = comment.m50838l()) == null) ? null : m50838l3.m50854d()) && this.f52697c.f119809q.getIdentityInfo().m50856f() == comment.m50838l().m50856f()) ? false : true;
            boolean z14 = (comment != null ? comment.m50833g() : null) != null;
            InterfaceC10055c interfaceC10055c = CommentView.this.f52671B0;
            String valueOf3 = String.valueOf(System.currentTimeMillis());
            String m56271d = CommentView.this.f52671B0.mo53126h().m56271d();
            Comment.Identity m50838l4 = (!z13 || comment == null) ? null : comment.m50838l();
            if (comment == null || (m50833g = comment.m50839m()) == null) {
                if (comment == null) {
                    str2 = null;
                    z12 = z14;
                    Comment comment3 = new Comment(valueOf3, identity, m56271d, m50838l4, str, (String) null, false, false, 0L, 0L, str2, (Comment) null, (Section) null, System.currentTimeMillis(), (String) null, (Integer) 1, (List) null, video, (Boolean) null, 351200, (AbstractC19060k) null);
                    CommentView commentView = CommentView.this;
                    if (!z12) {
                        C31168i c31168i = commentView.f52674E0;
                        comment2 = comment3;
                        if (c31168i != null) {
                            c31168i.m151673F0(comment2);
                        }
                    } else {
                        comment2 = comment3;
                        C31168i c31168i2 = commentView.f52674E0;
                        if (c31168i2 != null) {
                            c31168i2.m151668A0(comment2);
                        }
                    }
                    interfaceC10055c.mo53121Ct(comment2, z12, false);
                    C24993c1 c24993c1 = this.f52697c;
                    c24993c1.f119809q.post(new b(c24993c1, z12, comment, CommentView.this));
                    this.f52697c.f119814v.m55780b();
                    CommentSource mo53126h = CommentView.this.f52671B0.mo53126h();
                    m56274g = mo53126h.m56274g();
                    if (m56274g != null) {
                        int hashCode = m56274g.hashCode();
                        if (hashCode != -507563187) {
                            if (hashCode != 596808987) {
                                if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                                    m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_friend_send_comment);
                                }
                            } else if (m56274g.equals("SOURCE_FOR_U")) {
                                m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_for_u_send_comment);
                            }
                        } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                            m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_following_send_comment);
                        }
                        Bundle m92642L3 = CommentView.this.m92642L3();
                        string = m92642L3 != null ? m92642L3.getString("AD_ID") : null;
                        Bundle m92642L32 = CommentView.this.m92642L3();
                        string2 = m92642L32 != null ? m92642L32.getString("AD_SOURCE") : null;
                        Bundle m92642L33 = CommentView.this.m92642L3();
                        valueOf = m92642L33 != null ? Integer.valueOf(m92642L33.getInt("AD_INDEX")) : null;
                        Bundle m92642L34 = CommentView.this.m92642L3();
                        valueOf2 = m92642L34 != null ? Integer.valueOf(m92642L34.getInt("AD_DISPLAYED_COUNT")) : null;
                        C24860q[] c24860qArr = new C24860q[9];
                        c24860qArr[0] = AbstractC24866w.m129235a("comment_identity", Integer.valueOf(identity.m50856f()));
                        c24860qArr[1] = AbstractC24866w.m129235a("comment_content", str);
                        c24860qArr[2] = AbstractC24866w.m129235a("video_id", mo53126h.m56271d());
                        c24860qArr[3] = AbstractC24866w.m129235a("comment_count", Integer.valueOf(mo53126h.m56269b()));
                        str3 = "0";
                        if ((comment != null || (r9 = comment.m50839m()) == null) && (comment == null || (r9 = comment.m50833g()) == null)) {
                            String str4 = "0";
                        }
                        c24860qArr[4] = AbstractC24866w.m129235a("parent_comment_id", str4);
                        c24860qArr[5] = AbstractC24866w.m129235a("tagged_type", Integer.valueOf((comment != null || (m50838l2 = comment.m50838l()) == null) ? 0 : m50838l2.m50856f()));
                        if (comment != null && (m50838l = comment.m50838l()) != null && (m50854d = m50838l.m50854d()) != null) {
                            str3 = m50854d;
                        }
                        c24860qArr[6] = AbstractC24866w.m129235a("tagged_id", str3);
                        c24860qArr[7] = AbstractC24866w.m129235a("is_with_emoji", Integer.valueOf(z11 ? 1 : 0));
                        if (video != null || (r1 = video.m52911t()) == null) {
                            String str5 = "";
                        }
                        c24860qArr[8] = AbstractC24866w.m129235a("attached_video_id", str5);
                        m131408m = AbstractC25363p0.m131408m(c24860qArr);
                        if (string != null) {
                            m131408m.put("ad_id", string);
                        }
                        if (string2 != null) {
                            m131408m.put("ad_src", string2);
                        }
                        if (valueOf != null) {
                            m131408m.put("ad_index", Integer.valueOf(valueOf.intValue()));
                        }
                        if (valueOf2 != null) {
                            m131408m.put("num_showed_ad", Integer.valueOf(valueOf2.intValue()));
                        }
                        if ((string == null && string.length() != 0) || (string2 != null && string2.length() != 0)) {
                            C19205a c19205a = C19205a.f95429a;
                            AbstractC19074t.m100205c(m92652XI);
                            c19205a.m100715O(m92652XI, m131408m);
                        } else {
                            C19205a c19205a2 = C19205a.f95429a;
                            AbstractC19074t.m100205c(m92652XI);
                            c19205a2.m100713L(m92652XI, m131408m);
                        }
                        C19205a.f95429a.m100706B();
                    }
                    m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_player_send_comment);
                    Bundle m92642L35 = CommentView.this.m92642L3();
                    if (m92642L35 != null) {
                    }
                    Bundle m92642L322 = CommentView.this.m92642L3();
                    if (m92642L322 != null) {
                    }
                    Bundle m92642L332 = CommentView.this.m92642L3();
                    if (m92642L332 != null) {
                    }
                    Bundle m92642L342 = CommentView.this.m92642L3();
                    if (m92642L342 != null) {
                    }
                    C24860q[] c24860qArr2 = new C24860q[9];
                    c24860qArr2[0] = AbstractC24866w.m129235a("comment_identity", Integer.valueOf(identity.m50856f()));
                    c24860qArr2[1] = AbstractC24866w.m129235a("comment_content", str);
                    c24860qArr2[2] = AbstractC24866w.m129235a("video_id", mo53126h.m56271d());
                    c24860qArr2[3] = AbstractC24866w.m129235a("comment_count", Integer.valueOf(mo53126h.m56269b()));
                    str3 = "0";
                    if (comment != null) {
                    }
                    String str42 = "0";
                    c24860qArr2[4] = AbstractC24866w.m129235a("parent_comment_id", str42);
                    c24860qArr2[5] = AbstractC24866w.m129235a("tagged_type", Integer.valueOf((comment != null || (m50838l2 = comment.m50838l()) == null) ? 0 : m50838l2.m50856f()));
                    if (comment != null) {
                        str3 = m50854d;
                    }
                    c24860qArr2[6] = AbstractC24866w.m129235a("tagged_id", str3);
                    c24860qArr2[7] = AbstractC24866w.m129235a("is_with_emoji", Integer.valueOf(z11 ? 1 : 0));
                    if (video != null) {
                    }
                    String str52 = "";
                    c24860qArr2[8] = AbstractC24866w.m129235a("attached_video_id", str52);
                    m131408m = AbstractC25363p0.m131408m(c24860qArr2);
                    if (string != null) {
                    }
                    if (string2 != null) {
                    }
                    if (valueOf != null) {
                    }
                    if (valueOf2 != null) {
                    }
                    if (string == null) {
                    }
                    C19205a c19205a22 = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    c19205a22.m100713L(m92652XI, m131408m);
                    C19205a.f95429a.m100706B();
                }
                m50833g = comment.m50833g();
            }
            str2 = m50833g;
            z12 = z14;
            Comment comment32 = new Comment(valueOf3, identity, m56271d, m50838l4, str, (String) null, false, false, 0L, 0L, str2, (Comment) null, (Section) null, System.currentTimeMillis(), (String) null, (Integer) 1, (List) null, video, (Boolean) null, 351200, (AbstractC19060k) null);
            CommentView commentView2 = CommentView.this;
            if (!z12) {
            }
            interfaceC10055c.mo53121Ct(comment2, z12, false);
            C24993c1 c24993c12 = this.f52697c;
            c24993c12.f119809q.post(new b(c24993c12, z12, comment, CommentView.this));
            this.f52697c.f119814v.m55780b();
            CommentSource mo53126h2 = CommentView.this.f52671B0.mo53126h();
            m56274g = mo53126h2.m56274g();
            if (m56274g != null) {
            }
            m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_player_send_comment);
            Bundle m92642L352 = CommentView.this.m92642L3();
            if (m92642L352 != null) {
            }
            Bundle m92642L3222 = CommentView.this.m92642L3();
            if (m92642L3222 != null) {
            }
            Bundle m92642L3322 = CommentView.this.m92642L3();
            if (m92642L3322 != null) {
            }
            Bundle m92642L3422 = CommentView.this.m92642L3();
            if (m92642L3422 != null) {
            }
            C24860q[] c24860qArr22 = new C24860q[9];
            c24860qArr22[0] = AbstractC24866w.m129235a("comment_identity", Integer.valueOf(identity.m50856f()));
            c24860qArr22[1] = AbstractC24866w.m129235a("comment_content", str);
            c24860qArr22[2] = AbstractC24866w.m129235a("video_id", mo53126h2.m56271d());
            c24860qArr22[3] = AbstractC24866w.m129235a("comment_count", Integer.valueOf(mo53126h2.m56269b()));
            str3 = "0";
            if (comment != null) {
            }
            String str422 = "0";
            c24860qArr22[4] = AbstractC24866w.m129235a("parent_comment_id", str422);
            c24860qArr22[5] = AbstractC24866w.m129235a("tagged_type", Integer.valueOf((comment != null || (m50838l2 = comment.m50838l()) == null) ? 0 : m50838l2.m50856f()));
            if (comment != null) {
            }
            c24860qArr22[6] = AbstractC24866w.m129235a("tagged_id", str3);
            c24860qArr22[7] = AbstractC24866w.m129235a("is_with_emoji", Integer.valueOf(z11 ? 1 : 0));
            if (video != null) {
            }
            String str522 = "";
            c24860qArr22[8] = AbstractC24866w.m129235a("attached_video_id", str522);
            m131408m = AbstractC25363p0.m131408m(c24860qArr22);
            if (string != null) {
            }
            if (string2 != null) {
            }
            if (valueOf != null) {
            }
            if (valueOf2 != null) {
            }
            if (string == null) {
            }
            C19205a c19205a222 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a222.m100713L(m92652XI, m131408m);
            C19205a.f95429a.m100706B();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: b */
        public void mo54186b(boolean z11) {
            int i11;
            Map m131401f;
            if (!z11) {
                CommentView.this.m54150lL(false);
            } else {
                this.f52697c.f119812t.m9866X1();
                CommentView.this.m54150lL(true);
            }
            C19205a c19205a = C19205a.f95429a;
            CommentView commentView = CommentView.this;
            String m56274g = commentView.f52671B0.mo53126h().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_toggle_emoji;
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        i11 = AbstractC27413h.zch_action_key_foru_toggle_emoji;
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    i11 = AbstractC27413h.zch_action_key_following_toggle_emoji;
                }
                String m92652XI = commentView.m92652XI(i11);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("change_to", Integer.valueOf(z11 ? 1 : 0)));
                c19205a.m100713L(m92652XI, m131401f);
            }
            i11 = AbstractC27413h.zch_action_key_player_toggle_emoji;
            String m92652XI2 = commentView.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("change_to", Integer.valueOf(z11 ? 1 : 0)));
            c19205a.m100713L(m92652XI2, m131401f);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: c */
        public void mo54187c(String str) {
            int i11;
            Map m131407l;
            AbstractC19074t.m100208f(str, "emoji");
            C19205a c19205a = C19205a.f95429a;
            CommentView commentView = CommentView.this;
            String m56274g = commentView.f52671B0.mo53126h().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_recent_emoji;
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        i11 = AbstractC27413h.zch_action_key_foru_recent_emoji;
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    i11 = AbstractC27413h.zch_action_key_following_recent_emoji;
                }
                String m92652XI = commentView.m92652XI(i11);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", CommentView.this.f52671B0.mo53126h().m56271d()), AbstractC24866w.m129235a("emoji", str));
                c19205a.m100713L(m92652XI, m131407l);
            }
            i11 = AbstractC27413h.zch_action_key_player_recent_emoji;
            String m92652XI2 = commentView.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", CommentView.this.f52671B0.mo53126h().m56271d()), AbstractC24866w.m129235a("emoji", str));
            c19205a.m100713L(m92652XI2, m131407l);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: d */
        public void mo54188d(int i11, int i12) {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: e */
        public void mo54189e() {
            String m92652XI;
            CommentView commentView = CommentView.this;
            commentView.m55551QK(SearchVideoChannelView.C10409b.m54860b(SearchVideoChannelView.Companion, null, new a(this.f52697c, commentView), 1, null));
            String m56274g = CommentView.this.f52671B0.mo53126h().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_friend_video_attach);
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_foru_video_attach);
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_following_video_attach);
                }
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            }
            m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_player_video_attach);
            C19205a c19205a2 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            C19205a.m100675M(c19205a2, m92652XI, null, 2, null);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: f */
        public C17487o0 mo54190f() {
            return CommentView.this.m92662fJ();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: g */
        public InterfaceC27218a mo54191g() {
            return CommentView.this.m92676n2();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: h */
        public void mo54192h(String str) {
            int i11;
            Map m131407l;
            AbstractC19074t.m100208f(str, "emoji");
            C19205a c19205a = C19205a.f95429a;
            CommentView commentView = CommentView.this;
            String m56274g = commentView.f52671B0.mo53126h().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_select_emoji;
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        i11 = AbstractC27413h.zch_action_key_foru_select_emoji;
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    i11 = AbstractC27413h.zch_action_key_following_select_emoji;
                }
                String m92652XI = commentView.m92652XI(i11);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", CommentView.this.f52671B0.mo53126h().m56271d()), AbstractC24866w.m129235a("emoji", str));
                c19205a.m100713L(m92652XI, m131407l);
            }
            i11 = AbstractC27413h.zch_action_key_player_select_emoji;
            String m92652XI2 = commentView.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", CommentView.this.f52671B0.mo53126h().m56271d()), AbstractC24866w.m129235a("emoji", str));
            c19205a.m100713L(m92652XI2, m131407l);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: i */
        public void mo54193i(Comment.Identity identity) {
            String m92652XI;
            Map m131401f;
            AbstractC19074t.m100208f(identity, "currentIdentity");
            CommentIdentitiesBottomSheet m51877a = CommentIdentitiesBottomSheet.Companion.m51877a(identity.m50856f());
            CommentBox commentBox = this.f52696b;
            m51877a.m51875mL(new c(CommentView.this, m51877a));
            if (commentBox.m55692C()) {
                m51877a.m51755ZK(new d(commentBox));
            }
            if (commentBox.m55693D()) {
                m51877a.m51755ZK(new e(commentBox));
            }
            m51877a.m51757bL(true);
            BaseBottomSheetView.m51747hL(m51877a, CommentView.this.m54148jL(), null, 2, null);
            String m56274g = CommentView.this.f52671B0.mo53126h().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_friend_switch_identity);
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_foru_switch_identity);
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_following_switch_identity);
                }
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("current_identity_type", Integer.valueOf(identity.m50856f())));
                c19205a.m100713L(m92652XI, m131401f);
            }
            m92652XI = CommentView.this.m92652XI(AbstractC27413h.zch_action_key_player_switch_identity);
            C19205a c19205a2 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("current_identity_type", Integer.valueOf(identity.m50856f())));
            c19205a2.m100713L(m92652XI, m131401f);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$o */
    /* loaded from: classes5.dex */
    public static final class C10192o implements CommentLayout.InterfaceC10177a {
        C10192o() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.CommentLayout.InterfaceC10177a
        /* renamed from: a */
        public void mo54130a() {
            InterfaceC10179b interfaceC10179b;
            InterfaceC1801w m92650VI = CommentView.this.m92650VI();
            if (m92650VI instanceof InterfaceC10179b) {
                interfaceC10179b = (InterfaceC10179b) m92650VI;
            } else {
                interfaceC10179b = null;
            }
            if (interfaceC10179b != null) {
                interfaceC10179b.mo54176ye();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.CommentLayout.InterfaceC10177a
        /* renamed from: b */
        public void mo54131b() {
            InterfaceC10179b interfaceC10179b;
            InterfaceC1801w m92650VI = CommentView.this.m92650VI();
            if (m92650VI instanceof InterfaceC10179b) {
                interfaceC10179b = (InterfaceC10179b) m92650VI;
            } else {
                interfaceC10179b = null;
            }
            if (interfaceC10179b != null) {
                interfaceC10179b.mo54172Pt();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$p */
    /* loaded from: classes5.dex */
    static final class C10193p extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C24993c1 f52711r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10193p(C24993c1 c24993c1) {
            super(2);
            this.f52711r = c24993c1;
        }

        /* renamed from: a */
        public final void m54197a(int i11, float f11) {
            if (CommentView.this.f52675F0) {
                CommentView.this.f52675F0 = false;
                if (i11 == 0) {
                    CommentBox commentBox = this.f52711r.f119809q;
                    AbstractC19074t.m100207e(commentBox, "boxComment");
                    CommentBox.m55666W(commentBox, i11, f11, false, 4, null);
                }
            } else {
                CommentBox commentBox2 = this.f52711r.f119809q;
                AbstractC19074t.m100207e(commentBox2, "boxComment");
                CommentBox.m55666W(commentBox2, i11, f11, false, 4, null);
            }
            if (i11 > 0 && f11 == 1.0f) {
                AbstractC28684a.Companion.m143681o().mo146340o(i11);
                this.f52711r.f119812t.m9866X1();
            }
            CommentView.this.m54150lL(this.f52711r.f119809q.m55694E());
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54197a(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$q */
    /* loaded from: classes5.dex */
    static final class C10194q extends AbstractC19075u implements InterfaceC18510q {
        C10194q() {
            super(3);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m54198a((String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54198a(String str, String str2, boolean z11) {
            C31168i c31168i;
            AbstractC19074t.m100208f(str, "sourceId");
            AbstractC19074t.m100208f(str2, "commentId");
            if (AbstractC19074t.m100204b(CommentView.this.f52671B0.mo53126h().m56271d(), str) && (c31168i = CommentView.this.f52674E0) != null) {
                c31168i.m151670C0(str2, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$r */
    /* loaded from: classes5.dex */
    static final class C10195r extends AbstractC19075u implements InterfaceC18510q {
        C10195r() {
            super(3);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m54199a((String) obj, (String) obj2, ((Number) obj3).longValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54199a(String str, String str2, long j11) {
            C31168i c31168i;
            AbstractC19074t.m100208f(str, "sourceId");
            AbstractC19074t.m100208f(str2, "commentId");
            if (AbstractC19074t.m100204b(CommentView.this.f52671B0.mo53126h().m56271d(), str) && (c31168i = CommentView.this.f52674E0) != null) {
                c31168i.m151672E0(str2, j11);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$s */
    /* loaded from: classes5.dex */
    static final class C10196s extends AbstractC19075u implements InterfaceC18509p {
        C10196s() {
            super(2);
        }

        /* renamed from: a */
        public final void m54200a(String str, long j11) {
            Section section;
            AbstractC19074t.m100208f(str, "sourceId");
            if (AbstractC19074t.m100204b(CommentView.this.f52671B0.mo53126h().m56271d(), str)) {
                C31168i c31168i = CommentView.this.f52674E0;
                if (c31168i != null) {
                    section = c31168i.m151700r0();
                } else {
                    section = null;
                }
                if (section != null) {
                    section.m51174u(j11);
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54200a((String) obj, ((Number) obj2).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$t */
    /* loaded from: classes5.dex */
    static final class C10197t extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C24993c1 f52716r;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$t$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C24993c1 f52717q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C24993c1 c24993c1) {
                super(1);
                this.f52717q = c24993c1;
            }

            /* renamed from: a */
            public final void m54202a(List list) {
                AbstractC19074t.m100208f(list, "it");
                this.f52717q.f119809q.m55696S(list);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m54202a((List) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10197t(C24993c1 c24993c1) {
            super(2);
            this.f52716r = c24993c1;
        }

        /* renamed from: a */
        public final void m54201a(String str, String str2) {
            C31168i c31168i;
            String str3;
            LoadingLayout loadingLayout;
            AbstractC19074t.m100208f(str, "sourceId");
            AbstractC19074t.m100208f(str2, "commentId");
            if (AbstractC19074t.m100204b(CommentView.this.f52671B0.mo53126h().m56271d(), str) && (c31168i = CommentView.this.f52674E0) != null) {
                CommentView commentView = CommentView.this;
                C24993c1 c24993c1 = this.f52716r;
                c31168i.m151707y0(str2, new a(c24993c1));
                if (c31168i.mo10003k() == 0) {
                    Bundle m92642L3 = commentView.m92642L3();
                    if (m92642L3 != null) {
                        str3 = m92642L3.getString("FOOTER_COMMENT");
                    } else {
                        str3 = null;
                    }
                    String str4 = str3;
                    if (str4 != null && str4.length() != 0) {
                        LoadingLayout loadingLayout2 = c24993c1.f119814v;
                        AbstractC19074t.m100207e(loadingLayout2, "lytLoading");
                        LoadingLayout.m55778e(loadingLayout2, null, null, str4, null, null, null, 59, null);
                        return;
                    }
                    C24993c1 c24993c12 = (C24993c1) commentView.m55556SK();
                    if (c24993c12 != null && (loadingLayout = c24993c12.f119814v) != null) {
                        loadingLayout.m55781c();
                    }
                    C31168i c31168i2 = commentView.f52674E0;
                    if (c31168i2 != null) {
                        C31168i.m151664b0(c31168i2, Integer.valueOf(AbstractC23322a.zch_ic_empty_comment_line_48), null, commentView.m92652XI(AbstractC27413h.zch_bts_comment_empty_message), null, null, 26, null);
                    }
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54201a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$u */
    /* loaded from: classes5.dex */
    static final class C10198u extends AbstractC19075u implements InterfaceC18505l {
        C10198u() {
            super(1);
        }

        /* renamed from: a */
        public final void m54203a(Comment.Identity identity) {
            AbstractC19074t.m100208f(identity, "identity");
            C31168i c31168i = CommentView.this.f52674E0;
            if (c31168i != null) {
                c31168i.m151669B0(identity);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54203a((Comment.Identity) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$v */
    /* loaded from: classes5.dex */
    static final class C10199v extends AbstractC19075u implements InterfaceC18505l {
        C10199v() {
            super(1);
        }

        /* renamed from: a */
        public final void m54204a(int i11) {
            CommentView.this.m54155rL(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54204a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$w */
    /* loaded from: classes5.dex */
    public static final class C10200w implements C31168i.b {

        /* renamed from: a */
        final /* synthetic */ C31168i f52720a;

        /* renamed from: b */
        final /* synthetic */ CommentView f52721b;

        /* renamed from: c */
        final /* synthetic */ C24993c1 f52722c;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$w$a */
        /* loaded from: classes5.dex */
        public static final class a implements CommentActionBottomSheet.InterfaceC9499a {

            /* renamed from: a */
            final /* synthetic */ CommentActionBottomSheet f52723a;

            /* renamed from: b */
            final /* synthetic */ String f52724b;

            a(CommentActionBottomSheet commentActionBottomSheet, String str) {
                this.f52723a = commentActionBottomSheet;
                this.f52724b = str;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: a */
            public List mo51859a() {
                return null;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: b */
            public void mo51860b() {
                CommentActionBottomSheet.InterfaceC9499a.a.m51865b(this);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: c */
            public void mo51861c(boolean z11) {
                CommentActionBottomSheet.InterfaceC9499a.a.m51864a(this, z11);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: d */
            public void mo51862d() {
                CommentActionBottomSheet.InterfaceC9499a.a.m51866c(this);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: e */
            public void mo51863e() {
                C25084g.f120484a.m130018b(this.f52723a.getContext(), this.f52724b);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$w$b */
        /* loaded from: classes5.dex */
        public static final class b implements CommentActionBottomSheet.InterfaceC9499a {

            /* renamed from: a */
            final /* synthetic */ CommentActionBottomSheet f52725a;

            /* renamed from: b */
            final /* synthetic */ String f52726b;

            /* renamed from: c */
            final /* synthetic */ CommentView f52727c;

            /* renamed from: d */
            final /* synthetic */ C31168i f52728d;

            /* renamed from: e */
            final /* synthetic */ Comment f52729e;

            /* renamed from: f */
            final /* synthetic */ int f52730f;

            /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$w$b$a */
            /* loaded from: classes5.dex */
            static final class a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ CommentView f52731q;

                /* renamed from: r */
                final /* synthetic */ Comment f52732r;

                /* renamed from: s */
                final /* synthetic */ int f52733s;

                /* renamed from: t */
                final /* synthetic */ Integer f52734t;

                /* renamed from: u */
                final /* synthetic */ String f52735u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(CommentView commentView, Comment comment, int i11, Integer num, String str) {
                    super(0);
                    this.f52731q = commentView;
                    this.f52732r = comment;
                    this.f52733s = i11;
                    this.f52734t = num;
                    this.f52735u = str;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m54220a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m54220a() {
                    this.f52731q.f52671B0.mo53120AA(true, this.f52732r.m50833g(), this.f52733s, this.f52734t, this.f52735u);
                }
            }

            b(CommentActionBottomSheet commentActionBottomSheet, String str, CommentView commentView, C31168i c31168i, Comment comment, int i11) {
                this.f52725a = commentActionBottomSheet;
                this.f52726b = str;
                this.f52727c = commentView;
                this.f52728d = c31168i;
                this.f52729e = comment;
                this.f52730f = i11;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: a */
            public List mo51859a() {
                return this.f52729e.m50829c();
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: b */
            public void mo51860b() {
                String m92652XI;
                Map m131407l;
                this.f52727c.f52671B0.mo53125Of(this.f52729e);
                String m56274g = this.f52727c.f52671B0.mo53126h().m56274g();
                if (m56274g != null) {
                    int hashCode = m56274g.hashCode();
                    if (hashCode != -507563187) {
                        if (hashCode != 596808987) {
                            if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                                m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_friend_delete_comment);
                            }
                        } else if (m56274g.equals("SOURCE_FOR_U")) {
                            m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_for_u_delete_comment);
                        }
                    } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                        m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_following_delete_comment);
                    }
                    C19205a c19205a = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("comment_id", this.f52729e.m50833g()), AbstractC24866w.m129235a("reply_comment_count", Long.valueOf(this.f52729e.m50837k())));
                    c19205a.m100713L(m92652XI, m131407l);
                }
                m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_player_delete_comment);
                C19205a c19205a2 = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("comment_id", this.f52729e.m50833g()), AbstractC24866w.m129235a("reply_comment_count", Long.valueOf(this.f52729e.m50837k())));
                c19205a2.m100713L(m92652XI, m131407l);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: c */
            public void mo51861c(boolean z11) {
                C24860q c24860q;
                Integer num;
                String str;
                Comment comment;
                if (z11) {
                    C31168i c31168i = this.f52727c.f52674E0;
                    if (c31168i != null) {
                        c24860q = c31168i.m151694k0();
                    } else {
                        c24860q = null;
                    }
                    if (c24860q != null) {
                        num = (Integer) c24860q.m129215c();
                    } else {
                        num = null;
                    }
                    if (c24860q != null && (comment = (Comment) c24860q.m129216d()) != null) {
                        str = comment.m50833g();
                    } else {
                        str = null;
                    }
                    if (num != null && str != null && num.intValue() >= 0) {
                        ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_bts_comment_replace_pined_comment_title), Integer.valueOf(AbstractC27413h.zch_bts_comment_replace_pined_comment_message), Integer.valueOf(AbstractC27413h.zch_bts_comment_replace_pined_comment_positive), Integer.valueOf(AbstractC27413h.zch_bts_comment_replace_pined_comment_negative), null, true, false, 80, null);
                        m51992b.m51991lL(new a(this.f52727c, this.f52729e, this.f52730f, num, str));
                        m51992b.m51978ZK(true);
                        BasePopupView.m51974dL(m51992b, this.f52727c.m54148jL(), null, 2, null);
                        return;
                    }
                    InterfaceC10055c.a.m53673b(this.f52727c.f52671B0, true, this.f52729e.m50833g(), this.f52730f, null, null, 24, null);
                    return;
                }
                InterfaceC10055c.a.m53673b(this.f52727c.f52671B0, false, this.f52729e.m50833g(), this.f52730f, null, null, 24, null);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: d */
            public void mo51862d() {
                Map m131407l;
                String m50842p = this.f52729e.m50842p();
                if (m50842p != null) {
                    CommentActionBottomSheet commentActionBottomSheet = this.f52725a;
                    CommentView commentView = this.f52727c;
                    InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(commentActionBottomSheet.getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
                    if (interfaceC25792a != null) {
                        InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, commentActionBottomSheet.m92676n2(), m50842p, commentView, null, null, null, null, 480, null);
                    }
                }
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_comment_bts_report);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52728d.m151701s0().m56271d()), AbstractC24866w.m129235a("channel_uid", this.f52728d.m151701s0().m56273f()), AbstractC24866w.m129235a("comment_id", this.f52729e.m50833g()));
                c19205a.m100713L(m92652XI, m131407l);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentActionBottomSheet.InterfaceC9499a
            /* renamed from: e */
            public void mo51863e() {
                String m92652XI;
                Map m131407l;
                C25084g.f120484a.m130018b(this.f52725a.getContext(), this.f52726b);
                String m56274g = this.f52727c.f52671B0.mo53126h().m56274g();
                if (m56274g != null) {
                    int hashCode = m56274g.hashCode();
                    if (hashCode != -507563187) {
                        if (hashCode != 596808987) {
                            if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                                m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_friend_copy_comment);
                            }
                        } else if (m56274g.equals("SOURCE_FOR_U")) {
                            m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_for_u_copy_comment);
                        }
                    } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                        m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_following_copy_comment);
                    }
                    C19205a c19205a = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52728d.m151701s0().m56271d()), AbstractC24866w.m129235a("comment_content", this.f52726b));
                    c19205a.m100713L(m92652XI, m131407l);
                }
                m92652XI = this.f52725a.m92652XI(AbstractC27413h.zch_action_key_player_copy_comment);
                C19205a c19205a2 = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52728d.m151701s0().m56271d()), AbstractC24866w.m129235a("comment_content", this.f52726b));
                c19205a2.m100713L(m92652XI, m131407l);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$w$c */
        /* loaded from: classes5.dex */
        public static final class c implements Runnable {

            /* renamed from: p */
            final /* synthetic */ C24993c1 f52736p;

            /* renamed from: q */
            final /* synthetic */ int f52737q;

            /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$w$c$a */
            /* loaded from: classes5.dex */
            public static final class a implements Runnable {

                /* renamed from: p */
                final /* synthetic */ C24993c1 f52738p;

                /* renamed from: q */
                final /* synthetic */ int f52739q;

                a(C24993c1 c24993c1, int i11) {
                    this.f52738p = c24993c1;
                    this.f52739q = i11;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.f52738p.f119809q.m55692C()) {
                        this.f52738p.f119812t.m9837K1(this.f52739q);
                        return;
                    }
                    if (this.f52738p.f119809q.getKeyboardHeight() > 0) {
                        this.f52738p.f119812t.m9837K1(this.f52739q);
                    }
                    if (this.f52738p.f119809q.getKeyboardHeight() == 0 || this.f52738p.f119809q.getKeyboardOffset() < 1.0f || this.f52738p.f119809q.isLayoutRequested()) {
                        this.f52738p.f119809q.post(this);
                    }
                }
            }

            c(C24993c1 c24993c1, int i11) {
                this.f52736p = c24993c1;
                this.f52737q = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f52736p.f119809q.getIdentityInfo().m50858h()) {
                    return;
                }
                if (!this.f52736p.f119809q.m55694E()) {
                    CommentBox commentBox = this.f52736p.f119809q;
                    AbstractC19074t.m100207e(commentBox, "boxComment");
                    if (!CommentBox.m55664R(commentBox, false, 1, null)) {
                        this.f52736p.f119809q.post(this);
                        return;
                    }
                }
                C24993c1 c24993c1 = this.f52736p;
                c24993c1.f119809q.post(new a(c24993c1, this.f52737q));
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$w$d */
        /* loaded from: classes5.dex */
        public static final class d implements CommentUserBottomSheet.InterfaceC9505a {

            /* renamed from: a */
            final /* synthetic */ CommentView f52740a;

            /* renamed from: b */
            final /* synthetic */ CommentUserBottomSheet f52741b;

            /* renamed from: c */
            final /* synthetic */ Comment.Identity f52742c;

            d(CommentView commentView, CommentUserBottomSheet commentUserBottomSheet, Comment.Identity identity) {
                this.f52740a = commentView;
                this.f52741b = commentUserBottomSheet;
                this.f52742c = identity;
            }
        }

        C10200w(C31168i c31168i, CommentView commentView, C24993c1 c24993c1) {
            this.f52720a = c31168i;
            this.f52721b = commentView;
            this.f52722c = c24993c1;
        }

        @Override // z10.C31168i.b
        /* renamed from: a */
        public void mo54205a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "loadMore");
            InterfaceC10055c.a.m53672a(this.f52721b.f52671B0, loadMoreInfo, null, 2, null);
        }

        @Override // z10.C31168i.b
        /* renamed from: b */
        public void mo54206b(Comment comment) {
            boolean z11;
            AbstractC19074t.m100208f(comment, "comment");
            InterfaceC10055c interfaceC10055c = this.f52721b.f52671B0;
            if (comment.m50839m() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC10055c.mo53121Ct(comment, z11, true);
            this.f52721b.m54149kL();
        }

        @Override // z10.C31168i.b
        /* renamed from: c */
        public void mo54207c(CtaItem ctaItem) {
            AbstractC19074t.m100208f(ctaItem, "item");
            InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(this.f52720a.m151696m0(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
            if (interfaceC25792a != null) {
                InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, this.f52721b.m92676n2(), ctaItem.m50908b(), this.f52721b, null, null, null, null, 480, null);
            }
        }

        @Override // z10.C31168i.b
        /* renamed from: d */
        public void mo54208d(Comment comment) {
            int i11;
            Map m131407l;
            AbstractC19074t.m100208f(comment, "comment");
            this.f52721b.m54147iL(comment);
            C19205a c19205a = C19205a.f95429a;
            CommentView commentView = this.f52721b;
            String m56274g = this.f52720a.m151701s0().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_see_more_reply_comment;
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        i11 = AbstractC27413h.zch_action_key_for_u_see_more_reply_comment;
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    i11 = AbstractC27413h.zch_action_key_following_see_more_reply_comment;
                }
                String m92652XI = commentView.m92652XI(i11);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52720a.m151701s0().m56271d()), AbstractC24866w.m129235a("channel_uid", this.f52720a.m151701s0().m56273f()), AbstractC24866w.m129235a("comment_id", comment.m50833g()));
                c19205a.m100713L(m92652XI, m131407l);
                this.f52721b.m54149kL();
            }
            i11 = AbstractC27413h.zch_action_key_player_see_more_reply_comment;
            String m92652XI2 = commentView.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52720a.m151701s0().m56271d()), AbstractC24866w.m129235a("channel_uid", this.f52720a.m151701s0().m56273f()), AbstractC24866w.m129235a("comment_id", comment.m50833g()));
            c19205a.m100713L(m92652XI2, m131407l);
            this.f52721b.m54149kL();
        }

        @Override // z10.C31168i.b
        /* renamed from: e */
        public void mo54209e(String str) {
            AbstractC19074t.m100208f(str, "content");
            CommentActionBottomSheet m51867b = CommentActionBottomSheet.C9500b.m51867b(CommentActionBottomSheet.Companion, true, false, false, "7", null, 22, null);
            m51867b.m51858kL(new a(m51867b, str));
            m51867b.m51757bL(true);
            m51867b.m51762gL(this.f52721b.m54148jL(), "BTS_BY_LONG_CLICK");
        }

        @Override // z10.C31168i.b
        /* renamed from: f */
        public void mo54210f(String str) {
            InterfaceC10179b interfaceC10179b;
            AbstractC19074t.m100208f(str, "tag");
            if (this.f52721b.m54148jL().m92996E0("BTS_BY_LONG_CLICK") == null) {
                InterfaceC1801w m92650VI = this.f52721b.m92650VI();
                if (m92650VI instanceof InterfaceC10179b) {
                    interfaceC10179b = (InterfaceC10179b) m92650VI;
                } else {
                    interfaceC10179b = null;
                }
                if (interfaceC10179b != null) {
                    interfaceC10179b.mo54175qa(str);
                }
            }
        }

        @Override // z10.C31168i.b
        /* renamed from: g */
        public void mo54211g(List list) {
            AbstractC19074t.m100208f(list, "indexs");
            C24993c1 c24993c1 = this.f52722c;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RecyclerView.AbstractC1876c0 m9900t0 = c24993c1.f119812t.m9900t0(((Number) it.next()).intValue());
                if (m9900t0 instanceof C31168i.c) {
                    ((C31168i.c) m9900t0).m151711l0().m52081p();
                }
            }
        }

        @Override // z10.C31168i.b
        /* renamed from: h */
        public void mo54212h(Comment comment, int i11) {
            int i12;
            Map m131407l;
            AbstractC19074t.m100208f(comment, "comment");
            CommentBox commentBox = this.f52722c.f119809q;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            CommentBox.m55667Y(commentBox, comment, false, 2, null);
            C24993c1 c24993c1 = this.f52722c;
            c24993c1.f119809q.post(new c(c24993c1, i11));
            C19205a c19205a = C19205a.f95429a;
            CommentView commentView = this.f52721b;
            String m56274g = this.f52720a.m151701s0().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            i12 = AbstractC27413h.zch_action_key_friend_reply_comment;
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        i12 = AbstractC27413h.zch_action_key_for_u_reply_comment;
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    i12 = AbstractC27413h.zch_action_key_following_reply_comment;
                }
                String m92652XI = commentView.m92652XI(i12);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52720a.m151701s0().m56271d()), AbstractC24866w.m129235a("channel_uid", this.f52720a.m151701s0().m56273f()), AbstractC24866w.m129235a("comment_id", comment.m50833g()));
                c19205a.m100713L(m92652XI, m131407l);
            }
            i12 = AbstractC27413h.zch_action_key_player_reply_comment;
            String m92652XI2 = commentView.m92652XI(i12);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52720a.m151701s0().m56271d()), AbstractC24866w.m129235a("channel_uid", this.f52720a.m151701s0().m56273f()), AbstractC24866w.m129235a("comment_id", comment.m50833g()));
            c19205a.m100713L(m92652XI2, m131407l);
        }

        @Override // z10.C31168i.b
        /* renamed from: i */
        public void mo54213i() {
            String m92652XI;
            String m56274g = this.f52721b.f52671B0.mo53126h().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            m92652XI = this.f52721b.m92652XI(AbstractC27413h.zch_action_key_friend_caption_more);
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        m92652XI = this.f52721b.m92652XI(AbstractC27413h.zch_action_key_foru_caption_more);
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    m92652XI = this.f52721b.m92652XI(AbstractC27413h.zch_action_key_following_caption_more);
                }
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            }
            m92652XI = this.f52721b.m92652XI(AbstractC27413h.zch_action_key_player_caption_more);
            C19205a c19205a2 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            C19205a.m100675M(c19205a2, m92652XI, null, 2, null);
        }

        @Override // z10.C31168i.b
        /* renamed from: j */
        public void mo54214j(Comment.Identity identity, boolean z11) {
            String str;
            Map m131401f;
            AbstractC19074t.m100208f(identity, "channel");
            ChannelPageView.C10134b c10134b = ChannelPageView.Companion;
            Channel m50852b = identity.m50852b();
            if (AbstractC19074t.m100204b(identity.m50854d(), this.f52720a.m151701s0().m56273f())) {
                str = this.f52720a.m151701s0().m56271d();
            } else {
                str = null;
            }
            this.f52721b.m55551QK(c10134b.m53983a(m50852b, str));
            String m92652XI = this.f52721b.m92652XI(AbstractC27413h.zch_action_key_comment_channel_detail);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("seen_channel_uid", identity.m50854d()));
            c19205a.m100713L(m92652XI, m131401f);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0072, code lost:            if (r1 != false) goto L92;     */
        @Override // z10.C31168i.b
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo54215k(Comment comment, String str, int i11, boolean z11) {
            boolean z12;
            boolean z13;
            boolean z14;
            int i12;
            Map m131407l;
            String m50842p;
            AbstractC19074t.m100208f(comment, "comment");
            AbstractC19074t.m100208f(str, "fullContent");
            boolean z15 = !comment.m50846w();
            if (!comment.m50846w() && !comment.m50849z() && (m50842p = comment.m50842p()) != null && m50842p.length() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (comment.m50839m() == null && this.f52720a.m151701s0().m56275h() == 1 && this.f52720a.m151701s0().m56282o()) {
                z13 = true;
            } else {
                z13 = false;
            }
            Boolean m50830d = comment.m50830d();
            Boolean bool = Boolean.TRUE;
            if (AbstractC19074t.m100204b(m50830d, bool)) {
                if (z13) {
                    bool = Boolean.FALSE;
                }
                bool = null;
            } else {
                if (AbstractC19074t.m100204b(m50830d, Boolean.FALSE)) {
                }
                bool = null;
            }
            if (this.f52720a.m151701s0().m56275h() == 1) {
                if (comment.m50849z() || this.f52720a.m151701s0().m56282o()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CommentActionBottomSheet m51868a = CommentActionBottomSheet.Companion.m51868a(z15, z12, z14, "7", String.valueOf(bool));
                m51868a.m51858kL(new b(m51868a, str, this.f52721b, this.f52720a, comment, i11));
                m51868a.m51757bL(true);
                BaseBottomSheetView.m51747hL(m51868a, this.f52721b.m54148jL(), null, 2, null);
                C19205a c19205a = C19205a.f95429a;
                CommentView commentView = this.f52721b;
                String m56274g = this.f52720a.m151701s0().m56274g();
                if (m56274g != null) {
                    int hashCode = m56274g.hashCode();
                    if (hashCode != -507563187) {
                        if (hashCode != 596808987) {
                            if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                                i12 = AbstractC27413h.zch_action_key_friend_more_comment;
                            }
                        } else if (m56274g.equals("SOURCE_FOR_U")) {
                            i12 = AbstractC27413h.zch_action_key_for_u_more_comment;
                        }
                    } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                        i12 = AbstractC27413h.zch_action_key_following_more_comment;
                    }
                    String m92652XI = commentView.m92652XI(i12);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52720a.m151701s0().m56271d()), AbstractC24866w.m129235a("channel_uid", this.f52720a.m151701s0().m56273f()), AbstractC24866w.m129235a("comment_id", comment.m50833g()), AbstractC24866w.m129235a("is_long_touch", Integer.valueOf(z11 ? 1 : 0)));
                    c19205a.m100713L(m92652XI, m131407l);
                    this.f52721b.m54149kL();
                    return;
                }
                i12 = AbstractC27413h.zch_action_key_player_more_comment;
                String m92652XI2 = commentView.m92652XI(i12);
                AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f52720a.m151701s0().m56271d()), AbstractC24866w.m129235a("channel_uid", this.f52720a.m151701s0().m56273f()), AbstractC24866w.m129235a("comment_id", comment.m50833g()), AbstractC24866w.m129235a("is_long_touch", Integer.valueOf(z11 ? 1 : 0)));
                c19205a.m100713L(m92652XI2, m131407l);
                this.f52721b.m54149kL();
                return;
            }
            throw new IllegalStateException();
        }

        @Override // z10.C31168i.b
        /* renamed from: l */
        public void mo54216l(Comment.Identity identity, boolean z11) {
            AbstractC19074t.m100208f(identity, "user");
            CommentUserBottomSheet m51879a = CommentUserBottomSheet.Companion.m51879a(identity);
            m51879a.m51878iL(new d(this.f52721b, m51879a, identity));
            m51879a.m51757bL(true);
            BaseBottomSheetView.m51747hL(m51879a, this.f52721b.m54148jL(), null, 2, null);
        }

        @Override // z10.C31168i.b
        /* renamed from: m */
        public void mo54217m(Video video) {
            AbstractC19074t.m100208f(video, "video");
            if (!video.m52901m0() && video.m52903n0()) {
                this.f52721b.m55551QK(VideoChannelPagerView.Companion.m55115c(video));
            } else {
                C25097t.f120556a.m130153n(this.f52720a.m151696m0(), AbstractC27413h.zch_item_comment_attach_video_not_available);
            }
        }

        @Override // z10.C31168i.b
        /* renamed from: n */
        public void mo54218n() {
            InterfaceC10179b interfaceC10179b;
            InterfaceC1801w m92650VI = this.f52721b.m92650VI();
            if (m92650VI instanceof InterfaceC10179b) {
                interfaceC10179b = (InterfaceC10179b) m92650VI;
            } else {
                interfaceC10179b = null;
            }
            if (interfaceC10179b != null) {
                interfaceC10179b.mo54171Jn();
            }
        }

        @Override // z10.C31168i.b
        /* renamed from: o */
        public void mo54219o(Comment comment, boolean z11) {
            int i11;
            String m92652XI;
            Map m131407l;
            int i12;
            int i13;
            int i14;
            AbstractC19074t.m100208f(comment, "comment");
            this.f52721b.f52671B0.mo53127tI(comment.m50833g(), z11);
            String m56274g = this.f52721b.f52671B0.mo53126h().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            CommentView commentView = this.f52721b;
                            if (z11) {
                                i14 = AbstractC27413h.zch_action_key_friend_like_comment;
                            } else {
                                i14 = AbstractC27413h.zch_action_key_friend_unlike_comment;
                            }
                            m92652XI = commentView.m92652XI(i14);
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        CommentView commentView2 = this.f52721b;
                        if (z11) {
                            i13 = AbstractC27413h.zch_action_key_for_u_like_comment;
                        } else {
                            i13 = AbstractC27413h.zch_action_key_for_u_unlike_comment;
                        }
                        m92652XI = commentView2.m92652XI(i13);
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    CommentView commentView3 = this.f52721b;
                    if (z11) {
                        i12 = AbstractC27413h.zch_action_key_following_like_comment;
                    } else {
                        i12 = AbstractC27413h.zch_action_key_following_unlike_comment;
                    }
                    m92652XI = commentView3.m92652XI(i12);
                }
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("comment_id", comment.m50833g()), AbstractC24866w.m129235a("reply_comment_count", Long.valueOf(comment.m50837k())));
                c19205a.m100713L(m92652XI, m131407l);
                this.f52721b.m54149kL();
            }
            CommentView commentView4 = this.f52721b;
            if (z11) {
                i11 = AbstractC27413h.zch_action_key_player_like_comment;
            } else {
                i11 = AbstractC27413h.zch_action_key_player_unlike_comment;
            }
            m92652XI = commentView4.m92652XI(i11);
            C19205a c19205a2 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("comment_id", comment.m50833g()), AbstractC24866w.m129235a("reply_comment_count", Long.valueOf(comment.m50837k())));
            c19205a2.m100713L(m92652XI, m131407l);
            this.f52721b.m54149kL();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentView$x */
    /* loaded from: classes5.dex */
    public static final class C10201x extends C1923p {

        /* renamed from: q */
        final /* synthetic */ int f52743q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10201x(int i11, Context context) {
            super(context);
            this.f52743q = i11;
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            AbstractC19074t.m100208f(displayMetrics, "displayMetrics");
            return (super.mo10405v(displayMetrics) * 10.0f) / this.f52743q;
        }
    }

    public CommentView() {
        super(C10178a.f52677y);
        this.f52671B0 = AbstractC28684a.Companion.m143683q();
        this.f52675F0 = true;
    }

    /* renamed from: Bt */
    public final void m54132Bt(String str) {
        InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
        if (interfaceC25792a != null) {
            InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2(), str, this, null, null, null, null, 480, null);
        }
    }

    /* renamed from: hL */
    public static final void m54146hL(CommentView commentView) {
        AbstractC19074t.m100208f(commentView, "this$0");
        commentView.m54153pL(true);
    }

    /* renamed from: iL */
    public final void m54147iL(Comment comment) {
        LoadMoreInfo m51169n;
        Section m50840n = comment.m50840n();
        if (m50840n != null && (m51169n = m50840n.m51169n()) != null) {
            this.f52671B0.mo53122H4(comment, m51169n);
        }
    }

    /* renamed from: jL */
    public final C17487o0 m54148jL() {
        if (m92650VI() instanceof VideoPageView) {
            C17487o0 m92693xK = m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            return m92693xK;
        }
        C17487o0 m92649TI = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
        return m92649TI;
    }

    /* renamed from: kL */
    public final void m54149kL() {
        List m151699q0;
        RecyclerView.AbstractC1876c0 abstractC1876c0;
        ListClickableRecyclerView listClickableRecyclerView;
        List m151699q02;
        C31168i c31168i = this.f52674E0;
        if (c31168i != null && (m151699q0 = c31168i.m151699q0()) != null) {
            if (!(!m151699q0.isEmpty())) {
                m151699q0 = null;
            }
            if (m151699q0 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m151699q0);
                C31168i c31168i2 = this.f52674E0;
                if (c31168i2 != null && (m151699q02 = c31168i2.m151699q0()) != null) {
                    m151699q02.clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    C24993c1 c24993c1 = (C24993c1) m55556SK();
                    if (c24993c1 != null && (listClickableRecyclerView = c24993c1.f119812t) != null) {
                        abstractC1876c0 = listClickableRecyclerView.m9900t0(intValue);
                    } else {
                        abstractC1876c0 = null;
                    }
                    if (abstractC1876c0 instanceof C31168i.c) {
                        ((C31168i.c) abstractC1876c0).m151711l0().m52081p();
                    }
                }
            }
        }
    }

    /* renamed from: lL */
    public final void m54150lL(boolean z11) {
        View view;
        C24993c1 c24993c1 = (C24993c1) m55556SK();
        if (c24993c1 != null && (view = c24993c1.f119810r) != null) {
            if (z11) {
                AbstractC26112n.m134431w0(view);
            } else {
                AbstractC26112n.m134367H(view);
            }
        }
    }

    /* renamed from: nL */
    public final boolean m54151nL() {
        C31168i c31168i;
        CommentSource mo53126h = this.f52671B0.mo53126h();
        if (mo53126h.m56278k() && !mo53126h.m56279l() && this.f52676G0 && (c31168i = this.f52674E0) != null && c31168i.m151705w0()) {
            return true;
        }
        return false;
    }

    /* renamed from: oL */
    public final void m54152oL(String str) {
        ListClickableRecyclerView listClickableRecyclerView;
        C31168i c31168i = this.f52674E0;
        if (c31168i != null) {
            Integer valueOf = Integer.valueOf(c31168i.m151702t0(str));
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                C24993c1 c24993c1 = (C24993c1) m55556SK();
                if (c24993c1 != null && (listClickableRecyclerView = c24993c1.f119812t) != null && listClickableRecyclerView.getScrollState() == 0) {
                    RecyclerView.AbstractC1888o layoutManager = listClickableRecyclerView.getLayoutManager();
                    AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView.LinearLayoutManager");
                    ((OverScrollableRecyclerView.LinearLayoutManager) layoutManager).m9721B2(intValue, 0);
                }
            }
        }
    }

    /* renamed from: pL */
    private final void m54153pL(boolean z11) {
        ListClickableRecyclerView listClickableRecyclerView;
        C24993c1 c24993c1 = (C24993c1) m55556SK();
        if (c24993c1 != null && (listClickableRecyclerView = c24993c1.f119812t) != null && listClickableRecyclerView.getScrollState() == 0) {
            RecyclerView.AbstractC1888o layoutManager = listClickableRecyclerView.getLayoutManager();
            AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView.LinearLayoutManager");
            OverScrollableRecyclerView.LinearLayoutManager linearLayoutManager = (OverScrollableRecyclerView.LinearLayoutManager) layoutManager;
            int m9737T1 = linearLayoutManager.m9737T1();
            if (m9737T1 <= 0) {
                if (m9737T1 < 0 && z11) {
                    linearLayoutManager.mo9756v1(0);
                    return;
                }
                return;
            }
            if (m9737T1 <= 10) {
                C10201x c10201x = new C10201x(m9737T1, listClickableRecyclerView.getContext());
                c10201x.m10244p(0);
                linearLayoutManager.m10090H1(c10201x);
            } else if (m9737T1 <= 20) {
                listClickableRecyclerView.mo9854S1(0);
            } else {
                linearLayoutManager.mo9756v1(0);
            }
        }
    }

    /* renamed from: qL */
    static /* synthetic */ void m54154qL(CommentView commentView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        commentView.m54153pL(z11);
    }

    /* renamed from: rL */
    public final void m54155rL(int i11) {
        CommentBox commentBox;
        boolean z11;
        C24993c1 c24993c1 = (C24993c1) m55556SK();
        if (c24993c1 != null && (commentBox = c24993c1.f119809q) != null) {
            boolean z12 = false;
            if (i11 == 1) {
                AbstractC28684a.Companion.m143681o().mo146326a0(1);
                C27417l c27417l = C27417l.f129055a;
                User m140378b = c27417l.m140378b();
                Comment.Identity identity = new Comment.Identity(m140378b.m51234g(), 1, m140378b.m51235h(), m140378b.m51230c(), (String) null, (String) null, (String) null, (String) null, this.f52671B0.mo53126h().m56281n(), 240, (AbstractC19060k) null);
                if (c27417l.m140377a() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                CommentBox.m55665U(commentBox, identity, z11, false, 4, null);
                return;
            }
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                if (!AbstractC19074t.m100204b(this.f52671B0.mo53126h().m56273f(), m140377a.m50769l())) {
                    AbstractC28684a.Companion.m143681o().mo146326a0(2);
                }
                Comment.Identity identity2 = new Comment.Identity(m140377a.m50769l(), 2, m140377a.m50775o(), m140377a.m50754c(), (String) null, (String) null, (String) null, (String) null, this.f52671B0.mo53126h().m56280m(), 240, (AbstractC19060k) null);
                boolean z13 = !AbstractC19074t.m100204b(this.f52671B0.mo53126h().m56273f(), m140377a.m50769l());
                if (AbstractC19074t.m100204b(m140377a.m50765j(), Boolean.TRUE) && AbstractC19074t.m100204b(this.f52671B0.mo53126h().m56273f(), m140377a.m50769l())) {
                    z12 = true;
                }
                commentBox.m55697T(identity2, z13, z12);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        getLifecycle().mo9335a(this.f52671B0);
        this.f52671B0.mo52965Lb(this);
        this.f52671B0.mo52970uo(m92642L3());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        CommentReceiver commentReceiver = this.f52673D0;
        if (commentReceiver != null) {
            commentReceiver.mo53687g();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        String str;
        LoadingLayout loadingLayout;
        String str2;
        String str3;
        boolean z11;
        C24993c1 c24993c1;
        CommentBox commentBox;
        super.mo39032PJ();
        this.f52671B0.mo52970uo(m92642L3());
        CommentSource mo53126h = this.f52671B0.mo53126h();
        Channel m140377a = C27417l.f129055a.m140377a();
        if (mo53126h.m56279l() && (c24993c1 = (C24993c1) m55556SK()) != null && (commentBox = c24993c1.f119809q) != null) {
            AbstractC26112n.m134367H(commentBox);
        }
        if (m140377a != null && (AbstractC28684a.Companion.m143681o().mo146312N() != 1 || AbstractC19074t.m100204b(this.f52671B0.mo53126h().m56273f(), m140377a.m50769l()))) {
            m54155rL(2);
        } else {
            m54155rL(1);
        }
        C31168i c31168i = this.f52674E0;
        if (c31168i != null) {
            c31168i.m151684S0(mo53126h);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                str2 = m92642L3.getString("COMMENT_ID");
            } else {
                str2 = null;
            }
            c31168i.m151682Q0(str2);
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                str3 = m92642L32.getString("FOOTER_COMMENT");
            } else {
                str3 = null;
            }
            c31168i.m151681P0(str3);
            Bundle m92642L33 = m92642L3();
            if (m92642L33 != null) {
                z11 = m92642L33.getBoolean("EXPAND_DESC", false);
            } else {
                z11 = false;
            }
            c31168i.m151680O0(z11);
            C31168i.m151662X(c31168i, null, null, true, 3, null);
        }
        C24993c1 c24993c12 = (C24993c1) m55556SK();
        if (c24993c12 != null && (loadingLayout = c24993c12.f119814v) != null) {
            loadingLayout.m55786j();
        }
        this.f52676G0 = false;
        InterfaceC10055c interfaceC10055c = this.f52671B0;
        Bundle m92642L34 = m92642L3();
        if (m92642L34 != null) {
            str = m92642L34.getString("COMMENT_ID");
        } else {
            str = null;
        }
        InterfaceC10055c.a.m53672a(interfaceC10055c, null, str, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        C31168i c31168i;
        LoadingLayout loadingLayout;
        int i11;
        CommentBox commentBox;
        super.mo37584UJ();
        C20196i c20196i = this.f52672C0;
        String str = null;
        if (c20196i != null) {
            C20196i.m105317q(c20196i, null, 1, null);
        }
        CommentSource mo53126h = this.f52671B0.mo53126h();
        if (mo53126h.m56279l()) {
            String m56273f = mo53126h.m56273f();
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                str = m140377a.m50769l();
            }
            if (AbstractC19074t.m100204b(m56273f, str)) {
                i11 = AbstractC27413h.zch_bts_comment_lock_comment_on_video;
            } else {
                i11 = AbstractC27413h.zch_bts_comment_channel_lock_comment_on_video;
            }
            C31168i c31168i2 = this.f52674E0;
            if (c31168i2 != null) {
                C31168i.m151662X(c31168i2, null, null, false, 7, null);
            }
            C31168i c31168i3 = this.f52674E0;
            if (c31168i3 != null) {
                C31168i.m151664b0(c31168i3, null, null, m92652XI(i11), null, null, 27, null);
            }
            C24993c1 c24993c1 = (C24993c1) m55556SK();
            if (c24993c1 != null && (commentBox = c24993c1.f119809q) != null) {
                AbstractC26112n.m134367H(commentBox);
                return;
            }
            return;
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (c31168i = this.f52674E0) != null && !c31168i.mo151443L()) {
            C24993c1 c24993c12 = (C24993c1) m55556SK();
            if (c24993c12 != null && (loadingLayout = c24993c12.f119814v) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10055c.a.m53672a(this.f52671B0, null, m92642L3.getString("COMMENT_ID"), 1, null);
        }
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: Uj */
    public void mo54156Uj(Comment comment, Comment comment2, boolean z11, boolean z12) {
        InterfaceC10179b interfaceC10179b;
        Section m151700r0;
        String m92652XI;
        Map m131401f;
        Section m151700r02;
        Comment m151666j0;
        AbstractC19074t.m100208f(comment, "sendingComment");
        AbstractC19074t.m100208f(comment2, "comment");
        InterfaceC1801w m92650VI = m92650VI();
        if (m92650VI instanceof InterfaceC10179b) {
            interfaceC10179b = (InterfaceC10179b) m92650VI;
        } else {
            interfaceC10179b = null;
        }
        if (interfaceC10179b != null) {
            interfaceC10179b.mo54173fh();
        }
        C31168i c31168i = this.f52674E0;
        if (c31168i != null) {
            C31168i.m151667z0(c31168i, comment.m50833g(), null, 2, null);
        }
        if (z11) {
            C31168i c31168i2 = this.f52674E0;
            if (c31168i2 != null) {
                c31168i2.m151673F0(comment2);
            }
            C31168i c31168i3 = this.f52674E0;
            if (c31168i3 != null && (m151666j0 = C31168i.m151666j0(c31168i3, comment2.m50839m(), false, 2, null)) != null) {
                m151666j0.m50822Q(m151666j0.m50837k() + 1);
                CommentReceiver.Companion.m53714e(this.f52671B0.mo53126h().m56271d(), m151666j0.m50833g(), m151666j0.m50837k());
            }
            C31168i c31168i4 = this.f52674E0;
            if (c31168i4 != null && (m151700r02 = c31168i4.m151700r0()) != null) {
                CommentReceiver.Companion.m53710a(this.f52671B0.mo53126h().m56271d(), m151700r02.m51170o() + 1);
            }
        } else {
            C31168i c31168i5 = this.f52674E0;
            if (c31168i5 != null) {
                c31168i5.m151668A0(comment2);
            }
            C31168i c31168i6 = this.f52674E0;
            if (c31168i6 != null && (m151700r0 = c31168i6.m151700r0()) != null) {
                CommentReceiver.Companion.m53710a(this.f52671B0.mo53126h().m56271d(), m151700r0.m51170o());
            }
            if (z12) {
                m54154qL(this, false, 1, null);
            }
        }
        String m56274g = this.f52671B0.mo53126h().m56274g();
        if (m56274g != null) {
            int hashCode = m56274g.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                        m92652XI = m92652XI(AbstractC27413h.zch_action_key_friend_send_comment_result);
                    }
                } else if (m56274g.equals("SOURCE_FOR_U")) {
                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_foru_send_comment_result);
                }
            } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_following_send_comment_result);
            }
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 1));
            c19205a.m100713L(m92652XI, m131401f);
        }
        m92652XI = m92652XI(AbstractC27413h.zch_action_key_player_send_comment_result);
        C19205a c19205a2 = C19205a.f95429a;
        AbstractC19074t.m100205c(m92652XI);
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 1));
        c19205a2.m100713L(m92652XI, m131401f);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f52675F0 = true;
        C24993c1 c24993c1 = (C24993c1) m55556SK();
        if (c24993c1 != null) {
            c24993c1.f119814v.m55781c();
            c24993c1.f119809q.m55703x();
            CommentBox commentBox = c24993c1.f119809q;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            CommentBox.m55666W(commentBox, 0, 1.0f, false, 4, null);
        }
        C20196i c20196i = this.f52672C0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: Vw */
    public void mo54157Vw(Throwable th2, Comment comment) {
        String m92652XI;
        Map m131401f;
        CoreConfig m51425b;
        String m51459v;
        AbstractC19074t.m100208f(th2, "throwable");
        AbstractC19074t.m100208f(comment, "comment");
        C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_error_send_comment_fail);
        if (th2 instanceof NotKycException) {
            mo54159YF(comment, null);
            ChannelConfig m140381e = C27417l.f129055a.m140381e();
            if (m140381e != null && (m51425b = m140381e.m51425b()) != null && (m51459v = m51425b.m51459v()) != null) {
                ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_ekyc_user_title), Integer.valueOf(AbstractC27413h.zch_popup_ekyc_user_message), Integer.valueOf(AbstractC27413h.zch_popup_ekyc_user_positive), Integer.valueOf(AbstractC27413h.zch_popup_ekyc_user_negative), null, false, false, 112, null);
                m51992b.m51991lL(new C10185h(m51459v, m51992b));
                m51992b.m51990kL(new C10186i(m51992b));
                m51992b.m51978ZK(true);
                BasePopupView.m51974dL(m51992b, m54148jL(), null, 2, null);
            }
        } else if (th2 instanceof CommentInvalidException) {
            mo54159YF(comment, null);
        } else {
            C31168i c31168i = this.f52674E0;
            if (c31168i != null) {
                c31168i.m151674G0(comment.m50833g(), -1);
            }
        }
        String m56274g = this.f52671B0.mo53126h().m56274g();
        if (m56274g != null) {
            int hashCode = m56274g.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                        m92652XI = m92652XI(AbstractC27413h.zch_action_key_friend_send_comment_result);
                    }
                } else if (m56274g.equals("SOURCE_FOR_U")) {
                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_foru_send_comment_result);
                }
            } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_following_send_comment_result);
            }
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 0));
            c19205a.m100713L(m92652XI, m131401f);
        }
        m92652XI = m92652XI(AbstractC27413h.zch_action_key_player_send_comment_result);
        C19205a c19205a2 = C19205a.f95429a;
        AbstractC19074t.m100205c(m92652XI);
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 0));
        c19205a2.m100713L(m92652XI, m131401f);
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: X2 */
    public void mo54158X2(String str, boolean z11, Throwable th2) {
        AbstractC19074t.m100208f(str, "commentId");
        AbstractC19074t.m100208f(th2, "throwable");
        C25097t.f120556a.m130155r(getContext(), th2);
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: YF */
    public void mo54159YF(Comment comment, Throwable th2) {
        Section m151700r0;
        long j11;
        Comment m151666j0;
        AbstractC19074t.m100208f(comment, "comment");
        if (th2 != null) {
            C25097t.f120556a.m130155r(getContext(), th2);
            return;
        }
        CommentReceiver.C10068a c10068a = CommentReceiver.Companion;
        c10068a.m53711b(this.f52671B0.mo53126h().m56271d(), comment.m50833g());
        C31168i c31168i = this.f52674E0;
        if (c31168i != null && (m151666j0 = C31168i.m151666j0(c31168i, comment.m50839m(), false, 2, null)) != null) {
            c10068a.m53714e(this.f52671B0.mo53126h().m56271d(), m151666j0.m50833g(), m151666j0.m50837k() - 1);
        }
        C31168i c31168i2 = this.f52674E0;
        if (c31168i2 != null && (m151700r0 = c31168i2.m151700r0()) != null) {
            long m51170o = m151700r0.m51170o();
            if (comment.m50839m() == null) {
                j11 = (m51170o - 1) - comment.m50837k();
            } else {
                j11 = m51170o - 1;
            }
            c10068a.m53710a(this.f52671B0.mo53126h().m56271d(), j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0109, code lost:            if (fn0.AbstractC19074t.m100204b(r2, r1) == false) goto L42;     */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C24993c1 c24993c1 = (C24993c1) m55556SK();
        if (c24993c1 != null) {
            this.f52672C0 = new C20196i(this, false, new C10193p(c24993c1), 2, null);
            CommentReceiver commentReceiver = new CommentReceiver(new C10194q(), new C10195r(), new C10196s(), new C10197t(c24993c1), new C10198u(), new C10199v());
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            commentReceiver.mo53685d(m92689tK);
            this.f52673D0 = commentReceiver;
            C31168i c31168i = new C31168i(this.f52671B0.mo53126h(), null, getContext(), 2, null);
            Bundle m92642L3 = m92642L3();
            String str2 = null;
            if (m92642L3 != null) {
                str = m92642L3.getString("COMMENT_ID");
            } else {
                str = null;
            }
            c31168i.m151682Q0(str);
            c31168i.m151679N0(new C10200w(c31168i, this, c24993c1));
            this.f52674E0 = c31168i;
            ListClickableRecyclerView listClickableRecyclerView = c24993c1.f119812t;
            Context context = listClickableRecyclerView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            listClickableRecyclerView.m9816A(new C2497c(context, new C10190m(this)));
            listClickableRecyclerView.setAdapter(this.f52674E0);
            Context context2 = listClickableRecyclerView.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            listClickableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context2, 0, false, false, 14, null));
            AbstractC19074t.m100205c(listClickableRecyclerView);
            OverScrollableRecyclerView.m56144i2(listClickableRecyclerView, new C10187j(), 0.0f, 2, null);
            listClickableRecyclerView.setOnListClickListener(new C10188k(c24993c1, this));
            listClickableRecyclerView.m9826E(new C10189l(c24993c1, this));
            CommentBox commentBox = c24993c1.f119809q;
            commentBox.setCallback(new C10191n(commentBox, c24993c1));
            C27417l c27417l = C27417l.f129055a;
            if (c27417l.m140377a() != null) {
                if (AbstractC28684a.Companion.m143681o().mo146312N() == 1) {
                    String m56273f = this.f52671B0.mo53126h().m56273f();
                    Channel m140377a = c27417l.m140377a();
                    if (m140377a != null) {
                        str2 = m140377a.m50769l();
                    }
                }
                m54155rL(2);
                AbstractC19074t.m100205c(commentBox);
                CommentBox.m55666W(commentBox, AbstractC28684a.Companion.m143681o().mo146314P(), 0.0f, false, 2, null);
                commentBox.setCloseOnSend(true);
                c24993c1.f119813u.setCallback(new C10192o());
            }
            m54155rL(1);
            AbstractC19074t.m100205c(commentBox);
            CommentBox.m55666W(commentBox, AbstractC28684a.Companion.m143681o().mo146314P(), 0.0f, false, 2, null);
            commentBox.setCloseOnSend(true);
            c24993c1.f119813u.setCallback(new C10192o());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: aK */
    public void mo54160aK(Bundle bundle) {
        super.mo54160aK(bundle);
        if ((m92650VI() instanceof VideoPageView) && bundle != null) {
            m54164mL();
        }
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: b */
    public void mo54161b(boolean z11) {
        LoadingLayout loadingLayout;
        C31168i c31168i = this.f52674E0;
        if (c31168i != null && !c31168i.mo151443L() && z11) {
            C24993c1 c24993c1 = (C24993c1) m55556SK();
            if (c24993c1 != null && (loadingLayout = c24993c1.f119814v) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10055c.a.m53672a(this.f52671B0, null, null, 3, null);
        }
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: d */
    public void mo54162d(Throwable th2) {
        C24993c1 c24993c1;
        InterfaceC10179b interfaceC10179b;
        String m92652XI;
        AbstractC19074t.m100208f(th2, "throwable");
        C31168i c31168i = this.f52674E0;
        if (c31168i != null) {
            C31168i.m151662X(c31168i, null, null, false, 7, null);
            if (!c31168i.mo151443L() && (c24993c1 = (C24993c1) m55556SK()) != null) {
                if (th2 instanceof NetworkException) {
                    c31168i.m151687a0(Integer.valueOf(AbstractC23322a.zch_ic_empty_state_line_48), m92652XI(AbstractC27413h.zch_error_loading_failed), m92652XI(AbstractC27413h.zch_error_loading_failed_hint), m92652XI(AbstractC27413h.zch_error_retry), new C10181d(c24993c1, this));
                } else if (th2 instanceof LockCommentException) {
                    InterfaceC1801w m92650VI = m92650VI();
                    String str = null;
                    if (m92650VI instanceof InterfaceC10179b) {
                        interfaceC10179b = (InterfaceC10179b) m92650VI;
                    } else {
                        interfaceC10179b = null;
                    }
                    if (interfaceC10179b != null) {
                        interfaceC10179b.mo54174gr(true);
                    }
                    this.f52671B0.mo53126h().m56283p(true);
                    String m56273f = this.f52671B0.mo53126h().m56273f();
                    Channel m140377a = C27417l.f129055a.m140377a();
                    if (m140377a != null) {
                        str = m140377a.m50769l();
                    }
                    if (AbstractC19074t.m100204b(m56273f, str)) {
                        m92652XI = m92652XI(AbstractC27413h.zch_bts_comment_lock_comment_on_video);
                    } else {
                        m92652XI = m92652XI(AbstractC27413h.zch_bts_comment_channel_lock_comment_on_video);
                    }
                    String str2 = m92652XI;
                    if (!c31168i.m151706x0()) {
                        C31168i.m151664b0(c31168i, null, null, str2, null, null, 27, null);
                    }
                } else {
                    c31168i.m151687a0(Integer.valueOf(AbstractC23322a.zch_ic_empty_state_line_48), m92652XI(AbstractC27413h.zch_error_loading_failed), m92652XI(AbstractC27413h.zch_error_loading_failed_hint), m92652XI(AbstractC27413h.zch_error_retry), new C10182e(c24993c1, this));
                }
                c24993c1.f119814v.m55781c();
            }
        }
    }

    /* renamed from: gL */
    public final void m54163gL() {
        CommentBox commentBox;
        C24993c1 c24993c1 = (C24993c1) m55556SK();
        if (c24993c1 != null && (commentBox = c24993c1.f119809q) != null) {
            commentBox.m55703x();
        }
    }

    /* renamed from: mL */
    public final void m54164mL() {
        HashMap m151697o0;
        ListClickableRecyclerView listClickableRecyclerView;
        RecyclerView.AbstractC1876c0 abstractC1876c0;
        C31168i.e eVar;
        ListClickableRecyclerView listClickableRecyclerView2;
        C31168i c31168i = this.f52674E0;
        if (c31168i != null) {
            int m151703u0 = c31168i.m151703u0();
            if (m151703u0 >= 0) {
                C24993c1 c24993c1 = (C24993c1) m55556SK();
                if (c24993c1 != null && (listClickableRecyclerView2 = c24993c1.f119812t) != null) {
                    abstractC1876c0 = listClickableRecyclerView2.m9900t0(m151703u0);
                } else {
                    abstractC1876c0 = null;
                }
                if (abstractC1876c0 instanceof C31168i.e) {
                    eVar = (C31168i.e) abstractC1876c0;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    eVar.m151712l0().getRoot().m55721h();
                }
            }
            m54149kL();
            c31168i.m151683R0(new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null));
            c31168i.m151689d0(null);
            c31168i.m151690e0();
            c31168i.m151692g0();
            c31168i.m151691f0();
            C24993c1 c24993c12 = (C24993c1) m55556SK();
            if (c24993c12 != null && (listClickableRecyclerView = c24993c12.f119812t) != null) {
                listClickableRecyclerView.m9853S0();
            }
            c31168i.m10008p();
        }
        C24993c1 c24993c13 = (C24993c1) m55556SK();
        if (c24993c13 != null) {
            c24993c13.f119809q.m55703x();
            c24993c13.f119809q.m55702w();
            CommentBox commentBox = c24993c13.f119809q;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            CommentBox.m55667Y(commentBox, null, false, 2, null);
            c24993c13.f119809q.setAttachedVideo(null);
        }
        mo60305zK(null);
        this.f52671B0.mo52970uo(null);
        this.f52676G0 = false;
        C31168i c31168i2 = this.f52674E0;
        if (c31168i2 != null && (m151697o0 = c31168i2.m151697o0()) != null) {
            m151697o0.clear();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        C24993c1 c24993c1;
        CommentBox commentBox;
        CommentBox commentBox2;
        if (i11 == 4 && (c24993c1 = (C24993c1) m55556SK()) != null && (commentBox = c24993c1.f119809q) != null && commentBox.m55692C()) {
            C24993c1 c24993c12 = (C24993c1) m55556SK();
            if (c24993c12 != null && (commentBox2 = c24993c12.f119809q) != null) {
                commentBox2.m55690A();
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(48);
        }
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: pz */
    public void mo54165pz(boolean z11, String str, int i11, Integer num, String str2, Throwable th2) {
        boolean z12;
        Integer num2;
        int i12;
        int i13;
        Map m131407l;
        int i14;
        int i15;
        ListClickableRecyclerView listClickableRecyclerView;
        AbstractC19074t.m100208f(str, "commentId");
        if (th2 == null) {
            C25097t c25097t = C25097t.f120556a;
            Context context = getContext();
            if (z11) {
                i15 = AbstractC27413h.zch_bts_comment_pined_comment;
            } else {
                i15 = AbstractC27413h.zch_bts_comment_unpined_comment;
            }
            c25097t.m130154o(context, m92652XI(i15));
            boolean m100204b = AbstractC19074t.m100204b(this.f52671B0.mo53126h().m56274g(), "SOURCE_NOTI");
            C31168i c31168i = this.f52674E0;
            if (c31168i != null) {
                c31168i.m151671D0(z11, i11, num, m100204b);
            }
            C24993c1 c24993c1 = (C24993c1) m55556SK();
            if (c24993c1 != null && (listClickableRecyclerView = c24993c1.f119812t) != null) {
                listClickableRecyclerView.post(new Runnable() { // from class: m20.y
                    public /* synthetic */ RunnableC22817y() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CommentView.m54146hL(CommentView.this);
                    }
                });
            }
        } else {
            C25097t.f120556a.m130155r(getContext(), th2);
        }
        CommentSource mo53126h = this.f52671B0.mo53126h();
        if (num != null && str2 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            String m56274g = mo53126h.m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            i14 = AbstractC27413h.zch_action_key_friend_replace_pinned_comment;
                            num2 = Integer.valueOf(i14);
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        i14 = AbstractC27413h.zch_action_key_foru_replace_pinned_comment;
                        num2 = Integer.valueOf(i14);
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    i14 = AbstractC27413h.zch_action_key_following_replace_pinned_comment;
                    num2 = Integer.valueOf(i14);
                }
            }
            i14 = AbstractC27413h.zch_action_key_player_replace_pinned_comment;
            num2 = Integer.valueOf(i14);
        } else if (z11) {
            String m56274g2 = mo53126h.m56274g();
            if (m56274g2 != null) {
                int hashCode2 = m56274g2.hashCode();
                if (hashCode2 != -507563187) {
                    if (hashCode2 != 596808987) {
                        if (hashCode2 == 1323686722 && m56274g2.equals("SOURCE_FRIEND")) {
                            i13 = AbstractC27413h.zch_action_key_friend_pin_comment;
                            num2 = Integer.valueOf(i13);
                        }
                    } else if (m56274g2.equals("SOURCE_FOR_U")) {
                        i13 = AbstractC27413h.zch_action_key_foru_pin_comment;
                        num2 = Integer.valueOf(i13);
                    }
                } else if (m56274g2.equals("SOURCE_FOLLOWING")) {
                    i13 = AbstractC27413h.zch_action_key_following_pin_comment;
                    num2 = Integer.valueOf(i13);
                }
            }
            i13 = AbstractC27413h.zch_action_key_player_pin_comment;
            num2 = Integer.valueOf(i13);
        } else if (!z11) {
            String m56274g3 = mo53126h.m56274g();
            if (m56274g3 != null) {
                int hashCode3 = m56274g3.hashCode();
                if (hashCode3 != -507563187) {
                    if (hashCode3 != 596808987) {
                        if (hashCode3 == 1323686722 && m56274g3.equals("SOURCE_FRIEND")) {
                            i12 = AbstractC27413h.zch_action_key_friend_unpin_comment;
                            num2 = Integer.valueOf(i12);
                        }
                    } else if (m56274g3.equals("SOURCE_FOR_U")) {
                        i12 = AbstractC27413h.zch_action_key_foru_unpin_comment;
                        num2 = Integer.valueOf(i12);
                    }
                } else if (m56274g3.equals("SOURCE_FOLLOWING")) {
                    i12 = AbstractC27413h.zch_action_key_following_unpin_comment;
                    num2 = Integer.valueOf(i12);
                }
            }
            i12 = AbstractC27413h.zch_action_key_player_unpin_comment;
            num2 = Integer.valueOf(i12);
        } else {
            num2 = null;
        }
        if (!z12) {
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("comment_id", str), AbstractC24866w.m129235a("video_id", mo53126h.m56271d()), AbstractC24866w.m129235a("channel_uid", mo53126h.m56273f()));
        } else {
            C24860q[] c24860qArr = new C24860q[4];
            if (str2 == null) {
                str2 = "";
            }
            c24860qArr[0] = AbstractC24866w.m129235a("replaced_comment_id", str2);
            c24860qArr[1] = AbstractC24866w.m129235a("comment_id", str);
            c24860qArr[2] = AbstractC24866w.m129235a("video_id", mo53126h.m56271d());
            c24860qArr[3] = AbstractC24866w.m129235a("channel_uid", mo53126h.m56273f());
            m131407l = AbstractC25363p0.m131407l(c24860qArr);
        }
        if (num2 != null) {
            int intValue = num2.intValue();
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = m92652XI(intValue);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, m131407l);
        }
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: vE */
    public void mo54166vE(Section section, Comment comment) {
        AbstractC19074t.m100208f(section, "section");
        AbstractC19074t.m100208f(comment, "comment");
        C31168i c31168i = this.f52674E0;
        if (c31168i != null) {
            c31168i.m151688c0(comment, section);
        }
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: xd */
    public void mo54167xd(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25097t.f120556a.m130155r(getContext(), th2);
    }

    @Override // m20.InterfaceC22809w
    /* renamed from: xn */
    public void mo54168xn(Section section) {
        InterfaceC10179b interfaceC10179b;
        String str;
        CommentBox commentBox;
        LoadingLayout loadingLayout;
        C24993c1 c24993c1;
        CommentBox commentBox2;
        CommentBox commentBox3;
        LoadingLayout loadingLayout2;
        InterfaceC10179b interfaceC10179b2;
        AbstractC19074t.m100208f(section, "section");
        InterfaceC1801w m92650VI = m92650VI();
        Integer num = null;
        if (m92650VI instanceof InterfaceC10179b) {
            interfaceC10179b = (InterfaceC10179b) m92650VI;
        } else {
            interfaceC10179b = null;
        }
        if (interfaceC10179b != null && !interfaceC10179b.mo54170E3(new C10183f(section))) {
            return;
        }
        this.f52676G0 = true;
        C31168i c31168i = this.f52674E0;
        if (c31168i == null) {
            return;
        }
        if (this.f52671B0.mo53126h().m56279l()) {
            InterfaceC1801w m92650VI2 = m92650VI();
            if (m92650VI2 instanceof InterfaceC10179b) {
                interfaceC10179b2 = (InterfaceC10179b) m92650VI2;
            } else {
                interfaceC10179b2 = null;
            }
            if (interfaceC10179b2 != null) {
                interfaceC10179b2.mo54174gr(false);
            }
            this.f52671B0.mo53126h().m56283p(false);
        }
        if (!c31168i.mo151443L()) {
            c31168i.m151683R0(section);
            c31168i.m151689d0(null);
            c31168i.m10008p();
            if (!section.m51168m().isEmpty()) {
                C24993c1 c24993c12 = (C24993c1) m55556SK();
                if (c24993c12 != null && (loadingLayout2 = c24993c12.f119814v) != null) {
                    loadingLayout2.m55781c();
                }
                C24993c1 c24993c13 = (C24993c1) m55556SK();
                if (c24993c13 != null && (commentBox3 = c24993c13.f119809q) != null) {
                    AbstractC26112n.m134431w0(commentBox3);
                }
            } else {
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null) {
                    str = m92642L3.getString("FOOTER_COMMENT");
                } else {
                    str = null;
                }
                C31168i.m151662X(c31168i, null, null, false, 7, null);
                if (str != null && str.length() != 0) {
                    c31168i.m151686Y(str);
                } else {
                    C31168i.m151664b0(c31168i, Integer.valueOf(AbstractC23322a.zch_ic_empty_comment_line_48), null, m92652XI(AbstractC27413h.zch_bts_comment_empty_message), null, null, 26, null);
                }
                C24993c1 c24993c14 = (C24993c1) m55556SK();
                if (c24993c14 != null && (loadingLayout = c24993c14.f119814v) != null) {
                    loadingLayout.m55781c();
                }
                C24993c1 c24993c15 = (C24993c1) m55556SK();
                if (c24993c15 != null && (commentBox = c24993c15.f119809q) != null) {
                    AbstractC26112n.m134431w0(commentBox);
                }
            }
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                num = Integer.valueOf(m92642L32.getInt("INPUT_TYPE"));
            }
            Bundle m92642L33 = m92642L3();
            if (m92642L33 != null) {
                m92642L33.remove("INPUT_TYPE");
            }
            if (((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) && (c24993c1 = (C24993c1) m55556SK()) != null && (commentBox2 = c24993c1.f119809q) != null) {
                commentBox2.post(new RunnableC10184g(commentBox2, num));
            }
            CommentReceiver.Companion.m53710a(this.f52671B0.mo53126h().m56271d(), section.m51170o());
            return;
        }
        int mo10003k = c31168i.mo10003k();
        c31168i.m151689d0(section);
        int mo10003k2 = c31168i.mo10003k() - mo10003k;
        c31168i.m10009q(mo10003k - 1);
        c31168i.m10015w(mo10003k, mo10003k2);
    }
}
