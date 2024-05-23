package com.zing.zalo.feed.components.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import bi0.AbstractC2808b;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.video.FeedVideoSpeakerView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.ClippedFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import is.C20832y0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class FeedVideoSpeakerView extends FrameLayout {

    /* renamed from: A */
    private final Handler f45811A;

    /* renamed from: p */
    private final InterfaceC24854k f45812p;

    /* renamed from: q */
    private final InterfaceC24854k f45813q;

    /* renamed from: r */
    private final InterfaceC24854k f45814r;

    /* renamed from: s */
    private boolean f45815s;

    /* renamed from: t */
    private InterfaceC8412a f45816t;

    /* renamed from: u */
    private EnumC8413b f45817u;

    /* renamed from: v */
    private int f45818v;

    /* renamed from: w */
    private int f45819w;

    /* renamed from: x */
    private final String f45820x;

    /* renamed from: y */
    private final long f45821y;

    /* renamed from: z */
    private final Runnable f45822z;

    /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8412a {
        /* renamed from: a */
        void mo44382a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$b */
    /* loaded from: classes4.dex */
    public static final class EnumC8413b {

        /* renamed from: p */
        public static final EnumC8413b f45823p = new EnumC8413b("MUTE", 0);

        /* renamed from: q */
        public static final EnumC8413b f45824q = new EnumC8413b("UN_MUTE", 1);

        /* renamed from: r */
        public static final EnumC8413b f45825r = new EnumC8413b("NO_SOUND", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC8413b[] f45826s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f45827t;

        static {
            EnumC8413b[] m44959b = m44959b();
            f45826s = m44959b;
            f45827t = AbstractC30166b.m148796a(m44959b);
        }

        private EnumC8413b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8413b[] m44959b() {
            return new EnumC8413b[]{f45823p, f45824q, f45825r};
        }

        public static EnumC8413b valueOf(String str) {
            return (EnumC8413b) Enum.valueOf(EnumC8413b.class, str);
        }

        public static EnumC8413b[] values() {
            return (EnumC8413b[]) f45826s.clone();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8414c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45828a;

        static {
            int[] iArr = new int[EnumC8413b.values().length];
            try {
                iArr[EnumC8413b.f45825r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8413b.f45823p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8413b.f45824q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45828a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$d */
    /* loaded from: classes4.dex */
    public static final class HandlerC8415d extends Handler {

        /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ FeedVideoSpeakerView f45830p;

            a(FeedVideoSpeakerView feedVideoSpeakerView) {
                this.f45830p = feedVideoSpeakerView;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                super.onAnimationEnd(animator);
                AbstractC23136l9.m118744r1(this.f45830p.getTextVideoHasNoSound(), 8);
                this.f45830p.f45815s = false;
            }
        }

        HandlerC8415d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            if (message.what == 1000) {
                FeedVideoSpeakerView.this.getLayoutExpanding().m75642e(new a(FeedVideoSpeakerView.this));
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$e */
    /* loaded from: classes4.dex */
    static final class C8416e extends AbstractC19075u implements InterfaceC18494a {
        C8416e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClippedFrameLayout mo12V4() {
            return (ClippedFrameLayout) FeedVideoSpeakerView.this.findViewById(AbstractC6918a0.layout_btn_speaker);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$f */
    /* loaded from: classes4.dex */
    public static final class C8417f extends AnimatorListenerAdapter {
        C8417f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationStart(animator);
            AbstractC23136l9.m118744r1(FeedVideoSpeakerView.this.getTextVideoHasNoSound(), 0);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$g */
    /* loaded from: classes4.dex */
    static final class C8418g extends AbstractC19075u implements InterfaceC18494a {
        C8418g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclingImageView mo12V4() {
            return (RecyclingImageView) FeedVideoSpeakerView.this.findViewById(AbstractC6918a0.btnSpeakerVideo);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.video.FeedVideoSpeakerView$h */
    /* loaded from: classes4.dex */
    static final class C8419h extends AbstractC19075u implements InterfaceC18494a {
        C8419h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) FeedVideoSpeakerView.this.findViewById(AbstractC6918a0.tvVideoHasNoSound);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedVideoSpeakerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        View.inflate(context, AbstractC7409c0.feed_video_speaker_layout, this);
        m129210a = AbstractC24856m.m129210a(new C8416e());
        this.f45812p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8419h());
        this.f45813q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8418g());
        this.f45814r = m129210a3;
        this.f45817u = EnumC8413b.f45823p;
        this.f45818v = 8;
        this.f45819w = 8;
        this.f45820x = "FeedVideoSpeakerView";
        this.f45821y = 500L;
        this.f45822z = new Runnable() { // from class: vn.c
            @Override // java.lang.Runnable
            public final void run() {
                FeedVideoSpeakerView.m44948j(FeedVideoSpeakerView.this);
            }
        };
        this.f45811A = new HandlerC8415d(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClippedFrameLayout getLayoutExpanding() {
        Object value = this.f45812p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ClippedFrameLayout) value;
    }

    private final RecyclingImageView getSpeakerImageView() {
        Object value = this.f45814r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RecyclingImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RobotoTextView getTextVideoHasNoSound() {
        Object value = this.f45813q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m44948j(FeedVideoSpeakerView feedVideoSpeakerView) {
        AbstractC19074t.m100208f(feedVideoSpeakerView, "this$0");
        if (feedVideoSpeakerView.f45819w == 8) {
            feedVideoSpeakerView.f45818v = 8;
            AbstractC23136l9.m118744r1(feedVideoSpeakerView, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m44949l(FeedVideoSpeakerView feedVideoSpeakerView) {
        AbstractC19074t.m100208f(feedVideoSpeakerView, "this$0");
        CharSequence text = feedVideoSpeakerView.getTextVideoHasNoSound().getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        float textSize = feedVideoSpeakerView.getTextVideoHasNoSound().getTextSize();
        Context context = feedVideoSpeakerView.getTextVideoHasNoSound().getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        feedVideoSpeakerView.getLayoutExpanding().setMaxWidth(((int) new C20832y0.a(text, textSize, C13718q1.m76694c(context, 7)).m108884f()) + AbstractC23222t7.f112528I + AbstractC23222t7.f112586t);
        AbstractC23136l9.m118744r1(feedVideoSpeakerView.getTextVideoHasNoSound(), 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m44950m(FeedVideoSpeakerView feedVideoSpeakerView, View view) {
        AbstractC19074t.m100208f(feedVideoSpeakerView, "this$0");
        if (feedVideoSpeakerView.f45817u == EnumC8413b.f45825r) {
            feedVideoSpeakerView.m44951q();
            return;
        }
        InterfaceC8412a interfaceC8412a = feedVideoSpeakerView.f45816t;
        if (interfaceC8412a != null) {
            interfaceC8412a.mo44382a();
        }
    }

    /* renamed from: q */
    private final void m44951q() {
        if (this.f45817u == EnumC8413b.f45825r && !this.f45815s) {
            this.f45815s = true;
            getLayoutExpanding().m75640b();
            getLayoutExpanding().post(new Runnable() { // from class: vn.d
                @Override // java.lang.Runnable
                public final void run() {
                    FeedVideoSpeakerView.m44952r(FeedVideoSpeakerView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m44952r(FeedVideoSpeakerView feedVideoSpeakerView) {
        AbstractC19074t.m100208f(feedVideoSpeakerView, "this$0");
        feedVideoSpeakerView.getLayoutExpanding().m75641d(new C8417f());
        feedVideoSpeakerView.f45811A.sendEmptyMessageDelayed(1000, 4000L);
    }

    public final EnumC8413b getViewState() {
        return this.f45817u;
    }

    /* renamed from: h */
    public final void m44953h(EnumC8413b enumC8413b) {
        AbstractC19074t.m100208f(enumC8413b, "state");
        if (enumC8413b == this.f45817u) {
            return;
        }
        int i11 = C8414c.f45828a[enumC8413b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    RecyclingImageView speakerImageView = getSpeakerImageView();
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    speakerImageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_speaker_solid_24, AbstractC2808b.wht_a100));
                }
            } else {
                RecyclingImageView speakerImageView2 = getSpeakerImageView();
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                speakerImageView2.setImageDrawable(C27280g.m139659b(context2, AbstractC23322a.zds_ic_off_speaker_solid_24, AbstractC2808b.wht_a100));
            }
        } else {
            RecyclingImageView speakerImageView3 = getSpeakerImageView();
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            speakerImageView3.setImageDrawable(C27280g.m139659b(context3, AbstractC23322a.zds_ic_sound_off_solid_24, AbstractC2808b.wht_a60));
        }
        this.f45817u = enumC8413b;
    }

    /* renamed from: i */
    public final void m44954i() {
        this.f45819w = 8;
        if (this.f45818v != 8) {
            AbstractC19444a.m101696d(this.f45822z);
            AbstractC19444a.m101694b(this.f45822z, this.f45821y);
        }
    }

    /* renamed from: k */
    public final void m44955k() {
        getLayoutExpanding().setClippedWidth(AbstractC23222t7.f112528I);
        getLayoutExpanding().post(new Runnable() { // from class: vn.a
            @Override // java.lang.Runnable
            public final void run() {
                FeedVideoSpeakerView.m44949l(FeedVideoSpeakerView.this);
            }
        });
        getSpeakerImageView().setOnClickListener(new View.OnClickListener() { // from class: vn.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedVideoSpeakerView.m44950m(FeedVideoSpeakerView.this, view);
            }
        });
        this.f45818v = getVisibility();
    }

    /* renamed from: n */
    public final boolean m44956n() {
        return this.f45819w == 0;
    }

    /* renamed from: p */
    public final void m44957p() {
        getLayoutExpanding().m75640b();
        this.f45815s = false;
        AbstractC23136l9.m118744r1(getTextVideoHasNoSound(), 0);
        this.f45818v = getVisibility();
        this.f45811A.removeMessages(1000);
    }

    /* renamed from: s */
    public final void m44958s() {
        this.f45819w = 0;
        if (this.f45818v != 0) {
            AbstractC19444a.m101696d(this.f45822z);
            AbstractC23136l9.m118744r1(this, 0);
            this.f45818v = 0;
        }
    }

    public final void setSpeakViewCallback(InterfaceC8412a interfaceC8412a) {
        AbstractC19074t.m100208f(interfaceC8412a, "callback");
        this.f45816t = interfaceC8412a;
    }
}
