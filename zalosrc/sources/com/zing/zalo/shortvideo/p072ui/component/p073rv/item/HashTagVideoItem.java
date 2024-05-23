package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import ln0.AbstractC22543l;
import mj0.AbstractC23322a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q10.C25053t;
import q20.C25083f;
import q20.C25092o;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class HashTagVideoItem extends FrameLayout {

    /* renamed from: p */
    public C25053t f50693p;

    /* renamed from: q */
    private float f50694q;

    /* renamed from: r */
    private int f50695r;

    /* renamed from: s */
    private final int f50696s;

    /* renamed from: t */
    private final int f50697t;

    /* renamed from: u */
    private final int f50698u;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem$a */
    /* loaded from: classes5.dex */
    public static final class C9599a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Video f50699l1;

        /* renamed from: m1 */
        final /* synthetic */ HashTagVideoItem f50700m1;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem$a$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50701t;

            /* renamed from: u */
            private /* synthetic */ Object f50702u;

            /* renamed from: v */
            final /* synthetic */ Bitmap f50703v;

            /* renamed from: w */
            final /* synthetic */ HashTagVideoItem f50704w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32728a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f50705t;

                /* renamed from: u */
                final /* synthetic */ HashTagVideoItem f50706u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f50707v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32728a(HashTagVideoItem hashTagVideoItem, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f50706u = hashTagVideoItem;
                    this.f50707v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32728a(this.f50706u, this.f50707v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f50705t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f50706u.getBinding().f120286s.setImageBitmap(this.f50707v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32728a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, HashTagVideoItem hashTagVideoItem, Continuation continuation) {
                super(2, continuation);
                this.f50703v = bitmap;
                this.f50704w = hashTagVideoItem;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f50703v, this.f50704w, continuation);
                aVar.f50702u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                CoroutineScope coroutineScope2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50701t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope2 = (CoroutineScope) this.f50702u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f50702u;
                    Bitmap m130014a = C25083f.f120483a.m130014a(this.f50703v, 100.0f);
                    if (m130014a != null) {
                        HashTagVideoItem hashTagVideoItem = this.f50704w;
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32728a c32728a = new C32728a(hashTagVideoItem, m130014a, null);
                        this.f50702u = coroutineScope;
                        this.f50701t = 1;
                        if (BuildersKt.m112534g(m112681c, c32728a, this) == m142578e) {
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

        C9599a(Video video, HashTagVideoItem hashTagVideoItem) {
            this.f50699l1 = video;
            this.f50700m1 = hashTagVideoItem;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                Video video = this.f50699l1;
                HashTagVideoItem hashTagVideoItem = this.f50700m1;
                if (video.m52915v0()) {
                    BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, hashTagVideoItem, null), 3, null);
                } else {
                    hashTagVideoItem.getBinding().f120286s.setImageBitmap(m18839c);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem$b */
    /* loaded from: classes5.dex */
    public static final class C9600b extends ViewOutlineProvider {
        C9600b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 10.0f);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem$c */
    /* loaded from: classes5.dex */
    public static final class C9601c extends ViewOutlineProvider {
        C9601c() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 10.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashTagVideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50694q = 0.6666667f;
        this.f50695r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_channel_pin_size);
        this.f50696s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_8dp);
        this.f50697t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_6dp);
        this.f50698u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp);
    }

    /* renamed from: a */
    public final void m52168a(Video video) {
        AbstractC19074t.m100208f(video, "data");
        setTag(video);
        C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(getBinding().f120286s);
        c23528a.m123599d();
        String m52867T = video.m52867T();
        C24003n c24003n = new C24003n(C25092o.f120501a.m130068g(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video), 0, false, 0, false, null, 124, null);
        C9599a c9599a = new C9599a(video, this);
        c9599a.m125609e1(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        if (video.m52915v0()) {
            ImageView imageView = getBinding().f120285r;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            imageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_hide_line_24, AbstractC27406a.zch_icon_primary));
            getBinding().f120291x.setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_curtain));
            SimpleShadowTextView simpleShadowTextView = getBinding().f120291x;
            AbstractC19074t.m100207e(simpleShadowTextView, "vieStatus");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            ImageView imageView2 = getBinding().f120285r;
            AbstractC19074t.m100207e(imageView2, "icoStatus");
            AbstractC26112n.m134431w0(imageView2);
            SimpleShadowTextView simpleShadowTextView2 = getBinding().f120289v;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tvViewCount");
            AbstractC26112n.m134367H(simpleShadowTextView2);
        } else {
            getBinding().f120289v.setText(AbstractC26105g.m134334a(video.m52845H()));
            SimpleShadowTextView simpleShadowTextView3 = getBinding().f120289v;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvViewCount");
            AbstractC26112n.m134431w0(simpleShadowTextView3);
            SimpleShadowTextView simpleShadowTextView4 = getBinding().f120291x;
            AbstractC19074t.m100207e(simpleShadowTextView4, "vieStatus");
            AbstractC26112n.m134367H(simpleShadowTextView4);
            ImageView imageView3 = getBinding().f120285r;
            AbstractC19074t.m100207e(imageView3, "icoStatus");
            AbstractC26112n.m134367H(imageView3);
        }
        getBinding().f120287t.setText(video.m52894j());
        getBinding().f120284q.setAvatar(video.m52887f());
        getBinding().f120284q.setCornerRadius(6.0f);
        getBinding().f120288u.setText(video.m52887f().m50775o());
        getBinding().f120288u.setVerifiedIcon(video.m52887f().m50725F());
    }

    public final C25053t getBinding() {
        C25053t c25053t = this.f50693p;
        if (c25053t != null) {
            return c25053t;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25053t m129936a = C25053t.m129936a(this);
        AbstractC19074t.m100207e(m129936a, "bind(...)");
        m129936a.f120286s.m55955j(10.0f, RoundedImageView.EnumC10755b.f54377p);
        View view = m129936a.f120290w;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1644825, 1644825, 1644825, 1644825, -2145838823});
        view.setBackground(gradientDrawable);
        m129936a.f120290w.setOutlineProvider(new C9600b());
        m129936a.f120290w.setClipToOutline(true);
        m129936a.f120291x.setOutlineProvider(new C9601c());
        m129936a.f120291x.setClipToOutline(true);
        View rootView = getRootView();
        AbstractC19074t.m100207e(rootView, "getRootView(...)");
        AbstractC26112n.m134389b0(rootView);
        setBinding(m129936a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f50698u;
        int i16 = this.f50696s;
        C25053t binding = getBinding();
        RoundedImageView roundedImageView = binding.f120286s;
        AbstractC19074t.m100207e(roundedImageView, "ivCover");
        AbstractC26112n.m134383X(roundedImageView, i16, i15);
        View view = binding.f120290w;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134383X(view, i16, i15);
        SimpleShadowTextView simpleShadowTextView = binding.f120291x;
        AbstractC19074t.m100207e(simpleShadowTextView, "vieStatus");
        AbstractC26112n.m134383X(simpleShadowTextView, i16, i15);
        ImageView imageView = binding.f120285r;
        AbstractC19074t.m100207e(imageView, "icoStatus");
        RoundedImageView roundedImageView2 = binding.f120286s;
        AbstractC19074t.m100207e(roundedImageView2, "ivCover");
        int m134424t = AbstractC26112n.m134424t(roundedImageView2) - (binding.f120285r.getMeasuredHeight() / 2);
        RoundedImageView roundedImageView3 = binding.f120286s;
        AbstractC19074t.m100207e(roundedImageView3, "ivCover");
        AbstractC26112n.m134383X(imageView, m134424t, AbstractC26112n.m134422s(roundedImageView3) - (binding.f120285r.getMeasuredWidth() / 2));
        int bottom = (binding.f120286s.getBottom() - this.f50696s) - binding.f120289v.getMeasuredHeight();
        int i17 = this.f50696s + i15;
        SimpleShadowTextView simpleShadowTextView2 = binding.f120289v;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tvViewCount");
        AbstractC26112n.m134383X(simpleShadowTextView2, bottom, i17);
        int bottom2 = binding.f120286s.getBottom() + this.f50696s;
        EllipsizedTextView ellipsizedTextView = binding.f120287t;
        AbstractC19074t.m100207e(ellipsizedTextView, "tvDes");
        AbstractC26112n.m134383X(ellipsizedTextView, bottom2, i15);
        int bottom3 = binding.f120287t.getBottom() + this.f50696s + (Math.max(binding.f120284q.getMeasuredHeight(), binding.f120288u.getMeasuredHeight()) / 2);
        int measuredHeight = bottom3 - (binding.f120284q.getMeasuredHeight() / 2);
        AvatarImageView avatarImageView = binding.f120284q;
        AbstractC19074t.m100207e(avatarImageView, "avatarUser");
        AbstractC26112n.m134383X(avatarImageView, measuredHeight, i15);
        int measuredHeight2 = bottom3 - (binding.f120288u.getMeasuredHeight() / 2);
        int right = binding.f120284q.getRight() + this.f50697t;
        UsernameTextView usernameTextView = binding.f120288u;
        AbstractC19074t.m100207e(usernameTextView, "tvNameUser");
        AbstractC26112n.m134383X(usernameTextView, measuredHeight2, right);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m116580c;
        int size = View.MeasureSpec.getSize(i11);
        int round = Math.round(((size - getPaddingLeft()) - getPaddingRight()) / this.f50694q) + getPaddingTop() + getPaddingBottom();
        int i13 = size - (this.f50698u * 2);
        C25053t binding = getBinding();
        RoundedImageView roundedImageView = binding.f120286s;
        AbstractC19074t.m100207e(roundedImageView, "ivCover");
        AbstractC26112n.m134387a0(roundedImageView, i13, 1073741824, round, 1073741824);
        View view = binding.f120290w;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134387a0(view, i13, 1073741824, round, 1073741824);
        SimpleShadowTextView simpleShadowTextView = binding.f120289v;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvViewCount");
        AbstractC26112n.m134387a0(simpleShadowTextView, 0, 0, 0, 0);
        SimpleShadowTextView simpleShadowTextView2 = binding.f120291x;
        AbstractC19074t.m100207e(simpleShadowTextView2, "vieStatus");
        AbstractC26112n.m134387a0(simpleShadowTextView2, i13, 1073741824, round, 1073741824);
        ImageView imageView = binding.f120285r;
        AbstractC19074t.m100207e(imageView, "icoStatus");
        int i14 = i13 / 7;
        AbstractC26112n.m134387a0(imageView, i14, 1073741824, i14, 1073741824);
        EllipsizedTextView ellipsizedTextView = binding.f120287t;
        AbstractC19074t.m100207e(ellipsizedTextView, "tvDes");
        AbstractC26112n.m134387a0(ellipsizedTextView, i13, 1073741824, 0, 0);
        int measuredHeight = round + binding.f120287t.getMeasuredHeight() + this.f50696s;
        AvatarImageView avatarImageView = binding.f120284q;
        AbstractC19074t.m100207e(avatarImageView, "avatarUser");
        int i15 = this.f50695r;
        AbstractC26112n.m134387a0(avatarImageView, i15, 1073741824, i15, 1073741824);
        int i16 = (i13 - this.f50695r) - this.f50697t;
        UsernameTextView usernameTextView = binding.f120288u;
        AbstractC19074t.m100207e(usernameTextView, "tvNameUser");
        AbstractC26112n.m134387a0(usernameTextView, i16, 1073741824, 0, 0);
        m116580c = AbstractC22543l.m116580c(this.f50695r, binding.f120288u.getMeasuredHeight());
        int i17 = this.f50696s;
        setMeasuredDimension(size, measuredHeight + m116580c + i17 + (i17 * 2));
    }

    public final void setBinding(C25053t c25053t) {
        AbstractC19074t.m100208f(c25053t, "<set-?>");
        this.f50693p = c25053t;
    }
}
