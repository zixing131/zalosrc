package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1595r0;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.et.EnterActionEditText;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
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
import on0.AbstractC24317b;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p021an.AbstractC0955d;
import p328ln.InterfaceC22530a;
import p328ln.InterfaceC22531b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C24985a1;
import q20.C25083f;
import q20.C25090m;
import q20.C25097t;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class CommentBox extends FrameLayout {
    public static final C10659b Companion = new C10659b(null);

    /* renamed from: A */
    private float f53983A;

    /* renamed from: B */
    private int f53984B;

    /* renamed from: C */
    private int f53985C;

    /* renamed from: D */
    private boolean f53986D;

    /* renamed from: E */
    private boolean f53987E;

    /* renamed from: F */
    private Comment.Identity f53988F;

    /* renamed from: G */
    private Comment f53989G;

    /* renamed from: H */
    private Video f53990H;

    /* renamed from: I */
    private InterfaceC22530a f53991I;

    /* renamed from: J */
    private ZaloView f53992J;

    /* renamed from: K */
    private Runnable f53993K;

    /* renamed from: L */
    private int f53994L;

    /* renamed from: M */
    private int f53995M;

    /* renamed from: N */
    private int f53996N;

    /* renamed from: O */
    private final InterfaceC24854k f53997O;

    /* renamed from: P */
    private final InterfaceC24854k f53998P;

    /* renamed from: p */
    private InterfaceC10658a f53999p;

    /* renamed from: q */
    private final int f54000q;

    /* renamed from: r */
    private final int f54001r;

    /* renamed from: s */
    private final int f54002s;

    /* renamed from: t */
    private final int f54003t;

    /* renamed from: u */
    private final int f54004u;

    /* renamed from: v */
    private final int f54005v;

    /* renamed from: w */
    private final int f54006w;

    /* renamed from: x */
    private final int f54007x;

    /* renamed from: y */
    private int f54008y;

    /* renamed from: z */
    private int f54009z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10658a {
        /* renamed from: a */
        void mo54185a(Comment.Identity identity, String str, boolean z11, Comment comment, Video video);

        /* renamed from: b */
        void mo54186b(boolean z11);

        /* renamed from: c */
        void mo54187c(String str);

        /* renamed from: d */
        void mo54188d(int i11, int i12);

        /* renamed from: e */
        void mo54189e();

        /* renamed from: f */
        C17487o0 mo54190f();

        /* renamed from: g */
        InterfaceC27218a mo54191g();

        /* renamed from: h */
        void mo54192h(String str);

        /* renamed from: i */
        void mo54193i(Comment.Identity identity);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$b */
    /* loaded from: classes5.dex */
    public static final class C10659b {
        private C10659b() {
        }

        public /* synthetic */ C10659b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$c */
    /* loaded from: classes5.dex */
    static final class C10660c extends AbstractC19075u implements InterfaceC18494a {
        C10660c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24985a1 mo12V4() {
            return C24985a1.m129753a(CommentBox.this);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$d */
    /* loaded from: classes5.dex */
    static final class C10661d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f54011q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10661d(Context context) {
            super(0);
            this.f54011q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC22531b mo12V4() {
            return (InterfaceC22531b) AbstractC0955d.m4496a(this.f54011q, AbstractC19061k0.m100169b(InterfaceC22531b.class));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$e */
    /* loaded from: classes5.dex */
    public static final class C10662e implements InterfaceC22530a {

        /* renamed from: b */
        final /* synthetic */ C24985a1 f54013b;

        C10662e(C24985a1 c24985a1) {
            this.f54013b = c24985a1;
        }

        @Override // p328ln.InterfaceC22530a
        /* renamed from: a */
        public boolean mo55706a(View view, MotionEvent motionEvent) {
            Integer num;
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                this.f54013b.f119716A.postDelayed(CommentBox.this.f53993K, ViewConfiguration.getKeyRepeatTimeout());
                CommentBox.this.f53994L = 0;
            } else if (num != null && num.intValue() == 1) {
                this.f54013b.f119716A.removeCallbacks(CommentBox.this.f53993K);
                if (CommentBox.this.f53994L == 0) {
                    CommentBox.this.f53994L = -1;
                    Runnable runnable = CommentBox.this.f53993K;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            } else if (num != null && num.intValue() == 3) {
                this.f54013b.f119716A.removeCallbacks(CommentBox.this.f53993K);
            }
            return false;
        }

        @Override // p328ln.InterfaceC22530a
        /* renamed from: b */
        public void mo55707b(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "emoticon");
            mo55708c(str, i11, i12);
        }

        @Override // p328ln.InterfaceC22530a
        /* renamed from: c */
        public void mo55708c(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "emoticon");
            CommentBox.this.m55654G(str, i11, i12);
            InterfaceC10658a callback = CommentBox.this.getCallback();
            if (callback != null) {
                callback.mo54192h(str);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$f */
    /* loaded from: classes5.dex */
    public static final class C10663f extends ViewOutlineProvider {
        C10663f() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), CommentBox.this.f54002s);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$g */
    /* loaded from: classes5.dex */
    static final class C10664g extends AbstractC19075u implements InterfaceC18511r {
        C10664g() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m55709a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55709a(CharSequence charSequence, int i11, int i12, int i13) {
            boolean m126977c;
            boolean m126977c2;
            if (charSequence == null) {
                return;
            }
            CommentBox.this.f53995M = Math.max(0, i11 - 1);
            CommentBox.this.f53996N = Math.min(i11 + i13 + 1, charSequence.length());
            while (CommentBox.this.f53995M > 0) {
                m126977c2 = AbstractC24317b.m126977c(charSequence.charAt(CommentBox.this.f53995M));
                if (m126977c2) {
                    break;
                }
                CommentBox commentBox = CommentBox.this;
                commentBox.f53995M--;
            }
            while (CommentBox.this.f53996N < charSequence.length()) {
                m126977c = AbstractC24317b.m126977c(charSequence.charAt(CommentBox.this.f53996N - 1));
                if (!m126977c) {
                    CommentBox.this.f53996N++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$h */
    /* loaded from: classes5.dex */
    static final class C10665h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C24985a1 f54017r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10665h(C24985a1 c24985a1) {
            super(1);
            this.f54017r = c24985a1;
        }

        /* renamed from: a */
        public final void m55710a(Editable editable) {
            boolean m127128x;
            InterfaceC22531b emoticonPickerHelper;
            if (editable == null) {
                return;
            }
            if (CommentBox.this.f53995M < CommentBox.this.f53996N && (emoticonPickerHelper = CommentBox.this.getEmoticonPickerHelper()) != null) {
                emoticonPickerHelper.mo4508e(editable, CommentBox.this.f53995M, CommentBox.this.f53996N, this.f54017r.f119738v.getTextSize());
            }
            if (editable.length() <= CommentBox.this.f53985C) {
                m127128x = AbstractC24341v.m127128x(editable);
                if (m127128x) {
                    PulseImageView pulseImageView = this.f54017r.f119735s;
                    AbstractC19074t.m100207e(pulseImageView, "btnSend");
                    if (AbstractC26112n.m134380U(pulseImageView)) {
                        PulseImageView pulseImageView2 = this.f54017r.f119735s;
                        AbstractC19074t.m100207e(pulseImageView2, "btnSend");
                        AbstractC26112n.m134367H(pulseImageView2);
                        LinearLayout linearLayout = this.f54017r.f119718C;
                        AbstractC19074t.m100207e(linearLayout, "lytInput");
                        AbstractC26112n.m134417p0(linearLayout, this.f54017r.f119735s.getPaddingRight());
                        return;
                    }
                    return;
                }
                PulseImageView pulseImageView3 = this.f54017r.f119735s;
                AbstractC19074t.m100207e(pulseImageView3, "btnSend");
                if (AbstractC26112n.m134376Q(pulseImageView3)) {
                    PulseImageView pulseImageView4 = this.f54017r.f119735s;
                    AbstractC19074t.m100207e(pulseImageView4, "btnSend");
                    AbstractC26112n.m134431w0(pulseImageView4);
                    LinearLayout linearLayout2 = this.f54017r.f119718C;
                    AbstractC19074t.m100207e(linearLayout2, "lytInput");
                    AbstractC26112n.m134417p0(linearLayout2, 0);
                    return;
                }
                return;
            }
            editable.delete(CommentBox.this.f53985C, editable.length());
            C25097t c25097t = C25097t.f120556a;
            Context context = CommentBox.this.getContext();
            CommentBox commentBox = CommentBox.this;
            c25097t.m130154o(context, AbstractC26112n.m134366G(commentBox, AbstractC27413h.zch_layout_box_comment_limit_max, Integer.valueOf(commentBox.f53985C)));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55710a((Editable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$i */
    /* loaded from: classes5.dex */
    static final class C10666i extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C24985a1 f54018q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10666i(C24985a1 c24985a1) {
            super(2);
            this.f54018q = c24985a1;
        }

        /* renamed from: a */
        public final void m55711a(TextView textView, KeyEvent keyEvent) {
            AbstractC19074t.m100208f(textView, "<anonymous parameter 0>");
            PulseImageView pulseImageView = this.f54018q.f119735s;
            AbstractC19074t.m100207e(pulseImageView, "btnSend");
            if (AbstractC26112n.m134380U(pulseImageView)) {
                this.f54018q.f119735s.callOnClick();
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m55711a((TextView) obj, (KeyEvent) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$j */
    /* loaded from: classes5.dex */
    public static final class C10667j extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Video f54019l1;

        /* renamed from: m1 */
        final /* synthetic */ C24985a1 f54020m1;

        /* renamed from: n1 */
        final /* synthetic */ CommentBox f54021n1;

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$j$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f54022t;

            /* renamed from: u */
            private /* synthetic */ Object f54023u;

            /* renamed from: v */
            final /* synthetic */ Bitmap f54024v;

            /* renamed from: w */
            final /* synthetic */ CommentBox f54025w;

            /* renamed from: x */
            final /* synthetic */ C24985a1 f54026x;

            /* renamed from: com.zing.zalo.shortvideo.ui.widget.CommentBox$j$a$a */
            /* loaded from: classes5.dex */
            public static final class C32746a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f54027t;

                /* renamed from: u */
                final /* synthetic */ C24985a1 f54028u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f54029v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32746a(C24985a1 c24985a1, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f54028u = c24985a1;
                    this.f54029v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32746a(this.f54028u, this.f54029v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f54027t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f54028u.f119719D.setImageBitmap(this.f54029v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32746a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, CommentBox commentBox, C24985a1 c24985a1, Continuation continuation) {
                super(2, continuation);
                this.f54024v = bitmap;
                this.f54025w = commentBox;
                this.f54026x = c24985a1;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f54024v, this.f54025w, this.f54026x, continuation);
                aVar.f54023u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                CoroutineScope coroutineScope2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f54022t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope2 = (CoroutineScope) this.f54023u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f54023u;
                    C25083f c25083f = C25083f.f120483a;
                    Bitmap m130014a = c25083f.m130014a(this.f54024v, 100.0f);
                    if (m130014a != null) {
                        CommentBox commentBox = this.f54025w;
                        C24985a1 c24985a1 = this.f54026x;
                        c25083f.m130015c(m130014a, AbstractC26112n.m134426u(commentBox, AbstractC27406a.zch_curtain));
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32746a c32746a = new C32746a(c24985a1, m130014a, null);
                        this.f54023u = coroutineScope;
                        this.f54022t = 1;
                        if (BuildersKt.m112534g(m112681c, c32746a, this) == m142578e) {
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
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C10667j(Video video, C24985a1 c24985a1, CommentBox commentBox) {
            this.f54019l1 = video;
            this.f54020m1 = c24985a1;
            this.f54021n1 = commentBox;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                Video video = this.f54019l1;
                C24985a1 c24985a1 = this.f54020m1;
                CommentBox commentBox = this.f54021n1;
                if (video.m52915v0()) {
                    BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, commentBox, c24985a1, null), 3, null);
                } else {
                    c24985a1.f119719D.setImageBitmap(m18839c);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        View.inflate(context, AbstractC27410e.zch_layout_box_comment, this);
        this.f54000q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_box_comment_attach_video_height);
        this.f54001r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_box_comment_attach_video_margin);
        this.f54002s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_box_comment_attach_video_radius);
        this.f54003t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_box_comment_attach_play_size);
        this.f54004u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_box_comment_attach_sensitive_size);
        this.f54005v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_box_comment_divider_height);
        this.f54006w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_box_comment_input_margin);
        this.f54007x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_box_comment_recent_emoji_height);
        this.f53984B = 1;
        this.f53985C = 300;
        this.f53986D = true;
        this.f53988F = Comment.Identity.Companion.m50869b();
        m129210a = AbstractC24856m.m129210a(new C10660c());
        this.f53997O = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10661d(context));
        this.f53998P = m129210a2;
    }

    /* renamed from: F */
    private final void m55653F() {
        EnterActionEditText enterActionEditText = getBinding().f119738v;
        enterActionEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
        enterActionEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
    }

    /* renamed from: G */
    public final void m55654G(String str, int i11, int i12) {
        boolean m126977c;
        EnterActionEditText enterActionEditText = getBinding().f119738v;
        String str2 = str + " ";
        if (enterActionEditText.getSelectionStart() > 0) {
            m126977c = AbstractC24317b.m126977c(enterActionEditText.getText().charAt(enterActionEditText.getSelectionStart() - 1));
            if (!m126977c) {
                str2 = " " + str2;
            }
        }
        if (enterActionEditText.getText().length() + str2.length() <= this.f53985C) {
            enterActionEditText.getText().replace(enterActionEditText.getSelectionStart(), enterActionEditText.getSelectionEnd(), str2);
            if (enterActionEditText.getSelectionStart() != enterActionEditText.getSelectionEnd()) {
                enterActionEditText.setSelection(enterActionEditText.getSelectionEnd());
                return;
            }
            return;
        }
        C25097t c25097t = C25097t.f120556a;
        Context context = enterActionEditText.getContext();
        AbstractC19074t.m100205c(enterActionEditText);
        c25097t.m130154o(context, AbstractC26112n.m134366G(enterActionEditText, AbstractC27413h.zch_layout_box_comment_limit_max, Integer.valueOf(this.f53985C)));
    }

    /* renamed from: H */
    public static final void m55655H(CommentBox commentBox, View view) {
        AbstractC19074t.m100208f(commentBox, "this$0");
        commentBox.setAttachedVideo(null);
    }

    /* renamed from: I */
    public static final void m55656I(CommentBox commentBox, View view) {
        AbstractC19074t.m100208f(commentBox, "this$0");
        m55667Y(commentBox, null, false, 2, null);
    }

    /* renamed from: J */
    public static final void m55657J(C24985a1 c24985a1, CommentBox commentBox, View view) {
        InterfaceC10658a interfaceC10658a;
        AbstractC19074t.m100208f(c24985a1, "$this_run");
        AbstractC19074t.m100208f(commentBox, "this$0");
        ImageView imageView = c24985a1.f119739w;
        AbstractC19074t.m100207e(imageView, "icoSwitch");
        if (AbstractC26112n.m134380U(imageView) && (interfaceC10658a = commentBox.f53999p) != null) {
            interfaceC10658a.mo54193i(commentBox.f53988F);
        }
    }

    /* renamed from: K */
    public static final boolean m55658K(C24985a1 c24985a1, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(c24985a1, "$this_run");
        if (c24985a1.f119738v.hasFocus()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if (motionEvent.getActionMasked() == 8) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public static final void m55659L(CommentBox commentBox, View view) {
        AbstractC19074t.m100208f(commentBox, "this$0");
        InterfaceC10658a interfaceC10658a = commentBox.f53999p;
        if (interfaceC10658a != null) {
            interfaceC10658a.mo54189e();
        }
    }

    /* renamed from: M */
    public static final void m55660M(CommentBox commentBox, View view) {
        AbstractC19074t.m100208f(commentBox, "this$0");
        if (commentBox.m55692C()) {
            commentBox.m55701a0();
        } else {
            commentBox.m55700Z();
        }
    }

    /* renamed from: N */
    public static final void m55661N(C24985a1 c24985a1, CommentBox commentBox, View view) {
        CharSequence m127168X0;
        boolean z11;
        AbstractC19074t.m100208f(c24985a1, "$this_run");
        AbstractC19074t.m100208f(commentBox, "this$0");
        if (c24985a1.f119738v.getText().length() < commentBox.f53984B) {
            C25097t.f120556a.m130154o(commentBox.getContext(), AbstractC26112n.m134366G(commentBox, AbstractC27413h.zch_layout_box_comment_limit_min, Integer.valueOf(commentBox.f53984B)));
            return;
        }
        if (C25090m.f120499a.m130050b(commentBox.getContext())) {
            if (commentBox.f53987E) {
                commentBox.m55703x();
            }
            InterfaceC10658a interfaceC10658a = commentBox.f53999p;
            if (interfaceC10658a != null) {
                Comment.Identity identity = commentBox.f53988F;
                m127168X0 = AbstractC24342w.m127168X0(c24985a1.f119738v.getText().toString());
                String obj = m127168X0.toString();
                Editable text = c24985a1.f119738v.getText();
                Object[] spans = text.getSpans(0, text.length(), ImageSpan.class);
                AbstractC19074t.m100207e(spans, "getSpans(start, end, T::class.java)");
                if (spans.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                interfaceC10658a.mo54185a(identity, obj, !z11, commentBox.f53989G, commentBox.f53990H);
            }
            c24985a1.f119738v.getText().clear();
            commentBox.setAttachedVideo(null);
            m55667Y(commentBox, null, false, 2, null);
            return;
        }
        C25097t.f120556a.m130153n(commentBox.getContext(), AbstractC27413h.zch_error_no_connection);
    }

    /* renamed from: O */
    public static final void m55662O(CommentBox commentBox, View view) {
        AbstractC19074t.m100208f(commentBox, "this$0");
        AbstractC19074t.m100206d(view, "null cannot be cast to non-null type android.widget.TextView");
        String obj = ((TextView) view).getText().toString();
        view.getLocationInWindow(r2);
        TextView textView = (TextView) view;
        int height = r2[1] + (textView.getHeight() / 2);
        int[] iArr = {iArr[0] + (textView.getWidth() / 2), height};
        commentBox.m55654G(obj, iArr[0], height);
        InterfaceC10658a interfaceC10658a = commentBox.f53999p;
        if (interfaceC10658a != null) {
            interfaceC10658a.mo54187c(obj);
        }
        InterfaceC22531b emoticonPickerHelper = commentBox.getEmoticonPickerHelper();
        if (emoticonPickerHelper != null) {
            emoticonPickerHelper.mo4504a(obj);
        }
    }

    /* renamed from: P */
    public static final void m55663P(C24985a1 c24985a1, CommentBox commentBox) {
        AbstractC19074t.m100208f(c24985a1, "$this_run");
        AbstractC19074t.m100208f(commentBox, "this$0");
        if (c24985a1.f119738v.getText().length() > 0) {
            commentBox.m55653F();
            int i11 = commentBox.f53994L;
            if (i11 >= 0) {
                commentBox.f53994L = i11 + 1;
                c24985a1.f119716A.postDelayed(commentBox.f53993K, ViewConfiguration.getKeyRepeatDelay());
            }
        }
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m55664R(CommentBox commentBox, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return commentBox.m55695Q(z11);
    }

    /* renamed from: U */
    public static /* synthetic */ void m55665U(CommentBox commentBox, Comment.Identity identity, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        commentBox.m55697T(identity, z11, z12);
    }

    /* renamed from: W */
    public static /* synthetic */ void m55666W(CommentBox commentBox, int i11, float f11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        commentBox.m55698V(i11, f11, z11);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m55667Y(CommentBox commentBox, Comment comment, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        commentBox.m55699X(comment, z11);
    }

    private final C24985a1 getBinding() {
        return (C24985a1) this.f53997O.getValue();
    }

    public final InterfaceC22531b getEmoticonPickerHelper() {
        return (InterfaceC22531b) this.f53998P.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m55688y(int i11, float f11, boolean z11) {
        List list;
        CharSequence charSequence;
        Object obj;
        String str;
        int m131504l;
        C24985a1 binding = getBinding();
        if (i11 > 0) {
            if (m55692C()) {
                m55690A();
            } else {
                EnterActionEditText enterActionEditText = binding.f119738v;
                enterActionEditText.setSelection(enterActionEditText.getText().length());
            }
            if (this.f53986D) {
                this.f54008y = this.f54007x + i11;
                InterfaceC22531b emoticonPickerHelper = getEmoticonPickerHelper();
                if (emoticonPickerHelper != null) {
                    list = emoticonPickerHelper.mo4507d(7);
                } else {
                    list = null;
                }
                LinearLayout linearLayout = binding.f119717B;
                AbstractC19074t.m100207e(linearLayout, "lytEmojiRecent");
                int i12 = 0;
                for (Object obj2 : AbstractC1595r0.m8168a(linearLayout)) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    View view = (View) obj2;
                    AbstractC19074t.m100206d(view, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) view;
                    InterfaceC22531b emoticonPickerHelper2 = getEmoticonPickerHelper();
                    if (emoticonPickerHelper2 != null) {
                        String str2 = "";
                        if (list != null) {
                            if (i12 >= 0) {
                                m131504l = AbstractC25368s.m131504l(list);
                                if (i12 <= m131504l) {
                                    obj = list.get(i12);
                                    str = (String) obj;
                                    if (str != null) {
                                        str2 = str;
                                    }
                                }
                            }
                            obj = "";
                            str = (String) obj;
                            if (str != null) {
                            }
                        }
                        charSequence = emoticonPickerHelper2.mo4505b(str2, textView.getTextSize());
                    } else {
                        charSequence = null;
                    }
                    textView.setText(charSequence);
                    i12 = i13;
                }
                LinearLayout linearLayout2 = binding.f119717B;
                AbstractC19074t.m100207e(linearLayout2, "lytEmojiRecent");
                AbstractC26112n.m134431w0(linearLayout2);
            } else {
                this.f54008y = i11;
            }
        } else {
            if (m55692C()) {
                FrameLayout frameLayout = binding.f119716A;
                AbstractC19074t.m100207e(frameLayout, "lytEmoji");
                AbstractC26112n.m134396f(frameLayout);
            } else {
                binding.f119738v.clearFocus();
            }
            LinearLayout linearLayout3 = binding.f119717B;
            AbstractC19074t.m100207e(linearLayout3, "lytEmojiRecent");
            AbstractC26112n.m134367H(linearLayout3);
        }
        requestLayout();
    }

    /* renamed from: z */
    private final CharSequence m55689z(String str, float f11) {
        InterfaceC22531b interfaceC22531b = (InterfaceC22531b) AbstractC0955d.m4496a(getBinding().getRoot().getContext(), AbstractC19061k0.m100169b(InterfaceC22531b.class));
        if (interfaceC22531b != null) {
            if (str == null) {
                str = "";
            }
            return interfaceC22531b.mo4505b(str, f11);
        }
        return null;
    }

    /* renamed from: A */
    public final boolean m55690A() {
        C24985a1 binding = getBinding();
        if (!m55692C()) {
            return false;
        }
        FrameLayout frameLayout = binding.f119716A;
        AbstractC19074t.m100207e(frameLayout, "lytEmoji");
        AbstractC26112n.m134367H(frameLayout);
        binding.f119734r.setImageResource(AbstractC23322a.zch_ic_emoji_line_24);
        InterfaceC22531b emoticonPickerHelper = getEmoticonPickerHelper();
        if (emoticonPickerHelper != null) {
            emoticonPickerHelper.mo4506c(this.f53992J);
        }
        InterfaceC10658a interfaceC10658a = this.f53999p;
        if (interfaceC10658a != null) {
            interfaceC10658a.mo54186b(false);
        }
        if (!m55693D()) {
            binding.f119738v.clearFocus();
            return true;
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m55691B() {
        C24985a1 binding = getBinding();
        if (m55693D()) {
            EnterActionEditText enterActionEditText = binding.f119738v;
            AbstractC19074t.m100207e(enterActionEditText, "edtInput");
            return AbstractC26112n.m134369J(enterActionEditText);
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m55692C() {
        FrameLayout frameLayout = getBinding().f119716A;
        AbstractC19074t.m100207e(frameLayout, "lytEmoji");
        return AbstractC26112n.m134380U(frameLayout);
    }

    /* renamed from: D */
    public final boolean m55693D() {
        return this.f54009z > 0 && this.f53983A == 1.0f;
    }

    /* renamed from: E */
    public final boolean m55694E() {
        if (!m55692C() && !m55693D()) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean m55695Q(boolean z11) {
        if (z11) {
            return m55700Z();
        }
        return m55701a0();
    }

    /* renamed from: S */
    public final void m55696S(List list) {
        String str;
        boolean m131196V;
        AbstractC19074t.m100208f(list, "list");
        List list2 = list;
        Comment comment = this.f53989G;
        if (comment != null) {
            str = comment.m50833g();
        } else {
            str = null;
        }
        m131196V = AbstractC25332a0.m131196V(list2, str);
        if (m131196V) {
            m55667Y(this, null, false, 2, null);
        }
    }

    /* renamed from: T */
    public final void m55697T(Comment.Identity identity, boolean z11, boolean z12) {
        Editable editable;
        String str;
        Comment.Identity m50838l;
        AbstractC19074t.m100208f(identity, "identity");
        C24985a1 binding = getBinding();
        if (identity.m50862l()) {
            AvatarImageView avatarImageView = binding.f119733q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView, identity.m50854d(), identity.m50855e(), identity.m50853c(), AbstractC27408c.zch_placeholder_avatar_user, false, 16, null);
            binding.f119733q.setCornerRadius(Float.MAX_VALUE);
        } else {
            AvatarImageView avatarImageView2 = binding.f119733q;
            AbstractC19074t.m100207e(avatarImageView2, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView2, identity.m50854d(), identity.m50855e(), identity.m50853c(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
            binding.f119733q.setCornerRadius(AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp));
        }
        if (z11) {
            ImageView imageView = binding.f119739w;
            AbstractC19074t.m100207e(imageView, "icoSwitch");
            AbstractC26112n.m134431w0(imageView);
        } else {
            ImageView imageView2 = binding.f119739w;
            AbstractC19074t.m100207e(imageView2, "icoSwitch");
            AbstractC26112n.m134367H(imageView2);
        }
        if (z12) {
            PulseImageView pulseImageView = binding.f119736t;
            AbstractC19074t.m100207e(pulseImageView, "btnUpload");
            AbstractC26112n.m134431w0(pulseImageView);
        } else {
            PulseImageView pulseImageView2 = binding.f119736t;
            AbstractC19074t.m100207e(pulseImageView2, "btnUpload");
            AbstractC26112n.m134367H(pulseImageView2);
        }
        if (identity.m50858h()) {
            EllipsizedTextView ellipsizedTextView = binding.f119720E;
            AbstractC19074t.m100207e(ellipsizedTextView, "txtBlocked");
            AbstractC26112n.m134431w0(ellipsizedTextView);
            if (binding.f119738v.length() > 0) {
                LinearLayout linearLayout = binding.f119718C;
                AbstractC19074t.m100207e(linearLayout, "lytInput");
                AbstractC26112n.m134417p0(linearLayout, binding.f119735s.getPaddingRight());
                PulseImageView pulseImageView3 = binding.f119735s;
                AbstractC19074t.m100207e(pulseImageView3, "btnSend");
                AbstractC26112n.m134367H(pulseImageView3);
            }
            LinearLayout linearLayout2 = binding.f119742z;
            AbstractC19074t.m100207e(linearLayout2, "lytActions");
            AbstractC26112n.m134367H(linearLayout2);
            binding.f119738v.setTag(new SpannableStringBuilder(binding.f119738v.getText()));
            binding.f119738v.getText().clear();
            EnterActionEditText enterActionEditText = binding.f119738v;
            AbstractC19074t.m100207e(enterActionEditText, "edtInput");
            AbstractC26112n.m134367H(enterActionEditText);
        } else {
            EnterActionEditText enterActionEditText2 = binding.f119738v;
            Object tag = enterActionEditText2.getTag();
            if (tag instanceof Editable) {
                editable = (Editable) tag;
            } else {
                editable = null;
            }
            if (editable == null) {
                editable = binding.f119738v.getText();
            }
            enterActionEditText2.setText(editable);
            binding.f119738v.setTag(null);
            EnterActionEditText enterActionEditText3 = binding.f119738v;
            enterActionEditText3.setSelection(enterActionEditText3.getText().length());
            EnterActionEditText enterActionEditText4 = binding.f119738v;
            AbstractC19074t.m100207e(enterActionEditText4, "edtInput");
            AbstractC26112n.m134431w0(enterActionEditText4);
            LinearLayout linearLayout3 = binding.f119742z;
            AbstractC19074t.m100207e(linearLayout3, "lytActions");
            AbstractC26112n.m134431w0(linearLayout3);
            if (binding.f119738v.length() > 0) {
                LinearLayout linearLayout4 = binding.f119718C;
                AbstractC19074t.m100207e(linearLayout4, "lytInput");
                AbstractC26112n.m134417p0(linearLayout4, 0);
                PulseImageView pulseImageView4 = binding.f119735s;
                AbstractC19074t.m100207e(pulseImageView4, "btnSend");
                AbstractC26112n.m134431w0(pulseImageView4);
            }
            EllipsizedTextView ellipsizedTextView2 = binding.f119720E;
            AbstractC19074t.m100207e(ellipsizedTextView2, "txtBlocked");
            AbstractC26112n.m134367H(ellipsizedTextView2);
        }
        String m50854d = identity.m50854d();
        Comment comment = this.f53989G;
        if (comment != null && (m50838l = comment.m50838l()) != null) {
            str = m50838l.m50854d();
        } else {
            str = null;
        }
        if (AbstractC19074t.m100204b(m50854d, str)) {
            m55667Y(this, null, false, 2, null);
        }
        this.f53988F = identity;
    }

    /* renamed from: V */
    public final void m55698V(int i11, float f11, boolean z11) {
        getBinding();
        if (this.f54009z == i11) {
            return;
        }
        if (z11) {
            this.f54009z = i11;
            this.f53983A = f11;
            if (f11 == 1.0f) {
                m55688y(i11, f11, z11);
                return;
            }
            return;
        }
        if (f11 == 1.0f) {
            if (i11 > 0) {
                this.f54008y = i11;
            }
            if (this.f53986D) {
                this.f54008y += this.f54007x;
            }
        }
    }

    /* renamed from: X */
    public final void m55699X(Comment comment, boolean z11) {
        C24985a1 binding = getBinding();
        if (comment == null) {
            SimpleShadowTextView simpleShadowTextView = binding.f119728M;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtMention");
            AbstractC26112n.m134367H(simpleShadowTextView);
            FitUsernameTextView fitUsernameTextView = binding.f119730O;
            AbstractC19074t.m100207e(fitUsernameTextView, "txtMentionName");
            AbstractC26112n.m134367H(fitUsernameTextView);
            BlinkTextView blinkTextView = binding.f119729N;
            AbstractC19074t.m100207e(blinkTextView, "txtMentionClose");
            AbstractC26112n.m134367H(blinkTextView);
        } else {
            binding.f119730O.setText(comment.m50838l().m50855e());
            if (z11) {
                BlinkTextView blinkTextView2 = binding.f119729N;
                AbstractC19074t.m100207e(blinkTextView2, "txtMentionClose");
                AbstractC26112n.m134374O(blinkTextView2);
            } else {
                BlinkTextView blinkTextView3 = binding.f119729N;
                AbstractC19074t.m100207e(blinkTextView3, "txtMentionClose");
                AbstractC26112n.m134431w0(blinkTextView3);
            }
            FitUsernameTextView fitUsernameTextView2 = binding.f119730O;
            AbstractC19074t.m100207e(fitUsernameTextView2, "txtMentionName");
            AbstractC26112n.m134431w0(fitUsernameTextView2);
            SimpleShadowTextView simpleShadowTextView2 = binding.f119728M;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtMention");
            AbstractC26112n.m134431w0(simpleShadowTextView2);
        }
        this.f53989G = comment;
    }

    /* renamed from: Z */
    public final boolean m55700Z() {
        C17487o0 c17487o0;
        C24985a1 binding = getBinding();
        if (m55693D()) {
            if (!m55691B()) {
                return false;
            }
            FrameLayout frameLayout = binding.f119716A;
            AbstractC19074t.m100207e(frameLayout, "lytEmoji");
            AbstractC26112n.m134385Z(frameLayout);
        }
        if (m55692C()) {
            return false;
        }
        FrameLayout frameLayout2 = binding.f119716A;
        AbstractC19074t.m100207e(frameLayout2, "lytEmoji");
        AbstractC26112n.m134431w0(frameLayout2);
        binding.f119734r.setImageResource(AbstractC23322a.zch_ic_emoji_keyboard_line_24);
        InterfaceC22531b emoticonPickerHelper = getEmoticonPickerHelper();
        ZaloView zaloView = null;
        InterfaceC27218a interfaceC27218a = null;
        if (emoticonPickerHelper != null) {
            InterfaceC10658a interfaceC10658a = this.f53999p;
            if (interfaceC10658a != null) {
                c17487o0 = interfaceC10658a.mo54190f();
            } else {
                c17487o0 = null;
            }
            int id2 = binding.f119716A.getId();
            InterfaceC10658a interfaceC10658a2 = this.f53999p;
            if (interfaceC10658a2 != null) {
                interfaceC27218a = interfaceC10658a2.mo54191g();
            }
            zaloView = emoticonPickerHelper.mo4509f(c17487o0, id2, interfaceC27218a, this.f53991I);
        }
        this.f53992J = zaloView;
        InterfaceC10658a interfaceC10658a3 = this.f53999p;
        if (interfaceC10658a3 != null) {
            interfaceC10658a3.mo54186b(true);
        }
        if (!m55693D()) {
            binding.f119738v.requestFocus();
            EnterActionEditText enterActionEditText = binding.f119738v;
            enterActionEditText.setSelection(enterActionEditText.getText().length());
        }
        return true;
    }

    /* renamed from: a0 */
    public final boolean m55701a0() {
        C24985a1 binding = getBinding();
        m55692C();
        if (!m55693D()) {
            EnterActionEditText enterActionEditText = binding.f119738v;
            AbstractC19074t.m100207e(enterActionEditText, "edtInput");
            return AbstractC26112n.m134427u0(enterActionEditText);
        }
        return false;
    }

    public final InterfaceC10658a getCallback() {
        return this.f53999p;
    }

    public final Comment.Identity getIdentityInfo() {
        return this.f53988F;
    }

    public final CharSequence getInputText() {
        String obj = getBinding().f119738v.getText().toString();
        if (obj.length() > 0) {
            return m55689z(obj, getBinding().f119738v.getTextSize());
        }
        return "";
    }

    public final int getKeyboardHeight() {
        return this.f54009z;
    }

    public final float getKeyboardOffset() {
        return this.f53983A;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C24985a1 binding = getBinding();
        binding.f119719D.setClipToOutline(true);
        binding.f119719D.setOutlineProvider(new C10663f());
        binding.f119737u.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.d
            public /* synthetic */ ViewOnClickListenerC10740d() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentBox.m55655H(CommentBox.this, view);
            }
        });
        binding.f119729N.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.e
            public /* synthetic */ ViewOnClickListenerC10741e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentBox.m55656I(CommentBox.this, view);
            }
        });
        binding.f119733q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.f

            /* renamed from: q */
            public final /* synthetic */ CommentBox f54328q;

            public /* synthetic */ ViewOnClickListenerC10745f(CommentBox this) {
                r2 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentBox.m55657J(C24985a1.this, r2, view);
            }
        });
        binding.f119738v.setRawInputType(16385);
        binding.f119738v.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.shortvideo.ui.widget.g
            public /* synthetic */ ViewOnTouchListenerC10746g() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m55658K;
                m55658K = CommentBox.m55658K(C24985a1.this, view, motionEvent);
                return m55658K;
            }
        });
        EnterActionEditText enterActionEditText = binding.f119738v;
        AbstractC19074t.m100207e(enterActionEditText, "edtInput");
        AbstractC26112n.m134414o(enterActionEditText, new C10664g());
        EnterActionEditText enterActionEditText2 = binding.f119738v;
        AbstractC19074t.m100207e(enterActionEditText2, "edtInput");
        AbstractC26112n.m134400h(enterActionEditText2, new C10665h(binding));
        EnterActionEditText enterActionEditText3 = binding.f119738v;
        AbstractC19074t.m100207e(enterActionEditText3, "edtInput");
        AbstractC26112n.m134412n(enterActionEditText3, new C10666i(binding));
        binding.f119736t.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.h
            public /* synthetic */ ViewOnClickListenerC10747h() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentBox.m55659L(CommentBox.this, view);
            }
        });
        binding.f119734r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.i
            public /* synthetic */ ViewOnClickListenerC10748i() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentBox.m55660M(CommentBox.this, view);
            }
        });
        binding.f119735s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.j

            /* renamed from: q */
            public final /* synthetic */ CommentBox f54389q;

            public /* synthetic */ ViewOnClickListenerC10759j(CommentBox this) {
                r2 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentBox.m55661N(C24985a1.this, r2, view);
            }
        });
        PulseImageView pulseImageView = binding.f119735s;
        AbstractC19074t.m100207e(pulseImageView, "btnSend");
        AbstractC26112n.m134367H(pulseImageView);
        binding.f119716A.setId(View.generateViewId());
        LinearLayout linearLayout = binding.f119717B;
        AbstractC19074t.m100207e(linearLayout, "lytEmojiRecent");
        Iterator it = AbstractC1595r0.m8168a(linearLayout).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.k
                public /* synthetic */ ViewOnClickListenerC10760k() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommentBox.m55662O(CommentBox.this, view);
                }
            });
        }
        this.f53991I = new C10662e(binding);
        this.f53993K = new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.l

            /* renamed from: q */
            public final /* synthetic */ CommentBox f54392q;

            public /* synthetic */ RunnableC10761l(CommentBox this) {
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CommentBox.m55663P(C24985a1.this, r2);
            }
        };
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        C24985a1 binding = getBinding();
        View view = binding.f119731P;
        AbstractC19074t.m100207e(view, "vieDivider");
        AbstractC26112n.m134383X(view, 0, 0);
        int i17 = this.f54005v;
        SimpleShadowTextView simpleShadowTextView = binding.f119728M;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtMention");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = binding.f119728M;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtMention");
            AbstractC26112n.m134383X(simpleShadowTextView2, i17, 0);
            FitUsernameTextView fitUsernameTextView = binding.f119730O;
            AbstractC19074t.m100207e(fitUsernameTextView, "txtMentionName");
            AbstractC26112n.m134383X(fitUsernameTextView, i17, binding.f119728M.getRight());
            BlinkTextView blinkTextView = binding.f119729N;
            AbstractC19074t.m100207e(blinkTextView, "txtMentionClose");
            AbstractC26112n.m134383X(blinkTextView, i17, binding.f119730O.getRight());
            i15 = binding.f119728M.getMeasuredHeight();
        } else {
            i15 = this.f54006w;
        }
        int i18 = i17 + i15;
        RecyclingImageView recyclingImageView = binding.f119719D;
        AbstractC19074t.m100207e(recyclingImageView, "rivVideo");
        if (AbstractC26112n.m134378S(recyclingImageView)) {
            int measuredWidth = (getMeasuredWidth() - binding.f119719D.getMeasuredWidth()) / 2;
            int i19 = this.f54001r;
            SimpleShadowTextView simpleShadowTextView3 = binding.f119728M;
            AbstractC19074t.m100207e(simpleShadowTextView3, "txtMention");
            if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
                i16 = binding.f119728M.getPaddingBottom();
            } else {
                i16 = this.f54006w;
            }
            int i21 = i18 + (i19 - i16);
            RecyclingImageView recyclingImageView2 = binding.f119719D;
            AbstractC19074t.m100207e(recyclingImageView2, "rivVideo");
            AbstractC26112n.m134383X(recyclingImageView2, i21, measuredWidth);
            ImageView imageView = binding.f119740x;
            AbstractC19074t.m100207e(imageView, "icoVideoPlay");
            if (AbstractC26112n.m134378S(imageView)) {
                int measuredWidth2 = measuredWidth + ((binding.f119719D.getMeasuredWidth() - this.f54003t) / 2);
                int measuredHeight = i21 + ((binding.f119719D.getMeasuredHeight() - this.f54003t) / 2);
                ImageView imageView2 = binding.f119740x;
                AbstractC19074t.m100207e(imageView2, "icoVideoPlay");
                AbstractC26112n.m134383X(imageView2, measuredHeight, measuredWidth2);
            } else {
                int measuredWidth3 = measuredWidth + ((binding.f119719D.getMeasuredWidth() - this.f54004u) / 2);
                int measuredHeight2 = i21 + ((binding.f119719D.getMeasuredHeight() - this.f54004u) / 2);
                ImageView imageView3 = binding.f119741y;
                AbstractC19074t.m100207e(imageView3, "icoVideoSensitive");
                AbstractC26112n.m134383X(imageView3, measuredHeight2, measuredWidth3);
            }
            int right = binding.f119719D.getRight();
            int top = binding.f119719D.getTop();
            PulseImageView pulseImageView = binding.f119737u;
            AbstractC19074t.m100207e(pulseImageView, "btnVideoClose");
            AbstractC26112n.m134383X(pulseImageView, top, right);
            i18 = binding.f119719D.getBottom() + this.f54001r;
        }
        LinearLayout linearLayout = binding.f119718C;
        AbstractC19074t.m100207e(linearLayout, "lytInput");
        AbstractC26112n.m134383X(linearLayout, i18, 0);
        int measuredHeight3 = i18 + binding.f119718C.getMeasuredHeight();
        if (m55694E()) {
            if (m55692C()) {
                FrameLayout frameLayout = binding.f119716A;
                AbstractC19074t.m100207e(frameLayout, "lytEmoji");
                AbstractC26112n.m134383X(frameLayout, measuredHeight3, 0);
            }
            if (m55693D() && this.f53986D) {
                LinearLayout linearLayout2 = binding.f119717B;
                AbstractC19074t.m100207e(linearLayout2, "lytEmojiRecent");
                AbstractC26112n.m134383X(linearLayout2, measuredHeight3, 0);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        C24985a1 binding = getBinding();
        View view = binding.f119731P;
        AbstractC19074t.m100207e(view, "vieDivider");
        AbstractC26112n.m134387a0(view, size, 1073741824, this.f54005v, 1073741824);
        int i15 = this.f54005v;
        SimpleShadowTextView simpleShadowTextView = binding.f119728M;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtMention");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = binding.f119728M;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtMention");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
            BlinkTextView blinkTextView = binding.f119729N;
            AbstractC19074t.m100207e(blinkTextView, "txtMentionClose");
            AbstractC26112n.m134387a0(blinkTextView, 0, 0, 0, 0);
            FitUsernameTextView fitUsernameTextView = binding.f119730O;
            AbstractC19074t.m100207e(fitUsernameTextView, "txtMentionName");
            AbstractC26112n.m134387a0(fitUsernameTextView, (size - binding.f119728M.getMeasuredWidth()) - binding.f119729N.getMeasuredWidth(), 1073741824, 0, 0);
            i13 = binding.f119728M.getMeasuredHeight();
        } else {
            i13 = this.f54006w;
        }
        int i16 = i15 + i13;
        RecyclingImageView recyclingImageView = binding.f119719D;
        AbstractC19074t.m100207e(recyclingImageView, "rivVideo");
        if (AbstractC26112n.m134378S(recyclingImageView)) {
            RecyclingImageView recyclingImageView2 = binding.f119719D;
            AbstractC19074t.m100207e(recyclingImageView2, "rivVideo");
            int i17 = this.f54000q;
            AbstractC26112n.m134387a0(recyclingImageView2, (i17 * 2) / 3, 1073741824, i17, 1073741824);
            ImageView imageView = binding.f119740x;
            AbstractC19074t.m100207e(imageView, "icoVideoPlay");
            if (AbstractC26112n.m134378S(imageView)) {
                ImageView imageView2 = binding.f119740x;
                AbstractC19074t.m100207e(imageView2, "icoVideoPlay");
                int i18 = this.f54003t;
                AbstractC26112n.m134387a0(imageView2, i18, 1073741824, i18, 1073741824);
            } else {
                ImageView imageView3 = binding.f119741y;
                AbstractC19074t.m100207e(imageView3, "icoVideoSensitive");
                int i19 = this.f54004u;
                AbstractC26112n.m134387a0(imageView3, i19, 1073741824, i19, 1073741824);
            }
            PulseImageView pulseImageView = binding.f119737u;
            AbstractC19074t.m100207e(pulseImageView, "btnVideoClose");
            AbstractC26112n.m134387a0(pulseImageView, 0, 0, 0, 0);
            int i21 = this.f54001r;
            int i22 = this.f54000q + i21 + i21;
            SimpleShadowTextView simpleShadowTextView3 = binding.f119728M;
            AbstractC19074t.m100207e(simpleShadowTextView3, "txtMention");
            if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
                i14 = binding.f119728M.getPaddingBottom();
            } else {
                i14 = this.f54006w;
            }
            i16 += i22 - i14;
        }
        LinearLayout linearLayout = binding.f119718C;
        AbstractC19074t.m100207e(linearLayout, "lytInput");
        AbstractC26112n.m134387a0(linearLayout, size, 1073741824, 0, 0);
        int measuredHeight = i16 + binding.f119718C.getMeasuredHeight();
        if (m55694E()) {
            if (m55692C()) {
                if (this.f54008y == 0) {
                    this.f54008y = Math.min(size, Resources.getSystem().getDisplayMetrics().heightPixels / 2) - binding.f119738v.getMinHeight();
                }
                FrameLayout frameLayout = binding.f119716A;
                AbstractC19074t.m100207e(frameLayout, "lytEmoji");
                AbstractC26112n.m134387a0(frameLayout, size, 1073741824, this.f54008y, 1073741824);
            }
            if (m55693D() && this.f53986D) {
                LinearLayout linearLayout2 = binding.f119717B;
                AbstractC19074t.m100207e(linearLayout2, "lytEmojiRecent");
                AbstractC26112n.m134387a0(linearLayout2, size, 1073741824, this.f54007x, 1073741824);
            }
            measuredHeight += this.f54008y;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        InterfaceC10658a interfaceC10658a = this.f53999p;
        if (interfaceC10658a != null) {
            interfaceC10658a.mo54188d(i11, i12);
        }
    }

    public final void setAttachedVideo(Video video) {
        C24985a1 binding = getBinding();
        if (video != null) {
            C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(binding.f119719D);
            c23528a.m123599d();
            if (video.m52915v0()) {
                ImageView imageView = binding.f119741y;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                imageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_hide_line_24, AbstractC27406a.zch_icon_primary));
                ImageView imageView2 = binding.f119741y;
                AbstractC19074t.m100207e(imageView2, "icoVideoSensitive");
                AbstractC26112n.m134431w0(imageView2);
                ImageView imageView3 = binding.f119740x;
                AbstractC19074t.m100207e(imageView3, "icoVideoPlay");
                AbstractC26112n.m134367H(imageView3);
            } else {
                ImageView imageView4 = binding.f119740x;
                AbstractC19074t.m100207e(imageView4, "icoVideoPlay");
                AbstractC26112n.m134431w0(imageView4);
                ImageView imageView5 = binding.f119741y;
                AbstractC19074t.m100207e(imageView5, "icoVideoSensitive");
                AbstractC26112n.m134367H(imageView5);
            }
            RecyclingImageView recyclingImageView = binding.f119719D;
            AbstractC19074t.m100207e(recyclingImageView, "rivVideo");
            AbstractC26112n.m134431w0(recyclingImageView);
            PulseImageView pulseImageView = binding.f119737u;
            AbstractC19074t.m100207e(pulseImageView, "btnVideoClose");
            AbstractC26112n.m134431w0(pulseImageView);
        } else {
            RecyclingImageView recyclingImageView2 = binding.f119719D;
            AbstractC19074t.m100207e(recyclingImageView2, "rivVideo");
            AbstractC26112n.m134367H(recyclingImageView2);
            ImageView imageView6 = binding.f119740x;
            AbstractC19074t.m100207e(imageView6, "icoVideoPlay");
            AbstractC26112n.m134367H(imageView6);
            ImageView imageView7 = binding.f119741y;
            AbstractC19074t.m100207e(imageView7, "icoVideoSensitive");
            AbstractC26112n.m134367H(imageView7);
            PulseImageView pulseImageView2 = binding.f119737u;
            AbstractC19074t.m100207e(pulseImageView2, "btnVideoClose");
            AbstractC26112n.m134367H(pulseImageView2);
        }
        this.f53990H = video;
    }

    public final void setCallback(InterfaceC10658a interfaceC10658a) {
        this.f53999p = interfaceC10658a;
    }

    public final void setCloseOnSend(boolean z11) {
        this.f53987E = z11;
    }

    public final void setHintMessage(int i11) {
        getBinding().f119738v.setHint(i11);
    }

    public final void setMaxLength(int i11) {
        this.f53985C = i11;
    }

    public final void setMaxLinesInput(int i11) {
        getBinding().f119738v.setMaxLines(i11);
    }

    public final void setRecentEmojiEnable(boolean z11) {
        this.f53986D = z11;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        InterfaceC10658a interfaceC10658a = this.f53999p;
        if (interfaceC10658a != null) {
            interfaceC10658a.mo54188d(getWidth(), getHeight());
        }
    }

    /* renamed from: w */
    public final void m55702w() {
        getBinding().f119738v.getText().clear();
    }

    /* renamed from: x */
    public final boolean m55703x() {
        if (m55692C()) {
            return m55690A();
        }
        return m55691B();
    }
}
