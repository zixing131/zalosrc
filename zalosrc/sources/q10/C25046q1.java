package q10;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import com.zing.zalo.p077ui.widget.RobotoRadioButton;
import com.zing.zalo.shortvideo.p072ui.widget.et.NestedEditText;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.q1 */
/* loaded from: classes5.dex */
public final class C25046q1 implements InterfaceC22715a {

    /* renamed from: p */
    private final ScrollView f120193p;

    /* renamed from: q */
    public final View f120194q;

    /* renamed from: r */
    public final RobotoRadioButton f120195r;

    /* renamed from: s */
    public final RobotoRadioButton f120196s;

    /* renamed from: t */
    public final RobotoRadioButton f120197t;

    /* renamed from: u */
    public final RobotoRadioButton f120198u;

    /* renamed from: v */
    public final RobotoRadioButton f120199v;

    /* renamed from: w */
    public final RobotoRadioButton f120200w;

    /* renamed from: x */
    public final NestedEditText f120201x;

    /* renamed from: y */
    public final RadioGroup f120202y;

    /* renamed from: z */
    public final ScrollView f120203z;

    private C25046q1(ScrollView scrollView, View view, RobotoRadioButton robotoRadioButton, RobotoRadioButton robotoRadioButton2, RobotoRadioButton robotoRadioButton3, RobotoRadioButton robotoRadioButton4, RobotoRadioButton robotoRadioButton5, RobotoRadioButton robotoRadioButton6, NestedEditText nestedEditText, RadioGroup radioGroup, ScrollView scrollView2) {
        this.f120193p = scrollView;
        this.f120194q = view;
        this.f120195r = robotoRadioButton;
        this.f120196s = robotoRadioButton2;
        this.f120197t = robotoRadioButton3;
        this.f120198u = robotoRadioButton4;
        this.f120199v = robotoRadioButton5;
        this.f120200w = robotoRadioButton6;
        this.f120201x = nestedEditText;
        this.f120202y = radioGroup;
        this.f120203z = scrollView2;
    }

    /* renamed from: a */
    public static C25046q1 m129922a(View view) {
        int i11 = AbstractC27409d.bottomView;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC27409d.rb_1;
            RobotoRadioButton robotoRadioButton = (RobotoRadioButton) AbstractC22716b.m117526a(view, i11);
            if (robotoRadioButton != null) {
                i11 = AbstractC27409d.rb_2;
                RobotoRadioButton robotoRadioButton2 = (RobotoRadioButton) AbstractC22716b.m117526a(view, i11);
                if (robotoRadioButton2 != null) {
                    i11 = AbstractC27409d.rb_3;
                    RobotoRadioButton robotoRadioButton3 = (RobotoRadioButton) AbstractC22716b.m117526a(view, i11);
                    if (robotoRadioButton3 != null) {
                        i11 = AbstractC27409d.rb_4;
                        RobotoRadioButton robotoRadioButton4 = (RobotoRadioButton) AbstractC22716b.m117526a(view, i11);
                        if (robotoRadioButton4 != null) {
                            i11 = AbstractC27409d.rb_5;
                            RobotoRadioButton robotoRadioButton5 = (RobotoRadioButton) AbstractC22716b.m117526a(view, i11);
                            if (robotoRadioButton5 != null) {
                                i11 = AbstractC27409d.rb_6;
                                RobotoRadioButton robotoRadioButton6 = (RobotoRadioButton) AbstractC22716b.m117526a(view, i11);
                                if (robotoRadioButton6 != null) {
                                    i11 = AbstractC27409d.reportEdt;
                                    NestedEditText nestedEditText = (NestedEditText) AbstractC22716b.m117526a(view, i11);
                                    if (nestedEditText != null) {
                                        i11 = AbstractC27409d.reportRadioGroup;
                                        RadioGroup radioGroup = (RadioGroup) AbstractC22716b.m117526a(view, i11);
                                        if (radioGroup != null) {
                                            ScrollView scrollView = (ScrollView) view;
                                            return new C25046q1(scrollView, m117526a, robotoRadioButton, robotoRadioButton2, robotoRadioButton3, robotoRadioButton4, robotoRadioButton5, robotoRadioButton6, nestedEditText, radioGroup, scrollView);
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

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f120193p;
    }
}
