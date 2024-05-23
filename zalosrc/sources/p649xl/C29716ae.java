package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zmedia.view.ZVideoView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ae */
/* loaded from: classes3.dex */
public final class C29716ae implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137258p;

    /* renamed from: q */
    public final FrameLayout f137259q;

    /* renamed from: r */
    public final RobotoTextView f137260r;

    /* renamed from: s */
    public final RobotoButton f137261s;

    /* renamed from: t */
    public final ImageButton f137262t;

    /* renamed from: u */
    public final FrameLayout f137263u;

    /* renamed from: v */
    public final View f137264v;

    /* renamed from: w */
    public final FrameLayout f137265w;

    /* renamed from: x */
    public final ZVideoView f137266x;

    /* renamed from: y */
    public final FrameLayout f137267y;

    private C29716ae(RelativeLayout relativeLayout, FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoButton robotoButton, ImageButton imageButton, FrameLayout frameLayout2, View view, FrameLayout frameLayout3, ZVideoView zVideoView, FrameLayout frameLayout4) {
        this.f137258p = relativeLayout;
        this.f137259q = frameLayout;
        this.f137260r = robotoTextView;
        this.f137261s = robotoButton;
        this.f137262t = imageButton;
        this.f137263u = frameLayout2;
        this.f137264v = view;
        this.f137265w = frameLayout3;
        this.f137266x = zVideoView;
        this.f137267y = frameLayout4;
    }

    /* renamed from: a */
    public static C29716ae m147739a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.bottom_controllers;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC6918a0.cancel_button;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.done_button;
                RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
                if (robotoButton != null) {
                    i11 = AbstractC6918a0.play_pause_button;
                    ImageButton imageButton = (ImageButton) AbstractC22716b.m117526a(view, i11);
                    if (imageButton != null) {
                        i11 = AbstractC6918a0.range_picker_holder;
                        FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.video_clickable_view))) != null) {
                            i11 = AbstractC6918a0.video_timeline_holder;
                            FrameLayout frameLayout3 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout3 != null) {
                                i11 = AbstractC6918a0.video_view;
                                ZVideoView zVideoView = (ZVideoView) AbstractC22716b.m117526a(view, i11);
                                if (zVideoView != null) {
                                    i11 = AbstractC6918a0.video_view_wrapper;
                                    FrameLayout frameLayout4 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                    if (frameLayout4 != null) {
                                        return new C29716ae((RelativeLayout) view, frameLayout, robotoTextView, robotoButton, imageButton, frameLayout2, m117526a, frameLayout3, zVideoView, frameLayout4);
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
    public static C29716ae m147740c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.trim_video_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147739a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137258p;
    }
}
