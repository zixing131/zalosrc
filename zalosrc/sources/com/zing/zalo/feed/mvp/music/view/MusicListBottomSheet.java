package com.zing.zalo.feed.mvp.music.view;

import ac.C0732w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import bo.C3022p2;
import bo.C3054x;
import bo.InterfaceC3058y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectResult;
import com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p205hc.C19964c;
import p227i3.C20218v;
import p489rn.C25880i2;
import p490rp.AbstractC25951b;
import p490rp.AbstractC25952c;
import p509sp.AbstractC26363l;
import p554up.C27356d;
import p649xl.C30033s8;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class MusicListBottomSheet extends BottomSheetZaloViewWithAnim implements C25880i2.a {
    public static final C8599a Companion = new C8599a(null);

    /* renamed from: W0 */
    private C25880i2 f46362W0;

    /* renamed from: X0 */
    private C25880i2 f46363X0;

    /* renamed from: Y0 */
    private C30033s8 f46364Y0;

    /* renamed from: Z0 */
    private LinearLayoutManager f46365Z0;

    /* renamed from: a1 */
    private final InterfaceC24854k f46366a1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C27356d.class), new C8612n(new C8611m(this)), new C8613o());

    /* renamed from: b1 */
    private C16572d1 f46367b1;

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8599a {
        private C8599a() {
        }

        public /* synthetic */ C8599a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$b */
    /* loaded from: classes4.dex */
    public static final class C8600b extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        final /* synthetic */ C30033s8 f46368a;

        /* renamed from: b */
        final /* synthetic */ MusicListBottomSheet f46369b;

        C8600b(C30033s8 c30033s8, MusicListBottomSheet musicListBottomSheet) {
            this.f46368a = c30033s8;
            this.f46369b = musicListBottomSheet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            int m118742r = AbstractC23136l9.m118742r(12.0f);
            int m118742r2 = AbstractC23136l9.m118742r(4.0f) / 2;
            int m9817A0 = this.f46368a.f139313u.m9817A0(view);
            if (m9817A0 != 0) {
                C25880i2 c25880i2 = this.f46369b.f46363X0;
                if (c25880i2 == null) {
                    AbstractC19074t.m100223u("tabsAdapter");
                    c25880i2 = null;
                }
                if (m9817A0 == c25880i2.mo10003k() - 1) {
                    rect.set(m118742r2, 0, m118742r, 0);
                    return;
                } else {
                    rect.set(m118742r2, 0, m118742r2, 0);
                    return;
                }
            }
            rect.set(m118742r, 0, m118742r2, 0);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$c */
    /* loaded from: classes4.dex */
    public static final class C8601c extends RecyclerView.AbstractC1892s {
        C8601c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 1) {
                MusicListBottomSheet.this.m45821yM().m140105G0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$d */
    /* loaded from: classes4.dex */
    public static final class C8602d extends RecyclerView.AbstractC1887n {
        C8602d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            rect.set(0, AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(12.0f));
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$e */
    /* loaded from: classes4.dex */
    public static final class C8603e extends RecyclerView.AbstractC1892s {

        /* renamed from: b */
        final /* synthetic */ NoPredictiveItemAnimLinearLayoutMngr f46372b;

        C8603e(NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr) {
            this.f46372b = noPredictiveItemAnimLinearLayoutMngr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "view");
            if (i11 == 0) {
                MusicListBottomSheet.this.m45821yM().m140106I0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                int m9745c2 = this.f46372b.m9745c2();
                int m10127i = this.f46372b.m10127i();
                if (i12 > 0) {
                    MusicListBottomSheet.this.m45821yM().m140103E0();
                }
                MusicListBottomSheet.this.m45821yM().m140104F0(m9745c2, m10127i);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$f */
    /* loaded from: classes4.dex */
    public static final class C8604f extends AbstractC18391a {
        C8604f() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11;
            C30033s8 c30033s8 = MusicListBottomSheet.this.f46364Y0;
            if (c30033s8 == null) {
                AbstractC19074t.m100223u("binding");
                c30033s8 = null;
            }
            ImageView imageView = c30033s8.f139311s;
            if (editable != null && editable.toString().length() > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            imageView.setVisibility(i11);
            MusicListBottomSheet.this.m45821yM().m140101C0(String.valueOf(editable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$g */
    /* loaded from: classes4.dex */
    public static final class C8605g extends AbstractC19075u implements InterfaceC18505l {
        C8605g() {
            super(1);
        }

        /* renamed from: a */
        public final void m45825a(List list) {
            C25880i2 c25880i2 = MusicListBottomSheet.this.f46363X0;
            C25880i2 c25880i22 = null;
            if (c25880i2 == null) {
                AbstractC19074t.m100223u("tabsAdapter");
                c25880i2 = null;
            }
            AbstractC19074t.m100205c(list);
            c25880i2.m133518O(list);
            C25880i2 c25880i23 = MusicListBottomSheet.this.f46363X0;
            if (c25880i23 == null) {
                AbstractC19074t.m100223u("tabsAdapter");
            } else {
                c25880i22 = c25880i23;
            }
            c25880i22.m10008p();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45825a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$h */
    /* loaded from: classes4.dex */
    public static final class C8606h extends AbstractC19075u implements InterfaceC18505l {
        C8606h() {
            super(1);
        }

        /* renamed from: a */
        public final void m45826a(List list) {
            C25880i2 c25880i2 = MusicListBottomSheet.this.f46362W0;
            C25880i2 c25880i22 = null;
            if (c25880i2 == null) {
                AbstractC19074t.m100223u("bodyAdapter");
                c25880i2 = null;
            }
            AbstractC19074t.m100205c(list);
            c25880i2.m133518O(list);
            C25880i2 c25880i23 = MusicListBottomSheet.this.f46362W0;
            if (c25880i23 == null) {
                AbstractC19074t.m100223u("bodyAdapter");
            } else {
                c25880i22 = c25880i23;
            }
            c25880i22.m10008p();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45826a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$i */
    /* loaded from: classes4.dex */
    public static final class C8607i extends AbstractC19075u implements InterfaceC18505l {
        C8607i() {
            super(1);
        }

        /* renamed from: a */
        public final void m45827a(C3022p2 c3022p2) {
            C25880i2 c25880i2 = MusicListBottomSheet.this.f46362W0;
            if (c25880i2 == null) {
                AbstractC19074t.m100223u("bodyAdapter");
                c25880i2 = null;
            }
            AbstractC19074t.m100205c(c3022p2);
            c25880i2.m133520Q(c3022p2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45827a((C3022p2) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$j */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8608j extends C19071q implements InterfaceC18505l {
        C8608j(Object obj) {
            super(1, obj, MusicListBottomSheet.class, "handleTriggerEvent", "handleTriggerEvent(Lcom/zing/zalo/arch/ui/Event;)V", 0);
        }

        /* renamed from: h */
        public final void m45828h(C19964c c19964c) {
            AbstractC19074t.m100208f(c19964c, "p0");
            ((MusicListBottomSheet) this.f94922q).m45824zM(c19964c);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45828h((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$k */
    /* loaded from: classes4.dex */
    public static final class C8609k extends AbstractC19075u implements InterfaceC18505l {
        C8609k() {
            super(1);
        }

        /* renamed from: a */
        public final void m45829a(C19964c c19964c) {
            MusicSelectResult musicSelectResult = (MusicSelectResult) c19964c.m103749a();
            if (musicSelectResult != null) {
                MusicListBottomSheet.this.m45820wM(musicSelectResult);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45829a((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$l */
    /* loaded from: classes4.dex */
    public static final class C8610l implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46378p;

        C8610l(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46378p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46378p;
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
            this.f46378p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$m */
    /* loaded from: classes4.dex */
    public static final class C8611m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f46379q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8611m(ZaloView zaloView) {
            super(0);
            this.f46379q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f46379q;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$n */
    /* loaded from: classes4.dex */
    public static final class C8612n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f46380q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8612n(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f46380q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f46380q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.view.MusicListBottomSheet$o */
    /* loaded from: classes4.dex */
    static final class C8613o extends AbstractC19075u implements InterfaceC18494a {
        C8613o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            Bundle m92688sK = MusicListBottomSheet.this.f72421L0.m92688sK();
            AbstractC19074t.m100207e(m92688sK, "requireArguments(...)");
            return new C27356d.p(AbstractC25951b.m133688a(m92688sK));
        }
    }

    public MusicListBottomSheet() {
        m78539iM(true);
    }

    /* renamed from: AM */
    private final void m45803AM(C30033s8 c30033s8, Context context) {
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(context);
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        this.f46365Z0 = noPredictiveItemAnimLinearLayoutMngr;
        c30033s8.f139313u.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        c30033s8.f139313u.setVisibility(0);
        c30033s8.f139313u.m9816A(new C8600b(c30033s8, this));
        c30033s8.f139313u.m9826E(new C8601c());
        AbstractC20826v0.m108780Q0(c30033s8.f139313u);
        C25880i2 c25880i2 = new C25880i2(context);
        this.f46363X0 = c25880i2;
        c25880i2.m133519P(this);
        FeedRecyclerView feedRecyclerView = c30033s8.f139313u;
        C25880i2 c25880i22 = this.f46363X0;
        if (c25880i22 == null) {
            AbstractC19074t.m100223u("tabsAdapter");
            c25880i22 = null;
        }
        feedRecyclerView.setAdapter(c25880i22);
    }

    /* renamed from: BM */
    private final void m45804BM(C30033s8 c30033s8, Context context) {
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(context);
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        c30033s8.f139307B.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        c30033s8.f139307B.setVisibility(0);
        c30033s8.f139307B.setScrollbarFadingEnabled(false);
        c30033s8.f139307B.m9816A(new C8602d());
        c30033s8.f139307B.m9826E(new C8603e(noPredictiveItemAnimLinearLayoutMngr));
        C25880i2 c25880i2 = new C25880i2(context);
        this.f46362W0 = c25880i2;
        c25880i2.m9999J(true);
        C25880i2 c25880i22 = this.f46362W0;
        C25880i2 c25880i23 = null;
        if (c25880i22 == null) {
            AbstractC19074t.m100223u("bodyAdapter");
            c25880i22 = null;
        }
        c25880i22.m133519P(this);
        RecyclerView recyclerView = c30033s8.f139307B;
        C25880i2 c25880i24 = this.f46362W0;
        if (c25880i24 == null) {
            AbstractC19074t.m100223u("bodyAdapter");
        } else {
            c25880i23 = c25880i24;
        }
        recyclerView.setAdapter(c25880i23);
    }

    /* renamed from: CM */
    private final void m45805CM(final C30033s8 c30033s8) {
        c30033s8.f139315w.setSingleLine(true);
        c30033s8.f139315w.setEnableClearText(false);
        CustomEditText customEditText = c30033s8.f139315w;
        customEditText.setClearDrawable(AbstractC23136l9.m118665N(customEditText.getContext(), AbstractC17466e.transparent));
        c30033s8.f139315w.addTextChangedListener(new C8604f());
        c30033s8.f139306A.setOnTouchListener(new View.OnTouchListener() { // from class: tp.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m45806DM;
                m45806DM = MusicListBottomSheet.m45806DM(MusicListBottomSheet.this, c30033s8, view, motionEvent);
                return m45806DM;
            }
        });
        c30033s8.f139316x.setOnTouchListener(new View.OnTouchListener() { // from class: tp.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m45807EM;
                m45807EM = MusicListBottomSheet.m45807EM(MusicListBottomSheet.this, c30033s8, view, motionEvent);
                return m45807EM;
            }
        });
        C30033s8 c30033s82 = this.f46364Y0;
        if (c30033s82 == null) {
            AbstractC19074t.m100223u("binding");
            c30033s82 = null;
        }
        this.f46367b1 = new C16572d1(c30033s82.f139315w, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final boolean m45806DM(MusicListBottomSheet musicListBottomSheet, C30033s8 c30033s8, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(musicListBottomSheet, "this$0");
        AbstractC19074t.m100208f(c30033s8, "$this_initSearchInput");
        if (motionEvent.getAction() == 0) {
            RelativeLayout relativeLayout = c30033s8.f139316x;
            AbstractC19074t.m100207e(relativeLayout, "layoutInput");
            if (m45819vM(musicListBottomSheet, relativeLayout, motionEvent.getX(), motionEvent.getY(), 0, 8, null)) {
                musicListBottomSheet.m45821yM().m140107J0();
                musicListBottomSheet.m45823xM(true);
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final boolean m45807EM(MusicListBottomSheet musicListBottomSheet, C30033s8 c30033s8, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(musicListBottomSheet, "this$0");
        AbstractC19074t.m100208f(c30033s8, "$this_initSearchInput");
        if (motionEvent.getAction() == 0) {
            ImageView imageView = c30033s8.f139311s;
            AbstractC19074t.m100207e(imageView, "clearInput");
            if (m45819vM(musicListBottomSheet, imageView, motionEvent.getX(), motionEvent.getY(), 0, 8, null)) {
                try {
                    C30033s8 c30033s82 = musicListBottomSheet.f46364Y0;
                    C30033s8 c30033s83 = null;
                    if (c30033s82 == null) {
                        AbstractC19074t.m100223u("binding");
                        c30033s82 = null;
                    }
                    c30033s82.f139315w.setText("");
                    C30033s8 c30033s84 = musicListBottomSheet.f46364Y0;
                    if (c30033s84 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30033s83 = c30033s84;
                    }
                    c30033s83.f139315w.setSelection(0);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
        return false;
    }

    /* renamed from: FM */
    private final void m45808FM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C30033s8 c30033s8 = this.f46364Y0;
        if (c30033s8 == null) {
            AbstractC19074t.m100223u("binding");
            c30033s8 = null;
        }
        m45804BM(c30033s8, m92689tK);
        m45803AM(c30033s8, m92689tK);
        m45805CM(c30033s8);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        bottomSheetLayout.setPadding(0, AbstractC23136l9.m118737p0() + ((int) bottomSheetLayout.getResources().getDimension(AbstractC17454d.action_bar_default_height)), 0, 0);
        bottomSheetLayout.setEnableScrollY(true);
        bottomSheetLayout.setEnableToggleWHenClickNoConsume(false);
        bottomSheetLayout.setCanOverTranslateMaxY(true);
        m78539iM(false);
        bottomSheetLayout.setMaxTranslationY(mo37128eM());
        bottomSheetLayout.setMinTranslationY(mo37128eM());
        bottomSheetLayout.setMinimized(true);
        bottomSheetLayout.setOnTouchListener(new View.OnTouchListener() { // from class: tp.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m45809GM;
                m45809GM = MusicListBottomSheet.m45809GM(MusicListBottomSheet.this, view, motionEvent);
                return m45809GM;
            }
        });
        m45821yM().m140108j0().m9219j(this, new C8610l(new C8605g()));
        m45821yM().m140112r0().m9219j(this, new C8610l(new C8606h()));
        m45821yM().m140109n0().m9219j(this, new C8610l(new C8607i()));
        m45821yM().m140113s0().m9219j(this, new C8610l(new C8608j(this)));
        m45821yM().m140110o0().m9219j(this, new C8610l(new C8609k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final boolean m45809GM(MusicListBottomSheet musicListBottomSheet, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(musicListBottomSheet, "this$0");
        if (motionEvent.getAction() == 1) {
            float y11 = motionEvent.getY();
            C30033s8 c30033s8 = musicListBottomSheet.f46364Y0;
            if (c30033s8 == null) {
                AbstractC19074t.m100223u("binding");
                c30033s8 = null;
            }
            if (y11 < c30033s8.f139318z.getY()) {
                musicListBottomSheet.close();
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: HM */
    private final void m45810HM(int i11) {
        C30033s8 c30033s8 = this.f46364Y0;
        if (c30033s8 == null) {
            AbstractC19074t.m100223u("binding");
            c30033s8 = null;
        }
        FeedRecyclerView feedRecyclerView = c30033s8.f139313u;
        AbstractC19074t.m100207e(feedRecyclerView, "horizontalRecyclerView");
        AbstractC26363l.m135708b(feedRecyclerView, i11);
    }

    /* renamed from: vM */
    public static /* synthetic */ boolean m45819vM(MusicListBottomSheet musicListBottomSheet, View view, float f11, float f12, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = AbstractC23136l9.m118742r(20.0f);
        }
        return musicListBottomSheet.m45822uM(view, f11, f12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public final void m45820wM(MusicSelectResult musicSelectResult) {
        int i11;
        Intent m133691b = AbstractC25952c.m133691b(new Intent(), musicSelectResult);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("extra_tracking_source", -1);
        } else {
            i11 = -1;
        }
        m133691b.putExtra("extra_tracking_source", i11);
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, m133691b);
        }
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public final C27356d m45821yM() {
        return (C27356d) this.f46366a1.getValue();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C30033s8 c30033s8 = this.f46364Y0;
        if (c30033s8 == null) {
            AbstractC19074t.m100223u("binding");
            c30033s8 = null;
        }
        LinearLayout linearLayout = c30033s8.f139309q;
        AbstractC19074t.m100207e(linearLayout, "bottomSheetContainer");
        return linearLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: X0 */
    public boolean mo37120X0(float f11, boolean z11, float f12) {
        if (f11 > AbstractC23136l9.m118742r(100.0f)) {
            close();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim
    public void close() {
        super.close();
        m45821yM().m140100B0();
        C0732w.m1177r(C0732w.Companion.m1189a(), "close_view", null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C30033s8 m148489c = C30033s8.m148489c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m148489c, "inflate(...)");
        this.f46364Y0 = m148489c;
        C30033s8 c30033s8 = null;
        if (m148489c == null) {
            AbstractC19074t.m100223u("binding");
            m148489c = null;
        }
        this.f72455N0 = m148489c.f139309q;
        C30033s8 c30033s82 = this.f46364Y0;
        if (c30033s82 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30033s8 = c30033s82;
        }
        this.f72456O0 = c30033s8.f139314v;
        m45808FM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MusicListBottomSheet";
    }

    @Override // bo.InterfaceC3045u2
    /* renamed from: rG */
    public void mo14631rG(InterfaceC3058y interfaceC3058y) {
        AbstractC19074t.m100208f(interfaceC3058y, "event");
        m45821yM().mo14631rG(interfaceC3058y);
    }

    @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
    /* renamed from: s */
    public void mo43432s(C3054x c3054x) {
        AbstractC19074t.m100208f(c3054x, "emptyContentData");
        if (c3054x.m14693y() == 1) {
            if (C23055e5.m118273h(false, 1, null)) {
                m45821yM().m140102D0();
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.network_error));
            }
        }
    }

    /* renamed from: uM */
    public final boolean m45822uM(View view, float f11, float f12, int i11) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i11;
        rect.left -= i11;
        rect.bottom += i11;
        rect.right += i11;
        return rect.contains((int) f11, (int) f12);
    }

    /* renamed from: xM */
    public final void m45823xM(boolean z11) {
        int i11;
        C30033s8 c30033s8 = null;
        if (z11) {
            C30033s8 c30033s82 = this.f46364Y0;
            if (c30033s82 == null) {
                AbstractC19074t.m100223u("binding");
                c30033s82 = null;
            }
            AbstractC2379w.m12432f(c30033s82.f139315w);
        } else {
            C30033s8 c30033s83 = this.f46364Y0;
            if (c30033s83 == null) {
                AbstractC19074t.m100223u("binding");
                c30033s83 = null;
            }
            AbstractC2379w.m12430d(c30033s83.f139315w);
        }
        C30033s8 c30033s84 = this.f46364Y0;
        if (c30033s84 == null) {
            AbstractC19074t.m100223u("binding");
            c30033s84 = null;
        }
        c30033s84.f139315w.setCursorVisible(z11);
        C30033s8 c30033s85 = this.f46364Y0;
        if (c30033s85 == null) {
            AbstractC19074t.m100223u("binding");
            c30033s85 = null;
        }
        RelativeLayout relativeLayout = c30033s85.f139316x;
        C30033s8 c30033s86 = this.f46364Y0;
        if (c30033s86 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30033s8 = c30033s86;
        }
        Context context = c30033s8.f139316x.getContext();
        if (z11) {
            i11 = AbstractC16803z.bg_border_input_search_music_focus;
        } else {
            i11 = AbstractC16803z.bg_border_input_search_music;
        }
        relativeLayout.setBackground(AbstractC23136l9.m118665N(context, i11));
    }

    /* renamed from: zM */
    public final void m45824zM(C19964c c19964c) {
        AbstractC19074t.m100208f(c19964c, "ev");
        C27356d.k kVar = (C27356d.k) c19964c.m103749a();
        if (kVar instanceof C27356d.m) {
            C30033s8 c30033s8 = this.f46364Y0;
            if (c30033s8 == null) {
                AbstractC19074t.m100223u("binding");
                c30033s8 = null;
            }
            RecyclerView.AbstractC1888o layoutManager = c30033s8.f139307B.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo9756v1(0);
                return;
            }
            return;
        }
        if (kVar instanceof C27356d.l) {
            m45810HM(((C27356d.l) kVar).m140126a());
        } else if (kVar instanceof C27356d.o) {
            mo78936E(((C27356d.o) kVar).m140127a());
        } else if (kVar instanceof C27356d.j) {
            m45823xM(!((C27356d.j) kVar).m140125a());
        }
    }
}
