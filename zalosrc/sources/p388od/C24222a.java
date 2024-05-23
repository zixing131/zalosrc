package p388od;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.biometric.AbstractC7358v0;
import com.zing.zalo.biometric.AbstractC7360w0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: od.a */
/* loaded from: classes3.dex */
public final class C24222a implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f116933p;

    /* renamed from: q */
    public final LinearLayout f116934q;

    /* renamed from: r */
    public final TextView f116935r;

    /* renamed from: s */
    public final AppCompatImageView f116936s;

    /* renamed from: t */
    public final TextView f116937t;

    /* renamed from: u */
    public final TextView f116938u;

    /* renamed from: v */
    public final LinearLayout f116939v;

    private C24222a(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3, LinearLayout linearLayout2) {
        this.f116933p = relativeLayout;
        this.f116934q = linearLayout;
        this.f116935r = textView;
        this.f116936s = appCompatImageView;
        this.f116937t = textView2;
        this.f116938u = textView3;
        this.f116939v = linearLayout2;
    }

    /* renamed from: a */
    public static C24222a m126375a(View view) {
        int i11 = AbstractC7358v0.biometricCloseBtn;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC7358v0.biometric_error;
            TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
            if (textView != null) {
                i11 = AbstractC7358v0.biometric_finger_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (appCompatImageView != null) {
                    i11 = AbstractC7358v0.biometric_subtitle;
                    TextView textView2 = (TextView) AbstractC22716b.m117526a(view, i11);
                    if (textView2 != null) {
                        i11 = AbstractC7358v0.biometric_title;
                        TextView textView3 = (TextView) AbstractC22716b.m117526a(view, i11);
                        if (textView3 != null) {
                            i11 = AbstractC7358v0.linear_summary;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                return new C24222a((RelativeLayout) view, linearLayout, textView, appCompatImageView, textView2, textView3, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24222a m126376c(LayoutInflater layoutInflater) {
        return m126377d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C24222a m126377d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7360w0.biometric_dialog, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m126375a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f116933p;
    }
}
