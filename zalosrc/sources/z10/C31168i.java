package z10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b10.C2482a;
import b10.C2483b;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.CtaItem;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PagingLoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SendingCommentItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.DescCommentItemLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.utils.other.CommentSource;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mj0.AbstractC23322a;
import p338m2.InterfaceC22715a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C25031m;
import q10.C25035n;
import q10.C25056u;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import z10.C31158d;

/* renamed from: z10.i */
/* loaded from: classes5.dex */
public final class C31168i extends AbstractC31153a0 {
    public static final d Companion = new d(null);

    /* renamed from: A */
    private String f143784A;

    /* renamed from: B */
    private boolean f143785B;

    /* renamed from: C */
    private boolean f143786C;

    /* renamed from: D */
    private final HashMap f143787D;

    /* renamed from: E */
    private int f143788E;

    /* renamed from: F */
    private ArrayList f143789F;

    /* renamed from: G */
    private ArrayList f143790G;

    /* renamed from: u */
    private CommentSource f143791u;

    /* renamed from: v */
    private Section f143792v;

    /* renamed from: w */
    private final Context f143793w;

    /* renamed from: x */
    private b f143794x;

    /* renamed from: y */
    private List f143795y;

    /* renamed from: z */
    private String f143796z;

    /* renamed from: z10.i$a */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
        }

        /* renamed from: i0 */
        public abstract void mo151708i0(Object obj);

        /* renamed from: j0 */
        public void mo151709j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
        }

        /* renamed from: k0 */
        public void mo151710k0() {
        }
    }

    /* renamed from: z10.i$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo54205a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54206b(Comment comment);

        /* renamed from: c */
        void mo54207c(CtaItem ctaItem);

        /* renamed from: d */
        void mo54208d(Comment comment);

        /* renamed from: e */
        void mo54209e(String str);

        /* renamed from: f */
        void mo54210f(String str);

        /* renamed from: g */
        void mo54211g(List list);

        /* renamed from: h */
        void mo54212h(Comment comment, int i11);

        /* renamed from: i */
        void mo54213i();

        /* renamed from: j */
        void mo54214j(Comment.Identity identity, boolean z11);

        /* renamed from: k */
        void mo54215k(Comment comment, String str, int i11, boolean z11);

        /* renamed from: l */
        void mo54216l(Comment.Identity identity, boolean z11);

        /* renamed from: m */
        void mo54217m(Video video);

        /* renamed from: n */
        void mo54218n();

        /* renamed from: o */
        void mo54219o(Comment comment, boolean z11);
    }

    /* renamed from: z10.i$c */
    /* loaded from: classes5.dex */
    public final class c extends a {

        /* renamed from: I */
        private final CommentItem f143797I;

        /* renamed from: J */
        final /* synthetic */ C31168i f143798J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C31168i c31168i, CommentItem commentItem) {
            super(commentItem);
            AbstractC19074t.m100208f(commentItem, "view");
            this.f143798J = c31168i;
            this.f143797I = commentItem;
        }

        @Override // z10.C31168i.a
        /* renamed from: i0 */
        public void mo151708i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            Comment comment = (Comment) obj;
            this.f143797I.m52075i(comment, this.f143798J.m151701s0());
            if (AbstractC19074t.m100204b(comment.m50833g(), this.f143798J.m151698p0())) {
                this.f143798J.m151682Q0(null);
                this.f143797I.m52082q();
            }
        }

        @Override // z10.C31168i.a
        /* renamed from: j0 */
        public void mo151709j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            this.f143797I.m52076j((Comment) obj, list);
        }

        @Override // z10.C31168i.a
        /* renamed from: k0 */
        public void mo151710k0() {
            this.f143797I.m52080n();
            super.mo151710k0();
        }

        /* renamed from: l0 */
        public final CommentItem m151711l0() {
            return this.f143797I;
        }
    }

    /* renamed from: z10.i$d */
    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: z10.i$e */
    /* loaded from: classes5.dex */
    public final class e extends a {

        /* renamed from: I */
        private final C25035n f143799I;

        /* renamed from: J */
        final /* synthetic */ C31168i f143800J;

        /* renamed from: z10.i$e$a */
        /* loaded from: classes5.dex */
        public static final class a implements C31158d.a {

            /* renamed from: a */
            final /* synthetic */ C31168i f143801a;

            a(C31168i c31168i) {
                this.f143801a = c31168i;
            }

            @Override // z10.C31158d.a
            /* renamed from: c */
            public void mo54121c(CtaItem ctaItem) {
                AbstractC19074t.m100208f(ctaItem, "item");
                b m151695l0 = this.f143801a.m151695l0();
                if (m151695l0 != null) {
                    m151695l0.mo54207c(ctaItem);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(C31168i c31168i, C25035n c25035n) {
            super(r2);
            AbstractC19074t.m100208f(c25035n, "binding");
            this.f143800J = c31168i;
            DescCommentItemLayout root = c25035n.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143799I = c25035n;
        }

        @Override // z10.C31168i.a
        /* renamed from: i0 */
        public void mo151708i0(Object obj) {
            C2482a c2482a;
            AbstractC19074t.m100208f(obj, "data");
            if (obj instanceof C2482a) {
                c2482a = (C2482a) obj;
            } else {
                c2482a = null;
            }
            if (c2482a == null) {
                return;
            }
            this.f143799I.getRoot().m55720g(c2482a, new a(this.f143800J));
        }

        /* renamed from: l0 */
        public final C25035n m151712l0() {
            return this.f143799I;
        }
    }

    /* renamed from: z10.i$f */
    /* loaded from: classes5.dex */
    public final class f extends a {

        /* renamed from: I */
        private final C25056u f143802I;

        /* renamed from: J */
        final /* synthetic */ C31168i f143803J;

        /* renamed from: z10.i$f$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C2483b f143804q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2483b c2483b) {
                super(1);
                this.f143804q = c2483b;
            }

            /* renamed from: a */
            public final void m151713a(View view) {
                AbstractC19074t.m100208f(view, "it");
                InterfaceC18494a m12543a = this.f143804q.m12543a();
                if (m12543a != null) {
                    m12543a.mo12V4();
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151713a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(C31168i c31168i, C25056u c25056u) {
            super(r2);
            AbstractC19074t.m100208f(c25056u, "binding");
            this.f143803J = c31168i;
            LinearLayout root = c25056u.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143802I = c25056u;
        }

        @Override // z10.C31168i.a
        /* renamed from: i0 */
        public void mo151708i0(Object obj) {
            C2483b c2483b;
            AbstractC19074t.m100208f(obj, "data");
            if (obj instanceof C2483b) {
                c2483b = (C2483b) obj;
            } else {
                c2483b = null;
            }
            if (c2483b == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f143802I.getRoot().getLayoutParams();
            if (this.f143803J.f143788E <= 0) {
                C31168i c31168i = this.f143803J;
                LinearLayout root = this.f143802I.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                c31168i.f143788E = AbstractC26112n.m134433y(root, AbstractC27407b.zch_item_comment_default_height_inform_item);
            }
            if (this.f143803J.f143788E != layoutParams.height) {
                layoutParams.height = this.f143803J.f143788E;
                this.f143802I.getRoot().setLayoutParams(layoutParams);
            }
            if (c2483b.m12545c() == null) {
                ImageView imageView = this.f143802I.f120316r;
                AbstractC19074t.m100207e(imageView, "errIcon");
                AbstractC26112n.m134367H(imageView);
            } else {
                this.f143802I.f120316r.setImageResource(c2483b.m12545c().intValue());
                ImageView imageView2 = this.f143802I.f120316r;
                AbstractC19074t.m100207e(imageView2, "errIcon");
                AbstractC26112n.m134431w0(imageView2);
            }
            String m12544b = c2483b.m12544b();
            if (m12544b != null && m12544b.length() != 0 && c2483b.m12543a() != null) {
                SimpleShadowTextView simpleShadowTextView = this.f143802I.f120315q;
                AbstractC19074t.m100207e(simpleShadowTextView, "errAction");
                AbstractC26112n.m134431w0(simpleShadowTextView);
                this.f143802I.f120315q.setText(c2483b.m12544b());
                SimpleShadowTextView simpleShadowTextView2 = this.f143802I.f120315q;
                AbstractC19074t.m100207e(simpleShadowTextView2, "errAction");
                AbstractC26112n.m134407k0(simpleShadowTextView2, new a(c2483b));
            } else {
                SimpleShadowTextView simpleShadowTextView3 = this.f143802I.f120315q;
                AbstractC19074t.m100207e(simpleShadowTextView3, "errAction");
                AbstractC26112n.m134367H(simpleShadowTextView3);
            }
            String m12546d = c2483b.m12546d();
            if (m12546d != null && m12546d.length() != 0) {
                SimpleShadowTextView simpleShadowTextView4 = this.f143802I.f120317s;
                AbstractC19074t.m100207e(simpleShadowTextView4, "errMessage");
                AbstractC26112n.m134431w0(simpleShadowTextView4);
                SimpleShadowTextView simpleShadowTextView5 = this.f143802I.f120318t;
                AbstractC19074t.m100207e(simpleShadowTextView5, "errMessageFooter");
                AbstractC26112n.m134367H(simpleShadowTextView5);
                this.f143802I.f120317s.setText(c2483b.m12546d());
            } else {
                SimpleShadowTextView simpleShadowTextView6 = this.f143802I.f120317s;
                AbstractC19074t.m100207e(simpleShadowTextView6, "errMessage");
                AbstractC26112n.m134367H(simpleShadowTextView6);
                SimpleShadowTextView simpleShadowTextView7 = this.f143802I.f120318t;
                AbstractC19074t.m100207e(simpleShadowTextView7, "errMessageFooter");
                AbstractC26112n.m134367H(simpleShadowTextView7);
            }
            String m12547e = c2483b.m12547e();
            if (m12547e != null && m12547e.length() != 0) {
                SimpleShadowTextView simpleShadowTextView8 = this.f143802I.f120319u;
                AbstractC19074t.m100207e(simpleShadowTextView8, "errTitle");
                AbstractC26112n.m134431w0(simpleShadowTextView8);
                this.f143802I.f120319u.setText(c2483b.m12547e());
                return;
            }
            SimpleShadowTextView simpleShadowTextView9 = this.f143802I.f120319u;
            AbstractC19074t.m100207e(simpleShadowTextView9, "errTitle");
            AbstractC26112n.m134367H(simpleShadowTextView9);
        }

        @Override // z10.C31168i.a
        /* renamed from: j0 */
        public void mo151709j0(Object obj, List list) {
            Object m131206f0;
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            m131206f0 = AbstractC25332a0.m131206f0(list);
            if (AbstractC19074t.m100204b(m131206f0, 1)) {
                ViewGroup.LayoutParams layoutParams = this.f143802I.getRoot().getLayoutParams();
                layoutParams.height = this.f143803J.f143788E;
                this.f143802I.getRoot().setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: z10.i$g */
    /* loaded from: classes5.dex */
    public final class g extends a {

        /* renamed from: I */
        private final C25031m f143805I;

        /* renamed from: J */
        final /* synthetic */ C31168i f143806J;

        /* renamed from: z10.i$g$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31168i f143807q;

            /* renamed from: r */
            final /* synthetic */ Object f143808r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31168i c31168i, Object obj) {
                super(1);
                this.f143807q = c31168i;
                this.f143808r = obj;
            }

            /* renamed from: a */
            public final void m151714a(View view) {
                AbstractC19074t.m100208f(view, "it");
                b m151695l0 = this.f143807q.m151695l0();
                if (m151695l0 != null) {
                    m151695l0.mo54208d((Comment) this.f143808r);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151714a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: z10.i$g$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31168i f143809q;

            /* renamed from: r */
            final /* synthetic */ Object f143810r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C31168i c31168i, Object obj) {
                super(1);
                this.f143809q = c31168i;
                this.f143810r = obj;
            }

            /* renamed from: a */
            public final void m151715a(View view) {
                AbstractC19074t.m100208f(view, "it");
                b m151695l0 = this.f143809q.m151695l0();
                if (m151695l0 != null) {
                    m151695l0.mo54208d((Comment) this.f143810r);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151715a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(C31168i c31168i, C25031m c25031m) {
            super(r2);
            AbstractC19074t.m100208f(c25031m, "binding");
            this.f143806J = c31168i;
            FrameLayout root = c25031m.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143805I = c25031m;
        }

        @Override // z10.C31168i.a
        /* renamed from: i0 */
        public void mo151708i0(Object obj) {
            int i11;
            List m51168m;
            AbstractC19074t.m100208f(obj, "data");
            BlinkTextView blinkTextView = this.f143805I.f120087q;
            View view = this.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            int i12 = AbstractC27413h.zch_item_comment_see_more;
            Object[] objArr = new Object[1];
            Comment comment = (Comment) obj;
            long m50837k = comment.m50837k();
            Section m50840n = comment.m50840n();
            if (m50840n != null && (m51168m = m50840n.m51168m()) != null) {
                i11 = m51168m.size();
            } else {
                i11 = 0;
            }
            objArr[0] = AbstractC26105g.m134334a(m50837k - i11);
            blinkTextView.setText(AbstractC26112n.m134366G(view, i12, objArr));
            BlinkTextView blinkTextView2 = this.f143805I.f120087q;
            AbstractC19074t.m100207e(blinkTextView2, "txtOther");
            AbstractC26112n.m134407k0(blinkTextView2, new a(this.f143806J, obj));
        }

        @Override // z10.C31168i.a
        /* renamed from: j0 */
        public void mo151709j0(Object obj, List list) {
            int i11;
            List m51168m;
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            BlinkTextView blinkTextView = this.f143805I.f120087q;
            View view = this.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            int i12 = AbstractC27413h.zch_item_comment_see_more;
            Object[] objArr = new Object[1];
            Comment comment = (Comment) obj;
            long m50837k = comment.m50837k();
            Section m50840n = comment.m50840n();
            if (m50840n != null && (m51168m = m50840n.m51168m()) != null) {
                i11 = m51168m.size();
            } else {
                i11 = 0;
            }
            objArr[0] = AbstractC26105g.m134334a(m50837k - i11);
            blinkTextView.setText(AbstractC26112n.m134366G(view, i12, objArr));
            BlinkTextView blinkTextView2 = this.f143805I.f120087q;
            AbstractC19074t.m100207e(blinkTextView2, "txtOther");
            AbstractC26112n.m134407k0(blinkTextView2, new b(this.f143806J, obj));
        }
    }

    /* renamed from: z10.i$h */
    /* loaded from: classes5.dex */
    public final class h extends a {

        /* renamed from: I */
        private final SendingCommentItem f143811I;

        /* renamed from: J */
        final /* synthetic */ C31168i f143812J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C31168i c31168i, SendingCommentItem sendingCommentItem) {
            super(sendingCommentItem);
            AbstractC19074t.m100208f(sendingCommentItem, "view");
            this.f143812J = c31168i;
            this.f143811I = sendingCommentItem;
        }

        @Override // z10.C31168i.a
        /* renamed from: i0 */
        public void mo151708i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            this.f143811I.m52342d((Comment) obj);
        }

        @Override // z10.C31168i.a
        /* renamed from: j0 */
        public void mo151709j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            this.f143811I.m52343e((Comment) obj, list);
        }

        @Override // z10.C31168i.a
        /* renamed from: k0 */
        public void mo151710k0() {
            this.f143811I.m52344g();
            super.mo151710k0();
        }

        /* renamed from: l0 */
        public final SendingCommentItem m151716l0() {
            return this.f143811I;
        }
    }

    /* renamed from: z10.i$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final i f143813q = new i();

        i() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(Comment comment) {
            AbstractC19074t.m100208f(comment, "cmt");
            return comment.m50833g();
        }
    }

    /* renamed from: z10.i$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final j f143814q = new j();

        j() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(Comment comment) {
            AbstractC19074t.m100208f(comment, "comment");
            return comment.m50833g();
        }
    }

    /* renamed from: z10.i$k */
    /* loaded from: classes5.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final k f143815q = new k();

        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m151719a(List list) {
            AbstractC19074t.m100208f(list, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151719a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.i$l */
    /* loaded from: classes5.dex */
    public static final class l implements CommentItem.InterfaceC9570a {

        /* renamed from: a */
        final /* synthetic */ c f143816a;

        /* renamed from: b */
        final /* synthetic */ C31168i f143817b;

        l(c cVar, C31168i c31168i) {
            this.f143816a = cVar;
            this.f143817b = c31168i;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem.InterfaceC9570a
        /* renamed from: a */
        public void mo52085a(Comment.Identity identity) {
            AbstractC19074t.m100208f(identity, "identity");
            if (identity.m50859i()) {
                b m151695l0 = this.f143817b.m151695l0();
                if (m151695l0 != null) {
                    m151695l0.mo54214j(identity, true);
                    return;
                }
                return;
            }
            b m151695l02 = this.f143817b.m151695l0();
            if (m151695l02 != null) {
                m151695l02.mo54216l(identity, true);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem.InterfaceC9570a
        /* renamed from: b */
        public void mo52086b() {
            List m131185M0;
            String string;
            List m131185M02;
            Integer valueOf = Integer.valueOf(this.f143816a.m9929A());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                m131185M0 = AbstractC25332a0.m131185M0(this.f143817b.m151699q0());
                ArrayList arrayList = new ArrayList();
                for (Object obj : m131185M0) {
                    if (((Number) obj).intValue() != intValue) {
                        arrayList.add(obj);
                    }
                }
                this.f143817b.m151699q0().clear();
                if (!arrayList.isEmpty()) {
                    b m151695l0 = this.f143817b.m151695l0();
                    if (m151695l0 != null) {
                        m131185M02 = AbstractC25332a0.m131185M0(arrayList);
                        m151695l0.mo54211g(m131185M02);
                    }
                } else {
                    this.f143817b.m151699q0().addAll(arrayList);
                }
                this.f143817b.m151699q0().add(Integer.valueOf(intValue));
                String m56274g = this.f143817b.m151701s0().m56274g();
                if (m56274g != null) {
                    int hashCode = m56274g.hashCode();
                    if (hashCode != -507563187) {
                        if (hashCode != 596808987) {
                            if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                                string = this.f143816a.m151711l0().getResources().getString(AbstractC27413h.zch_action_key_friend_see_author_like);
                            }
                        } else if (m56274g.equals("SOURCE_FOR_U")) {
                            string = this.f143816a.m151711l0().getResources().getString(AbstractC27413h.zch_action_key_foru_see_author_like);
                        }
                    } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                        string = this.f143816a.m151711l0().getResources().getString(AbstractC27413h.zch_action_key_following_see_author_like);
                    }
                    AbstractC19074t.m100205c(string);
                    C19205a.m100675M(C19205a.f95429a, string, null, 2, null);
                }
                string = this.f143816a.m151711l0().getResources().getString(AbstractC27413h.zch_action_key_player_see_author_like);
                AbstractC19074t.m100205c(string);
                C19205a.m100675M(C19205a.f95429a, string, null, 2, null);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem.InterfaceC9570a
        /* renamed from: c */
        public void mo52087c() {
            Video m50828b;
            b m151695l0;
            Integer valueOf = Integer.valueOf(this.f143816a.m9929A());
            Comment comment = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj = this.f143817b.f143790G.get(valueOf.intValue());
                if (obj instanceof Comment) {
                    comment = (Comment) obj;
                }
                if (comment != null && (m50828b = comment.m50828b()) != null && (m151695l0 = this.f143817b.m151695l0()) != null) {
                    m151695l0.mo54217m(m50828b);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem.InterfaceC9570a
        /* renamed from: d */
        public void mo52088d() {
            b m151695l0;
            Integer valueOf = Integer.valueOf(this.f143816a.m9929A());
            Comment comment = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj = this.f143817b.f143790G.get(intValue);
                if (obj instanceof Comment) {
                    comment = (Comment) obj;
                }
                if (comment != null && (m151695l0 = this.f143817b.m151695l0()) != null) {
                    m151695l0.mo54212h(comment, intValue);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem.InterfaceC9570a
        /* renamed from: e */
        public void mo52089e(String str, boolean z11) {
            b m151695l0;
            AbstractC19074t.m100208f(str, "fullContent");
            Integer valueOf = Integer.valueOf(this.f143816a.m9929A());
            Comment comment = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj = this.f143817b.f143790G.get(intValue);
                if (obj instanceof Comment) {
                    comment = (Comment) obj;
                }
                if (comment != null && (m151695l0 = this.f143817b.m151695l0()) != null) {
                    m151695l0.mo54215k(comment, str, intValue, z11);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem.InterfaceC9570a
        /* renamed from: f */
        public void mo52090f() {
            b m151695l0;
            Integer valueOf = Integer.valueOf(this.f143816a.m9929A());
            Comment comment = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj = this.f143817b.f143790G.get(valueOf.intValue());
                if (obj instanceof Comment) {
                    comment = (Comment) obj;
                }
                if (comment != null && (m151695l0 = this.f143817b.m151695l0()) != null) {
                    m151695l0.mo54219o(comment, !comment.m50847x());
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem.InterfaceC9570a
        /* renamed from: g */
        public void mo52091g() {
            b m151695l0;
            Integer valueOf = Integer.valueOf(this.f143816a.m9929A());
            Comment comment = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj = this.f143817b.f143790G.get(intValue);
                if (obj instanceof Comment) {
                    comment = (Comment) obj;
                }
                if (comment != null && (m151695l0 = this.f143817b.m151695l0()) != null) {
                    m151695l0.mo54212h(comment, intValue);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.CommentItem.InterfaceC9570a
        /* renamed from: t0 */
        public void mo52092t0() {
            Integer valueOf = Integer.valueOf(this.f143816a.m9929A());
            Comment comment = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj = this.f143817b.f143790G.get(valueOf.intValue());
                if (obj instanceof Comment) {
                    comment = (Comment) obj;
                }
                if (comment == null) {
                    return;
                }
                if (comment.m50838l().m50859i()) {
                    b m151695l0 = this.f143817b.m151695l0();
                    if (m151695l0 != null) {
                        m151695l0.mo54214j(comment.m50838l(), false);
                        return;
                    }
                    return;
                }
                b m151695l02 = this.f143817b.m151695l0();
                if (m151695l02 != null) {
                    m151695l02.mo54216l(comment.m50838l(), false);
                }
            }
        }
    }

    /* renamed from: z10.i$m */
    /* loaded from: classes5.dex */
    public static final class m implements SendingCommentItem.InterfaceC9652a {

        /* renamed from: b */
        final /* synthetic */ h f143819b;

        m(h hVar) {
            this.f143819b = hVar;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SendingCommentItem.InterfaceC9652a
        /* renamed from: b */
        public void mo52346b(Comment comment) {
            String string;
            Map m131407l;
            AbstractC19074t.m100208f(comment, "comment");
            b m151695l0 = C31168i.this.m151695l0();
            if (m151695l0 != null) {
                m151695l0.mo54206b(comment);
            }
            C31168i.this.m151674G0(comment.m50833g(), 1);
            String m56274g = C31168i.this.m151701s0().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            string = this.f143819b.m151716l0().getResources().getString(AbstractC27413h.zch_action_key_friend_comment_retry);
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        string = this.f143819b.m151716l0().getResources().getString(AbstractC27413h.zch_action_key_foru_comment_retry);
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    string = this.f143819b.m151716l0().getResources().getString(AbstractC27413h.zch_action_key_following_comment_retry);
                }
                AbstractC19074t.m100205c(string);
                C19205a c19205a = C19205a.f95429a;
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", C31168i.this.m151701s0().m56271d()), AbstractC24866w.m129235a("comment_content", String.valueOf(comment.m50831e())));
                c19205a.m100713L(string, m131407l);
            }
            string = this.f143819b.m151716l0().getResources().getString(AbstractC27413h.zch_action_key_player_comment_retry);
            AbstractC19074t.m100205c(string);
            C19205a c19205a2 = C19205a.f95429a;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", C31168i.this.m151701s0().m56271d()), AbstractC24866w.m129235a("comment_content", String.valueOf(comment.m50831e())));
            c19205a2.m100713L(string, m131407l);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SendingCommentItem.InterfaceC9652a
        /* renamed from: c */
        public void mo52347c(Comment comment) {
            String string;
            Map m131407l;
            AbstractC19074t.m100208f(comment, "comment");
            C31168i.m151667z0(C31168i.this, comment.m50833g(), null, 2, null);
            String m56274g = C31168i.this.m151701s0().m56274g();
            if (m56274g != null) {
                int hashCode = m56274g.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m56274g.equals("SOURCE_FRIEND")) {
                            string = this.f143819b.m151716l0().getResources().getString(AbstractC27413h.zch_action_key_friend_comment_error_del);
                        }
                    } else if (m56274g.equals("SOURCE_FOR_U")) {
                        string = this.f143819b.m151716l0().getResources().getString(AbstractC27413h.zch_action_key_foru_comment_error_del);
                    }
                } else if (m56274g.equals("SOURCE_FOLLOWING")) {
                    string = this.f143819b.m151716l0().getResources().getString(AbstractC27413h.zch_action_key_following_comment_error_del);
                }
                AbstractC19074t.m100205c(string);
                C19205a c19205a = C19205a.f95429a;
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", C31168i.this.m151701s0().m56271d()), AbstractC24866w.m129235a("comment_content", String.valueOf(comment.m50831e())));
                c19205a.m100713L(string, m131407l);
            }
            string = this.f143819b.m151716l0().getResources().getString(AbstractC27413h.zch_action_key_player_comment_error_del);
            AbstractC19074t.m100205c(string);
            C19205a c19205a2 = C19205a.f95429a;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", C31168i.this.m151701s0().m56271d()), AbstractC24866w.m129235a("comment_content", String.valueOf(comment.m50831e())));
            c19205a2.m100713L(string, m131407l);
        }
    }

    /* renamed from: z10.i$n */
    /* loaded from: classes5.dex */
    public /* synthetic */ class n extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final n f143820y = new n();

        n() {
            super(3, C25031m.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemCommentOtherBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151720h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25031m m151720h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25031m.m129882c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: z10.i$o */
    /* loaded from: classes5.dex */
    public /* synthetic */ class o extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final o f143821y = new o();

        o() {
            super(3, C25035n.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemDescCommentBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151721h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25035n m151721h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25035n.m129894c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: z10.i$p */
    /* loaded from: classes5.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: r */
        final /* synthetic */ C25035n f143823r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(C25035n c25035n) {
            super(4);
            this.f143823r = c25035n;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m151722a((Integer) obj, ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m151722a(Integer num, int i11, boolean z11, boolean z12) {
            int m134433y;
            Object m131217q0;
            C2483b c2483b;
            int m134433y2;
            Object m131217q02;
            if (z11) {
                if (C31168i.this.m151704v0()) {
                    m131217q0 = AbstractC25332a0.m131217q0(C31168i.this.f143790G);
                    if (m131217q0 instanceof C2483b) {
                        c2483b = (C2483b) m131217q0;
                    } else {
                        c2483b = null;
                    }
                    if (c2483b == null) {
                        return;
                    }
                    C31168i c31168i = C31168i.this;
                    if (num != null) {
                        m134433y2 = num.intValue() - i11;
                    } else {
                        DescCommentItemLayout root = this.f143823r.getRoot();
                        AbstractC19074t.m100207e(root, "getRoot(...)");
                        m134433y2 = AbstractC26112n.m134433y(root, AbstractC27407b.zch_item_comment_default_height_inform_item);
                    }
                    c31168i.f143788E = m134433y2;
                    m131217q02 = AbstractC25332a0.m131217q0(C31168i.this.f143789F);
                    Integer num2 = (Integer) m131217q02;
                    if (num2 != null && num2.intValue() == 7) {
                        if (c2483b.m12548f()) {
                            DescCommentItemLayout root2 = this.f143823r.getRoot();
                            AbstractC19074t.m100207e(root2, "getRoot(...)");
                            if (C31168i.this.f143788E < AbstractC26112n.m134433y(root2, AbstractC27407b.zch_item_comment_small_default_height_inform_item)) {
                                C31168i c31168i2 = C31168i.this;
                                DescCommentItemLayout root3 = this.f143823r.getRoot();
                                AbstractC19074t.m100207e(root3, "getRoot(...)");
                                c31168i2.f143788E = AbstractC26112n.m134433y(root3, AbstractC27407b.zch_item_comment_default_height_inform_item);
                                return;
                            }
                            return;
                        }
                        C31168i c31168i3 = C31168i.this;
                        DescCommentItemLayout root4 = this.f143823r.getRoot();
                        AbstractC19074t.m100207e(root4, "getRoot(...)");
                        c31168i3.f143788E = AbstractC26112n.m134433y(root4, AbstractC27407b.zch_item_comment_default_height_inform_item);
                        return;
                    }
                    return;
                }
                return;
            }
            if (C31168i.this.mo10003k() == 2) {
                C31168i c31168i4 = C31168i.this;
                if (num != null) {
                    m134433y = num.intValue() - i11;
                } else {
                    DescCommentItemLayout root5 = this.f143823r.getRoot();
                    AbstractC19074t.m100207e(root5, "getRoot(...)");
                    m134433y = AbstractC26112n.m134433y(root5, AbstractC27407b.zch_item_comment_default_height_inform_item);
                }
                c31168i4.f143788E = m134433y;
            }
        }
    }

    /* renamed from: z10.i$q */
    /* loaded from: classes5.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18505l {
        q() {
            super(1);
        }

        /* renamed from: a */
        public final void m151723a(String str) {
            AbstractC19074t.m100208f(str, "it");
            b m151695l0 = C31168i.this.m151695l0();
            if (m151695l0 != null) {
                m151695l0.mo54210f(str);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151723a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.i$r */
    /* loaded from: classes5.dex */
    public static final class r extends AbstractC19075u implements InterfaceC18505l {
        r() {
            super(1);
        }

        /* renamed from: a */
        public final void m151724a(String str) {
            AbstractC19074t.m100208f(str, "it");
            b m151695l0 = C31168i.this.m151695l0();
            if (m151695l0 != null) {
                m151695l0.mo54209e(str);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151724a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.i$s */
    /* loaded from: classes5.dex */
    public static final class s extends AbstractC19075u implements InterfaceC18505l {
        s() {
            super(1);
        }

        /* renamed from: a */
        public final void m151725a(boolean z11) {
            C31168i.this.m151680O0(true);
            b m151695l0 = C31168i.this.m151695l0();
            if (m151695l0 != null) {
                m151695l0.mo54213i();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151725a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.i$t */
    /* loaded from: classes5.dex */
    public /* synthetic */ class t extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final t f143827y = new t();

        t() {
            super(3, C25056u.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemInformCommentBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151726h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25056u m151726h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25056u.m129943c(layoutInflater, viewGroup, z11);
        }
    }

    public /* synthetic */ C31168i(CommentSource commentSource, Section section, Context context, int i11, AbstractC19060k abstractC19060k) {
        this(commentSource, (i11 & 2) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section, context);
    }

    /* renamed from: K0 */
    public static final void m151653K0(C31168i c31168i, View view) {
        AbstractC19074t.m100208f(c31168i, "this$0");
        b bVar = c31168i.f143794x;
        if (bVar != null) {
            bVar.mo54218n();
        }
    }

    /* renamed from: M0 */
    private final void m151654M0() {
        Object m131217q0;
        m131217q0 = AbstractC25332a0.m131217q0(this.f143789F);
        Integer num = (Integer) m131217q0;
        if (num != null && num.intValue() == 7) {
            AbstractC25378x.m131546H(this.f143789F);
            AbstractC25378x.m131546H(this.f143790G);
            m10017y(this.f143789F.size() - 1);
        }
    }

    /* renamed from: T0 */
    private final void m151658T0(int i11, Comment comment, List list, List list2, List list3, List list4, List list5, List list6) {
        Object m131207g0;
        Object m131207g02;
        boolean z11;
        Comment comment2;
        String str;
        Comment comment3;
        int i12;
        boolean z12;
        int size = this.f143790G.size();
        for (int i13 = 0; i13 < size; i13++) {
            m131207g0 = AbstractC25332a0.m131207g0(this.f143790G, i13);
            if (m131207g0 != null) {
                m131207g02 = AbstractC25332a0.m131207g0(this.f143789F, i13);
                Integer num = (Integer) m131207g02;
                if (num != null) {
                    int intValue = num.intValue();
                    boolean z13 = true;
                    if (intValue == 6) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z14 = m131207g0 instanceof Comment;
                    String str2 = null;
                    if (z14) {
                        comment2 = (Comment) m131207g0;
                    } else {
                        comment2 = null;
                    }
                    if (comment2 != null) {
                        str = comment2.m50839m();
                    } else {
                        str = null;
                    }
                    boolean m100204b = AbstractC19074t.m100204b(str, comment.m50833g());
                    if (z14) {
                        comment3 = (Comment) m131207g0;
                    } else {
                        comment3 = null;
                    }
                    if (comment3 != null) {
                        str2 = comment3.m50833g();
                    }
                    if (AbstractC19074t.m100204b(str2, comment.m50833g()) && intValue == 2) {
                        i12 = i11;
                        z12 = true;
                    } else {
                        i12 = i11;
                        z12 = false;
                    }
                    if (i13 != i12) {
                        z13 = false;
                    }
                    if (z11) {
                        list5.add(m131207g0);
                        list6.add(Integer.valueOf(intValue));
                    } else {
                        if (!m100204b && !z12) {
                            if (!z13) {
                                list3.add(m131207g0);
                                list4.add(Integer.valueOf(intValue));
                            }
                        }
                        list.add(m131207g0);
                        list2.add(Integer.valueOf(intValue));
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: U0 */
    private final void m151660U0(String str) {
        Object m131207g0;
        Object m131207g02;
        Comment comment;
        if (this.f143786C) {
            m131207g0 = AbstractC25332a0.m131207g0(this.f143789F, r0.size() - 2);
            Integer num = (Integer) m131207g0;
            m131207g02 = AbstractC25332a0.m131207g0(this.f143790G, this.f143789F.size() - 2);
            if (m131207g02 instanceof Comment) {
                comment = (Comment) m131207g02;
            } else {
                comment = null;
            }
            if (comment != null && num != null && num.intValue() == 0 && AbstractC19074t.m100204b(comment.m50833g(), str) && mo10003k() - 2 > 0) {
                m10009q(mo10003k() - 2);
            }
        }
    }

    /* renamed from: X */
    public static /* synthetic */ void m151662X(C31168i c31168i, ArrayList arrayList, ArrayList arrayList2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = null;
        }
        if ((i11 & 2) != 0) {
            arrayList2 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c31168i.m151685W(arrayList, arrayList2, z11);
    }

    /* renamed from: Z */
    private final void m151663Z() {
        PagingLoadMoreInfo pagingLoadMoreInfo;
        String str = this.f143784A;
        LoadMoreInfo m51169n = this.f143792v.m51169n();
        if (m51169n instanceof PagingLoadMoreInfo) {
            pagingLoadMoreInfo = (PagingLoadMoreInfo) m51169n;
        } else {
            pagingLoadMoreInfo = null;
        }
        boolean z11 = false;
        if (pagingLoadMoreInfo != null && pagingLoadMoreInfo.m51094c()) {
            z11 = true;
        }
        if ((!z11) && str != null) {
            this.f143786C = true;
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m151664b0(C31168i c31168i, Integer num, String str, String str2, String str3, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            interfaceC18494a = null;
        }
        c31168i.m151687a0(num, str, str2, str3, interfaceC18494a);
    }

    /* renamed from: h0 */
    private final void m151665h0(Comment comment, int i11, List list, List list2) {
        Section section;
        int i12;
        Object m131217q0;
        Object m131217q02;
        Comment comment2;
        Object m131207g0;
        Object m131207g02;
        Comment comment3;
        String str;
        C24860q c24860q = (C24860q) this.f143787D.get(comment.m50833g());
        if (c24860q != null) {
            Section section2 = (Section) c24860q.m129215c();
            if (section2 != null) {
                section = Section.m51160k(section2, null, 1, null);
            } else {
                section = null;
            }
            comment.m50824S(section);
            comment.m50822Q(((Number) c24860q.m129216d()).longValue());
            Section m50840n = comment.m50840n();
            if (m50840n != null) {
                i12 = m50840n.m51175w() + 1;
            } else {
                i12 = Integer.MAX_VALUE;
            }
            if (i12 < list.size()) {
                m131217q0 = AbstractC25332a0.m131217q0(list2);
                Integer num = (Integer) m131217q0;
                if (num != null && num.intValue() == 1) {
                    list2.set(list2.size() - 1, 2);
                    list.set(list2.size() - 1, comment);
                } else if (num != null && num.intValue() == 2) {
                    m131217q02 = AbstractC25332a0.m131217q0(list);
                    if (m131217q02 instanceof Comment) {
                        comment2 = (Comment) m131217q02;
                    } else {
                        comment2 = null;
                    }
                    if (comment2 != null) {
                        comment2.m50824S(comment.m50840n());
                    }
                }
                int size = list.size() - 1;
                int i13 = 0;
                if (i12 <= size) {
                    while (true) {
                        m131207g0 = AbstractC25332a0.m131207g0(list, size);
                        if (m131207g0 != null) {
                            m131207g02 = AbstractC25332a0.m131207g0(list2, size);
                            Integer num2 = (Integer) m131207g02;
                            if (num2 == null) {
                                break;
                            }
                            int intValue = num2.intValue();
                            if (m131207g0 instanceof Comment) {
                                comment3 = (Comment) m131207g0;
                            } else {
                                comment3 = null;
                            }
                            if (comment3 != null) {
                                str = comment3.m50839m();
                            } else {
                                str = null;
                            }
                            if (AbstractC19074t.m100204b(str, comment.m50833g()) && intValue == 1) {
                                list.remove(size);
                                list2.remove(size);
                                int i14 = i11 + size;
                                this.f143790G.remove(i14);
                                this.f143789F.remove(i14);
                                i13++;
                            }
                            if (size == i12) {
                                break;
                            } else {
                                size--;
                            }
                        } else {
                            break;
                        }
                    }
                }
                m10016x(i11 + i12, i13);
                this.f143787D.put(comment.m50833g(), null);
            }
        }
    }

    /* renamed from: j0 */
    public static /* synthetic */ Comment m151666j0(C31168i c31168i, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c31168i.m151693i0(str, z11);
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m151667z0(C31168i c31168i, String str, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC18505l = k.f143815q;
        }
        c31168i.m151707y0(str, interfaceC18505l);
    }

    /* renamed from: A0 */
    public final void m151668A0(Comment comment) {
        Object m131206f0;
        int i11;
        Integer m50843q;
        AbstractC19074t.m100208f(comment, "comment");
        m131206f0 = AbstractC25332a0.m131206f0(this.f143789F);
        Integer num = (Integer) m131206f0;
        if (num != null && num.intValue() == 6) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (comment.m50843q() != null && ((m50843q = comment.m50843q()) == null || m50843q.intValue() != 0)) {
            this.f143789F.add(i11, 3);
            this.f143790G.add(i11, comment);
        } else {
            Section section = this.f143792v;
            ArrayList arrayList = new ArrayList(section.m51168m());
            arrayList.add(0, comment);
            section.m51172q(arrayList);
            section.m51174u(section.m51170o() + 1);
            this.f143789F.add(i11, 0);
            this.f143790G.add(i11, comment);
        }
        m151654M0();
        m151663Z();
        if (i11 == 1 && this.f143786C && mo10003k() > 0) {
            m10009q(0);
        }
        m10011s(i11);
    }

    /* renamed from: B0 */
    public final void m151669B0(Comment.Identity identity) {
        Comment comment;
        AbstractC19074t.m100208f(identity, "identity");
        int i11 = 0;
        for (Object obj : this.f143789F) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            int intValue = ((Number) obj).intValue();
            if (intValue == 0 || intValue == 1) {
                Object obj2 = this.f143790G.get(i11);
                Comment comment2 = null;
                if (obj2 instanceof Comment) {
                    comment = (Comment) obj2;
                } else {
                    comment = null;
                }
                if (comment != null) {
                    if (comment.m50838l().m50856f() == identity.m50856f() && AbstractC19074t.m100204b(comment.m50838l().m50854d(), identity.m50854d())) {
                        comment2 = comment;
                    }
                    if (comment2 != null && comment2.m50838l().m50858h() != identity.m50858h()) {
                        comment2.m50838l().m50863m(identity.m50858h());
                        m10009q(i11);
                    }
                }
            }
            i11 = i12;
        }
    }

    /* renamed from: C0 */
    public final void m151670C0(String str, boolean z11) {
        Comment comment;
        List m131496e;
        AbstractC19074t.m100208f(str, "commentId");
        int i11 = 0;
        for (Object obj : this.f143789F) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            int intValue = ((Number) obj).intValue();
            int i13 = 1;
            if (intValue == 0 || intValue == 1) {
                Object obj2 = this.f143790G.get(i11);
                Comment comment2 = null;
                if (obj2 instanceof Comment) {
                    comment = (Comment) obj2;
                } else {
                    comment = null;
                }
                if (comment == null) {
                    continue;
                } else {
                    if (AbstractC19074t.m100204b(comment.m50833g(), str)) {
                        comment2 = comment;
                    }
                    if (comment2 != null) {
                        if (comment2.m50847x() != z11) {
                            comment2.m50817J(z11);
                            long m50836j = comment2.m50836j();
                            if (!z11) {
                                i13 = -1;
                            }
                            comment2.m50821O(m50836j + i13);
                            if (this.f143791u.m56282o()) {
                                comment2.m50818K(z11);
                            }
                            m131496e = AbstractC25366r.m131496e("LIKE");
                            m10010r(i11, m131496e);
                            return;
                        }
                        return;
                    }
                }
            }
            i11 = i12;
        }
    }

    /* renamed from: D0 */
    public final void m151671D0(boolean z11, int i11, Integer num, boolean z12) {
        Object m131207g0;
        Object m131207g02;
        Comment comment;
        List m131222v0;
        List m131222v02;
        List m131222v03;
        List m131222v04;
        Object m131206f0;
        int i12;
        Object m131207g03;
        Comment comment2 = null;
        if (z11) {
            m131207g02 = AbstractC25332a0.m131207g0(this.f143790G, i11);
            if (m131207g02 instanceof Comment) {
                comment = (Comment) m131207g02;
            } else {
                comment = null;
            }
            if (comment == null) {
                return;
            }
            comment.m50814F(Boolean.TRUE);
            if (num != null) {
                int intValue = num.intValue();
                m131207g03 = AbstractC25332a0.m131207g0(this.f143790G, intValue);
                if (m131207g03 instanceof Comment) {
                    comment2 = (Comment) m131207g03;
                }
                if (comment2 != null) {
                    comment2.m50814F(Boolean.FALSE);
                }
                m10009q(intValue);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            m151658T0(i11, comment, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
            m151665h0(comment, i11, arrayList, arrayList2);
            m131222v0 = AbstractC25332a0.m131222v0(arrayList5, arrayList);
            m131222v02 = AbstractC25332a0.m131222v0(m131222v0, arrayList3);
            AbstractC19074t.m100206d(m131222v02, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any> }");
            this.f143790G = (ArrayList) m131222v02;
            m131222v03 = AbstractC25332a0.m131222v0(arrayList6, arrayList2);
            m131222v04 = AbstractC25332a0.m131222v0(m131222v03, arrayList4);
            AbstractC19074t.m100206d(m131222v04, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Int> }");
            this.f143789F = (ArrayList) m131222v04;
            int size = arrayList.size() + i11;
            m131206f0 = AbstractC25332a0.m131206f0(this.f143789F);
            Integer num2 = (Integer) m131206f0;
            if (num2 != null && num2.intValue() == 6) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (size > this.f143790G.size()) {
                size = this.f143790G.size();
            }
            m10013u(i12, size);
            return;
        }
        m131207g0 = AbstractC25332a0.m131207g0(this.f143790G, i11);
        if (m131207g0 instanceof Comment) {
            comment2 = (Comment) m131207g0;
        }
        if (comment2 != null) {
            comment2.m50814F(Boolean.FALSE);
            m10009q(i11);
        }
    }

    /* renamed from: E0 */
    public final void m151672E0(String str, long j11) {
        Comment comment;
        List m51168m;
        AbstractC19074t.m100208f(str, "commentId");
        m151660U0(str);
        int i11 = 0;
        int i12 = 0;
        for (Object obj : this.f143789F) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            if (((Number) obj).intValue() == 0) {
                Object obj2 = this.f143790G.get(i12);
                Comment comment2 = null;
                if (obj2 instanceof Comment) {
                    comment = (Comment) obj2;
                } else {
                    comment = null;
                }
                if (comment == null) {
                    continue;
                } else {
                    if (AbstractC19074t.m100204b(comment.m50833g(), str)) {
                        comment2 = comment;
                    }
                    if (comment2 != null) {
                        if (comment2.m50837k() != j11) {
                            comment2.m50822Q(j11);
                            Section m50840n = comment2.m50840n();
                            if (m50840n != null && (m51168m = m50840n.m51168m()) != null) {
                                i11 = m51168m.size();
                            }
                            int i14 = i12 + i11 + 1;
                            if (i14 <= mo10003k() - 1 && 2 == mo10005m(i14)) {
                                if (i11 < comment2.m50837k()) {
                                    m10009q(i14);
                                    return;
                                }
                                this.f143789F.remove(i14);
                                this.f143790G.remove(i14);
                                m10017y(i14);
                                return;
                            }
                            if (i11 < comment2.m50837k()) {
                                this.f143789F.add(i14, 2);
                                this.f143790G.add(i14, comment2);
                                m10011s(i14);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            i12 = i13;
        }
    }

    /* renamed from: F0 */
    public final void m151673F0(Comment comment) {
        int i11;
        Comment comment2;
        Object obj;
        List m131496e;
        Integer m50843q;
        AbstractC19074t.m100208f(comment, "comment");
        if (comment.m50843q() != null && ((m50843q = comment.m50843q()) == null || m50843q.intValue() != 0)) {
            i11 = 4;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        if (i11 == 1) {
            Section section = this.f143792v;
            ArrayList arrayList = new ArrayList(section.m51168m());
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC19074t.m100204b(((Comment) obj).m50833g(), comment.m50839m())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (((Comment) obj) == null) {
                obj = null;
            }
            Comment comment3 = (Comment) obj;
            if (comment3 != null) {
                if (comment3.m50840n() == null) {
                    m131496e = AbstractC25366r.m131496e(comment);
                    comment3.m50824S(new Section(m131496e, 1L, (LoadMoreInfo) null, 4, (AbstractC19060k) null));
                } else {
                    Section m50840n = comment3.m50840n();
                    if (m50840n != null) {
                        ArrayList arrayList2 = new ArrayList(m50840n.m51168m());
                        arrayList2.add(0, comment);
                        m50840n.m51172q(arrayList2);
                        m50840n.m51174u(m50840n.m51170o() + 1);
                    }
                }
            }
            section.m51172q(arrayList);
        }
        for (Object obj2 : this.f143789F) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            if (((Number) obj2).intValue() == 0) {
                Object obj3 = this.f143790G.get(i12);
                if (obj3 instanceof Comment) {
                    comment2 = (Comment) obj3;
                } else {
                    comment2 = null;
                }
                if (comment2 == null) {
                    continue;
                } else {
                    if (!AbstractC19074t.m100204b(comment2.m50833g(), comment.m50839m())) {
                        comment2 = null;
                    }
                    if (comment2 != null) {
                        this.f143789F.add(i13, Integer.valueOf(i11));
                        this.f143790G.add(i13, comment);
                        m10011s(i13);
                        return;
                    }
                }
            }
            i12 = i13;
        }
    }

    /* renamed from: G0 */
    public final void m151674G0(String str, int i11) {
        Comment comment;
        List m131496e;
        AbstractC19074t.m100208f(str, "commentId");
        int i12 = 0;
        for (Object obj : this.f143789F) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            int intValue = ((Number) obj).intValue();
            if (intValue == 3 || intValue == 4) {
                Object obj2 = this.f143790G.get(i12);
                Comment comment2 = null;
                if (obj2 instanceof Comment) {
                    comment = (Comment) obj2;
                } else {
                    comment = null;
                }
                if (comment == null) {
                    continue;
                } else {
                    if (AbstractC19074t.m100204b(comment.m50833g(), str)) {
                        comment2 = comment;
                    }
                    if (comment2 != null) {
                        comment2.m50827V(Integer.valueOf(i11));
                        m131496e = AbstractC25366r.m131496e("STATUS");
                        m10010r(i12, m131496e);
                        return;
                    }
                }
            }
            i12 = i13;
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: H0 */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        Object obj = this.f143790G.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        aVar.mo151708i0(obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: I0 */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(aVar, i11);
            return;
        }
        for (Object obj : list) {
            Object obj2 = this.f143790G.get(i11);
            AbstractC19074t.m100207e(obj2, "get(...)");
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            aVar.mo151709j0(obj2, (List) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: J0 */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0 && i11 != 1) {
            if (i11 != 3 && i11 != 4) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, n.f143820y, false, 2, null);
                        AbstractC19074t.m100205c(m134373N);
                        return new g(this, (C25031m) m134373N);
                    }
                    InterfaceC22715a m134373N2 = AbstractC26112n.m134373N(viewGroup, t.f143827y, false, 2, null);
                    AbstractC19074t.m100205c(m134373N2);
                    return new f(this, (C25056u) m134373N2);
                }
                InterfaceC22715a m134373N3 = AbstractC26112n.m134373N(viewGroup, o.f143821y, false, 2, null);
                C25035n c25035n = (C25035n) m134373N3;
                c25035n.getRoot().setOnItemHeightChange(new p(c25035n));
                c25035n.getRoot().setOnClickHashTag(new q());
                c25035n.getRoot().setOnLongClick(new r());
                c25035n.getRoot().setOnClickExpand(new s());
                c25035n.getRoot().setOnClickChannel(new View.OnClickListener() { // from class: z10.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C31168i.m151653K0(C31168i.this, view);
                    }
                });
                AbstractC19074t.m100207e(m134373N3, "apply(...)");
                return new e(this, c25035n);
            }
            View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_sending_comment, false, 2, null);
            AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem");
            h hVar = new h(this, (SendingCommentItem) m134372M);
            hVar.m151716l0().setCallback(new m(hVar));
            if (i11 == 4) {
                hVar.m151716l0().m52345j();
            }
            return hVar;
        }
        View m134372M2 = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_comment, false, 2, null);
        AbstractC19074t.m100206d(m134372M2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem");
        c cVar = new c(this, (CommentItem) m134372M2);
        cVar.m151711l0().setCallback(new l(cVar, this));
        if (i11 == 1) {
            cVar.m151711l0().m52083s();
        }
        return cVar;
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: L */
    public boolean mo151443L() {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(this.f143789F, 2);
        Integer num = (Integer) m131207g0;
        if (mo10003k() > 2 && ((num == null || num.intValue() != 6) && (num == null || num.intValue() != 7))) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L0 */
    public void mo9996G(a aVar) {
        AbstractC19074t.m100208f(aVar, "holder");
        aVar.mo151710k0();
        super.mo9996G(aVar);
    }

    /* renamed from: N0 */
    public final void m151679N0(b bVar) {
        this.f143794x = bVar;
    }

    /* renamed from: O0 */
    public final void m151680O0(boolean z11) {
        this.f143785B = z11;
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143794x;
        if (bVar == null || (m51171p = this.f143792v.m51171p()) == null) {
            return;
        }
        bVar.mo54205a(m51171p);
    }

    /* renamed from: P0 */
    public final void m151681P0(String str) {
        this.f143784A = str;
    }

    /* renamed from: Q0 */
    public final void m151682Q0(String str) {
        this.f143796z = str;
    }

    /* renamed from: R0 */
    public final void m151683R0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143792v = section;
    }

    /* renamed from: S0 */
    public final void m151684S0(CommentSource commentSource) {
        AbstractC19074t.m100208f(commentSource, "<set-?>");
        this.f143791u = commentSource;
    }

    /* renamed from: W */
    public final void m151685W(ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        Object m131206f0;
        String m56277j;
        String m56268a;
        List list;
        if (arrayList == null) {
            arrayList = this.f143789F;
        }
        if (arrayList2 == null) {
            arrayList2 = this.f143790G;
        }
        m131206f0 = AbstractC25332a0.m131206f0(arrayList);
        Integer num = (Integer) m131206f0;
        if ((num != null && num.intValue() == 6) || (m56277j = this.f143791u.m56277j()) == null || m56277j.length() == 0 || (m56268a = this.f143791u.m56268a()) == null) {
            return;
        }
        arrayList.add(0, 6);
        String m56273f = this.f143791u.m56273f();
        String m56272e = this.f143791u.m56272e();
        String m56276i = this.f143791u.m56276i();
        CtaItem[] m56270c = this.f143791u.m56270c();
        if (m56270c != null) {
            ArrayList arrayList3 = new ArrayList();
            for (CtaItem ctaItem : m56270c) {
                if (ctaItem.isValid()) {
                    arrayList3.add(ctaItem);
                }
            }
            list = AbstractC25332a0.m131187O0(arrayList3);
        } else {
            list = null;
        }
        arrayList2.add(0, new C2482a(m56273f, m56268a, m56272e, m56276i, m56277j, list, this.f143785B));
        if (z11) {
            m10011s(0);
        }
    }

    /* renamed from: Y */
    public final void m151686Y(String str) {
        AbstractC19074t.m100208f(str, "message");
        this.f143786C = true;
        this.f143784A = str;
    }

    /* renamed from: a0 */
    public final void m151687a0(Integer num, String str, String str2, String str3, InterfaceC18494a interfaceC18494a) {
        Object m131206f0;
        String m56277j;
        if (this.f143789F.size() != 0 || ((m56277j = this.f143791u.m56277j()) != null && m56277j.length() != 0)) {
            if (this.f143789F.size() == 1) {
                m131206f0 = AbstractC25332a0.m131206f0(this.f143789F);
                Integer num2 = (Integer) m131206f0;
                if (num2 == null || num2.intValue() != 6) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f143789F.add(7);
        this.f143790G.add(new C2483b(num, str, str2, str3, interfaceC18494a));
        m10009q(this.f143789F.size() - 1);
    }

    /* renamed from: c0 */
    public final void m151688c0(Comment comment, Section section) {
        Comment comment2;
        int i11;
        List m51168m;
        List list;
        int i12;
        int i13;
        Comment comment3;
        int i14;
        List m51168m2;
        List m51168m3;
        Section section2;
        List m51168m4;
        AbstractC19074t.m100208f(comment, "comment");
        AbstractC19074t.m100208f(section, "section");
        int i15 = 0;
        if (comment.m50840n() != null) {
            Section m50840n = comment.m50840n();
            if (m50840n != null) {
                list = m50840n.m51168m();
            } else {
                list = null;
            }
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                Section m50840n2 = comment.m50840n();
                if (m50840n2 != null && (m51168m4 = m50840n2.m51168m()) != null) {
                    i12 = m51168m4.size();
                } else {
                    i12 = 0;
                }
                if (this.f143787D.get(comment.m50833g()) == null) {
                    HashMap hashMap = this.f143787D;
                    String m50833g = comment.m50833g();
                    Section m50840n3 = comment.m50840n();
                    if (m50840n3 != null) {
                        section2 = Section.m51160k(m50840n3, null, 1, null);
                    } else {
                        section2 = null;
                    }
                    hashMap.put(m50833g, new C24860q(section2, Long.valueOf(comment.m50837k())));
                }
                Section m50840n4 = comment.m50840n();
                if (m50840n4 != null) {
                    m50840n4.m51163e(section, i.f143813q);
                }
                Section m50840n5 = comment.m50840n();
                if (m50840n5 != null && (m51168m3 = m50840n5.m51168m()) != null) {
                    i13 = m51168m3.size();
                } else {
                    i13 = 0;
                }
                int i16 = 0;
                for (Object obj : this.f143789F) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    if (((Number) obj).intValue() == 2) {
                        Object obj2 = this.f143790G.get(i16);
                        if (obj2 instanceof Comment) {
                            comment3 = (Comment) obj2;
                        } else {
                            comment3 = null;
                        }
                        if (comment3 == null) {
                            continue;
                        } else {
                            if (!AbstractC19074t.m100204b(comment3.m50833g(), comment.m50833g())) {
                                comment3 = null;
                            }
                            if (comment3 != null) {
                                long m50837k = comment.m50837k();
                                Section m50840n6 = comment.m50840n();
                                if (m50840n6 != null && (m51168m2 = m50840n6.m51168m()) != null) {
                                    i14 = m51168m2.size();
                                } else {
                                    i14 = 0;
                                }
                                if (m50837k > i14 && section.m51169n() != null) {
                                    m10009q(i16);
                                } else {
                                    this.f143789F.remove(i16);
                                    this.f143790G.remove(i16);
                                    m10017y(i16);
                                }
                                int i18 = i12;
                                while (i18 < i13) {
                                    int i19 = i15 + 1;
                                    Section m50840n7 = comment.m50840n();
                                    AbstractC19074t.m100205c(m50840n7);
                                    Comment comment4 = (Comment) m50840n7.m51168m().get(i18);
                                    int i21 = i15 + i16;
                                    this.f143789F.add(i21, 1);
                                    this.f143790G.add(i21, comment4);
                                    i18++;
                                    i15 = i19;
                                }
                                m10015w(i16, i13 - i12);
                                return;
                            }
                        }
                    }
                    i16 = i17;
                }
                return;
            }
        }
        comment.m50824S(section);
        int i22 = 0;
        for (Object obj3 : this.f143789F) {
            int i23 = i22 + 1;
            if (i22 < 0) {
                AbstractC25368s.m131509q();
            }
            if (((Number) obj3).intValue() == 2) {
                Object obj4 = this.f143790G.get(i22);
                if (obj4 instanceof Comment) {
                    comment2 = (Comment) obj4;
                } else {
                    comment2 = null;
                }
                if (comment2 == null) {
                    continue;
                } else {
                    if (!AbstractC19074t.m100204b(comment2.m50833g(), comment.m50833g())) {
                        comment2 = null;
                    }
                    if (comment2 != null) {
                        long m50837k2 = comment.m50837k();
                        Section m50840n8 = comment.m50840n();
                        if (m50840n8 != null && (m51168m = m50840n8.m51168m()) != null) {
                            i11 = m51168m.size();
                        } else {
                            i11 = 0;
                        }
                        if (m50837k2 > i11 && section.m51169n() != null) {
                            m10009q(i22);
                        } else {
                            this.f143789F.remove(i22);
                            this.f143790G.remove(i22);
                            m10017y(i22);
                        }
                        if (!section.m51168m().isEmpty()) {
                            for (Object obj5 : section.m51168m()) {
                                int i24 = i15 + 1;
                                if (i15 < 0) {
                                    AbstractC25368s.m131509q();
                                }
                                int i25 = i15 + i22;
                                this.f143789F.add(i25, 1);
                                this.f143790G.add(i25, (Comment) obj5);
                                i15 = i24;
                            }
                            m10015w(i22, section.m51168m().size());
                            return;
                        }
                        return;
                    }
                }
            }
            i22 = i23;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:            if (r0.m51094c() == true) goto L111;     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m151689d0(Section section) {
        int i11;
        LoadMoreInfo loadMoreInfo;
        PagingLoadMoreInfo pagingLoadMoreInfo;
        Boolean bool;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = this.f143792v.m51168m().size();
        boolean z11 = false;
        if (section != null) {
            arrayList.addAll(this.f143789F);
            arrayList2.addAll(this.f143790G);
            this.f143792v.m51163e(section, j.f143814q);
            i11 = this.f143792v.m51168m().size();
        } else {
            i11 = size;
            size = 0;
        }
        while (size < i11) {
            Comment comment = (Comment) this.f143792v.m51168m().get(size);
            arrayList.add(0);
            arrayList2.add(comment);
            Section m50840n = comment.m50840n();
            if (m50840n != null) {
                if (!m50840n.m51168m().isEmpty()) {
                    for (Comment comment2 : m50840n.m51168m()) {
                        arrayList.add(1);
                        arrayList2.add(comment2);
                    }
                }
                if (comment.m50837k() > m50840n.m51168m().size() && m50840n.m51169n() != null) {
                    arrayList.add(2);
                    arrayList2.add(comment);
                }
            }
            size++;
        }
        PagingLoadMoreInfo pagingLoadMoreInfo2 = null;
        if (section != null) {
            loadMoreInfo = section.m51169n();
        } else {
            loadMoreInfo = null;
        }
        if (loadMoreInfo instanceof PagingLoadMoreInfo) {
            pagingLoadMoreInfo = (PagingLoadMoreInfo) loadMoreInfo;
        } else {
            pagingLoadMoreInfo = null;
        }
        if (pagingLoadMoreInfo != null) {
            bool = Boolean.valueOf(pagingLoadMoreInfo.m51094c());
        } else {
            bool = null;
        }
        if (this.f143790G.size() <= 0 || AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
            if (this.f143790G.size() == 0 && arrayList2.size() != 0) {
                LoadMoreInfo m51169n = this.f143792v.m51169n();
                if (m51169n instanceof PagingLoadMoreInfo) {
                    pagingLoadMoreInfo2 = (PagingLoadMoreInfo) m51169n;
                }
                if (pagingLoadMoreInfo2 != null) {
                }
            }
            if (this.f143784A != null && z11) {
                this.f143786C = true;
            }
            m151662X(this, arrayList, arrayList2, false, 4, null);
            this.f143789F = arrayList;
            this.f143790G = arrayList2;
        }
        z11 = true;
        if (this.f143784A != null) {
            this.f143786C = true;
        }
        m151662X(this, arrayList, arrayList2, false, 4, null);
        this.f143789F = arrayList;
        this.f143790G = arrayList2;
    }

    /* renamed from: e0 */
    public final void m151690e0() {
        this.f143786C = false;
    }

    /* renamed from: f0 */
    public final void m151691f0() {
        Object m131217q0;
        m131217q0 = AbstractC25332a0.m131217q0(this.f143789F);
        Integer num = (Integer) m131217q0;
        if (num != null && num.intValue() == 7) {
            AbstractC25378x.m131546H(this.f143789F);
            AbstractC25378x.m131546H(this.f143790G);
        }
        this.f143788E = -1;
    }

    /* renamed from: g0 */
    public final void m151692g0() {
        Object m131206f0;
        m131206f0 = AbstractC25332a0.m131206f0(this.f143789F);
        Integer num = (Integer) m131206f0;
        if (num != null && num.intValue() == 6) {
            AbstractC25378x.m131544F(this.f143789F);
            AbstractC25378x.m131544F(this.f143790G);
        }
        this.f143785B = false;
    }

    /* renamed from: i0 */
    public final Comment m151693i0(String str, boolean z11) {
        Section m50840n;
        List<Comment> m51168m;
        if (str == null) {
            return null;
        }
        for (Comment comment : this.f143792v.m51168m()) {
            if (AbstractC19074t.m100204b(comment.m50833g(), str)) {
                return comment;
            }
            if (z11 && (m50840n = comment.m50840n()) != null && (m51168m = m50840n.m51168m()) != null) {
                for (Comment comment2 : m51168m) {
                    if (AbstractC19074t.m100204b(comment2.m50833g(), str)) {
                        return comment2;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143790G.size();
    }

    /* renamed from: k0 */
    public final C24860q m151694k0() {
        Object m131207g0;
        Comment comment;
        Iterator it = this.f143790G.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof Comment) && AbstractC19074t.m100204b(((Comment) next).m50830d(), Boolean.TRUE)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            m131207g0 = AbstractC25332a0.m131207g0(this.f143790G, i11);
            if (m131207g0 instanceof Comment) {
                comment = (Comment) m131207g0;
            } else {
                comment = null;
            }
            if (comment == null) {
                return null;
            }
            return new C24860q(Integer.valueOf(i11), comment);
        }
        return null;
    }

    /* renamed from: l0 */
    public final b m151695l0() {
        return this.f143794x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object obj = this.f143789F.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    /* renamed from: m0 */
    public final Context m151696m0() {
        return this.f143793w;
    }

    /* renamed from: o0 */
    public final HashMap m151697o0() {
        return this.f143787D;
    }

    /* renamed from: p0 */
    public final String m151698p0() {
        return this.f143796z;
    }

    /* renamed from: q0 */
    public final List m151699q0() {
        return this.f143795y;
    }

    /* renamed from: r0 */
    public final Section m151700r0() {
        return this.f143792v;
    }

    /* renamed from: s0 */
    public final CommentSource m151701s0() {
        return this.f143791u;
    }

    /* renamed from: t0 */
    public final int m151702t0(String str) {
        Comment comment;
        AbstractC19074t.m100208f(str, "id");
        int i11 = 0;
        for (Object obj : this.f143790G) {
            String str2 = null;
            if (obj instanceof Comment) {
                comment = (Comment) obj;
            } else {
                comment = null;
            }
            if (comment != null) {
                str2 = comment.m50833g();
            }
            if (!AbstractC19074t.m100204b(str2, str)) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: u0 */
    public final int m151703u0() {
        Object m131206f0;
        m131206f0 = AbstractC25332a0.m131206f0(this.f143789F);
        Integer num = (Integer) m131206f0;
        if (num != null && num.intValue() == 6) {
            return 0;
        }
        return -1;
    }

    /* renamed from: v0 */
    public final boolean m151704v0() {
        return this.f143785B;
    }

    /* renamed from: w0 */
    public final boolean m151705w0() {
        PagingLoadMoreInfo pagingLoadMoreInfo;
        LoadMoreInfo m51169n = this.f143792v.m51169n();
        if (m51169n instanceof PagingLoadMoreInfo) {
            pagingLoadMoreInfo = (PagingLoadMoreInfo) m51169n;
        } else {
            pagingLoadMoreInfo = null;
        }
        boolean z11 = false;
        if (pagingLoadMoreInfo != null && pagingLoadMoreInfo.m51094c()) {
            z11 = true;
        }
        return !z11;
    }

    /* renamed from: x0 */
    public boolean m151706x0() {
        return this.f143786C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y0 */
    public final void m151707y0(String str, InterfaceC18505l interfaceC18505l) {
        Object m131217q0;
        Comment comment;
        Section m50840n;
        ArrayList arrayList;
        Comment comment2;
        String str2;
        Object m131217q02;
        Comment comment3;
        String str3;
        ArrayList arrayList2;
        Comment comment4;
        Object m131217q03;
        Integer num;
        Integer num2;
        Comment comment5;
        AbstractC19074t.m100208f(str, "commentId");
        AbstractC19074t.m100208f(interfaceC18505l, "removeCallback");
        m131217q0 = AbstractC25332a0.m131217q0(this.f143790G);
        int i11 = 0;
        for (Object obj : this.f143789F) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            int intValue = ((Number) obj).intValue();
            String str4 = null;
            if (intValue != 0 && intValue != 1) {
                if (intValue == 3 || intValue == 4) {
                    Object obj2 = this.f143790G.get(i11);
                    if (obj2 instanceof Comment) {
                        comment5 = (Comment) obj2;
                    } else {
                        comment5 = 0;
                    }
                    if (comment5 == 0) {
                        continue;
                    } else {
                        if (AbstractC19074t.m100204b(comment5.m50833g(), str)) {
                            str4 = comment5;
                        }
                        if (str4 != null) {
                            this.f143789F.remove(i11);
                            this.f143790G.remove(i11);
                            m10017y(i11);
                            return;
                        }
                    }
                }
            } else {
                Object obj3 = this.f143790G.get(i11);
                if (obj3 instanceof Comment) {
                    comment = (Comment) obj3;
                } else {
                    comment = null;
                }
                if (comment == null) {
                    continue;
                } else {
                    if (!AbstractC19074t.m100204b(comment.m50833g(), str)) {
                        comment = null;
                    }
                    if (comment != null) {
                        ArrayList arrayList3 = new ArrayList();
                        if (intValue == 0) {
                            List m51168m = this.f143792v.m51168m();
                            if (m51168m instanceof ArrayList) {
                                arrayList2 = (ArrayList) m51168m;
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                arrayList2.remove(comment);
                            }
                            int i13 = 0;
                            while (true) {
                                Object obj4 = this.f143790G.get(i11);
                                if (obj4 instanceof Comment) {
                                    comment4 = (Comment) obj4;
                                } else {
                                    comment4 = null;
                                }
                                if (comment4 != null) {
                                    arrayList3.add(comment4.m50833g());
                                }
                                i13++;
                                this.f143789F.remove(i11);
                                this.f143790G.remove(i11);
                                if (mo10003k() <= i11 || (((num = (Integer) this.f143789F.get(i11)) != null && num.intValue() == 0) || ((num2 = (Integer) this.f143789F.get(i11)) != null && num2.intValue() == 3))) {
                                    break;
                                }
                            }
                            m10016x(i11, i13);
                            m131217q03 = AbstractC25332a0.m131217q0(this.f143789F);
                            Integer num3 = (Integer) m131217q03;
                            if (num3 != null && num3.intValue() == 6 && mo10003k() > 0) {
                                m10009q(0);
                            }
                        } else {
                            arrayList3.add(comment.m50833g());
                            Comment m151666j0 = m151666j0(this, comment.m50839m(), false, 2, null);
                            if (m151666j0 != null && (m50840n = m151666j0.m50840n()) != null) {
                                List m51168m2 = m50840n.m51168m();
                                if (m51168m2 instanceof ArrayList) {
                                    arrayList = (ArrayList) m51168m2;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    arrayList.remove(comment);
                                }
                            }
                            this.f143789F.remove(i11);
                            this.f143790G.remove(i11);
                            m10017y(i11);
                        }
                        if (this.f143790G.size() > 0) {
                            m151663Z();
                        }
                        if (!this.f143786C) {
                            Integer valueOf = Integer.valueOf(AbstractC23322a.zch_ic_empty_comment_line_48);
                            Context context = this.f143793w;
                            if (context != null) {
                                str3 = context.getString(AbstractC27413h.zch_bts_comment_empty_message);
                            } else {
                                str3 = null;
                            }
                            m151664b0(this, valueOf, null, str3, null, null, 26, null);
                        }
                        if (m131217q0 instanceof Comment) {
                            comment2 = (Comment) m131217q0;
                        } else {
                            comment2 = null;
                        }
                        if (comment2 != null) {
                            str2 = comment2.m50833g();
                        } else {
                            str2 = null;
                        }
                        m131217q02 = AbstractC25332a0.m131217q0(this.f143790G);
                        if (m131217q02 instanceof Comment) {
                            comment3 = (Comment) m131217q02;
                        } else {
                            comment3 = null;
                        }
                        if (comment3 != null) {
                            str4 = comment3.m50833g();
                        }
                        if ((!AbstractC19074t.m100204b(str2, str4)) && mo10003k() - 1 >= 0) {
                            m10009q(mo10003k() - 1);
                        }
                        interfaceC18505l.mo205i9(arrayList3);
                        return;
                    }
                }
            }
            i11 = i12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31168i(CommentSource commentSource, Section section, Context context) {
        super(10);
        AbstractC19074t.m100208f(commentSource, "source");
        AbstractC19074t.m100208f(section, "section");
        this.f143791u = commentSource;
        this.f143792v = section;
        this.f143793w = context;
        this.f143795y = new ArrayList();
        this.f143787D = new HashMap();
        this.f143788E = -1;
        this.f143789F = new ArrayList();
        this.f143790G = new ArrayList();
    }
}
