package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.id */
/* loaded from: classes3.dex */
public final class C29859id implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138201p;

    /* renamed from: q */
    public final RelativeLayout f138202q;

    /* renamed from: r */
    public final RelativeLayout f138203r;

    /* renamed from: s */
    public final RelativeLayout f138204s;

    /* renamed from: t */
    public final RecyclerView f138205t;

    /* renamed from: u */
    public final View f138206u;

    /* renamed from: v */
    public final RobotoTextView f138207v;

    private C29859id(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RecyclerView recyclerView, View view, RobotoTextView robotoTextView) {
        this.f138201p = relativeLayout;
        this.f138202q = relativeLayout2;
        this.f138203r = relativeLayout3;
        this.f138204s = relativeLayout4;
        this.f138205t = recyclerView;
        this.f138206u = view;
        this.f138207v = robotoTextView;
    }

    /* renamed from: a */
    public static C29859id m148087a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.header;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) view;
            i11 = AbstractC6918a0.privacy_options_container;
            RelativeLayout relativeLayout3 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeLayout3 != null) {
                i11 = AbstractC6918a0.rv_options;
                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                if (recyclerView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.separator))) != null) {
                    i11 = AbstractC6918a0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C29859id(relativeLayout2, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, m117526a, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29859id m148088c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_privacy_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148087a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138201p;
    }
}
