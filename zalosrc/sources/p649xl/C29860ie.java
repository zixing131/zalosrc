package p649xl;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ie */
/* loaded from: classes3.dex */
public final class C29860ie implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayoutCompat f138208p;

    /* renamed from: q */
    public final ZAppCompatImageView f138209q;

    /* renamed from: r */
    public final RobotoTextView f138210r;

    private C29860ie(LinearLayoutCompat linearLayoutCompat, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView) {
        this.f138208p = linearLayoutCompat;
        this.f138209q = zAppCompatImageView;
        this.f138210r = robotoTextView;
    }

    /* renamed from: a */
    public static C29860ie m148090a(View view) {
        int i11 = AbstractC6918a0.icWarning;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.tvCodeIncorrect;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C29860ie((LinearLayoutCompat) view, zAppCompatImageView, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f138208p;
    }
}
