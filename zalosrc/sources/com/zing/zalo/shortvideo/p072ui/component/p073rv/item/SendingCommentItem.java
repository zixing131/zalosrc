package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.graphics.AbstractC1409d;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitContentTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
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
import q10.C25032m0;
import q20.C25083f;
import q20.C25092o;
import s20.AbstractC26112n;
import u20.AbstractC26992m;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SendingCommentItem extends FrameLayout {
    public static final C9653b Companion = new C9653b(null);

    /* renamed from: A */
    private int f50883A;

    /* renamed from: B */
    private Comment f50884B;

    /* renamed from: C */
    private final int f50885C;

    /* renamed from: D */
    private final int f50886D;

    /* renamed from: E */
    private final int f50887E;

    /* renamed from: p */
    private InterfaceC9652a f50888p;

    /* renamed from: q */
    private ValueAnimator f50889q;

    /* renamed from: r */
    private C25032m0 f50890r;

    /* renamed from: s */
    private final int f50891s;

    /* renamed from: t */
    private final int f50892t;

    /* renamed from: u */
    private int f50893u;

    /* renamed from: v */
    private int f50894v;

    /* renamed from: w */
    private final int f50895w;

    /* renamed from: x */
    private final int f50896x;

    /* renamed from: y */
    private final int f50897y;

    /* renamed from: z */
    private final int f50898z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9652a {
        /* renamed from: b */
        void mo52346b(Comment comment);

        /* renamed from: c */
        void mo52347c(Comment comment);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$b */
    /* loaded from: classes5.dex */
    public static final class C9653b {
        private C9653b() {
        }

        public /* synthetic */ C9653b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$c */
    /* loaded from: classes5.dex */
    public static final class C9654c extends AbstractC26992m {
        C9654c() {
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(SendingCommentItem.this, 9));
            textPaint.setColor(AbstractC26112n.m134426u(SendingCommentItem.this, AbstractC27406a.zch_text_accent_blue));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$d */
    /* loaded from: classes5.dex */
    public static final class C9655d extends MetricAffectingSpan {
        C9655d() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(SendingCommentItem.this, 9));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$e */
    /* loaded from: classes5.dex */
    public static final class C9656e extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Video f50901l1;

        /* renamed from: m1 */
        final /* synthetic */ C25032m0 f50902m1;

        /* renamed from: n1 */
        final /* synthetic */ SendingCommentItem f50903n1;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$e$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50904t;

            /* renamed from: u */
            private /* synthetic */ Object f50905u;

            /* renamed from: v */
            final /* synthetic */ Bitmap f50906v;

            /* renamed from: w */
            final /* synthetic */ SendingCommentItem f50907w;

            /* renamed from: x */
            final /* synthetic */ C25032m0 f50908x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32732a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f50909t;

                /* renamed from: u */
                final /* synthetic */ C25032m0 f50910u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f50911v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32732a(C25032m0 c25032m0, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f50910u = c25032m0;
                    this.f50911v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32732a(this.f50910u, this.f50911v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f50909t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f50910u.f120090C.setImageBitmap(this.f50911v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32732a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, SendingCommentItem sendingCommentItem, C25032m0 c25032m0, Continuation continuation) {
                super(2, continuation);
                this.f50906v = bitmap;
                this.f50907w = sendingCommentItem;
                this.f50908x = c25032m0;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f50906v, this.f50907w, this.f50908x, continuation);
                aVar.f50905u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                CoroutineScope coroutineScope2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50904t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope2 = (CoroutineScope) this.f50905u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f50905u;
                    C25083f c25083f = C25083f.f120483a;
                    Bitmap m130014a = c25083f.m130014a(this.f50906v, 100.0f);
                    if (m130014a != null) {
                        SendingCommentItem sendingCommentItem = this.f50907w;
                        C25032m0 c25032m0 = this.f50908x;
                        c25083f.m130015c(m130014a, AbstractC26112n.m134426u(sendingCommentItem, AbstractC27406a.zch_curtain));
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32732a c32732a = new C32732a(c25032m0, m130014a, null);
                        this.f50905u = coroutineScope;
                        this.f50904t = 1;
                        if (BuildersKt.m112534g(m112681c, c32732a, this) == m142578e) {
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

        C9656e(Video video, C25032m0 c25032m0, SendingCommentItem sendingCommentItem) {
            this.f50901l1 = video;
            this.f50902m1 = c25032m0;
            this.f50903n1 = sendingCommentItem;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                Video video = this.f50901l1;
                C25032m0 c25032m0 = this.f50902m1;
                SendingCommentItem sendingCommentItem = this.f50903n1;
                if (video.m52915v0()) {
                    BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, sendingCommentItem, c25032m0, null), 3, null);
                } else {
                    c25032m0.f120090C.setImageBitmap(m18839c);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$f */
    /* loaded from: classes5.dex */
    public static final class C9657f implements Animator.AnimatorListener {
        C9657f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "p0");
            C25032m0 c25032m0 = SendingCommentItem.this.f50890r;
            if (c25032m0 == null) {
                AbstractC19074t.m100223u("binding");
                c25032m0 = null;
            }
            c25032m0.getRoot().setBackgroundColor(0);
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

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$g */
    /* loaded from: classes5.dex */
    public static final class C9658g extends AbstractC26992m {

        /* renamed from: r */
        final /* synthetic */ C25032m0 f50913r;

        /* renamed from: s */
        final /* synthetic */ SendingCommentItem f50914s;

        C9658g(C25032m0 c25032m0, SendingCommentItem sendingCommentItem) {
            this.f50913r = c25032m0;
            this.f50914s = sendingCommentItem;
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
            this.f50913r.f120101z.setMaxLines(Integer.MAX_VALUE);
            FitContentTextView fitContentTextView = this.f50913r.f120101z;
            fitContentTextView.setText(fitContentTextView.getOriginalText());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setColor(AbstractC26112n.m134426u(this.f50914s, AbstractC27406a.zch_text_accent_blue));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$h */
    /* loaded from: classes5.dex */
    static final class C9659h extends AbstractC19075u implements InterfaceC18505l {
        C9659h() {
            super(1);
        }

        /* renamed from: a */
        public final void m52350a(View view) {
            InterfaceC9652a callback;
            AbstractC19074t.m100208f(view, "it");
            Comment comment = SendingCommentItem.this.f50884B;
            if (comment != null && (callback = SendingCommentItem.this.getCallback()) != null) {
                callback.mo52346b(comment);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52350a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SendingCommentItem$i */
    /* loaded from: classes5.dex */
    static final class C9660i extends AbstractC19075u implements InterfaceC18505l {
        C9660i() {
            super(1);
        }

        /* renamed from: a */
        public final void m52351a(View view) {
            InterfaceC9652a callback;
            AbstractC19074t.m100208f(view, "it");
            Comment comment = SendingCommentItem.this.f50884B;
            if (comment != null && (callback = SendingCommentItem.this.getCallback()) != null) {
                callback.mo52347c(comment);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52351a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingCommentItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50891s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_padding_horizontal);
        this.f50892t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_padding_vertical);
        this.f50893u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_indent);
        this.f50894v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_size);
        this.f50895w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_avatar_to_info);
        this.f50896x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_name_to_tag);
        this.f50897y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_action_spacing);
        this.f50898z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_like_to_info);
        this.f50883A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_loading_size);
        this.f50885C = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_play_button_size);
        this.f50886D = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_video_cover_width);
        this.f50887E = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_video_cover_height);
    }

    /* renamed from: f */
    private final void m52339f(Comment comment) {
        C25032m0 c25032m0 = this.f50890r;
        if (c25032m0 == null) {
            AbstractC19074t.m100223u("binding");
            c25032m0 = null;
        }
        Integer m50843q = comment.m50843q();
        if (m50843q != null && m50843q.intValue() == 1) {
            SimpleShadowTextView simpleShadowTextView = c25032m0.f120100y;
            AbstractC19074t.m100207e(simpleShadowTextView, "tvSending");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            ProgressBar progressBar = c25032m0.f120093r;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134431w0(progressBar);
            SimpleShadowTextView simpleShadowTextView2 = c25032m0.f120099x;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tvRetry");
            AbstractC26112n.m134367H(simpleShadowTextView2);
            BlinkTextView blinkTextView = c25032m0.f120098w;
            AbstractC19074t.m100207e(blinkTextView, "tvDelete");
            AbstractC26112n.m134367H(blinkTextView);
            c25032m0.getRoot().setBackgroundColor(0);
            return;
        }
        if (m50843q != null && m50843q.intValue() == -1) {
            SimpleShadowTextView simpleShadowTextView3 = c25032m0.f120100y;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvSending");
            AbstractC26112n.m134367H(simpleShadowTextView3);
            ProgressBar progressBar2 = c25032m0.f120093r;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134367H(progressBar2);
            SimpleShadowTextView simpleShadowTextView4 = c25032m0.f120099x;
            AbstractC19074t.m100207e(simpleShadowTextView4, "tvRetry");
            AbstractC26112n.m134431w0(simpleShadowTextView4);
            BlinkTextView blinkTextView2 = c25032m0.f120098w;
            AbstractC19074t.m100207e(blinkTextView2, "tvDelete");
            AbstractC26112n.m134431w0(blinkTextView2);
            m52340h();
        }
    }

    /* renamed from: h */
    private final void m52340h() {
        ValueAnimator valueAnimator = this.f50889q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f50889q = ofFloat;
        ofFloat.setDuration(1500);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SendingCommentItem.m52341i(SendingCommentItem.this, valueAnimator2);
            }
        });
        ofFloat.addListener(new C9657f());
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m52341i(SendingCommentItem sendingCommentItem, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(sendingCommentItem, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int m7147p = AbstractC1409d.m7147p(AbstractC26112n.m134426u(sendingCommentItem, AbstractC27406a.zch_accent_red_background_a30), (int) (((Float) animatedValue).floatValue() * 255));
        C25032m0 c25032m0 = sendingCommentItem.f50890r;
        if (c25032m0 == null) {
            AbstractC19074t.m100223u("binding");
            c25032m0 = null;
        }
        c25032m0.getRoot().setBackgroundColor(m7147p);
    }

    /* renamed from: d */
    public final void m52342d(Comment comment) {
        C24848g0 c24848g0;
        CharSequence charSequence;
        AbstractC19074t.m100208f(comment, "comment");
        this.f50884B = comment;
        C25032m0 c25032m0 = this.f50890r;
        CharSequence charSequence2 = null;
        if (c25032m0 == null) {
            AbstractC19074t.m100223u("binding");
            c25032m0 = null;
        }
        if (comment.m50838l().m50859i()) {
            AvatarImageView avatarImageView = c25032m0.f120092q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView, comment.m50838l().m50854d(), comment.m50838l().m50855e(), comment.m50838l().m50853c(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
            c25032m0.f120092q.setCornerRadius(AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp));
            c25032m0.f120092q.setChannelIconVisible(true);
            c25032m0.f120089B.setText(comment.m50838l().m50855e());
            c25032m0.f120089B.setVerifiedIcon(comment.m50838l().m50857g());
        } else {
            AvatarImageView avatarImageView2 = c25032m0.f120092q;
            AbstractC19074t.m100207e(avatarImageView2, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView2, comment.m50838l().m50854d(), comment.m50838l().m50855e(), comment.m50838l().m50853c(), AbstractC27408c.zch_placeholder_avatar_user, false, 16, null);
            c25032m0.f120092q.setCornerRadius(Float.MAX_VALUE);
            c25032m0.f120089B.setText(comment.m50838l().m50855e());
            c25032m0.f120089B.setMarker((Drawable) null);
        }
        Comment.Identity m50834h = comment.m50834h();
        String str = "";
        if (m50834h != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(m50834h.m50855e() + " ");
            spannableString.setSpan(new C9654c(), 0, spannableString.length(), 17);
            spannableString.setSpan(new C9655d(), 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            FitContentTextView fitContentTextView = c25032m0.f120101z;
            InterfaceC22531b interfaceC22531b = (InterfaceC22531b) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC22531b.class));
            if (interfaceC22531b != null) {
                String m50831e = comment.m50831e();
                if (m50831e == null) {
                    m50831e = "";
                }
                charSequence = interfaceC22531b.mo4505b(m50831e, c25032m0.f120101z.getTextSize());
            } else {
                charSequence = null;
            }
            fitContentTextView.setText(spannableStringBuilder.append(charSequence));
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            FitContentTextView fitContentTextView2 = c25032m0.f120101z;
            InterfaceC22531b interfaceC22531b2 = (InterfaceC22531b) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC22531b.class));
            if (interfaceC22531b2 != null) {
                String m50831e2 = comment.m50831e();
                if (m50831e2 != null) {
                    str = m50831e2;
                }
                charSequence2 = interfaceC22531b2.mo4505b(str, c25032m0.f120101z.getTextSize());
            }
            fitContentTextView2.setText(charSequence2);
        }
        c25032m0.f120101z.setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_primary));
        c25032m0.f120101z.setMaxLines(6);
        Video m50828b = comment.m50828b();
        if (m50828b != null) {
            FrameLayout frameLayout = c25032m0.f120096u;
            AbstractC19074t.m100207e(frameLayout, "flVideoCover");
            AbstractC26112n.m134431w0(frameLayout);
            if (m50828b.m52915v0()) {
                ImageView imageView = c25032m0.f120097v;
                AbstractC19074t.m100207e(imageView, "icoStatus");
                AbstractC26112n.m134431w0(imageView);
                ImageView imageView2 = c25032m0.f120095t;
                AbstractC19074t.m100207e(imageView2, "btnPlay");
                AbstractC26112n.m134367H(imageView2);
                ImageView imageView3 = c25032m0.f120097v;
                Context context = c25032m0.getRoot().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                imageView3.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_hide_line_24, AbstractC27406a.zch_icon_primary));
            } else {
                ImageView imageView4 = c25032m0.f120097v;
                AbstractC19074t.m100207e(imageView4, "icoStatus");
                AbstractC26112n.m134367H(imageView4);
                ImageView imageView5 = c25032m0.f120095t;
                AbstractC19074t.m100207e(imageView5, "btnPlay");
                AbstractC26112n.m134431w0(imageView5);
            }
            C23528a c23528a = (C23528a) new C23528a(c25032m0.getRoot().getContext()).m123612r(c25032m0.f120090C);
            c23528a.m123599d();
            String m52867T = m50828b.m52867T();
            C24003n c24003n = new C24003n(C25092o.f120501a.m130065d(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video_channel), 0, false, 0, false, null, 124, null);
            C9656e c9656e = new C9656e(m50828b, c25032m0, this);
            c9656e.m125609e1(true);
            C24848g0 c24848g02 = C24848g0.f119245a;
            return;
        }
        FrameLayout frameLayout2 = c25032m0.f120096u;
        AbstractC19074t.m100207e(frameLayout2, "flVideoCover");
        AbstractC26112n.m134367H(frameLayout2);
        ImageView imageView6 = c25032m0.f120095t;
        AbstractC19074t.m100207e(imageView6, "btnPlay");
        AbstractC26112n.m134367H(imageView6);
    }

    /* renamed from: e */
    public final void m52343e(Comment comment, List list) {
        AbstractC19074t.m100208f(comment, "comment");
        AbstractC19074t.m100208f(list, "payloads");
        if (AbstractC19074t.m100204b(list.get(0), "STATUS")) {
            m52339f(comment);
        }
    }

    /* renamed from: g */
    public final void m52344g() {
        C25032m0 c25032m0 = this.f50890r;
        if (c25032m0 == null) {
            AbstractC19074t.m100223u("binding");
            c25032m0 = null;
        }
        c25032m0.getRoot().setBackgroundColor(0);
        ValueAnimator valueAnimator = this.f50889q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final InterfaceC9652a getCallback() {
        return this.f50888p;
    }

    /* renamed from: j */
    public final void m52345j() {
        this.f50893u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_child_avatar_indent);
        this.f50894v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_comment_child_avatar_size);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25032m0 m129884a = C25032m0.m129884a(this);
        AbstractC19074t.m100207e(m129884a, "bind(...)");
        m129884a.f120101z.setEllipsizedMaxLine(5);
        FitContentTextView fitContentTextView = m129884a.f120101z;
        SpannableString spannableString = new SpannableString(AbstractC26112n.m134366G(this, AbstractC27413h.zch_text_ellipsis_see_more, new Object[0]));
        spannableString.setSpan(new C9658g(m129884a, this), 1, spannableString.length(), 17);
        fitContentTextView.setEllipsisText(spannableString);
        SimpleShadowTextView simpleShadowTextView = m129884a.f120099x;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvRetry");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C9659h());
        BlinkTextView blinkTextView = m129884a.f120098w;
        AbstractC19074t.m100207e(blinkTextView, "tvDelete");
        AbstractC26112n.m134407k0(blinkTextView, new C9660i());
        this.f50890r = m129884a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f50891s + this.f50893u;
        int i16 = this.f50892t;
        C25032m0 c25032m0 = this.f50890r;
        if (c25032m0 == null) {
            AbstractC19074t.m100223u("binding");
            c25032m0 = null;
        }
        AvatarImageView avatarImageView = c25032m0.f120092q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        AbstractC26112n.m134383X(avatarImageView, i16, i15);
        int i17 = i15 + this.f50894v + this.f50895w;
        FitUsernameTextView fitUsernameTextView = c25032m0.f120089B;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134383X(fitUsernameTextView, i16, i17);
        int left = c25032m0.f120089B.getLeft();
        int bottom = c25032m0.f120089B.getBottom();
        FitContentTextView fitContentTextView = c25032m0.f120101z;
        AbstractC19074t.m100207e(fitContentTextView, "txtContent");
        AbstractC26112n.m134383X(fitContentTextView, bottom, left);
        int bottom2 = c25032m0.f120101z.getBottom();
        FrameLayout frameLayout = c25032m0.f120096u;
        AbstractC19074t.m100207e(frameLayout, "flVideoCover");
        if (AbstractC26112n.m134378S(frameLayout)) {
            FrameLayout frameLayout2 = c25032m0.f120096u;
            AbstractC19074t.m100207e(frameLayout2, "flVideoCover");
            AbstractC26112n.m134383X(frameLayout2, bottom2, left);
            FrameLayout frameLayout3 = c25032m0.f120096u;
            AbstractC19074t.m100207e(frameLayout3, "flVideoCover");
            int m134424t = AbstractC26112n.m134424t(frameLayout3) - (c25032m0.f120095t.getMeasuredHeight() / 2);
            FrameLayout frameLayout4 = c25032m0.f120096u;
            AbstractC19074t.m100207e(frameLayout4, "flVideoCover");
            int m134422s = AbstractC26112n.m134422s(frameLayout4) - (c25032m0.f120095t.getMeasuredWidth() / 2);
            ImageView imageView = c25032m0.f120095t;
            AbstractC19074t.m100207e(imageView, "btnPlay");
            AbstractC26112n.m134383X(imageView, m134424t, m134422s);
            left = c25032m0.f120096u.getLeft();
            bottom2 = c25032m0.f120096u.getBottom() + this.f50896x;
        }
        SimpleShadowTextView simpleShadowTextView = c25032m0.f120099x;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvRetry");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = c25032m0.f120099x;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tvRetry");
            AbstractC26112n.m134383X(simpleShadowTextView2, bottom2, left);
            left += c25032m0.f120099x.getMeasuredWidth() + this.f50897y;
        }
        BlinkTextView blinkTextView = c25032m0.f120098w;
        AbstractC19074t.m100207e(blinkTextView, "tvDelete");
        if (AbstractC26112n.m134378S(blinkTextView)) {
            BlinkTextView blinkTextView2 = c25032m0.f120098w;
            AbstractC19074t.m100207e(blinkTextView2, "tvDelete");
            AbstractC26112n.m134383X(blinkTextView2, bottom2, left);
            c25032m0.f120098w.getMeasuredWidth();
        }
        ProgressBar progressBar = c25032m0.f120093r;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        if (AbstractC26112n.m134378S(progressBar)) {
            int left2 = c25032m0.f120089B.getLeft();
            ProgressBar progressBar2 = c25032m0.f120093r;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134383X(progressBar2, bottom2, left2);
            int right = c25032m0.f120093r.getRight() + (this.f50892t / 2);
            SimpleShadowTextView simpleShadowTextView3 = c25032m0.f120100y;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvSending");
            AbstractC26112n.m134383X(simpleShadowTextView3, bottom2, right);
        }
        PulseImageView pulseImageView = c25032m0.f120094s;
        AbstractC19074t.m100207e(pulseImageView, "btnLike");
        if (AbstractC26112n.m134378S(pulseImageView)) {
            int measuredWidth = getMeasuredWidth() - this.f50891s;
            int i18 = this.f50892t;
            PulseImageView pulseImageView2 = c25032m0.f120094s;
            AbstractC19074t.m100207e(pulseImageView2, "btnLike");
            AbstractC26112n.m134384Y(pulseImageView2, i18, c25032m0.f120094s.getPaddingRight() + measuredWidth);
            PulseImageView pulseImageView3 = c25032m0.f120094s;
            AbstractC19074t.m100207e(pulseImageView3, "btnLike");
            int m134432x = measuredWidth - ((AbstractC26112n.m134432x(pulseImageView3) / 2) - (c25032m0.f120088A.getMeasuredWidth() / 2));
            int measuredHeight = i18 + c25032m0.f120094s.getMeasuredHeight();
            RobotoTextView robotoTextView = c25032m0.f120088A;
            AbstractC19074t.m100207e(robotoTextView, "txtLike");
            AbstractC26112n.m134382W(robotoTextView, measuredHeight, m134432x);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f50892t;
        int i14 = i13 + i13;
        C25032m0 c25032m0 = this.f50890r;
        if (c25032m0 == null) {
            AbstractC19074t.m100223u("binding");
            c25032m0 = null;
        }
        AvatarImageView avatarImageView = c25032m0.f120092q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        int i15 = this.f50894v;
        AbstractC26112n.m134387a0(avatarImageView, i15, 1073741824, i15, 1073741824);
        PulseImageView pulseImageView = c25032m0.f120094s;
        AbstractC19074t.m100207e(pulseImageView, "btnLike");
        AbstractC26112n.m134387a0(pulseImageView, 0, 0, 0, 0);
        RobotoTextView robotoTextView = c25032m0.f120088A;
        AbstractC19074t.m100207e(robotoTextView, "txtLike");
        AbstractC26112n.m134387a0(robotoTextView, 0, 0, 0, 0);
        int i16 = this.f50891s;
        int i17 = ((((size - i16) - this.f50893u) - this.f50894v) - this.f50895w) - i16;
        PulseImageView pulseImageView2 = c25032m0.f120094s;
        AbstractC19074t.m100207e(pulseImageView2, "btnLike");
        int m134432x = (i17 - AbstractC26112n.m134432x(pulseImageView2)) - this.f50898z;
        FitContentTextView fitContentTextView = c25032m0.f120101z;
        AbstractC19074t.m100207e(fitContentTextView, "txtContent");
        AbstractC26112n.m134387a0(fitContentTextView, m134432x, 1073741824, 0, 0);
        int measuredHeight = i14 + c25032m0.f120101z.getMeasuredHeight();
        FrameLayout frameLayout = c25032m0.f120096u;
        AbstractC19074t.m100207e(frameLayout, "flVideoCover");
        if (AbstractC26112n.m134378S(frameLayout)) {
            FrameLayout frameLayout2 = c25032m0.f120096u;
            AbstractC19074t.m100207e(frameLayout2, "flVideoCover");
            AbstractC26112n.m134387a0(frameLayout2, this.f50886D, 1073741824, this.f50887E, 1073741824);
            ImageView imageView = c25032m0.f120095t;
            AbstractC19074t.m100207e(imageView, "btnPlay");
            int i18 = this.f50885C;
            AbstractC26112n.m134387a0(imageView, i18, 1073741824, i18, 1073741824);
            measuredHeight += c25032m0.f120096u.getMeasuredHeight() + this.f50896x;
        }
        FitUsernameTextView fitUsernameTextView = c25032m0.f120089B;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134387a0(fitUsernameTextView, m134432x, 1073741824, 0, 0);
        int measuredHeight2 = measuredHeight + c25032m0.f120089B.getMeasuredHeight();
        SimpleShadowTextView simpleShadowTextView = c25032m0.f120099x;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvRetry");
        AbstractC26112n.m134387a0(simpleShadowTextView, 0, 0, 0, 0);
        BlinkTextView blinkTextView = c25032m0.f120098w;
        AbstractC19074t.m100207e(blinkTextView, "tvDelete");
        AbstractC26112n.m134387a0(blinkTextView, 0, 0, 0, 0);
        ProgressBar progressBar = c25032m0.f120093r;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        int i19 = this.f50883A;
        AbstractC26112n.m134387a0(progressBar, i19, 1073741824, i19, 1073741824);
        SimpleShadowTextView simpleShadowTextView2 = c25032m0.f120100y;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tvSending");
        AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
        BlinkTextView blinkTextView2 = c25032m0.f120098w;
        AbstractC19074t.m100207e(blinkTextView2, "tvDelete");
        setMeasuredDimension(size, measuredHeight2 + AbstractC26112n.m134428v(blinkTextView2));
    }

    public final void setCallback(InterfaceC9652a interfaceC9652a) {
        this.f50888p = interfaceC9652a;
    }
}
