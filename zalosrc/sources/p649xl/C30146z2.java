package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.chat.picker.doodle.NewSelectColorView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.z2 */
/* loaded from: classes3.dex */
public final class C30146z2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140081p;

    /* renamed from: q */
    public final ImageButton f140082q;

    /* renamed from: r */
    public final ImageButton f140083r;

    /* renamed from: s */
    public final ImageButton f140084s;

    /* renamed from: t */
    public final ImageButton f140085t;

    /* renamed from: u */
    public final ImageButton f140086u;

    /* renamed from: v */
    public final ImageButton f140087v;

    /* renamed from: w */
    public final HorizontalScrollView f140088w;

    /* renamed from: x */
    public final FrameLayout f140089x;

    /* renamed from: y */
    public final ViewStub f140090y;

    /* renamed from: z */
    public final NewSelectColorView f140091z;

    private C30146z2(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, HorizontalScrollView horizontalScrollView, FrameLayout frameLayout, ViewStub viewStub, NewSelectColorView newSelectColorView) {
        this.f140081p = linearLayout;
        this.f140082q = imageButton;
        this.f140083r = imageButton2;
        this.f140084s = imageButton3;
        this.f140085t = imageButton4;
        this.f140086u = imageButton5;
        this.f140087v = imageButton6;
        this.f140088w = horizontalScrollView;
        this.f140089x = frameLayout;
        this.f140090y = viewStub;
        this.f140091z = newSelectColorView;
    }

    /* renamed from: a */
    public static C30146z2 m148765a(View view) {
        int i11 = AbstractC6918a0.btn_bg;
        ImageButton imageButton = (ImageButton) AbstractC22716b.m117526a(view, i11);
        if (imageButton != null) {
            i11 = AbstractC6918a0.btn_cleardrawing;
            ImageButton imageButton2 = (ImageButton) AbstractC22716b.m117526a(view, i11);
            if (imageButton2 != null) {
                i11 = AbstractC6918a0.btn_color;
                ImageButton imageButton3 = (ImageButton) AbstractC22716b.m117526a(view, i11);
                if (imageButton3 != null) {
                    i11 = AbstractC6918a0.btn_draw;
                    ImageButton imageButton4 = (ImageButton) AbstractC22716b.m117526a(view, i11);
                    if (imageButton4 != null) {
                        i11 = AbstractC6918a0.btn_eraser;
                        ImageButton imageButton5 = (ImageButton) AbstractC22716b.m117526a(view, i11);
                        if (imageButton5 != null) {
                            i11 = AbstractC6918a0.btn_undo;
                            ImageButton imageButton6 = (ImageButton) AbstractC22716b.m117526a(view, i11);
                            if (imageButton6 != null) {
                                i11 = AbstractC6918a0.horizontalScrollView;
                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) AbstractC22716b.m117526a(view, i11);
                                if (horizontalScrollView != null) {
                                    i11 = AbstractC6918a0.myfingerpaint;
                                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                    if (frameLayout != null) {
                                        i11 = AbstractC6918a0.stub_layout_brush_size;
                                        ViewStub viewStub = (ViewStub) AbstractC22716b.m117526a(view, i11);
                                        if (viewStub != null) {
                                            i11 = AbstractC6918a0.tablecolors;
                                            NewSelectColorView newSelectColorView = (NewSelectColorView) AbstractC22716b.m117526a(view, i11);
                                            if (newSelectColorView != null) {
                                                return new C30146z2((LinearLayout) view, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, horizontalScrollView, frameLayout, viewStub, newSelectColorView);
                                            }
                                        }
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
    public static C30146z2 m148766c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.draw_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148765a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140081p;
    }
}
