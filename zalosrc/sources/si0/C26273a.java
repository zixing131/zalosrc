package si0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bi0.AbstractC2812f;
import com.zing.zalo.zdesign.component.tab.TabItemView;
import p338m2.InterfaceC22715a;

/* renamed from: si0.a */
/* loaded from: classes7.dex */
public final class C26273a implements InterfaceC22715a {

    /* renamed from: p */
    private final TabItemView f124711p;

    private C26273a(TabItemView tabItemView) {
        this.f124711p = tabItemView;
    }

    /* renamed from: a */
    public static C26273a m135159a(View view) {
        if (view != null) {
            return new C26273a((TabItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C26273a m135160c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC2812f.custom_tab_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m135159a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TabItemView getRoot() {
        return this.f124711p;
    }
}
