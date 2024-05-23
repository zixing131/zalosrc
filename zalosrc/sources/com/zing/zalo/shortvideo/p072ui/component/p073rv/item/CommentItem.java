package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.AbstractC1409d;
import bi0.AbstractC2808b;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BubbleTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitContentTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.utils.other.CommentSource;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
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
import p021an.AbstractC0955d;
import p328ln.InterfaceC22531b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q10.C25027l;
import q20.C25083f;
import q20.C25092o;
import q20.C25100w;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.AbstractC26990k;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class CommentItem extends FrameLayout {
    public static final C9571b Companion = new C9571b(null);

    /* renamed from: A */
    private final int f50580A;

    /* renamed from: B */
    private final int f50581B;

    /* renamed from: C */
    private final int f50582C;

    /* renamed from: D */
    private final int f50583D;

    /* renamed from: E */
    private final int f50584E;

    /* renamed from: F */
    private final int f50585F;

    /* renamed from: G */
    private final int f50586G;

    /* renamed from: H */
    private final int f50587H;

    /* renamed from: I */
    private final int f50588I;

    /* renamed from: J */
    private C25027l f50589J;

    /* renamed from: p */
    private InterfaceC9570a f50590p;

    /* renamed from: q */
    private boolean f50591q;

    /* renamed from: r */
    private CommentSource f50592r;

    /* renamed from: s */
    private ValueAnimator f50593s;

    /* renamed from: t */
    private final int f50594t;

    /* renamed from: u */
    private final int f50595u;

    /* renamed from: v */
    private int f50596v;

    /* renamed from: w */
    private int f50597w;

    /* renamed from: x */
    private final int f50598x;

    /* renamed from: y */
    private final int f50599y;

    /* renamed from: z */
    private final int f50600z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9570a {
        /* renamed from: a */
        void mo52085a(Comment.Identity identity);

        /* renamed from: b */
        void mo52086b();

        /* renamed from: c */
        void mo52087c();

        /* renamed from: d */
        void mo52088d();

        /* renamed from: e */
        void mo52089e(String str, boolean z11);

        /* renamed from: f */
        void mo52090f();

        /* renamed from: g */
        void mo52091g();

        /* renamed from: t0 */
        void mo52092t0();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$b */
    /* loaded from: classes5.dex */
    public static final class C9571b {
        private C9571b() {
        }

        public /* synthetic */ C9571b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$c */
    /* loaded from: classes5.dex */
    public static final class C9572c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Video f50601l1;

        /* renamed from: m1 */
        final /* synthetic */ C25027l f50602m1;

        /* renamed from: n1 */
        final /* synthetic */ CommentItem f50603n1;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$c$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50604t;

            /* renamed from: u */
            private /* synthetic */ Object f50605u;

            /* renamed from: v */
            final /* synthetic */ Bitmap f50606v;

            /* renamed from: w */
            final /* synthetic */ CommentItem f50607w;

            /* renamed from: x */
            final /* synthetic */ C25027l f50608x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32727a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f50609t;

                /* renamed from: u */
                final /* synthetic */ C25027l f50610u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f50611v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32727a(C25027l c25027l, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f50610u = c25027l;
                    this.f50611v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32727a(this.f50610u, this.f50611v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f50609t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f50610u.f120063F.setImageBitmap(this.f50611v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32727a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, CommentItem commentItem, C25027l c25027l, Continuation continuation) {
                super(2, continuation);
                this.f50606v = bitmap;
                this.f50607w = commentItem;
                this.f50608x = c25027l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f50606v, this.f50607w, this.f50608x, continuation);
                aVar.f50605u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                CoroutineScope coroutineScope2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50604t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope2 = (CoroutineScope) this.f50605u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f50605u;
                    C25083f c25083f = C25083f.f120483a;
                    Bitmap m130014a = c25083f.m130014a(this.f50606v, 100.0f);
                    if (m130014a != null) {
                        CommentItem commentItem = this.f50607w;
                        C25027l c25027l = this.f50608x;
                        c25083f.m130015c(m130014a, AbstractC26112n.m134426u(commentItem, AbstractC27406a.zch_curtain));
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32727a c32727a = new C32727a(c25027l, m130014a, null);
                        this.f50605u = coroutineScope;
                        this.f50604t = 1;
                        if (BuildersKt.m112534g(m112681c, c32727a, this) == m142578e) {
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

        C9572c(Video video, C25027l c25027l, CommentItem commentItem) {
            this.f50601l1 = video;
            this.f50602m1 = c25027l;
            this.f50603n1 = commentItem;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                Video video = this.f50601l1;
                C25027l c25027l = this.f50602m1;
                CommentItem commentItem = this.f50603n1;
                if (video.m52915v0()) {
                    BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, commentItem, c25027l, null), 3, null);
                } else {
                    c25027l.f120063F.setImageBitmap(m18839c);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$d */
    /* loaded from: classes5.dex */
    public static final class C9573d extends AbstractC26990k {

        /* renamed from: t */
        final /* synthetic */ Comment.Identity f50613t;

        C9573d(Comment.Identity identity) {
            this.f50613t = identity;
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC9570a callback = CommentItem.this.getCallback();
            if (callback != null) {
                callback.mo52085a(this.f50613t);
            }
        }

        @Override // u20.AbstractC26990k
        /* renamed from: e */
        public void mo52096e(View view) {
            AbstractC19074t.m100208f(view, "widget");
            CommentItem.this.m52084u();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(CommentItem.this, 5));
            textPaint.setColor(AbstractC26112n.m134426u(CommentItem.this, AbstractC27406a.zch_text_accent_blue_background_bold));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$e */
    /* loaded from: classes5.dex */
    public static final class C9574e extends MetricAffectingSpan {
        C9574e() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(CommentItem.this, 5));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$f */
    /* loaded from: classes5.dex */
    public static final class C9575f implements Animator.AnimatorListener {
        C9575f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "p0");
            C25027l c25027l = CommentItem.this.f50589J;
            if (c25027l == null) {
                AbstractC19074t.m100223u("binding");
                c25027l = null;
            }
            c25027l.getRoot().setBackgroundColor(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "p0");
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$g */
    /* loaded from: classes5.dex */
    public static final class C9576g extends ViewOutlineProvider {
        C9576g() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(CommentItem.this.f50585F, 0, view.getWidth() - CommentItem.this.f50585F, view.getHeight() - CommentItem.this.f50585F, CommentItem.this.f50584E / 2.0f);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$h */
    /* loaded from: classes5.dex */
    static final class C9577h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25027l f50617q;

        /* renamed from: r */
        final /* synthetic */ CommentItem f50618r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9577h(C25027l c25027l, CommentItem commentItem) {
            super(1);
            this.f50617q = c25027l;
            this.f50618r = commentItem;
        }

        /* renamed from: a */
        public final void m52097a(View view) {
            AbstractC19074t.m100208f(view, "it");
            if (this.f50617q.f120068t.m56245p()) {
                this.f50617q.f120068t.m56244n();
                return;
            }
            this.f50617q.f120068t.m56246u();
            InterfaceC9570a callback = this.f50618r.getCallback();
            if (callback != null) {
                callback.mo52086b();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52097a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$i */
    /* loaded from: classes5.dex */
    static final class C9578i extends AbstractC19075u implements InterfaceC18505l {
        C9578i() {
            super(1);
        }

        /* renamed from: a */
        public final void m52098a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9570a callback = CommentItem.this.getCallback();
            if (callback != null) {
                callback.mo52088d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52098a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$j */
    /* loaded from: classes5.dex */
    static final class C9579j extends AbstractC19075u implements InterfaceC18505l {
        C9579j() {
            super(1);
        }

        /* renamed from: a */
        public final void m52099a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9570a callback = CommentItem.this.getCallback();
            if (callback != null) {
                callback.mo52092t0();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52099a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$k */
    /* loaded from: classes5.dex */
    static final class C9580k extends AbstractC19075u implements InterfaceC18505l {
        C9580k() {
            super(1);
        }

        /* renamed from: a */
        public final void m52100a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9570a callback = CommentItem.this.getCallback();
            if (callback != null) {
                callback.mo52092t0();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52100a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$l */
    /* loaded from: classes5.dex */
    static final class C9581l extends AbstractC19075u implements InterfaceC18505l {
        C9581l() {
            super(1);
        }

        /* renamed from: a */
        public final void m52101a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9570a callback = CommentItem.this.getCallback();
            if (callback != null) {
                callback.mo52092t0();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52101a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$m */
    /* loaded from: classes5.dex */
    public static final class C9582m extends AbstractC26990k {

        /* renamed from: t */
        final /* synthetic */ C25027l f50624t;

        C9582m(C25027l c25027l) {
            this.f50624t = c25027l;
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
            this.f50624t.f120058A.setMaxLines(Integer.MAX_VALUE);
            FitContentTextView fitContentTextView = this.f50624t.f120058A;
            fitContentTextView.setText(fitContentTextView.getOriginalText());
        }

        @Override // u20.AbstractC26990k
        /* renamed from: e */
        public void mo52096e(View view) {
            AbstractC19074t.m100208f(view, "widget");
            CommentItem.this.m52084u();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setColor(AbstractC26112n.m134426u(CommentItem.this, AbstractC27406a.zch_text_tertiary));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$n */
    /* loaded from: classes5.dex */
    static final class C9583n extends AbstractC19075u implements InterfaceC18505l {
        C9583n() {
            super(1);
        }

        /* renamed from: a */
        public final void m52102a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9570a callback = CommentItem.this.getCallback();
            if (callback != null) {
                callback.mo52091g();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52102a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.CommentItem$o */
    /* loaded from: classes5.dex */
    static final class C9584o extends AbstractC19075u implements InterfaceC18505l {
        C9584o() {
            super(1);
        }

        /* renamed from: a */
        public final void m52103a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9570a callback = CommentItem.this.getCallback();
            if (callback != null) {
                callback.mo52087c();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52103a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50594t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_padding_horizontal);
        this.f50595u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_padding_vertical);
        this.f50596v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_indent);
        this.f50597w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_size);
        this.f50598x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_to_info);
        this.f50599y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_name_to_tag);
        this.f50600z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_action_spacing);
        this.f50580A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_like_to_info);
        this.f50581B = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_author_avatar_width);
        this.f50582C = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_author_avatar_height);
        this.f50583D = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_author_heart_size);
        this.f50584E = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp);
        this.f50585F = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_reply_to_liked_by_author);
        this.f50586G = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_play_button_size);
        this.f50587H = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_video_cover_width);
        this.f50588I = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_video_cover_height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m52070r(CommentItem commentItem, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(commentItem, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int m7147p = AbstractC1409d.m7147p(AbstractC26112n.m134426u(commentItem, AbstractC2808b.white), (int) (((Float) animatedValue).floatValue() * 25));
        C25027l c25027l = commentItem.f50589J;
        if (c25027l == null) {
            AbstractC19074t.m100223u("binding");
            c25027l = null;
        }
        c25027l.getRoot().setBackgroundColor(m7147p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m52071v(CommentItem commentItem, View view) {
        AbstractC19074t.m100208f(commentItem, "this$0");
        InterfaceC9570a interfaceC9570a = commentItem.f50590p;
        if (interfaceC9570a != null) {
            interfaceC9570a.mo52090f();
        }
        C25100w c25100w = C25100w.f120572a;
        Context context = commentItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c25100w.m130168a(context, 30L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m52072w(CommentItem commentItem, View view) {
        AbstractC19074t.m100208f(commentItem, "this$0");
        InterfaceC9570a interfaceC9570a = commentItem.f50590p;
        if (interfaceC9570a != null) {
            interfaceC9570a.mo52090f();
        }
        C25100w c25100w = C25100w.f120572a;
        Context context = commentItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c25100w.m130168a(context, 30L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m52073x(CommentItem commentItem, View view) {
        AbstractC19074t.m100208f(commentItem, "this$0");
        C25100w c25100w = C25100w.f120572a;
        Context context = commentItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c25100w.m130168a(context, 30L);
        commentItem.m52084u();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final boolean m52074y(CommentItem commentItem, View view) {
        AbstractC19074t.m100208f(commentItem, "this$0");
        commentItem.m52084u();
        return true;
    }

    public final InterfaceC9570a getCallback() {
        return this.f50590p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x02b5, code lost:            if (r10 == null) goto L51;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.widget.TextView, com.zing.zalo.shortvideo.ui.widget.tv.FitContentTextView] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.text.SpannableStringBuilder] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m52075i(Comment comment, CommentSource commentSource) {
        C24848g0 c24848g0;
        C24848g0 c24848g02;
        ?? r52;
        ?? r82;
        String str;
        AbstractC19074t.m100208f(comment, "comment");
        AbstractC19074t.m100208f(commentSource, "source");
        this.f50592r = commentSource;
        C25027l c25027l = this.f50589J;
        if (c25027l == null) {
            AbstractC19074t.m100223u("binding");
            c25027l = null;
        }
        if (comment.m50838l().m50859i()) {
            AvatarImageView avatarImageView = c25027l.f120065q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView, comment.m50838l().m50854d(), comment.m50838l().m50855e(), comment.m50838l().m50853c(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
            c25027l.f120065q.setCornerRadius(AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp));
            c25027l.f120065q.setChannelIconVisible(true);
            c25027l.f120060C.setText(comment.m50838l().m50855e());
            c25027l.f120060C.setVerifiedIcon(comment.m50838l().m50857g());
        } else {
            AvatarImageView avatarImageView2 = c25027l.f120065q;
            AbstractC19074t.m100207e(avatarImageView2, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView2, comment.m50838l().m50854d(), comment.m50838l().m50855e(), comment.m50838l().m50853c(), AbstractC27408c.zch_placeholder_avatar_user, false, 16, null);
            c25027l.f120065q.setChannelIconVisible(false);
            c25027l.f120065q.setCornerRadius(Float.MAX_VALUE);
            c25027l.f120060C.setText(comment.m50838l().m50855e());
            c25027l.f120060C.setMarker((Drawable) null);
        }
        if (comment.m50838l().m50859i() && AbstractC19074t.m100204b(comment.m50838l().m50854d(), commentSource.m56273f())) {
            SimpleShadowTextView simpleShadowTextView = c25027l.f120073y;
            AbstractC19074t.m100207e(simpleShadowTextView, "tagAuthor");
            AbstractC26112n.m134431w0(simpleShadowTextView);
        } else {
            SimpleShadowTextView simpleShadowTextView2 = c25027l.f120073y;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tagAuthor");
            AbstractC26112n.m134367H(simpleShadowTextView2);
        }
        Video m50828b = comment.m50828b();
        if (m50828b != null && !comment.m50846w()) {
            FrameLayout frameLayout = c25027l.f120069u;
            AbstractC19074t.m100207e(frameLayout, "flVideoCover");
            AbstractC26112n.m134431w0(frameLayout);
            c25027l.f120063F.setImageBitmap(null);
            if (m50828b.m52915v0()) {
                ImageView imageView = c25027l.f120070v;
                AbstractC19074t.m100207e(imageView, "icoStatus");
                AbstractC26112n.m134431w0(imageView);
                ImageView imageView2 = c25027l.f120067s;
                AbstractC19074t.m100207e(imageView2, "btnPlay");
                AbstractC26112n.m134367H(imageView2);
                ImageView imageView3 = c25027l.f120070v;
                Context context = c25027l.getRoot().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                imageView3.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_hide_line_24, AbstractC27406a.zch_icon_primary));
            } else if (m50828b.m52901m0()) {
                ImageView imageView4 = c25027l.f120070v;
                AbstractC19074t.m100207e(imageView4, "icoStatus");
                AbstractC26112n.m134431w0(imageView4);
                ImageView imageView5 = c25027l.f120067s;
                AbstractC19074t.m100207e(imageView5, "btnPlay");
                AbstractC26112n.m134367H(imageView5);
                c25027l.f120070v.setImageResource(AbstractC23322a.zch_ic_video_unable_16);
            } else {
                ImageView imageView6 = c25027l.f120070v;
                AbstractC19074t.m100207e(imageView6, "icoStatus");
                AbstractC26112n.m134367H(imageView6);
                ImageView imageView7 = c25027l.f120067s;
                AbstractC19074t.m100207e(imageView7, "btnPlay");
                AbstractC26112n.m134431w0(imageView7);
            }
            if (m50828b.m52901m0()) {
                c25027l.f120063F.setBackgroundResource(AbstractC27406a.zch_icon_accent_gray_subtle);
            } else {
                C23528a c23528a = (C23528a) new C23528a(c25027l.getRoot().getContext()).m123612r(c25027l.f120063F);
                c23528a.m123599d();
                String m52867T = m50828b.m52867T();
                C24003n c24003n = new C24003n(C25092o.f120501a.m130065d(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video_channel), 0, false, 0, false, null, 124, null);
                C9572c c9572c = new C9572c(m50828b, c25027l, this);
                c9572c.m125609e1(true);
                C24848g0 c24848g03 = C24848g0.f119245a;
            }
        } else {
            FrameLayout frameLayout2 = c25027l.f120069u;
            AbstractC19074t.m100207e(frameLayout2, "flVideoCover");
            AbstractC26112n.m134367H(frameLayout2);
            ImageView imageView8 = c25027l.f120067s;
            AbstractC19074t.m100207e(imageView8, "btnPlay");
            AbstractC26112n.m134367H(imageView8);
        }
        if (AbstractC19074t.m100204b(comment.m50830d(), Boolean.TRUE)) {
            SimpleShadowTextView simpleShadowTextView3 = c25027l.f120074z;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            Drawable m139659b = C27280g.m139659b(context2, AbstractC23322a.zds_ic_pin_solid_16, AbstractC27406a.zch_icon_secondary);
            if (m139659b != null) {
                m139659b.setBounds(0, 0, AbstractC26105g.m134347n(12), AbstractC26105g.m134347n(12));
            } else {
                m139659b = null;
            }
            c24848g0 = null;
            simpleShadowTextView3.setCompoundDrawables(m139659b, null, null, null);
            SimpleShadowTextView simpleShadowTextView4 = c25027l.f120074z;
            AbstractC19074t.m100207e(simpleShadowTextView4, "tvPinComment");
            AbstractC26112n.m134431w0(simpleShadowTextView4);
        } else {
            c24848g0 = null;
            SimpleShadowTextView simpleShadowTextView5 = c25027l.f120074z;
            AbstractC19074t.m100207e(simpleShadowTextView5, "tvPinComment");
            AbstractC26112n.m134367H(simpleShadowTextView5);
        }
        if (comment.m50846w()) {
            c25027l.f120058A.setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_disable));
            c25027l.f120058A.setMaxLines(Integer.MAX_VALUE);
            c25027l.f120058A.setText(comment.m50835i());
        } else {
            Comment.Identity m50834h = comment.m50834h();
            String str2 = "";
            if (m50834h != null) {
                ?? spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString(String.valueOf(m50834h.m50855e()));
                spannableString.setSpan(new C9573d(m50834h), 0, spannableString.length(), 17);
                spannableString.setSpan(new C9574e(), 0, spannableString.length(), 17);
                spannableStringBuilder.append(spannableString);
                FitContentTextView fitContentTextView = c25027l.f120058A;
                InterfaceC22531b interfaceC22531b = (InterfaceC22531b) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC22531b.class));
                if (interfaceC22531b != null) {
                    String m50831e = comment.m50831e();
                    if (m50831e != null) {
                        str = " " + m50831e;
                    }
                    str = "";
                    r82 = interfaceC22531b.mo4505b(str, c25027l.f120058A.getTextSize());
                } else {
                    r82 = c24848g0;
                }
                fitContentTextView.setText(spannableStringBuilder.append(r82));
                c24848g02 = C24848g0.f119245a;
            } else {
                c24848g02 = c24848g0;
            }
            if (c24848g02 == null) {
                ?? r42 = c25027l.f120058A;
                InterfaceC22531b interfaceC22531b2 = (InterfaceC22531b) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC22531b.class));
                if (interfaceC22531b2 != null) {
                    String m50831e2 = comment.m50831e();
                    if (m50831e2 != null) {
                        str2 = m50831e2;
                    }
                    r52 = interfaceC22531b2.mo4505b(str2, c25027l.f120058A.getTextSize());
                } else {
                    r52 = c24848g0;
                }
                r42.setText(r52);
            }
            c25027l.f120058A.setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_primary));
            c25027l.f120058A.setMaxLines(6);
        }
        c25027l.f120062E.setText(AbstractC26105g.m134336c(comment.m50832f(), getContext()));
        m52077k(comment);
        m52079m(comment);
        m52078l(comment, commentSource);
    }

    /* renamed from: j */
    public final void m52076j(Comment comment, List list) {
        AbstractC19074t.m100208f(comment, "comment");
        AbstractC19074t.m100208f(list, "payloads");
        Object obj = list.get(0);
        if (AbstractC19074t.m100204b(obj, "LIKE")) {
            m52077k(comment);
        } else if (AbstractC19074t.m100204b(obj, "REPLY")) {
            m52079m(comment);
        }
    }

    /* renamed from: k */
    public final void m52077k(Comment comment) {
        AbstractC19074t.m100208f(comment, "comment");
        C25027l c25027l = this.f50589J;
        if (c25027l == null) {
            AbstractC19074t.m100223u("binding");
            c25027l = null;
        }
        if (!comment.m50846w()) {
            if (comment.m50847x()) {
                c25027l.f120066r.setImageResource(AbstractC23322a.zch_ic_heart_solid_16);
                c25027l.f120059B.setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_accent_red));
            } else {
                c25027l.f120066r.setImageResource(AbstractC23322a.zch_ic_heart_line_16);
                c25027l.f120059B.setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_tertiary));
            }
            if (comment.m50836j() <= 0) {
                c25027l.f120059B.setText("");
            } else {
                c25027l.f120059B.setText(AbstractC26105g.m134334a(comment.m50836j()));
            }
            if (comment.m50848y()) {
                RecyclingImageView recyclingImageView = c25027l.f120072x;
                AbstractC19074t.m100207e(recyclingImageView, "ivAuthorLiked");
                AbstractC26112n.m134431w0(recyclingImageView);
                PulseImageView pulseImageView = c25027l.f120071w;
                AbstractC19074t.m100207e(pulseImageView, "ivAuthorHeart");
                AbstractC26112n.m134431w0(pulseImageView);
                CommentSource commentSource = this.f50592r;
                if (commentSource != null) {
                    C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25027l.f120072x);
                    c23528a.m123599d();
                }
            } else {
                RecyclingImageView recyclingImageView2 = c25027l.f120072x;
                AbstractC19074t.m100207e(recyclingImageView2, "ivAuthorLiked");
                AbstractC26112n.m134367H(recyclingImageView2);
                PulseImageView pulseImageView2 = c25027l.f120071w;
                AbstractC19074t.m100207e(pulseImageView2, "ivAuthorHeart");
                AbstractC26112n.m134367H(pulseImageView2);
            }
            PulseImageView pulseImageView3 = c25027l.f120066r;
            AbstractC19074t.m100207e(pulseImageView3, "btnLike");
            AbstractC26112n.m134431w0(pulseImageView3);
            RobotoTextView robotoTextView = c25027l.f120059B;
            AbstractC19074t.m100207e(robotoTextView, "txtLike");
            AbstractC26112n.m134431w0(robotoTextView);
            return;
        }
        RecyclingImageView recyclingImageView3 = c25027l.f120072x;
        AbstractC19074t.m100207e(recyclingImageView3, "ivAuthorLiked");
        AbstractC26112n.m134367H(recyclingImageView3);
        PulseImageView pulseImageView4 = c25027l.f120071w;
        AbstractC19074t.m100207e(pulseImageView4, "ivAuthorHeart");
        AbstractC26112n.m134367H(pulseImageView4);
        PulseImageView pulseImageView5 = c25027l.f120066r;
        AbstractC19074t.m100207e(pulseImageView5, "btnLike");
        AbstractC26112n.m134367H(pulseImageView5);
        RobotoTextView robotoTextView2 = c25027l.f120059B;
        AbstractC19074t.m100207e(robotoTextView2, "txtLike");
        AbstractC26112n.m134367H(robotoTextView2);
    }

    /* renamed from: l */
    public final void m52078l(Comment comment, CommentSource commentSource) {
        boolean z11;
        AbstractC19074t.m100208f(comment, "comment");
        AbstractC19074t.m100208f(commentSource, "source");
        if (this.f50589J == null) {
            AbstractC19074t.m100223u("binding");
        }
        if (comment.m50846w() && (comment.m50845u() || (!comment.m50849z() && !commentSource.m56282o()))) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f50591q = z11;
    }

    /* renamed from: m */
    public final void m52079m(Comment comment) {
        AbstractC19074t.m100208f(comment, "comment");
        C25027l c25027l = this.f50589J;
        if (c25027l == null) {
            AbstractC19074t.m100223u("binding");
            c25027l = null;
        }
        if (!comment.m50846w()) {
            BlinkTextView blinkTextView = c25027l.f120061D;
            AbstractC19074t.m100207e(blinkTextView, "txtReply");
            AbstractC26112n.m134431w0(blinkTextView);
        } else {
            BlinkTextView blinkTextView2 = c25027l.f120061D;
            AbstractC19074t.m100207e(blinkTextView2, "txtReply");
            AbstractC26112n.m134367H(blinkTextView2);
        }
    }

    /* renamed from: n */
    public final void m52080n() {
        C25027l c25027l = this.f50589J;
        if (c25027l == null) {
            AbstractC19074t.m100223u("binding");
            c25027l = null;
        }
        c25027l.getRoot().setBackgroundColor(0);
        ValueAnimator valueAnimator = this.f50593s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25027l m129872a = C25027l.m129872a(this);
        AbstractC19074t.m100207e(m129872a, "bind(...)");
        RecyclingImageView recyclingImageView = m129872a.f120072x;
        recyclingImageView.setClipToOutline(true);
        recyclingImageView.setOutlineProvider(new C9576g());
        recyclingImageView.setWillNotDraw(false);
        AvatarImageView avatarImageView = m129872a.f120065q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        AbstractC26112n.m134407k0(avatarImageView, new C9579j());
        FitUsernameTextView fitUsernameTextView = m129872a.f120060C;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134407k0(fitUsernameTextView, new C9580k());
        SimpleShadowTextView simpleShadowTextView = m129872a.f120073y;
        AbstractC19074t.m100207e(simpleShadowTextView, "tagAuthor");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C9581l());
        m129872a.f120058A.setEllipsizedMaxLine(5);
        FitContentTextView fitContentTextView = m129872a.f120058A;
        SpannableString spannableString = new SpannableString(AbstractC26112n.m134366G(this, AbstractC27413h.zch_text_ellipsis_see_more, new Object[0]));
        spannableString.setSpan(new C9582m(m129872a), 1, spannableString.length(), 17);
        fitContentTextView.setEllipsisText(spannableString);
        BlinkTextView blinkTextView = m129872a.f120061D;
        AbstractC19074t.m100207e(blinkTextView, "txtReply");
        AbstractC26112n.m134407k0(blinkTextView, new C9583n());
        m129872a.f120066r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentItem.m52071v(CommentItem.this, view);
            }
        });
        m129872a.f120059B.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentItem.m52072w(CommentItem.this, view);
            }
        });
        FrameLayout frameLayout = m129872a.f120069u;
        AbstractC19074t.m100207e(frameLayout, "flVideoCover");
        AbstractC26112n.m134407k0(frameLayout, new C9584o());
        AvatarImageView avatarImageView2 = m129872a.f120065q;
        AbstractC19074t.m100207e(avatarImageView2, "aivAvatar");
        FitUsernameTextView fitUsernameTextView2 = m129872a.f120060C;
        AbstractC19074t.m100207e(fitUsernameTextView2, "txtName");
        SimpleShadowTextView simpleShadowTextView2 = m129872a.f120073y;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tagAuthor");
        BlinkTextView blinkTextView2 = m129872a.f120061D;
        AbstractC19074t.m100207e(blinkTextView2, "txtReply");
        PulseImageView pulseImageView = m129872a.f120071w;
        AbstractC19074t.m100207e(pulseImageView, "ivAuthorHeart");
        RecyclingImageView recyclingImageView2 = m129872a.f120072x;
        AbstractC19074t.m100207e(recyclingImageView2, "ivAuthorLiked");
        PulseImageView pulseImageView2 = m129872a.f120066r;
        AbstractC19074t.m100207e(pulseImageView2, "btnLike");
        RobotoTextView robotoTextView = m129872a.f120059B;
        AbstractC19074t.m100207e(robotoTextView, "txtLike");
        FrameLayout frameLayout2 = m129872a.f120069u;
        AbstractC19074t.m100207e(frameLayout2, "flVideoCover");
        View[] viewArr = {avatarImageView2, fitUsernameTextView2, simpleShadowTextView2, blinkTextView2, pulseImageView, recyclingImageView2, pulseImageView2, robotoTextView, frameLayout2};
        for (int i11 = 0; i11 < 9; i11++) {
            viewArr[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.e
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m52073x;
                    m52073x = CommentItem.m52073x(CommentItem.this, view);
                    return m52073x;
                }
            });
        }
        RecyclingImageView recyclingImageView3 = m129872a.f120072x;
        AbstractC19074t.m100207e(recyclingImageView3, "ivAuthorLiked");
        PulseImageView pulseImageView3 = m129872a.f120071w;
        AbstractC19074t.m100207e(pulseImageView3, "ivAuthorHeart");
        AppCompatImageView[] appCompatImageViewArr = {recyclingImageView3, pulseImageView3};
        for (int i12 = 0; i12 < 2; i12++) {
            AbstractC26112n.m134407k0(appCompatImageViewArr[i12], new C9577h(m129872a, this));
        }
        CommentItem root = m129872a.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC26112n.m134407k0(root, new C9578i());
        m129872a.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.f
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m52074y;
                m52074y = CommentItem.m52074y(CommentItem.this, view);
                return m52074y;
            }
        });
        this.f50589J = m129872a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f50594t + this.f50596v;
        int i16 = this.f50595u;
        C25027l c25027l = this.f50589J;
        if (c25027l == null) {
            AbstractC19074t.m100223u("binding");
            c25027l = null;
        }
        AvatarImageView avatarImageView = c25027l.f120065q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        AbstractC26112n.m134383X(avatarImageView, i16, i15);
        int i17 = i15 + this.f50597w + this.f50598x;
        SimpleShadowTextView simpleShadowTextView = c25027l.f120074z;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvPinComment");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = c25027l.f120074z;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tvPinComment");
            AbstractC26112n.m134383X(simpleShadowTextView2, i16, i17);
            i16 = c25027l.f120074z.getBottom() + this.f50599y;
        }
        FitUsernameTextView fitUsernameTextView = c25027l.f120060C;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134383X(fitUsernameTextView, i16, i17);
        SimpleShadowTextView simpleShadowTextView3 = c25027l.f120073y;
        AbstractC19074t.m100207e(simpleShadowTextView3, "tagAuthor");
        if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
            int measuredWidth = i17 + c25027l.f120060C.getMeasuredWidth() + this.f50599y;
            FitUsernameTextView fitUsernameTextView2 = c25027l.f120060C;
            AbstractC19074t.m100207e(fitUsernameTextView2, "txtName");
            int m134428v = i16 + ((AbstractC26112n.m134428v(fitUsernameTextView2) - c25027l.f120073y.getMeasuredHeight()) / 2);
            SimpleShadowTextView simpleShadowTextView4 = c25027l.f120073y;
            AbstractC19074t.m100207e(simpleShadowTextView4, "tagAuthor");
            AbstractC26112n.m134383X(simpleShadowTextView4, m134428v, measuredWidth);
        }
        int left = c25027l.f120060C.getLeft();
        int bottom = c25027l.f120060C.getBottom();
        FitContentTextView fitContentTextView = c25027l.f120058A;
        AbstractC19074t.m100207e(fitContentTextView, "txtContent");
        AbstractC26112n.m134383X(fitContentTextView, bottom, left);
        int measuredHeight = bottom + c25027l.f120058A.getMeasuredHeight();
        FrameLayout frameLayout = c25027l.f120069u;
        AbstractC19074t.m100207e(frameLayout, "flVideoCover");
        if (AbstractC26112n.m134378S(frameLayout)) {
            int i18 = measuredHeight + this.f50599y;
            FrameLayout frameLayout2 = c25027l.f120069u;
            AbstractC19074t.m100207e(frameLayout2, "flVideoCover");
            AbstractC26112n.m134383X(frameLayout2, i18, left);
            FrameLayout frameLayout3 = c25027l.f120069u;
            AbstractC19074t.m100207e(frameLayout3, "flVideoCover");
            int m134424t = AbstractC26112n.m134424t(frameLayout3) - (c25027l.f120067s.getMeasuredHeight() / 2);
            FrameLayout frameLayout4 = c25027l.f120069u;
            AbstractC19074t.m100207e(frameLayout4, "flVideoCover");
            int m134422s = AbstractC26112n.m134422s(frameLayout4) - (c25027l.f120067s.getMeasuredWidth() / 2);
            ImageView imageView = c25027l.f120067s;
            AbstractC19074t.m100207e(imageView, "btnPlay");
            AbstractC26112n.m134383X(imageView, m134424t, m134422s);
            left = c25027l.f120069u.getLeft();
            measuredHeight = c25027l.f120069u.getBottom() + this.f50599y;
        }
        RobotoTextView robotoTextView = c25027l.f120062E;
        AbstractC19074t.m100207e(robotoTextView, "txtTime");
        AbstractC26112n.m134383X(robotoTextView, measuredHeight, left);
        int measuredWidth2 = left + c25027l.f120062E.getMeasuredWidth() + this.f50600z;
        BlinkTextView blinkTextView = c25027l.f120061D;
        AbstractC19074t.m100207e(blinkTextView, "txtReply");
        if (AbstractC26112n.m134378S(blinkTextView)) {
            BlinkTextView blinkTextView2 = c25027l.f120061D;
            AbstractC19074t.m100207e(blinkTextView2, "txtReply");
            AbstractC26112n.m134383X(blinkTextView2, measuredHeight, measuredWidth2);
            c25027l.f120061D.getMeasuredWidth();
        }
        RecyclingImageView recyclingImageView = c25027l.f120072x;
        AbstractC19074t.m100207e(recyclingImageView, "ivAuthorLiked");
        if (AbstractC26112n.m134378S(recyclingImageView)) {
            int right = c25027l.f120061D.getRight() + this.f50585F;
            RecyclingImageView recyclingImageView2 = c25027l.f120072x;
            AbstractC19074t.m100207e(recyclingImageView2, "ivAuthorLiked");
            AbstractC26112n.m134383X(recyclingImageView2, measuredHeight, right);
            int top = c25027l.f120072x.getTop() + ((int) ((c25027l.f120072x.getMeasuredHeight() / 20.0f) * 6.0f));
            int left2 = c25027l.f120072x.getLeft() + ((int) ((c25027l.f120072x.getMeasuredWidth() / 26.0f) * 13.0f));
            PulseImageView pulseImageView = c25027l.f120071w;
            AbstractC19074t.m100207e(pulseImageView, "ivAuthorHeart");
            AbstractC26112n.m134383X(pulseImageView, top, left2);
            RecyclingImageView recyclingImageView3 = c25027l.f120072x;
            AbstractC19074t.m100207e(recyclingImageView3, "ivAuthorLiked");
            int m134422s2 = AbstractC26112n.m134422s(recyclingImageView3) - (c25027l.f120068t.getMeasuredWidth() / 2);
            int top2 = c25027l.f120072x.getTop();
            BubbleTextView bubbleTextView = c25027l.f120068t;
            AbstractC19074t.m100207e(bubbleTextView, "bubbleView");
            AbstractC26112n.m134381V(bubbleTextView, top2, m134422s2);
        }
        PulseImageView pulseImageView2 = c25027l.f120066r;
        AbstractC19074t.m100207e(pulseImageView2, "btnLike");
        if (AbstractC26112n.m134378S(pulseImageView2)) {
            int measuredWidth3 = getMeasuredWidth() - this.f50594t;
            int i19 = this.f50595u;
            PulseImageView pulseImageView3 = c25027l.f120066r;
            AbstractC19074t.m100207e(pulseImageView3, "btnLike");
            AbstractC26112n.m134384Y(pulseImageView3, i19, c25027l.f120066r.getPaddingRight() + measuredWidth3);
            PulseImageView pulseImageView4 = c25027l.f120066r;
            AbstractC19074t.m100207e(pulseImageView4, "btnLike");
            int m134432x = measuredWidth3 - ((AbstractC26112n.m134432x(pulseImageView4) / 2) - (c25027l.f120059B.getMeasuredWidth() / 2));
            int measuredHeight2 = i19 + c25027l.f120066r.getMeasuredHeight();
            RobotoTextView robotoTextView2 = c25027l.f120059B;
            AbstractC19074t.m100207e(robotoTextView2, "txtLike");
            AbstractC26112n.m134382W(robotoTextView2, measuredHeight2, m134432x);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f50595u;
        int i14 = i13 + i13;
        C25027l c25027l = this.f50589J;
        if (c25027l == null) {
            AbstractC19074t.m100223u("binding");
            c25027l = null;
        }
        AvatarImageView avatarImageView = c25027l.f120065q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        int i15 = this.f50597w;
        AbstractC26112n.m134387a0(avatarImageView, i15, 1073741824, i15, 1073741824);
        PulseImageView pulseImageView = c25027l.f120066r;
        AbstractC19074t.m100207e(pulseImageView, "btnLike");
        AbstractC26112n.m134387a0(pulseImageView, 0, 0, 0, 0);
        RobotoTextView robotoTextView = c25027l.f120059B;
        AbstractC19074t.m100207e(robotoTextView, "txtLike");
        AbstractC26112n.m134387a0(robotoTextView, 0, 0, 0, 0);
        int i16 = this.f50594t;
        int i17 = ((((size - i16) - this.f50596v) - this.f50597w) - this.f50598x) - i16;
        PulseImageView pulseImageView2 = c25027l.f120066r;
        AbstractC19074t.m100207e(pulseImageView2, "btnLike");
        int m134432x = (i17 - AbstractC26112n.m134432x(pulseImageView2)) - this.f50580A;
        FitContentTextView fitContentTextView = c25027l.f120058A;
        AbstractC19074t.m100207e(fitContentTextView, "txtContent");
        AbstractC26112n.m134387a0(fitContentTextView, m134432x, 1073741824, 0, 0);
        int measuredHeight = i14 + c25027l.f120058A.getMeasuredHeight();
        FrameLayout frameLayout = c25027l.f120069u;
        AbstractC19074t.m100207e(frameLayout, "flVideoCover");
        if (AbstractC26112n.m134378S(frameLayout)) {
            FrameLayout frameLayout2 = c25027l.f120069u;
            AbstractC19074t.m100207e(frameLayout2, "flVideoCover");
            AbstractC26112n.m134387a0(frameLayout2, this.f50587H, 1073741824, this.f50588I, 1073741824);
            ImageView imageView = c25027l.f120067s;
            AbstractC19074t.m100207e(imageView, "btnPlay");
            int i18 = this.f50586G;
            AbstractC26112n.m134387a0(imageView, i18, 1073741824, i18, 1073741824);
            measuredHeight += c25027l.f120069u.getMeasuredHeight() + (this.f50599y * 2);
        }
        SimpleShadowTextView simpleShadowTextView = c25027l.f120074z;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvPinComment");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = c25027l.f120074z;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tvPinComment");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
            measuredHeight += c25027l.f120074z.getMeasuredHeight() + this.f50599y;
        }
        SimpleShadowTextView simpleShadowTextView3 = c25027l.f120073y;
        AbstractC19074t.m100207e(simpleShadowTextView3, "tagAuthor");
        if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
            SimpleShadowTextView simpleShadowTextView4 = c25027l.f120073y;
            AbstractC19074t.m100207e(simpleShadowTextView4, "tagAuthor");
            AbstractC26112n.m134387a0(simpleShadowTextView4, 0, 0, 0, 0);
            m134432x -= this.f50599y + c25027l.f120073y.getMeasuredWidth();
        }
        FitUsernameTextView fitUsernameTextView = c25027l.f120060C;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134387a0(fitUsernameTextView, m134432x, 1073741824, 0, 0);
        int measuredHeight2 = measuredHeight + c25027l.f120060C.getMeasuredHeight();
        RobotoTextView robotoTextView2 = c25027l.f120062E;
        AbstractC19074t.m100207e(robotoTextView2, "txtTime");
        AbstractC26112n.m134387a0(robotoTextView2, 0, 0, 0, 0);
        BlinkTextView blinkTextView = c25027l.f120061D;
        AbstractC19074t.m100207e(blinkTextView, "txtReply");
        AbstractC26112n.m134387a0(blinkTextView, 0, 0, 0, 0);
        RecyclingImageView recyclingImageView = c25027l.f120072x;
        AbstractC19074t.m100207e(recyclingImageView, "ivAuthorLiked");
        AbstractC26112n.m134387a0(recyclingImageView, this.f50581B, 1073741824, this.f50582C, 1073741824);
        PulseImageView pulseImageView3 = c25027l.f120071w;
        AbstractC19074t.m100207e(pulseImageView3, "ivAuthorHeart");
        int i19 = this.f50583D;
        AbstractC26112n.m134387a0(pulseImageView3, i19, 1073741824, i19, 1073741824);
        BubbleTextView bubbleTextView = c25027l.f120068t;
        AbstractC19074t.m100207e(bubbleTextView, "bubbleView");
        AbstractC26112n.m134387a0(bubbleTextView, 0, 0, 0, 0);
        BlinkTextView blinkTextView2 = c25027l.f120061D;
        AbstractC19074t.m100207e(blinkTextView2, "txtReply");
        setMeasuredDimension(size, measuredHeight2 + AbstractC26112n.m134428v(blinkTextView2));
    }

    /* renamed from: p */
    public final void m52081p() {
        C25027l c25027l = this.f50589J;
        C25027l c25027l2 = null;
        if (c25027l == null) {
            AbstractC19074t.m100223u("binding");
            c25027l = null;
        }
        if (c25027l.f120068t.m56245p()) {
            C25027l c25027l3 = this.f50589J;
            if (c25027l3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25027l2 = c25027l3;
            }
            c25027l2.f120068t.m56244n();
        }
    }

    /* renamed from: q */
    public final void m52082q() {
        ValueAnimator valueAnimator = this.f50593s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f50593s = ofFloat;
        ofFloat.setDuration(1500);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CommentItem.m52070r(CommentItem.this, valueAnimator2);
            }
        });
        ofFloat.addListener(new C9575f());
        ofFloat.start();
    }

    /* renamed from: s */
    public final void m52083s() {
        this.f50596v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_child_avatar_indent);
        this.f50597w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_child_avatar_size);
    }

    public final void setCallback(InterfaceC9570a interfaceC9570a) {
        this.f50590p = interfaceC9570a;
    }

    /* renamed from: u */
    public final void m52084u() {
        InterfaceC9570a interfaceC9570a;
        if (this.f50591q && (interfaceC9570a = this.f50590p) != null) {
            C25027l c25027l = this.f50589J;
            C25027l c25027l2 = null;
            if (c25027l == null) {
                AbstractC19074t.m100223u("binding");
                c25027l = null;
            }
            CharSequence originalText = c25027l.f120058A.getOriginalText();
            if (originalText == null) {
                C25027l c25027l3 = this.f50589J;
                if (c25027l3 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c25027l2 = c25027l3;
                }
                originalText = c25027l2.f120058A.getText();
            }
            interfaceC9570a.mo52089e(originalText.toString(), true);
        }
    }
}
