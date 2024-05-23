package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ib */
/* loaded from: classes3.dex */
public final class C29857ib implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138180p;

    /* renamed from: q */
    public final ImageView f138181q;

    /* renamed from: r */
    public final ImageView f138182r;

    /* renamed from: s */
    public final ImageView f138183s;

    /* renamed from: t */
    public final LinearLayout f138184t;

    /* renamed from: u */
    public final LinearLayout f138185u;

    /* renamed from: v */
    public final LinearLayout f138186v;

    /* renamed from: w */
    public final LinearLayout f138187w;

    /* renamed from: x */
    public final ScrollView f138188x;

    /* renamed from: y */
    public final ZdsActionBar f138189y;

    private C29857ib(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ScrollView scrollView, ZdsActionBar zdsActionBar) {
        this.f138180p = linearLayout;
        this.f138181q = imageView;
        this.f138182r = imageView2;
        this.f138183s = imageView3;
        this.f138184t = linearLayout2;
        this.f138185u = linearLayout3;
        this.f138186v = linearLayout4;
        this.f138187w = linearLayout5;
        this.f138188x = scrollView;
        this.f138189y = zdsActionBar;
    }

    /* renamed from: a */
    public static C29857ib m148082a(View view) {
        int i11 = AbstractC6918a0.ic_disable_auto_play;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC6918a0.ic_enable_auto_play;
            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView2 != null) {
                i11 = AbstractC6918a0.ic_enable_auto_play_with_wifi;
                ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView3 != null) {
                    i11 = AbstractC6918a0.ll_disable_auto_download;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.ll_enable_auto_download;
                        LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout2 != null) {
                            i11 = AbstractC6918a0.ll_enable_auto_download_with_wifi;
                            LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout3 != null) {
                                LinearLayout linearLayout4 = (LinearLayout) view;
                                i11 = AbstractC6918a0.scroll_main_layout;
                                ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
                                if (scrollView != null) {
                                    i11 = AbstractC6918a0.zds_action_bar;
                                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                    if (zdsActionBar != null) {
                                        return new C29857ib(linearLayout4, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, scrollView, zdsActionBar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29857ib m148083c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_auto_download_music_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148082a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138180p;
    }
}
