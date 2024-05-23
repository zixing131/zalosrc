package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k9 */
/* loaded from: classes3.dex */
public final class C29891k9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138481p;

    /* renamed from: q */
    public final RobotoTextView f138482q;

    /* renamed from: r */
    public final TextField f138483r;

    /* renamed from: s */
    public final ZdsActionBar f138484s;

    private C29891k9(RelativeLayout relativeLayout, RobotoTextView robotoTextView, TextField textField, ZdsActionBar zdsActionBar) {
        this.f138481p = relativeLayout;
        this.f138482q = robotoTextView;
        this.f138483r = textField;
        this.f138484s = zdsActionBar;
    }

    /* renamed from: a */
    public static C29891k9 m148164a(View view) {
        int i11 = AbstractC6918a0.btn_delete;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.catalog_name_text_field;
            TextField textField = (TextField) AbstractC22716b.m117526a(view, i11);
            if (textField != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C29891k9((RelativeLayout) view, robotoTextView, textField, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29891k9 m148165c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_catalog_creating_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148164a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138481p;
    }
}
