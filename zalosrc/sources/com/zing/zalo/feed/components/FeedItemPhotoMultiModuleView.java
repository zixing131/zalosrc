package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import ao.InterfaceC2259a;
import ao.InterfaceC2260b;
import au.C2370r0;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.InterfaceC2946a1;
import bo.InterfaceC2992j2;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.uicontrols.C8874e;
import com.zing.zalo.feed.uicontrols.C8880k;
import com.zing.zalo.feed.uicontrols.C8883n;
import com.zing.zalo.feed.uicontrols.C8884o;
import com.zing.zalo.feed.uicontrols.FeedGridView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.animation.AnimationTarget;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gq.C19581d;
import gq.C19587j;
import ho0.AbstractC20110a;
import i40.C20275e;
import i40.InterfaceC20272b;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import is.C20801j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p107dq.C18045a;
import p107dq.C18046b;
import p107dq.C18047c;
import p107dq.C18048d;
import p107dq.C18049e;
import p107dq.C18054j;
import p139eq.C18565a;
import p175g0.AbstractC19181d;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p489rn.C25897n0;
import p615wn.C29106b;
import p716zh.C31995kc;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class FeedItemPhotoMultiModuleView extends FeedItemMusicModuleView implements InterfaceC20272b {
    public static final C8111a Companion = new C8111a(null);

    /* renamed from: A0 */
    private C18049e f44593A0;

    /* renamed from: B0 */
    private C3979l.b f44594B0;

    /* renamed from: C0 */
    private InterfaceC8112b f44595C0;

    /* renamed from: l0 */
    private final InterfaceC24854k f44596l0;

    /* renamed from: m0 */
    private final InterfaceC24854k f44597m0;

    /* renamed from: n0 */
    private final InterfaceC24854k f44598n0;

    /* renamed from: o0 */
    private final InterfaceC24854k f44599o0;

    /* renamed from: p0 */
    private final InterfaceC24854k f44600p0;

    /* renamed from: q0 */
    private final InterfaceC24854k f44601q0;

    /* renamed from: r0 */
    private final InterfaceC24854k f44602r0;

    /* renamed from: s0 */
    private FeedGridView.InterfaceC8858a f44603s0;

    /* renamed from: t0 */
    private InterfaceC2260b f44604t0;

    /* renamed from: u0 */
    private C25897n0.c f44605u0;

    /* renamed from: v0 */
    private List f44606v0;

    /* renamed from: w0 */
    private ArrayList f44607w0;

    /* renamed from: x0 */
    private Map f44608x0;

    /* renamed from: y0 */
    private SparseIntArray f44609y0;

    /* renamed from: z0 */
    private C16719g f44610z0;

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$a */
    /* loaded from: classes4.dex */
    public static final class C8111a {
        private C8111a() {
        }

        public /* synthetic */ C8111a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m43987a(int i11, long j11, long j12, long j13, C3979l.a aVar) {
            AbstractC19074t.m100208f(aVar, "imageFormat");
            switch (i11) {
                case 2:
                    if (aVar == C3979l.a.JPEG) {
                        AbstractC20887g.m109247y(16874, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16875, 0L, 0L, j13);
                        return;
                    } else {
                        AbstractC20887g.m109247y(16894, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16895, 0L, 0L, j13);
                        return;
                    }
                case 3:
                    if (aVar == C3979l.a.JPEG) {
                        AbstractC20887g.m109247y(16876, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16877, 0L, 0L, j13);
                        return;
                    } else {
                        AbstractC20887g.m109247y(16896, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16897, 0L, 0L, j13);
                        return;
                    }
                case 4:
                    if (aVar == C3979l.a.JPEG) {
                        AbstractC20887g.m109247y(16878, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16879, 0L, 0L, j13);
                        return;
                    } else {
                        AbstractC20887g.m109247y(16898, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16899, 0L, 0L, j13);
                        return;
                    }
                case 5:
                    if (aVar == C3979l.a.JPEG) {
                        AbstractC20887g.m109247y(16880, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16881, 0L, 0L, j13);
                        return;
                    } else {
                        AbstractC20887g.m109247y(16900, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16901, 0L, 0L, j13);
                        return;
                    }
                case 6:
                    if (aVar == C3979l.a.JPEG) {
                        AbstractC20887g.m109247y(16882, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16883, 0L, 0L, j13);
                        return;
                    } else {
                        AbstractC20887g.m109247y(16902, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16903, 0L, 0L, j13);
                        return;
                    }
                case 7:
                    if (aVar == C3979l.a.JPEG) {
                        AbstractC20887g.m109247y(16884, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16885, 0L, 0L, j13);
                        return;
                    } else {
                        AbstractC20887g.m109247y(16904, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16905, 0L, 0L, j13);
                        return;
                    }
                case 8:
                    if (aVar == C3979l.a.JPEG) {
                        AbstractC20887g.m109247y(16886, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16887, 0L, 0L, j13);
                        return;
                    } else {
                        AbstractC20887g.m109247y(16906, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16907, 0L, 0L, j13);
                        return;
                    }
                case 9:
                    if (aVar == C3979l.a.JPEG) {
                        AbstractC20887g.m109247y(16888, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16889, 0L, 0L, j13);
                        return;
                    } else {
                        AbstractC20887g.m109247y(16908, j11, j12, j12 - j11);
                        AbstractC20887g.m109247y(16909, 0L, 0L, j13);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8112b {
        /* renamed from: D0 */
        void mo43988D0(int i11, int i12);

        /* renamed from: V3 */
        int mo43989V3();

        /* renamed from: Y1 */
        int mo43990Y1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$c */
    /* loaded from: classes4.dex */
    public static final class C8113c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8113c f44611q = new C8113c();

        C8113c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18565a mo12V4() {
            return (C18565a) C18565a.Companion.m122672a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$d */
    /* loaded from: classes4.dex */
    public static final class C8114d extends AbstractC19075u implements InterfaceC18494a {
        C8114d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C8874e mo12V4() {
            return new C8874e(FeedItemPhotoMultiModuleView.this.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$e */
    /* loaded from: classes4.dex */
    public static final class C8115e extends AbstractC19075u implements InterfaceC18494a {
        C8115e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C8880k mo12V4() {
            return new C8880k(FeedItemPhotoMultiModuleView.this.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$f */
    /* loaded from: classes4.dex */
    public static final class C8116f extends AbstractC19075u implements InterfaceC18494a {
        C8116f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C8883n mo12V4() {
            return new C8883n(FeedItemPhotoMultiModuleView.this.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$g */
    /* loaded from: classes4.dex */
    public static final class C8117g extends AbstractC19075u implements InterfaceC18494a {
        C8117g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16716d mo12V4() {
            return new C16716d(FeedItemPhotoMultiModuleView.this.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$h */
    /* loaded from: classes4.dex */
    public static final class C8118h extends AbstractC19075u implements InterfaceC18494a {
        C8118h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16716d mo12V4() {
            return new C16716d(FeedItemPhotoMultiModuleView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$i */
    /* loaded from: classes4.dex */
    public static final class C8119i extends AbstractC19075u implements InterfaceC18505l {
        C8119i() {
            super(1);
        }

        /* renamed from: a */
        public final void m43997a(Drawable drawable) {
            FeedItemPhotoMultiModuleView.this.getPhotoContainer().m89085A0(drawable);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m43997a((Drawable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$j */
    /* loaded from: classes4.dex */
    public static final class C8120j extends AbstractC19075u implements InterfaceC18505l {
        C8120j() {
            super(1);
        }

        /* renamed from: a */
        public final void m43998a(Drawable drawable) {
            AbstractC19074t.m100208f(drawable, "blankDrawable");
            FeedItemPhotoMultiModuleView.this.getPhotoContainer().m89085A0(drawable);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m43998a((Drawable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$k */
    /* loaded from: classes4.dex */
    public static final class C8121k extends AbstractC19075u implements InterfaceC18505l {
        C8121k() {
            super(1);
        }

        /* renamed from: a */
        public final void m43999a(Drawable drawable) {
            FeedItemPhotoMultiModuleView.this.getPhotoContainer().m89085A0(drawable);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m43999a((Drawable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$l */
    /* loaded from: classes4.dex */
    public static final class C8122l extends AbstractC19075u implements InterfaceC18505l {
        C8122l() {
            super(1);
        }

        /* renamed from: a */
        public final void m44000a(Drawable drawable) {
            AbstractC19074t.m100208f(drawable, "blankDrawable");
            FeedItemPhotoMultiModuleView.this.getPhotoContainer().m89085A0(drawable);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m44000a((Drawable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$m */
    /* loaded from: classes4.dex */
    public static final class C8123m extends AbstractC19075u implements InterfaceC18505l {
        C8123m() {
            super(1);
        }

        /* renamed from: a */
        public final void m44001a(Drawable drawable) {
            FeedItemPhotoMultiModuleView.this.getPhotoContainer().m89085A0(drawable);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m44001a((Drawable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$n */
    /* loaded from: classes4.dex */
    public static final class C8124n implements C8880k.f {

        /* renamed from: b */
        final /* synthetic */ int f44623b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f44624c;

        /* renamed from: d */
        final /* synthetic */ C3020p0 f44625d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC2259a f44626e;

        /* renamed from: f */
        final /* synthetic */ C3000l0 f44627f;

        /* renamed from: g */
        final /* synthetic */ int f44628g;

        /* renamed from: h */
        final /* synthetic */ int f44629h;

        /* renamed from: i */
        final /* synthetic */ TrackingSource f44630i;

        C8124n(int i11, ArrayList arrayList, C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, int i12, int i13, TrackingSource trackingSource) {
            this.f44623b = i11;
            this.f44624c = arrayList;
            this.f44625d = c3020p0;
            this.f44626e = interfaceC2259a;
            this.f44627f = c3000l0;
            this.f44628g = i12;
            this.f44629h = i13;
            this.f44630i = trackingSource;
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: a */
        public void mo43488a(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11) {
            AbstractC19074t.m100208f(animationTarget, "animationTarget");
            AbstractC19074t.m100208f(itemAlbumMobile, "photo");
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: b */
        public void mo43489b(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11) {
            AbstractC19074t.m100208f(animationTarget, "animationTarget");
            AbstractC19074t.m100208f(itemAlbumMobile, "photo");
            try {
                if (AbstractC20826v0.m108824n0(FeedItemPhotoMultiModuleView.this.f44322M)) {
                    if (i11 == this.f44623b - 1) {
                        if (this.f44624c.size() <= this.f44623b) {
                            if (this.f44625d.f12023C.f12124o > 0) {
                            }
                        }
                        InterfaceC2259a interfaceC2259a = this.f44626e;
                        if (interfaceC2259a != null) {
                            interfaceC2259a.mo11936Tt(null, this.f44627f, this.f44628g, true, new Bundle());
                            return;
                        }
                        return;
                    }
                }
                FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView = FeedItemPhotoMultiModuleView.this;
                feedItemPhotoMultiModuleView.m43985p1(this.f44624c, itemAlbumMobile, animationTarget, f11, feedItemPhotoMultiModuleView, this.f44629h, this.f44625d, i11, i11, i11, this.f44630i, this.f44626e);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: c */
        public void mo43490c(int i11) {
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: d */
        public void mo43491d(ItemAlbumMobile itemAlbumMobile, int i11) {
            InterfaceC2260b mPhotoLongClickListener;
            AbstractC19074t.m100208f(itemAlbumMobile, "photo");
            try {
                FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView = FeedItemPhotoMultiModuleView.this;
                if (feedItemPhotoMultiModuleView.f44322M != 4 && (mPhotoLongClickListener = feedItemPhotoMultiModuleView.getMPhotoLongClickListener()) != null) {
                    mPhotoLongClickListener.mo11977a(this.f44625d, i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$o */
    /* loaded from: classes4.dex */
    public static final class C8125o extends AbstractC19075u implements InterfaceC18494a {
        C8125o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16716d mo12V4() {
            return new C16716d(FeedItemPhotoMultiModuleView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView$p */
    /* loaded from: classes4.dex */
    public static final class C8126p extends C20275e {
        C8126p() {
        }

        @Override // i40.C20275e
        /* renamed from: d */
        public View mo43942d(int i11) {
            if (FeedItemPhotoMultiModuleView.this.mo43986q(i11) != null) {
                return FeedItemPhotoMultiModuleView.this;
            }
            return null;
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    public FeedItemPhotoMultiModuleView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        m129210a = AbstractC24856m.m129210a(new C8116f());
        this.f44596l0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8114d());
        this.f44597m0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8115e());
        this.f44598n0 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C8118h());
        this.f44599o0 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C8125o());
        this.f44600p0 = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(C8113c.f44611q);
        this.f44601q0 = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C8117g());
        this.f44602r0 = m129210a7;
        this.f44606v0 = new ArrayList();
        this.f44607w0 = new ArrayList();
        this.f44608x0 = new HashMap();
        this.f44609y0 = new SparseIntArray();
        this.f44610z0 = new C16719g(getContext());
        this.f44594B0 = C3979l.b.UNKNOWN;
    }

    /* renamed from: H0 */
    private final int m43951H0(C3000l0 c3000l0, int i11) {
        int i12;
        int m118725l0;
        int m118742r;
        C3020p0 m14324b0;
        C3025q0 c3025q0;
        C18049e c18049e;
        if (c3000l0 != null && (m14324b0 = c3000l0.m14324b0(i11)) != null && (c3025q0 = m14324b0.f12023C) != null && (c18049e = c3025q0.f12127r) != null) {
            i12 = c18049e.m95929b();
        } else {
            i12 = 0;
        }
        int i13 = this.f44322M;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 4) {
                    if (i13 != 11) {
                        return 0;
                    }
                    return AbstractC23136l9.m118725l0(this.f84675p) - (AbstractC23136l9.m118742r(36.0f) * 2);
                }
            } else {
                int m108536d = C20801j.m108536d(c3000l0);
                if (i12 == 0) {
                    return m108536d;
                }
                return m108536d - (AbstractC23136l9.m118742r(C19587j.f97307a.m102530f(i12).mo102458a()) * 2);
            }
        }
        if (getFeedMusicData() != null) {
            int mo102459b = C19587j.f97307a.m102530f(i12).mo102459b();
            m118725l0 = AbstractC23136l9.m118725l0(this.f84675p);
            m118742r = AbstractC23136l9.m118742r(mo102459b);
        } else {
            int mo102458a = C19587j.f97307a.m102530f(i12).mo102458a();
            m118725l0 = AbstractC23136l9.m118725l0(this.f84675p);
            m118742r = AbstractC23136l9.m118742r(mo102458a);
        }
        return m118725l0 - (m118742r * 2);
    }

    /* renamed from: I0 */
    private final void m43952I0() {
        try {
            this.f44607w0.clear();
            this.f44608x0.clear();
            for (C3000l0 c3000l0 : this.f44606v0) {
                if (c3000l0.m14322a0() != null) {
                    if (c3000l0.m14322a0().f12058q != 2 && c3000l0.m14322a0().f12058q != 3) {
                    }
                    if (c3000l0.m14322a0().f12023C.f12118i != null) {
                        AbstractC19074t.m100207e(c3000l0.m14322a0().f12023C.f12118i, "listPhotos");
                        if (!r2.isEmpty()) {
                            this.f44607w0.addAll(c3000l0.m14322a0().f12023C.f12118i);
                            Iterator it = c3000l0.m14322a0().f12023C.f12118i.iterator();
                            while (it.hasNext()) {
                                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
                                Map map = this.f44608x0;
                                String str = itemAlbumMobile.f42595r;
                                AbstractC19074t.m100207e(str, "picid");
                                C3020p0 m14322a0 = c3000l0.m14322a0();
                                AbstractC19074t.m100207e(m14322a0, "getFeed(...)");
                                map.put(str, m14322a0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J0 */
    private final void m43953J0() {
        getFeedGridDynamicModule().m89106L().m89060k0(-2).m89030N(-2).m89026J(true);
        getFeedGridDynamicModule().f47459a1 = this;
        mo69681L(getFeedGridDynamicModule());
        getFeedGridModule().m89106L().m89060k0(-2).m89030N(-2).m89026J(true);
        getFeedGridModule().mo44614b1(8);
        getFeedGridModule().f47506g1 = this;
        mo69681L(getFeedGridModule());
        this.f44610z0 = getFeedGridDynamicModule();
    }

    /* renamed from: K0 */
    private final void m43954K0() {
        getFeedGridDynamicModule().mo44614b1(8);
        getFeedGridModule().mo44614b1(8);
        getFeedCollapsedGridModule().m89106L().m89028L(-1, -2);
        getFeedCollapsedGridModule().f47415W0 = this;
        this.f44610z0 = getFeedCollapsedGridModule();
    }

    /* renamed from: L0 */
    private final void m43955L0(int i11) {
        m43704i0(getContext(), i11);
        m43953J0();
    }

    /* renamed from: M0 */
    private final void m43956M0(Context context, int i11) {
        m43704i0(context, i11);
        m43953J0();
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        getFeedGridModule().m89106L().m89034R(m118742r).m89035S(m118742r).m89023G(this.f44326Q);
        getFeedGridDynamicModule().m89106L().m89034R(m118742r).m89035S(m118742r).m89023G(this.f44326Q);
    }

    /* renamed from: N0 */
    private final void m43957N0(int i11) {
        if (i11 != 0) {
            if (i11 != 6) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        m43964U0();
                        return;
                    }
                    return;
                }
                m43965V0();
                return;
            }
            m43963T0();
            return;
        }
        m43966W0();
    }

    /* renamed from: O0 */
    private final void m43958O0() {
        m43706k0();
        m43701f0();
        m43954K0();
        getFeedCollapsedGridModule().m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile_item));
        mo69681L(getFeedCollapsedGridModule());
    }

    /* renamed from: P0 */
    private final void m43959P0(Context context) {
        m43704i0(context, this.f44322M);
        m43954K0();
        mo69681L(getFeedCollapsedGridModule());
        getFeedCollapsedGridModule().m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right)).m89033Q(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_top)).m89023G(this.f44326Q);
        this.f44326Q.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
    }

    /* renamed from: Q0 */
    private final void m43960Q0() {
        setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC17466e.white));
        m43953J0();
    }

    /* renamed from: R0 */
    private final void m43961R0() {
        m43702g0();
        m43704i0(getContext(), this.f44322M);
        m43953J0();
        m43703h0(this.f44322M);
        this.f44326Q.f45790f1.m44802G1(FeedItemBaseModuleView.f44318d0);
        C16718f m89023G = getPhotoContainer().m89106L().m89028L(-1, -2).m89023G(this.f44326Q);
        Boolean bool = Boolean.TRUE;
        m89023G.m89073z(bool).m89017A(bool);
        mo69681L(getPhotoContainer());
        m88985S(getFeedGridDynamicModule());
        m88985S(getFeedGridModule());
        getPhotoContainer().m89001g1(getFeedGridDynamicModule());
        getPhotoContainer().m89001g1(getFeedGridModule());
    }

    /* renamed from: S0 */
    private final void m43962S0() {
        m43967X0();
        m43968Y0();
    }

    /* renamed from: T0 */
    private final void m43963T0() {
        getFeedItemSongInfoModule().m44568F1(this.f44322M);
        int i11 = getFeedCollapsedGridModule().m89106L().f84720p;
        getFeedItemSongInfoModule().m89106L().m89028L(-1, -2).m89023G(getFeedCollapsedGridModule()).m89033Q(AbstractC23136l9.m118742r(4.0f)).m89034R(i11).m89035S(getFeedCollapsedGridModule().m89106L().f84722r);
        mo69681L(getFeedItemSongInfoModule());
    }

    /* renamed from: U0 */
    private final void m43964U0() {
        m43962S0();
    }

    /* renamed from: V0 */
    private final void m43965V0() {
        getFeedItemSongInfoModule().m44568F1(this.f44322M);
        getFeedItemSongInfoModule().m89106L().m89028L(-1, -2).m89023G(this.f44610z0).m89034R(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_left_profile_item)).m89035S(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_right_profile_item)).m89036T(AbstractC23136l9.m118742r(12.0f)).m89033Q(AbstractC23136l9.m118742r(8.0f));
        mo69681L(getFeedItemSongInfoModule());
    }

    /* renamed from: W0 */
    private final void m43966W0() {
        m43962S0();
    }

    /* renamed from: X0 */
    private final void m43967X0() {
        C16718f m89023G = getPhotoContainer().m89106L().m89028L(-1, -2).m89023G(this.f44326Q);
        Boolean bool = Boolean.TRUE;
        m89023G.m89073z(bool).m89017A(bool);
        mo69681L(getPhotoContainer());
        getOverlayModule().m89106L().m89028L(-1, -2).m89018B(bool).m89072y(bool).m89073z(bool).m89017A(bool);
        getOverlayModule().mo44614b1(8);
        getPhotoContainer().m89001g1(getOverlayModule());
        m88985S(getFeedGridDynamicModule());
        m88985S(getFeedGridModule());
        getPhotoContainer().m89001g1(getFeedGridDynamicModule());
        getPhotoContainer().m89001g1(getFeedGridModule());
        getFeedItemMusicLyric().m44970q1(this.f44322M);
        getFeedItemMusicLyric().m89106L().m89028L(-1, AbstractC23136l9.m118736p(AbstractC16802y.box_lyric_height)).m89023G(this.f44610z0).m89034R(AbstractC23136l9.m118742r(12.0f)).m89035S(AbstractC23136l9.m118742r(12.0f));
        getFeedItemMusicLyric().mo44614b1(8);
        getPhotoContainer().m89001g1(getFeedItemMusicLyric());
    }

    /* renamed from: Y0 */
    private final void m43968Y0() {
        getSongContainer().m89106L().m89028L(-1, -2).m89023G(getFeedItemMusicLyric());
        getPhotoContainer().m89001g1(getSongContainer());
        getFeedItemSongInfoModule().m44568F1(this.f44322M);
        getFeedItemSongInfoModule().m89106L().m89028L(-1, -2).m89034R(AbstractC23136l9.m118742r(24.0f)).m89035S(AbstractC23136l9.m118742r(24.0f)).m89036T(AbstractC23136l9.m118742r(16.0f)).m89033Q(AbstractC23136l9.m118742r(16.0f));
        getFeedItemSongInfoModule().mo44614b1(8);
        getFeedItemSongInfoModule().m44569I1();
        getSongContainer().m89001g1(getFeedItemSongInfoModule());
    }

    /* renamed from: Z0 */
    private final boolean m43969Z0() {
        int i11 = this.f44322M;
        return i11 == 0 || i11 == 1 || i11 == 4 || i11 == 11;
    }

    /* renamed from: a1 */
    private final void m43970a1(int i11) {
        float mo102463f;
        int mo102458a;
        if (getFeedMusicData() != null) {
            C19587j c19587j = C19587j.f97307a;
            mo102463f = c19587j.m102530f(i11).mo102460c();
            mo102458a = c19587j.m102530f(i11).mo102459b();
        } else {
            C19587j c19587j2 = C19587j.f97307a;
            mo102463f = c19587j2.m102530f(i11).mo102463f();
            mo102458a = c19587j2.m102530f(i11).mo102458a();
        }
        float f11 = mo102458a;
        getFeedGridDynamicModule().m89106L().m89034R(AbstractC23136l9.m118742r(f11));
        getFeedGridDynamicModule().m89106L().m89035S(AbstractC23136l9.m118742r(f11));
        getFeedGridDynamicModule().m89106L().m89036T(AbstractC23136l9.m118742r(mo102463f));
        if ((getFeedItemMusicLyric().m89136d0() == 0 || getFeedItemSongInfoModule().m89136d0() == 0) && i11 != 3) {
            getFeedGridDynamicModule().m89106L().m89033Q(AbstractC23136l9.m118742r(0.0f));
        } else {
            getFeedGridDynamicModule().m89106L().m89033Q(AbstractC23136l9.m118742r(mo102463f));
        }
        getFeedGridModule().m89106L().m89034R(AbstractC23136l9.m118742r(f11));
        getFeedGridModule().m89106L().m89035S(AbstractC23136l9.m118742r(f11));
        getFeedGridModule().m89106L().m89036T(AbstractC23136l9.m118742r(mo102463f));
        if ((getFeedItemMusicLyric().m89136d0() == 0 || getFeedItemSongInfoModule().m89136d0() == 0) && i11 != 3) {
            getFeedGridModule().m89106L().m89033Q(AbstractC23136l9.m118742r(0.0f));
        } else {
            getFeedGridModule().m89106L().m89033Q(AbstractC23136l9.m118742r(mo102463f));
        }
    }

    /* renamed from: b1 */
    private final void m43971b1(C3020p0 c3020p0) {
        InterfaceC2992j2 mo14161e;
        InterfaceC2946a1 feedMusicData;
        InterfaceC2992j2 mo14161e2;
        LyricRender mo14189c;
        if (c3020p0.f12023C.f12127r.m95929b() != 0) {
            getFeedItemMusicLyric().mo44614b1(8);
            return;
        }
        if (getFeedMusicData() != null) {
            InterfaceC2946a1 feedMusicData2 = getFeedMusicData();
            if (feedMusicData2 != null && (mo14161e = feedMusicData2.mo14161e()) != null && mo14161e.mo14188a() && (feedMusicData = getFeedMusicData()) != null && (mo14161e2 = feedMusicData.mo14161e()) != null && (mo14189c = mo14161e2.mo14189c()) != null && !mo14189c.m45711h()) {
                getFeedItemMusicLyric().mo44614b1(0);
                return;
            } else {
                getFeedItemMusicLyric().mo44614b1(8);
                return;
            }
        }
        getFeedItemMusicLyric().mo44614b1(8);
    }

    /* renamed from: c1 */
    private final void m43972c1(C3020p0 c3020p0) {
        Integer num;
        C18049e c18049e;
        C18045a m95928a;
        C18054j m95914b;
        String m95947a;
        C18049e c18049e2;
        C18045a m95928a2;
        C18054j m95914b2;
        C18049e c18049e3 = this.f44593A0;
        if (c18049e3 != null) {
            num = Integer.valueOf(c18049e3.m95929b());
        } else {
            num = null;
        }
        if ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 1))) {
            if (getModules().contains(getSongContainer())) {
                m88985S(getSongContainer());
                getFeedItemSongInfoModule().m89106L().m89036T(AbstractC23136l9.m118742r(16.0f));
                getSongContainer().m89106L().m89028L(-1, -2).m89023G(getFeedItemMusicLyric());
                getPhotoContainer().m89001g1(getSongContainer());
            }
            getSongContainer().mo89161z0(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
            return;
        }
        if (num != null && num.intValue() == 3) {
            if (getPhotoContainer().getModules().contains(getSongContainer())) {
                getPhotoContainer().m89006m1(getSongContainer());
                getFeedItemSongInfoModule().m89106L().m89036T(AbstractC23136l9.m118742r(0.0f));
                getSongContainer().m89106L().m89028L(-1, -2).m89023G(getPhotoContainer());
                mo69681L(getSongContainer());
            }
            String str = "";
            if (!C23212s8.m119603k() ? !((c18049e = c3020p0.f12023C.f12127r) == null || (m95928a = c18049e.m95928a()) == null || (m95914b = m95928a.m95914b()) == null || (m95947a = m95914b.m95947a()) == null) : !((c18049e2 = c3020p0.f12023C.f12127r) == null || (m95928a2 = c18049e2.m95928a()) == null || (m95914b2 = m95928a2.m95914b()) == null || (m95947a = m95914b2.m95948b()) == null)) {
                str = m95947a;
            }
            getSongContainer().mo89161z0(C19581d.f97279a.m102499v(str));
        }
    }

    /* renamed from: d1 */
    private final void m43973d1(C3020p0 c3020p0) {
        Integer num;
        C18049e c18049e;
        C18045a m95928a;
        C18054j m95914b;
        String m95947a;
        ArrayList arrayList;
        C18049e c18049e2;
        C18045a m95928a2;
        C18054j m95914b2;
        int i11;
        C18045a m95928a3;
        C18047c m95913a;
        C18048d m95922a;
        C18046b m95925a;
        C18045a m95928a4;
        C18047c m95913a2;
        C18048d m95922a2;
        C18046b m95926b;
        C18045a m95928a5;
        C18047c m95913a3;
        C18048d m95922a3;
        C18046b m95925a2;
        C18045a m95928a6;
        C18047c m95913a4;
        C18048d m95922a4;
        C18046b m95926b2;
        Object m131207g0;
        if (c3020p0 != null) {
            C18049e c18049e3 = c3020p0.f12023C.f12127r;
            if (c18049e3 != null) {
                num = Integer.valueOf(c18049e3.m95929b());
            } else {
                num = null;
            }
            int i12 = 0;
            if (num != null && num.intValue() == 0) {
                if (getFeedMusicData() != null) {
                    getOverlayModule().mo44614b1(0);
                    C16716d overlayModule = getOverlayModule();
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    overlayModule.m89085A0(C27280g.m139658a(context, AbstractC16803z.bg_music_feed_item_overlay));
                    ArrayList arrayList2 = c3020p0.f12023C.f12118i;
                    if (arrayList2 != null) {
                        AbstractC19074t.m100205c(arrayList2);
                        m131207g0 = AbstractC25332a0.m131207g0(arrayList2, 0);
                        ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) m131207g0;
                        if (itemAlbumMobile != null) {
                            C18565a backgroundFeedPhotoHelper = getBackgroundFeedPhotoHelper();
                            Context context2 = getContext();
                            AbstractC19074t.m100207e(context2, "getContext(...)");
                            String str = itemAlbumMobile.f42548C;
                            AbstractC19074t.m100207e(str, "thumbnail");
                            C18045a m95928a7 = c3020p0.f12023C.f12127r.m95928a();
                            if (m95928a7 != null) {
                                i12 = m95928a7.m95915c();
                            }
                            backgroundFeedPhotoHelper.m98028e(context2, str, i12, new C8119i());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C18565a backgroundFeedPhotoHelper2 = getBackgroundFeedPhotoHelper();
                Context context3 = getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                backgroundFeedPhotoHelper2.m98029h(context3, new C8120j());
                return;
            }
            if (num != null && num.intValue() == 1) {
                if (C23212s8.m119603k()) {
                    C18049e c18049e4 = c3020p0.f12023C.f12127r;
                    if (c18049e4 != null && (m95928a6 = c18049e4.m95928a()) != null && (m95913a4 = m95928a6.m95913a()) != null && (m95922a4 = m95913a4.m95922a()) != null && (m95926b2 = m95922a4.m95926b()) != null) {
                        i11 = m95926b2.m95920b();
                    } else {
                        i11 = 0;
                    }
                    C18049e c18049e5 = c3020p0.f12023C.f12127r;
                    if (c18049e5 != null && (m95928a5 = c18049e5.m95928a()) != null && (m95913a3 = m95928a5.m95913a()) != null && (m95922a3 = m95913a3.m95922a()) != null && (m95925a2 = m95922a3.m95925a()) != null) {
                        i12 = m95925a2.m95920b();
                    }
                } else {
                    C18049e c18049e6 = c3020p0.f12023C.f12127r;
                    if (c18049e6 != null && (m95928a4 = c18049e6.m95928a()) != null && (m95913a2 = m95928a4.m95913a()) != null && (m95922a2 = m95913a2.m95922a()) != null && (m95926b = m95922a2.m95926b()) != null) {
                        i11 = m95926b.m95919a();
                    } else {
                        i11 = 0;
                    }
                    C18049e c18049e7 = c3020p0.f12023C.f12127r;
                    if (c18049e7 != null && (m95928a3 = c18049e7.m95928a()) != null && (m95913a = m95928a3.m95913a()) != null && (m95922a = m95913a.m95922a()) != null && (m95925a = m95922a.m95925a()) != null) {
                        i12 = m95925a.m95919a();
                    }
                }
                getOverlayModule().mo44614b1(8);
                getBackgroundFeedPhotoHelper().m98027d(i11, i12, new C8121k());
                return;
            }
            if (num != null && num.intValue() == 2) {
                getOverlayModule().mo44614b1(8);
                C18565a backgroundFeedPhotoHelper3 = getBackgroundFeedPhotoHelper();
                Context context4 = getContext();
                AbstractC19074t.m100207e(context4, "getContext(...)");
                backgroundFeedPhotoHelper3.m98029h(context4, new C8122l());
                return;
            }
            if (num != null && num.intValue() == 3) {
                getOverlayModule().mo44614b1(8);
                String str2 = "";
                if (!C23212s8.m119603k() ? !((c18049e = c3020p0.f12023C.f12127r) == null || (m95928a = c18049e.m95928a()) == null || (m95914b = m95928a.m95914b()) == null || (m95947a = m95914b.m95947a()) == null) : !((c18049e2 = c3020p0.f12023C.f12127r) == null || (m95928a2 = c18049e2.m95928a()) == null || (m95914b2 = m95928a2.m95914b()) == null || (m95947a = m95914b2.m95948b()) == null)) {
                    str2 = m95947a;
                }
                C3025q0 c3025q0 = c3020p0.f12023C;
                if (c3025q0 != null && (arrayList = c3025q0.f12118i) != null) {
                    i12 = arrayList.size();
                }
                if (i12 > C19587j.f97307a.m102530f(3).mo102465h() && this.f44322M == 4) {
                    getPhotoContainer().mo89161z0(C19581d.f97279a.m102499v(str2));
                    return;
                }
                C18565a backgroundFeedPhotoHelper4 = getBackgroundFeedPhotoHelper();
                Context context5 = getContext();
                AbstractC19074t.m100207e(context5, "getContext(...)");
                backgroundFeedPhotoHelper4.m98028e(context5, str2, 3, new C8123m());
            }
        }
    }

    private final C18565a getBackgroundFeedPhotoHelper() {
        return (C18565a) this.f44601q0.getValue();
    }

    private final C8874e getFeedCollapsedGridModule() {
        return (C8874e) this.f44597m0.getValue();
    }

    private final C8880k getFeedGridDynamicModule() {
        return (C8880k) this.f44598n0.getValue();
    }

    private final C8883n getFeedGridModule() {
        return (C8883n) this.f44596l0.getValue();
    }

    private final C16716d getOverlayModule() {
        return (C16716d) this.f44602r0.getValue();
    }

    public final C16716d getPhotoContainer() {
        return (C16716d) this.f44599o0.getValue();
    }

    private final C16716d getSongContainer() {
        return (C16716d) this.f44600p0.getValue();
    }

    /* renamed from: h1 */
    public static final void m43974h1(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, int i11, ArrayList arrayList, FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView, View view, int i12, C3020p0 c3020p0, TrackingSource trackingSource, C16716d c16716d, C16719g c16719g, int i13, boolean z11, AnimationTarget animationTarget) {
        AbstractC19074t.m100208f(feedItemPhotoMultiModuleView, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        try {
            if (!z11) {
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) arrayList.get(i13);
                if (feedItemPhotoMultiModuleView.f44607w0.size() > 0) {
                    int indexOf = feedItemPhotoMultiModuleView.f44607w0.indexOf(itemAlbumMobile);
                    ArrayList arrayList2 = feedItemPhotoMultiModuleView.f44607w0;
                    AbstractC19074t.m100206d(arrayList2, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.control.ItemAlbumMobile?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.control.ItemAlbumMobile?> }");
                    feedItemPhotoMultiModuleView.m43985p1(arrayList2, itemAlbumMobile, animationTarget, 0.0f, view, i12, c3020p0, indexOf, indexOf, indexOf, trackingSource, interfaceC2259a);
                } else {
                    feedItemPhotoMultiModuleView.m43985p1(arrayList, itemAlbumMobile, animationTarget, 0.0f, view, i12, c3020p0, i13, i13, i13, trackingSource, interfaceC2259a);
                }
            } else if (interfaceC2259a == null) {
            } else {
                interfaceC2259a.mo11936Tt(c16719g, c3000l0, i11, false, new Bundle());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i1 */
    public static final void m43975i1(FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView, C3020p0 c3020p0, C16716d c16716d, C16719g c16719g, int i11) {
        AbstractC19074t.m100208f(feedItemPhotoMultiModuleView, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        InterfaceC2260b interfaceC2260b = feedItemPhotoMultiModuleView.f44604t0;
        if (interfaceC2260b != null) {
            interfaceC2260b.mo11977a(c3020p0, i11);
        }
    }

    /* renamed from: j1 */
    public static final void m43976j1(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, View view) {
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11960kf(view, c3000l0, 0, false, null);
        }
    }

    /* renamed from: k1 */
    public static final void m43977k1(FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView, C16716d c16716d, C16719g c16719g, int i11, boolean z11, AnimationTarget animationTarget) {
        AbstractC19074t.m100208f(feedItemPhotoMultiModuleView, "this$0");
        C16719g.c cVar = feedItemPhotoMultiModuleView.f44320K;
        if (cVar != null) {
            cVar.mo929y(c16719g);
        }
    }

    /* renamed from: l1 */
    public static final void m43978l1(C3020p0 c3020p0, FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView, InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, int i11, ArrayList arrayList, int i12, TrackingSource trackingSource, C16719g c16719g, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i13) {
        boolean z11;
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        AbstractC19074t.m100208f(feedItemPhotoMultiModuleView, "this$0");
        ArrayList arrayList2 = c3020p0.f12023C.f12118i;
        if ((arrayList2 != null && arrayList2.size() > 9) || c3020p0.f12023C.f12124o > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC20826v0.m108824n0(feedItemPhotoMultiModuleView.f44322M) && i13 == 8 && z11) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11936Tt(c16719g, c3000l0, i11, true, new Bundle());
                return;
            }
            return;
        }
        feedItemPhotoMultiModuleView.m43985p1(arrayList, itemAlbumMobile, animationTarget, 0.0f, feedItemPhotoMultiModuleView, i12, c3020p0, i13, i13, i13, trackingSource, interfaceC2259a);
    }

    /* renamed from: m1 */
    public static final void m43979m1(FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView, C3020p0 c3020p0, C16716d c16716d, C16719g c16719g, int i11) {
        AbstractC19074t.m100208f(feedItemPhotoMultiModuleView, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        InterfaceC2260b interfaceC2260b = feedItemPhotoMultiModuleView.f44604t0;
        if (interfaceC2260b != null) {
            interfaceC2260b.mo11977a(c3020p0, i11);
        }
    }

    /* renamed from: o1 */
    private final void m43980o1(int i11, int i12, C3000l0 c3000l0, C3020p0 c3020p0, int i13, ArrayList arrayList, boolean z11, TrackingSource trackingSource, InterfaceC2259a interfaceC2259a) {
        C18049e c18049e;
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    int i14 = 0;
                    String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    setTag(format);
                    getFeedGridDynamicModule().mo44614b1(0);
                    getFeedGridModule().mo44614b1(8);
                    this.f44610z0 = getFeedGridDynamicModule();
                    getFeedGridDynamicModule().m47371I1(m43951H0(c3000l0, i13));
                    getFeedGridDynamicModule().m47367E1(this.f44322M);
                    C8884o c8884o = new C8884o(arrayList, c3020p0.f12023C.f12124o, AbstractC20826v0.m108824n0(this.f44322M), i11);
                    C3025q0 c3025q0 = c3020p0.f12023C;
                    if (c3025q0 != null && (c18049e = c3025q0.f12127r) != null) {
                        i14 = c18049e.m95929b();
                    }
                    int mo102465h = C19587j.f97307a.m102530f(i14).mo102465h();
                    getFeedGridDynamicModule().m47373t1(c8884o, i12, false, false, i14);
                    getFeedGridDynamicModule().m47374u1(c8884o, z11, i12);
                    getFeedGridDynamicModule().m47366D1(new C8124n(mo102465h, arrayList, c3020p0, interfaceC2259a, c3000l0, i13, i12, trackingSource));
                    getFeedItemMusicLyric().m89106L().m89023G(this.f44610z0);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    private final void setScrollDelegate(InterfaceC8112b interfaceC8112b) {
        this.f44595C0 = interfaceC8112b;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
        AbstractC19074t.m100208f(c29106b, "dataObject");
        setFeedContent(c29106b.f134937a);
        m43696Y(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134941e, c29106b.f134942f);
        mo43698b0(c29106b.f134937a, 0, c29106b.f134939c, c29106b.f134941e, c29106b.f134942f, true, c29106b.f134943g, c29106b.f134940d);
        mo43876t0();
        m43984n1(3, 0, c29106b.f134937a, 0, null, c29106b.f134940d, 0, c29106b.f134944h, c29106b.f134941e);
        setScrollDelegate(c29106b.f134945i);
        m43700e0();
    }

    /* renamed from: e1 */
    public final void m43981e1() {
        getFeedGridModule().m47386A1();
        getFeedGridDynamicModule().m47365C1();
    }

    /* renamed from: f1 */
    public final void m43982f1(int i11) {
        boolean z11;
        Rect rect;
        int i12;
        int i13;
        int i14;
        boolean z12 = true;
        if (getFeedGridDynamicModule().m89136d0() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getFeedGridModule().m89136d0() != 0) {
            z12 = false;
        }
        if (z12) {
            rect = getFeedGridModule().mo43986q(i11);
        } else if (z11) {
            rect = getFeedGridDynamicModule().mo43986q(i11);
        } else {
            rect = null;
        }
        if (rect != null) {
            InterfaceC8112b interfaceC8112b = this.f44595C0;
            if (interfaceC8112b != null) {
                i12 = interfaceC8112b.mo43990Y1();
            } else {
                i12 = 0;
            }
            InterfaceC8112b interfaceC8112b2 = this.f44595C0;
            if (interfaceC8112b2 != null) {
                i13 = interfaceC8112b2.mo43989V3();
            } else {
                i13 = 0;
            }
            int i15 = rect.top;
            if (i15 < i12) {
                i14 = -(i12 - i15);
            } else {
                int i16 = rect.bottom;
                if (i16 > i13) {
                    i14 = i16 - i13;
                } else {
                    i14 = 0;
                }
            }
            InterfaceC8112b interfaceC8112b3 = this.f44595C0;
            if (interfaceC8112b3 != null) {
                interfaceC8112b3.mo43988D0(0, i14);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0132 A[Catch: Exception -> 0x006d, TryCatch #0 {Exception -> 0x006d, blocks: (B:6:0x0008, B:9:0x000f, B:11:0x001b, B:13:0x0021, B:26:0x00ba, B:29:0x0102, B:31:0x0132, B:32:0x013e, B:33:0x01e6, B:37:0x0056, B:38:0x0070, B:39:0x008c, B:40:0x0098, B:42:0x009e, B:43:0x00b3, B:44:0x00a9, B:45:0x0146, B:46:0x0184, B:48:0x01d6, B:49:0x01e0), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* renamed from: g1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m43983g1(C3000l0 c3000l0, int i11, View view, boolean z11, int i12, int i13, TrackingSource trackingSource, InterfaceC2259a interfaceC2259a, int i14) {
        int mo102458a;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            C3025q0 c3025q0 = m14324b0.f12023C;
            ArrayList arrayList = c3025q0.f12118i;
            int m95929b = c3025q0.f12127r.m95929b();
            if (arrayList != null && arrayList.size() > 0) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                boolean z12 = true;
                String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                setTag(format);
                int i15 = this.f44322M;
                if (i15 != 2) {
                    if (i15 != 6) {
                        if (i15 != 0) {
                            if (i15 != 1) {
                                if (i15 != 3) {
                                    if (i15 != 4) {
                                        if (i15 == 11) {
                                            getFeedGridModule().m47394I1(AbstractC23136l9.m118725l0(this.f84675p) - (AbstractC23136l9.m118742r(36.0f) * 2));
                                        }
                                    }
                                } else {
                                    getFeedGridModule().m47394I1((AbstractC23136l9.m118725l0(this.f84675p) - AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)) - AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right));
                                }
                            } else {
                                getFeedGridModule().m47394I1(C20801j.m108534b());
                            }
                            getFeedGridModule().m47392G1(m14324b0.f12023C.f12121l);
                            getFeedGridModule().m47393H1(m14324b0.f12023C.f12120k);
                            getFeedGridModule().m47387B1(m14324b0.f12023C.f12125p);
                            C8883n feedGridModule = getFeedGridModule();
                            C3025q0 c3025q02 = m14324b0.f12023C;
                            feedGridModule.m47389D1(arrayList, c3025q02.f12124o, c3025q02.f12122m);
                            getFeedGridModule().m47388C1(i13);
                            getFeedGridModule().m47390E1(this.f44322M);
                            C8883n feedGridModule2 = getFeedGridModule();
                            if (m95929b != 0) {
                                z12 = false;
                            }
                            feedGridModule2.m47400v1(z12);
                            getFeedGridModule().m47399u1();
                            getFeedGridModule().m47401y1(z11, this.f44324O);
                            getFeedGridModule().m47395J1(new C8883n.c() { // from class: com.zing.zalo.feed.components.p3

                                /* renamed from: b */
                                public final /* synthetic */ FeedItemPhotoMultiModuleView f45563b;

                                /* renamed from: c */
                                public final /* synthetic */ InterfaceC2259a f45564c;

                                /* renamed from: d */
                                public final /* synthetic */ C3000l0 f45565d;

                                /* renamed from: e */
                                public final /* synthetic */ int f45566e;

                                /* renamed from: f */
                                public final /* synthetic */ ArrayList f45567f;

                                /* renamed from: g */
                                public final /* synthetic */ int f45568g;

                                /* renamed from: h */
                                public final /* synthetic */ TrackingSource f45569h;

                                public /* synthetic */ C8357p3(FeedItemPhotoMultiModuleView this, InterfaceC2259a interfaceC2259a2, C3000l0 c3000l02, int i112, ArrayList arrayList2, int i122, TrackingSource trackingSource2) {
                                    r2 = this;
                                    r3 = interfaceC2259a2;
                                    r4 = c3000l02;
                                    r5 = i112;
                                    r6 = arrayList2;
                                    r7 = i122;
                                    r8 = trackingSource2;
                                }

                                @Override // com.zing.zalo.feed.uicontrols.C8883n.c
                                /* renamed from: a */
                                public final void mo44793a(C16719g c16719g, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i16) {
                                    FeedItemPhotoMultiModuleView.m43978l1(C3020p0.this, r2, r3, r4, r5, r6, r7, r8, c16719g, animationTarget, itemAlbumMobile, i16);
                                }
                            });
                            if (this.f44322M != 4) {
                                getFeedGridModule().m47396K1(new C8883n.d() { // from class: com.zing.zalo.feed.components.q3

                                    /* renamed from: b */
                                    public final /* synthetic */ C3020p0 f45631b;

                                    public /* synthetic */ C8365q3(C3020p0 m14324b02) {
                                        r2 = m14324b02;
                                    }

                                    @Override // com.zing.zalo.feed.uicontrols.C8883n.d
                                    /* renamed from: a */
                                    public final void mo44850a(C16716d c16716d, C16719g c16719g, int i16) {
                                        FeedItemPhotoMultiModuleView.m43979m1(FeedItemPhotoMultiModuleView.this, r2, c16716d, c16719g, i16);
                                    }
                                });
                            }
                            this.f44610z0 = getFeedGridModule();
                        }
                        if (getFeedMusicData() != null) {
                            mo102458a = C19587j.f97307a.m102530f(m95929b).mo102459b();
                        } else {
                            mo102458a = C19587j.f97307a.m102530f(m95929b).mo102458a();
                        }
                        getFeedGridModule().m47391F1(mo102458a);
                        getFeedGridModule().m47392G1(m14324b02.f12023C.f12121l);
                        getFeedGridModule().m47393H1(m14324b02.f12023C.f12120k);
                        getFeedGridModule().m47387B1(m14324b02.f12023C.f12125p);
                        C8883n feedGridModule3 = getFeedGridModule();
                        C3025q0 c3025q022 = m14324b02.f12023C;
                        feedGridModule3.m47389D1(arrayList2, c3025q022.f12124o, c3025q022.f12122m);
                        getFeedGridModule().m47388C1(i13);
                        getFeedGridModule().m47390E1(this.f44322M);
                        C8883n feedGridModule22 = getFeedGridModule();
                        if (m95929b != 0) {
                        }
                        feedGridModule22.m47400v1(z12);
                        getFeedGridModule().m47399u1();
                        getFeedGridModule().m47401y1(z11, this.f44324O);
                        getFeedGridModule().m47395J1(new C8883n.c() { // from class: com.zing.zalo.feed.components.p3

                            /* renamed from: b */
                            public final /* synthetic */ FeedItemPhotoMultiModuleView f45563b;

                            /* renamed from: c */
                            public final /* synthetic */ InterfaceC2259a f45564c;

                            /* renamed from: d */
                            public final /* synthetic */ C3000l0 f45565d;

                            /* renamed from: e */
                            public final /* synthetic */ int f45566e;

                            /* renamed from: f */
                            public final /* synthetic */ ArrayList f45567f;

                            /* renamed from: g */
                            public final /* synthetic */ int f45568g;

                            /* renamed from: h */
                            public final /* synthetic */ TrackingSource f45569h;

                            public /* synthetic */ C8357p3(FeedItemPhotoMultiModuleView this, InterfaceC2259a interfaceC2259a2, C3000l0 c3000l02, int i112, ArrayList arrayList2, int i122, TrackingSource trackingSource2) {
                                r2 = this;
                                r3 = interfaceC2259a2;
                                r4 = c3000l02;
                                r5 = i112;
                                r6 = arrayList2;
                                r7 = i122;
                                r8 = trackingSource2;
                            }

                            @Override // com.zing.zalo.feed.uicontrols.C8883n.c
                            /* renamed from: a */
                            public final void mo44793a(C16719g c16719g, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i16) {
                                FeedItemPhotoMultiModuleView.m43978l1(C3020p0.this, r2, r3, r4, r5, r6, r7, r8, c16719g, animationTarget, itemAlbumMobile, i16);
                            }
                        });
                        if (this.f44322M != 4) {
                        }
                        this.f44610z0 = getFeedGridModule();
                    } else {
                        getFeedCollapsedGridModule().m47345w1(arrayList2, m14324b02.f12023C.f12124o);
                        getFeedCollapsedGridModule().m47347y1(1);
                        getFeedCollapsedGridModule().m47344v1(i14);
                        getFeedCollapsedGridModule().m47342r1();
                        getFeedCollapsedGridModule().m47343u1(z11, this.f44324O);
                        getFeedCollapsedGridModule().m47348z1(new C8874e.c() { // from class: com.zing.zalo.feed.components.o3
                            public /* synthetic */ C8349o3() {
                            }

                            @Override // com.zing.zalo.feed.uicontrols.C8874e.c
                            /* renamed from: a */
                            public final void mo44779a(C16716d c16716d, C16719g c16719g, int i16, boolean z13, AnimationTarget animationTarget) {
                                FeedItemPhotoMultiModuleView.m43977k1(FeedItemPhotoMultiModuleView.this, c16716d, c16719g, i16, z13, animationTarget);
                            }
                        });
                        this.f44610z0 = getFeedCollapsedGridModule();
                    }
                } else {
                    getFeedCollapsedGridModule().m47345w1(arrayList2, m14324b02.f12023C.f12124o);
                    getFeedCollapsedGridModule().m47346x1(AbstractC20814p0.m108611J());
                    getFeedCollapsedGridModule().m47342r1();
                    getFeedCollapsedGridModule().m47343u1(z11, this.f44324O);
                    getFeedCollapsedGridModule().m47348z1(new C8874e.c() { // from class: com.zing.zalo.feed.components.l3

                        /* renamed from: b */
                        public final /* synthetic */ C3000l0 f45501b;

                        /* renamed from: c */
                        public final /* synthetic */ int f45502c;

                        /* renamed from: d */
                        public final /* synthetic */ ArrayList f45503d;

                        /* renamed from: e */
                        public final /* synthetic */ FeedItemPhotoMultiModuleView f45504e;

                        /* renamed from: f */
                        public final /* synthetic */ View f45505f;

                        /* renamed from: g */
                        public final /* synthetic */ int f45506g;

                        /* renamed from: h */
                        public final /* synthetic */ C3020p0 f45507h;

                        /* renamed from: i */
                        public final /* synthetic */ TrackingSource f45508i;

                        public /* synthetic */ C8325l3(C3000l0 c3000l02, int i112, ArrayList arrayList2, FeedItemPhotoMultiModuleView this, View view2, int i122, C3020p0 m14324b02, TrackingSource trackingSource2) {
                            r2 = c3000l02;
                            r3 = i112;
                            r4 = arrayList2;
                            r5 = this;
                            r6 = view2;
                            r7 = i122;
                            r8 = m14324b02;
                            r9 = trackingSource2;
                        }

                        @Override // com.zing.zalo.feed.uicontrols.C8874e.c
                        /* renamed from: a */
                        public final void mo44779a(C16716d c16716d, C16719g c16719g, int i16, boolean z13, AnimationTarget animationTarget) {
                            FeedItemPhotoMultiModuleView.m43974h1(InterfaceC2259a.this, r2, r3, r4, r5, r6, r7, r8, r9, c16716d, c16719g, i16, z13, animationTarget);
                        }
                    });
                    getFeedCollapsedGridModule().m47339A1(new C8874e.d() { // from class: com.zing.zalo.feed.components.m3

                        /* renamed from: b */
                        public final /* synthetic */ C3020p0 f45517b;

                        public /* synthetic */ C8333m3(C3020p0 m14324b02) {
                            r2 = m14324b02;
                        }

                        @Override // com.zing.zalo.feed.uicontrols.C8874e.d
                        /* renamed from: a */
                        public final void mo44781a(C16716d c16716d, C16719g c16719g, int i16) {
                            FeedItemPhotoMultiModuleView.m43975i1(FeedItemPhotoMultiModuleView.this, r2, c16716d, c16719g, i16);
                        }
                    });
                    if (!AbstractC23304d.f113420o2) {
                        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.n3

                            /* renamed from: q */
                            public final /* synthetic */ C3000l0 f45536q;

                            public /* synthetic */ ViewOnClickListenerC8341n3(C3000l0 c3000l02) {
                                r2 = c3000l02;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                FeedItemPhotoMultiModuleView.m43976j1(InterfaceC2259a.this, r2, view2);
                            }
                        });
                    }
                    this.f44610z0 = getFeedCollapsedGridModule();
                }
                getFeedItemMusicLyric().m89106L().m89023G(this.f44610z0);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final ArrayList<ItemAlbumMobile> getAllPhotoUrls() {
        return this.f44607w0;
    }

    public final C16719g getAnchorViewForMusicInfo() {
        return this.f44610z0;
    }

    public final C18049e getLayoutConfig() {
        return this.f44593A0;
    }

    public final List<C3000l0> getLstAllFeeds() {
        return this.f44606v0;
    }

    public final C25897n0.c getMHorFeedGrListener() {
        return this.f44605u0;
    }

    public final SparseIntArray getMMapPositions() {
        return this.f44609y0;
    }

    public final InterfaceC2260b getMPhotoLongClickListener() {
        return this.f44604t0;
    }

    public final InterfaceC8112b getMScrollDelegate() {
        return this.f44595C0;
    }

    public final Map<String, C3020p0> getMapPicIdFeedItem() {
        return this.f44608x0;
    }

    public final FeedGridView.InterfaceC8858a getOnGroupItemClickListener() {
        return this.f44603s0;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        this.f44322M = i11;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 6) {
                            if (i11 == 11) {
                                m43956M0(context, i11);
                            }
                            super.mo43705j0(context, this.f44322M);
                            m43957N0(this.f44322M);
                        }
                        m43959P0(context);
                    } else {
                        m43955L0(i11);
                    }
                } else {
                    m43958O0();
                }
            } else {
                m43961R0();
            }
        } else {
            m43960Q0();
        }
        super.mo43705j0(context, this.f44322M);
        m43957N0(this.f44322M);
    }

    /* renamed from: n1 */
    public final void m43984n1(int i11, int i12, C3000l0 c3000l0, int i13, View view, boolean z11, int i14, TrackingSource trackingSource, InterfaceC2259a interfaceC2259a) {
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i13);
            if (m14324b0 == null) {
                return;
            }
            ArrayList arrayList = m14324b0.f12023C.f12118i;
            if (m14324b0.m14475F(AbstractC20826v0.m108824n0(this.f44322M)) && m43969Z0() && !m14324b0.m14487R()) {
                if (m14324b0.m14487R()) {
                    m14324b0.m14523p0();
                }
                m43980o1(i11, i12, c3000l0, m14324b0, i13, arrayList, z11, trackingSource, interfaceC2259a);
            } else {
                getFeedGridDynamicModule().mo44614b1(8);
                getFeedGridModule().mo44614b1(0);
                this.f44610z0 = getFeedGridModule();
                m43983g1(c3000l0, i13, view, z11, i12, i14, trackingSource, interfaceC2259a, 0);
            }
            getFeedItemMusicLyric().m89106L().m89023G(this.f44610z0);
            requestLayout();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getFeedItemSongInfoModule().m44570J1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getFeedItemSongInfoModule().m44571K1();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:5:0x0013, B:10:0x001b, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0037, B:29:0x0076, B:31:0x00ae, B:32:0x00b2, B:34:0x00d5, B:35:0x00da, B:37:0x00e4, B:38:0x00e7, B:41:0x00ef, B:43:0x00fb, B:45:0x0123, B:46:0x015a, B:48:0x0161, B:50:0x0172, B:51:0x0174, B:54:0x0133, B:56:0x005a, B:58:0x0061, B:60:0x0067), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:5:0x0013, B:10:0x001b, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0037, B:29:0x0076, B:31:0x00ae, B:32:0x00b2, B:34:0x00d5, B:35:0x00da, B:37:0x00e4, B:38:0x00e7, B:41:0x00ef, B:43:0x00fb, B:45:0x0123, B:46:0x015a, B:48:0x0161, B:50:0x0172, B:51:0x0174, B:54:0x0133, B:56:0x005a, B:58:0x0061, B:60:0x0067), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:5:0x0013, B:10:0x001b, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0037, B:29:0x0076, B:31:0x00ae, B:32:0x00b2, B:34:0x00d5, B:35:0x00da, B:37:0x00e4, B:38:0x00e7, B:41:0x00ef, B:43:0x00fb, B:45:0x0123, B:46:0x015a, B:48:0x0161, B:50:0x0172, B:51:0x0174, B:54:0x0133, B:56:0x005a, B:58:0x0061, B:60:0x0067), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef A[Catch: Exception -> 0x0033, TRY_ENTER, TryCatch #0 {Exception -> 0x0033, blocks: (B:5:0x0013, B:10:0x001b, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0037, B:29:0x0076, B:31:0x00ae, B:32:0x00b2, B:34:0x00d5, B:35:0x00da, B:37:0x00e4, B:38:0x00e7, B:41:0x00ef, B:43:0x00fb, B:45:0x0123, B:46:0x015a, B:48:0x0161, B:50:0x0172, B:51:0x0174, B:54:0x0133, B:56:0x005a, B:58:0x0061, B:60:0x0067), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:5:0x0013, B:10:0x001b, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0037, B:29:0x0076, B:31:0x00ae, B:32:0x00b2, B:34:0x00d5, B:35:0x00da, B:37:0x00e4, B:38:0x00e7, B:41:0x00ef, B:43:0x00fb, B:45:0x0123, B:46:0x015a, B:48:0x0161, B:50:0x0172, B:51:0x0174, B:54:0x0133, B:56:0x005a, B:58:0x0061, B:60:0x0067), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:5:0x0013, B:10:0x001b, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0037, B:29:0x0076, B:31:0x00ae, B:32:0x00b2, B:34:0x00d5, B:35:0x00da, B:37:0x00e4, B:38:0x00e7, B:41:0x00ef, B:43:0x00fb, B:45:0x0123, B:46:0x015a, B:48:0x0161, B:50:0x0172, B:51:0x0174, B:54:0x0133, B:56:0x005a, B:58:0x0061, B:60:0x0067), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m43985p1(ArrayList arrayList, ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget, float f11, View view, int i11, C3020p0 c3020p0, int i12, int i13, int i14, TrackingSource trackingSource, InterfaceC2259a interfaceC2259a) {
        int m118655I;
        int m118655I2;
        C3000l0 c3000l0;
        int i15;
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        if (itemAlbumMobile != null && arrayList != null) {
            try {
                if (arrayList.isEmpty() || c3020p0.m14493X()) {
                    return;
                }
                if (this.f44322M == 1) {
                    C25897n0.c cVar = this.f44605u0;
                    if (cVar != null) {
                        cVar.mo133514a(animationTarget, i14);
                        return;
                    }
                    return;
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                C8126p c8126p = new C8126p();
                int i16 = this.f44322M;
                if (i16 != 0 && i16 != 4 && i16 != 2 && i16 != 3) {
                    m118655I = 0;
                    m118655I2 = 0;
                    c8126p.m105857C(sparseIntArray);
                    c8126p.m105858D(sparseIntArray2);
                    c8126p.m105882u(m118655I);
                    c8126p.m105881t(m118655I2);
                    c8126p.m105862H(f11);
                    c8126p.m105861G(new C2370r0(view));
                    c8126p.m105865K(i12);
                    c8126p.m105884w(c3020p0.f12057p);
                    c8126p.m105886y(true);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("fromFeed", true);
                    c3000l0 = this.f44331V;
                    if (c3000l0 == null) {
                        i15 = c3000l0.f11896q0;
                    } else {
                        i15 = -1;
                    }
                    bundle.putInt("fromTimelineTab", i15);
                    bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
                    bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                    bundle.putString("feedId", c3020p0.f12057p);
                    bundle.putString("userId", c3020p0.f12022B.f12280b);
                    if (c3020p0.m14493X()) {
                        bundle.putBoolean("viewOnly", true);
                    }
                    if (!TextUtils.isEmpty(c3020p0.m14528u())) {
                        c8126p.m105885x(false);
                    }
                    if (arrayList.size() <= 1) {
                        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                        int size = arrayList.size();
                        for (int i17 = 0; i17 < size; i17++) {
                            ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile((ItemAlbumMobile) arrayList.get(i17));
                            itemAlbumMobile2.f42605w = c3020p0.f12022B.f12282d;
                            itemAlbumMobile2.f42564O = c3020p0.f12062u;
                            itemAlbumMobile2.f42599t = c3020p0.f12057p;
                            itemAlbumMobile2.f42548C = itemAlbumMobile2.m40526m0();
                            itemAlbumMobile2.m40528o0(c3020p0);
                            arrayList2.add(itemAlbumMobile2);
                        }
                        bundle.putParcelableArrayList("medialist", arrayList2);
                        bundle.putBoolean("hasGridPhoto", true);
                        bundle.putInt("currentIndex", i13);
                    } else {
                        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                        ItemAlbumMobile itemAlbumMobile3 = new ItemAlbumMobile(itemAlbumMobile);
                        itemAlbumMobile3.f42605w = c3020p0.f12022B.f12282d;
                        itemAlbumMobile3.f42564O = c3020p0.f12062u;
                        itemAlbumMobile3.f42599t = c3020p0.f12057p;
                        itemAlbumMobile3.f42548C = itemAlbumMobile3.m40526m0();
                        itemAlbumMobile3.m40528o0(c3020p0);
                        arrayList3.add(itemAlbumMobile3);
                        bundle.putParcelableArrayList("medialist", arrayList3);
                    }
                    bundle.putBoolean("EXTRA_SHOULD_SAVE_QUICK_COMMENT_TO_STORE", false);
                    if (interfaceC2259a == null) {
                        C31995kc.m154255c().m154258d(c3020p0.f12057p, c8126p);
                        String str = itemAlbumMobile.f42611z;
                        if (str.length() == 0) {
                            str = itemAlbumMobile.f42607x;
                        }
                        interfaceC2259a.mo11941Yk(animationTarget, str, bundle, c8126p, c3020p0, trackingSource, true);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    sparseIntArray.put(i18, i11);
                }
                sparseIntArray2.put(i11, 0);
                m118655I = AbstractC23136l9.m118655I(AbstractC19181d.abc_action_bar_default_height_material);
                m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.height_tab_main);
                c8126p.m105857C(sparseIntArray);
                c8126p.m105858D(sparseIntArray2);
                c8126p.m105882u(m118655I);
                c8126p.m105881t(m118655I2);
                c8126p.m105862H(f11);
                c8126p.m105861G(new C2370r0(view));
                c8126p.m105865K(i12);
                c8126p.m105884w(c3020p0.f12057p);
                c8126p.m105886y(true);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("fromFeed", true);
                c3000l0 = this.f44331V;
                if (c3000l0 == null) {
                }
                bundle2.putInt("fromTimelineTab", i15);
                bundle2.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
                bundle2.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                bundle2.putString("feedId", c3020p0.f12057p);
                bundle2.putString("userId", c3020p0.f12022B.f12280b);
                if (c3020p0.m14493X()) {
                }
                if (!TextUtils.isEmpty(c3020p0.m14528u())) {
                }
                if (arrayList.size() <= 1) {
                }
                bundle2.putBoolean("EXTRA_SHOULD_SAVE_QUICK_COMMENT_TO_STORE", false);
                if (interfaceC2259a == null) {
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // i40.InterfaceC20272b
    /* renamed from: q */
    public Rect mo43986q(int i11) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (getFeedGridDynamicModule().m89136d0() == 0) {
            return getFeedGridDynamicModule().mo43986q(i11);
        }
        if (getFeedGridModule().m89136d0() == 0) {
            return getFeedGridModule().mo43986q(i11);
        }
        if (getFeedCollapsedGridModule().m89136d0() == 0) {
            if (!this.f44607w0.isEmpty()) {
                int indexOf = this.f44331V.m14322a0().f12023C.f12118i.indexOf(this.f44607w0.get(i11));
                if (indexOf < 0) {
                    return null;
                }
                return getFeedCollapsedGridModule().m47340q(indexOf);
            }
            return getFeedCollapsedGridModule().m47340q(i11);
        }
        return null;
    }

    public final void setAllPhotoUrls(ArrayList<ItemAlbumMobile> arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f44607w0 = arrayList;
    }

    public final void setAnchorViewForMusicInfo(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "<set-?>");
        this.f44610z0 = c16719g;
    }

    public final void setFeedList(List<? extends C3000l0> list) {
        if (list != null) {
            this.f44606v0 = list;
        }
        m43952I0();
    }

    public final void setLayoutConfig(C18049e c18049e) {
        this.f44593A0 = c18049e;
    }

    public final void setLstAllFeeds(List<? extends C3000l0> list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f44606v0 = list;
    }

    public final void setMHorFeedGrListener(C25897n0.c cVar) {
        this.f44605u0 = cVar;
    }

    public final void setMMapPositions(SparseIntArray sparseIntArray) {
        AbstractC19074t.m100208f(sparseIntArray, "<set-?>");
        this.f44609y0 = sparseIntArray;
    }

    public final void setMPhotoLongClickListener(InterfaceC2260b interfaceC2260b) {
        this.f44604t0 = interfaceC2260b;
    }

    public final void setMScrollDelegate(InterfaceC8112b interfaceC8112b) {
        this.f44595C0 = interfaceC8112b;
    }

    public final void setMapPicIdFeedItem(Map<String, C3020p0> map) {
        AbstractC19074t.m100208f(map, "<set-?>");
        this.f44608x0 = map;
    }

    public final void setOnGroupItemClickListener(FeedGridView.InterfaceC8858a interfaceC8858a) {
        this.f44603s0 = interfaceC8858a;
    }

    public final void setOnHorFeedGrListener(C25897n0.c cVar) {
        this.f44605u0 = cVar;
    }

    public final void setPhotoLongClickListener(InterfaceC2260b interfaceC2260b) {
        this.f44604t0 = interfaceC2260b;
    }

    public final void setType4log(C3979l.b bVar) {
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f44594B0 = bVar;
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: t0 */
    protected void mo43876t0() {
        C3020p0 c3020p0;
        int i11;
        C3000l0 c3000l0 = this.f44331V;
        C18049e c18049e = null;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            C3025q0 c3025q0 = c3020p0.f12023C;
            if (c3025q0 != null) {
                c18049e = c3025q0.f12127r;
            }
            this.f44593A0 = c18049e;
            m43971b1(c3020p0);
            C18049e c18049e2 = this.f44593A0;
            if (c18049e2 != null) {
                i11 = c18049e2.m95929b();
            } else {
                i11 = 0;
            }
            m43970a1(i11);
            m43972c1(c3020p0);
            m43973d1(c3020p0);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: u0 */
    protected void mo43877u0(C3000l0 c3000l0, Integer num) {
        C3020p0 m14324b0;
        C18049e c18049e;
        int i11;
        if (c3000l0 != null && num != null && (m14324b0 = c3000l0.m14324b0(num.intValue())) != null) {
            C3025q0 c3025q0 = m14324b0.f12023C;
            if (c3025q0 != null) {
                c18049e = c3025q0.f12127r;
            } else {
                c18049e = null;
            }
            this.f44593A0 = c18049e;
            if (c18049e != null) {
                i11 = c18049e.m95929b();
            } else {
                i11 = 0;
            }
            m43970a1(i11);
            m43973d1(m14324b0);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: v0 */
    protected void mo43878v0() {
        C3020p0 m14322a0;
        C3000l0 c3000l0 = this.f44331V;
        if (c3000l0 != null && (m14322a0 = c3000l0.m14322a0()) != null) {
            getFeedItemSongInfoModule().m44572M1(m14322a0);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: w0 */
    protected void mo43879w0() {
        getOverlayModule().mo44614b1(8);
        getFeedGridDynamicModule().m47368F1(false);
        getFeedGridModule().m47397L1(false);
    }

    @Override // com.zing.zalo.feed.components.FeedItemMusicModuleView
    /* renamed from: x0 */
    protected void mo43880x0() {
        getFeedGridDynamicModule().m47368F1(true);
        getFeedGridModule().m47397L1(true);
    }

    public FeedItemPhotoMultiModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        m129210a = AbstractC24856m.m129210a(new C8116f());
        this.f44596l0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8114d());
        this.f44597m0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8115e());
        this.f44598n0 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C8118h());
        this.f44599o0 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C8125o());
        this.f44600p0 = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(C8113c.f44611q);
        this.f44601q0 = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C8117g());
        this.f44602r0 = m129210a7;
        this.f44606v0 = new ArrayList();
        this.f44607w0 = new ArrayList();
        this.f44608x0 = new HashMap();
        this.f44609y0 = new SparseIntArray();
        this.f44610z0 = new C16719g(getContext());
        this.f44594B0 = C3979l.b.UNKNOWN;
    }
}
