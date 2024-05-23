package com.zing.zalo.camera.colorpalette;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.camera.colorpalette.ColorPalette;
import fn0.AbstractC19074t;
import java.util.List;
import p649xl.C29812g2;
import se.AbstractC26235a;
import zc0.C31784b;

/* loaded from: classes3.dex */
public final class ColorPalette extends FrameLayout {

    /* renamed from: p */
    private InterfaceC7576b f41030p;

    /* renamed from: q */
    private C29812g2 f41031q;

    /* renamed from: r */
    private C7577a f41032r;

    /* renamed from: s */
    private LinearLayoutManager f41033s;

    /* renamed from: t */
    private int f41034t;

    /* renamed from: u */
    private int f41035u;

    /* renamed from: v */
    private int f41036v;

    /* renamed from: w */
    private Runnable f41037w;

    /* renamed from: com.zing.zalo.camera.colorpalette.ColorPalette$a */
    /* loaded from: classes3.dex */
    public static final class C7575a extends RecyclerView.AbstractC1887n {
        C7575a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            if (m9817A0 == 0) {
                rect.set(ColorPalette.this.f41034t + ColorPalette.this.f41035u, 0, 0, 0);
            } else if (m9817A0 == ColorPalette.this.f41032r.mo10003k() - 1) {
                rect.set(ColorPalette.this.f41035u, 0, ColorPalette.this.f41035u, 0);
            } else {
                rect.set(ColorPalette.this.f41035u, 0, 0, 0);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.colorpalette.ColorPalette$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7576b {
        /* renamed from: a */
        void mo39170a(int i11, AbstractC26235a abstractC26235a, boolean z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        C29812g2 m147976b = C29812g2.m147976b(LayoutInflater.from(context), this);
        AbstractC19074t.m100207e(m147976b, "inflate(...)");
        this.f41031q = m147976b;
        this.f41032r = new C7577a();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.m9723C2(0);
        this.f41033s = linearLayoutManager;
        this.f41035u = C7577a.Companion.m39181b();
        this.f41037w = new Runnable() { // from class: re.a
            @Override // java.lang.Runnable
            public final void run() {
                ColorPalette.m39166h(ColorPalette.this);
            }
        };
        RecyclerView recyclerView = this.f41031q.f137840q;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(this.f41033s);
        recyclerView.setAdapter(this.f41032r);
        this.f41031q.f137840q.m9816A(new C7575a());
        C31784b.m152808a(this.f41031q.f137840q).m152809b(new C31784b.d() { // from class: re.b
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                ColorPalette.m39162c(ColorPalette.this, recyclerView2, i11, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m39162c(ColorPalette colorPalette, RecyclerView recyclerView, int i11, View view) {
        AbstractC19074t.m100208f(colorPalette, "this$0");
        int i12 = colorPalette.f41036v;
        if (i12 != i11) {
            colorPalette.f41032r.m39174O(i12).m134884b(false);
            colorPalette.f41032r.m10009q(colorPalette.f41036v);
            AbstractC26235a m39174O = colorPalette.f41032r.m39174O(i11);
            m39174O.m134884b(true);
            colorPalette.f41032r.m10009q(i11);
            colorPalette.f41036v = i11;
            InterfaceC7576b interfaceC7576b = colorPalette.f41030p;
            if (interfaceC7576b != null) {
                interfaceC7576b.mo39170a(i11, m39174O, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m39166h(ColorPalette colorPalette) {
        AbstractC19074t.m100208f(colorPalette, "this$0");
        colorPalette.m39167i(colorPalette.f41036v);
    }

    /* renamed from: i */
    private final boolean m39167i(int i11) {
        View mo9732P = this.f41033s.mo9732P(i11);
        if (mo9732P == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int width = (((getWidth() - mo9732P.getWidth()) - marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) / 2;
        this.f41031q.f137840q.m9845O1(mo9732P.getLeft() - width, 0);
        return true;
    }

    /* renamed from: g */
    public final void m39168g(boolean z11) {
        this.f41032r.m39173N(z11);
    }

    public final AbstractC26235a getColorItem() {
        return this.f41032r.m39174O(this.f41036v);
    }

    public final int getSelectedPos() {
        return this.f41036v;
    }

    /* renamed from: j */
    public final void m39169j() {
        RecyclerView recyclerView = this.f41031q.f137840q;
        recyclerView.m9866X1();
        if (!m39167i(this.f41036v)) {
            recyclerView.m9837K1(this.f41036v);
            recyclerView.post(this.f41037w);
        }
    }

    public final void setColorList(List<? extends AbstractC26235a> list) {
        AbstractC19074t.m100208f(list, "colorPaletteData");
        this.f41032r.m39175P(list);
    }

    public final void setColorPaletteListener(InterfaceC7576b interfaceC7576b) {
        AbstractC19074t.m100208f(interfaceC7576b, "listener");
        this.f41030p = interfaceC7576b;
    }

    public final void setExtraPaddingLeft(int i11) {
        this.f41034t = i11;
    }

    public final void setSelectedPos(int i11) {
        C7577a c7577a = this.f41032r;
        c7577a.m39174O(this.f41036v).m134884b(false);
        c7577a.m10009q(this.f41036v);
        AbstractC26235a m39174O = c7577a.m39174O(i11);
        m39174O.m134884b(true);
        c7577a.m10009q(i11);
        this.f41036v = i11;
        InterfaceC7576b interfaceC7576b = this.f41030p;
        if (interfaceC7576b != null) {
            interfaceC7576b.mo39170a(i11, m39174O, false);
        }
    }

    public final void setSpaceBetweenItems(int i11) {
        this.f41035u = i11;
    }
}
