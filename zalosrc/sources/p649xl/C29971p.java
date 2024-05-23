package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.TypeProtectCodeView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.p */
/* loaded from: classes3.dex */
public final class C29971p implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138918p;

    /* renamed from: q */
    public final TypeProtectCodeView f138919q;

    /* renamed from: r */
    public final TypeProtectCodeView f138920r;

    /* renamed from: s */
    public final ZAppCompatImageView f138921s;

    /* renamed from: t */
    public final RobotoTextView f138922t;

    /* renamed from: u */
    public final ZdsActionBar f138923u;

    private C29971p(FrameLayout frameLayout, TypeProtectCodeView typeProtectCodeView, TypeProtectCodeView typeProtectCodeView2, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView, ZdsActionBar zdsActionBar) {
        this.f138918p = frameLayout;
        this.f138919q = typeProtectCodeView;
        this.f138920r = typeProtectCodeView2;
        this.f138921s = zAppCompatImageView;
        this.f138922t = robotoTextView;
        this.f138923u = zdsActionBar;
    }

    /* renamed from: a */
    public static C29971p m148341a(View view) {
        int i11 = AbstractC6918a0.btnPassphrase;
        TypeProtectCodeView typeProtectCodeView = (TypeProtectCodeView) AbstractC22716b.m117526a(view, i11);
        if (typeProtectCodeView != null) {
            i11 = AbstractC6918a0.btnPinCode;
            TypeProtectCodeView typeProtectCodeView2 = (TypeProtectCodeView) AbstractC22716b.m117526a(view, i11);
            if (typeProtectCodeView2 != null) {
                i11 = AbstractC6918a0.ivSyncData;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.zds_action_bar;
                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                        if (zdsActionBar != null) {
                            return new C29971p((FrameLayout) view, typeProtectCodeView, typeProtectCodeView2, zAppCompatImageView, robotoTextView, zdsActionBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29971p m148342c(LayoutInflater layoutInflater) {
        return m148343d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29971p m148343d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.backup_key_verification_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148341a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138918p;
    }
}
