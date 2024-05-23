package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Switch;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.s1 */
/* loaded from: classes3.dex */
public final class C30026s1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139279p;

    /* renamed from: q */
    public final LinearLayout f139280q;

    /* renamed from: r */
    public final Switch f139281r;

    /* renamed from: s */
    public final RobotoTextView f139282s;

    private C30026s1(LinearLayout linearLayout, LinearLayout linearLayout2, Switch r32, RobotoTextView robotoTextView) {
        this.f139279p = linearLayout;
        this.f139280q = linearLayout2;
        this.f139281r = r32;
        this.f139282s = robotoTextView;
    }

    /* renamed from: a */
    public static C30026s1 m148470a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = AbstractC6918a0.swEnableAutoBackup;
        Switch r22 = (Switch) AbstractC22716b.m117526a(view, i11);
        if (r22 != null) {
            i11 = AbstractC6918a0.tvTitle;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C30026s1(linearLayout, linearLayout, r22, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30026s1 m148471c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.change_option_auto_backup_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148470a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139279p;
    }
}
