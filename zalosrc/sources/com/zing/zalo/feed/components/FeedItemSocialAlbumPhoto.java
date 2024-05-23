package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import ao.InterfaceC2259a;
import ao.InterfaceC2260b;
import au.C2370r0;
import bo.AbstractC2959d;
import bo.C2954c;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.uicontrols.C8874e;
import com.zing.zalo.feed.uicontrols.C8880k;
import com.zing.zalo.feed.uicontrols.C8883n;
import com.zing.zalo.feed.uicontrols.C8884o;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import i40.C20275e;
import i40.InterfaceC20272b;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import is.C20801j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p175g0.AbstractC19181d;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p489rn.C25897n0;
import p716zh.C31995kc;
import vg.C28227x3;

/* loaded from: classes4.dex */
public final class FeedItemSocialAlbumPhoto extends ModulesView implements InterfaceC20272b {

    /* renamed from: K */
    private int f44653K;

    /* renamed from: L */
    private C8880k f44654L;

    /* renamed from: M */
    public C8874e f44655M;

    /* renamed from: N */
    public C8883n f44656N;

    /* renamed from: O */
    public C23528a f44657O;

    /* renamed from: P */
    private int f44658P;

    /* renamed from: Q */
    private InterfaceC2260b f44659Q;

    /* renamed from: R */
    private C25897n0.c f44660R;

    /* renamed from: S */
    private InterfaceC8127a f44661S;

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8127a {
        /* renamed from: a */
        void mo44050a(int i11);
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto$b */
    /* loaded from: classes4.dex */
    public static final class C8128b implements C8880k.f {

        /* renamed from: b */
        final /* synthetic */ List f44663b;

        /* renamed from: c */
        final /* synthetic */ C3020p0 f44664c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC2259a f44665d;

        /* renamed from: e */
        final /* synthetic */ C3000l0 f44666e;

        /* renamed from: f */
        final /* synthetic */ int f44667f;

        /* renamed from: g */
        final /* synthetic */ int f44668g;

        /* renamed from: h */
        final /* synthetic */ TrackingSource f44669h;

        C8128b(List list, C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, int i11, int i12, TrackingSource trackingSource) {
            this.f44663b = list;
            this.f44664c = c3020p0;
            this.f44665d = interfaceC2259a;
            this.f44666e = c3000l0;
            this.f44667f = i11;
            this.f44668g = i12;
            this.f44669h = trackingSource;
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
                if (AbstractC20826v0.m108824n0(FeedItemSocialAlbumPhoto.this.getMLayoutMode())) {
                    if (i11 == 8) {
                        if (this.f44663b.size() <= 9) {
                            if (this.f44664c.f12023C.f12124o > 0) {
                            }
                        }
                        InterfaceC2259a interfaceC2259a = this.f44665d;
                        if (interfaceC2259a != null) {
                            interfaceC2259a.mo11936Tt(null, this.f44666e, this.f44667f, true, null);
                            return;
                        }
                        return;
                    }
                }
                FeedItemSocialAlbumPhoto feedItemSocialAlbumPhoto = FeedItemSocialAlbumPhoto.this;
                feedItemSocialAlbumPhoto.m44045s0(this.f44663b, itemAlbumMobile, animationTarget, feedItemSocialAlbumPhoto, this.f44668g, this.f44664c, i11, i11, i11, this.f44669h, this.f44665d, this.f44666e);
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
                if (FeedItemSocialAlbumPhoto.this.getMLayoutMode() != 4 && (mPhotoLongClickListener = FeedItemSocialAlbumPhoto.this.getMPhotoLongClickListener()) != null) {
                    mPhotoLongClickListener.mo11977a(this.f44664c, i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto$c */
    /* loaded from: classes4.dex */
    public static final class C8129c extends C20275e {
        C8129c() {
        }

        @Override // i40.C20275e
        /* renamed from: d */
        public View mo43942d(int i11) {
            if (FeedItemSocialAlbumPhoto.this.getMLayoutMode() == 2) {
                return FeedItemSocialAlbumPhoto.this;
            }
            View mo43942d = super.mo43942d(i11);
            AbstractC19074t.m100207e(mo43942d, "getImageViewAtPosition(...)");
            return mo43942d;
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    public FeedItemSocialAlbumPhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c0 */
    private final void m44033c0(C3020p0 c3020p0, ArrayList arrayList, boolean z11) {
        C8880k c8880k = this.f44654L;
        if (c8880k == null) {
            AbstractC19074t.m100223u("feedGridDynamicModule");
            c8880k = null;
        }
        c8880k.mo44614b1(8);
        getFeedGridModule().mo44614b1(8);
        getFeedCollapsedGridModule().mo44614b1(0);
        getFeedCollapsedGridModule().m47345w1(arrayList, c3020p0.f12023C.f12124o);
        getFeedCollapsedGridModule().m47347y1(1);
        getFeedCollapsedGridModule().m47344v1(0);
        getFeedCollapsedGridModule().m47342r1();
        getFeedCollapsedGridModule().m47343u1(z11, getMAQ());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m44034d0(C3020p0 c3020p0, ArrayList arrayList, int i11, C3000l0 c3000l0, int i12, boolean z11, int i13, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource) {
        int i14 = this.f44653K;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 3) {
                    if (i14 != 4) {
                        if (i14 == 11) {
                            getFeedGridModule().m47394I1(AbstractC23136l9.m118722k0() - (AbstractC23222t7.f112532K * 2));
                        }
                    }
                } else {
                    getFeedGridModule().m47394I1((AbstractC23136l9.m118722k0() - AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)) - AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right));
                }
            } else {
                getFeedGridModule().m47394I1((C20801j.m108534b() - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_margin_lr) * 2)) - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_content_margin) * 2));
            }
            getFeedGridModule().m47392G1(c3020p0.f12023C.f12121l);
            getFeedGridModule().m47393H1(c3020p0.f12023C.f12120k);
            getFeedGridModule().m47387B1(c3020p0.f12023C.f12125p);
            C8883n feedGridModule = getFeedGridModule();
            C3025q0 c3025q0 = c3020p0.f12023C;
            feedGridModule.m47389D1(arrayList, c3025q0.f12124o, c3025q0.f12122m);
            getFeedGridModule().m47388C1(i13);
            getFeedGridModule().m47390E1(this.f44653K);
            getFeedGridModule().m47399u1();
            getFeedGridModule().m47401y1(z11, getMAQ());
            getFeedGridModule().m47395J1(new C8883n.c() { // from class: com.zing.zalo.feed.components.w3

                /* renamed from: a */
                public final /* synthetic */ ArrayList f45845a;

                /* renamed from: b */
                public final /* synthetic */ C3020p0 f45846b;

                /* renamed from: c */
                public final /* synthetic */ FeedItemSocialAlbumPhoto f45847c;

                /* renamed from: d */
                public final /* synthetic */ InterfaceC2259a f45848d;

                /* renamed from: e */
                public final /* synthetic */ C3000l0 f45849e;

                /* renamed from: f */
                public final /* synthetic */ int f45850f;

                /* renamed from: g */
                public final /* synthetic */ int f45851g;

                /* renamed from: h */
                public final /* synthetic */ TrackingSource f45852h;

                public /* synthetic */ C8424w3(ArrayList arrayList2, C3020p0 c3020p02, FeedItemSocialAlbumPhoto this, InterfaceC2259a interfaceC2259a2, C3000l0 c3000l02, int i122, int i112, TrackingSource trackingSource2) {
                    r1 = arrayList2;
                    r2 = c3020p02;
                    r3 = this;
                    r4 = interfaceC2259a2;
                    r5 = c3000l02;
                    r6 = i122;
                    r7 = i112;
                    r8 = trackingSource2;
                }

                @Override // com.zing.zalo.feed.uicontrols.C8883n.c
                /* renamed from: a */
                public final void mo44793a(C16719g c16719g, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i15) {
                    FeedItemSocialAlbumPhoto.m44035e0(r1, r2, r3, r4, r5, r6, r7, r8, c16719g, animationTarget, itemAlbumMobile, i15);
                }
            });
            if (this.f44653K == 4) {
                getFeedGridModule().m47396K1(new C8883n.d() { // from class: com.zing.zalo.feed.components.x3

                    /* renamed from: b */
                    public final /* synthetic */ C3020p0 f45865b;

                    public /* synthetic */ C8432x3(C3020p0 c3020p02) {
                        r2 = c3020p02;
                    }

                    @Override // com.zing.zalo.feed.uicontrols.C8883n.d
                    /* renamed from: a */
                    public final void mo44850a(C16716d c16716d, C16719g c16719g, int i15) {
                        FeedItemSocialAlbumPhoto.m44036f0(FeedItemSocialAlbumPhoto.this, r2, c16716d, c16719g, i15);
                    }
                });
                return;
            }
            return;
        }
        getFeedGridModule().m47394I1((AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_margin_lr) * 2)) - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_content_margin) * 2));
        getFeedGridModule().m47392G1(c3020p02.f12023C.f12121l);
        getFeedGridModule().m47393H1(c3020p02.f12023C.f12120k);
        getFeedGridModule().m47387B1(c3020p02.f12023C.f12125p);
        C8883n feedGridModule2 = getFeedGridModule();
        C3025q0 c3025q02 = c3020p02.f12023C;
        feedGridModule2.m47389D1(arrayList2, c3025q02.f12124o, c3025q02.f12122m);
        getFeedGridModule().m47388C1(i13);
        getFeedGridModule().m47390E1(this.f44653K);
        getFeedGridModule().m47399u1();
        getFeedGridModule().m47401y1(z11, getMAQ());
        getFeedGridModule().m47395J1(new C8883n.c() { // from class: com.zing.zalo.feed.components.w3

            /* renamed from: a */
            public final /* synthetic */ ArrayList f45845a;

            /* renamed from: b */
            public final /* synthetic */ C3020p0 f45846b;

            /* renamed from: c */
            public final /* synthetic */ FeedItemSocialAlbumPhoto f45847c;

            /* renamed from: d */
            public final /* synthetic */ InterfaceC2259a f45848d;

            /* renamed from: e */
            public final /* synthetic */ C3000l0 f45849e;

            /* renamed from: f */
            public final /* synthetic */ int f45850f;

            /* renamed from: g */
            public final /* synthetic */ int f45851g;

            /* renamed from: h */
            public final /* synthetic */ TrackingSource f45852h;

            public /* synthetic */ C8424w3(ArrayList arrayList2, C3020p0 c3020p02, FeedItemSocialAlbumPhoto this, InterfaceC2259a interfaceC2259a2, C3000l0 c3000l02, int i122, int i112, TrackingSource trackingSource2) {
                r1 = arrayList2;
                r2 = c3020p02;
                r3 = this;
                r4 = interfaceC2259a2;
                r5 = c3000l02;
                r6 = i122;
                r7 = i112;
                r8 = trackingSource2;
            }

            @Override // com.zing.zalo.feed.uicontrols.C8883n.c
            /* renamed from: a */
            public final void mo44793a(C16719g c16719g, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i15) {
                FeedItemSocialAlbumPhoto.m44035e0(r1, r2, r3, r4, r5, r6, r7, r8, c16719g, animationTarget, itemAlbumMobile, i15);
            }
        });
        if (this.f44653K == 4) {
        }
    }

    /* renamed from: e0 */
    public static final void m44035e0(ArrayList arrayList, C3020p0 c3020p0, FeedItemSocialAlbumPhoto feedItemSocialAlbumPhoto, InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, int i11, int i12, TrackingSource trackingSource, C16719g c16719g, AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i13) {
        boolean z11;
        AbstractC19074t.m100208f(arrayList, "$photos");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        AbstractC19074t.m100208f(feedItemSocialAlbumPhoto, "this$0");
        if (arrayList.size() <= 9 && c3020p0.f12023C.f12124o <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (AbstractC20826v0.m108824n0(feedItemSocialAlbumPhoto.f44653K) && i13 == 8 && z11) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11936Tt(c16719g, c3000l0, i11, true, null);
                return;
            }
            return;
        }
        feedItemSocialAlbumPhoto.m44045s0(arrayList, itemAlbumMobile, animationTarget, feedItemSocialAlbumPhoto, i12, c3020p0, i13, i13, i13, trackingSource, interfaceC2259a, c3000l0);
    }

    /* renamed from: f0 */
    public static final void m44036f0(FeedItemSocialAlbumPhoto feedItemSocialAlbumPhoto, C3020p0 c3020p0, C16716d c16716d, C16719g c16719g, int i11) {
        AbstractC19074t.m100208f(feedItemSocialAlbumPhoto, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        InterfaceC2260b interfaceC2260b = feedItemSocialAlbumPhoto.f44659Q;
        if (interfaceC2260b != null) {
            interfaceC2260b.mo11977a(c3020p0, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0062  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m44037g0(C3020p0 c3020p0, List list, int i11, int i12, C3000l0 c3000l0, int i13, boolean z11, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource) {
        int m118731n0;
        int m118655I;
        int i14;
        boolean z12;
        C8880k c8880k;
        C8880k c8880k2;
        C8880k c8880k3;
        C8880k c8880k4;
        C8880k c8880k5;
        int i15;
        boolean z13;
        C8880k c8880k6;
        C8880k c8880k7;
        double d11;
        double m116582e;
        C28227x3 m14010a;
        C28227x3 m14010a2;
        if (c3020p0.m14487R()) {
            c3020p0.m14523p0();
        }
        int i16 = this.f44653K;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 4) {
                    if (i16 != 11) {
                        i14 = 0;
                        if (list.size() == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c8880k = this.f44654L;
                        if (c8880k == null) {
                            AbstractC19074t.m100223u("feedGridDynamicModule");
                            c8880k = null;
                        }
                        c8880k.m47371I1(i14);
                        c8880k2 = this.f44654L;
                        if (c8880k2 == null) {
                            AbstractC19074t.m100223u("feedGridDynamicModule");
                            c8880k2 = null;
                        }
                        c8880k2.m47367E1(this.f44653K);
                        if (z12) {
                            if (this.f44653K == 1) {
                                ((ItemAlbumMobile) list.get(0)).f42596r0.f42617d = ((ItemAlbumMobile) list.get(0)).f42596r0.f42616c;
                            } else {
                                AbstractC2959d m13986a = ((C2954c) c3020p0.f12023C.f12107P.get(0)).m13986a();
                                double d12 = 1.0d;
                                if (m13986a != null && (m14010a2 = m13986a.m14010a()) != null) {
                                    d11 = m14010a2.f131649b;
                                } else {
                                    d11 = 1.0d;
                                }
                                AbstractC2959d m13986a2 = ((C2954c) c3020p0.f12023C.f12107P.get(0)).m13986a();
                                if (m13986a2 != null && (m14010a = m13986a2.m14010a()) != null) {
                                    d12 = m14010a.f131648a;
                                }
                                double d13 = d11 / d12;
                                double d14 = this.f44658P / i14;
                                ItemAlbumMobile.C7883c c7883c = ((ItemAlbumMobile) list.get(0)).f42596r0;
                                double d15 = ((ItemAlbumMobile) list.get(0)).f42596r0.f42616c;
                                double d16 = ((ItemAlbumMobile) list.get(0)).f42596r0.f42616c;
                                if (this.f44658P > 0) {
                                    d13 = AbstractC22543l.m116582e(d14, d13);
                                }
                                m116582e = AbstractC22543l.m116582e(d15, d16 * d13);
                                c7883c.f42617d = m116582e;
                            }
                        }
                        C8884o c8884o = new C8884o(list, c3020p0.f12023C.f12124o, AbstractC20826v0.m108824n0(this.f44653K), i11);
                        c8880k3 = this.f44654L;
                        if (c8880k3 == null) {
                            AbstractC19074t.m100223u("feedGridDynamicModule");
                            c8880k4 = null;
                        } else {
                            c8880k4 = c8880k3;
                        }
                        c8880k4.m47373t1(c8884o, i12, false, false, 0);
                        c8880k5 = this.f44654L;
                        if (c8880k5 == null) {
                            AbstractC19074t.m100223u("feedGridDynamicModule");
                            i15 = i12;
                            z13 = z11;
                            c8880k5 = null;
                        } else {
                            i15 = i12;
                            z13 = z11;
                        }
                        c8880k5.m47374u1(c8884o, z13, i15);
                        c8880k6 = this.f44654L;
                        if (c8880k6 == null) {
                            AbstractC19074t.m100223u("feedGridDynamicModule");
                            c8880k7 = null;
                        } else {
                            c8880k7 = c8880k6;
                        }
                        c8880k7.m47366D1(new C8128b(list, c3020p0, interfaceC2259a, c3000l0, i13, i12, trackingSource));
                    }
                    m118731n0 = AbstractC23136l9.m118731n0(getContext());
                    m118655I = AbstractC23222t7.f112532K;
                }
            } else {
                m118731n0 = C20801j.m108534b() - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_margin_lr) * 2);
                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_content_margin);
            }
            i14 = m118731n0 - (m118655I * 2);
            if (list.size() == 1) {
            }
            c8880k = this.f44654L;
            if (c8880k == null) {
            }
            c8880k.m47371I1(i14);
            c8880k2 = this.f44654L;
            if (c8880k2 == null) {
            }
            c8880k2.m47367E1(this.f44653K);
            if (z12) {
            }
            C8884o c8884o2 = new C8884o(list, c3020p0.f12023C.f12124o, AbstractC20826v0.m108824n0(this.f44653K), i11);
            c8880k3 = this.f44654L;
            if (c8880k3 == null) {
            }
            c8880k4.m47373t1(c8884o2, i12, false, false, 0);
            c8880k5 = this.f44654L;
            if (c8880k5 == null) {
            }
            c8880k5.m47374u1(c8884o2, z13, i15);
            c8880k6 = this.f44654L;
            if (c8880k6 == null) {
            }
            c8880k7.m47366D1(new C8128b(list, c3020p0, interfaceC2259a, c3000l0, i13, i12, trackingSource));
        }
        m118731n0 = AbstractC23136l9.m118731n0(getContext()) - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_margin_lr) * 2);
        m118655I = AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_content_margin);
        i14 = m118731n0 - (m118655I * 2);
        if (list.size() == 1) {
        }
        c8880k = this.f44654L;
        if (c8880k == null) {
        }
        c8880k.m47371I1(i14);
        c8880k2 = this.f44654L;
        if (c8880k2 == null) {
        }
        c8880k2.m47367E1(this.f44653K);
        if (z12) {
        }
        C8884o c8884o22 = new C8884o(list, c3020p0.f12023C.f12124o, AbstractC20826v0.m108824n0(this.f44653K), i11);
        c8880k3 = this.f44654L;
        if (c8880k3 == null) {
        }
        c8880k4.m47373t1(c8884o22, i12, false, false, 0);
        c8880k5 = this.f44654L;
        if (c8880k5 == null) {
        }
        c8880k5.m47374u1(c8884o22, z13, i15);
        c8880k6 = this.f44654L;
        if (c8880k6 == null) {
        }
        c8880k7.m47366D1(new C8128b(list, c3020p0, interfaceC2259a, c3000l0, i13, i12, trackingSource));
    }

    /* renamed from: h0 */
    private final void m44038h0(C3020p0 c3020p0, ArrayList arrayList, C3000l0 c3000l0, int i11, View view, boolean z11, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource) {
        C8880k c8880k = this.f44654L;
        if (c8880k == null) {
            AbstractC19074t.m100223u("feedGridDynamicModule");
            c8880k = null;
        }
        c8880k.mo44614b1(8);
        getFeedGridModule().mo44614b1(8);
        getFeedCollapsedGridModule().mo44614b1(0);
        getFeedCollapsedGridModule().m47345w1(arrayList, c3020p0.f12023C.f12124o);
        getFeedCollapsedGridModule().m47346x1(AbstractC20814p0.m108611J());
        getFeedCollapsedGridModule().m47342r1();
        getFeedCollapsedGridModule().m47343u1(z11, getMAQ());
        getFeedCollapsedGridModule().m47348z1(new C8874e.c() { // from class: com.zing.zalo.feed.components.t3

            /* renamed from: b */
            public final /* synthetic */ C3000l0 f45718b;

            /* renamed from: c */
            public final /* synthetic */ int f45719c;

            /* renamed from: d */
            public final /* synthetic */ ArrayList f45720d;

            /* renamed from: e */
            public final /* synthetic */ FeedItemSocialAlbumPhoto f45721e;

            /* renamed from: f */
            public final /* synthetic */ View f45722f;

            /* renamed from: g */
            public final /* synthetic */ C3020p0 f45723g;

            /* renamed from: h */
            public final /* synthetic */ TrackingSource f45724h;

            public /* synthetic */ C8392t3(C3000l0 c3000l02, int i112, ArrayList arrayList2, FeedItemSocialAlbumPhoto this, View view2, C3020p0 c3020p02, TrackingSource trackingSource2) {
                r2 = c3000l02;
                r3 = i112;
                r4 = arrayList2;
                r5 = this;
                r6 = view2;
                r7 = c3020p02;
                r8 = trackingSource2;
            }

            @Override // com.zing.zalo.feed.uicontrols.C8874e.c
            /* renamed from: a */
            public final void mo44779a(C16716d c16716d, C16719g c16719g, int i12, boolean z12, AnimationTarget animationTarget) {
                FeedItemSocialAlbumPhoto.m44039i0(InterfaceC2259a.this, r2, r3, r4, r5, r6, r7, r8, c16716d, c16719g, i12, z12, animationTarget);
            }
        });
        if (this.f44653K != 4) {
            getFeedCollapsedGridModule().m47339A1(new C8874e.d() { // from class: com.zing.zalo.feed.components.u3

                /* renamed from: b */
                public final /* synthetic */ C3020p0 f45757b;

                public /* synthetic */ C8400u3(C3020p0 c3020p02) {
                    r2 = c3020p02;
                }

                @Override // com.zing.zalo.feed.uicontrols.C8874e.d
                /* renamed from: a */
                public final void mo44781a(C16716d c16716d, C16719g c16719g, int i12) {
                    FeedItemSocialAlbumPhoto.m44040j0(FeedItemSocialAlbumPhoto.this, r2, c16716d, c16719g, i12);
                }
            });
        }
        if (!AbstractC23304d.f113420o2) {
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.v3

                /* renamed from: q */
                public final /* synthetic */ C3000l0 f45805q;

                public /* synthetic */ ViewOnClickListenerC8408v3(C3000l0 c3000l02) {
                    r2 = c3000l02;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FeedItemSocialAlbumPhoto.m44041k0(InterfaceC2259a.this, r2, view2);
                }
            });
        }
    }

    /* renamed from: i0 */
    public static final void m44039i0(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, int i11, ArrayList arrayList, FeedItemSocialAlbumPhoto feedItemSocialAlbumPhoto, View view, C3020p0 c3020p0, TrackingSource trackingSource, C16716d c16716d, C16719g c16719g, int i12, boolean z11, AnimationTarget animationTarget) {
        AbstractC19074t.m100208f(arrayList, "$photos");
        AbstractC19074t.m100208f(feedItemSocialAlbumPhoto, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        try {
            if (z11) {
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11936Tt(c16719g, c3000l0, i11, false, null);
                }
            } else {
                Object obj = arrayList.get(i12);
                AbstractC19074t.m100207e(obj, "get(...)");
                feedItemSocialAlbumPhoto.m44045s0(arrayList, (ItemAlbumMobile) obj, animationTarget, view, i12, c3020p0, i12, i12, i12, trackingSource, interfaceC2259a, c3000l0);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j0 */
    public static final void m44040j0(FeedItemSocialAlbumPhoto feedItemSocialAlbumPhoto, C3020p0 c3020p0, C16716d c16716d, C16719g c16719g, int i11) {
        AbstractC19074t.m100208f(feedItemSocialAlbumPhoto, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        InterfaceC2260b interfaceC2260b = feedItemSocialAlbumPhoto.f44659Q;
        if (interfaceC2260b != null) {
            interfaceC2260b.mo11977a(c3020p0, i11);
        }
    }

    /* renamed from: k0 */
    public static final void m44041k0(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, View view) {
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11960kf(view, c3000l0, 0, false, null);
        }
    }

    /* renamed from: l0 */
    private final void m44042l0(C3020p0 c3020p0, ArrayList arrayList, int i11, int i12, C3000l0 c3000l0, int i13, boolean z11, int i14, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        setTag(format);
        C8880k c8880k = null;
        if (c3020p0.m14473E() && m44044q0() && !c3020p0.m14487R()) {
            C8880k c8880k2 = this.f44654L;
            if (c8880k2 == null) {
                AbstractC19074t.m100223u("feedGridDynamicModule");
            } else {
                c8880k = c8880k2;
            }
            c8880k.mo44614b1(0);
            getFeedGridModule().mo44614b1(8);
            getFeedCollapsedGridModule().mo44614b1(8);
            m44037g0(c3020p0, arrayList, i11, i12, c3000l0, i13, z11, interfaceC2259a, trackingSource);
            return;
        }
        C8880k c8880k3 = this.f44654L;
        if (c8880k3 == null) {
            AbstractC19074t.m100223u("feedGridDynamicModule");
        } else {
            c8880k = c8880k3;
        }
        c8880k.mo44614b1(8);
        getFeedGridModule().mo44614b1(0);
        getFeedCollapsedGridModule().mo44614b1(8);
        m44034d0(c3020p0, arrayList, i12, c3000l0, i13, z11, i14, interfaceC2259a, trackingSource);
    }

    /* renamed from: m0 */
    private final ArrayList m44043m0(C3000l0 c3000l0, int i11) {
        C3025q0 c3025q0;
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        ArrayList arrayList = null;
        if (m14324b0 != null) {
            c3025q0 = m14324b0.f12023C;
        } else {
            c3025q0 = null;
        }
        if (c3025q0 != null) {
            arrayList = c3025q0.f12107P;
        }
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: q0 */
    private final boolean m44044q0() {
        int i11 = this.f44653K;
        return i11 == 0 || i11 == 4 || i11 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x000e, B:10:0x0018, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0033, B:22:0x003a, B:24:0x003e, B:27:0x0042, B:35:0x007e, B:37:0x009a, B:41:0x00a3, B:43:0x00b7, B:44:0x00bb, B:46:0x00ca, B:48:0x00e0, B:49:0x00e5, B:51:0x00ef, B:52:0x00f2, B:53:0x00fb, B:55:0x0101, B:57:0x010e, B:59:0x0125, B:62:0x012a, B:64:0x0135, B:67:0x0145, B:68:0x014b, B:70:0x0150, B:72:0x0156, B:75:0x015c, B:82:0x0062, B:84:0x0069, B:86:0x006f), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x000e, B:10:0x0018, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0033, B:22:0x003a, B:24:0x003e, B:27:0x0042, B:35:0x007e, B:37:0x009a, B:41:0x00a3, B:43:0x00b7, B:44:0x00bb, B:46:0x00ca, B:48:0x00e0, B:49:0x00e5, B:51:0x00ef, B:52:0x00f2, B:53:0x00fb, B:55:0x0101, B:57:0x010e, B:59:0x0125, B:62:0x012a, B:64:0x0135, B:67:0x0145, B:68:0x014b, B:70:0x0150, B:72:0x0156, B:75:0x015c, B:82:0x0062, B:84:0x0069, B:86:0x006f), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x000e, B:10:0x0018, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0033, B:22:0x003a, B:24:0x003e, B:27:0x0042, B:35:0x007e, B:37:0x009a, B:41:0x00a3, B:43:0x00b7, B:44:0x00bb, B:46:0x00ca, B:48:0x00e0, B:49:0x00e5, B:51:0x00ef, B:52:0x00f2, B:53:0x00fb, B:55:0x0101, B:57:0x010e, B:59:0x0125, B:62:0x012a, B:64:0x0135, B:67:0x0145, B:68:0x014b, B:70:0x0150, B:72:0x0156, B:75:0x015c, B:82:0x0062, B:84:0x0069, B:86:0x006f), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x000e, B:10:0x0018, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0033, B:22:0x003a, B:24:0x003e, B:27:0x0042, B:35:0x007e, B:37:0x009a, B:41:0x00a3, B:43:0x00b7, B:44:0x00bb, B:46:0x00ca, B:48:0x00e0, B:49:0x00e5, B:51:0x00ef, B:52:0x00f2, B:53:0x00fb, B:55:0x0101, B:57:0x010e, B:59:0x0125, B:62:0x012a, B:64:0x0135, B:67:0x0145, B:68:0x014b, B:70:0x0150, B:72:0x0156, B:75:0x015c, B:82:0x0062, B:84:0x0069, B:86:0x006f), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x000e, B:10:0x0018, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0033, B:22:0x003a, B:24:0x003e, B:27:0x0042, B:35:0x007e, B:37:0x009a, B:41:0x00a3, B:43:0x00b7, B:44:0x00bb, B:46:0x00ca, B:48:0x00e0, B:49:0x00e5, B:51:0x00ef, B:52:0x00f2, B:53:0x00fb, B:55:0x0101, B:57:0x010e, B:59:0x0125, B:62:0x012a, B:64:0x0135, B:67:0x0145, B:68:0x014b, B:70:0x0150, B:72:0x0156, B:75:0x015c, B:82:0x0062, B:84:0x0069, B:86:0x006f), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x000e, B:10:0x0018, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0033, B:22:0x003a, B:24:0x003e, B:27:0x0042, B:35:0x007e, B:37:0x009a, B:41:0x00a3, B:43:0x00b7, B:44:0x00bb, B:46:0x00ca, B:48:0x00e0, B:49:0x00e5, B:51:0x00ef, B:52:0x00f2, B:53:0x00fb, B:55:0x0101, B:57:0x010e, B:59:0x0125, B:62:0x012a, B:64:0x0135, B:67:0x0145, B:68:0x014b, B:70:0x0150, B:72:0x0156, B:75:0x015c, B:82:0x0062, B:84:0x0069, B:86:0x006f), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x000e, B:10:0x0018, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:20:0x0033, B:22:0x003a, B:24:0x003e, B:27:0x0042, B:35:0x007e, B:37:0x009a, B:41:0x00a3, B:43:0x00b7, B:44:0x00bb, B:46:0x00ca, B:48:0x00e0, B:49:0x00e5, B:51:0x00ef, B:52:0x00f2, B:53:0x00fb, B:55:0x0101, B:57:0x010e, B:59:0x0125, B:62:0x012a, B:64:0x0135, B:67:0x0145, B:68:0x014b, B:70:0x0150, B:72:0x0156, B:75:0x015c, B:82:0x0062, B:84:0x0069, B:86:0x006f), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009d  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m44045s0(List list, ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget, View view, int i11, C3020p0 c3020p0, int i12, int i13, int i14, TrackingSource trackingSource, InterfaceC2259a interfaceC2259a, C3000l0 c3000l0) {
        int m118655I;
        int m118655I2;
        String str;
        int i15;
        Iterator it;
        boolean z11;
        if (itemAlbumMobile != null) {
            try {
                if (!list.isEmpty()) {
                    if (c3020p0 != null && c3020p0.m14493X()) {
                        return;
                    }
                    if (this.f44653K == 1) {
                        C25897n0.c cVar = this.f44660R;
                        if (cVar != null) {
                            cVar.mo133514a(animationTarget, i14);
                            return;
                        }
                        return;
                    }
                    if (itemAlbumMobile.f42591p == 2) {
                        InterfaceC8127a interfaceC8127a = this.f44661S;
                        if (interfaceC8127a != null) {
                            interfaceC8127a.mo44050a(i12);
                            return;
                        }
                        return;
                    }
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    SparseIntArray sparseIntArray2 = new SparseIntArray();
                    C8129c c8129c = new C8129c();
                    int i16 = this.f44653K;
                    if (i16 != 0 && i16 != 4 && i16 != 2 && i16 != 3) {
                        m118655I = 0;
                        m118655I2 = 0;
                        c8129c.m105857C(sparseIntArray);
                        c8129c.m105858D(sparseIntArray2);
                        c8129c.m105882u(m118655I);
                        c8129c.m105881t(m118655I2);
                        c8129c.m105861G(new C2370r0(view));
                        c8129c.m105865K(i12);
                        String str2 = null;
                        if (c3020p0 == null) {
                            str = c3020p0.f12057p;
                        } else {
                            str = null;
                        }
                        String str3 = "";
                        if (str == null) {
                            str = "";
                        }
                        c8129c.m105884w(str);
                        c8129c.m105886y(true);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("fromFeed", true);
                        if (c3000l0 == null) {
                            i15 = c3000l0.f11896q0;
                        } else {
                            i15 = -1;
                        }
                        bundle.putInt("fromTimelineTab", i15);
                        bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
                        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                        if (c3020p0 != null) {
                            bundle.putString("feedId", c3020p0.f12057p);
                            bundle.putString("userId", c3020p0.f12022B.f12280b);
                            if (c3020p0.m14493X()) {
                                bundle.putBoolean("viewOnly", true);
                            }
                            if (!TextUtils.isEmpty(c3020p0.m14528u())) {
                                c8129c.m105885x(false);
                            }
                        }
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        it = list.iterator();
                        while (it.hasNext()) {
                            ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile((ItemAlbumMobile) it.next());
                            if (c3020p0 != null) {
                                itemAlbumMobile2.f42605w = c3020p0.f12022B.f12282d;
                                itemAlbumMobile2.f42564O = c3020p0.f12062u;
                                itemAlbumMobile2.f42599t = c3020p0.f12057p;
                                itemAlbumMobile2.f42548C = itemAlbumMobile2.m40526m0();
                                itemAlbumMobile2.m40528o0(c3020p0);
                            }
                            arrayList.add(itemAlbumMobile2);
                        }
                        bundle.putParcelableArrayList("medialist", arrayList);
                        if (list.size() > 1) {
                            bundle.putBoolean("hasGridPhoto", true);
                            bundle.putInt("currentIndex", i13);
                        }
                        if (c3020p0 == null) {
                            z11 = c3020p0.m14506g0();
                        } else {
                            z11 = false;
                        }
                        bundle.putBoolean("EXTRA_SHOULD_SAVE_QUICK_COMMENT_TO_STORE", z11);
                        if (interfaceC2259a == null) {
                            C31995kc m154255c = C31995kc.m154255c();
                            if (c3020p0 != null) {
                                str2 = c3020p0.f12057p;
                            }
                            if (str2 != null) {
                                str3 = str2;
                            }
                            m154255c.m154258d(str3, c8129c);
                            interfaceC2259a.mo11941Yk(animationTarget, itemAlbumMobile.f42607x, bundle, c8129c, c3020p0, trackingSource, true);
                            return;
                        }
                        return;
                    }
                    int size = list.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        sparseIntArray.put(i17, i11);
                    }
                    sparseIntArray2.put(i11, 0);
                    m118655I = AbstractC23136l9.m118655I(AbstractC19181d.abc_action_bar_default_height_material);
                    m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.height_tab_main);
                    c8129c.m105857C(sparseIntArray);
                    c8129c.m105858D(sparseIntArray2);
                    c8129c.m105882u(m118655I);
                    c8129c.m105881t(m118655I2);
                    c8129c.m105861G(new C2370r0(view));
                    c8129c.m105865K(i12);
                    String str22 = null;
                    if (c3020p0 == null) {
                    }
                    String str32 = "";
                    if (str == null) {
                    }
                    c8129c.m105884w(str);
                    c8129c.m105886y(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("fromFeed", true);
                    if (c3000l0 == null) {
                    }
                    bundle2.putInt("fromTimelineTab", i15);
                    bundle2.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
                    bundle2.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                    if (c3020p0 != null) {
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    bundle2.putParcelableArrayList("medialist", arrayList2);
                    if (list.size() > 1) {
                    }
                    if (c3020p0 == null) {
                    }
                    bundle2.putBoolean("EXTRA_SHOULD_SAVE_QUICK_COMMENT_TO_STORE", z11);
                    if (interfaceC2259a == null) {
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public final C8874e getFeedCollapsedGridModule() {
        C8874e c8874e = this.f44655M;
        if (c8874e != null) {
            return c8874e;
        }
        AbstractC19074t.m100223u("feedCollapsedGridModule");
        return null;
    }

    public final C8883n getFeedGridModule() {
        C8883n c8883n = this.f44656N;
        if (c8883n != null) {
            return c8883n;
        }
        AbstractC19074t.m100223u("feedGridModule");
        return null;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f44657O;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    public final int getMLayoutMode() {
        return this.f44653K;
    }

    public final InterfaceC2260b getMPhotoLongClickListener() {
        return this.f44659Q;
    }

    public final InterfaceC8127a getMVideoClickListener() {
        return this.f44661S;
    }

    public final int getMaxHeight() {
        return this.f44658P;
    }

    /* renamed from: n0 */
    public final void m44046n0(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        try {
            this.f44653K = i11;
            this.f44654L = new C8880k(context);
            setFeedGridModule(new C8883n(context));
            setFeedCollapsedGridModule(new C8874e(context));
            int i12 = this.f44653K;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        if (i12 == 4) {
                            m44048p0();
                        }
                    } else {
                        m44047o0();
                    }
                } else {
                    m44048p0();
                }
            } else {
                m44048p0();
            }
            setMAQ(new C23528a(context));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: o0 */
    public final void m44047o0() {
        getFeedCollapsedGridModule().m89106L().m89028L(-1, -2).m89027K(true);
        getFeedCollapsedGridModule().mo44614b1(8);
        getFeedCollapsedGridModule().f47415W0 = this;
        mo69681L(getFeedCollapsedGridModule());
    }

    /* renamed from: p0 */
    public final void m44048p0() {
        C8880k c8880k = this.f44654L;
        C8880k c8880k2 = null;
        if (c8880k == null) {
            AbstractC19074t.m100223u("feedGridDynamicModule");
            c8880k = null;
        }
        c8880k.m89106L().m89028L(-2, -2).m89026J(true);
        C8880k c8880k3 = this.f44654L;
        if (c8880k3 == null) {
            AbstractC19074t.m100223u("feedGridDynamicModule");
            c8880k3 = null;
        }
        c8880k3.mo44614b1(8);
        C8880k c8880k4 = this.f44654L;
        if (c8880k4 == null) {
            AbstractC19074t.m100223u("feedGridDynamicModule");
            c8880k4 = null;
        }
        c8880k4.f47459a1 = this;
        C8880k c8880k5 = this.f44654L;
        if (c8880k5 == null) {
            AbstractC19074t.m100223u("feedGridDynamicModule");
        } else {
            c8880k2 = c8880k5;
        }
        mo69681L(c8880k2);
        getFeedGridModule().m89106L().m89028L(-2, -2).m89026J(true);
        getFeedGridModule().mo44614b1(8);
        getFeedGridModule().f47506g1 = this;
        mo69681L(getFeedGridModule());
    }

    @Override // i40.InterfaceC20272b
    /* renamed from: q */
    public Rect mo43986q(int i11) {
        C8880k c8880k;
        try {
            c8880k = this.f44654L;
            if (c8880k == null) {
                AbstractC19074t.m100223u("feedGridDynamicModule");
                c8880k = null;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (c8880k.m89136d0() == 0) {
            C8880k c8880k2 = this.f44654L;
            if (c8880k2 == null) {
                AbstractC19074t.m100223u("feedGridDynamicModule");
                c8880k2 = null;
            }
            return c8880k2.mo43986q(i11);
        }
        if (getFeedGridModule().m89136d0() == 0) {
            return getFeedGridModule().mo43986q(i11);
        }
        if (getFeedCollapsedGridModule().m89136d0() == 0) {
            return getFeedCollapsedGridModule().m47340q(i11);
        }
        return null;
    }

    /* renamed from: r0 */
    public final void m44049r0(int i11, int i12, C3000l0 c3000l0, int i13, View view, boolean z11, int i14, TrackingSource trackingSource, InterfaceC2259a interfaceC2259a) {
        C3020p0 c3020p0;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14324b0(i13);
        } else {
            c3020p0 = null;
        }
        C3020p0 c3020p02 = c3020p0;
        if (c3020p02 == null) {
            return;
        }
        ArrayList m108825o = AbstractC20826v0.m108825o(m44043m0(c3000l0, i13));
        AbstractC19074t.m100207e(m108825o, "convertAlbumItemsToPhotos(...)");
        if (m108825o.isEmpty()) {
            return;
        }
        int i15 = this.f44653K;
        if (i15 != 0 && i15 != 1) {
            if (i15 != 2 && i15 != 3) {
                if (i15 != 4) {
                    if (i15 == 6) {
                        m44033c0(c3020p02, m108825o, z11);
                    }
                }
            } else {
                m44038h0(c3020p02, m108825o, c3000l0, i13, view, z11, interfaceC2259a, trackingSource);
            }
            requestLayout();
        }
        m44042l0(c3020p02, m108825o, i11, i12, c3000l0, i13, z11, i14, interfaceC2259a, trackingSource);
        requestLayout();
    }

    public final void setFeedCollapsedGridModule(C8874e c8874e) {
        AbstractC19074t.m100208f(c8874e, "<set-?>");
        this.f44655M = c8874e;
    }

    public final void setFeedGridModule(C8883n c8883n) {
        AbstractC19074t.m100208f(c8883n, "<set-?>");
        this.f44656N = c8883n;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f44657O = c23528a;
    }

    public final void setMLayoutMode(int i11) {
        this.f44653K = i11;
    }

    public final void setMPhotoLongClickListener(InterfaceC2260b interfaceC2260b) {
        this.f44659Q = interfaceC2260b;
    }

    public final void setMVideoClickListener(InterfaceC8127a interfaceC8127a) {
        this.f44661S = interfaceC8127a;
    }

    public final void setMaxHeight(int i11) {
        this.f44658P = i11;
    }

    public final void setOnHorFeedGrListener(C25897n0.c cVar) {
        this.f44660R = cVar;
    }

    public final void setOnVideoClickListener(InterfaceC8127a interfaceC8127a) {
        this.f44661S = interfaceC8127a;
    }

    public final void setPhotoLongClickListener(InterfaceC2260b interfaceC2260b) {
        this.f44659Q = interfaceC2260b;
    }
}
