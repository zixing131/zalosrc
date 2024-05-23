package com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper;

import android.view.View;
import androidx.core.view.AbstractC1595r0;
import androidx.recyclerview.widget.RecyclerView;
import c20.C3211a;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelFollowSuggestionItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.FollowSuggestionVideoLayout;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import s20.AbstractC26112n;
import z10.C31162f;

/* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.a */
/* loaded from: classes5.dex */
public final class C9765a extends RecyclerView.AbstractC1892s {

    /* renamed from: a */
    private final OverScrollableRecyclerView f51242a;

    /* renamed from: b */
    private final FollowSuggestionVideoLayout f51243b;

    /* renamed from: c */
    private final C3211a f51244c;

    /* renamed from: d */
    private String f51245d;

    /* renamed from: e */
    private int f51246e;

    /* renamed from: f */
    private int f51247f;

    /* renamed from: g */
    private int f51248g;

    /* renamed from: h */
    private final float f51249h;

    /* renamed from: i */
    private final float f51250i;

    /* renamed from: j */
    private final ArrayList f51251j;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.a$a */
    /* loaded from: classes5.dex */
    public static final class a implements OverScrollableRecyclerView.InterfaceC10830a {
        a() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            C9765a.this.f51243b.setListPosition(f11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f51253q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52661a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52661a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f51254q = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m52662a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52662a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f51255q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.f51255q = view;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52663a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52663a() {
            ((ChannelFollowSuggestionItem) this.f51255q).setThumbnailVisible(false);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.a$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ View f51256q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(1);
            this.f51256q = view;
        }

        /* renamed from: a */
        public final void m52664a(boolean z11) {
            ((ChannelFollowSuggestionItem) this.f51256q).setLoadingVisible(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52664a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    public C9765a(OverScrollableRecyclerView overScrollableRecyclerView, FollowSuggestionVideoLayout followSuggestionVideoLayout, C3211a c3211a) {
        AbstractC19074t.m100208f(overScrollableRecyclerView, "recyclerView");
        AbstractC19074t.m100208f(followSuggestionVideoLayout, "videoLayout");
        AbstractC19074t.m100208f(c3211a, "snapHelper");
        this.f51242a = overScrollableRecyclerView;
        this.f51243b = followSuggestionVideoLayout;
        this.f51244c = c3211a;
        this.f51247f = -1;
        this.f51248g = -1;
        this.f51249h = 0.1f;
        this.f51250i = 0.5f;
        this.f51251j = new ArrayList();
        overScrollableRecyclerView.m56145b2(new a());
    }

    /* renamed from: h */
    private final void m52646h(int i11, View view) {
        List m51168m;
        Object m131205e0;
        View view2;
        RecyclerView.AbstractC1880g adapter = this.f51242a.getAdapter();
        AbstractC19074t.m100206d(adapter, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.adapter.ChannelFollowSuggestionAdapter");
        C31162f c31162f = (C31162f) adapter;
        int i12 = this.f51248g;
        C9769e c9769e = null;
        if (i12 > -1) {
            RecyclerView.AbstractC1888o layoutManager = this.f51242a.getLayoutManager();
            if (layoutManager != null) {
                view2 = layoutManager.mo9732P(i12);
            } else {
                view2 = null;
            }
            if (!(view2 instanceof ChannelFollowSuggestionItem)) {
                view2 = null;
            }
            ChannelFollowSuggestionItem channelFollowSuggestionItem = (ChannelFollowSuggestionItem) view2;
            if (channelFollowSuggestionItem != null) {
                channelFollowSuggestionItem.m52052d();
            }
            this.f51248g = -1;
        }
        if (view instanceof ChannelFollowSuggestionItem) {
            this.f51248g = i11;
            this.f51243b.setFirstFrameAction(b.f51253q);
            this.f51243b.setLoadingChangedAction(c.f51254q);
            ChannelFollowSuggestionItem channelFollowSuggestionItem2 = (ChannelFollowSuggestionItem) view;
            this.f51243b.setItemPosition(channelFollowSuggestionItem2.getLeft());
            this.f51243b.m52160z(channelFollowSuggestionItem2.getScaleX(), channelFollowSuggestionItem2.getScaleY());
            FollowSuggestionVideoLayout followSuggestionVideoLayout = this.f51243b;
            Section m50732J = ((Channel) c31162f.m151557M().get(this.f51248g)).m50732J();
            if (m50732J != null && (m51168m = m50732J.m51168m()) != null) {
                m131205e0 = AbstractC25332a0.m131205e0(m51168m);
                Video video = (Video) m131205e0;
                if (video != null) {
                    c9769e = C9769e.Companion.m52769a(video);
                }
            }
            followSuggestionVideoLayout.setVideoSource(c9769e);
            this.f51243b.setFirstFrameAction(new d(view));
            this.f51243b.setLoadingChangedAction(new e(view));
        }
    }

    /* renamed from: i */
    private final void m52647i(View view, int i11) {
        ChannelFollowSuggestionItem channelFollowSuggestionItem;
        Channel suggestedChannel;
        if (m52654m() && (view instanceof ChannelFollowSuggestionItem) && (suggestedChannel = (channelFollowSuggestionItem = (ChannelFollowSuggestionItem) view).getSuggestedChannel()) != null && !this.f51251j.contains(suggestedChannel.m50769l()) && channelFollowSuggestionItem.getLeft() >= 0 && channelFollowSuggestionItem.getRight() <= this.f51242a.getWidth()) {
            m52648n(suggestedChannel, i11);
            this.f51251j.add(suggestedChannel.m50769l());
        }
    }

    /* renamed from: n */
    private final void m52648n(Channel channel, int i11) {
        C19205a.m100678X(C19205a.f95429a, channel, null, Integer.valueOf(i11), this.f51245d, 2, null);
    }

    /* renamed from: t */
    private final void m52649t(View view, RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC19074t.m100205c(this.f51244c.mo10398c(abstractC1888o, view));
        float min = 1.0f - Math.min(1.0f, Math.abs(r5[0] / view.getWidth()));
        float f11 = this.f51250i;
        view.setAlpha((1.0f - f11) + (f11 * min));
        float f12 = this.f51249h;
        float f13 = (1.0f - f12) + (f12 * min);
        view.setScaleX(f13);
        view.setScaleY(f13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: b */
    public void mo952b(RecyclerView recyclerView, int i11) {
        C31162f c31162f;
        int i12;
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        if (i11 == 0) {
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                return;
            }
            RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
            View view = null;
            if (adapter instanceof C31162f) {
                c31162f = (C31162f) adapter;
            } else {
                c31162f = null;
            }
            if (c31162f == null) {
                return;
            }
            View mo10402h = this.f51244c.mo10402h(layoutManager);
            if (mo10402h != null) {
                this.f51247f = layoutManager.m10112b(mo10402h);
                view = mo10402h;
            }
            if (view != null && (i12 = this.f51247f) >= 0 && i12 <= c31162f.mo10003k() - 1) {
                if (AbstractC26112n.m134422s(view) != layoutManager.getWidth() / 2) {
                    this.f51244c.m16326s(this.f51247f);
                }
                int i13 = this.f51248g;
                int i14 = this.f51247f;
                if (i13 != i14) {
                    m52646h(i14, view);
                }
            } else {
                this.f51246e = i11;
                return;
            }
        }
        this.f51246e = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: d */
    public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
        View mo10402h;
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (mo10402h = this.f51244c.mo10402h(layoutManager)) == null) {
            return;
        }
        int m10112b = layoutManager.m10112b(mo10402h);
        this.f51247f = m10112b;
        View mo9732P = layoutManager.mo9732P(m10112b - 1);
        View mo9732P2 = layoutManager.mo9732P(this.f51247f + 1);
        m52647i(mo10402h, this.f51247f);
        m52647i(mo9732P, this.f51247f - 1);
        m52647i(mo9732P2, this.f51247f + 1);
        Iterator it = AbstractC1595r0.m8168a(recyclerView).iterator();
        while (it.hasNext()) {
            m52649t((View) it.next(), layoutManager);
        }
        View mo9732P3 = layoutManager.mo9732P(this.f51248g);
        if (mo9732P3 == null) {
            mo9732P3 = mo10402h;
        }
        this.f51243b.setItemPosition(mo9732P3.getLeft());
        this.f51243b.m52160z(mo9732P3.getScaleX(), mo9732P3.getScaleY());
        if (this.f51248g == -1 && this.f51246e == 0) {
            m52646h(this.f51247f, mo10402h);
            return;
        }
        if (this.f51246e == 2) {
            if (i11 > 0 && AbstractC26112n.m134422s(mo10402h) > layoutManager.getWidth() / 2) {
                int i13 = this.f51248g;
                int i14 = this.f51247f;
                if (i13 != i14) {
                    m52646h(i14, mo10402h);
                    return;
                }
                return;
            }
            if (i11 > 0 && AbstractC26112n.m134422s(mo10402h) < layoutManager.getWidth() / 2) {
                int i15 = this.f51248g;
                int i16 = this.f51247f;
                if (i15 == i16) {
                    int i17 = i16 + 1;
                    if (mo9732P2 == null) {
                        return;
                    }
                    m52646h(i17, mo9732P2);
                    return;
                }
                return;
            }
            if (i11 < 0 && AbstractC26112n.m134422s(mo10402h) > layoutManager.getWidth() / 2) {
                int i18 = this.f51248g;
                int i19 = this.f51247f;
                if (i18 == i19) {
                    int i21 = i19 - 1;
                    if (mo9732P == null) {
                        return;
                    }
                    m52646h(i21, mo9732P);
                    return;
                }
                return;
            }
            if (i11 < 0 && AbstractC26112n.m134422s(mo10402h) < layoutManager.getWidth() / 2) {
                int i22 = this.f51248g;
                int i23 = this.f51247f;
                if (i22 != i23) {
                    m52646h(i23, mo10402h);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m52650g() {
        this.f51243b.m52154k();
        mo10176d(this.f51242a, 0, 0);
    }

    /* renamed from: j */
    public final void m52651j() {
        this.f51243b.m52155l();
    }

    /* renamed from: k */
    public final int m52652k() {
        return this.f51248g;
    }

    /* renamed from: l */
    public final int m52653l() {
        return this.f51247f;
    }

    /* renamed from: m */
    public final boolean m52654m() {
        return this.f51243b.m52156m();
    }

    /* renamed from: o */
    public final void m52655o() {
        this.f51243b.m52153A();
        this.f51247f = -1;
        this.f51248g = -1;
        mo10176d(this.f51242a, 0, 0);
    }

    /* renamed from: p */
    public final boolean m52656p() {
        int i11 = this.f51247f;
        if (i11 != -1) {
            this.f51244c.m16326s(i11);
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m52657q() {
        int i11 = this.f51247f;
        if (i11 > 0) {
            this.f51244c.m16326s(i11 - 1);
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m52658r() {
        int i11;
        int i12 = this.f51247f;
        RecyclerView.AbstractC1880g adapter = this.f51242a.getAdapter();
        if (adapter != null) {
            i11 = adapter.mo10003k();
        } else {
            i11 = 0;
        }
        if (i12 >= i11 - 1) {
            return false;
        }
        this.f51244c.m16326s(this.f51247f + 1);
        return true;
    }

    /* renamed from: s */
    public final void m52659s(String str) {
        this.f51245d = str;
    }
}
