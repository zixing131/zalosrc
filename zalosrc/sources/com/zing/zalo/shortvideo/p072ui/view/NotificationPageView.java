package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.AbstractC1438d;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.config.NotiCategories;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.CommentIdentitiesBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.CommentReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NotificationReceiver;
import com.zing.zalo.shortvideo.p072ui.view.NotificationPageView;
import com.zing.zalo.shortvideo.p072ui.widget.CommentBox;
import com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import f20.C18706d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import i20.C20196i;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.C21456b;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25010g2;
import qm0.AbstractC25361o0;
import s20.AbstractC26102d;
import s20.AbstractC26103e;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import x00.InterfaceC29280a;

/* loaded from: classes5.dex */
public class NotificationPageView extends AbstractC10623a implements C21456b.c {
    public static final C10315b Companion = new C10315b(null);

    /* renamed from: B0 */
    private C18706d f53013B0;

    /* renamed from: C0 */
    private NotificationReceiver f53014C0;

    /* renamed from: D0 */
    private final Set f53015D0;

    /* renamed from: E0 */
    private String f53016E0;

    /* renamed from: F0 */
    private String f53017F0;

    /* renamed from: G0 */
    private int f53018G0;

    /* renamed from: H0 */
    private C20196i f53019H0;

    /* renamed from: I0 */
    private CommentReceiver f53020I0;

    /* renamed from: J0 */
    private boolean f53021J0;

    /* renamed from: K0 */
    private Video f53022K0;

    /* renamed from: L0 */
    private String f53023L0;

    /* renamed from: M0 */
    private boolean f53024M0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10314a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10314a f53025y = new C10314a();

        C10314a() {
            super(3, C25010g2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageNotificationBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54581h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25010g2 m54581h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25010g2.m129826c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$b */
    /* loaded from: classes5.dex */
    public static final class C10315b {
        private C10315b() {
        }

        public /* synthetic */ C10315b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final NotificationPageView m54582a() {
            NotificationChannelView notificationChannelView = new NotificationChannelView();
            notificationChannelView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_CHANNEL")));
            return notificationChannelView;
        }

        /* renamed from: b */
        public final NotificationPageView m54583b() {
            NotificationUserView notificationUserView = new NotificationUserView();
            notificationUserView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_USER")));
            return notificationUserView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$c */
    /* loaded from: classes5.dex */
    static final class C10316c extends AbstractC19075u implements InterfaceC18494a {
        C10316c() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m54585c(C25010g2 c25010g2) {
            AbstractC19074t.m100208f(c25010g2, "$this_run");
            CommentBox commentBox = c25010g2.f119921r;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            CommentBox.m55664R(commentBox, false, 1, null);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54586b();
            return C24848g0.f119245a;
        }

        /* renamed from: b */
        public final void m54586b() {
            if (NotificationPageView.this.f53024M0) {
                NotificationPageView.this.f53024M0 = false;
                final C25010g2 c25010g2 = (C25010g2) NotificationPageView.this.m55556SK();
                if (c25010g2 != null) {
                    c25010g2.f119923t.setFocusable(true);
                    c25010g2.f119923t.requestFocus();
                    c25010g2.f119923t.post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.view.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            NotificationPageView.C10316c.m54585c(C25010g2.this);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$d */
    /* loaded from: classes5.dex */
    static final class C10317d extends AbstractC19075u implements InterfaceC18505l {
        C10317d() {
            super(1);
        }

        /* renamed from: a */
        public final void m54587a(int i11) {
            Video video = NotificationPageView.this.f53022K0;
            if (video != null) {
                NotificationPageView.this.m54547AL(i11, video);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54587a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$e */
    /* loaded from: classes5.dex */
    static final class C10318e extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C25010g2 f53029r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10318e(C25010g2 c25010g2) {
            super(2);
            this.f53029r = c25010g2;
        }

        /* renamed from: a */
        public final void m54588a(int i11, float f11) {
            if (NotificationPageView.this.f53021J0) {
                NotificationPageView.this.f53021J0 = false;
                if (i11 == 0) {
                    CommentBox commentBox = this.f53029r.f119921r;
                    AbstractC19074t.m100207e(commentBox, "boxComment");
                    CommentBox.m55666W(commentBox, i11, f11, false, 4, null);
                }
            } else {
                CommentBox commentBox2 = this.f53029r.f119921r;
                AbstractC19074t.m100207e(commentBox2, "boxComment");
                CommentBox.m55666W(commentBox2, i11, f11, false, 4, null);
            }
            if (i11 > 0 && f11 == 1.0f) {
                AbstractC28684a.Companion.m143681o().mo146340o(i11);
            }
            if (this.f53029r.f119921r.m55694E()) {
                CommentBox commentBox3 = this.f53029r.f119921r;
                AbstractC19074t.m100207e(commentBox3, "boxComment");
                AbstractC26112n.m134431w0(commentBox3);
                View view = this.f53029r.f119922s;
                AbstractC19074t.m100207e(view, "dimContent");
                AbstractC26112n.m134431w0(view);
                return;
            }
            CommentBox commentBox4 = this.f53029r.f119921r;
            AbstractC19074t.m100207e(commentBox4, "boxComment");
            AbstractC26112n.m134374O(commentBox4);
            View view2 = this.f53029r.f119922s;
            AbstractC19074t.m100207e(view2, "dimContent");
            AbstractC26112n.m134374O(view2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54588a(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$f */
    /* loaded from: classes5.dex */
    public static final class C10319f implements CommentBox.InterfaceC10658a {

        /* renamed from: b */
        final /* synthetic */ CommentBox f53031b;

        /* renamed from: c */
        final /* synthetic */ C25010g2 f53032c;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$f$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ NotificationPageView f53033q;

            /* renamed from: r */
            final /* synthetic */ C25010g2 f53034r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NotificationPageView notificationPageView, C25010g2 c25010g2) {
                super(2);
                this.f53033q = notificationPageView;
                this.f53034r = c25010g2;
            }

            /* renamed from: a */
            public final void m54589a(Video video, String str) {
                AbstractC19074t.m100208f(video, "video");
                AbstractC19074t.m100208f(str, "kw");
                this.f53033q.f53024M0 = true;
                this.f53034r.f119921r.setAttachedVideo(video);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m54589a((Video) obj, (String) obj2);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$f$b */
        /* loaded from: classes5.dex */
        public static final class b implements CommentIdentitiesBottomSheet.InterfaceC9503a {
            b() {
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.CommentIdentitiesBottomSheet.InterfaceC9503a
            /* renamed from: a */
            public void mo51876a(int i11) {
                CommentReceiver.Companion.m53712c(i11);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$f$c */
        /* loaded from: classes5.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CommentBox f53035q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(CommentBox commentBox) {
                super(0);
                this.f53035q = commentBox;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54590a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54590a() {
                if (!this.f53035q.getIdentityInfo().m50858h()) {
                    this.f53035q.m55700Z();
                }
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$f$d */
        /* loaded from: classes5.dex */
        static final class d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CommentBox f53036q;

            /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$f$d$a */
            /* loaded from: classes5.dex */
            public static final class a implements Runnable {

                /* renamed from: p */
                final /* synthetic */ CommentBox f53037p;

                a(CommentBox commentBox) {
                    this.f53037p = commentBox;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (!this.f53037p.getIdentityInfo().m50858h() && !this.f53037p.m55701a0()) {
                        this.f53037p.post(this);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(CommentBox commentBox) {
                super(0);
                this.f53036q = commentBox;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54591a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54591a() {
                CommentBox commentBox = this.f53036q;
                commentBox.post(new a(commentBox));
            }
        }

        C10319f(CommentBox commentBox, C25010g2 c25010g2) {
            this.f53031b = commentBox;
            this.f53032c = c25010g2;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: a */
        public void mo54185a(Comment.Identity identity, String str, boolean z11, Comment comment, Video video) {
            String str2;
            boolean z12;
            ZaloView zaloView;
            NotificationView notificationView;
            String str3;
            Comment.Identity identity2;
            String str4;
            String m50839m;
            Comment.Identity m50838l;
            AbstractC19074t.m100208f(identity, "identity");
            AbstractC19074t.m100208f(str, "content");
            String m50854d = this.f53032c.f119921r.getIdentityInfo().m50854d();
            String str5 = null;
            if (comment != null && (m50838l = comment.m50838l()) != null) {
                str2 = m50838l.m50854d();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(m50854d, str2) && this.f53032c.f119921r.getIdentityInfo().m50856f() == comment.m50838l().m50856f()) {
                z12 = false;
            } else {
                z12 = true;
            }
            C18706d c18706d = NotificationPageView.this.f53013B0;
            if (c18706d != null) {
                zaloView = c18706d.m98648B();
            } else {
                zaloView = null;
            }
            if (zaloView instanceof NotificationView) {
                notificationView = (NotificationView) zaloView;
            } else {
                notificationView = null;
            }
            if (notificationView != null) {
                NotificationPageView notificationPageView = NotificationPageView.this;
                if (!notificationView.mo60294yp()) {
                    String str6 = notificationPageView.f53023L0;
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    Video video2 = notificationPageView.f53022K0;
                    if (video2 != null) {
                        str3 = video2.m52911t();
                    } else {
                        str3 = null;
                    }
                    String valueOf2 = String.valueOf(str3);
                    if (z12 && comment != null) {
                        identity2 = comment.m50838l();
                    } else {
                        identity2 = null;
                    }
                    String str7 = null;
                    boolean z13 = false;
                    boolean z14 = false;
                    long j11 = 0;
                    long j12 = 0;
                    if (comment != null && (m50839m = comment.m50839m()) != null) {
                        str4 = m50839m;
                    } else {
                        if (comment != null) {
                            str5 = comment.m50833g();
                        }
                        str4 = str5;
                    }
                    notificationView.m54624aG(str6, new Comment(valueOf, identity, valueOf2, identity2, str, str7, z13, z14, j11, j12, str4, (Comment) null, (Section) null, System.currentTimeMillis(), (String) null, (Integer) 1, (List) null, video, (Boolean) null, 351200, (AbstractC19060k) null));
                }
            }
            CommentBox commentBox = this.f53032c.f119921r;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            if (AbstractC26112n.m134380U(commentBox)) {
                CommentBox commentBox2 = this.f53032c.f119921r;
                AbstractC19074t.m100207e(commentBox2, "boxComment");
                AbstractC26112n.m134374O(commentBox2);
                View view = this.f53032c.f119922s;
                AbstractC19074t.m100207e(view, "dimContent");
                AbstractC26112n.m134374O(view);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: b */
        public void mo54186b(boolean z11) {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: c */
        public void mo54187c(String str) {
            AbstractC19074t.m100208f(str, "emoji");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: d */
        public void mo54188d(int i11, int i12) {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: e */
        public void mo54189e() {
            NotificationPageView notificationPageView = NotificationPageView.this;
            notificationPageView.m55551QK(SearchVideoChannelView.Companion.m54861a("SOURCE_NOTI", new a(notificationPageView, this.f53032c)));
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: f */
        public C17487o0 mo54190f() {
            return NotificationPageView.this.m92662fJ();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: g */
        public InterfaceC27218a mo54191g() {
            return NotificationPageView.this.m92676n2();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: h */
        public void mo54192h(String str) {
            AbstractC19074t.m100208f(str, "emoji");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: i */
        public void mo54193i(Comment.Identity identity) {
            AbstractC19074t.m100208f(identity, "currentIdentity");
            CommentIdentitiesBottomSheet m51877a = CommentIdentitiesBottomSheet.Companion.m51877a(identity.m50856f());
            CommentBox commentBox = this.f53031b;
            m51877a.m51875mL(new b());
            if (commentBox.m55692C()) {
                m51877a.m51755ZK(new c(commentBox));
            }
            if (commentBox.m55693D()) {
                m51877a.m51755ZK(new d(commentBox));
            }
            m51877a.m51757bL(true);
            C17487o0 m92649TI = NotificationPageView.this.m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            BaseBottomSheetView.m51747hL(m51877a, m92649TI, null, 2, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$g */
    /* loaded from: classes5.dex */
    static final class C10320g extends AbstractC19075u implements InterfaceC18509p {
        C10320g() {
            super(2);
        }

        /* renamed from: a */
        public final void m54592a(boolean z11, String str) {
            AbstractC19074t.m100208f(str, "id");
            if (!z11) {
                NotificationPageView.this.m54569qL(str);
                NotificationPageView.this.f53015D0.remove(str);
            } else {
                if (!AbstractC19074t.m100204b(str, NotificationPageView.this.f53017F0)) {
                    NotificationPageView.this.m54576zL(str);
                }
                NotificationPageView.this.f53015D0.add(str);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54592a(((Boolean) obj).booleanValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$h */
    /* loaded from: classes5.dex */
    static final class C10321h extends AbstractC19075u implements InterfaceC18505l {
        C10321h() {
            super(1);
        }

        /* renamed from: a */
        public final void m54593a(View view) {
            AbstractC19074t.m100208f(view, "it");
            NotificationPageView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54593a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$i */
    /* loaded from: classes5.dex */
    public static final class C10322i extends ViewPager.C6879n {

        /* renamed from: p */
        private int f53040p;

        /* renamed from: q */
        final /* synthetic */ NotificationPageView f53041q;

        C10322i(ViewPager viewPager, NotificationPageView notificationPageView) {
            this.f53041q = notificationPageView;
            this.f53040p = viewPager.getCurrentItem();
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            List m98650D;
            NotiCategories notiCategories;
            String m51483a;
            C18706d c18706d = this.f53041q.f53013B0;
            if (c18706d != null && (m98650D = c18706d.m98650D()) != null && (notiCategories = (NotiCategories) m98650D.get(i11)) != null && (m51483a = notiCategories.m51483a()) != null) {
                NotificationPageView notificationPageView = this.f53041q;
                notificationPageView.f53017F0 = m51483a;
                boolean m54570rL = notificationPageView.m54570rL(i11);
                notificationPageView.m54574wL(i11, m54570rL);
                notificationPageView.m54569qL(m51483a);
                notificationPageView.m54579vL(m51483a, notificationPageView.f53016E0);
                notificationPageView.m54571sL(m51483a, m54570rL);
            }
            C18706d c18706d2 = this.f53041q.f53013B0;
            if (c18706d2 != null) {
                c18706d2.m98649C(this.f53040p);
            }
            C18706d c18706d3 = this.f53041q.f53013B0;
            if (c18706d3 != null) {
                c18706d3.m98647A(i11);
            }
            this.f53040p = i11;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$j */
    /* loaded from: classes5.dex */
    public static final class C10323j extends PageBar.C10776j {

        /* renamed from: b */
        final /* synthetic */ InterfaceC29280a f53043b;

        C10323j(InterfaceC29280a interfaceC29280a) {
            this.f53043b = interfaceC29280a;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.C10776j, com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10772f
        /* renamed from: a */
        public View mo54594a(ViewGroup viewGroup, int i11, CharSequence charSequence) {
            String str;
            boolean z11;
            List m98650D;
            NotiCategories notiCategories;
            AbstractC19074t.m100208f(viewGroup, "container");
            C18706d c18706d = NotificationPageView.this.f53013B0;
            if (c18706d != null && (m98650D = c18706d.m98650D()) != null && (notiCategories = (NotiCategories) m98650D.get(i11)) != null) {
                str = notiCategories.m51483a();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z11 = this.f53043b.mo146347v(str);
            } else {
                z11 = false;
            }
            View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_page_notification, false, 2, null);
            InterfaceC29280a interfaceC29280a = this.f53043b;
            ((TextView) m134372M.findViewById(AbstractC27409d.txtTitle)).setText(charSequence);
            if (i11 == 0 && z11 && str != null) {
                interfaceC29280a.mo146335j(false, str);
            }
            if (z11 && i11 != 0) {
                View findViewById = m134372M.findViewById(AbstractC27409d.dotRed);
                AbstractC19074t.m100207e(findViewById, "findViewById(...)");
                AbstractC26112n.m134431w0(findViewById);
            }
            return m134372M;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$k */
    /* loaded from: classes5.dex */
    public static final class C10324k extends PageBar.C10777k {
        C10324k() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.C10777k, com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10773g
        /* renamed from: a */
        public void mo54595a(PageBar.C10774h c10774h) {
            AbstractC19074t.m100208f(c10774h, "page");
            View findViewById = c10774h.m56016a().findViewById(AbstractC27409d.txtTitle);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            AbstractC26112n.m134425t0((TextView) findViewById, AbstractC27406a.zch_text_tertiary);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.C10777k, com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10773g
        /* renamed from: b */
        public void mo54596b(PageBar.C10774h c10774h) {
            AbstractC19074t.m100208f(c10774h, "page");
            View findViewById = c10774h.m56016a().findViewById(AbstractC27409d.txtTitle);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            AbstractC26112n.m134425t0((TextView) findViewById, AbstractC27406a.zch_text_primary);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$l */
    /* loaded from: classes5.dex */
    public static final class C10325l extends PageBar.C10775i {

        /* renamed from: f */
        private int f53044f;

        /* renamed from: g */
        private int f53045g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10325l(PageBar pageBar, Context context) {
            super(context);
            AbstractC19074t.m100205c(context);
            this.f53044f = AbstractC26103e.m134327a(pageBar.getContext(), AbstractC27406a.zch_border_subtle);
            this.f53045g = AbstractC26103e.m134327a(pageBar.getContext(), AbstractC27406a.zch_border_accent_blue);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.C10775i, com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10771e
        /* renamed from: a */
        public void mo54597a(Canvas canvas, Rect rect, Rect rect2, Rect rect3, float f11) {
            AbstractC19074t.m100208f(canvas, "canvas");
            AbstractC19074t.m100208f(rect, "bound");
            AbstractC19074t.m100208f(rect2, "lPage");
            AbstractC19074t.m100208f(rect3, "rPage");
            m56018d().set(rect);
            m56018d().top = rect.bottom - m56020f();
            RectF m56018d = m56018d();
            Paint m56019e = m56019e();
            m56019e.setColor(mo54598b());
            C24848g0 c24848g0 = C24848g0.f119245a;
            canvas.drawRect(m56018d, m56019e);
            m56018d().top = rect.bottom - (m56020f() * 2);
            m56018d().left = rect2.left + ((rect3.left - r0) * f11);
            m56018d().right = rect2.right + ((rect3.right - r6) * f11);
            RectF m56018d2 = m56018d();
            Paint m56019e2 = m56019e();
            m56019e2.setColor(mo54599c());
            canvas.drawRect(m56018d2, m56019e2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.C10775i
        /* renamed from: b */
        public int mo54598b() {
            return this.f53044f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.C10775i
        /* renamed from: c */
        public int mo54599c() {
            return this.f53045g;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$m */
    /* loaded from: classes5.dex */
    static final class C10326m extends AbstractC19075u implements InterfaceC18510q {
        C10326m() {
            super(3);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m54600a((String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54600a(String str, String str2, boolean z11) {
            ZaloView zaloView;
            AbstractC19074t.m100208f(str, "sourceId");
            AbstractC19074t.m100208f(str2, "commentId");
            C18706d c18706d = NotificationPageView.this.f53013B0;
            NotificationView notificationView = null;
            if (c18706d != null) {
                zaloView = c18706d.m98648B();
            } else {
                zaloView = null;
            }
            if (zaloView instanceof NotificationView) {
                notificationView = (NotificationView) zaloView;
            }
            if (notificationView != null && !notificationView.mo60294yp()) {
                notificationView.m54630oL(str2, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationPageView$n */
    /* loaded from: classes5.dex */
    public static final class RunnableC10327n implements Runnable {

        /* renamed from: p */
        final /* synthetic */ C25010g2 f53047p;

        /* renamed from: q */
        final /* synthetic */ Comment f53048q;

        RunnableC10327n(C25010g2 c25010g2, Comment comment) {
            this.f53047p = c25010g2;
            this.f53048q = comment;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f53047p.f119921r.getIdentityInfo().m50858h()) {
                return;
            }
            this.f53047p.f119921r.m55699X(this.f53048q, true);
            this.f53047p.f119921r.m55701a0();
        }
    }

    public NotificationPageView() {
        super(C10314a.f53025y);
        this.f53015D0 = new LinkedHashSet();
        this.f53016E0 = "";
        this.f53017F0 = "";
        this.f53021J0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AL */
    public final void m54547AL(int i11, Video video) {
        CommentBox commentBox;
        boolean z11;
        this.f53022K0 = video;
        C25010g2 c25010g2 = (C25010g2) m55556SK();
        if (c25010g2 != null && (commentBox = c25010g2.f119921r) != null) {
            boolean z12 = false;
            if (i11 == 1) {
                AbstractC28684a.Companion.m143681o().mo146326a0(1);
                C27417l c27417l = C27417l.f129055a;
                User m140378b = c27417l.m140378b();
                Comment.Identity identity = new Comment.Identity(m140378b.m51234g(), 1, m140378b.m51235h(), m140378b.m51230c(), (String) null, (String) null, (String) null, (String) null, video.m52893i0(), 240, (AbstractC19060k) null);
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
                if (!AbstractC19074t.m100204b(video.m52887f().m50769l(), m140377a.m50769l())) {
                    AbstractC28684a.Companion.m143681o().mo146326a0(2);
                }
                Comment.Identity identity2 = new Comment.Identity(m140377a.m50769l(), 2, m140377a.m50775o(), m140377a.m50754c(), (String) null, (String) null, (String) null, (String) null, video.m52891h0(), 240, (AbstractC19060k) null);
                boolean z13 = !AbstractC19074t.m100204b(video.m52887f().m50769l(), m140377a.m50769l());
                if (AbstractC19074t.m100204b(m140377a.m50765j(), Boolean.TRUE) && AbstractC19074t.m100204b(video.m52887f().m50769l(), m140377a.m50769l())) {
                    z12 = true;
                }
                commentBox.m55697T(identity2, z13, z12);
            }
        }
    }

    /* renamed from: oL */
    private final boolean m54567oL() {
        Set<String> set = this.f53015D0;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str : set) {
            if (AbstractC19074t.m100204b(str, "22") || AbstractC19074t.m100204b(str, "23") || AbstractC19074t.m100204b(str, "24") || AbstractC19074t.m100204b(str, "20")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: pL */
    private final boolean m54568pL() {
        Set<String> set = this.f53015D0;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str : set) {
            if (AbstractC19074t.m100204b(str, "11") || AbstractC19074t.m100204b(str, "30") || AbstractC19074t.m100204b(str, "31")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qL */
    public final void m54569qL(String str) {
        PageBar pageBar;
        PageBar.C10774h m56002y;
        View m56016a;
        View findViewById;
        C18706d c18706d = this.f53013B0;
        if (c18706d != null) {
            Integer valueOf = Integer.valueOf(c18706d.m98651E(str));
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                C25010g2 c25010g2 = (C25010g2) m55556SK();
                if (c25010g2 != null && (pageBar = c25010g2.f119920q) != null && (m56002y = pageBar.m56002y(intValue)) != null && (m56016a = m56002y.m56016a()) != null && (findViewById = m56016a.findViewById(AbstractC27409d.dotRed)) != null) {
                    AbstractC19074t.m100205c(findViewById);
                    AbstractC26112n.m134367H(findViewById);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rL */
    public final boolean m54570rL(int i11) {
        PageBar pageBar;
        PageBar.C10774h m56002y;
        View m56016a;
        View findViewById;
        C25010g2 c25010g2 = (C25010g2) m55556SK();
        if (c25010g2 == null || (pageBar = c25010g2.f119920q) == null || (m56002y = pageBar.m56002y(i11)) == null || (m56016a = m56002y.m56016a()) == null || (findViewById = m56016a.findViewById(AbstractC27409d.dotRed)) == null || !AbstractC26112n.m134380U(findViewById)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: sL */
    public final void m54571sL(String str, boolean z11) {
        String m92652XI;
        Map m131401f;
        int hashCode = str.hashCode();
        if (hashCode != 1568) {
            if (hashCode != 1598) {
                if (hashCode != 1629) {
                    if (hashCode != 1630) {
                        switch (hashCode) {
                            case 1600:
                                if (str.equals("22")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_cmt_tab);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            case 1601:
                                if (str.equals("23")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_like_tab);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            case 1602:
                                if (str.equals("24")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_follow_tab);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            default:
                                m92652XI = null;
                                break;
                        }
                    } else {
                        if (str.equals("31")) {
                            m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_like_tab);
                        }
                        m92652XI = null;
                    }
                } else {
                    if (str.equals("30")) {
                        m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_cmt_tab);
                    }
                    m92652XI = null;
                }
            } else {
                if (str.equals("20")) {
                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_system_tab);
                }
                m92652XI = null;
            }
        } else {
            if (str.equals("11")) {
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_system_tab);
            }
            m92652XI = null;
        }
        if (m92652XI != null) {
            C19205a c19205a = C19205a.f95429a;
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("is_red_dot", Integer.valueOf(z11 ? 1 : 0)));
            c19205a.m100713L(m92652XI, m131401f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tL */
    public static final void m54572tL(C25010g2 c25010g2, View view) {
        AbstractC19074t.m100208f(c25010g2, "$this_run");
        if (c25010g2.f119921r.m55692C()) {
            c25010g2.f119921r.m55690A();
            CommentBox commentBox = c25010g2.f119921r;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            AbstractC26112n.m134374O(commentBox);
            View view2 = c25010g2.f119922s;
            AbstractC19074t.m100207e(view2, "dimContent");
            AbstractC26112n.m134374O(view2);
            return;
        }
        c25010g2.f119921r.m55703x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uL */
    public static final void m54573uL(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wL */
    public final void m54574wL(int i11, boolean z11) {
        C25010g2 c25010g2;
        ViewPager viewPager;
        NotificationView notificationView;
        C18706d c18706d = this.f53013B0;
        if (c18706d != null && (c25010g2 = (C25010g2) m55556SK()) != null && (viewPager = c25010g2.f119926w) != null) {
            Object mo35339k = c18706d.mo35339k(viewPager, i11);
            if (mo35339k instanceof NotificationView) {
                notificationView = (NotificationView) mo35339k;
            } else {
                notificationView = null;
            }
            if (notificationView != null) {
                notificationView.m54626kL(z11);
            }
        }
    }

    /* renamed from: xL */
    private final void m54575xL(Comment comment, boolean z11) {
        C25010g2 c25010g2 = (C25010g2) m55556SK();
        if (c25010g2 != null) {
            if (z11) {
                c25010g2.f119921r.m55702w();
                c25010g2.f119921r.setAttachedVideo(null);
            }
            c25010g2.f119921r.post(new RunnableC10327n(c25010g2, comment));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zL */
    public final void m54576zL(String str) {
        PageBar pageBar;
        PageBar.C10774h m56002y;
        View m56016a;
        View findViewById;
        C18706d c18706d = this.f53013B0;
        if (c18706d != null) {
            Integer valueOf = Integer.valueOf(c18706d.m98651E(str));
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                C25010g2 c25010g2 = (C25010g2) m55556SK();
                if (c25010g2 != null && (pageBar = c25010g2.f119920q) != null && (m56002y = pageBar.m56002y(intValue)) != null && (m56016a = m56002y.m56016a()) != null && (findViewById = m56016a.findViewById(AbstractC27409d.dotRed)) != null) {
                    AbstractC19074t.m100205c(findViewById);
                    AbstractC26112n.m134431w0(findViewById);
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("SOURCE");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f53016E0 = str;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        CommentReceiver commentReceiver = this.f53020I0;
        if (commentReceiver != null) {
            commentReceiver.mo53687g();
        }
        NotificationReceiver notificationReceiver = this.f53014C0;
        if (notificationReceiver != null) {
            notificationReceiver.mo53687g();
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(NotificationPageView.class, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        InterfaceC27218a m92676n2;
        Window window;
        super.mo37584UJ();
        InterfaceC27218a m92676n22 = m92676n2();
        if (m92676n22 != null && !m92676n22.isFinishing() && (m92676n2 = m92676n2()) != null && (window = m92676n2.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        C20196i c20196i = this.f53019H0;
        if (c20196i != null) {
            c20196i.m105320p(new C10316c());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f53021J0 = true;
        C25010g2 c25010g2 = (C25010g2) m55556SK();
        if (c25010g2 != null) {
            c25010g2.f119921r.m55703x();
            CommentBox commentBox = c25010g2.f119921r;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            CommentBox.m55666W(commentBox, 0, 1.0f, false, 4, null);
        }
        C20196i c20196i = this.f53019H0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        int i11;
        String str;
        List m98650D;
        NotiCategories notiCategories;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C10631i.Companion.m55602a().m55601r(this);
        final C25010g2 c25010g2 = (C25010g2) m55556SK();
        if (c25010g2 != null) {
            NotificationReceiver notificationReceiver = new NotificationReceiver(null, null, null, null, new C10320g(), 15, null);
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            notificationReceiver.mo53685d(m92689tK);
            this.f53014C0 = notificationReceiver;
            HeaderLayout root = c25010g2.f119924u.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                FrameLayout root2 = c25010g2.getRoot();
                AbstractC19074t.m100207e(root2, "getRoot(...)");
                layoutParams2.topMargin = AbstractC26112n.m134365F(root2);
                root.setLayoutParams(layoutParams2);
                ImageView imageView = c25010g2.f119924u.f119989q;
                AbstractC19074t.m100207e(imageView, "btnBack");
                AbstractC26112n.m134407k0(imageView, new C10321h());
                EllipsizedTextView ellipsizedTextView = c25010g2.f119924u.f119995w;
                if (AbstractC19074t.m100204b(this.f53016E0, "SOURCE_CHANNEL")) {
                    i11 = AbstractC27413h.zch_page_setting_channel_notification;
                } else {
                    i11 = AbstractC27413h.zch_page_setting_user_notification;
                }
                ellipsizedTextView.setText(i11);
                ViewPager viewPager = c25010g2.f119926w;
                String str2 = this.f53016E0;
                ViewPager viewPager2 = c25010g2.f119926w;
                AbstractC19074t.m100207e(viewPager2, "viePager");
                C17487o0 m92649TI = m92649TI();
                AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
                C18706d c18706d = new C18706d(str2, viewPager2, m92649TI);
                this.f53013B0 = c18706d;
                viewPager.setAdapter(c18706d);
                C18706d c18706d2 = this.f53013B0;
                AbstractC19074t.m100205c(c18706d2);
                viewPager.setOffscreenPageLimit(c18706d2.mo35335g());
                viewPager.setCurrentItem(this.f53018G0);
                C18706d c18706d3 = this.f53013B0;
                if (c18706d3 == null || (m98650D = c18706d3.m98650D()) == null || (notiCategories = (NotiCategories) m98650D.get(viewPager.getCurrentItem())) == null || (str = notiCategories.m51483a()) == null) {
                    str = "";
                }
                this.f53017F0 = str;
                viewPager.addOnPageChangeListener(new C10322i(viewPager, this));
                AbstractC28684a.h hVar = AbstractC28684a.Companion;
                InterfaceC29280a m143681o = hVar.m143681o();
                PageBar pageBar = c25010g2.f119920q;
                pageBar.setOnInstantiatePageViewListener(new C10323j(m143681o));
                pageBar.setOnPageSelectedListener(new C10324k());
                pageBar.setOnDrawIndicatorListener(new C10325l(pageBar, pageBar.getContext()));
                ViewPager viewPager3 = c25010g2.f119926w;
                AbstractC19074t.m100207e(viewPager3, "viePager");
                pageBar.setupWithViewPager(viewPager3);
                c25010g2.f119922s.setOnClickListener(new View.OnClickListener() { // from class: m20.u0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        NotificationPageView.m54572tL(C25010g2.this, view2);
                    }
                });
                c25010g2.f119921r.setOnClickListener(new View.OnClickListener() { // from class: m20.v0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        NotificationPageView.m54573uL(view2);
                    }
                });
                CommentReceiver commentReceiver = new CommentReceiver(new C10326m(), null, null, null, null, new C10317d(), 30, null);
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                commentReceiver.mo53685d(m92689tK2);
                this.f53020I0 = commentReceiver;
                this.f53019H0 = new C20196i(this, false, new C10318e(c25010g2), 2, null);
                CommentBox commentBox = c25010g2.f119921r;
                commentBox.setCallback(new C10319f(commentBox, c25010g2));
                AbstractC19074t.m100205c(commentBox);
                CommentBox.m55666W(commentBox, hVar.m143681o().mo146314P(), 0.0f, false, 2, null);
                commentBox.setCloseOnSend(true);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    /* renamed from: mL */
    public final String m54577mL() {
        return this.f53017F0;
    }

    /* renamed from: nL */
    public final String m54578nL() {
        return this.f53016E0;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.C17487o0.l
    /* renamed from: o7 */
    public void mo35578o7(ZaloView zaloView) {
        C25010g2 c25010g2;
        CommentBox commentBox;
        C25010g2 c25010g22;
        CommentBox commentBox2;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        super.mo35578o7(zaloView);
        if (((zaloView instanceof BaseBottomSheetView) || (zaloView instanceof BasePopupView)) && (c25010g2 = (C25010g2) m55556SK()) != null && (commentBox = c25010g2.f119921r) != null && commentBox.m55694E() && (c25010g22 = (C25010g2) m55556SK()) != null && (commentBox2 = c25010g22.f119921r) != null) {
            commentBox2.m55703x();
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        ViewPager viewPager;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("SOURCE");
            int i11 = 0;
            if (string != null) {
                AbstractC19074t.m100205c(string);
                bVar.m111023b(0, string);
            }
            C25010g2 c25010g2 = (C25010g2) m55556SK();
            if (c25010g2 != null && (viewPager = c25010g2.f119926w) != null) {
                i11 = viewPager.getCurrentItem();
            }
            bVar.m111023b(1, Integer.valueOf(i11));
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (m92649TI().m93012K0() instanceof BaseBottomSheetView) {
            return super.onKeyUp(i11, keyEvent);
        }
        if (i11 == 4) {
            C25010g2 c25010g2 = (C25010g2) m55556SK();
            if (c25010g2 != null) {
                if (c25010g2.f119921r.m55692C()) {
                    c25010g2.f119921r.m55703x();
                    CommentBox commentBox = c25010g2.f119921r;
                    AbstractC19074t.m100207e(commentBox, "boxComment");
                    AbstractC26112n.m134374O(commentBox);
                    View view = c25010g2.f119922s;
                    AbstractC19074t.m100207e(view, "dimContent");
                    AbstractC26112n.m134374O(view);
                    return true;
                }
                finish();
                return true;
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        String str;
        Bundle m92642L3;
        AbstractC19074t.m100208f(bVar, "extras");
        Object m111022a = bVar.m111022a(0);
        Integer num = null;
        if (m111022a instanceof String) {
            str = (String) m111022a;
        } else {
            str = null;
        }
        if (str != null && (m92642L3 = m92642L3()) != null) {
            AbstractC19074t.m100205c(m92642L3);
            AbstractC26102d.m134326a(m92642L3, "SOURCE", str);
        }
        Object m111022a2 = bVar.m111022a(1);
        if (m111022a2 instanceof Integer) {
            num = (Integer) m111022a2;
        }
        if (num != null) {
            this.f53018G0 = num.intValue();
        }
    }

    /* renamed from: vL */
    public final void m54579vL(String str, String str2) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "source");
        InterfaceC29280a m143681o = AbstractC28684a.Companion.m143681o();
        m143681o.mo146335j(false, str);
        if (!this.f53015D0.contains(str)) {
            return;
        }
        this.f53015D0.remove(str);
        if (AbstractC19074t.m100204b(str2, "SOURCE_CHANNEL")) {
            if (!m54567oL()) {
                m143681o.mo146302D(false);
                NotificationReceiver.C10088a c10088a = NotificationReceiver.Companion;
                c10088a.m53754b(false, false);
                if (!m54568pL()) {
                    c10088a.m53755c(false);
                    m143681o.mo146315Q(false);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(str2, "SOURCE_USER") && !m54568pL()) {
            m143681o.mo146324Z(false);
            NotificationReceiver.C10088a c10088a2 = NotificationReceiver.Companion;
            c10088a2.m53756d(false, false);
            if (!m54567oL()) {
                c10088a2.m53755c(false);
                m143681o.mo146315Q(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:            if (fn0.AbstractC19074t.m100204b(r1, r0) == false) goto L14;     */
    /* renamed from: yL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m54580yL(String str, Video video, Comment comment) {
        String str2;
        AbstractC19074t.m100208f(str, "notiId");
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(comment, "mentionCmt");
        C27417l c27417l = C27417l.f129055a;
        if (c27417l.m140377a() != null) {
            if (AbstractC28684a.Companion.m143681o().mo146312N() == 1) {
                String m50769l = video.m52887f().m50769l();
                Channel m140377a = c27417l.m140377a();
                if (m140377a != null) {
                    str2 = m140377a.m50769l();
                } else {
                    str2 = null;
                }
            }
            m54547AL(2, video);
            boolean z11 = !AbstractC19074t.m100204b(this.f53023L0, str);
            this.f53023L0 = str;
            m54575xL(comment, z11);
        }
        m54547AL(1, video);
        boolean z112 = !AbstractC19074t.m100204b(this.f53023L0, str);
        this.f53023L0 = str;
        m54575xL(comment, z112);
    }
}
