package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.C1755a0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.adapters.C7076g7;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import p348mi.AbstractC23306f;
import p684yk.InterfaceC31005a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class SeasonalStickerPanelPage extends RecyclerView implements InterfaceC12966p {
    public static final C12939c Companion = new C12939c(null);

    /* renamed from: V0 */
    private C7076g7 f67031V0;

    /* renamed from: W0 */
    private final InterfaceC24854k f67032W0;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.SeasonalStickerPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12937a extends GridLayoutManager.AbstractC1865b {

        /* renamed from: e */
        final /* synthetic */ GridLayoutManager f67033e;

        C12937a(GridLayoutManager gridLayoutManager) {
            this.f67033e = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            if (i11 < 2) {
                return this.f67033e.m9668X2();
            }
            return 1;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.SeasonalStickerPanelPage$b */
    /* loaded from: classes6.dex */
    public static final class C12938b extends RecyclerView.AbstractC1887n {
        C12938b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int m118742r;
            int i11;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            if (m9817A0 < 2) {
                rect.set(0, 0, 0, 0);
                return;
            }
            int width = ((SeasonalStickerPanelPage.this.getWidth() / 4) - C7076g7.f38681B) / 2;
            if (m9817A0 < 5) {
                m118742r = AbstractC23136l9.m118742r(6.0f);
                i11 = AbstractC23136l9.m118742r(7.0f);
            } else {
                m118742r = AbstractC23136l9.m118742r(7.0f);
                i11 = m118742r;
            }
            rect.set(width, m118742r, width, i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.SeasonalStickerPanelPage$c */
    /* loaded from: classes6.dex */
    public static final class C12939c {
        private C12939c() {
        }

        public /* synthetic */ C12939c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.SeasonalStickerPanelPage$d */
    /* loaded from: classes6.dex */
    static final class C12940d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12940d f67035q = new C12940d();

        C12940d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC31005a mo12V4() {
            InterfaceC31005a m120726x1 = AbstractC23306f.m120726x1();
            AbstractC19074t.m100207e(m120726x1, "provideStickerRepo(...)");
            return m120726x1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SeasonalStickerPanelPage(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100205c(context);
        m129210a = AbstractC24856m.m129210a(C12940d.f67035q);
        this.f67032W0 = m129210a;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
        setClipToPadding(false);
        setLayoutManager(gridLayoutManager);
        setOverScrollMode(2);
        gridLayoutManager.m9671f3(new C12937a(gridLayoutManager));
        m9816A(new C12938b());
    }

    private final InterfaceC31005a getStickerRepo() {
        return (InterfaceC31005a) this.f67032W0.getValue();
    }

    /* renamed from: a2 */
    public final void m72834a2(int i11) {
        C7076g7 c7076g7 = this.f67031V0;
        C7076g7 c7076g72 = null;
        if (c7076g7 == null) {
            AbstractC19074t.m100223u("_adapter");
            c7076g7 = null;
        }
        c7076g7.f38690y = i11;
        C7076g7 c7076g73 = this.f67031V0;
        if (c7076g73 == null) {
            AbstractC19074t.m100223u("_adapter");
        } else {
            c7076g72 = c7076g73;
        }
        c7076g72.m36123W(getStickerRepo().mo150752p());
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: g */
    public void mo72819g() {
        C7076g7 c7076g7 = this.f67031V0;
        if (c7076g7 == null) {
            AbstractC19074t.m100223u("_adapter");
            c7076g7 = null;
        }
        c7076g7.m10008p();
    }

    public Integer getPageId() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: i */
    public boolean mo72820i() {
        RecyclerView.AbstractC1888o layoutManager = getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).m9740Y1() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeasonalStickerPanelPage(Context context, C1755a0 c1755a0) {
        this(context);
        AbstractC19074t.m100208f(c1755a0, "seasonalViewEventLiveData");
        C7076g7 c7076g7 = new C7076g7(context, c1755a0);
        this.f67031V0 = c7076g7;
        setAdapter(c7076g7);
    }
}
