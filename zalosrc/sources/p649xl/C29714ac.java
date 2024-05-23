package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ac */
/* loaded from: classes3.dex */
public final class C29714ac implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137249p;

    /* renamed from: q */
    public final ListItemSetting f137250q;

    /* renamed from: r */
    public final RobotoTextView f137251r;

    /* renamed from: s */
    public final ListItemSetting f137252s;

    /* renamed from: t */
    public final ZdsActionBar f137253t;

    private C29714ac(LinearLayout linearLayout, ListItemSetting listItemSetting, RobotoTextView robotoTextView, ListItemSetting listItemSetting2, ZdsActionBar zdsActionBar) {
        this.f137249p = linearLayout;
        this.f137250q = listItemSetting;
        this.f137251r = robotoTextView;
        this.f137252s = listItemSetting2;
        this.f137253t = zdsActionBar;
    }

    /* renamed from: a */
    public static C29714ac m147734a(View view) {
        int i11 = AbstractC6918a0.btn_clean_up;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.header_text;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.pre_download_item;
                ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting2 != null) {
                    i11 = AbstractC6918a0.zds_action_bar;
                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                    if (zdsActionBar != null) {
                        return new C29714ac((LinearLayout) view, listItemSetting, robotoTextView, listItemSetting2, zdsActionBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29714ac m147735c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_pre_download_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147734a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137249p;
    }
}
