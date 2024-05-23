package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.z4 */
/* loaded from: classes3.dex */
public final class C30148z4 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140097p;

    /* renamed from: q */
    public final AppCompatImageView f140098q;

    private C30148z4(LinearLayout linearLayout, AppCompatImageView appCompatImageView) {
        this.f140097p = linearLayout;
        this.f140098q = appCompatImageView;
    }

    /* renamed from: a */
    public static C30148z4 m148768a(View view) {
        int i11 = AbstractC6918a0.ic_img;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            return new C30148z4((LinearLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30148z4 m148769c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_create_ai_sticker_row_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148768a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140097p;
    }
}
