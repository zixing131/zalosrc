package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import e20.InterfaceC18187a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import f20.C18704b;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import k20.C21456b;
import pm0.C24848g0;
import q10.C24986a2;
import s20.AbstractC26112n;
import v00.AbstractC27413h;

/* loaded from: classes5.dex */
public final class BlockPageView extends AbstractC10623a implements InterfaceC18187a, C21456b.c {

    /* renamed from: B0 */
    private C18704b f52549B0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockPageView$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10121a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10121a f52550y = new C10121a();

        C10121a() {
            super(3, C24986a2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageBlockBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m53938h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24986a2 m53938h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24986a2.m129755c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockPageView$b */
    /* loaded from: classes5.dex */
    static final class C10122b extends AbstractC19075u implements InterfaceC18505l {
        C10122b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53939a(View view) {
            AbstractC19074t.m100208f(view, "it");
            BlockPageView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53939a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public BlockPageView() {
        super(C10121a.f52550y);
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: Bg */
    public void mo53932Bg() {
        InterfaceC18187a.a.m96935a(this);
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(BlockPageView.class, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C24986a2 c24986a2 = (C24986a2) m55556SK();
        if (c24986a2 != null) {
            LinearLayout linearLayout = c24986a2.f119746s;
            AbstractC19074t.m100207e(linearLayout, "lytContainer");
            AbstractC26112n.m134419q0(linearLayout, AbstractC17484n.Companion.m92931b());
            c24986a2.f119745r.f119995w.setText(m92652XI(AbstractC27413h.zch_page_block_list_title));
            ImageView imageView = c24986a2.f119745r.f119989q;
            AbstractC19074t.m100207e(imageView, "btnBack");
            AbstractC26112n.m134407k0(imageView, new C10122b());
            ViewPager viewPager = c24986a2.f119748u;
            AbstractC19074t.m100207e(viewPager, "viePager");
            C17487o0 m92649TI = m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            C18704b c18704b = new C18704b(viewPager, m92649TI);
            this.f52549B0 = c18704b;
            viewPager.setAdapter(c18704b);
            C18704b c18704b2 = this.f52549B0;
            AbstractC19074t.m100205c(c18704b2);
            viewPager.setOffscreenPageLimit(c18704b2.mo35335g());
            PageBar pageBar = c24986a2.f119744q;
            ViewPager viewPager2 = c24986a2.f119748u;
            AbstractC19074t.m100207e(viewPager2, "viePager");
            pageBar.setupWithViewPager(viewPager2);
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: d0 */
    public void mo53934d0() {
        InterfaceC18187a.a.m96937c(this);
    }

    @Override // e20.InterfaceC18187a
    public void deactivate() {
        InterfaceC18187a.a.m96936b(this);
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        C21456b.c.a.m111025b(this, bVar);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        C21456b.c.a.m111024a(this, bVar);
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: r4 */
    public void mo53937r4() {
        InterfaceC18187a.a.m96938d(this);
    }
}
