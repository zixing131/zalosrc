package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.adapters.C7157o0;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import p134el.C18465d;
import p268ji.C21272r;
import p649xl.C29795f3;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import z90.AbstractC31727b;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes6.dex */
public class EmojiChatPanelPage extends RelativeLayout implements InterfaceC12966p {

    /* renamed from: p */
    private final C29795f3 f67020p;

    /* renamed from: q */
    protected C7157o0 f67021q;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.EmojiChatPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12928a extends RecyclerView.AbstractC1892s {
        C12928a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 1) {
                C21272r.a aVar = C21272r.Companion;
                if (((C21272r) aVar.m122672a()).m110178g()) {
                    ((C21272r) aVar.m122672a()).m110175d().m122673a().put(3);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.EmojiChatPanelPage$b */
    /* loaded from: classes6.dex */
    static final class C12929b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C1755a0 f67022q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12929b(C1755a0 c1755a0) {
            super(1);
            this.f67022q = c1755a0;
        }

        /* renamed from: a */
        public final void m72829a(C18465d c18465d) {
            this.f67022q.mo9224q(c18465d);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72829a((C18465d) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.EmojiChatPanelPage$c */
    /* loaded from: classes6.dex */
    public static final class C12930c extends RecyclerView.AbstractC1890q {

        /* renamed from: a */
        final /* synthetic */ C1761c0 f67023a;

        C12930c(C1761c0 c1761c0) {
            this.f67023a = c1761c0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
        /* renamed from: a */
        public boolean mo10175a(int i11, int i12) {
            this.f67023a.mo9224q(new C24860q(Integer.valueOf(i11), Integer.valueOf(i12)));
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.EmojiChatPanelPage$d */
    /* loaded from: classes6.dex */
    static final class C12931d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f67024p;

        C12931d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f67024p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f67024p;
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
            this.f67024p.mo205i9(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EmojiChatPanelPage(LayoutInflater layoutInflater, Context context) {
        super(context);
        AbstractC19074t.m100205c(context);
        C29795f3 m147932b = C29795f3.m147932b(layoutInflater, this);
        AbstractC19074t.m100207e(m147932b, "inflate(...)");
        this.f67020p = m147932b;
        m147932b.f137735r.setOverScrollMode(2);
        m147932b.f137735r.setLayoutManager(new LinearLayoutManager(context));
        m147932b.f137735r.m9826E(new C12928a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m72824c(AbstractC31727b abstractC31727b, View view, MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (abstractC31727b != null) {
                abstractC31727b.mo39093e(action);
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m72825d(C1761c0 c1761c0, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(c1761c0, "$emojiDeleteTouchLiveData");
        if (motionEvent != null) {
            c1761c0.mo9224q(new C18465d(motionEvent.getAction()));
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public void mo72826e() {
        get_adapter().m36417i0(-2);
    }

    /* renamed from: f */
    public final void m72827f() {
        get_adapter().m36415f0();
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: g */
    public void mo72819g() {
        get_adapter().m10008p();
    }

    public Integer getPageId() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C7157o0 get_adapter() {
        C7157o0 c7157o0 = this.f67021q;
        if (c7157o0 != null) {
            return c7157o0;
        }
        AbstractC19074t.m100223u("_adapter");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C29795f3 get_binding() {
        return this.f67020p;
    }

    /* renamed from: h */
    public final void m72828h(int i11, int i12, int i13, int i14) {
        this.f67020p.f137735r.setPadding(i11, i12, i13, i14);
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: i */
    public boolean mo72820i() {
        RecyclerView.AbstractC1888o layoutManager = this.f67020p.f137735r.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).m9740Y1() >= 2) {
            return false;
        }
        return true;
    }

    public final void setEmojiPageStyle(C7157o0.f fVar) {
        AbstractC19074t.m100208f(fVar, "pageStyle");
        get_adapter().m36418k0(fVar);
        if (!fVar.f39183p) {
            ViewParent parent = this.f67020p.f137734q.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this.f67020p.f137734q);
            RecyclerView recyclerView = this.f67020p.f137735r;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f67020p.f137735r.getPaddingTop(), 0, this.f67020p.f137735r.getPaddingBottom());
        }
    }

    public final void setListOnTouchListener(View.OnTouchListener onTouchListener) {
        AbstractC19074t.m100208f(onTouchListener, "listener");
        this.f67020p.f137735r.setOnTouchListener(onTouchListener);
    }

    protected final void set_adapter(C7157o0 c7157o0) {
        AbstractC19074t.m100208f(c7157o0, "<set-?>");
        this.f67021q = c7157o0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiChatPanelPage(LayoutInflater layoutInflater, Context context, final AbstractC31727b abstractC31727b) {
        this(layoutInflater, context);
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        set_adapter(new C7157o0(false, abstractC31727b));
        get_adapter().m36419l0(this.f67020p.f137735r);
        this.f67020p.f137735r.setAdapter(get_adapter());
        this.f67020p.f137734q.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.picker.stickerpanel.custom.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m72824c;
                m72824c = EmojiChatPanelPage.m72824c(AbstractC31727b.this, view, motionEvent);
                return m72824c;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiChatPanelPage(LayoutInflater layoutInflater, Context context, C1755a0 c1755a0, C1761c0 c1761c0) {
        this(layoutInflater, context);
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(c1755a0, "liveData");
        AbstractC19074t.m100208f(c1761c0, "pagerFlingLiveData");
        final C1761c0 c1761c02 = new C1761c0();
        c1755a0.m9256r(c1761c02, new C12931d(new C12929b(c1755a0)));
        set_adapter(new C7157o0(false, c1755a0));
        get_adapter().m36419l0(this.f67020p.f137735r);
        this.f67020p.f137735r.setAdapter(get_adapter());
        this.f67020p.f137735r.setOnFlingListener(new C12930c(c1761c0));
        this.f67020p.f137734q.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.picker.stickerpanel.custom.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m72825d;
                m72825d = EmojiChatPanelPage.m72825d(C1761c0.this, view, motionEvent);
                return m72825d;
            }
        });
    }
}
