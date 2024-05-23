package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import ao.InterfaceC2263e;
import bo.C3000l0;
import bo.EnumC2963d3;
import bo.InterfaceC2946a1;
import com.zing.zalo.uidrawing.C16719g;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hf0.C20047i;
import on0.AbstractC24341v;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public abstract class FeedItemMusicModuleView extends FeedItemBaseModuleView implements C20047i.a {

    /* renamed from: f0 */
    private InterfaceC2946a1 f44538f0;

    /* renamed from: g0 */
    private final InterfaceC24854k f44539g0;

    /* renamed from: h0 */
    private final InterfaceC24854k f44540h0;

    /* renamed from: i0 */
    private InterfaceC2263e f44541i0;

    /* renamed from: j0 */
    private C3000l0 f44542j0;

    /* renamed from: k0 */
    private Integer f44543k0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemMusicModuleView$a */
    /* loaded from: classes4.dex */
    public static final class C8101a extends AbstractC19075u implements InterfaceC18494a {
        C8101a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C8439y2 mo12V4() {
            Context context = FeedItemMusicModuleView.this.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new C8439y2(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemMusicModuleView$b */
    /* loaded from: classes4.dex */
    public static final class C8102b extends AbstractC19075u implements InterfaceC18494a {
        C8102b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C8238b4 mo12V4() {
            Context context = FeedItemMusicModuleView.this.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new C8238b4(context);
        }
    }

    public FeedItemMusicModuleView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C8102b());
        this.f44539g0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8101a());
        this.f44540h0 = m129210a2;
    }

    /* renamed from: n0 */
    private final void m43870n0(InterfaceC2946a1 interfaceC2946a1) {
        int i11 = this.f44322M;
        if (i11 != 0) {
            if (i11 != 6 && i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    return;
                }
            } else {
                m43871o0(interfaceC2946a1);
                return;
            }
        }
        mo43878v0();
        m43872p0(interfaceC2946a1);
        mo43880x0();
        mo43876t0();
    }

    /* renamed from: o0 */
    private final void m43871o0(InterfaceC2946a1 interfaceC2946a1) {
        getFeedItemSongInfoModule().mo44614b1(0);
        getFeedItemSongInfoModule().m44573r1(interfaceC2946a1, this.f44541i0);
        getFeedItemMusicLyric().mo44614b1(8);
    }

    /* renamed from: p0 */
    private final void m43872p0(InterfaceC2946a1 interfaceC2946a1) {
        getFeedItemSongInfoModule().mo44614b1(0);
        getFeedItemSongInfoModule().m44573r1(interfaceC2946a1, this.f44541i0);
        if (interfaceC2946a1.mo14161e().mo14188a() && !interfaceC2946a1.mo14161e().mo14189c().m45711h() && interfaceC2946a1.mo14160c().getState() != EnumC2963d3.f11684s) {
            getFeedItemMusicLyric().mo44614b1(0);
            getFeedItemMusicLyric().m44969o1(interfaceC2946a1.mo14161e().mo14189c());
        } else {
            getFeedItemMusicLyric().mo44614b1(8);
        }
        getFeedItemSongInfoModule().mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.z2

            /* renamed from: q */
            public final /* synthetic */ FeedItemMusicModuleView f45896q;

            public /* synthetic */ C8447z2(FeedItemMusicModuleView this) {
                r2 = this;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                FeedItemMusicModuleView.m43873q0(InterfaceC2946a1.this, r2, c16719g);
            }
        });
    }

    /* renamed from: q0 */
    public static final void m43873q0(InterfaceC2946a1 interfaceC2946a1, FeedItemMusicModuleView feedItemMusicModuleView, C16719g c16719g) {
        InterfaceC2263e interfaceC2263e;
        AbstractC19074t.m100208f(interfaceC2946a1, "$feedMusicData");
        AbstractC19074t.m100208f(feedItemMusicModuleView, "this$0");
        if ((!interfaceC2946a1.mo13948J() || interfaceC2946a1.mo14160c().getState() == EnumC2963d3.f11684s) && (interfaceC2263e = feedItemMusicModuleView.f44541i0) != null) {
            interfaceC2263e.mo11981qg(interfaceC2946a1.mo13947I(), interfaceC2946a1.mo14159b(), interfaceC2946a1.mo14160c().getState());
        }
    }

    /* renamed from: s0 */
    private final void m43874s0() {
        int i11 = this.f44322M;
        if (i11 != 0) {
            if (i11 != 6 && i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    return;
                }
            } else {
                getFeedItemMusicLyric().mo44614b1(8);
                getFeedItemSongInfoModule().mo44614b1(8);
                return;
            }
        }
        getFeedItemMusicLyric().mo44614b1(8);
        getFeedItemSongInfoModule().mo44614b1(8);
        getFeedItemSongInfoModule().mo89109M0(null);
        mo43879w0();
        mo43876t0();
    }

    public final C8439y2 getFeedItemMusicLyric() {
        return (C8439y2) this.f44540h0.getValue();
    }

    public final C8238b4 getFeedItemSongInfoModule() {
        return (C8238b4) this.f44539g0.getValue();
    }

    public final InterfaceC2263e getFeedMusicCallback() {
        return this.f44541i0;
    }

    public final InterfaceC2946a1 getFeedMusicData() {
        return this.f44538f0;
    }

    /* renamed from: r0 */
    public final boolean m43875r0() {
        boolean m127128x;
        InterfaceC2946a1 interfaceC2946a1 = this.f44538f0;
        if (interfaceC2946a1 != null) {
            AbstractC19074t.m100205c(interfaceC2946a1);
            m127128x = AbstractC24341v.m127128x(interfaceC2946a1.mo14159b());
            if (!m127128x) {
                InterfaceC2946a1 interfaceC2946a12 = this.f44538f0;
                AbstractC19074t.m100205c(interfaceC2946a12);
                if (!interfaceC2946a12.mo13948J()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void setFeedMusicCallback(InterfaceC2263e interfaceC2263e) {
        this.f44541i0 = interfaceC2263e;
    }

    public final void setFeedMusicData(InterfaceC2946a1 interfaceC2946a1) {
        this.f44538f0 = interfaceC2946a1;
    }

    /* renamed from: t0 */
    protected abstract void mo43876t0();

    /* renamed from: u0 */
    protected abstract void mo43877u0(C3000l0 c3000l0, Integer num);

    /* renamed from: v0 */
    protected abstract void mo43878v0();

    /* renamed from: w0 */
    protected abstract void mo43879w0();

    /* renamed from: x0 */
    protected abstract void mo43880x0();

    /* renamed from: y0 */
    public final void m43881y0(C3000l0 c3000l0, Integer num) {
        this.f44542j0 = c3000l0;
        this.f44543k0 = num;
        getFeedItemMusicLyric().mo44614b1(8);
        getFeedItemSongInfoModule().mo44614b1(8);
        getFeedItemSongInfoModule().mo89109M0(null);
        mo43879w0();
        mo43877u0(this.f44542j0, this.f44543k0);
    }

    /* renamed from: z0 */
    public final void m43882z0(InterfaceC2946a1 interfaceC2946a1) {
        this.f44538f0 = interfaceC2946a1;
        if (interfaceC2946a1 != null) {
            m43870n0(interfaceC2946a1);
        } else {
            m43874s0();
        }
    }

    public FeedItemMusicModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C8102b());
        this.f44539g0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8101a());
        this.f44540h0 = m129210a2;
    }
}
