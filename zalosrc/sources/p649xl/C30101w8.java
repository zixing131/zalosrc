package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ListItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.w8 */
/* loaded from: classes3.dex */
public final class C30101w8 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139794p;

    /* renamed from: q */
    public final Button f139795q;

    /* renamed from: r */
    public final RobotoTextView f139796r;

    /* renamed from: s */
    public final ListItem f139797s;

    /* renamed from: t */
    public final ListItem f139798t;

    /* renamed from: u */
    public final ListItem f139799u;

    /* renamed from: v */
    public final ListItem f139800v;

    private C30101w8(LinearLayout linearLayout, Button button, RobotoTextView robotoTextView, ListItem listItem, ListItem listItem2, ListItem listItem3, ListItem listItem4) {
        this.f139794p = linearLayout;
        this.f139795q = button;
        this.f139796r = robotoTextView;
        this.f139797s = listItem;
        this.f139798t = listItem2;
        this.f139799u = listItem3;
        this.f139800v = listItem4;
    }

    /* renamed from: a */
    public static C30101w8 m148653a(View view) {
        int i11 = AbstractC6918a0.btn_clean_my_cloud;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.section_clean_header;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.section_file;
                ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
                if (listItem != null) {
                    i11 = AbstractC6918a0.section_other;
                    ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
                    if (listItem2 != null) {
                        i11 = AbstractC6918a0.section_photo;
                        ListItem listItem3 = (ListItem) AbstractC22716b.m117526a(view, i11);
                        if (listItem3 != null) {
                            i11 = AbstractC6918a0.section_video;
                            ListItem listItem4 = (ListItem) AbstractC22716b.m117526a(view, i11);
                            if (listItem4 != null) {
                                return new C30101w8((LinearLayout) view, button, robotoTextView, listItem, listItem2, listItem3, listItem4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139794p;
    }
}
