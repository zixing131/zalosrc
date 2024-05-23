package com.zing.zalo.feed.mvp.bottomsheetmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.C8540a;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import io.AbstractC20641e;
import io.C20639c;
import io.C20640d;
import java.util.List;
import jo.C21322c;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import p188go.C19524c;
import p188go.InterfaceC19522a;
import p302ko.C21785g;
import p455qo.C25429q;
import p458qr.C25470c;
import p458qr.C25471d;
import p542ub.InterfaceC27218a;
import qm0.AbstractC25368s;
import sm.AbstractC26324b;

/* loaded from: classes4.dex */
public final class BottomSheetMenuView extends BottomSheetZaloViewWithAnim implements InterfaceC19522a, C8540a.a {
    public static final C8537a Companion = new C8537a(null);

    /* renamed from: W0 */
    private RecyclerView f46145W0;

    /* renamed from: X0 */
    private C8540a f46146X0;

    /* renamed from: Y0 */
    private View f46147Y0;

    /* renamed from: Z0 */
    public C19524c f46148Z0;

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.BottomSheetMenuView$a */
    /* loaded from: classes4.dex */
    public static final class C8537a {
        private C8537a() {
        }

        public /* synthetic */ C8537a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: mM */
    private final int m45458mM(List list) {
        int m118655I;
        int i11 = 0;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            AbstractC20641e abstractC20641e = (AbstractC20641e) obj;
            int m107578a = abstractC20641e.m107578a();
            if (m107578a != 1) {
                if (m107578a != 3) {
                    if (m107578a == 4) {
                        if (abstractC20641e instanceof C20640d) {
                            int m107571e = ((C20640d) abstractC20641e).m107571e();
                            if (m107571e != 1) {
                                if (m107571e == 2) {
                                    m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_quick_setting_large_height);
                                }
                            } else {
                                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_quick_setting_height);
                            }
                        } else {
                            m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_quick_setting_height);
                        }
                    }
                    i12 = i13;
                } else if (abstractC20641e instanceof C20639c) {
                    int m107560e = ((C20639c) abstractC20641e).m107560e();
                    if (m107560e != 0) {
                        if (m107560e != 1) {
                            if (m107560e != 2) {
                                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_height);
                            } else {
                                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_small_height);
                            }
                        } else {
                            m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_large_height);
                        }
                    } else {
                        m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_height);
                    }
                } else {
                    m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_height);
                }
            } else {
                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_item_header_height);
            }
            i11 += m118655I;
            i12 = i13;
        }
        return i11;
    }

    /* renamed from: nM */
    private final int m45459nM() {
        int m116580c;
        int m45458mM = m45458mM(m45463oM().m102034Mp());
        m116580c = AbstractC22543l.m116580c(m45463oM().m102034Mp().size() - 1, 0);
        return m45458mM + (m116580c * AbstractC23136l9.m118655I(AbstractC16802y.bottom_sheet_menu_divider_height)) + (AbstractC23136l9.m118736p(AbstractC16802y.bottom_sheet_menu_padding_top_bottom) * 2) + AbstractC23136l9.m118737p0() + this.f72456O0.getHeight();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C25470c m131954b;
        super.mo37111CJ(bundle);
        m45465qM(new C19524c(this, C21322c.Companion.m110410a(), C21785g.Companion.m112431a()));
        Integer num = null;
        m45463oM().m102046iq(C8538a.Companion.m45471a(m92642L3()), null);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            num = Integer.valueOf(m92642L3.getInt("EXTRA_DATA_RETAIN_KEY", -1));
        }
        if (num != null && num.intValue() != -1 && (m131954b = C25471d.m131951c().m131954b(num.intValue())) != null) {
            m45463oM().m102041b(m131954b);
        }
        m45463oM().m102043d();
    }

    @Override // p188go.InterfaceC19522a
    /* renamed from: Ii */
    public void mo45460Ii() {
        C8540a c8540a = this.f46146X0;
        if (c8540a == null) {
            AbstractC19074t.m100223u("adapter");
            c8540a = null;
        }
        c8540a.m45481O(m45463oM().m102034Mp());
    }

    @Override // p188go.InterfaceC19522a
    /* renamed from: Nl */
    public void mo45461Nl(String str) {
        if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
            AbstractC26324b.a aVar = AbstractC26324b.Companion;
            InterfaceC27218a m92692wK = this.f72421L0.m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            aVar.m135472a(str, m92692wK);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        Bundle m92642L3;
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        try {
            ZaloView m92650VI = m92650VI();
            int m131953a = C25471d.m131951c().m131953a(m45463oM().m102042c());
            bundle.putInt("EXTRA_DATA_RETAIN_KEY", m131953a);
            if (m92650VI != null && (m92642L3 = m92650VI.m92642L3()) != null) {
                m92642L3.putInt("EXTRA_DATA_RETAIN_KEY", m131953a);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int m116580c;
        int m116580c2;
        int height = this.f72454M0.getHeight() - m45459nM();
        if (height <= 0) {
            m116580c2 = AbstractC22543l.m116580c(m45463oM().m102036Op(), 0);
            return m116580c2;
        }
        m45463oM().m102052pq(height);
        m116580c = AbstractC22543l.m116580c(height, 0);
        return m116580c;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        AbstractC19074t.m100208f(linearLayout, "llContainer");
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.bottom_sheet_menu_view, (ViewGroup) linearLayout, true);
        View findViewById = linearLayout.findViewById(AbstractC6918a0.bottom_sheet_menu_view);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f46147Y0 = findViewById;
        if (findViewById == null) {
            AbstractC19074t.m100223u("contentView");
            findViewById = null;
        }
        m45464pM(findViewById);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        BottomSheetMenuResult m45468b = C8538a.Companion.m45472b(m45463oM().m102037Pp()).m45468b();
        Intent intent = new Intent();
        if (m45468b != null) {
            intent.putExtra("EXTRA_BUNDLE_DATA_RESULT", m45468b);
        }
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        super.finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMinTranslationY(mo37128eM());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BottomSheetMenuView";
    }

    @Override // com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.C8540a.a
    /* renamed from: jl */
    public void mo45462jl(C20639c c20639c) {
        AbstractC19074t.m100208f(c20639c, "data");
        m45463oM().m102053qq(c20639c);
        m45463oM().m102045hq(c20639c);
        m45463oM().m102039Rp();
        close();
    }

    /* renamed from: oM */
    public final C19524c m45463oM() {
        C19524c c19524c = this.f46148Z0;
        if (c19524c != null) {
            return c19524c;
        }
        AbstractC19074t.m100223u("presenter");
        return null;
    }

    /* renamed from: pM */
    public final void m45464pM(View view) {
        AbstractC19074t.m100208f(view, "contentView");
        AbstractC23136l9.m118744r1(this.f72456O0, 8);
        ViewGroup.LayoutParams layoutParams = this.f72455N0.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            this.f72455N0.setLayoutParams(layoutParams);
        }
        m78539iM(true);
        this.f72454M0.setCanOverTranslateMaxY(true);
        View findViewById = view.findViewById(AbstractC6918a0.recycler_view);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f46145W0 = recyclerView;
        C8540a c8540a = null;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C8540a c8540a2 = new C8540a();
        this.f46146X0 = c8540a2;
        c8540a2.m45480N(this);
        RecyclerView recyclerView2 = this.f46145W0;
        if (recyclerView2 == null) {
            AbstractC19074t.m100223u("recyclerView");
            recyclerView2 = null;
        }
        C8540a c8540a3 = this.f46146X0;
        if (c8540a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c8540a = c8540a3;
        }
        recyclerView2.setAdapter(c8540a);
    }

    /* renamed from: qM */
    public final void m45465qM(C19524c c19524c) {
        AbstractC19074t.m100208f(c19524c, "<set-?>");
        this.f46148Z0 = c19524c;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        C8540a c8540a = this.f46146X0;
        if (c8540a == null) {
            AbstractC19074t.m100223u("adapter");
            c8540a = null;
        }
        c8540a.m45481O(m45463oM().m102034Mp());
    }

    @Override // com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.C8540a.a
    /* renamed from: xc */
    public void mo45466xc(C20640d c20640d) {
        AbstractC19074t.m100208f(c20640d, "data");
        int m107579b = c20640d.m107579b();
        if (m107579b != 13) {
            if (m107579b == 34) {
                m45463oM().m102038Qp(c20640d);
                return;
            }
            return;
        }
        m45463oM().m102040Sp(c20640d);
    }
}
