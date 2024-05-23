package com.zing.zalo.calls.ringbacktone.presentation;

import ag0.C0815e1;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8012e0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.calls.ringbacktone.presentation.C7459d;
import com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import dg0.AbstractC17927b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import me.C22991a;
import me.C22995e;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import p205hc.C19965d;
import p361nb.C23648e;
import p389oe.C24237d;
import p389oe.C24238e;
import p389oe.C24239f;
import p389oe.C24240g;
import p389oe.InterfaceC24234a;
import p389oe.InterfaceC24235b;
import p542ub.InterfaceC27218a;
import p649xl.C29947nb;
import p716zh.C31944h6;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import vg.AbstractC28025b8;
import vg.C28212v6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes3.dex */
public final class SettingRingBackToneView extends SlidableZaloView implements InterfaceC24235b {
    public static final C7440a Companion = new C7440a(null);

    /* renamed from: Q0 */
    private C29947nb f40396Q0;

    /* renamed from: R0 */
    private C22991a f40397R0;

    /* renamed from: S0 */
    private MediaPlayer f40398S0;

    /* renamed from: T0 */
    private int f40399T0;

    /* renamed from: U0 */
    private boolean f40400U0;

    /* renamed from: P0 */
    private final InterfaceC24854k f40395P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C7459d.class), new C7450k(new C7449j(this)), C7455p.f40422q);

    /* renamed from: V0 */
    private Runnable f40401V0 = new Runnable() { // from class: me.c
        @Override // java.lang.Runnable
        public final void run() {
            SettingRingBackToneView.m37688LM(SettingRingBackToneView.this);
        }
    };

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$a */
    /* loaded from: classes3.dex */
    public static final class C7440a {
        private C7440a() {
        }

        public /* synthetic */ C7440a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7441b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40402a;

        static {
            int[] iArr = new int[C7459d.c.values().length];
            try {
                iArr[C7459d.c.f40437p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C7459d.c.f40438q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C7459d.c.f40439r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C7459d.c.f40440s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40402a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$c */
    /* loaded from: classes3.dex */
    public static final class C7442c extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18505l f40403p;

        /* renamed from: q */
        final /* synthetic */ SettingRingBackToneView f40404q;

        C7442c(InterfaceC18505l interfaceC18505l, SettingRingBackToneView settingRingBackToneView) {
            this.f40403p = interfaceC18505l;
            this.f40404q = settingRingBackToneView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            this.f40403p.mo205i9(view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(this.f40404q.getContext(), AbstractC2807a.link_01));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$d */
    /* loaded from: classes3.dex */
    public static final class C7443d extends AbstractC19075u implements InterfaceC18505l {
        C7443d() {
            super(1);
        }

        /* renamed from: a */
        public final void m37714a(View view) {
            AbstractC19074t.m100208f(view, "it");
            C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 0, "call_rbt_banner_link", "2"), false);
            SettingRingBackToneView.this.m37678Bt("https://zalo.me/1303375907760748249");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37714a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$e */
    /* loaded from: classes3.dex */
    public static final class C7444e extends AbstractC19075u implements InterfaceC18505l {
        C7444e() {
            super(1);
        }

        /* renamed from: a */
        public final void m37715a(View view) {
            AbstractC19074t.m100208f(view, "it");
            C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 0, "call_rbt_banner_link", "1"), false);
            SettingRingBackToneView.this.m37686JM("https://melody.zapps.vn/?utm_source=zalo&utm_medium=notice&utm_campaign=closed");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37715a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$f */
    /* loaded from: classes3.dex */
    public static final class C7445f extends RecyclerView.AbstractC1887n {
        C7445f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            rect.set(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(4.0f));
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$g */
    /* loaded from: classes3.dex */
    public static final class C7446g extends RecyclerView.AbstractC1892s {
        C7446g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "view");
            if (i11 == 0) {
                C29947nb c29947nb = null;
                if (SettingRingBackToneView.this.f40400U0) {
                    C29947nb c29947nb2 = SettingRingBackToneView.this.f40396Q0;
                    if (c29947nb2 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29947nb2 = null;
                    }
                    if (!c29947nb2.f138805v.canScrollVertically(1)) {
                        SettingRingBackToneView.this.m37685IM("1");
                        return;
                    }
                    C29947nb c29947nb3 = SettingRingBackToneView.this.f40396Q0;
                    if (c29947nb3 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29947nb = c29947nb3;
                    }
                    if (!c29947nb.f138805v.canScrollVertically(-1)) {
                        SettingRingBackToneView.this.m37685IM("0");
                        return;
                    } else {
                        SettingRingBackToneView.this.m37685IM("2");
                        return;
                    }
                }
                C29947nb c29947nb4 = SettingRingBackToneView.this.f40396Q0;
                if (c29947nb4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb4 = null;
                }
                if (!c29947nb4.f138805v.canScrollVertically(1)) {
                    C29947nb c29947nb5 = SettingRingBackToneView.this.f40396Q0;
                    if (c29947nb5 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29947nb = c29947nb5;
                    }
                    if (!c29947nb.f138805v.canScrollVertically(-1)) {
                        return;
                    }
                }
                SettingRingBackToneView.this.f40400U0 = true;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$h */
    /* loaded from: classes3.dex */
    public static final class C7447h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f40408t;

        /* renamed from: u */
        final /* synthetic */ boolean f40409u;

        /* renamed from: v */
        final /* synthetic */ SettingRingBackToneView f40410v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7447h(boolean z11, SettingRingBackToneView settingRingBackToneView, Continuation continuation) {
            super(2, continuation);
            this.f40409u = z11;
            this.f40410v = settingRingBackToneView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public static final void m37718u(SettingRingBackToneView settingRingBackToneView, MediaPlayer mediaPlayer) {
            ((CommonZaloview) settingRingBackToneView).f72827B0.removeCallbacks(settingRingBackToneView.f40401V0);
            settingRingBackToneView.m37680DM().m37766p0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static final boolean m37719v(MediaPlayer mediaPlayer, int i11, int i12) {
            C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 0, "call_preview_rbt", "2"), false);
            return false;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C7447h(this.f40409u, this.f40410v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            MediaPlayer mediaPlayer;
            MediaPlayer mediaPlayer2;
            AbstractC28298d.m142578e();
            if (this.f40408t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    if (this.f40409u) {
                        MediaPlayer mediaPlayer3 = this.f40410v.f40398S0;
                        if (mediaPlayer3 != null && mediaPlayer3.isPlaying() && (mediaPlayer2 = this.f40410v.f40398S0) != null) {
                            mediaPlayer2.stop();
                        }
                        MediaPlayer mediaPlayer4 = this.f40410v.f40398S0;
                        if (mediaPlayer4 != null) {
                            mediaPlayer4.release();
                        }
                        SettingRingBackToneView settingRingBackToneView = this.f40410v;
                        settingRingBackToneView.f40398S0 = MediaPlayer.create(settingRingBackToneView.m92689tK(), AbstractC8012e0.zalo_new_ringback);
                        MediaPlayer mediaPlayer5 = this.f40410v.f40398S0;
                        if (mediaPlayer5 != null) {
                            final SettingRingBackToneView settingRingBackToneView2 = this.f40410v;
                            mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zing.zalo.calls.ringbacktone.presentation.a
                                @Override // android.media.MediaPlayer.OnCompletionListener
                                public final void onCompletion(MediaPlayer mediaPlayer6) {
                                    SettingRingBackToneView.C7447h.m37718u(SettingRingBackToneView.this, mediaPlayer6);
                                }
                            });
                        }
                        MediaPlayer mediaPlayer6 = this.f40410v.f40398S0;
                        if (mediaPlayer6 != null) {
                            mediaPlayer6.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.zing.zalo.calls.ringbacktone.presentation.b
                                @Override // android.media.MediaPlayer.OnErrorListener
                                public final boolean onError(MediaPlayer mediaPlayer7, int i11, int i12) {
                                    boolean m37719v;
                                    m37719v = SettingRingBackToneView.C7447h.m37719v(mediaPlayer7, i11, i12);
                                    return m37719v;
                                }
                            });
                        }
                        MediaPlayer mediaPlayer7 = this.f40410v.f40398S0;
                        if (mediaPlayer7 != null) {
                            mediaPlayer7.start();
                        }
                        this.f40410v.f40399T0 = 0;
                        this.f40410v.m37689MM();
                    } else {
                        MediaPlayer mediaPlayer8 = this.f40410v.f40398S0;
                        if (mediaPlayer8 != null && mediaPlayer8.isPlaying() && (mediaPlayer = this.f40410v.f40398S0) != null) {
                            mediaPlayer.stop();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C7447h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$i */
    /* loaded from: classes3.dex */
    public static final class C7448i implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f40411p;

        C7448i(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f40411p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f40411p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f40411p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$j */
    /* loaded from: classes3.dex */
    public static final class C7449j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f40412q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7449j(ZaloView zaloView) {
            super(0);
            this.f40412q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f40412q;
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$k */
    /* loaded from: classes3.dex */
    public static final class C7450k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f40413q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7450k(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f40413q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f40413q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$l */
    /* loaded from: classes3.dex */
    public static final class C7451l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f40414t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$l$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f40416t;

            /* renamed from: u */
            final /* synthetic */ SettingRingBackToneView f40417u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32703a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ SettingRingBackToneView f40418p;

                C32703a(SettingRingBackToneView settingRingBackToneView) {
                    this.f40418p = settingRingBackToneView;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C7459d.b bVar, Continuation continuation) {
                    long j11;
                    if (bVar.m37773a() instanceof C7459d.c) {
                        if (bVar.m37775c() instanceof Long) {
                            j11 = ((Number) bVar.m37775c()).longValue();
                        } else {
                            j11 = 0;
                        }
                        this.f40418p.m37691OM((C7459d.c) bVar.m37773a(), j11);
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SettingRingBackToneView settingRingBackToneView, Continuation continuation) {
                super(2, continuation);
                this.f40417u = settingRingBackToneView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f40417u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f40416t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    StateFlow m37761f0 = this.f40417u.m37680DM().m37761f0();
                    C32703a c32703a = new C32703a(this.f40417u);
                    this.f40416t = 1;
                    if (m37761f0.mo97893a(c32703a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C7451l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C7451l(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f40414t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = SettingRingBackToneView.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(SettingRingBackToneView.this, null);
                this.f40414t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C7451l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$m */
    /* loaded from: classes3.dex */
    public static final class C7452m extends AbstractC19075u implements InterfaceC18505l {
        C7452m() {
            super(1);
        }

        /* renamed from: a */
        public final void m37726a(List list) {
            C22991a c22991a = SettingRingBackToneView.this.f40397R0;
            if (c22991a == null) {
                AbstractC19074t.m100223u("adapter");
                c22991a = null;
            }
            c22991a.m10635O(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37726a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$n */
    /* loaded from: classes3.dex */
    public static final class C7453n extends AbstractC19075u implements InterfaceC18505l {
        C7453n() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m37728c(SettingRingBackToneView settingRingBackToneView, C7459d.b bVar) {
            AbstractC19074t.m100208f(settingRingBackToneView, "this$0");
            AbstractC19074t.m100208f(bVar, "$it");
            settingRingBackToneView.f40400U0 = false;
            C29947nb c29947nb = settingRingBackToneView.f40396Q0;
            if (c29947nb == null) {
                AbstractC19074t.m100223u("binding");
                c29947nb = null;
            }
            c29947nb.f138805v.mo9854S1(((Number) bVar.m37773a()).intValue());
        }

        /* renamed from: b */
        public final void m37729b(final C7459d.b bVar) {
            AbstractC19074t.m100208f(bVar, "it");
            String m37774b = bVar.m37774b();
            switch (m37774b.hashCode()) {
                case -106320479:
                    if (m37774b.equals("LIST_RBT_SCROLL_TO_ITEM") && (bVar.m37773a() instanceof Integer)) {
                        C29947nb c29947nb = SettingRingBackToneView.this.f40396Q0;
                        if (c29947nb == null) {
                            AbstractC19074t.m100223u("binding");
                            c29947nb = null;
                        }
                        RecyclerView recyclerView = c29947nb.f138805v;
                        final SettingRingBackToneView settingRingBackToneView = SettingRingBackToneView.this;
                        recyclerView.postDelayed(new Runnable() { // from class: com.zing.zalo.calls.ringbacktone.presentation.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingRingBackToneView.C7453n.m37728c(SettingRingBackToneView.this, bVar);
                            }
                        }, 100L);
                        return;
                    }
                    return;
                case 1253385642:
                    if (m37774b.equals("play_default_zalo_ring_back")) {
                        SettingRingBackToneView.this.m37687KM(true);
                        return;
                    }
                    return;
                case 1678319900:
                    if (m37774b.equals("stop_default_zalo_ring_back")) {
                        SettingRingBackToneView.this.m37687KM(false);
                        return;
                    }
                    return;
                case 2030144942:
                    if (m37774b.equals("open_zing_mp3")) {
                        AbstractC28025b8.m141442M("tip.setting.call.add_rbt");
                        SettingRingBackToneView.this.m37686JM("https://melody.zapps.vn/");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37729b((C7459d.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$o */
    /* loaded from: classes3.dex */
    public static final class C7454o extends AbstractC19075u implements InterfaceC18505l {
        C7454o() {
            super(1);
        }

        /* renamed from: a */
        public final void m37730a(String str) {
            AbstractC19074t.m100208f(str, "it");
            SettingRingBackToneView.this.mo78936E(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m37730a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.SettingRingBackToneView$p */
    /* loaded from: classes3.dex */
    static final class C7455p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C7455p f40422q = new C7455p();

        C7455p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C22995e();
        }
    }

    /* renamed from: AM */
    private final ClickableSpan m37676AM(InterfaceC18505l interfaceC18505l) {
        return new C7442c(interfaceC18505l, this);
    }

    /* renamed from: BM */
    private final Spannable m37677BM() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (m92652XI(AbstractC8020f0.str_call_rbt_warning_preparing_title) + " "));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 17);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (m92652XI(AbstractC8020f0.str_call_rbt_warning_follow_oa) + " "));
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m92652XI(AbstractC8020f0.str_call_rbt_zalo_melody_OA));
        spannableStringBuilder.setSpan(m37676AM(new C7443d()), length3, spannableStringBuilder.length(), 17);
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        AbstractC19074t.m100207e(valueOf, "valueOf(this)");
        return valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bt */
    public final void m37678Bt(String str) {
        InterfaceC27218a m92692wK = this.f72421L0.m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        C31944h6.m153527L(m92692wK, str, 0, "", 0, 16, null);
    }

    /* renamed from: CM */
    private final Spannable m37679CM(long j11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (m92652XI(AbstractC8020f0.str_call_rbt_warning_preparing_title) + " "));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 17);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (m92652XI(AbstractC8020f0.str_call_rbt_warning_valid_until) + " "));
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        int length3 = spannableStringBuilder.length();
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        int length4 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (AbstractC23160o0.m119201K(j11) + ". "));
        spannableStringBuilder.setSpan(foregroundColorSpan3, length4, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new StyleSpan(1), length3, spannableStringBuilder.length(), 17);
        int length5 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m92652XI(AbstractC8020f0.str_call_rbt_warning_view_details));
        spannableStringBuilder.setSpan(m37676AM(new C7444e()), length5, spannableStringBuilder.length(), 17);
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        AbstractC19074t.m100207e(valueOf, "valueOf(this)");
        return valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final C7459d m37680DM() {
        return (C7459d) this.f40395P0.getValue();
    }

    /* renamed from: EM */
    private final void m37681EM() {
        C29947nb c29947nb = this.f40396Q0;
        C22991a c22991a = null;
        if (c29947nb == null) {
            AbstractC19074t.m100223u("binding");
            c29947nb = null;
        }
        RecyclerView recyclerView = c29947nb.f138805v;
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(getContext());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        recyclerView.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        C29947nb c29947nb2 = this.f40396Q0;
        if (c29947nb2 == null) {
            AbstractC19074t.m100223u("binding");
            c29947nb2 = null;
        }
        c29947nb2.f138805v.setScrollbarFadingEnabled(false);
        C29947nb c29947nb3 = this.f40396Q0;
        if (c29947nb3 == null) {
            AbstractC19074t.m100223u("binding");
            c29947nb3 = null;
        }
        c29947nb3.f138805v.m9816A(new C7445f());
        C29947nb c29947nb4 = this.f40396Q0;
        if (c29947nb4 == null) {
            AbstractC19074t.m100223u("binding");
            c29947nb4 = null;
        }
        c29947nb4.f138805v.m9826E(new C7446g());
        C22991a c22991a2 = new C22991a();
        c22991a2.m117793S(this);
        c22991a2.m9999J(true);
        this.f40397R0 = c22991a2;
        C29947nb c29947nb5 = this.f40396Q0;
        if (c29947nb5 == null) {
            AbstractC19074t.m100223u("binding");
            c29947nb5 = null;
        }
        c29947nb5.f138805v.setItemAnimator(null);
        C29947nb c29947nb6 = this.f40396Q0;
        if (c29947nb6 == null) {
            AbstractC19074t.m100223u("binding");
            c29947nb6 = null;
        }
        RecyclerView recyclerView2 = c29947nb6.f138805v;
        C22991a c22991a3 = this.f40397R0;
        if (c22991a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c22991a = c22991a3;
        }
        recyclerView2.setAdapter(c22991a);
    }

    /* renamed from: FM */
    private final View m37682FM(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C29947nb m148290c = C29947nb.m148290c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148290c, "inflate(...)");
        this.f40396Q0 = m148290c;
        C29947nb c29947nb = null;
        if (m148290c == null) {
            AbstractC19074t.m100223u("binding");
            m148290c = null;
        }
        m148290c.f138803t.setOnClickListener(new View.OnClickListener() { // from class: me.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRingBackToneView.m37683GM(SettingRingBackToneView.this, view);
            }
        });
        m37681EM();
        C29947nb c29947nb2 = this.f40396Q0;
        if (c29947nb2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29947nb = c29947nb2;
        }
        LinearLayout root = c29947nb.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m37683GM(final SettingRingBackToneView settingRingBackToneView, View view) {
        AbstractC19074t.m100208f(settingRingBackToneView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94530d("DEBOUNCE_PREVIEW_RING_BACK_TONE", new Runnable() { // from class: me.d
            @Override // java.lang.Runnable
            public final void run() {
                SettingRingBackToneView.m37684HM(SettingRingBackToneView.this);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m37684HM(SettingRingBackToneView settingRingBackToneView) {
        AbstractC19074t.m100208f(settingRingBackToneView, "this$0");
        settingRingBackToneView.m37680DM().m37767q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public final void m37685IM(String str) {
        String str2;
        C0815e1 m2075D = C0815e1.m2075D();
        String[] strArr = new String[2];
        strArr[0] = str;
        List list = (List) m37680DM().m37762g0().mo9215f();
        if (list != null) {
            str2 = Integer.valueOf(list.size() - 1).toString();
        } else {
            str2 = null;
        }
        strArr[1] = str2;
        m2075D.m2100V(new C23648e(45, "setting_call_rbt", 1, "call_rbt_scroll", strArr), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final void m37686JM(String str) {
        ZaloWebView.Companion.m87168C(this.f72421L0.m92676n2(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public final Job m37687KM(boolean z11) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), Dispatchers.m112680b(), null, new C7447h(z11, this, null), 2, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m37688LM(SettingRingBackToneView settingRingBackToneView) {
        AbstractC19074t.m100208f(settingRingBackToneView, "this$0");
        settingRingBackToneView.m37689MM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public final void m37689MM() {
        this.f72827B0.postDelayed(this.f40401V0, 190L);
        m37680DM().m37768r0(this.f40399T0);
        this.f40399T0 += 4;
    }

    /* renamed from: NM */
    private final void m37690NM() {
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C7451l(null), 3, null);
        m37680DM().m37762g0().m9219j(this, new C7448i(new C7452m()));
        m37680DM().m37760e0().m9219j(this, new C19965d(new C7453n()));
        m37680DM().m37763h0().m9219j(this, new C19965d(new C7454o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public final void m37691OM(C7459d.c cVar, long j11) {
        int i11 = C7441b.f40402a[cVar.ordinal()];
        C29947nb c29947nb = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        C29947nb c29947nb2 = this.f40396Q0;
                        if (c29947nb2 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29947nb2 = null;
                        }
                        c29947nb2.f138804u.setVisibility(0);
                        C29947nb c29947nb3 = this.f40396Q0;
                        if (c29947nb3 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29947nb3 = null;
                        }
                        c29947nb3.f138803t.setVisibility(0);
                        C29947nb c29947nb4 = this.f40396Q0;
                        if (c29947nb4 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29947nb4 = null;
                        }
                        c29947nb4.f138800q.setVisibility(0);
                        C29947nb c29947nb5 = this.f40396Q0;
                        if (c29947nb5 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c29947nb = c29947nb5;
                        }
                        c29947nb.f138802s.setText(m92652XI(AbstractC8020f0.str_call_rbt_warning_general));
                        return;
                    }
                    return;
                }
                C29947nb c29947nb6 = this.f40396Q0;
                if (c29947nb6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb6 = null;
                }
                c29947nb6.f138804u.setVisibility(0);
                C29947nb c29947nb7 = this.f40396Q0;
                if (c29947nb7 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb7 = null;
                }
                c29947nb7.f138803t.setVisibility(8);
                C29947nb c29947nb8 = this.f40396Q0;
                if (c29947nb8 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb8 = null;
                }
                c29947nb8.f138800q.setVisibility(8);
                C29947nb c29947nb9 = this.f40396Q0;
                if (c29947nb9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb9 = null;
                }
                c29947nb9.f138802s.setText(m37677BM());
                C29947nb c29947nb10 = this.f40396Q0;
                if (c29947nb10 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29947nb = c29947nb10;
                }
                c29947nb.f138802s.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            if (j11 > 0) {
                C29947nb c29947nb11 = this.f40396Q0;
                if (c29947nb11 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb11 = null;
                }
                c29947nb11.f138804u.setVisibility(0);
                C29947nb c29947nb12 = this.f40396Q0;
                if (c29947nb12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb12 = null;
                }
                c29947nb12.f138803t.setVisibility(8);
                C29947nb c29947nb13 = this.f40396Q0;
                if (c29947nb13 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb13 = null;
                }
                c29947nb13.f138800q.setVisibility(8);
                C29947nb c29947nb14 = this.f40396Q0;
                if (c29947nb14 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29947nb14 = null;
                }
                c29947nb14.f138802s.setText(m37679CM(j11));
                C29947nb c29947nb15 = this.f40396Q0;
                if (c29947nb15 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29947nb = c29947nb15;
                }
                c29947nb.f138802s.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            return;
        }
        C29947nb c29947nb16 = this.f40396Q0;
        if (c29947nb16 == null) {
            AbstractC19074t.m100223u("binding");
            c29947nb16 = null;
        }
        c29947nb16.f138804u.setVisibility(8);
        C29947nb c29947nb17 = this.f40396Q0;
        if (c29947nb17 == null) {
            AbstractC19074t.m100223u("binding");
            c29947nb17 = null;
        }
        c29947nb17.f138803t.setVisibility(0);
        C29947nb c29947nb18 = this.f40396Q0;
        if (c29947nb18 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29947nb = c29947nb18;
        }
        c29947nb.f138800q.setVisibility(0);
    }

    /* renamed from: zM */
    private final void m37711zM(String str) {
        boolean z11;
        C28212v6 m141453i = AbstractC28025b8.m141453i(str);
        int i11 = 0;
        if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC19074t.m100204b(str, "tip.setting.call.add_rbt")) {
            C29947nb c29947nb = this.f40396Q0;
            if (c29947nb == null) {
                AbstractC19074t.m100223u("binding");
                c29947nb = null;
            }
            Badge badge = c29947nb.f138801r;
            if (!z11) {
                i11 = 8;
            }
            badge.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        return m37682FM(layoutInflater, viewGroup);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m37680DM().m37759c0();
        m37711zM("tip.setting.call.add_rbt");
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m37680DM().m37770t0();
        MediaPlayer mediaPlayer = this.f40398S0;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    @Override // p389oe.InterfaceC24236c
    /* renamed from: Wy */
    public void mo37713Wy(InterfaceC24234a interfaceC24234a) {
        AbstractC19074t.m100208f(interfaceC24234a, "event");
        if (interfaceC24234a instanceof C24238e) {
            m37680DM().m37765o0(((C24238e) interfaceC24234a).m126541a());
            return;
        }
        if (interfaceC24234a instanceof C24237d) {
            m37680DM().m37764n0(((C24237d) interfaceC24234a).m126540a());
        } else if (interfaceC24234a instanceof C24239f) {
            m37680DM().m37769s0();
        } else if (interfaceC24234a instanceof C24240g) {
            m37680DM().m37771w0(((C24240g) interfaceC24234a).m126542a());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m37690NM();
        C0815e1.m2075D().m2100V(new C23648e(45, "setting_call", 1, "call_setting_rbt_view", "1"), false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingRingBackToneView";
    }
}
