package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c20.C3226p;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem;
import com.zing.zalo.shortvideo.p072ui.model.FooterVideoPromote;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoLabel;
import com.zing.zalo.shortvideo.p072ui.model.VideoPromote;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import mj0.AbstractC23322a;
import p354n3.C23528a;
import p379o3.AbstractRunnableC23992c;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q10.C25051s0;
import q10.C25057u0;
import q20.C25083f;
import q20.C25085h;
import q20.C25092o;
import s20.AbstractC26112n;
import u20.C26980a;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import z10.C31179n0;

/* loaded from: classes5.dex */
public final class NormalVideoItem extends VideoItem {
    public static final C9635b Companion = new C9635b(null);

    /* renamed from: O */
    private InterfaceC9634a f50831O;

    /* renamed from: P */
    private InterfaceC9636c f50832P;

    /* renamed from: Q */
    private final int f50833Q;

    /* renamed from: R */
    private final int f50834R;

    /* renamed from: S */
    private final int f50835S;

    /* renamed from: T */
    private final int f50836T;

    /* renamed from: U */
    private C25057u0 f50837U;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9634a extends VideoItem.InterfaceC9673a {
        /* renamed from: h */
        void mo52311h();

        /* renamed from: l */
        void mo52312l();

        /* renamed from: t */
        void mo52313t(VideoLabel videoLabel);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$b */
    /* loaded from: classes5.dex */
    public static final class C9635b {
        private C9635b() {
        }

        public /* synthetic */ C9635b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC9636c extends VideoItem.InterfaceC9675c {
        /* renamed from: c */
        void mo52314c();

        /* renamed from: d */
        void mo52315d();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$d */
    /* loaded from: classes5.dex */
    static final class C9637d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ VideoLabel f50839r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9637d(VideoLabel videoLabel) {
            super(1);
            this.f50839r = videoLabel;
        }

        /* renamed from: a */
        public final void m52316a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9634a callback = NormalVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52313t(this.f50839r);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52316a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC9638e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ C25057u0 f50840p;

        public RunnableC9638e(C25057u0 c25057u0) {
            this.f50840p = c25057u0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f50840p.f120324E.setSelected(true);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$f */
    /* loaded from: classes5.dex */
    public static final class C9639f extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Video f50841l1;

        /* renamed from: m1 */
        final /* synthetic */ NormalVideoItem f50842m1;

        /* renamed from: n1 */
        final /* synthetic */ RecyclingImageView f50843n1;

        /* renamed from: o1 */
        final /* synthetic */ C25051s0 f50844o1;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$f$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50845t;

            /* renamed from: u */
            final /* synthetic */ Bitmap f50846u;

            /* renamed from: v */
            final /* synthetic */ C25051s0 f50847v;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32731a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f50848t;

                /* renamed from: u */
                final /* synthetic */ C25051s0 f50849u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f50850v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32731a(C25051s0 c25051s0, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f50849u = c25051s0;
                    this.f50850v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32731a(this.f50849u, this.f50850v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f50848t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f50849u.f120240F.setImageBitmap(this.f50850v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32731a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, C25051s0 c25051s0, Continuation continuation) {
                super(2, continuation);
                this.f50846u = bitmap;
                this.f50847v = c25051s0;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f50846u, this.f50847v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50845t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Bitmap m130014a = C25083f.f120483a.m130014a(this.f50846u, 100.0f);
                    if (m130014a != null) {
                        C25051s0 c25051s0 = this.f50847v;
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32731a c32731a = new C32731a(c25051s0, m130014a, null);
                        this.f50845t = 1;
                        if (BuildersKt.m112534g(m112681c, c32731a, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
                AbstractRunnableC23992c.m125520D();
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C9639f(Video video, NormalVideoItem normalVideoItem, RecyclingImageView recyclingImageView, C25051s0 c25051s0) {
            this.f50841l1 = video;
            this.f50842m1 = normalVideoItem;
            this.f50843n1 = recyclingImageView;
            this.f50844o1 = c25051s0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                Video video = this.f50841l1;
                NormalVideoItem normalVideoItem = this.f50842m1;
                RecyclingImageView recyclingImageView = this.f50843n1;
                C25051s0 c25051s0 = this.f50844o1;
                video.m52864R0(m18839c.getWidth() / m18839c.getHeight());
                normalVideoItem.getVideoLayoutor().m16356q(video.m52847I());
                recyclingImageView.requestLayout();
                BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, c25051s0, null), 3, null);
                recyclingImageView.setTag(new BitmapDrawable(recyclingImageView.getResources(), m18839c));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$g */
    /* loaded from: classes5.dex */
    static final class C9640g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9640g f50851q = new C9640g();

        C9640g() {
            super(1);
        }

        /* renamed from: a */
        public final void m52319a(View view) {
            AbstractC19074t.m100208f(view, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52319a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$h */
    /* loaded from: classes5.dex */
    static final class C9641h extends AbstractC19075u implements InterfaceC18505l {
        C9641h() {
            super(1);
        }

        /* renamed from: a */
        public final void m52320a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9636c controller = NormalVideoItem.this.getController();
            if (controller != null) {
                controller.mo52315d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52320a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$i */
    /* loaded from: classes5.dex */
    static final class C9642i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25057u0 f50853q;

        /* renamed from: r */
        final /* synthetic */ NormalVideoItem f50854r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9642i(C25057u0 c25057u0, NormalVideoItem normalVideoItem) {
            super(1);
            this.f50853q = c25057u0;
            this.f50854r = normalVideoItem;
        }

        /* renamed from: a */
        public final void m52321a(View view) {
            Drawable drawable;
            AbstractC19074t.m100208f(view, "it");
            LinearLayout linearLayout = this.f50853q.f120323D;
            AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
            AbstractC26112n.m134374O(linearLayout);
            RecyclingImageView recyclingImageView = this.f50854r.getParentBinding().f120240F;
            Object tag = recyclingImageView.getTag();
            if (tag instanceof Drawable) {
                drawable = (Drawable) tag;
            } else {
                drawable = null;
            }
            recyclingImageView.setTag(recyclingImageView.getDrawable());
            recyclingImageView.setImageDrawable(drawable);
            InterfaceC9636c controller = this.f50854r.getController();
            if (controller != null) {
                controller.mo52314c();
            }
            this.f50854r.setControlAlpha(0.0f);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52321a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$j */
    /* loaded from: classes5.dex */
    static final class C9643j extends AbstractC19075u implements InterfaceC18505l {
        C9643j() {
            super(1);
        }

        /* renamed from: a */
        public final void m52322a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9634a callback = NormalVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52312l();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52322a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$k */
    /* loaded from: classes5.dex */
    static final class C9644k extends AbstractC19075u implements InterfaceC18505l {
        C9644k() {
            super(1);
        }

        /* renamed from: a */
        public final void m52323a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9634a callback = NormalVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52446q(true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52323a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem$l */
    /* loaded from: classes5.dex */
    static final class C9645l extends AbstractC19075u implements InterfaceC18505l {
        C9645l() {
            super(1);
        }

        /* renamed from: a */
        public final void m52324a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9634a callback = NormalVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52311h();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52324a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalVideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50833Q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_dangerous_margin);
        this.f50834R = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp);
        this.f50835S = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_promote_link_margin);
        this.f50836T = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_promote_footer_height);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: F */
    public void mo52308F(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C25051s0 parentBinding = getParentBinding();
        if (!video.m52915v0()) {
            super.mo52308F(video);
            return;
        }
        RecyclingImageView recyclingImageView = parentBinding.f120240F;
        getVideoLayoutor().m16356q(video.m52847I());
        C23528a c23528a = (C23528a) new C23528a(recyclingImageView.getContext()).m123612r(parentBinding.f120240F);
        String m52898l = video.m52898l();
        int m130066e = C25092o.f120501a.m130066e();
        AbstractC19074t.m100205c(recyclingImageView);
        C24003n c24003n = new C24003n(m130066e, AbstractC26112n.m134434z(recyclingImageView, AbstractC27408c.zch_placeholder_thumbnail_video), 0, false, 0, false, null, 124, null);
        C9639f c9639f = new C9639f(video, this, recyclingImageView, parentBinding);
        c9639f.m125609e1(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        c23528a.m123579C(m52898l, c24003n, c9639f);
        AbstractC19074t.m100205c(recyclingImageView);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: H */
    public void mo52018H(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120323D;
        AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
        if (AbstractC26112n.m134380U(linearLayout)) {
            return;
        }
        super.mo52018H(motionEvent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: O */
    public Rect mo52309O(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120320A;
        AbstractC19074t.m100207e(linearLayout, "lytPromoteFooter");
        if (AbstractC26112n.m134378S(linearLayout)) {
            i15 = i14 - this.f50836T;
            LinearLayout linearLayout2 = c25057u0.f120320A;
            AbstractC19074t.m100207e(linearLayout2, "lytPromoteFooter");
            AbstractC26112n.m134383X(linearLayout2, i15, i11);
        } else {
            i15 = i14;
        }
        return new Rect(i11, i15, i13, i14);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: P */
    public Rect mo52019P(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        ExtraActionLayout extraActionLayout = c25057u0.f120338y;
        AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
        if (AbstractC26112n.m134378S(extraActionLayout)) {
            ExtraActionLayout extraActionLayout2 = c25057u0.f120338y;
            AbstractC19074t.m100207e(extraActionLayout2, "lytExtraAction");
            AbstractC26112n.m134381V(extraActionLayout2, i14, i11);
            i15 = i14 - c25057u0.f120338y.getMeasuredHeight();
        } else {
            i15 = i14;
        }
        LinearLayout linearLayout = c25057u0.f120322C;
        AbstractC19074t.m100207e(linearLayout, "lytWarningDangerous");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25057u0.f120322C;
            AbstractC19074t.m100207e(linearLayout2, "lytWarningDangerous");
            AbstractC26112n.m134381V(linearLayout2, i15, i11);
            i15 -= c25057u0.f120322C.getMeasuredHeight() + this.f50833Q;
        }
        int height = i15 - super.mo52019P(z11, i11, i12, i13, i15).height();
        LinearLayout linearLayout3 = c25057u0.f120321B;
        AbstractC19074t.m100207e(linearLayout3, "lytPromoteLink");
        if (AbstractC26112n.m134378S(linearLayout3)) {
            int i16 = height - this.f50835S;
            LinearLayout linearLayout4 = c25057u0.f120321B;
            AbstractC19074t.m100207e(linearLayout4, "lytPromoteLink");
            AbstractC26112n.m134381V(linearLayout4, i16, i11);
            height = i16 - c25057u0.f120321B.getMeasuredHeight();
        }
        LinearLayout linearLayout5 = c25057u0.f120339z;
        AbstractC19074t.m100207e(linearLayout5, "lytLabel");
        if (AbstractC26112n.m134378S(linearLayout5)) {
            LinearLayout linearLayout6 = c25057u0.f120339z;
            AbstractC19074t.m100207e(linearLayout6, "lytLabel");
            AbstractC26112n.m134381V(linearLayout6, height, i11);
            height -= c25057u0.f120339z.getMeasuredHeight();
        }
        return new Rect(i11, height, i13, i14);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: S */
    public Size mo52310S(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120320A;
        AbstractC19074t.m100207e(linearLayout, "lytPromoteFooter");
        if (AbstractC26112n.m134378S(linearLayout)) {
            if (C3226p.Companion.m16362e()) {
                LinearLayout linearLayout2 = c25057u0.f120320A;
                AbstractC19074t.m100207e(linearLayout2, "lytPromoteFooter");
                AbstractC26112n.m134387a0(linearLayout2, size, 1073741824, this.f50836T + getFooterHeight(), 1073741824);
                LinearLayout linearLayout3 = c25057u0.f120320A;
                AbstractC19074t.m100207e(linearLayout3, "lytPromoteFooter");
                AbstractC26112n.m134411m0(linearLayout3, getFooterHeight());
            } else {
                LinearLayout linearLayout4 = c25057u0.f120320A;
                AbstractC19074t.m100207e(linearLayout4, "lytPromoteFooter");
                AbstractC26112n.m134387a0(linearLayout4, size, 1073741824, this.f50836T, 1073741824);
            }
            i13 = this.f50836T;
        } else {
            i13 = 0;
        }
        return new Size(size, i13);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: T */
    public Size mo52020T(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        ExtraActionLayout extraActionLayout = c25057u0.f120338y;
        AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
        if (AbstractC26112n.m134378S(extraActionLayout)) {
            ExtraActionLayout extraActionLayout2 = c25057u0.f120338y;
            AbstractC19074t.m100207e(extraActionLayout2, "lytExtraAction");
            AbstractC26112n.m134387a0(extraActionLayout2, size, 1073741824, 0, 0);
            i13 = c25057u0.f120338y.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        LinearLayout linearLayout = c25057u0.f120322C;
        AbstractC19074t.m100207e(linearLayout, "lytWarningDangerous");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25057u0.f120322C;
            AbstractC19074t.m100207e(linearLayout2, "lytWarningDangerous");
            AbstractC26112n.m134387a0(linearLayout2, size, 1073741824, 0, 0);
            i13 += c25057u0.f120322C.getMeasuredHeight() + this.f50833Q;
        }
        int height = i13 + super.mo52020T(i11, i12).getHeight();
        LinearLayout linearLayout3 = c25057u0.f120321B;
        AbstractC19074t.m100207e(linearLayout3, "lytPromoteLink");
        if (AbstractC26112n.m134378S(linearLayout3)) {
            LinearLayout linearLayout4 = c25057u0.f120321B;
            AbstractC19074t.m100207e(linearLayout4, "lytPromoteLink");
            AbstractC26112n.m134387a0(linearLayout4, 0, 0, 0, 0);
        }
        LinearLayout linearLayout5 = c25057u0.f120339z;
        AbstractC19074t.m100207e(linearLayout5, "lytLabel");
        if (AbstractC26112n.m134378S(linearLayout5)) {
            LinearLayout linearLayout6 = c25057u0.f120339z;
            AbstractC19074t.m100207e(linearLayout6, "lytLabel");
            AbstractC26112n.m134387a0(linearLayout6, size, Integer.MIN_VALUE, 0, 0);
        }
        return new Size(size, height + c25057u0.f120321B.getMeasuredHeight() + this.f50835S + c25057u0.f120339z.getMeasuredHeight());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: Z */
    public void mo52021Z() {
        super.mo52021Z();
        setPromoteFooterAutoScroll(false);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public InterfaceC9634a getCallback() {
        return this.f50831O;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public InterfaceC9636c getController() {
        return this.f50832P;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: m */
    public void mo52024m(Video video, String str, C31179n0.d dVar, boolean z11) {
        String str2;
        String str3;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        super.mo52024m(video, str, dVar, z11);
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        if (video.m52915v0()) {
            c25057u0.f120337x.setImageDrawable(C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_layer_background_disable, 0, 0, AbstractC23322a.zds_ic_hide_line_24, AbstractC27406a.zch_icon_primary, AbstractC27407b.zch_item_video_padding, 6, null));
            c25057u0.f120328I.setText(video.m52854M());
            c25057u0.f120327H.setText(video.m52851K());
            LinearLayout linearLayout = c25057u0.f120323D;
            AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
            AbstractC26112n.m134431w0(linearLayout);
            setControlAlpha(1.0f);
        } else {
            LinearLayout linearLayout2 = c25057u0.f120323D;
            AbstractC19074t.m100207e(linearLayout2, "lytWarningSensitive");
            AbstractC26112n.m134367H(linearLayout2);
        }
        if (video.m52899l0()) {
            ImageView imageView = c25057u0.f120336w;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            imageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_info_circle_line_16, AbstractC27406a.zch_text_primary_a60));
            c25057u0.f120326G.setText(video.m52890h());
            LinearLayout linearLayout3 = c25057u0.f120322C;
            AbstractC19074t.m100207e(linearLayout3, "lytWarningDangerous");
            AbstractC26112n.m134431w0(linearLayout3);
        } else {
            LinearLayout linearLayout4 = c25057u0.f120322C;
            AbstractC19074t.m100207e(linearLayout4, "lytWarningDangerous");
            AbstractC26112n.m134367H(linearLayout4);
        }
        VideoPromote m52873W = video.m52873W();
        if (m52873W != null && m52873W.isValid()) {
            LinearLayout linearLayout5 = c25057u0.f120321B;
            AbstractC19074t.m100207e(linearLayout5, "lytPromoteLink");
            AbstractC26112n.m134431w0(linearLayout5);
            LinearLayout linearLayout6 = c25057u0.f120321B;
            AbstractC19074t.m100207e(linearLayout6, "lytPromoteLink");
            AbstractC26112n.m134391c0(linearLayout6, AbstractC26112n.m134426u(this, AbstractC27406a.zch_black_a50), this.f50834R);
            c25057u0.f120335v.m55955j(this.f50834R / 2.0f, RoundedImageView.EnumC10755b.f54377p);
            EllipsizedTextView ellipsizedTextView = c25057u0.f120325F;
            VideoPromote m52873W2 = video.m52873W();
            if (m52873W2 != null) {
                str2 = m52873W2.m52960c();
            } else {
                str2 = null;
            }
            ellipsizedTextView.setText(str2);
            C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25057u0.f120335v);
            c23528a.m123599d();
            VideoPromote m52873W3 = video.m52873W();
            if (m52873W3 != null) {
                str3 = m52873W3.m52958a();
            } else {
                str3 = null;
            }
            Context m123611q = c23528a.m123611q();
            AbstractC19074t.m100207e(m123611q, "getContext(...)");
        } else {
            LinearLayout linearLayout7 = c25057u0.f120321B;
            AbstractC19074t.m100207e(linearLayout7, "lytPromoteLink");
            AbstractC26112n.m134367H(linearLayout7);
        }
        FooterVideoPromote m52900m = video.m52900m();
        if (m52900m != null && m52900m.m52808h()) {
            LinearLayout linearLayout8 = c25057u0.f120320A;
            Integer m52801a = m52900m.m52801a();
            AbstractC19074t.m100205c(m52801a);
            linearLayout8.setBackgroundColor(m52801a.intValue());
            SimpleShadowTextView simpleShadowTextView = c25057u0.f120324E;
            Integer m52804d = m52900m.m52804d();
            AbstractC19074t.m100205c(m52804d);
            simpleShadowTextView.setTextColor(m52804d.intValue());
            c25057u0.f120324E.setText(m52900m.m52805e());
            SimpleShadowTextView simpleShadowTextView2 = c25057u0.f120324E;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtPromoteFooter");
            simpleShadowTextView2.postDelayed(new RunnableC9638e(c25057u0), 1000L);
            String m52803c = m52900m.m52803c();
            if (m52803c != null && m52803c.length() != 0) {
                RecyclingImageView recyclingImageView = c25057u0.f120334u;
                AbstractC19074t.m100207e(recyclingImageView, "icoPromoteFooterChevron");
                AbstractC26112n.m134431w0(recyclingImageView);
                C23528a c23528a2 = (C23528a) new C23528a(getContext()).m123612r(c25057u0.f120334u);
                String m52803c2 = m52900m.m52803c();
                Context m123611q2 = c23528a2.m123611q();
                AbstractC19074t.m100207e(m123611q2, "getContext(...)");
            } else {
                RecyclingImageView recyclingImageView2 = c25057u0.f120334u;
                AbstractC19074t.m100207e(recyclingImageView2, "icoPromoteFooterChevron");
                AbstractC26112n.m134367H(recyclingImageView2);
            }
            String m52802b = m52900m.m52802b();
            if (m52802b != null && m52802b.length() != 0) {
                RecyclingImageView recyclingImageView3 = c25057u0.f120333t;
                AbstractC19074t.m100207e(recyclingImageView3, "icoPromoteFooter");
                AbstractC26112n.m134431w0(recyclingImageView3);
                C23528a c23528a3 = (C23528a) new C23528a(getContext()).m123612r(c25057u0.f120333t);
                String m52802b2 = m52900m.m52802b();
                Context m123611q3 = c23528a3.m123611q();
                AbstractC19074t.m100207e(m123611q3, "getContext(...)");
            } else {
                RecyclingImageView recyclingImageView4 = c25057u0.f120333t;
                AbstractC19074t.m100207e(recyclingImageView4, "icoPromoteFooter");
                AbstractC26112n.m134367H(recyclingImageView4);
            }
            LinearLayout linearLayout9 = c25057u0.f120320A;
            AbstractC19074t.m100207e(linearLayout9, "lytPromoteFooter");
            AbstractC26112n.m134431w0(linearLayout9);
        } else {
            LinearLayout linearLayout10 = c25057u0.f120320A;
            AbstractC19074t.m100207e(linearLayout10, "lytPromoteFooter");
            AbstractC26112n.m134367H(linearLayout10);
        }
        List<VideoLabel> m52916w = video.m52916w();
        List list = m52916w;
        if (list != null && !list.isEmpty()) {
            c25057u0.f120339z.removeAllViews();
            for (VideoLabel videoLabel : m52916w) {
                if (videoLabel.m52949h()) {
                    LinearLayout linearLayout11 = c25057u0.f120339z;
                    AbstractC19074t.m100207e(linearLayout11, "lytLabel");
                    View m134372M = AbstractC26112n.m134372M(linearLayout11, AbstractC27410e.zch_item_video_label, false, 2, null);
                    SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) m134372M.findViewById(AbstractC27409d.txtLabel);
                    RoundedImageView roundedImageView = (RoundedImageView) m134372M.findViewById(AbstractC27409d.icoLabel);
                    Integer m52942a = videoLabel.m52942a();
                    AbstractC19074t.m100205c(m52942a);
                    AbstractC26112n.m134391c0(m134372M, m52942a.intValue(), this.f50834R);
                    roundedImageView.m55955j(this.f50834R / 2.0f, RoundedImageView.EnumC10755b.f54377p);
                    Integer m52945d = videoLabel.m52945d();
                    AbstractC19074t.m100205c(m52945d);
                    simpleShadowTextView3.setTextColor(m52945d.intValue());
                    simpleShadowTextView3.setText(videoLabel.m52946e());
                    String m52943b = videoLabel.m52943b();
                    if (m52943b != null && m52943b.length() != 0) {
                        AbstractC19074t.m100205c(roundedImageView);
                        AbstractC26112n.m134431w0(roundedImageView);
                        C23528a c23528a4 = (C23528a) new C23528a(getContext()).m123612r(roundedImageView);
                        String m52943b2 = videoLabel.m52943b();
                        Context m123611q4 = c23528a4.m123611q();
                        AbstractC19074t.m100207e(m123611q4, "getContext(...)");
                    } else {
                        AbstractC19074t.m100205c(roundedImageView);
                        AbstractC26112n.m134367H(roundedImageView);
                    }
                    m134372M.setTag(videoLabel);
                    String m52948g = videoLabel.m52948g();
                    if (m52948g != null && m52948g.length() != 0) {
                        AbstractC26112n.m134407k0(m134372M, new C9637d(videoLabel));
                    }
                    c25057u0.f120339z.addView(m134372M);
                }
            }
            LinearLayout linearLayout12 = c25057u0.f120339z;
            AbstractC19074t.m100207e(linearLayout12, "lytLabel");
            AbstractC26112n.m134431w0(linearLayout12);
            return;
        }
        LinearLayout linearLayout13 = c25057u0.f120339z;
        AbstractC19074t.m100207e(linearLayout13, "lytLabel");
        AbstractC26112n.m134367H(linearLayout13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C25057u0 m129945a = C25057u0.m129945a(this);
        AbstractC19074t.m100207e(m129945a, "bind(...)");
        LinearLayout linearLayout = m129945a.f120323D;
        AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
        AbstractC26112n.m134407k0(linearLayout, C9640g.f50851q);
        SimpleShadowTextView simpleShadowTextView = m129945a.f120332s;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnWarningSensitiveSkip");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C9641h());
        SimpleShadowTextView simpleShadowTextView2 = m129945a.f120331r;
        AbstractC19074t.m100207e(simpleShadowTextView2, "btnWarningSensitivePlay");
        AbstractC26112n.m134407k0(simpleShadowTextView2, new C9642i(m129945a, this));
        LinearLayout linearLayout2 = m129945a.f120321B;
        AbstractC19074t.m100207e(linearLayout2, "lytPromoteLink");
        AbstractC26112n.m134407k0(linearLayout2, new C9643j());
        SimpleShadowTextView simpleShadowTextView3 = m129945a.f120330q;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnExtraAction");
        AbstractC26112n.m134407k0(simpleShadowTextView3, new C9644k());
        LinearLayout linearLayout3 = m129945a.f120320A;
        AbstractC19074t.m100207e(linearLayout3, "lytPromoteFooter");
        AbstractC26112n.m134407k0(linearLayout3, new C9645l());
        this.f50837U = m129945a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120323D;
        AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25057u0.f120323D;
            AbstractC19074t.m100207e(linearLayout2, "lytWarningSensitive");
            AbstractC26112n.m134383X(linearLayout2, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120323D;
        AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25057u0.f120323D;
            AbstractC19074t.m100207e(linearLayout2, "lytWarningSensitive");
            AbstractC26112n.m134387a0(linearLayout2, size, 1073741824, size2, 1073741824);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120323D;
        AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
        if (AbstractC26112n.m134380U(linearLayout)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: q */
    public void mo52026q(Video video, List list, String str, C31179n0.d dVar) {
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(list, "payloads");
        AbstractC19074t.m100208f(str, "source");
        if (AbstractC19074t.m100204b(list.get(0), "TRIGGER_SCROLL_FOOTER")) {
            setPromoteFooterAutoScroll(true);
        } else {
            super.mo52026q(video, list, str, dVar);
        }
    }

    public void setCallback(InterfaceC9634a interfaceC9634a) {
        this.f50831O = interfaceC9634a;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public void setControlAlpha(float f11) {
        float f12;
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120323D;
        AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
        if (AbstractC26112n.m134380U(linearLayout)) {
            super.setControlAlpha(1.0f);
            f12 = 0.0f;
        } else {
            super.setControlAlpha(f11);
            f12 = 1.0f - f11;
        }
        LinearLayout linearLayout2 = c25057u0.f120322C;
        AbstractC19074t.m100207e(linearLayout2, "lytWarningDangerous");
        ExtraActionLayout extraActionLayout = c25057u0.f120338y;
        AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
        LinearLayout linearLayout3 = c25057u0.f120321B;
        AbstractC19074t.m100207e(linearLayout3, "lytPromoteLink");
        LinearLayout linearLayout4 = c25057u0.f120320A;
        AbstractC19074t.m100207e(linearLayout4, "lytPromoteFooter");
        LinearLayout linearLayout5 = c25057u0.f120339z;
        AbstractC19074t.m100207e(linearLayout5, "lytLabel");
        ViewGroup[] viewGroupArr = {linearLayout2, extraActionLayout, linearLayout3, linearLayout4, linearLayout5};
        for (int i11 = 0; i11 < 5; i11++) {
            viewGroupArr[i11].setAlpha(f12);
        }
    }

    public void setController(InterfaceC9636c interfaceC9636c) {
        this.f50832P = interfaceC9636c;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public void setInfoActive(boolean z11) {
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120323D;
        AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
        if (AbstractC26112n.m134380U(linearLayout)) {
            return;
        }
        super.setInfoActive(z11);
    }

    public final void setPromoteFooterAutoScroll(boolean z11) {
        C25057u0 c25057u0 = this.f50837U;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        LinearLayout linearLayout = c25057u0.f120320A;
        AbstractC19074t.m100207e(linearLayout, "lytPromoteFooter");
        if (AbstractC26112n.m134379T(linearLayout)) {
            return;
        }
        if (z11) {
            if (!c25057u0.f120324E.isSelected()) {
                c25057u0.f120324E.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                c25057u0.f120324E.setSelected(true);
                return;
            }
            return;
        }
        if (c25057u0.f120324E.isSelected()) {
            c25057u0.f120324E.setSelected(false);
            c25057u0.f120324E.setEllipsize(null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public void setThumbnailVisible(boolean z11) {
        super.setThumbnailVisible(z11);
        C25057u0 c25057u0 = this.f50837U;
        Drawable drawable = null;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        if (z11) {
            LinearLayout linearLayout = c25057u0.f120323D;
            AbstractC19074t.m100207e(linearLayout, "lytWarningSensitive");
            if (AbstractC26112n.m134377R(linearLayout)) {
                LinearLayout linearLayout2 = c25057u0.f120323D;
                AbstractC19074t.m100207e(linearLayout2, "lytWarningSensitive");
                AbstractC26112n.m134431w0(linearLayout2);
                RecyclingImageView recyclingImageView = getParentBinding().f120240F;
                Object tag = recyclingImageView.getTag();
                if (tag instanceof Drawable) {
                    drawable = (Drawable) tag;
                }
                recyclingImageView.setTag(recyclingImageView.getDrawable());
                recyclingImageView.setImageDrawable(drawable);
                setControlAlpha(1.0f);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: v */
    public void mo52028v(Video video, C31179n0.d dVar, boolean z11) {
        AbstractC19074t.m100208f(video, "video");
        super.mo52028v(video, dVar, z11);
        C25057u0 c25057u0 = this.f50837U;
        String str = null;
        if (c25057u0 == null) {
            AbstractC19074t.m100223u("binding");
            c25057u0 = null;
        }
        String m50769l = video.m52887f().m50769l();
        Channel m140377a = C27417l.f129055a.m140377a();
        if (m140377a != null) {
            str = m140377a.m50769l();
        }
        if (AbstractC19074t.m100204b(m50769l, str)) {
            ExtraActionLayout extraActionLayout = c25057u0.f120338y;
            AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
            AbstractC26112n.m134367H(extraActionLayout);
            return;
        }
        if (dVar != null && dVar.m151888a()) {
            if (video.m52887f().m50741Q()) {
                c25057u0.f120330q.setBackgroundResource(AbstractC27408c.zch_bg_button_video_qna);
                SimpleShadowTextView simpleShadowTextView = c25057u0.f120330q;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString("   ");
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                spannableString.setSpan(new C26980a(context, AbstractC23322a.zds_ic_check_solid_16, AbstractC27406a.zch_text_primary), 0, 1, 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) AbstractC26112n.m134366G(this, AbstractC27413h.zch_page_channel_following, new Object[0]));
                simpleShadowTextView.setText(spannableStringBuilder);
            } else {
                c25057u0.f120330q.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
                c25057u0.f120330q.setText(AbstractC27413h.zch_item_video_follow);
            }
            if (z11) {
                c25057u0.f120338y.m52112c();
            }
            ExtraActionLayout extraActionLayout2 = c25057u0.f120338y;
            AbstractC19074t.m100207e(extraActionLayout2, "lytExtraAction");
            AbstractC26112n.m134431w0(extraActionLayout2);
            return;
        }
        ExtraActionLayout extraActionLayout3 = c25057u0.f120338y;
        AbstractC19074t.m100207e(extraActionLayout3, "lytExtraAction");
        AbstractC26112n.m134367H(extraActionLayout3);
    }
}
