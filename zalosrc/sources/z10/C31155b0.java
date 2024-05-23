package z10;

import android.content.Context;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.SearchAllData;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.HashTagVideoItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import mj0.AbstractC23322a;
import p338m2.InterfaceC22715a;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C24984a0;
import q10.C24992c0;
import q10.C25012h0;
import q10.C25028l0;
import qm0.AbstractC25358n;
import qm0.AbstractC25361o0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.C26980a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27411f;
import v00.AbstractC27413h;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: z10.b0 */
/* loaded from: classes5.dex */
public final class C31155b0 extends AbstractC31153a0 {
    public static final d Companion = new d(null);

    /* renamed from: A */
    private ArrayList f143609A;

    /* renamed from: B */
    private ArrayList f143610B;

    /* renamed from: C */
    private int f143611C;

    /* renamed from: u */
    private Section f143612u;

    /* renamed from: v */
    private String f143613v;

    /* renamed from: w */
    private String f143614w;

    /* renamed from: x */
    private String f143615x;

    /* renamed from: y */
    private b f143616y;

    /* renamed from: z */
    private final Channel f143617z;

    /* renamed from: z10.b0$a */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
        }

        /* renamed from: i0 */
        public abstract void mo151476i0(Object obj);

        /* renamed from: j0 */
        public void mo151477j0() {
        }
    }

    /* renamed from: z10.b0$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo54747a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54748b(Channel channel);

        /* renamed from: c */
        void mo54749c(Channel channel, boolean z11);

        /* renamed from: d */
        void mo54750d();

        /* renamed from: e */
        void mo54751e(Section section, int i11);
    }

    /* renamed from: z10.b0$c */
    /* loaded from: classes5.dex */
    public final class c extends a {

        /* renamed from: I */
        private final C24984a0 f143618I;

        /* renamed from: J */
        final /* synthetic */ C31155b0 f143619J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(C31155b0 c31155b0, C24984a0 c24984a0) {
            super(r2);
            AbstractC19074t.m100208f(c24984a0, "binding");
            this.f143619J = c31155b0;
            LinearLayout root = c24984a0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143618I = c24984a0;
        }

        @Override // z10.C31155b0.a
        /* renamed from: i0 */
        public void mo151476i0(Object obj) {
            Channel channel;
            long m50782t;
            AbstractC19074t.m100208f(obj, "data");
            String str = null;
            if (obj instanceof Channel) {
                channel = (Channel) obj;
            } else {
                channel = null;
            }
            if (channel != null) {
                C31155b0 c31155b0 = this.f143619J;
                this.f7784p.setTag(channel);
                this.f143618I.f119712r.setAvatar(channel);
                this.f143618I.f119714t.setText(channel.m50775o());
                this.f143618I.f119714t.setVerifiedIcon(channel.m50725F());
                String m50752b = channel.m50752b();
                if (m50752b != null && m50752b.length() != 0) {
                    this.f143618I.f119713s.setText(channel.m50752b());
                    EllipsizedTextView ellipsizedTextView = this.f143618I.f119713s;
                    AbstractC19074t.m100207e(ellipsizedTextView, "tvAlias");
                    AbstractC26112n.m134431w0(ellipsizedTextView);
                } else {
                    this.f143618I.f119713s.setText("");
                    EllipsizedTextView ellipsizedTextView2 = this.f143618I.f119713s;
                    AbstractC19074t.m100207e(ellipsizedTextView2, "tvAlias");
                    AbstractC26112n.m134367H(ellipsizedTextView2);
                }
                long j11 = 0;
                if (channel.m50782t() <= 0) {
                    m50782t = 0;
                } else {
                    m50782t = channel.m50782t();
                }
                if (channel.m50777p() > 0) {
                    j11 = channel.m50777p();
                }
                View view = this.f7784p;
                AbstractC19074t.m100207e(view, "itemView");
                String m134363D = AbstractC26112n.m134363D(view, AbstractC27411f.zch_page_search_item_channel_stats_video, m50782t, AbstractC26105g.m134334a(channel.m50782t()));
                View view2 = this.f7784p;
                AbstractC19074t.m100207e(view2, "itemView");
                this.f143618I.f119715u.setText(m134363D + " " + AbstractC26112n.m134363D(view2, AbstractC27411f.zch_page_search_item_channel_stats_follower, j11, AbstractC26105g.m134334a(channel.m50777p())));
                Channel m151466V = c31155b0.m151466V();
                if (m151466V != null) {
                    str = m151466V.m50769l();
                }
                if (AbstractC19074t.m100204b(str, channel.m50769l())) {
                    RobotoButton robotoButton = this.f143618I.f119711q;
                    AbstractC19074t.m100207e(robotoButton, "btnFollow");
                    AbstractC26112n.m134367H(robotoButton);
                } else {
                    RobotoButton robotoButton2 = this.f143618I.f119711q;
                    AbstractC19074t.m100207e(robotoButton2, "btnFollow");
                    AbstractC26112n.m134431w0(robotoButton2);
                }
                m151478k0(channel);
            }
        }

        @Override // z10.C31155b0.a
        /* renamed from: j0 */
        public void mo151477j0() {
        }

        /* renamed from: k0 */
        public final void m151478k0(Channel channel) {
            if (channel == null) {
                return;
            }
            if (channel.m50741Q()) {
                RobotoButton robotoButton = this.f143618I.f119711q;
                SpannableString spannableString = new SpannableString(" ");
                Context context = this.f7784p.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                spannableString.setSpan(new C26980a(context, AbstractC23322a.zch_ic_check_solid_16, 0, 4, null), 0, 1, 17);
                robotoButton.setText(spannableString);
                this.f143618I.f119711q.setBackgroundResource(AbstractC27408c.zch_bg_button_outline);
                this.f143618I.f119711q.setTag(Boolean.TRUE);
                return;
            }
            this.f143618I.f119711q.setTag(Boolean.FALSE);
            RobotoButton robotoButton2 = this.f143618I.f119711q;
            View view = this.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            robotoButton2.setText(AbstractC26112n.m134366G(view, AbstractC27413h.zch_item_video_follow, new Object[0]));
            this.f143618I.f119711q.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
        }
    }

    /* renamed from: z10.b0$d */
    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: z10.b0$e */
    /* loaded from: classes5.dex */
    public final class e extends a {

        /* renamed from: I */
        private final C24992c0 f143620I;

        /* renamed from: J */
        final /* synthetic */ C31155b0 f143621J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(C31155b0 c31155b0, C24992c0 c24992c0) {
            super(r2);
            AbstractC19074t.m100208f(c24992c0, "binding");
            this.f143621J = c31155b0;
            FrameLayout root = c24992c0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143620I = c24992c0;
        }

        @Override // z10.C31155b0.a
        /* renamed from: i0 */
        public void mo151476i0(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            AbstractC19074t.m100208f(obj, "data");
            if (obj instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) obj;
            } else {
                spannableStringBuilder = null;
            }
            if (spannableStringBuilder != null) {
                this.f143620I.f119807q.setText(spannableStringBuilder);
            }
        }

        @Override // z10.C31155b0.a
        /* renamed from: j0 */
        public void mo151477j0() {
        }
    }

    /* renamed from: z10.b0$f */
    /* loaded from: classes5.dex */
    public final class f extends a {

        /* renamed from: I */
        private final C25012h0 f143622I;

        /* renamed from: J */
        final /* synthetic */ C31155b0 f143623J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(C31155b0 c31155b0, C25012h0 c25012h0) {
            super(r2);
            AbstractC19074t.m100208f(c25012h0, "binding");
            this.f143623J = c31155b0;
            FrameLayout root = c25012h0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143622I = c25012h0;
        }

        @Override // z10.C31155b0.a
        /* renamed from: i0 */
        public void mo151476i0(Object obj) {
            String str;
            AbstractC19074t.m100208f(obj, "data");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null) {
                this.f143622I.f119935q.setText(str);
            }
        }

        @Override // z10.C31155b0.a
        /* renamed from: j0 */
        public void mo151477j0() {
        }
    }

    /* renamed from: z10.b0$g */
    /* loaded from: classes5.dex */
    public final class g extends a {

        /* renamed from: I */
        private final HashTagVideoItem f143624I;

        /* renamed from: J */
        private CoroutineScope f143625J;

        /* renamed from: K */
        private Video f143626K;

        /* renamed from: L */
        final /* synthetic */ C31155b0 f143627L;

        /* renamed from: z10.b0$g$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f143628t;

            /* renamed from: u */
            private /* synthetic */ Object f143629u;

            /* renamed from: v */
            final /* synthetic */ Video f143630v;

            /* renamed from: w */
            final /* synthetic */ String f143631w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Video video, String str, Continuation continuation) {
                super(2, continuation);
                this.f143630v = video;
                this.f143631w = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f143630v, this.f143631w, continuation);
                aVar.f143629u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                Map m131401f;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f143628t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f143629u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f143629u;
                    this.f143629u = coroutineScope2;
                    this.f143628t = 1;
                    if (DelayKt.m112666b(1000L, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                while (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f143630v.m52850J0(true);
                    C19205a c19205a = C19205a.f95429a;
                    Video video = this.f143630v;
                    m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("search_kw", this.f143631w));
                    C19205a.m100678X(c19205a, video, m131401f, null, null, 12, null);
                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C31155b0 c31155b0, HashTagVideoItem hashTagVideoItem) {
            super(hashTagVideoItem);
            AbstractC19074t.m100208f(hashTagVideoItem, "view");
            this.f143627L = c31155b0;
            this.f143624I = hashTagVideoItem;
        }

        @Override // z10.C31155b0.a
        /* renamed from: i0 */
        public void mo151476i0(Object obj) {
            Video video;
            AbstractC19074t.m100208f(obj, "data");
            if (obj instanceof Video) {
                video = (Video) obj;
            } else {
                video = null;
            }
            if (video != null) {
                this.f143624I.m52168a(video);
                this.f143626K = (Video) obj;
            }
        }

        @Override // z10.C31155b0.a
        /* renamed from: j0 */
        public void mo151477j0() {
            CoroutineScope coroutineScope = this.f143625J;
            if (coroutineScope != null) {
                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            }
        }

        /* renamed from: k0 */
        public final void m151479k0(String str) {
            AbstractC19074t.m100208f(str, "keyword");
            Video video = this.f143626K;
            if (video != null && !video.m52907p0()) {
                CoroutineScope coroutineScope = this.f143625J;
                if (coroutineScope == null || !CoroutineScopeKt.m112642f(coroutineScope)) {
                    CoroutineScope coroutineScope2 = this.f143625J;
                    if (coroutineScope2 != null) {
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                    }
                    CoroutineScope m112637a = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
                    this.f143625J = m112637a;
                    if (m112637a != null) {
                        BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new a(video, str, null), 3, null);
                    }
                }
            }
        }
    }

    /* renamed from: z10.b0$h */
    /* loaded from: classes5.dex */
    public final class h extends a {

        /* renamed from: I */
        private final C25028l0 f143632I;

        /* renamed from: J */
        final /* synthetic */ C31155b0 f143633J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public h(C31155b0 c31155b0, C25028l0 c25028l0) {
            super(r2);
            AbstractC19074t.m100208f(c25028l0, "binding");
            this.f143633J = c31155b0;
            FrameLayout root = c25028l0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143632I = c25028l0;
        }

        @Override // z10.C31155b0.a
        /* renamed from: i0 */
        public void mo151476i0(Object obj) {
            String str;
            AbstractC19074t.m100208f(obj, "data");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null) {
                this.f143632I.f120076q.setText(str);
            }
        }

        @Override // z10.C31155b0.a
        /* renamed from: j0 */
        public void mo151477j0() {
        }
    }

    /* renamed from: z10.b0$i */
    /* loaded from: classes5.dex */
    static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final i f143634q = new i();

        i() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(SearchAllData searchAllData) {
            AbstractC19074t.m100208f(searchAllData, "i");
            return searchAllData.m51134b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b0$j */
    /* loaded from: classes5.dex */
    public /* synthetic */ class j extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final j f143635y = new j();

        j() {
            super(3, C25012h0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchSectionTitleBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151482h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25012h0 m151482h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25012h0.m129832c(layoutInflater, viewGroup, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b0$k */
    /* loaded from: classes5.dex */
    public /* synthetic */ class k extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final k f143636y = new k();

        k() {
            super(3, C24984a0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchChannelBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151483h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24984a0 m151483h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24984a0.m129751c(layoutInflater, viewGroup, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b0$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ c f143637q;

        /* renamed from: r */
        final /* synthetic */ C31155b0 f143638r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(c cVar, C31155b0 c31155b0) {
            super(1);
            this.f143637q = cVar;
            this.f143638r = c31155b0;
        }

        /* renamed from: a */
        public final void m151484a(View view) {
            Channel channel;
            b m151465U;
            AbstractC19074t.m100208f(view, "it");
            Object tag = this.f143637q.f7784p.getTag();
            if (tag instanceof Channel) {
                channel = (Channel) tag;
            } else {
                channel = null;
            }
            if (channel != null && (m151465U = this.f143638r.m151465U()) != null) {
                m151465U.mo54748b(channel);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151484a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b0$m */
    /* loaded from: classes5.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18505l {
        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m151485a(View view) {
            View view2;
            Object obj;
            AbstractC19074t.m100208f(view, "it");
            Object parent = view.getParent();
            Channel channel = null;
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            if (view2 != null) {
                obj = view2.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof Channel) {
                channel = (Channel) obj;
            }
            if (channel != null) {
                C31155b0 c31155b0 = C31155b0.this;
                boolean z11 = !AbstractC19074t.m100204b(view.getTag(), Boolean.TRUE);
                b m151465U = c31155b0.m151465U();
                if (m151465U != null) {
                    m151465U.mo54749c(channel, z11);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151485a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b0$n */
    /* loaded from: classes5.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z10.b0$n$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f143641q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo205i9(Video video) {
                AbstractC19074t.m100208f(video, "it");
                return Boolean.valueOf(video.m52903n0());
            }
        }

        n() {
            super(1);
        }

        /* renamed from: a */
        public final void m151486a(View view) {
            Video video;
            int m131511r;
            AbstractC19074t.m100208f(view, "it");
            Object tag = view.getTag();
            if (tag instanceof Video) {
                video = (Video) tag;
            } else {
                video = null;
            }
            List m51168m = C31155b0.this.m151467W().m51168m();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m51168m) {
                if (((SearchAllData) obj).m51133a() instanceof Video) {
                    arrayList.add(obj);
                }
            }
            m131511r = AbstractC25370t.m131511r(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Parcelable m51133a = ((SearchAllData) it.next()).m51133a();
                AbstractC19074t.m100206d(m51133a, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
                arrayList2.add((Video) m51133a);
            }
            Section section = new Section(arrayList2, 0L, C31155b0.this.m151467W().m51169n(), 2, (AbstractC19060k) null);
            Section m51166j = section.m51166j(a.f143641q);
            if (video != null) {
                C31155b0 c31155b0 = C31155b0.this;
                int indexOf = m51166j.m51168m().indexOf(video);
                b m151465U = c31155b0.m151465U();
                if (m151465U != null) {
                    m151465U.mo54751e(section, indexOf);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151486a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b0$o */
    /* loaded from: classes5.dex */
    public /* synthetic */ class o extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final o f143642y = new o();

        o() {
            super(3, C24992c0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchEmptyVideoBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151488h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24992c0 m151488h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24992c0.m129773c(layoutInflater, viewGroup, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b0$p */
    /* loaded from: classes5.dex */
    public /* synthetic */ class p extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final p f143643y = new p();

        p() {
            super(3, C25028l0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchViewmoreBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151489h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25028l0 m151489h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25028l0.m129875c(layoutInflater, viewGroup, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b0$q */
    /* loaded from: classes5.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18505l {
        q() {
            super(1);
        }

        /* renamed from: a */
        public final void m151490a(View view) {
            AbstractC19074t.m100208f(view, "it");
            b m151465U = C31155b0.this.m151465U();
            if (m151465U != null) {
                m151465U.mo54750d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151490a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31155b0(Section section, String str, String str2, String str3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section, str, str2, str3);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143616y;
        if (bVar == null || (m51171p = this.f143612u.m51171p()) == null) {
            return;
        }
        bVar.mo54747a(m51171p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* renamed from: R */
    public final void m151462R(Section section, SpannableStringBuilder spannableStringBuilder) {
        int m131511r;
        int m131511r2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (section != null) {
            arrayList.addAll(this.f143609A);
            arrayList2.addAll(this.f143610B);
            this.f143612u.m51163e(section, i.f143634q);
            int size = this.f143612u.m51168m().size();
            for (int size2 = this.f143612u.m51168m().size(); size2 < size; size2++) {
                Parcelable m51133a = ((SearchAllData) this.f143612u.m51168m().get(size2)).m51133a();
                arrayList.add(2);
                arrayList2.add(m51133a);
            }
        } else {
            List m51168m = this.f143612u.m51168m();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : m51168m) {
                if (((SearchAllData) obj).m51133a() instanceof Channel) {
                    arrayList3.add(obj);
                }
            }
            m131511r = AbstractC25370t.m131511r(arrayList3, 10);
            ArrayList<Channel> arrayList4 = new ArrayList(m131511r);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Parcelable m51133a2 = ((SearchAllData) it.next()).m51133a();
                AbstractC19074t.m100206d(m51133a2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.Channel");
                arrayList4.add((Channel) m51133a2);
            }
            List m51168m2 = this.f143612u.m51168m();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : m51168m2) {
                if (((SearchAllData) obj2).m51133a() instanceof Video) {
                    arrayList5.add(obj2);
                }
            }
            m131511r2 = AbstractC25370t.m131511r(arrayList5, 10);
            ArrayList<Video> arrayList6 = new ArrayList(m131511r2);
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                Parcelable m51133a3 = ((SearchAllData) it2.next()).m51133a();
                AbstractC19074t.m100206d(m51133a3, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
                arrayList6.add((Video) m51133a3);
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(0);
                arrayList2.add(this.f143613v);
                if (arrayList4.size() >= 5) {
                    int i11 = 0;
                    for (SearchAllData searchAllData : this.f143612u.m51168m()) {
                        if ((searchAllData.m51133a() instanceof Channel) && i11 < 3) {
                            arrayList.add(1);
                            arrayList2.add(searchAllData.m51133a());
                            i11++;
                        }
                    }
                    arrayList.add(3);
                    arrayList2.add(this.f143615x);
                } else {
                    for (Channel channel : arrayList4) {
                        arrayList.add(1);
                        arrayList2.add(channel);
                    }
                }
            }
            arrayList.add(0);
            arrayList2.add(this.f143614w);
            if (!arrayList6.isEmpty()) {
                for (Video video : arrayList6) {
                    arrayList.add(2);
                    arrayList2.add(video);
                }
            } else {
                arrayList.add(4);
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder2 = "Không tìm thấy kết quả";
                }
                arrayList2.add(spannableStringBuilder2);
                this.f143611C = arrayList.size() - 1;
            }
        }
        this.f143609A = arrayList;
        this.f143610B = arrayList2;
    }

    /* renamed from: S */
    public final void m151463S() {
        this.f143610B.clear();
        this.f143609A.clear();
        this.f143612u = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        m10008p();
    }

    /* renamed from: T */
    public final int m151464T(String str) {
        Video video;
        AbstractC19074t.m100208f(str, "id");
        int i11 = 0;
        for (Object obj : this.f143609A) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            if (((Number) obj).intValue() == 2) {
                Object obj2 = this.f143610B.get(i11);
                Video video2 = null;
                if (obj2 instanceof Video) {
                    video = (Video) obj2;
                } else {
                    video = null;
                }
                if (video == null) {
                    continue;
                } else {
                    if (AbstractC19074t.m100204b(video.m52911t(), str)) {
                        video2 = video;
                    }
                    if (video2 != null) {
                        return i11;
                    }
                }
            }
            i11 = i12;
        }
        return -1;
    }

    /* renamed from: U */
    public final b m151465U() {
        return this.f143616y;
    }

    /* renamed from: V */
    public final Channel m151466V() {
        return this.f143617z;
    }

    /* renamed from: W */
    public final Section m151467W() {
        return this.f143612u;
    }

    /* renamed from: X */
    public final void m151468X(String str) {
        Channel channel;
        AbstractC19074t.m100208f(str, "key");
        int i11 = 0;
        for (Object obj : this.f143609A) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            if (((Number) obj).intValue() == 1) {
                Object obj2 = this.f143610B.get(i11);
                Channel channel2 = null;
                if (obj2 instanceof Channel) {
                    channel = (Channel) obj2;
                } else {
                    channel = null;
                }
                if (channel == null) {
                    continue;
                } else {
                    if (AbstractC19074t.m100204b(channel.m50769l(), str)) {
                        channel2 = channel;
                    }
                    if (channel2 != null) {
                        channel2.m50770l0(true);
                        m10010r(i11, "true");
                        return;
                    }
                }
            }
            i11 = i12;
        }
    }

    /* renamed from: Y */
    public final void m151469Y(String str) {
        Channel channel;
        AbstractC19074t.m100208f(str, "key");
        int i11 = 0;
        for (Object obj : this.f143609A) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            if (((Number) obj).intValue() == 1) {
                Object obj2 = this.f143610B.get(i11);
                Channel channel2 = null;
                if (obj2 instanceof Channel) {
                    channel = (Channel) obj2;
                } else {
                    channel = null;
                }
                if (channel == null) {
                    continue;
                } else {
                    if (AbstractC19074t.m100204b(channel.m50769l(), str)) {
                        channel2 = channel;
                    }
                    if (channel2 != null) {
                        channel2.m50770l0(false);
                        m10010r(i11, "false");
                        return;
                    }
                }
            }
            i11 = i12;
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        Object obj = this.f143610B.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        aVar.mo151476i0(obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void mo9991B(a aVar, int i11, List list) {
        boolean m131390w;
        Channel channel;
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            super.mo9991B(aVar, i11, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m131390w = AbstractC25358n.m131390w(new String[]{"true", "false"}, it.next());
            if (m131390w && (aVar instanceof c)) {
                c cVar = (c) aVar;
                Object obj = this.f143610B.get(i11);
                if (obj instanceof Channel) {
                    channel = (Channel) obj;
                } else {
                    channel = null;
                }
                cVar.m151478k0(channel);
            } else {
                super.mo9991B(aVar, i11, list);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        int height;
        AbstractC19074t.m100208f(viewGroup, "parent");
        OverScrollableRecyclerView overScrollableRecyclerView = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, p.f143643y, false, 2, null);
                        AbstractC19074t.m100205c(m134373N);
                        h hVar = new h(this, (C25028l0) m134373N);
                        View findViewById = hVar.f7784p.findViewById(AbstractC27409d.tvMore);
                        AbstractC19074t.m100205c(findViewById);
                        AbstractC26112n.m134407k0(findViewById, new q());
                        return hVar;
                    }
                    InterfaceC22715a m134373N2 = AbstractC26112n.m134373N(viewGroup, o.f143642y, false, 2, null);
                    AbstractC19074t.m100205c(m134373N2);
                    e eVar = new e(this, (C24992c0) m134373N2);
                    if (viewGroup instanceof OverScrollableRecyclerView) {
                        overScrollableRecyclerView = (OverScrollableRecyclerView) viewGroup;
                    }
                    if (overScrollableRecyclerView != null && (height = overScrollableRecyclerView.getHeight()) > 0) {
                        View view = eVar.f7784p;
                        AbstractC19074t.m100207e(view, "itemView");
                        int m134433y = AbstractC26112n.m134433y(view, AbstractC27407b.zch_page_search_channel_avatar_size);
                        eVar.f7784p.getLayoutParams().height = (height - (this.f143611C * m134433y)) - (m134433y / 2);
                        eVar.f7784p.requestLayout();
                        return eVar;
                    }
                    return eVar;
                }
                View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_hash_tag_list, false, 2, null);
                AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem");
                g gVar = new g(this, (HashTagVideoItem) m134372M);
                View view2 = gVar.f7784p;
                AbstractC19074t.m100207e(view2, "itemView");
                AbstractC26112n.m134407k0(view2, new n());
                return gVar;
            }
            InterfaceC22715a m134373N3 = AbstractC26112n.m134373N(viewGroup, k.f143636y, false, 2, null);
            AbstractC19074t.m100205c(m134373N3);
            c cVar = new c(this, (C24984a0) m134373N3);
            View view3 = cVar.f7784p;
            AbstractC19074t.m100207e(view3, "itemView");
            AbstractC26112n.m134407k0(view3, new l(cVar, this));
            View findViewById2 = cVar.f7784p.findViewById(AbstractC27409d.btnFollow);
            AbstractC19074t.m100205c(findViewById2);
            AbstractC26112n.m134407k0(findViewById2, new m());
            return cVar;
        }
        InterfaceC22715a m134373N4 = AbstractC26112n.m134373N(viewGroup, j.f143635y, false, 2, null);
        AbstractC19074t.m100205c(m134373N4);
        return new f(this, (C25012h0) m134373N4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo9996G(a aVar) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9996G(aVar);
        aVar.mo151477j0();
    }

    /* renamed from: d0 */
    public final void m151474d0(b bVar) {
        this.f143616y = bVar;
    }

    /* renamed from: e0 */
    public final void m151475e0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143612u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143610B.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object obj = this.f143609A.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31155b0(Section section, String str, String str2, String str3) {
        super(4);
        AbstractC19074t.m100208f(section, "section");
        AbstractC19074t.m100208f(str, "titleChannel");
        AbstractC19074t.m100208f(str2, "titleVideo");
        AbstractC19074t.m100208f(str3, "seeMore");
        this.f143612u = section;
        this.f143613v = str;
        this.f143614w = str2;
        this.f143615x = str3;
        this.f143617z = C27417l.f129055a.m140377a();
        this.f143609A = new ArrayList();
        this.f143610B = new ArrayList();
    }
}
