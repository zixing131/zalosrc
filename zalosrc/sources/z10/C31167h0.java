package z10;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import p338m2.InterfaceC22715a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q10.C25024k0;
import q20.C25083f;
import q20.C25092o;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27408c;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import z10.C31161e0;

/* renamed from: z10.h0 */
/* loaded from: classes5.dex */
public final class C31167h0 extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143765u;

    /* renamed from: v */
    private a f143766v;

    /* renamed from: z10.h0$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo54865a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54866b(Video video);

        /* renamed from: c */
        void mo54867c(Video video);
    }

    /* renamed from: z10.h0$b */
    /* loaded from: classes5.dex */
    public final class b extends C31161e0.a {

        /* renamed from: I */
        private final C25024k0 f143767I;

        /* renamed from: J */
        final /* synthetic */ C31167h0 f143768J;

        /* renamed from: z10.h0$b$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: r */
            final /* synthetic */ C31167h0 f143770r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31167h0 c31167h0) {
                super(1);
                this.f143770r = c31167h0;
            }

            /* renamed from: a */
            public final void m151648a(View view) {
                Video video;
                a m151641S;
                AbstractC19074t.m100208f(view, "it");
                Object tag = b.this.f7784p.getTag();
                if (tag instanceof Video) {
                    video = (Video) tag;
                } else {
                    video = null;
                }
                if (video != null && (m151641S = this.f143770r.m151641S()) != null) {
                    m151641S.mo54866b(video);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151648a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: z10.h0$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C33057b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: r */
            final /* synthetic */ C31167h0 f143772r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33057b(C31167h0 c31167h0) {
                super(1);
                this.f143772r = c31167h0;
            }

            /* renamed from: a */
            public final void m151649a(View view) {
                Video video;
                a m151641S;
                AbstractC19074t.m100208f(view, "it");
                Object tag = b.this.f7784p.getTag();
                if (tag instanceof Video) {
                    video = (Video) tag;
                } else {
                    video = null;
                }
                if (video != null && (m151641S = this.f143772r.m151641S()) != null) {
                    m151641S.mo54867c(video);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151649a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: z10.h0$b$c */
        /* loaded from: classes5.dex */
        public static final class c extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ Video f143773l1;

            /* renamed from: m1 */
            final /* synthetic */ C25024k0 f143774m1;

            /* renamed from: z10.h0$b$c$a */
            /* loaded from: classes5.dex */
            static final class a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f143775t;

                /* renamed from: u */
                private /* synthetic */ Object f143776u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f143777v;

                /* renamed from: w */
                final /* synthetic */ C25024k0 f143778w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: z10.h0$b$c$a$a, reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C33058a extends AbstractC29104l implements InterfaceC18509p {

                    /* renamed from: t */
                    int f143779t;

                    /* renamed from: u */
                    final /* synthetic */ C25024k0 f143780u;

                    /* renamed from: v */
                    final /* synthetic */ Bitmap f143781v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C33058a(C25024k0 c25024k0, Bitmap bitmap, Continuation continuation) {
                        super(2, continuation);
                        this.f143780u = c25024k0;
                        this.f143781v = bitmap;
                    }

                    @Override // wm0.AbstractC29093a
                    /* renamed from: a */
                    public final Continuation mo238a(Object obj, Continuation continuation) {
                        return new C33058a(this.f143780u, this.f143781v, continuation);
                    }

                    @Override // wm0.AbstractC29093a
                    /* renamed from: o */
                    public final Object mo239o(Object obj) {
                        AbstractC28298d.m142578e();
                        if (this.f143779t == 0) {
                            AbstractC24862s.m129228b(obj);
                            this.f143780u.f120021s.setImageBitmap(this.f143781v);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    @Override // en0.InterfaceC18509p
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((C33058a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Bitmap bitmap, C25024k0 c25024k0, Continuation continuation) {
                    super(2, continuation);
                    this.f143777v = bitmap;
                    this.f143778w = c25024k0;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    a aVar = new a(this.f143777v, this.f143778w, continuation);
                    aVar.f143776u = obj;
                    return aVar;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    CoroutineScope coroutineScope;
                    CoroutineScope coroutineScope2;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f143775t;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            coroutineScope2 = (CoroutineScope) this.f143776u;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        coroutineScope = (CoroutineScope) this.f143776u;
                        C25083f c25083f = C25083f.f120483a;
                        Bitmap m130014a = c25083f.m130014a(this.f143777v, 100.0f);
                        if (m130014a != null) {
                            C25024k0 c25024k0 = this.f143778w;
                            LinearLayout root = c25024k0.getRoot();
                            AbstractC19074t.m100207e(root, "getRoot(...)");
                            c25083f.m130015c(m130014a, AbstractC26112n.m134426u(root, AbstractC27406a.zch_curtain));
                            MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                            C33058a c33058a = new C33058a(c25024k0, m130014a, null);
                            this.f143776u = coroutineScope;
                            this.f143775t = 1;
                            if (BuildersKt.m112534g(m112681c, c33058a, this) == m142578e) {
                                return m142578e;
                            }
                            coroutineScope2 = coroutineScope;
                        }
                        CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                        return C24848g0.f119245a;
                    }
                    coroutineScope = coroutineScope2;
                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                    return C24848g0.f119245a;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            c(Video video, C25024k0 c25024k0) {
                this.f143773l1 = video;
                this.f143774m1 = c25024k0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                Bitmap m18839c;
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    Video video = this.f143773l1;
                    C25024k0 c25024k0 = this.f143774m1;
                    if (video.m52915v0()) {
                        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, c25024k0, null), 3, null);
                    } else {
                        c25024k0.f120021s.setImageBitmap(m18839c);
                    }
                }
            }
        }

        /* renamed from: z10.h0$b$d */
        /* loaded from: classes5.dex */
        public static final class d extends MetricAffectingSpan {

            /* renamed from: p */
            final /* synthetic */ C25024k0 f143782p;

            d(C25024k0 c25024k0) {
                this.f143782p = c25024k0;
            }

            @Override // android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                AbstractC19074t.m100208f(textPaint, "paint");
                LinearLayout root = this.f143782p.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                textPaint.setTypeface(AbstractC26112n.m134364E(root, 9));
            }

            @Override // android.text.style.MetricAffectingSpan
            public void updateMeasureState(TextPaint textPaint) {
                AbstractC19074t.m100208f(textPaint, "paint");
                LinearLayout root = this.f143782p.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                textPaint.setTypeface(AbstractC26112n.m134364E(root, 9));
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(C31167h0 c31167h0, C25024k0 c25024k0) {
            super(r0);
            AbstractC19074t.m100208f(c25024k0, "binding");
            this.f143768J = c31167h0;
            LinearLayout root = c25024k0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143767I = c25024k0;
            LinearLayout root2 = c25024k0.getRoot();
            AbstractC19074t.m100207e(root2, "getRoot(...)");
            AbstractC26112n.m134407k0(root2, new a(c31167h0));
            SimpleShadowTextView simpleShadowTextView = c25024k0.f120023u;
            AbstractC19074t.m100207e(simpleShadowTextView, "tvSelect");
            AbstractC26112n.m134407k0(simpleShadowTextView, new C33057b(c31167h0));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
        /* renamed from: i0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m151647i0(Object obj) {
            Video video;
            boolean m127128x;
            AbstractC19074t.m100208f(obj, "data");
            if (obj instanceof Video) {
                video = (Video) obj;
            } else {
                video = null;
            }
            if (video != null) {
                this.f7784p.setTag(video);
                C25024k0 c25024k0 = this.f143767I;
                C23528a c23528a = (C23528a) new C23528a(c25024k0.getRoot().getContext()).m123612r(c25024k0.f120021s);
                c23528a.m123599d();
                String m52867T = video.m52867T();
                int m130065d = C25092o.f120501a.m130065d();
                LinearLayout root = c25024k0.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                C24003n c24003n = new C24003n(m130065d, AbstractC26112n.m134434z(root, AbstractC27408c.zch_placeholder_thumbnail_video_channel), 0, false, 0, false, null, 124, null);
                c cVar = new c(video, c25024k0);
                cVar.m125609e1(true);
                C24848g0 c24848g0 = C24848g0.f119245a;
                String m52894j = video.m52894j();
                if (m52894j != null) {
                    m127128x = AbstractC24341v.m127128x(m52894j);
                    if (!m127128x) {
                        EllipsizedTextView ellipsizedTextView = c25024k0.f120022t;
                        SpannableString spannableString = new SpannableString(video.m52894j());
                        Matcher matcher = Pattern.compile("#\\w+").matcher(spannableString);
                        while (matcher.find()) {
                            spannableString.setSpan(new d(c25024k0), matcher.start(), matcher.end(), 17);
                        }
                        ellipsizedTextView.setText(spannableString);
                        if (!video.m52915v0()) {
                            ImageView imageView = c25024k0.f120019q;
                            AbstractC19074t.m100207e(imageView, "btnPlay");
                            AbstractC26112n.m134367H(imageView);
                            ImageView imageView2 = c25024k0.f120020r;
                            AbstractC19074t.m100207e(imageView2, "icoStatus");
                            AbstractC26112n.m134431w0(imageView2);
                            ImageView imageView3 = c25024k0.f120020r;
                            Context context = c25024k0.getRoot().getContext();
                            AbstractC19074t.m100207e(context, "getContext(...)");
                            imageView3.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_hide_line_24, AbstractC27406a.zch_icon_primary));
                            return;
                        }
                        ImageView imageView4 = c25024k0.f120019q;
                        AbstractC19074t.m100207e(imageView4, "btnPlay");
                        AbstractC26112n.m134431w0(imageView4);
                        ImageView imageView5 = c25024k0.f120020r;
                        AbstractC19074t.m100207e(imageView5, "icoStatus");
                        AbstractC26112n.m134367H(imageView5);
                        return;
                    }
                }
                c25024k0.f120022t.setText("");
                if (!video.m52915v0()) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.h0$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final c f143783y = new c();

        c() {
            super(3, C25024k0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchVideoChannelBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151652h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25024k0 m151652h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25024k0.m129866c(layoutInflater, viewGroup, z11);
        }
    }

    public /* synthetic */ C31167h0(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        a aVar = this.f143766v;
        if (aVar == null || (m51171p = this.f143765u.m51171p()) == null) {
            return;
        }
        aVar.mo54865a(m51171p);
    }

    /* renamed from: R */
    public final void m151640R() {
        this.f143765u = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        m10008p();
    }

    /* renamed from: S */
    public final a m151641S() {
        return this.f143766v;
    }

    /* renamed from: T */
    public final Section m151642T() {
        return this.f143765u;
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        super.mo9990A(bVar, i11);
        bVar.m151647i0(this.f143765u.m51168m().get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, c.f143783y, false, 2, null);
        AbstractC19074t.m100205c(m134373N);
        return new b(this, (C25024k0) m134373N);
    }

    /* renamed from: W */
    public final void m151645W(a aVar) {
        this.f143766v = aVar;
    }

    /* renamed from: X */
    public final void m151646X(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143765u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143765u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31167h0(Section section) {
        super(10);
        AbstractC19074t.m100208f(section, "data");
        this.f143765u = section;
    }
}
