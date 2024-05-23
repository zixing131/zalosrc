package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
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
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q10.C25054t0;
import q20.C25083f;
import q20.C25085h;
import q20.C25092o;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.C26980a;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class ChannelVideoItem extends FrameLayout {

    /* renamed from: p */
    private InterfaceC9567a f50565p;

    /* renamed from: q */
    private final int f50566q;

    /* renamed from: r */
    private final int f50567r;

    /* renamed from: s */
    private final int f50568s;

    /* renamed from: t */
    private C25054t0 f50569t;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelVideoItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9567a {
        /* renamed from: d */
        void mo52058d();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelVideoItem$b */
    /* loaded from: classes5.dex */
    public static final class C9568b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Video f50570l1;

        /* renamed from: m1 */
        final /* synthetic */ C25054t0 f50571m1;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelVideoItem$b$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50572t;

            /* renamed from: u */
            private /* synthetic */ Object f50573u;

            /* renamed from: v */
            final /* synthetic */ Bitmap f50574v;

            /* renamed from: w */
            final /* synthetic */ C25054t0 f50575w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelVideoItem$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32726a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f50576t;

                /* renamed from: u */
                final /* synthetic */ C25054t0 f50577u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f50578v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32726a(C25054t0 c25054t0, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f50577u = c25054t0;
                    this.f50578v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32726a(this.f50577u, this.f50578v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f50576t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f50577u.f120296t.setImageBitmap(this.f50578v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32726a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, C25054t0 c25054t0, Continuation continuation) {
                super(2, continuation);
                this.f50574v = bitmap;
                this.f50575w = c25054t0;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f50574v, this.f50575w, continuation);
                aVar.f50573u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                CoroutineScope coroutineScope2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50572t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope2 = (CoroutineScope) this.f50573u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f50573u;
                    Bitmap m130014a = C25083f.f120483a.m130014a(this.f50574v, 100.0f);
                    if (m130014a != null) {
                        C25054t0 c25054t0 = this.f50575w;
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32726a c32726a = new C32726a(c25054t0, m130014a, null);
                        this.f50573u = coroutineScope;
                        this.f50572t = 1;
                        if (BuildersKt.m112534g(m112681c, c32726a, this) == m142578e) {
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

        C9568b(Video video, C25054t0 c25054t0) {
            this.f50570l1 = video;
            this.f50571m1 = c25054t0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                Video video = this.f50570l1;
                C25054t0 c25054t0 = this.f50571m1;
                if (video.m52915v0()) {
                    BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, c25054t0, null), 3, null);
                } else {
                    c25054t0.f120296t.setImageBitmap(m18839c);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ChannelVideoItem$c */
    /* loaded from: classes5.dex */
    static final class C9569c extends AbstractC19075u implements InterfaceC18505l {
        C9569c() {
            super(1);
        }

        /* renamed from: a */
        public final void m52061a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9567a callback = ChannelVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52058d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52061a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelVideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50566q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_channel_padding);
        this.f50567r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_channel_pin_size);
        this.f50568s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_channel_privacy_size);
    }

    /* renamed from: a */
    public final void m52057a(Video video, String str) {
        String str2;
        AbstractC19074t.m100208f(video, "video");
        C25054t0 c25054t0 = this.f50569t;
        if (c25054t0 == null) {
            AbstractC19074t.m100223u("binding");
            c25054t0 = null;
        }
        C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25054t0.f120296t);
        c23528a.m123599d();
        String m52867T = video.m52867T();
        C24003n c24003n = new C24003n(C25092o.f120501a.m130065d(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video_channel), 0, false, 0, false, null, 124, null);
        C9568b c9568b = new C9568b(video, c25054t0);
        c9568b.m125609e1(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        if (video.m52863R() == 0 && !video.m52915v0()) {
            if (video.m52912t0()) {
                c25054t0.f120293q.setImageDrawable(C25085h.m130020g(C25085h.f120485a, AbstractC27406a.zch_brand_border, AbstractC27407b.zch_radius_4dp, 0, 0, AbstractC23322a.zds_ic_pin_line_16, AbstractC27406a.zch_icon_primary, AbstractC27407b.zch_item_video_channel_pin_inset, 12, null));
                ImageView imageView = c25054t0.f120293q;
                AbstractC19074t.m100207e(imageView, "icoPin");
                AbstractC26112n.m134431w0(imageView);
            } else {
                ImageView imageView2 = c25054t0.f120293q;
                AbstractC19074t.m100207e(imageView2, "icoPin");
                AbstractC26112n.m134367H(imageView2);
            }
            SimpleShadowTextView simpleShadowTextView = c25054t0.f120297u;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtViewer");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            c25054t0.f120297u.setText(AbstractC26105g.m134334a(video.m52845H()));
            String m50769l = video.m52887f().m50769l();
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                str2 = m140377a.m50769l();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(m50769l, str2)) {
                if (video.m52914u0()) {
                    ImageView imageView3 = c25054t0.f120294r;
                    AbstractC19074t.m100207e(imageView3, "icoPrivacy");
                    AbstractC26112n.m134367H(imageView3);
                } else {
                    c25054t0.f120294r.setImageResource(AbstractC23322a.zch_ic_lock_line_16);
                    ImageView imageView4 = c25054t0.f120294r;
                    AbstractC19074t.m100207e(imageView4, "icoPrivacy");
                    AbstractC26112n.m134431w0(imageView4);
                }
            } else {
                ImageView imageView5 = c25054t0.f120294r;
                AbstractC19074t.m100207e(imageView5, "icoPrivacy");
                AbstractC26112n.m134367H(imageView5);
            }
            if (AbstractC19074t.m100204b(video.m52911t(), str)) {
                ImageView imageView6 = c25054t0.f120295s;
                AbstractC19074t.m100207e(imageView6, "icoStatus");
                AbstractC26112n.m134367H(imageView6);
                SimpleShadowTextView simpleShadowTextView2 = c25054t0.f120299w;
                AbstractC19074t.m100207e(simpleShadowTextView2, "vieStatus");
                AbstractC26112n.m134431w0(simpleShadowTextView2);
                SimpleShadowTextView simpleShadowTextView3 = c25054t0.f120299w;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString("  ");
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                spannableString.setSpan(new C26980a(context, AbstractC23322a.zds_ic_play_solid_16, AbstractC27406a.zch_text_primary), 0, 1, 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) AbstractC26112n.m134366G(this, AbstractC27413h.zch_item_video_channel_just_watched, new Object[0]));
                simpleShadowTextView3.setText(spannableStringBuilder);
                SimpleShadowTextView simpleShadowTextView4 = c25054t0.f120299w;
                AbstractC19074t.m100207e(simpleShadowTextView4, "vieStatus");
                AbstractC26112n.m134425t0(simpleShadowTextView4, AbstractC27406a.zch_text_primary);
                c25054t0.f120299w.setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_curtain_bold));
            } else {
                ImageView imageView7 = c25054t0.f120295s;
                AbstractC19074t.m100207e(imageView7, "icoStatus");
                AbstractC26112n.m134367H(imageView7);
                SimpleShadowTextView simpleShadowTextView5 = c25054t0.f120299w;
                AbstractC19074t.m100207e(simpleShadowTextView5, "vieStatus");
                AbstractC26112n.m134367H(simpleShadowTextView5);
            }
        } else {
            ImageView imageView8 = c25054t0.f120293q;
            AbstractC19074t.m100207e(imageView8, "icoPin");
            AbstractC26112n.m134367H(imageView8);
            SimpleShadowTextView simpleShadowTextView6 = c25054t0.f120297u;
            AbstractC19074t.m100207e(simpleShadowTextView6, "txtViewer");
            AbstractC26112n.m134367H(simpleShadowTextView6);
            ImageView imageView9 = c25054t0.f120294r;
            AbstractC19074t.m100207e(imageView9, "icoPrivacy");
            AbstractC26112n.m134367H(imageView9);
            if (video.m52915v0()) {
                ImageView imageView10 = c25054t0.f120295s;
                AbstractC19074t.m100207e(imageView10, "icoStatus");
                AbstractC26112n.m134431w0(imageView10);
                ImageView imageView11 = c25054t0.f120295s;
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                imageView11.setImageDrawable(C27280g.m139659b(context2, AbstractC23322a.zds_ic_hide_line_24, AbstractC27406a.zch_icon_primary));
                SimpleShadowTextView simpleShadowTextView7 = c25054t0.f120299w;
                AbstractC19074t.m100207e(simpleShadowTextView7, "vieStatus");
                AbstractC26112n.m134431w0(simpleShadowTextView7);
                c25054t0.f120299w.setText((CharSequence) null);
                c25054t0.f120299w.setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_curtain));
            } else {
                ImageView imageView12 = c25054t0.f120295s;
                AbstractC19074t.m100207e(imageView12, "icoStatus");
                AbstractC26112n.m134367H(imageView12);
                SimpleShadowTextView simpleShadowTextView8 = c25054t0.f120299w;
                AbstractC19074t.m100207e(simpleShadowTextView8, "vieStatus");
                AbstractC26112n.m134431w0(simpleShadowTextView8);
                c25054t0.f120299w.setText(video.m52865S());
                SimpleShadowTextView simpleShadowTextView9 = c25054t0.f120299w;
                AbstractC19074t.m100207e(simpleShadowTextView9, "vieStatus");
                AbstractC26112n.m134425t0(simpleShadowTextView9, AbstractC27406a.zch_text_primary_a60);
                c25054t0.f120299w.setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_curtain));
            }
        }
        if (video.m52863R() != 5) {
            ChannelVideoItem root = c25054t0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            AbstractC26112n.m134416p(root);
        } else {
            ChannelVideoItem root2 = c25054t0.getRoot();
            AbstractC19074t.m100207e(root2, "getRoot(...)");
            AbstractC26112n.m134398g(root2);
        }
    }

    public final InterfaceC9567a getCallback() {
        return this.f50565p;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25054t0 m129938a = C25054t0.m129938a(this);
        AbstractC19074t.m100207e(m129938a, "bind(...)");
        View view = m129938a.f120298v;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1644825, 1644825, 1644825, 1644825, -2145838823});
        view.setBackground(gradientDrawable);
        ChannelVideoItem root = m129938a.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC26112n.m134407k0(root, new C9569c());
        this.f50569t = m129938a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25054t0 c25054t0 = this.f50569t;
        if (c25054t0 == null) {
            AbstractC19074t.m100223u("binding");
            c25054t0 = null;
        }
        RecyclingImageView recyclingImageView = c25054t0.f120296t;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        AbstractC26112n.m134383X(recyclingImageView, 0, 0);
        View view = c25054t0.f120298v;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134383X(view, 0, 0);
        ImageView imageView = c25054t0.f120293q;
        AbstractC19074t.m100207e(imageView, "icoPin");
        if (AbstractC26112n.m134378S(imageView)) {
            int i15 = this.f50566q;
            ImageView imageView2 = c25054t0.f120293q;
            AbstractC19074t.m100207e(imageView2, "icoPin");
            AbstractC26112n.m134383X(imageView2, i15, i15);
        }
        SimpleShadowTextView simpleShadowTextView = c25054t0.f120297u;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtViewer");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            int i16 = this.f50566q;
            int measuredHeight = getMeasuredHeight() - this.f50566q;
            SimpleShadowTextView simpleShadowTextView2 = c25054t0.f120297u;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtViewer");
            AbstractC26112n.m134381V(simpleShadowTextView2, measuredHeight, i16);
        }
        ImageView imageView3 = c25054t0.f120294r;
        AbstractC19074t.m100207e(imageView3, "icoPrivacy");
        if (AbstractC26112n.m134378S(imageView3)) {
            int measuredWidth = getMeasuredWidth() - this.f50566q;
            int measuredHeight2 = getMeasuredHeight() - this.f50566q;
            ImageView imageView4 = c25054t0.f120294r;
            AbstractC19074t.m100207e(imageView4, "icoPrivacy");
            AbstractC26112n.m134382W(imageView4, measuredHeight2, measuredWidth);
        }
        SimpleShadowTextView simpleShadowTextView3 = c25054t0.f120299w;
        AbstractC19074t.m100207e(simpleShadowTextView3, "vieStatus");
        if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
            SimpleShadowTextView simpleShadowTextView4 = c25054t0.f120299w;
            AbstractC19074t.m100207e(simpleShadowTextView4, "vieStatus");
            AbstractC26112n.m134383X(simpleShadowTextView4, 0, 0);
            ImageView imageView5 = c25054t0.f120295s;
            AbstractC19074t.m100207e(imageView5, "icoStatus");
            if (AbstractC26112n.m134378S(imageView5)) {
                int measuredWidth2 = (getMeasuredWidth() - c25054t0.f120295s.getMeasuredWidth()) / 2;
                int measuredHeight3 = (getMeasuredHeight() - c25054t0.f120295s.getMeasuredHeight()) / 2;
                ImageView imageView6 = c25054t0.f120295s;
                AbstractC19074t.m100207e(imageView6, "icoStatus");
                AbstractC26112n.m134383X(imageView6, measuredHeight3, measuredWidth2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = (size * 3) / 2;
        C25054t0 c25054t0 = this.f50569t;
        if (c25054t0 == null) {
            AbstractC19074t.m100223u("binding");
            c25054t0 = null;
        }
        RecyclingImageView recyclingImageView = c25054t0.f120296t;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        AbstractC26112n.m134387a0(recyclingImageView, size, 1073741824, i13, 1073741824);
        View view = c25054t0.f120298v;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134387a0(view, size, 1073741824, i13, 1073741824);
        ImageView imageView = c25054t0.f120293q;
        AbstractC19074t.m100207e(imageView, "icoPin");
        if (AbstractC26112n.m134378S(imageView)) {
            ImageView imageView2 = c25054t0.f120293q;
            AbstractC19074t.m100207e(imageView2, "icoPin");
            int i14 = this.f50567r;
            AbstractC26112n.m134387a0(imageView2, i14, 1073741824, i14, 1073741824);
        }
        SimpleShadowTextView simpleShadowTextView = c25054t0.f120297u;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtViewer");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = c25054t0.f120297u;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtViewer");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
        }
        ImageView imageView3 = c25054t0.f120294r;
        AbstractC19074t.m100207e(imageView3, "icoPrivacy");
        if (AbstractC26112n.m134378S(imageView3)) {
            ImageView imageView4 = c25054t0.f120294r;
            AbstractC19074t.m100207e(imageView4, "icoPrivacy");
            int i15 = this.f50568s;
            AbstractC26112n.m134387a0(imageView4, i15, 1073741824, i15, 1073741824);
        }
        SimpleShadowTextView simpleShadowTextView3 = c25054t0.f120299w;
        AbstractC19074t.m100207e(simpleShadowTextView3, "vieStatus");
        if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
            SimpleShadowTextView simpleShadowTextView4 = c25054t0.f120299w;
            AbstractC19074t.m100207e(simpleShadowTextView4, "vieStatus");
            AbstractC26112n.m134387a0(simpleShadowTextView4, size, 1073741824, i13, 1073741824);
            ImageView imageView5 = c25054t0.f120295s;
            AbstractC19074t.m100207e(imageView5, "icoStatus");
            if (AbstractC26112n.m134378S(imageView5)) {
                ImageView imageView6 = c25054t0.f120295s;
                AbstractC19074t.m100207e(imageView6, "icoStatus");
                int i16 = size / 5;
                AbstractC26112n.m134387a0(imageView6, i16, 1073741824, i16, 1073741824);
            }
        }
        setMeasuredDimension(size, i13);
    }

    public final void setCallback(InterfaceC9567a interfaceC9567a) {
        this.f50565p = interfaceC9567a;
    }
}
