package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.webview.ZWebView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.le */
/* loaded from: classes3.dex */
public final class C29914le implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138621p;

    /* renamed from: q */
    public final C29940n4 f138622q;

    /* renamed from: r */
    public final RelativeLayout f138623r;

    /* renamed from: s */
    public final LinearLayout f138624s;

    /* renamed from: t */
    public final ZWebView f138625t;

    private C29914le(LinearLayout linearLayout, C29940n4 c29940n4, RelativeLayout relativeLayout, LinearLayout linearLayout2, ZWebView zWebView) {
        this.f138621p = linearLayout;
        this.f138622q = c29940n4;
        this.f138623r = relativeLayout;
        this.f138624s = linearLayout2;
        this.f138625t = zWebView;
    }

    /* renamed from: a */
    public static C29914le m148218a(View view) {
        int i11 = AbstractC6918a0.chat_left_progressbar_image;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            C29940n4 m148270a = C29940n4.m148270a(m117526a);
            i11 = AbstractC6918a0.layoutloading;
            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeLayout != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = AbstractC6918a0.webview;
                ZWebView zWebView = (ZWebView) AbstractC22716b.m117526a(view, i11);
                if (zWebView != null) {
                    return new C29914le(linearLayout, m148270a, relativeLayout, linearLayout, zWebView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29914le m148219c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.web_in_app_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148218a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138621p;
    }
}
