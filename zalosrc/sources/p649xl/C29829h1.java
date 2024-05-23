package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StickerProgressView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.h1 */
/* loaded from: classes3.dex */
public final class C29829h1 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137938p;

    /* renamed from: q */
    public final StickerProgressView f137939q;

    /* renamed from: r */
    public final RobotoTextView f137940r;

    /* renamed from: s */
    public final RobotoTextView f137941s;

    /* renamed from: t */
    public final RobotoTextView f137942t;

    private C29829h1(RelativeLayout relativeLayout, StickerProgressView stickerProgressView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f137938p = relativeLayout;
        this.f137939q = stickerProgressView;
        this.f137940r = robotoTextView;
        this.f137941s = robotoTextView2;
        this.f137942t = robotoTextView3;
    }

    /* renamed from: a */
    public static C29829h1 m148015a(View view) {
        int i11 = AbstractC6918a0.loading_progress;
        StickerProgressView stickerProgressView = (StickerProgressView) AbstractC22716b.m117526a(view, i11);
        if (stickerProgressView != null) {
            i11 = AbstractC6918a0.text_current;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.text_moving;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    i11 = AbstractC6918a0.text_next;
                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView3 != null) {
                        return new C29829h1((RelativeLayout) view, stickerProgressView, robotoTextView, robotoTextView2, robotoTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29829h1 m148016c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.box_lyric_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148015a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137938p;
    }
}
