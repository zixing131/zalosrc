package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.qf */
/* loaded from: classes3.dex */
public final class C30005qf implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139157p;

    /* renamed from: q */
    public final Button f139158q;

    /* renamed from: r */
    public final Button f139159r;

    private C30005qf(LinearLayout linearLayout, Button button, Button button2) {
        this.f139157p = linearLayout;
        this.f139158q = button;
        this.f139159r = button2;
    }

    /* renamed from: a */
    public static C30005qf m148420a(View view) {
        int i11 = AbstractC6918a0.btn_ignore;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_login;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                return new C30005qf((LinearLayout) view, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30005qf m148421c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_drive_login_button_group, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148420a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139157p;
    }
}
