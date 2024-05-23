package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.yc */
/* loaded from: classes3.dex */
public final class C30139yc implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140049p;

    /* renamed from: q */
    public final RobotoTextView f140050q;

    private C30139yc(LinearLayout linearLayout, RobotoTextView robotoTextView) {
        this.f140049p = linearLayout;
        this.f140050q = robotoTextView;
    }

    /* renamed from: a */
    public static C30139yc m148747a(View view) {
        int i11 = AbstractC6918a0.story_archive_privacy;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            return new C30139yc((LinearLayout) view, robotoTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30139yc m148748c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_archive_header, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148747a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140049p;
    }
}
