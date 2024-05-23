package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.zview.dialog.C17465f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import y90.EnumC30857a;

/* loaded from: classes4.dex */
public class SimpleMenuListPopupView extends MenuListPopupView implements C7145n.d {

    /* renamed from: n1 */
    static Rect f83440n1;

    /* renamed from: o1 */
    static int f83441o1 = AbstractC23136l9.m118713h0();

    /* renamed from: p1 */
    static int f83442p1 = 0;

    /* renamed from: l1 */
    protected boolean f83443l1 = false;

    /* renamed from: m1 */
    protected boolean f83444m1 = false;

    /* renamed from: ML */
    public static SimpleMenuListPopupView m87992ML(List list, C7145n.a aVar, Rect rect, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        f83440n1 = rect;
        int m118722k0 = AbstractC23136l9.m118722k0();
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        int i16 = rect.left;
        if (i16 <= m118722k0 / 2) {
            i12 = i16 + m118742r;
            i14 = m118722k0 - i12;
            i13 = 8388611;
        } else {
            i12 = (m118722k0 - rect.right) + m118742r;
            i13 = 8388613;
            i14 = 0;
        }
        int i17 = rect.top;
        int i18 = rect.bottom;
        if ((i17 + i18) / 2 <= f83441o1 / 2) {
            i15 = i17 - m118742r;
        } else {
            i15 = i18 - m118742r;
        }
        f83442p1 = i15;
        SimpleMenuListPopupView simpleMenuListPopupView = new SimpleMenuListPopupView();
        simpleMenuListPopupView.m87758GL(aVar);
        Bundle bundle = new Bundle();
        bundle.putInt("x", i12);
        bundle.putInt("y", i15);
        bundle.putInt("width", i14);
        bundle.putInt("gravity", i13 | 48);
        bundle.putBoolean("showDim", false);
        bundle.putBoolean("EXTRA_BOOL_WIDTH_WRAP_LIST_CONTENT", true);
        simpleMenuListPopupView.mo60305zK(bundle);
        simpleMenuListPopupView.m92601SK(2, 0);
        simpleMenuListPopupView.m87997PL(true);
        simpleMenuListPopupView.m87998QL(true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7145n.b bVar = (C7145n.b) it.next();
            if (bVar.m36361a() == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.f39073m = z11;
        }
        MenuListPopupView.m87740HL(simpleMenuListPopupView, list);
        return simpleMenuListPopupView;
    }

    /* renamed from: NL */
    public static SimpleMenuListPopupView m87993NL(List list, C7145n.a aVar, Rect rect, int i11) {
        int i12;
        boolean z11;
        f83440n1 = rect;
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        int i13 = rect.top;
        int i14 = rect.bottom;
        if ((i13 + i14) / 2 <= f83441o1 / 2) {
            i12 = i14 - m118742r;
        } else {
            i12 = i13 - m118742r;
        }
        f83442p1 = i12;
        int i15 = rect.left - m118742r;
        SimpleMenuListPopupView simpleMenuListPopupView = new SimpleMenuListPopupView();
        simpleMenuListPopupView.m87758GL(aVar);
        Bundle bundle = new Bundle();
        bundle.putInt("x", i15);
        bundle.putInt("y", i12);
        bundle.putInt("width", AbstractC23136l9.m118722k0() - i15);
        bundle.putInt("gravity", 8388659);
        bundle.putBoolean("showDim", false);
        bundle.putBoolean("EXTRA_BOOL_WIDTH_WRAP_LIST_CONTENT", true);
        simpleMenuListPopupView.mo60305zK(bundle);
        simpleMenuListPopupView.m92601SK(2, 0);
        simpleMenuListPopupView.m87997PL(true);
        simpleMenuListPopupView.m87998QL(true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7145n.b bVar = (C7145n.b) it.next();
            if (bVar.m36361a() == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.f39073m = z11;
        }
        MenuListPopupView.m87740HL(simpleMenuListPopupView, list);
        return simpleMenuListPopupView;
    }

    /* renamed from: OL */
    public static SimpleMenuListPopupView m87994OL(Context context, Rect rect, C7145n.a aVar, boolean z11) {
        int i11;
        ArrayList arrayList = new ArrayList();
        boolean m119603k = C23212s8.m119603k();
        if (z11) {
            C7145n.b bVar = new C7145n.b(context, 6, EnumC30857a.f142388s.m149999c(), context.getString(AbstractC8020f0.str_sticker_menu_item_share_sticker), AbstractC16803z.icon_share);
            bVar.f39071k = false;
            arrayList.add(bVar);
        } else {
            m119603k = false;
        }
        C7145n.b bVar2 = new C7145n.b(context, 6, EnumC30857a.f142386q.m149999c(), context.getString(AbstractC8020f0.str_sticker_menu_item_update_position), AbstractC16803z.ic_arrange);
        bVar2.f39071k = m119603k;
        arrayList.add(bVar2);
        if (z11) {
            C7145n.b bVar3 = new C7145n.b(context, 6, EnumC30857a.f142387r.m149999c(), context.getString(AbstractC8020f0.str_sticker_menu_item_delete_sticker), AbstractC16803z.icon_delete);
            bVar3.f39071k = m119603k;
            arrayList.add(bVar3);
        }
        int m118722k0 = AbstractC23136l9.m118722k0();
        int i12 = rect.bottom + 10;
        int m118742r = AbstractC23136l9.m118742r(8.0f);
        if (rect.left <= m118722k0 / 2) {
            i11 = 8388611;
        } else {
            i11 = 8388613;
        }
        SimpleMenuListPopupView simpleMenuListPopupView = new SimpleMenuListPopupView();
        simpleMenuListPopupView.m87758GL(aVar);
        Bundle bundle = new Bundle();
        bundle.putInt("x", m118742r);
        bundle.putInt("y", i12);
        bundle.putInt("width", AbstractC23136l9.m118742r(210.0f));
        bundle.putBoolean("showArrow", false);
        bundle.putBoolean("showTitle", false);
        bundle.putInt("gravity", i11 | 48);
        bundle.putBoolean("showDim", false);
        bundle.putInt("window_animation_type", 2);
        simpleMenuListPopupView.mo60305zK(bundle);
        simpleMenuListPopupView.m92601SK(2, 0);
        MenuListPopupView.m87740HL(simpleMenuListPopupView, arrayList);
        return simpleMenuListPopupView;
    }

    @Override // com.zing.zalo.uicontrol.MenuListPopupView
    /* renamed from: FL */
    public void mo87757FL(List list) {
        try {
            super.mo87757FL(list);
            if (!this.f83443l1 && !this.f83444m1) {
                return;
            }
            this.f83224f1.m36355i(this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KL */
    public void m87995KL() {
        if (this.f83209Q0 != null && this.f83224f1.f39054q > 0 && this.f83443l1) {
            C17465f m92867k = m92594JK().m92867k();
            WindowManager.LayoutParams m92901h = m92867k.m92901h();
            m92901h.width = Math.min(AbstractC23136l9.m118722k0() - m92901h.x, this.f83224f1.f39054q + AbstractC23136l9.m118742r(16.0f));
            m92867k.m92912v(m92901h);
        }
    }

    /* renamed from: LL */
    public void m87996LL() {
        Rect rect = f83440n1;
        if (rect != null && (rect.top + rect.bottom) / 2 > f83441o1 / 2 && this.f83444m1) {
            C17465f m92867k = m92594JK().m92867k();
            WindowManager.LayoutParams m92901h = m92867k.m92901h();
            m92901h.y = f83442p1 - this.f83224f1.f39053p;
            m92867k.m92912v(m92901h);
        }
    }

    /* renamed from: PL */
    public void m87997PL(boolean z11) {
        this.f83443l1 = z11;
    }

    /* renamed from: QL */
    public void m87998QL(boolean z11) {
        this.f83444m1 = z11;
    }

    @Override // com.zing.zalo.adapters.C7145n.d
    /* renamed from: a5 */
    public void mo36366a5() {
        m87995KL();
        m87996LL();
    }

    @Override // com.zing.zalo.uicontrol.MenuListPopupView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    protected View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View findViewById;
        View inflate = layoutInflater.inflate(AbstractC7409c0.simple_menu_list_popup, viewGroup, false);
        this.f83209Q0 = (ListView) inflate.findViewById(AbstractC6918a0.menu_list);
        inflate.setOnClickListener(this.f83664N0);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (findViewById = inflate.findViewById(AbstractC6918a0.popup_content_container)) != null) {
            findViewById.setPadding(findViewById.getPaddingLeft(), m92642L3.getInt("EXTRA_INT_PADDING_TOP", findViewById.getPaddingTop()), findViewById.getPaddingRight(), m92642L3.getInt("EXTRA_INT_PADDING_BOTTOM", findViewById.getPaddingBottom()));
        }
        return inflate;
    }
}
