package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m */
/* loaded from: classes3.dex */
public final class C29917m implements InterfaceC22715a {

    /* renamed from: p */
    private final View f138628p;

    /* renamed from: q */
    public final RobotoTextView f138629q;

    /* renamed from: r */
    public final RobotoTextView f138630r;

    private C29917m(View view, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138628p = view;
        this.f138629q = robotoTextView;
        this.f138630r = robotoTextView2;
    }

    /* renamed from: a */
    public static C29917m m148221a(View view) {
        int i11 = AbstractC6918a0.tvDeviceName;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.tvLatestTimeBackup;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                return new C29917m(view, robotoTextView, robotoTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29917m m148222b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.backup_info_view, viewGroup);
            return m148221a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138628p;
    }
}
