package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.CheckBox;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a1 */
/* loaded from: classes3.dex */
public final class C29703a1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137184p;

    /* renamed from: q */
    public final Button f137185q;

    /* renamed from: r */
    public final CheckBox f137186r;

    private C29703a1(LinearLayout linearLayout, Button button, CheckBox checkBox) {
        this.f137184p = linearLayout;
        this.f137185q = button;
        this.f137186r = checkBox;
    }

    /* renamed from: a */
    public static C29703a1 m147702a(View view) {
        int i11 = AbstractC6918a0.button_scan_another;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.check_box_agree_submit;
            CheckBox checkBox = (CheckBox) AbstractC22716b.m117526a(view, i11);
            if (checkBox != null) {
                return new C29703a1((LinearLayout) view, button, checkBox);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29703a1 m147703c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_report_qr_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147702a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137184p;
    }
}
