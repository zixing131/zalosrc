package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import bi0.AbstractC2810d;
import c20.C3226p;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.model.PersonalizeVideo;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.state.floating.AbstractC10105a;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jn0.AbstractC21317c;
import ln0.AbstractC22543l;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C25051s0;
import q20.C25092o;
import q20.C25100w;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.AbstractC26992m;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import z10.C31179n0;

/* loaded from: classes5.dex */
public abstract class VideoItem extends FrameLayout {
    public static final C9674b Companion = new C9674b(null);

    /* renamed from: A */
    private final int f51001A;

    /* renamed from: B */
    private final int f51002B;

    /* renamed from: C */
    private final int f51003C;

    /* renamed from: D */
    private final int f51004D;

    /* renamed from: E */
    private final Handler f51005E;

    /* renamed from: F */
    private boolean f51006F;

    /* renamed from: G */
    private Handler f51007G;

    /* renamed from: H */
    private final ArrayList f51008H;

    /* renamed from: I */
    private long f51009I;

    /* renamed from: J */
    private C3226p f51010J;

    /* renamed from: K */
    private final Interpolator f51011K;

    /* renamed from: L */
    private final long f51012L;

    /* renamed from: M */
    private long f51013M;

    /* renamed from: N */
    private C25051s0 f51014N;

    /* renamed from: p */
    private final int f51015p;

    /* renamed from: q */
    private final int f51016q;

    /* renamed from: r */
    private final int f51017r;

    /* renamed from: s */
    private final int f51018s;

    /* renamed from: t */
    private final int f51019t;

    /* renamed from: u */
    private final int f51020u;

    /* renamed from: v */
    private final int f51021v;

    /* renamed from: w */
    private final int f51022w;

    /* renamed from: x */
    private final int f51023x;

    /* renamed from: y */
    private final int f51024y;

    /* renamed from: z */
    private final int f51025z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9673a {

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ boolean m52448a(InterfaceC9673a interfaceC9673a, boolean z11, boolean z12, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 2) != 0) {
                        z12 = false;
                    }
                    return interfaceC9673a.mo52445p(z11, z12);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickDescription");
            }

            /* renamed from: b */
            public static /* synthetic */ void m52449b(InterfaceC9673a interfaceC9673a, boolean z11, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 1) != 0) {
                        z11 = false;
                    }
                    interfaceC9673a.mo52446q(z11);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickFollow");
            }

            /* renamed from: c */
            public static /* synthetic */ void m52450c(InterfaceC9673a interfaceC9673a, boolean z11, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 1) != 0) {
                        z11 = false;
                    }
                    interfaceC9673a.mo52447r(z11);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickLike");
            }

            /* renamed from: d */
            public static /* synthetic */ void m52451d(InterfaceC9673a interfaceC9673a, boolean z11, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 1) != 0) {
                        z11 = false;
                    }
                    interfaceC9673a.mo52437b(z11);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickMore");
            }
        }

        /* renamed from: b */
        void mo52437b(boolean z11);

        /* renamed from: d */
        void mo52438d();

        /* renamed from: e */
        void mo52439e();

        /* renamed from: f */
        void mo52440f();

        /* renamed from: g */
        void mo52441g(String str);

        /* renamed from: i */
        void mo52442i();

        /* renamed from: m */
        void mo52443m();

        /* renamed from: o */
        void mo52444o();

        /* renamed from: p */
        boolean mo52445p(boolean z11, boolean z12);

        /* renamed from: q */
        void mo52446q(boolean z11);

        /* renamed from: r */
        void mo52447r(boolean z11);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$b */
    /* loaded from: classes5.dex */
    public static final class C9674b {
        private C9674b() {
        }

        public /* synthetic */ C9674b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC9675c {
        /* renamed from: b */
        void mo52452b();

        /* renamed from: e */
        void mo52453e();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$d */
    /* loaded from: classes5.dex */
    public static final class C9676d {

        /* renamed from: a */
        private final float f51026a;

        /* renamed from: b */
        private final float f51027b;

        /* renamed from: c */
        private final Drawable f51028c;

        /* renamed from: d */
        private final float f51029d;

        /* renamed from: e */
        private final float f51030e;

        /* renamed from: f */
        private final float f51031f;

        /* renamed from: g */
        private final OvershootInterpolator f51032g;

        /* renamed from: h */
        private final DecelerateInterpolator f51033h;

        /* renamed from: i */
        private final long f51034i;

        /* renamed from: j */
        private final long f51035j;

        /* renamed from: k */
        private final long f51036k;

        /* renamed from: l */
        private final long f51037l;

        /* renamed from: m */
        private boolean f51038m;

        public C9676d(VideoItem videoItem, float f11, float f12) {
            AbstractC19074t.m100208f(videoItem, "view");
            this.f51026a = f11;
            this.f51027b = f12;
            Drawable m134434z = AbstractC26112n.m134434z(videoItem, AbstractC27408c.zch_ic_heart_reaction);
            m134434z.getBounds().left = videoItem.getWidth() / (-6);
            m134434z.getBounds().top = videoItem.getWidth() / (-6);
            m134434z.getBounds().right = videoItem.getWidth() / 6;
            m134434z.getBounds().bottom = videoItem.getWidth() / 6;
            this.f51028c = m134434z;
            AbstractC21317c.a aVar = AbstractC21317c.f103810p;
            this.f51029d = (videoItem.getWidth() / 9.0f) * (aVar.mo110371c() + 1.0f);
            this.f51030e = (aVar.mo110371c() * 0.6f) + 1.2f;
            this.f51031f = (aVar.mo110371c() * 60.0f) - 30.0f;
            this.f51032g = new OvershootInterpolator(3.0f);
            this.f51033h = new DecelerateInterpolator();
            this.f51034i = 300L;
            this.f51035j = 300L;
            this.f51036k = 400L;
            this.f51037l = System.currentTimeMillis();
        }

        /* renamed from: b */
        private final void m52454b(Canvas canvas, float f11, float f12, float f13) {
            canvas.save();
            canvas.translate(this.f51026a, this.f51027b + f11);
            canvas.rotate(this.f51031f);
            canvas.scale(f12, f12);
            this.f51028c.setAlpha((int) (f13 * 255));
            this.f51028c.draw(canvas);
            canvas.restore();
        }

        /* renamed from: c */
        static /* synthetic */ void m52455c(C9676d c9676d, Canvas canvas, float f11, float f12, float f13, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f12 = 1.0f;
            }
            if ((i11 & 8) != 0) {
                f13 = 1.0f;
            }
            c9676d.m52454b(canvas, f11, f12, f13);
        }

        /* renamed from: a */
        public final void m52456a(Canvas canvas) {
            AbstractC19074t.m100208f(canvas, "canvas");
            long currentTimeMillis = System.currentTimeMillis() - this.f51037l;
            long j11 = this.f51034i;
            if (currentTimeMillis <= j11) {
                m52455c(this, canvas, 0.0f, 1.5f - (this.f51032g.getInterpolation(((float) currentTimeMillis) / ((float) j11)) * 0.5f), 0.0f, 10, null);
                return;
            }
            long j12 = currentTimeMillis - j11;
            long j13 = this.f51035j;
            if (j12 <= j13) {
                m52455c(this, canvas, 0.0f, 0.0f, 0.0f, 14, null);
                return;
            }
            long j14 = j12 - j13;
            long j15 = this.f51036k;
            if (j14 <= j15) {
                float f11 = ((float) j14) / ((float) j15);
                float f12 = 1.0f - f11;
                m52454b(canvas, 0.0f - (this.f51033h.getInterpolation(f11) * this.f51029d), (f11 * this.f51030e) + f12, f12);
                return;
            }
            this.f51038m = true;
        }

        /* renamed from: d */
        public final boolean m52457d() {
            return this.f51038m;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$e */
    /* loaded from: classes5.dex */
    public static final class C9677e extends AbstractC26992m {

        /* renamed from: s */
        final /* synthetic */ String f51040s;

        C9677e(String str) {
            this.f51040s = str;
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                String str = this.f51040s;
                AbstractC19074t.m100207e(str, "$hashtag");
                callback.mo52441g(str);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(VideoItem.this, 9));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$f */
    /* loaded from: classes5.dex */
    public static final class C9678f extends MetricAffectingSpan {
        C9678f() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(VideoItem.this, 9));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$g */
    /* loaded from: classes5.dex */
    public static final class C9679g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9679g f51042q = new C9679g();

        C9679g() {
            super(1);
        }

        /* renamed from: a */
        public final void m52458a(PulseImageView pulseImageView) {
            AbstractC19074t.m100208f(pulseImageView, "view");
            pulseImageView.setImageResource(AbstractC23322a.zch_ic_share_shadow_solid_chat_36);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52458a((PulseImageView) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$h */
    /* loaded from: classes5.dex */
    public static final class C9680h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9680h f51043q = new C9680h();

        C9680h() {
            super(1);
        }

        /* renamed from: a */
        public final void m52459a(PulseImageView pulseImageView) {
            AbstractC19074t.m100208f(pulseImageView, "view");
            pulseImageView.setImageResource(AbstractC23322a.zch_ic_share_shadow_solid_diary_36);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52459a((PulseImageView) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$i */
    /* loaded from: classes5.dex */
    public static final class C9681i extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Video f51044l1;

        /* renamed from: m1 */
        final /* synthetic */ VideoItem f51045m1;

        /* renamed from: n1 */
        final /* synthetic */ RecyclingImageView f51046n1;

        C9681i(Video video, VideoItem videoItem, RecyclingImageView recyclingImageView) {
            this.f51044l1 = video;
            this.f51045m1 = videoItem;
            this.f51046n1 = recyclingImageView;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                Video video = this.f51044l1;
                VideoItem videoItem = this.f51045m1;
                RecyclingImageView recyclingImageView = this.f51046n1;
                video.m52864R0(m18839c.getWidth() / m18839c.getHeight());
                videoItem.getVideoLayoutor().m16356q(video.m52847I());
                recyclingImageView.setImageBitmap(m18839c);
                recyclingImageView.requestLayout();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$j */
    /* loaded from: classes5.dex */
    static final class C9682j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9682j f51047q = new C9682j();

        C9682j() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C9676d c9676d) {
            AbstractC19074t.m100208f(c9676d, "heart");
            return Boolean.valueOf(c9676d.m52457d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$k */
    /* loaded from: classes5.dex */
    public static final class C9683k extends AbstractC19075u implements InterfaceC18505l {
        C9683k() {
            super(1);
        }

        /* renamed from: a */
        public final void m52461a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52438d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52461a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$l */
    /* loaded from: classes5.dex */
    public static final class C9684l extends AbstractC19075u implements InterfaceC18505l {
        C9684l() {
            super(1);
        }

        /* renamed from: a */
        public final void m52462a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52438d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52462a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$m */
    /* loaded from: classes5.dex */
    public static final class C9685m extends AbstractC19075u implements InterfaceC18505l {
        C9685m() {
            super(1);
        }

        /* renamed from: a */
        public final void m52463a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                InterfaceC9673a.a.m52449b(callback, false, 1, null);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52463a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$n */
    /* loaded from: classes5.dex */
    public static final class C9686n extends AbstractC26992m {

        /* renamed from: s */
        final /* synthetic */ C25051s0 f51052s;

        /* renamed from: t */
        final /* synthetic */ EllipsizedTextView f51053t;

        C9686n(C25051s0 c25051s0, EllipsizedTextView ellipsizedTextView) {
            this.f51052s = c25051s0;
            this.f51053t = ellipsizedTextView;
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null && !callback.mo52445p(true, true)) {
                this.f51052s.f120246L.setMaxLines(Integer.MAX_VALUE);
                this.f51052s.f120246L.setText(this.f51053t.getOriginalText());
                this.f51052s.f120238D.setAllowAnimation$zshort_release(true);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            EllipsizedTextView ellipsizedTextView = this.f51053t;
            AbstractC19074t.m100207e(ellipsizedTextView, "$this_run");
            textPaint.setColor(AbstractC26112n.m134426u(ellipsizedTextView, AbstractC27406a.zch_text_inverse_subtle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$o */
    /* loaded from: classes5.dex */
    public static final class C9687o extends AbstractC19075u implements InterfaceC18505l {
        C9687o() {
            super(1);
        }

        /* renamed from: a */
        public final void m52464a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52439e();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52464a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$p */
    /* loaded from: classes5.dex */
    public static final class C9688p extends AbstractC19075u implements InterfaceC18505l {
        C9688p() {
            super(1);
        }

        /* renamed from: a */
        public final void m52465a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52440f();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52465a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$q */
    /* loaded from: classes5.dex */
    public static final class C9689q extends AbstractC19075u implements InterfaceC18505l {
        C9689q() {
            super(1);
        }

        /* renamed from: a */
        public final void m52466a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52442i();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52466a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$r */
    /* loaded from: classes5.dex */
    public static final class C9690r extends AbstractC19075u implements InterfaceC18505l {
        C9690r() {
            super(1);
        }

        /* renamed from: a */
        public final void m52467a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                InterfaceC9673a.a.m52451d(callback, false, 1, null);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52467a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.VideoItem$s */
    /* loaded from: classes5.dex */
    public static final class C9691s extends AbstractC19075u implements InterfaceC18505l {
        C9691s() {
            super(1);
        }

        /* renamed from: a */
        public final void m52468a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9673a callback = VideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52444o();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52468a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        setWillNotDraw(false);
        setMotionEventSplittingEnabled(false);
        this.f51015p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_padding);
        this.f51016q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_width);
        this.f51017r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_spacing);
        this.f51018s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_margin_right);
        this.f51019t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_text_size_number);
        this.f51020u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_text_size_string);
        this.f51021v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_size);
        this.f51022w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_to_name);
        this.f51023x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_to_description);
        this.f51024y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_name_to_follow);
        this.f51025z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_description_margin_right);
        this.f51001A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_description_to_time);
        this.f51002B = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_dim_info_extra);
        this.f51003C = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        this.f51004D = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_play_btn_size);
        this.f51005E = new Handler(Looper.getMainLooper());
        this.f51007G = new Handler(Looper.getMainLooper());
        this.f51008H = new ArrayList();
        this.f51010J = new C3226p();
        this.f51011K = new Interpolator() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.d0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f11) {
                float m52414l;
                m52414l = VideoItem.m52414l(f11);
                return m52414l;
            }
        };
        this.f51012L = 300L;
    }

    /* renamed from: I */
    public static final void m52393I(VideoItem videoItem) {
        AbstractC19074t.m100208f(videoItem, "this$0");
        InterfaceC9673a callback = videoItem.getCallback();
        if (callback != null) {
            callback.mo52437b(true);
        }
        C25100w c25100w = C25100w.f120572a;
        Context context = videoItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c25100w.m130168a(context, 30L);
        videoItem.f51006F = true;
        videoItem.getParent().requestDisallowInterceptTouchEvent(true);
    }

    /* renamed from: J */
    public static final void m52394J(VideoItem videoItem, View view) {
        AbstractC19074t.m100208f(videoItem, "this$0");
        InterfaceC9673a callback = videoItem.getCallback();
        if (callback != null) {
            InterfaceC9673a.a.m52450c(callback, false, 1, null);
        }
        C25100w c25100w = C25100w.f120572a;
        Context context = videoItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c25100w.m130168a(context, 30L);
    }

    /* renamed from: K */
    public static final void m52395K(VideoItem videoItem, View view) {
        AbstractC19074t.m100208f(videoItem, "this$0");
        InterfaceC9673a callback = videoItem.getCallback();
        if (callback != null) {
            callback.mo52443m();
        }
    }

    /* renamed from: L */
    public static final boolean m52396L(EllipsizedTextView ellipsizedTextView, VideoItem videoItem, C25051s0 c25051s0, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(ellipsizedTextView, "$this_run");
        AbstractC19074t.m100208f(videoItem, "this$0");
        AbstractC19074t.m100208f(c25051s0, "$this_apply");
        if (!view.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            if (ellipsizedTextView.getOriginalText() == null && ellipsizedTextView.getMaxLines() <= 3) {
                InterfaceC9673a callback = videoItem.getCallback();
                if (callback != null && !InterfaceC9673a.a.m52448a(callback, false, false, 2, null)) {
                    motionEvent.offsetLocation(c25051s0.f120238D.getLeft(), c25051s0.f120238D.getTop());
                    AbstractC19074t.m100207e(motionEvent, "apply(...)");
                    videoItem.onTouchEvent(motionEvent);
                }
            } else if (ellipsizedTextView.getMaxLines() > 3) {
                InterfaceC9673a callback2 = videoItem.getCallback();
                if (callback2 != null && !InterfaceC9673a.a.m52448a(callback2, false, false, 2, null)) {
                    ellipsizedTextView.setMaxLines(3);
                    c25051s0.f120238D.setAllowAnimation$zshort_release(true);
                }
            } else {
                InterfaceC9673a callback3 = videoItem.getCallback();
                if (callback3 != null && !InterfaceC9673a.a.m52448a(callback3, true, false, 2, null)) {
                    ellipsizedTextView.setMaxLines(Integer.MAX_VALUE);
                    ellipsizedTextView.setText(ellipsizedTextView.getOriginalText());
                    c25051s0.f120238D.setAllowAnimation$zshort_release(true);
                }
            }
        }
        return true;
    }

    /* renamed from: M */
    public static final void m52397M(VideoItem videoItem, C25051s0 c25051s0, View view) {
        AbstractC19074t.m100208f(videoItem, "this$0");
        AbstractC19074t.m100208f(c25051s0, "$this_apply");
        InterfaceC9673a callback = videoItem.getCallback();
        if (callback != null && !callback.mo52445p(false, true)) {
            c25051s0.f120246L.setMaxLines(3);
            c25051s0.f120238D.setAllowAnimation$zshort_release(true);
        }
    }

    /* renamed from: V */
    public static final void m52398V(C25051s0 c25051s0, VideoItem videoItem) {
        AbstractC19074t.m100208f(c25051s0, "$this_run");
        AbstractC19074t.m100208f(videoItem, "this$0");
        BlinkTextView blinkTextView = c25051s0.f120256t;
        AbstractC19074t.m100207e(blinkTextView, "btnCollapse");
        if (AbstractC26112n.m134380U(blinkTextView)) {
            c25051s0.f120256t.callOnClick();
            return;
        }
        if (AbstractC19074t.m100204b(c25051s0.f120235A.getTag(), Boolean.TRUE)) {
            ImageView imageView = c25051s0.f120235A;
            AbstractC19074t.m100207e(imageView, "btnPlay");
            if (AbstractC26112n.m134380U(imageView)) {
                InterfaceC9675c controller = videoItem.getController();
                if (controller != null) {
                    controller.mo52453e();
                    return;
                }
                return;
            }
            InterfaceC9675c controller2 = videoItem.getController();
            if (controller2 != null) {
                controller2.mo52452b();
            }
        }
    }

    /* renamed from: d0 */
    public static final void m52403d0(VideoItem videoItem, C25051s0 c25051s0, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(videoItem, "this$0");
        AbstractC19074t.m100208f(c25051s0, "$this_run");
        AbstractC19074t.m100208f(valueAnimator, "it");
        videoItem.setControlAlpha(1.0f - c25051s0.f120237C.getAlpha());
    }

    /* renamed from: e0 */
    public static final float m52405e0(float f11) {
        return f11;
    }

    /* renamed from: f0 */
    public static final void m52407f0(C25051s0 c25051s0, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c25051s0, "$this_run");
        AbstractC19074t.m100208f(valueAnimator, "animator");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ImageView imageView = c25051s0.f120235A;
        AbstractC19074t.m100207e(imageView, "btnPlay");
        float f11 = animatedFraction * 1.0f;
        AbstractC26112n.m134423s0(imageView, 2.0f - f11);
        ProgressBar progressBar = c25051s0.f120254r;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        AbstractC26112n.m134423s0(progressBar, 1.0f - f11);
    }

    /* renamed from: g0 */
    public static final float m52409g0(float f11) {
        return f11;
    }

    /* renamed from: l */
    public static final float m52414l(float f11) {
        return (float) ((Math.sin(f11 * 3.141592653589793d) * 0.25d) + 1.0d);
    }

    /* renamed from: n */
    public static /* synthetic */ void m52415n(VideoItem videoItem, Video video, String str, C31179n0.d dVar, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 8) != 0) {
                z11 = true;
            }
            videoItem.mo52024m(video, str, dVar, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* renamed from: w */
    public static /* synthetic */ void m52416w(VideoItem videoItem, Video video, C31179n0.d dVar, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            videoItem.mo52028v(video, dVar, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindFollowState");
    }

    /* renamed from: A */
    public void mo52017A(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (C27417l.f129055a.m140378b().m51243p() && video.m52863R() == 0 && video.m52856N() != null) {
            if (video.m52842F() > 0) {
                c25051s0.f120249O.setTextSize(0, this.f51019t);
                c25051s0.f120249O.setText(AbstractC26105g.m134334a(video.m52842F()));
            } else {
                c25051s0.f120249O.setTextSize(0, this.f51020u);
                c25051s0.f120249O.setText(AbstractC27413h.zch_item_video_share);
            }
            PulseImageView pulseImageView = c25051s0.f120236B;
            AbstractC19074t.m100207e(pulseImageView, "btnShare");
            AbstractC26112n.m134431w0(pulseImageView);
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120249O;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtShare");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            return;
        }
        PulseImageView pulseImageView2 = c25051s0.f120236B;
        AbstractC19074t.m100207e(pulseImageView2, "btnShare");
        AbstractC26112n.m134367H(pulseImageView2);
        SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120249O;
        AbstractC19074t.m100207e(simpleShadowTextView2, "txtShare");
        AbstractC26112n.m134367H(simpleShadowTextView2);
    }

    /* renamed from: B */
    public void m52417B() {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        PulseImageView pulseImageView = c25051s0.f120261y;
        AbstractC19074t.m100207e(pulseImageView, "btnLike");
        if (AbstractC26112n.m134380U(pulseImageView)) {
            c25051s0.f120261y.m55937l();
        }
    }

    /* renamed from: C */
    public void m52418C() {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        PulseImageView pulseImageView = c25051s0.f120236B;
        AbstractC19074t.m100207e(pulseImageView, "btnShare");
        if (AbstractC26112n.m134380U(pulseImageView)) {
            c25051s0.f120236B.m55938m(C9679g.f51042q, 2);
        }
    }

    /* renamed from: D */
    public void m52419D() {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        PulseImageView pulseImageView = c25051s0.f120236B;
        AbstractC19074t.m100207e(pulseImageView, "btnShare");
        if (AbstractC26112n.m134380U(pulseImageView)) {
            c25051s0.f120236B.m55938m(C9680h.f51043q, 2);
        }
    }

    /* renamed from: E */
    public void m52420E(Video video, C31179n0.d dVar) {
        AbstractC19074t.m100208f(video, "video");
        m52434x(video);
        m52416w(this, video, dVar, false, 4, null);
        mo52025p(video);
    }

    /* renamed from: F */
    public void mo52308F(Video video) {
        String str;
        Bitmap bitmap;
        AbstractC19074t.m100208f(video, "video");
        C25051s0 c25051s0 = this.f51014N;
        Bitmap bitmap2 = null;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        RecyclingImageView recyclingImageView = c25051s0.f120240F;
        this.f51010J.m16356q(video.m52847I());
        String m52911t = video.m52911t();
        FloatingManager.C10103a c10103a = FloatingManager.Companion;
        AbstractC10105a m53860b = c10103a.m53860b();
        if (m53860b != null) {
            str = m53860b.mo53883i();
        } else {
            str = null;
        }
        if (AbstractC19074t.m100204b(m52911t, str)) {
            AbstractC10105a m53860b2 = c10103a.m53860b();
            if (m53860b2 != null) {
                bitmap = m53860b2.m53884j();
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                C23528a c23528a = (C23528a) new C23528a(recyclingImageView.getContext()).m123612r(c25051s0.f120240F);
                AbstractC10105a m53860b3 = c10103a.m53860b();
                if (m53860b3 != null) {
                    bitmap2 = m53860b3.m53884j();
                }
                c23528a.m123614t(bitmap2);
                return;
            }
        }
        C23528a c23528a2 = (C23528a) new C23528a(recyclingImageView.getContext()).m123612r(c25051s0.f120240F);
        String m52898l = video.m52898l();
        int m130066e = C25092o.f120501a.m130066e();
        AbstractC19074t.m100205c(recyclingImageView);
        C24003n c24003n = new C24003n(m130066e, AbstractC26112n.m134434z(recyclingImageView, AbstractC27408c.zch_placeholder_thumbnail_video), 0, false, 0, false, null, 124, null);
        C9681i c9681i = new C9681i(video, this, recyclingImageView);
        c9681i.m125609e1(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        c23528a2.m123579C(m52898l, c24003n, c9681i);
    }

    /* renamed from: G */
    public void m52421G(Video video, String str, C31179n0.d dVar) {
        String m52894j;
        boolean m127128x;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        DescriptionLayout descriptionLayout = c25051s0.f120238D;
        AbstractC19074t.m100207e(descriptionLayout, "lytDescription");
        if (AbstractC26112n.m134376Q(descriptionLayout) && (m52894j = video.m52894j()) != null) {
            m127128x = AbstractC24341v.m127128x(m52894j);
            if (!m127128x) {
                c25051s0.f120238D.setAllowAnimation$zshort_release(true);
            }
        }
        mo52024m(video, str, dVar, false);
    }

    /* renamed from: H */
    public void mo52018H(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (getBottom() > getMeasuredHeight()) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f51005E.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        this.f51006F = false;
        this.f51005E.postDelayed(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.k0
            public /* synthetic */ RunnableC9719k0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoItem.m52393I(VideoItem.this);
            }
        }, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: N */
    public Rect m52422N(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16 = i13 - this.f51018s;
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        PulseImageView pulseImageView = c25051s0.f120258v;
        AbstractC19074t.m100207e(pulseImageView, "btnDelete");
        if (AbstractC26112n.m134378S(pulseImageView)) {
            PulseImageView pulseImageView2 = c25051s0.f120258v;
            AbstractC19074t.m100207e(pulseImageView2, "btnDelete");
            AbstractC26112n.m134382W(pulseImageView2, i14, i16);
            PulseImageView pulseImageView3 = c25051s0.f120258v;
            AbstractC19074t.m100207e(pulseImageView3, "btnDelete");
            int m134422s = AbstractC26112n.m134422s(pulseImageView3) + (c25051s0.f120245K.getMeasuredWidth() / 2);
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120245K;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtDelete");
            AbstractC26112n.m134382W(simpleShadowTextView, i14, m134422s);
            i16 = c25051s0.f120258v.getRight();
            i15 = i14 - (c25051s0.f120258v.getMeasuredHeight() + this.f51017r);
        } else {
            i15 = i14;
        }
        PulseImageView pulseImageView4 = c25051s0.f120262z;
        AbstractC19074t.m100207e(pulseImageView4, "btnMore");
        if (AbstractC26112n.m134378S(pulseImageView4)) {
            int paddingBottom = i15 + c25051s0.f120262z.getPaddingBottom();
            PulseImageView pulseImageView5 = c25051s0.f120262z;
            AbstractC19074t.m100207e(pulseImageView5, "btnMore");
            AbstractC26112n.m134382W(pulseImageView5, paddingBottom, i16);
            i15 = paddingBottom - (c25051s0.f120262z.getMeasuredHeight() + this.f51017r);
        }
        PulseImageView pulseImageView6 = c25051s0.f120236B;
        AbstractC19074t.m100207e(pulseImageView6, "btnShare");
        if (AbstractC26112n.m134378S(pulseImageView6)) {
            PulseImageView pulseImageView7 = c25051s0.f120236B;
            AbstractC19074t.m100207e(pulseImageView7, "btnShare");
            AbstractC26112n.m134382W(pulseImageView7, i15, i16);
            PulseImageView pulseImageView8 = c25051s0.f120236B;
            AbstractC19074t.m100207e(pulseImageView8, "btnShare");
            int m134422s2 = AbstractC26112n.m134422s(pulseImageView8) + (c25051s0.f120249O.getMeasuredWidth() / 2);
            SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120249O;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtShare");
            AbstractC26112n.m134382W(simpleShadowTextView2, i15, m134422s2);
            i16 = c25051s0.f120236B.getRight();
            i15 -= c25051s0.f120236B.getMeasuredHeight() + this.f51017r;
        }
        PulseImageView pulseImageView9 = c25051s0.f120259w;
        AbstractC19074t.m100207e(pulseImageView9, "btnDislike");
        if (AbstractC26112n.m134378S(pulseImageView9)) {
            PulseImageView pulseImageView10 = c25051s0.f120259w;
            AbstractC19074t.m100207e(pulseImageView10, "btnDislike");
            AbstractC26112n.m134382W(pulseImageView10, i15, i16);
            i15 -= c25051s0.f120259w.getMeasuredHeight() + this.f51017r;
        }
        PulseImageView pulseImageView11 = c25051s0.f120255s;
        AbstractC19074t.m100207e(pulseImageView11, "btnBookmark");
        if (AbstractC26112n.m134378S(pulseImageView11)) {
            PulseImageView pulseImageView12 = c25051s0.f120255s;
            AbstractC19074t.m100207e(pulseImageView12, "btnBookmark");
            AbstractC26112n.m134382W(pulseImageView12, i15, i16);
            PulseImageView pulseImageView13 = c25051s0.f120255s;
            AbstractC19074t.m100207e(pulseImageView13, "btnBookmark");
            int m134422s3 = AbstractC26112n.m134422s(pulseImageView13) + (c25051s0.f120242H.getMeasuredWidth() / 2);
            SimpleShadowTextView simpleShadowTextView3 = c25051s0.f120242H;
            AbstractC19074t.m100207e(simpleShadowTextView3, "txtBookmark");
            AbstractC26112n.m134382W(simpleShadowTextView3, i15, m134422s3);
            i16 = c25051s0.f120255s.getRight();
            i15 -= c25051s0.f120255s.getMeasuredHeight() + this.f51017r;
        }
        PulseImageView pulseImageView14 = c25051s0.f120257u;
        AbstractC19074t.m100207e(pulseImageView14, "btnComment");
        if (AbstractC26112n.m134378S(pulseImageView14)) {
            PulseImageView pulseImageView15 = c25051s0.f120257u;
            AbstractC19074t.m100207e(pulseImageView15, "btnComment");
            AbstractC26112n.m134382W(pulseImageView15, i15, i16);
            PulseImageView pulseImageView16 = c25051s0.f120257u;
            AbstractC19074t.m100207e(pulseImageView16, "btnComment");
            int m134422s4 = AbstractC26112n.m134422s(pulseImageView16) + (c25051s0.f120243I.getMeasuredWidth() / 2);
            SimpleShadowTextView simpleShadowTextView4 = c25051s0.f120243I;
            AbstractC19074t.m100207e(simpleShadowTextView4, "txtComment");
            AbstractC26112n.m134382W(simpleShadowTextView4, i15, m134422s4);
            i16 = c25051s0.f120257u.getRight();
            i15 -= c25051s0.f120257u.getMeasuredHeight() + this.f51017r;
        }
        PulseImageView pulseImageView17 = c25051s0.f120261y;
        AbstractC19074t.m100207e(pulseImageView17, "btnLike");
        if (AbstractC26112n.m134378S(pulseImageView17)) {
            PulseImageView pulseImageView18 = c25051s0.f120261y;
            AbstractC19074t.m100207e(pulseImageView18, "btnLike");
            AbstractC26112n.m134382W(pulseImageView18, i15, i16);
            PulseImageView pulseImageView19 = c25051s0.f120261y;
            AbstractC19074t.m100207e(pulseImageView19, "btnLike");
            int m134422s5 = AbstractC26112n.m134422s(pulseImageView19) + (c25051s0.f120247M.getMeasuredWidth() / 2);
            SimpleShadowTextView simpleShadowTextView5 = c25051s0.f120247M;
            AbstractC19074t.m100207e(simpleShadowTextView5, "txtLike");
            AbstractC26112n.m134382W(simpleShadowTextView5, i15, m134422s5);
        }
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: O */
    public Rect mo52309O(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f51014N == null) {
            AbstractC19074t.m100223u("binding");
        }
        return new Rect(i11, i14, i13, i14);
    }

    /* renamed from: P */
    public Rect mo52019P(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        C25051s0 c25051s0 = this.f51014N;
        C25051s0 c25051s02 = null;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        SimpleShadowTextView simpleShadowTextView = c25051s0.f120244J;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtCreatedTime");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120244J;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtCreatedTime");
            AbstractC26112n.m134381V(simpleShadowTextView2, i14, i11);
            int measuredHeight = c25051s0.f120244J.getMeasuredHeight();
            DescriptionLayout descriptionLayout = c25051s0.f120238D;
            AbstractC19074t.m100207e(descriptionLayout, "lytDescription");
            if (AbstractC26112n.m134378S(descriptionLayout)) {
                i16 = this.f51001A;
            } else {
                i16 = this.f51023x;
            }
            i15 = i14 - (measuredHeight + i16);
        } else {
            i15 = i14;
        }
        DescriptionLayout descriptionLayout2 = c25051s0.f120238D;
        AbstractC19074t.m100207e(descriptionLayout2, "lytDescription");
        if (AbstractC26112n.m134378S(descriptionLayout2)) {
            DescriptionLayout descriptionLayout3 = c25051s0.f120238D;
            AbstractC19074t.m100207e(descriptionLayout3, "lytDescription");
            AbstractC26112n.m134381V(descriptionLayout3, i15, i11);
            i15 -= c25051s0.f120238D.getMeasuredHeight() + this.f51023x;
        }
        AvatarImageView avatarImageView = c25051s0.f120253q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        AbstractC26112n.m134381V(avatarImageView, i15, i11);
        int i17 = this.f51021v + this.f51022w + i11;
        FitUsernameTextView fitUsernameTextView = c25051s0.f120248N;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134381V(fitUsernameTextView, i15, i17);
        SimpleShadowTextView simpleShadowTextView3 = c25051s0.f120260x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnFollow");
        if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
            int measuredWidth = i17 + c25051s0.f120248N.getMeasuredWidth() + this.f51024y;
            int measuredHeight2 = i15 - ((c25051s0.f120248N.getMeasuredHeight() - c25051s0.f120260x.getMeasuredHeight()) / 2);
            SimpleShadowTextView simpleShadowTextView4 = c25051s0.f120260x;
            AbstractC19074t.m100207e(simpleShadowTextView4, "btnFollow");
            AbstractC26112n.m134381V(simpleShadowTextView4, measuredHeight2, measuredWidth);
        }
        C25051s0 c25051s03 = this.f51014N;
        if (c25051s03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25051s02 = c25051s03;
        }
        return new Rect(i11, c25051s02.f120253q.getTop(), i13, i14);
    }

    /* renamed from: Q */
    public Rect m52423Q(boolean z11, int i11, int i12, int i13, int i14) {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        this.f51010J.m16354m(z11, i11, i12, i13, i14);
        View view = c25051s0.f120250P;
        AbstractC19074t.m100207e(view, "vieBackground");
        AbstractC26112n.m134383X(view, i12, i11);
        View view2 = c25051s0.f120251Q;
        AbstractC19074t.m100207e(view2, "vieOverlay");
        AbstractC26112n.m134383X(view2, i12, i11);
        RecyclingImageView recyclingImageView = c25051s0.f120240F;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        int m134422s = AbstractC26112n.m134422s(recyclingImageView) - (c25051s0.f120239E.getMeasuredWidth() / 2);
        RecyclingImageView recyclingImageView2 = c25051s0.f120240F;
        AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
        int m134424t = AbstractC26112n.m134424t(recyclingImageView2) - (c25051s0.f120239E.getMeasuredHeight() / 2);
        FrameLayout frameLayout = c25051s0.f120239E;
        AbstractC19074t.m100207e(frameLayout, "lytPlay");
        AbstractC26112n.m134383X(frameLayout, m134424t, m134422s);
        return new Rect(i11, i12, i13, i14);
    }

    /* renamed from: R */
    public Size m52424R(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        PulseImageView pulseImageView = c25051s0.f120258v;
        AbstractC19074t.m100207e(pulseImageView, "btnDelete");
        if (AbstractC26112n.m134378S(pulseImageView)) {
            PulseImageView pulseImageView2 = c25051s0.f120258v;
            AbstractC19074t.m100207e(pulseImageView2, "btnDelete");
            AbstractC26112n.m134387a0(pulseImageView2, this.f51016q, 1073741824, 0, 0);
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120245K;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtDelete");
            AbstractC26112n.m134387a0(simpleShadowTextView, 0, 0, 0, 0);
        }
        PulseImageView pulseImageView3 = c25051s0.f120262z;
        AbstractC19074t.m100207e(pulseImageView3, "btnMore");
        if (AbstractC26112n.m134378S(pulseImageView3)) {
            PulseImageView pulseImageView4 = c25051s0.f120262z;
            AbstractC19074t.m100207e(pulseImageView4, "btnMore");
            AbstractC26112n.m134387a0(pulseImageView4, this.f51016q, 1073741824, 0, 0);
        }
        PulseImageView pulseImageView5 = c25051s0.f120236B;
        AbstractC19074t.m100207e(pulseImageView5, "btnShare");
        if (AbstractC26112n.m134378S(pulseImageView5)) {
            PulseImageView pulseImageView6 = c25051s0.f120236B;
            AbstractC19074t.m100207e(pulseImageView6, "btnShare");
            AbstractC26112n.m134387a0(pulseImageView6, this.f51016q, 1073741824, 0, 0);
            SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120249O;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtShare");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
        }
        PulseImageView pulseImageView7 = c25051s0.f120259w;
        AbstractC19074t.m100207e(pulseImageView7, "btnDislike");
        if (AbstractC26112n.m134378S(pulseImageView7)) {
            PulseImageView pulseImageView8 = c25051s0.f120259w;
            AbstractC19074t.m100207e(pulseImageView8, "btnDislike");
            AbstractC26112n.m134387a0(pulseImageView8, this.f51016q, 1073741824, 0, 0);
        }
        PulseImageView pulseImageView9 = c25051s0.f120255s;
        AbstractC19074t.m100207e(pulseImageView9, "btnBookmark");
        if (AbstractC26112n.m134378S(pulseImageView9)) {
            PulseImageView pulseImageView10 = c25051s0.f120255s;
            AbstractC19074t.m100207e(pulseImageView10, "btnBookmark");
            AbstractC26112n.m134387a0(pulseImageView10, this.f51016q, 1073741824, 0, 0);
            SimpleShadowTextView simpleShadowTextView3 = c25051s0.f120242H;
            AbstractC19074t.m100207e(simpleShadowTextView3, "txtBookmark");
            AbstractC26112n.m134387a0(simpleShadowTextView3, 0, 0, 0, 0);
        }
        PulseImageView pulseImageView11 = c25051s0.f120257u;
        AbstractC19074t.m100207e(pulseImageView11, "btnComment");
        if (AbstractC26112n.m134378S(pulseImageView11)) {
            PulseImageView pulseImageView12 = c25051s0.f120257u;
            AbstractC19074t.m100207e(pulseImageView12, "btnComment");
            AbstractC26112n.m134387a0(pulseImageView12, this.f51016q, 1073741824, 0, 0);
            SimpleShadowTextView simpleShadowTextView4 = c25051s0.f120243I;
            AbstractC19074t.m100207e(simpleShadowTextView4, "txtComment");
            AbstractC26112n.m134387a0(simpleShadowTextView4, 0, 0, 0, 0);
        }
        PulseImageView pulseImageView13 = c25051s0.f120261y;
        AbstractC19074t.m100207e(pulseImageView13, "btnLike");
        if (AbstractC26112n.m134378S(pulseImageView13)) {
            PulseImageView pulseImageView14 = c25051s0.f120261y;
            AbstractC19074t.m100207e(pulseImageView14, "btnLike");
            AbstractC26112n.m134387a0(pulseImageView14, this.f51016q, 1073741824, 0, 0);
            SimpleShadowTextView simpleShadowTextView5 = c25051s0.f120247M;
            AbstractC19074t.m100207e(simpleShadowTextView5, "txtLike");
            AbstractC26112n.m134387a0(simpleShadowTextView5, 0, 0, 0, 0);
        }
        return new Size(size, size2);
    }

    /* renamed from: S */
    public Size mo52310S(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        if (this.f51014N == null) {
            AbstractC19074t.m100223u("binding");
        }
        return new Size(size, 0);
    }

    /* renamed from: T */
    public Size mo52020T(int i11, int i12) {
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        SimpleShadowTextView simpleShadowTextView = c25051s0.f120244J;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtCreatedTime");
        if (AbstractC26112n.m134378S(simpleShadowTextView)) {
            SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120244J;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtCreatedTime");
            AbstractC26112n.m134387a0(simpleShadowTextView2, size, 1073741824, 0, 0);
            int measuredHeight = c25051s0.f120244J.getMeasuredHeight();
            DescriptionLayout descriptionLayout = c25051s0.f120238D;
            AbstractC19074t.m100207e(descriptionLayout, "lytDescription");
            if (AbstractC26112n.m134378S(descriptionLayout)) {
                i14 = this.f51001A;
            } else {
                i14 = this.f51023x;
            }
            i13 = measuredHeight + i14;
        } else {
            i13 = 0;
        }
        DescriptionLayout descriptionLayout2 = c25051s0.f120238D;
        AbstractC19074t.m100207e(descriptionLayout2, "lytDescription");
        if (AbstractC26112n.m134378S(descriptionLayout2)) {
            DescriptionLayout descriptionLayout3 = c25051s0.f120238D;
            AbstractC19074t.m100207e(descriptionLayout3, "lytDescription");
            AbstractC26112n.m134387a0(descriptionLayout3, size, 1073741824, View.MeasureSpec.getSize(i12) / 2, Integer.MIN_VALUE);
            i13 += c25051s0.f120238D.getMeasuredHeight() + this.f51023x;
        }
        AvatarImageView avatarImageView = c25051s0.f120253q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        int i15 = this.f51021v;
        AbstractC26112n.m134387a0(avatarImageView, i15, 1073741824, i15, 1073741824);
        int i16 = this.f51021v;
        int i17 = i13 + i16;
        int i18 = (size - i16) - this.f51022w;
        SimpleShadowTextView simpleShadowTextView3 = c25051s0.f120260x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnFollow");
        if (AbstractC26112n.m134378S(simpleShadowTextView3)) {
            SimpleShadowTextView simpleShadowTextView4 = c25051s0.f120260x;
            AbstractC19074t.m100207e(simpleShadowTextView4, "btnFollow");
            AbstractC26112n.m134387a0(simpleShadowTextView4, 0, 0, 0, 0);
            i18 -= c25051s0.f120260x.getMeasuredWidth() + this.f51024y;
        }
        FitUsernameTextView fitUsernameTextView = c25051s0.f120248N;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134387a0(fitUsernameTextView, i18, 1073741824, this.f51021v, 1073741824);
        return new Size(size, i17);
    }

    /* renamed from: U */
    public Size m52425U(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        View view = c25051s0.f120250P;
        AbstractC19074t.m100207e(view, "vieBackground");
        AbstractC26112n.m134387a0(view, size, 1073741824, size2, 1073741824);
        View view2 = c25051s0.f120251Q;
        AbstractC19074t.m100207e(view2, "vieOverlay");
        AbstractC26112n.m134387a0(view2, size, 1073741824, size2, 1073741824);
        this.f51010J.m16355n(i11, i12);
        int i13 = this.f51004D * 2;
        FrameLayout frameLayout = c25051s0.f120239E;
        AbstractC19074t.m100207e(frameLayout, "lytPlay");
        AbstractC26112n.m134387a0(frameLayout, i13, 1073741824, i13, 1073741824);
        return new Size(size, size2);
    }

    /* renamed from: W */
    public void m52426W() {
        this.f51007G.removeCallbacksAndMessages(null);
    }

    /* renamed from: X */
    public void m52427X() {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        c25051s0.f120238D.m52106c();
    }

    /* renamed from: Y */
    public void m52428Y() {
        this.f51008H.clear();
        this.f51009I = 0L;
    }

    /* renamed from: Z */
    public void mo52021Z() {
        m52429a0();
        m52431c0();
        m52426W();
        m52428Y();
        m52427X();
        setThumbnailVisible(true);
        setLoadingVisible(false);
    }

    /* renamed from: a0 */
    public void m52429a0() {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        c25051s0.f120261y.m55936k();
    }

    /* renamed from: b0 */
    public void m52430b0() {
        this.f51005E.removeCallbacksAndMessages(null);
    }

    /* renamed from: c0 */
    public void m52431c0() {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        c25051s0.f120236B.m55936k();
        c25051s0.f120236B.setImageResource(AbstractC2810d.zch_ic_share_shadow_solid_36);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        mo52018H(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    protected final long getAnimFollowDuration() {
        return this.f51012L;
    }

    protected final Interpolator getAnimFollowInterpolator() {
        return this.f51011K;
    }

    protected final long getAnimFollowStartTime() {
        return this.f51013M;
    }

    protected final int getAvatarSize() {
        return this.f51021v;
    }

    protected final int getAvatarToDescription() {
        return this.f51023x;
    }

    protected final int getAvatarToName() {
        return this.f51022w;
    }

    public abstract InterfaceC9673a getCallback();

    protected final Handler getControlHandler() {
        return this.f51007G;
    }

    public abstract InterfaceC9675c getController();

    protected final int getDescriptionMargin() {
        return this.f51025z;
    }

    protected final int getDescriptionToTime() {
        return this.f51001A;
    }

    protected final int getDimInfoExtra() {
        return this.f51002B;
    }

    public final int getFooterHeight() {
        return this.f51003C;
    }

    protected final ArrayList<C9676d> getHeartAnimators() {
        return this.f51008H;
    }

    protected final int getItemPadding() {
        return this.f51015p;
    }

    protected final Handler getLongTouchHandler() {
        return this.f51005E;
    }

    protected final boolean getLongTouchReached() {
        return this.f51006F;
    }

    protected final int getNameToFollow() {
        return this.f51024y;
    }

    public final C25051s0 getParentBinding() {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            return null;
        }
        return c25051s0;
    }

    protected final int getPlayButtonSize() {
        return this.f51004D;
    }

    protected final int getRightButtonMargin() {
        return this.f51018s;
    }

    protected final int getRightButtonSpacing() {
        return this.f51017r;
    }

    protected final int getRightButtonTextSizeNumber() {
        return this.f51019t;
    }

    protected final int getRightButtonTextSizeString() {
        return this.f51020u;
    }

    protected final int getRightButtonWidth() {
        return this.f51016q;
    }

    public RecyclingImageView getThumbnailView() {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        RecyclingImageView recyclingImageView = c25051s0.f120240F;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        return recyclingImageView;
    }

    protected final long getTouchTimestamp() {
        return this.f51009I;
    }

    public final C3226p getVideoLayoutor() {
        return this.f51010J;
    }

    /* renamed from: m */
    public void mo52024m(Video video, String str, C31179n0.d dVar, boolean z11) {
        boolean m127128x;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        if (z11) {
            mo52021Z();
        }
        mo52308F(video);
        m52434x(video);
        m52432r(video);
        mo52017A(video);
        mo52027u(video, str);
        m52433s(video);
        m52416w(this, video, dVar, false, 4, null);
        m52436z(video, str);
        mo52025p(video);
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        c25051s0.f120253q.setAvatar(video.m52887f());
        c25051s0.f120248N.setText(video.m52887f().m50775o());
        c25051s0.f120248N.setVerifiedIcon(video.m52887f().m50725F());
        String m52894j = video.m52894j();
        if (m52894j != null) {
            m127128x = AbstractC24341v.m127128x(m52894j);
            if (!m127128x) {
                EllipsizedTextView ellipsizedTextView = c25051s0.f120246L;
                SpannableString spannableString = new SpannableString(video.m52894j());
                Matcher matcher = Pattern.compile("#\\w+").matcher(spannableString);
                while (matcher.find()) {
                    spannableString.setSpan(new C9677e(matcher.group()), matcher.start(), matcher.end(), 17);
                    spannableString.setSpan(new C9678f(), matcher.start(), matcher.end(), 17);
                }
                ellipsizedTextView.setText(spannableString);
                DescriptionLayout descriptionLayout = c25051s0.f120238D;
                AbstractC19074t.m100207e(descriptionLayout, "lytDescription");
                AbstractC26112n.m134431w0(descriptionLayout);
                return;
            }
        }
        DescriptionLayout descriptionLayout2 = c25051s0.f120238D;
        AbstractC19074t.m100207e(descriptionLayout2, "lytDescription");
        AbstractC26112n.m134367H(descriptionLayout2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m52430b0();
        m52426W();
        m52428Y();
    }

    @Override // android.view.View
    public void onDrawForeground(Canvas canvas) {
        float m116587j;
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDrawForeground(canvas);
        if (!this.f51008H.isEmpty()) {
            Iterator it = this.f51008H.iterator();
            while (it.hasNext()) {
                ((C9676d) it.next()).m52456a(canvas);
            }
            AbstractC25378x.m131542D(this.f51008H, C9682j.f51047q);
            invalidate();
        }
        if (this.f51013M > 0) {
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f51013M)) / ((float) this.f51012L);
            Interpolator interpolator = this.f51011K;
            m116587j = AbstractC22543l.m116587j(currentTimeMillis, 0.0f, 1.0f);
            float interpolation = interpolator.getInterpolation(m116587j);
            C25051s0 c25051s0 = this.f51014N;
            if (c25051s0 == null) {
                AbstractC19074t.m100223u("binding");
                c25051s0 = null;
            }
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120260x;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
            AbstractC26112n.m134423s0(simpleShadowTextView, interpolation);
            if (currentTimeMillis < 1.0f) {
                invalidate();
            } else {
                this.f51013M = 0L;
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C25051s0 m129933a = C25051s0.m129933a(this);
        AbstractC19074t.m100207e(m129933a, "bind(...)");
        C3226p c3226p = this.f51010J;
        RecyclingImageView recyclingImageView = m129933a.f120240F;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        c3226p.m16357r(recyclingImageView);
        View view = m129933a.f120251Q;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 637534208, 1291845632, 1711276032});
        view.setBackground(gradientDrawable);
        View view2 = m129933a.f120237C;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColors(new int[]{0, 1291845632, -1946157056, -872415232, -16777216});
        view2.setBackground(gradientDrawable2);
        m129933a.f120261y.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.c0
            public /* synthetic */ ViewOnClickListenerC9703c0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                VideoItem.m52394J(VideoItem.this, view3);
            }
        });
        m129933a.f120255s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.e0
            public /* synthetic */ ViewOnClickListenerC9707e0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                VideoItem.m52395K(VideoItem.this, view3);
            }
        });
        PulseImageView pulseImageView = m129933a.f120257u;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        pulseImageView.setImageDrawable(C27280g.m139658a(context, AbstractC23322a.zch_ic_comment_shadow_solid_36));
        PulseImageView pulseImageView2 = m129933a.f120257u;
        AbstractC19074t.m100207e(pulseImageView2, "btnComment");
        AbstractC26112n.m134407k0(pulseImageView2, new C9687o());
        PulseImageView pulseImageView3 = m129933a.f120236B;
        AbstractC19074t.m100207e(pulseImageView3, "btnShare");
        AbstractC26112n.m134407k0(pulseImageView3, new C9688p());
        PulseImageView pulseImageView4 = m129933a.f120259w;
        AbstractC19074t.m100207e(pulseImageView4, "btnDislike");
        AbstractC26112n.m134407k0(pulseImageView4, new C9689q());
        PulseImageView pulseImageView5 = m129933a.f120262z;
        AbstractC19074t.m100207e(pulseImageView5, "btnMore");
        AbstractC26112n.m134407k0(pulseImageView5, new C9690r());
        PulseImageView pulseImageView6 = m129933a.f120258v;
        AbstractC19074t.m100207e(pulseImageView6, "btnDelete");
        AbstractC26112n.m134407k0(pulseImageView6, new C9691s());
        AvatarImageView avatarImageView = m129933a.f120253q;
        AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
        AbstractC26112n.m134407k0(avatarImageView, new C9683k());
        FitUsernameTextView fitUsernameTextView = m129933a.f120248N;
        AbstractC19074t.m100207e(fitUsernameTextView, "txtName");
        AbstractC26112n.m134407k0(fitUsernameTextView, new C9684l());
        SimpleShadowTextView simpleShadowTextView = m129933a.f120260x;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C9685m());
        EllipsizedTextView ellipsizedTextView = m129933a.f120246L;
        ellipsizedTextView.setEllipsizedMaxLine(2);
        AbstractC19074t.m100205c(ellipsizedTextView);
        SpannableString spannableString = new SpannableString(AbstractC26112n.m134366G(ellipsizedTextView, AbstractC27413h.zch_text_ellipsis_see_more, new Object[0]));
        spannableString.setSpan(new C9686n(m129933a, ellipsizedTextView), 1, spannableString.length(), 17);
        ellipsizedTextView.setEllipsisText(spannableString);
        ellipsizedTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.f0

            /* renamed from: q */
            public final /* synthetic */ VideoItem f51084q;

            /* renamed from: r */
            public final /* synthetic */ C25051s0 f51085r;

            public /* synthetic */ ViewOnTouchListenerC9709f0(VideoItem this, C25051s0 m129933a2) {
                r2 = this;
                r3 = m129933a2;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                boolean m52396L;
                m52396L = VideoItem.m52396L(EllipsizedTextView.this, r2, r3, view3, motionEvent);
                return m52396L;
            }
        });
        m129933a2.f120256t.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.g0

            /* renamed from: q */
            public final /* synthetic */ C25051s0 f51088q;

            public /* synthetic */ ViewOnClickListenerC9711g0(C25051s0 m129933a2) {
                r2 = m129933a2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                VideoItem.m52397M(VideoItem.this, r2, view3);
            }
        });
        this.f51014N = m129933a2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (getBottom() <= getMeasuredHeight() && !this.f51006F && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight = getMeasuredHeight();
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        m52423Q(z11, 0, 0, getMeasuredWidth(), measuredHeight);
        View view = c25051s0.f120237C;
        AbstractC19074t.m100207e(view, "dimBackgroundInfo");
        if (AbstractC26112n.m134378S(view)) {
            View view2 = c25051s0.f120237C;
            AbstractC19074t.m100207e(view2, "dimBackgroundInfo");
            AbstractC26112n.m134381V(view2, measuredHeight, 0);
        }
        if (C3226p.Companion.m16362e()) {
            measuredHeight -= this.f51003C;
        }
        int height = measuredHeight - mo52309O(z11, 0, 0, getMeasuredWidth(), measuredHeight).height();
        int i15 = this.f51015p;
        int i16 = height - i15;
        mo52019P(z11, i15, 0, getMeasuredWidth() - this.f51025z, i16);
        m52422N(z11, getMeasuredWidth() - this.f51025z, 0, getMeasuredWidth(), i16);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        m52425U(i11, i12);
        int i13 = (size - this.f51015p) - this.f51025z;
        C3226p.Companion.m16362e();
        mo52310S(i11, i12).getHeight();
        mo52020T(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE)).getHeight();
        BlinkTextView blinkTextView = c25051s0.f120256t;
        AbstractC19074t.m100207e(blinkTextView, "btnCollapse");
        if (AbstractC26112n.m134378S(blinkTextView)) {
            View view = c25051s0.f120237C;
            AbstractC19074t.m100207e(view, "dimBackgroundInfo");
            AbstractC26112n.m134431w0(view);
            View view2 = c25051s0.f120237C;
            AbstractC19074t.m100207e(view2, "dimBackgroundInfo");
            AbstractC26112n.m134387a0(view2, size, 1073741824, size2, 1073741824);
        } else {
            View view3 = c25051s0.f120237C;
            AbstractC19074t.m100207e(view3, "dimBackgroundInfo");
            AbstractC26112n.m134367H(view3);
        }
        m52424R(i11, i12);
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i11;
        InterfaceC9673a callback;
        AbstractC19074t.m100208f(motionEvent, "event");
        C25051s0 c25051s0 = this.f51014N;
        Boolean bool = null;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (getBottom() <= getMeasuredHeight() && !this.f51006F && motionEvent.getAction() == 1) {
            float y11 = motionEvent.getY();
            int measuredHeight = getMeasuredHeight();
            if (C3226p.Companion.m16362e()) {
                i11 = this.f51003C;
            } else {
                i11 = 0;
            }
            if (y11 <= measuredHeight - i11) {
                if (this.f51009I >= System.currentTimeMillis() - ViewConfiguration.getDoubleTapTimeout()) {
                    if (this.f51007G.hasMessages(0)) {
                        this.f51007G.removeMessages(0);
                    }
                    Object tag = c25051s0.f120261y.getTag();
                    if (tag instanceof Boolean) {
                        bool = (Boolean) tag;
                    }
                    if (AbstractC19074t.m100204b(bool, Boolean.FALSE) && (callback = getCallback()) != null) {
                        callback.mo52447r(true);
                    }
                    this.f51008H.add(new C9676d(this, motionEvent.getX(), motionEvent.getY()));
                    C25100w c25100w = C25100w.f120572a;
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    c25100w.m130168a(context, 30L);
                    invalidate();
                } else {
                    this.f51007G.postDelayed(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.h0

                        /* renamed from: q */
                        public final /* synthetic */ VideoItem f51091q;

                        public /* synthetic */ RunnableC9713h0(VideoItem this) {
                            r2 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoItem.m52398V(C25051s0.this, r2);
                        }
                    }, ViewConfiguration.getDoubleTapTimeout());
                }
                this.f51009I = System.currentTimeMillis();
            }
        }
        return true;
    }

    /* renamed from: p */
    public void mo52025p(Video video) {
        CoreConfig m51425b;
        AbstractC19074t.m100208f(video, "video");
        AbstractC28684a.h hVar = AbstractC28684a.Companion;
        C24860q mo146380s = hVar.m143692z().mo146380s(video.m52911t());
        if (mo146380s != null) {
            boolean booleanValue = ((Boolean) mo146380s.m129213a()).booleanValue();
            Long l11 = (Long) mo146380s.m129214b();
            if (l11 == null) {
                hVar.m143692z().mo146383v(video.m52911t(), Boolean.valueOf(booleanValue), Long.valueOf(video.m52835B()));
            } else {
                video.m52857N0(l11.longValue());
            }
            video.m52846H0(booleanValue);
        }
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null && (m51425b = m140381e.m51425b()) != null && AbstractC19074t.m100204b(m51425b.m51460w(), Boolean.TRUE) && !video.m52882b0()) {
            if (video.m52895j0()) {
                c25051s0.f120255s.setImageResource(AbstractC23322a.zch_ic_bookmark_feed_solid_yellow_36);
                if (video.m52835B() > 0) {
                    c25051s0.f120242H.setTextSize(0, this.f51019t);
                    c25051s0.f120242H.setText(AbstractC26105g.m134334a(video.m52835B()));
                } else if (video.m52835B() == 0) {
                    c25051s0.f120242H.setTextSize(0, this.f51019t);
                    c25051s0.f120242H.setText("1");
                } else {
                    c25051s0.f120242H.setTextSize(0, this.f51020u);
                    c25051s0.f120242H.setText(AbstractC27413h.zch_item_video_bookmarked);
                }
            } else {
                c25051s0.f120255s.setImageResource(AbstractC23322a.zch_ic_bookmark_feed_solid_36);
                if (video.m52835B() > 0) {
                    c25051s0.f120242H.setTextSize(0, this.f51019t);
                    c25051s0.f120242H.setText(AbstractC26105g.m134334a(video.m52835B()));
                } else {
                    c25051s0.f120242H.setTextSize(0, this.f51020u);
                    c25051s0.f120242H.setText(AbstractC27413h.zch_item_video_bookmark);
                }
            }
            PulseImageView pulseImageView = c25051s0.f120255s;
            AbstractC19074t.m100207e(pulseImageView, "btnBookmark");
            AbstractC26112n.m134431w0(pulseImageView);
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120242H;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtBookmark");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            return;
        }
        PulseImageView pulseImageView2 = c25051s0.f120255s;
        AbstractC19074t.m100207e(pulseImageView2, "btnBookmark");
        AbstractC26112n.m134367H(pulseImageView2);
        SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120242H;
        AbstractC19074t.m100207e(simpleShadowTextView2, "txtBookmark");
        AbstractC26112n.m134367H(simpleShadowTextView2);
    }

    /* renamed from: q */
    public void mo52026q(Video video, List list, String str, C31179n0.d dVar) {
        Object m131207g0;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(list, "payloads");
        AbstractC19074t.m100208f(str, "source");
        Object obj = list.get(0);
        if (AbstractC19074t.m100204b(obj, "PERSONALIZE")) {
            Object obj2 = list.get(1);
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.PersonalizeVideo");
            m52435y(video, (PersonalizeVideo) obj2, dVar);
            return;
        }
        if (AbstractC19074t.m100204b(obj, "UPDATE")) {
            m52421G(video, str, dVar);
            return;
        }
        if (AbstractC19074t.m100204b(obj, "SYNC")) {
            m52420E(video, dVar);
            return;
        }
        if (AbstractC19074t.m100204b(obj, "LIKE")) {
            m52434x(video);
            return;
        }
        if (AbstractC19074t.m100204b(obj, "SHARE")) {
            mo52017A(video);
            return;
        }
        if (AbstractC19074t.m100204b(obj, "FOLLOW")) {
            m131207g0 = AbstractC25332a0.m131207g0(list, 1);
            mo52028v(video, dVar, AbstractC19074t.m100204b(m131207g0, Boolean.TRUE));
            return;
        }
        if (AbstractC19074t.m100204b(obj, "COMMENT")) {
            m52432r(video);
            return;
        }
        if (AbstractC19074t.m100204b(obj, "BOOKMARK")) {
            mo52025p(video);
            return;
        }
        if (AbstractC19074t.m100204b(obj, "SUGGEST_LIKE")) {
            m52417B();
        } else if (AbstractC19074t.m100204b(obj, "SUGGEST_SHARE_CHAT")) {
            m52418C();
        } else if (AbstractC19074t.m100204b(obj, "SUGGEST_SHARE_DIARY")) {
            m52419D();
        }
    }

    /* renamed from: r */
    public void m52432r(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (video.m52863R() == 0 && !video.m52886e0()) {
            PulseImageView pulseImageView = c25051s0.f120257u;
            AbstractC19074t.m100207e(pulseImageView, "btnComment");
            AbstractC26112n.m134431w0(pulseImageView);
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120243I;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtComment");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            if (!video.m52886e0()) {
                c25051s0.f120243I.setText(AbstractC26105g.m134334a(video.m52837C()));
                return;
            } else {
                c25051s0.f120243I.setText("-");
                return;
            }
        }
        PulseImageView pulseImageView2 = c25051s0.f120257u;
        AbstractC19074t.m100207e(pulseImageView2, "btnComment");
        AbstractC26112n.m134367H(pulseImageView2);
        SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120243I;
        AbstractC19074t.m100207e(simpleShadowTextView2, "txtComment");
        AbstractC26112n.m134367H(simpleShadowTextView2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        this.f51005E.removeCallbacksAndMessages(null);
    }

    /* renamed from: s */
    public void m52433s(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (video.m52863R() == 0) {
            PulseImageView pulseImageView = c25051s0.f120262z;
            AbstractC19074t.m100207e(pulseImageView, "btnMore");
            AbstractC26112n.m134431w0(pulseImageView);
            PulseImageView pulseImageView2 = c25051s0.f120258v;
            AbstractC19074t.m100207e(pulseImageView2, "btnDelete");
            AbstractC26112n.m134367H(pulseImageView2);
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120245K;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtDelete");
            AbstractC26112n.m134367H(simpleShadowTextView);
            return;
        }
        PulseImageView pulseImageView3 = c25051s0.f120262z;
        AbstractC19074t.m100207e(pulseImageView3, "btnMore");
        AbstractC26112n.m134367H(pulseImageView3);
        PulseImageView pulseImageView4 = c25051s0.f120258v;
        AbstractC19074t.m100207e(pulseImageView4, "btnDelete");
        AbstractC26112n.m134431w0(pulseImageView4);
        SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120245K;
        AbstractC19074t.m100207e(simpleShadowTextView2, "txtDelete");
        AbstractC26112n.m134431w0(simpleShadowTextView2);
    }

    protected final void setAnimFollowStartTime(long j11) {
        this.f51013M = j11;
    }

    public void setControlAlpha(float f11) {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        View[] viewArr = {c25051s0.f120261y, c25051s0.f120247M, c25051s0.f120257u, c25051s0.f120243I, c25051s0.f120255s, c25051s0.f120242H, c25051s0.f120259w, c25051s0.f120236B, c25051s0.f120249O, c25051s0.f120262z, c25051s0.f120258v, c25051s0.f120245K, c25051s0.f120253q, c25051s0.f120248N, c25051s0.f120260x, c25051s0.f120238D, c25051s0.f120244J, c25051s0.f120237C, c25051s0.f120239E};
        for (int i11 = 0; i11 < 19; i11++) {
            viewArr[i11].setAlpha(1.0f - f11);
        }
    }

    protected final void setControlHandler(Handler handler) {
        AbstractC19074t.m100208f(handler, "<set-?>");
        this.f51007G = handler;
    }

    public void setControlReady(boolean z11) {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        c25051s0.f120235A.setTag(Boolean.valueOf(z11));
    }

    public void setInfoActive(boolean z11) {
        float f11;
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        c25051s0.f120237C.animate().cancel();
        ViewPropertyAnimator animate = c25051s0.f120237C.animate();
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.3f;
        }
        animate.alpha(f11).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.l0

            /* renamed from: q */
            public final /* synthetic */ C25051s0 f51100q;

            public /* synthetic */ C9721l0(C25051s0 c25051s02) {
                r2 = c25051s02;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VideoItem.m52403d0(VideoItem.this, r2, valueAnimator);
            }
        }).setInterpolator(new TimeInterpolator() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.m0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f12) {
                float m52405e0;
                m52405e0 = VideoItem.m52405e0(f12);
                return m52405e0;
            }
        }).setDuration(100L).start();
    }

    public void setInfoExpand(boolean z11) {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        BlinkTextView blinkTextView = c25051s0.f120256t;
        AbstractC19074t.m100207e(blinkTextView, "btnCollapse");
        if (AbstractC26112n.m134380U(blinkTextView) && !z11) {
            c25051s0.f120256t.callOnClick();
        }
    }

    public void setLoadingVisible(boolean z11) {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (z11) {
            ProgressBar progressBar = c25051s0.f120254r;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134431w0(progressBar);
        } else {
            ProgressBar progressBar2 = c25051s0.f120254r;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134367H(progressBar2);
        }
    }

    protected final void setLongTouchReached(boolean z11) {
        this.f51006F = z11;
    }

    public void setPlayPauseState(boolean z11) {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (z11) {
            ImageView imageView = c25051s0.f120235A;
            imageView.animate().cancel();
            imageView.setAlpha(0.0f);
            AbstractC19074t.m100205c(imageView);
            AbstractC26112n.m134367H(imageView);
            ProgressBar progressBar = c25051s0.f120254r;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134423s0(progressBar, 1.0f);
            return;
        }
        ImageView imageView2 = c25051s0.f120235A;
        AbstractC19074t.m100205c(imageView2);
        AbstractC26112n.m134431w0(imageView2);
        imageView2.animate().alpha(1.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.i0
            public /* synthetic */ C9715i0() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VideoItem.m52407f0(C25051s0.this, valueAnimator);
            }
        }).setInterpolator(new TimeInterpolator() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.j0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f11) {
                float m52409g0;
                m52409g0 = VideoItem.m52409g0(f11);
                return m52409g0;
            }
        }).setDuration(100L).start();
    }

    public void setThumbnailVisible(boolean z11) {
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (z11) {
            View view = c25051s0.f120250P;
            AbstractC19074t.m100207e(view, "vieBackground");
            AbstractC26112n.m134431w0(view);
            RecyclingImageView recyclingImageView = c25051s0.f120240F;
            AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
            AbstractC26112n.m134431w0(recyclingImageView);
            return;
        }
        View view2 = c25051s0.f120250P;
        AbstractC19074t.m100207e(view2, "vieBackground");
        AbstractC26112n.m134367H(view2);
        RecyclingImageView recyclingImageView2 = c25051s0.f120240F;
        AbstractC19074t.m100207e(recyclingImageView2, "rivThumbnail");
        AbstractC26112n.m134367H(recyclingImageView2);
    }

    protected final void setTouchTimestamp(long j11) {
        this.f51009I = j11;
    }

    protected final void setVideoLayoutor(C3226p c3226p) {
        AbstractC19074t.m100208f(c3226p, "<set-?>");
        this.f51010J = c3226p;
    }

    /* renamed from: u */
    public void mo52027u(Video video, String str) {
        ChannelConfig m140381e;
        CoreConfig m51425b;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        C25051s0 c25051s0 = this.f51014N;
        String str2 = null;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (AbstractC19074t.m100204b(str, "SOURCE_FOR_U")) {
            C27417l c27417l = C27417l.f129055a;
            Channel m140377a = c27417l.m140377a();
            if (m140377a != null) {
                str2 = m140377a.m50769l();
            }
            if (!AbstractC19074t.m100204b(str2, video.m52887f().m50769l()) && (m140381e = c27417l.m140381e()) != null && (m51425b = m140381e.m51425b()) != null && AbstractC19074t.m100204b(m51425b.m51461x(), Boolean.TRUE)) {
                PulseImageView pulseImageView = c25051s0.f120259w;
                AbstractC19074t.m100207e(pulseImageView, "btnDislike");
                AbstractC26112n.m134431w0(pulseImageView);
                return;
            }
        }
        PulseImageView pulseImageView2 = c25051s0.f120259w;
        AbstractC19074t.m100207e(pulseImageView2, "btnDislike");
        AbstractC26112n.m134367H(pulseImageView2);
    }

    /* renamed from: v */
    public void mo52028v(Video video, C31179n0.d dVar, boolean z11) {
        AbstractC19074t.m100208f(video, "video");
        Boolean mo146377p = AbstractC28684a.Companion.m143692z().mo146377p(video.m52887f().m50769l());
        if (mo146377p != null) {
            video.m52887f().m50770l0(mo146377p.booleanValue());
        }
        C25051s0 c25051s0 = this.f51014N;
        String str = null;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        String m50769l = video.m52887f().m50769l();
        Channel m140377a = C27417l.f129055a.m140377a();
        if (m140377a != null) {
            str = m140377a.m50769l();
        }
        if (AbstractC19074t.m100204b(m50769l, str)) {
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120260x;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
            AbstractC26112n.m134367H(simpleShadowTextView);
            return;
        }
        if (video.m52887f().m50741Q()) {
            SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120260x;
            AbstractC19074t.m100207e(simpleShadowTextView2, "btnFollow");
            AbstractC26112n.m134367H(simpleShadowTextView2);
            return;
        }
        if (dVar != null && dVar.m151889b()) {
            c25051s0.f120260x.setBackgroundResource(AbstractC27408c.zch_bg_button_video_follow_accent);
            if (z11) {
                this.f51013M = System.currentTimeMillis();
                invalidate();
            }
        } else {
            c25051s0.f120260x.setBackgroundResource(AbstractC27408c.zch_bg_button_video_follow);
        }
        SimpleShadowTextView simpleShadowTextView3 = c25051s0.f120260x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnFollow");
        AbstractC26112n.m134431w0(simpleShadowTextView3);
    }

    /* renamed from: x */
    public void m52434x(Video video) {
        AbstractC19074t.m100208f(video, "video");
        AbstractC28684a.h hVar = AbstractC28684a.Companion;
        C24860q mo146379r = hVar.m143692z().mo146379r(video.m52911t());
        if (mo146379r != null) {
            boolean booleanValue = ((Boolean) mo146379r.m129213a()).booleanValue();
            Long l11 = (Long) mo146379r.m129214b();
            if (l11 == null) {
                hVar.m143692z().mo146382u(video.m52911t(), Boolean.valueOf(booleanValue), Long.valueOf(video.m52839D()));
            } else {
                video.m52860P0(l11.longValue());
            }
            video.m52852K0(booleanValue);
        }
        C25051s0 c25051s0 = this.f51014N;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (C27417l.f129055a.m140378b().m51242o() && video.m52863R() == 0 && !video.m52889g0()) {
            if (video.m52909q0()) {
                c25051s0.f120261y.setImageResource(AbstractC23322a.zch_ic_heart_shadow_solid_red_36);
                c25051s0.f120247M.setText(AbstractC26105g.m134334a(video.m52839D()));
                c25051s0.f120261y.setTag(Boolean.valueOf(video.m52909q0()));
            } else {
                c25051s0.f120261y.setImageResource(AbstractC23322a.zch_ic_heart_shadow_solid_36);
                c25051s0.f120247M.setText(AbstractC26105g.m134334a(video.m52839D()));
                c25051s0.f120261y.setTag(Boolean.valueOf(video.m52909q0()));
            }
            PulseImageView pulseImageView = c25051s0.f120261y;
            AbstractC19074t.m100207e(pulseImageView, "btnLike");
            AbstractC26112n.m134431w0(pulseImageView);
            SimpleShadowTextView simpleShadowTextView = c25051s0.f120247M;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtLike");
            AbstractC26112n.m134431w0(simpleShadowTextView);
            return;
        }
        PulseImageView pulseImageView2 = c25051s0.f120261y;
        AbstractC19074t.m100207e(pulseImageView2, "btnLike");
        AbstractC26112n.m134367H(pulseImageView2);
        SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120247M;
        AbstractC19074t.m100207e(simpleShadowTextView2, "txtLike");
        AbstractC26112n.m134367H(simpleShadowTextView2);
    }

    /* renamed from: y */
    public void m52435y(Video video, PersonalizeVideo personalizeVideo, C31179n0.d dVar) {
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(personalizeVideo, "personalizeVideo");
        boolean m52909q0 = video.m52909q0();
        boolean m50741Q = video.m52887f().m50741Q();
        boolean m52895j0 = video.m52895j0();
        video.m52838C0(personalizeVideo);
        if (video.m52909q0() != m52909q0) {
            m52434x(video);
        }
        if (video.m52887f().m50741Q() != m50741Q) {
            m52416w(this, video, dVar, false, 4, null);
        }
        if (video.m52895j0() != m52895j0) {
            mo52025p(video);
        }
    }

    /* renamed from: z */
    public void m52436z(Video video, String str) {
        int i11;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        C25051s0 c25051s0 = this.f51014N;
        String str2 = null;
        if (c25051s0 == null) {
            AbstractC19074t.m100223u("binding");
            c25051s0 = null;
        }
        if (AbstractC19074t.m100204b(str, "SOURCE_CHANNEL")) {
            String m50769l = video.m52887f().m50769l();
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                str2 = m140377a.m50769l();
            }
            if (AbstractC19074t.m100204b(m50769l, str2)) {
                if (video.m52888g() > 0) {
                    SimpleShadowTextView simpleShadowTextView = c25051s0.f120244J;
                    AbstractC19074t.m100207e(simpleShadowTextView, "txtCreatedTime");
                    if (video.m52914u0()) {
                        i11 = AbstractC23322a.zch_ic_globe_line_16;
                    } else {
                        i11 = AbstractC23322a.zch_ic_lock_line_16;
                    }
                    AbstractC26112n.m134399g0(simpleShadowTextView, i11);
                    c25051s0.f120244J.setText(" •  " + AbstractC26105g.m134343j(video.m52888g(), getContext()));
                    SimpleShadowTextView simpleShadowTextView2 = c25051s0.f120244J;
                    AbstractC19074t.m100207e(simpleShadowTextView2, "txtCreatedTime");
                    AbstractC26112n.m134431w0(simpleShadowTextView2);
                    return;
                }
                SimpleShadowTextView simpleShadowTextView3 = c25051s0.f120244J;
                AbstractC19074t.m100207e(simpleShadowTextView3, "txtCreatedTime");
                AbstractC26112n.m134367H(simpleShadowTextView3);
                return;
            }
        }
        SimpleShadowTextView simpleShadowTextView4 = c25051s0.f120244J;
        AbstractC19074t.m100207e(simpleShadowTextView4, "txtCreatedTime");
        AbstractC26112n.m134367H(simpleShadowTextView4);
    }
}
