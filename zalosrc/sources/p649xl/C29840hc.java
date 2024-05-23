package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.zdesign.component.RadioButton;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.hc */
/* loaded from: classes3.dex */
public final class C29840hc implements InterfaceC22715a {

    /* renamed from: A */
    public final RadioButton f138045A;

    /* renamed from: B */
    public final RadioButton f138046B;

    /* renamed from: C */
    public final RadioButton f138047C;

    /* renamed from: p */
    private final View f138048p;

    /* renamed from: q */
    public final RoundCornerImageView f138049q;

    /* renamed from: r */
    public final RoundCornerImageView f138050r;

    /* renamed from: s */
    public final RoundCornerImageView f138051s;

    /* renamed from: t */
    public final ListItemSetting f138052t;

    /* renamed from: u */
    public final ListItemSetting f138053u;

    /* renamed from: v */
    public final ListItemSetting f138054v;

    /* renamed from: w */
    public final LinearLayout f138055w;

    /* renamed from: x */
    public final LinearLayout f138056x;

    /* renamed from: y */
    public final LinearLayout f138057y;

    /* renamed from: z */
    public final LinearLayout f138058z;

    private C29840hc(View view, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, RoundCornerImageView roundCornerImageView3, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f138048p = view;
        this.f138049q = roundCornerImageView;
        this.f138050r = roundCornerImageView2;
        this.f138051s = roundCornerImageView3;
        this.f138052t = listItemSetting;
        this.f138053u = listItemSetting2;
        this.f138054v = listItemSetting3;
        this.f138055w = linearLayout;
        this.f138056x = linearLayout2;
        this.f138057y = linearLayout3;
        this.f138058z = linearLayout4;
        this.f138045A = radioButton;
        this.f138046B = radioButton2;
        this.f138047C = radioButton3;
    }

    /* renamed from: a */
    public static C29840hc m148043a(View view) {
        int i11 = AbstractC6918a0.img_theme_dark;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) AbstractC22716b.m117526a(view, i11);
        if (roundCornerImageView != null) {
            i11 = AbstractC6918a0.img_theme_light;
            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) AbstractC22716b.m117526a(view, i11);
            if (roundCornerImageView2 != null) {
                i11 = AbstractC6918a0.img_theme_system;
                RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) AbstractC22716b.m117526a(view, i11);
                if (roundCornerImageView3 != null) {
                    i11 = AbstractC6918a0.itemChangeFont;
                    ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting != null) {
                        i11 = AbstractC6918a0.itemChangeLanguage;
                        ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting2 != null) {
                            i11 = AbstractC6918a0.itemChangeSizeText;
                            ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting3 != null) {
                                i11 = AbstractC6918a0.layoutTheme;
                                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout != null) {
                                    i11 = AbstractC6918a0.layoutThemeDark;
                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout2 != null) {
                                        i11 = AbstractC6918a0.layoutThemeLight;
                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                        if (linearLayout3 != null) {
                                            i11 = AbstractC6918a0.layoutThemeSystem;
                                            LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout4 != null) {
                                                i11 = AbstractC6918a0.radioThemeDark;
                                                RadioButton radioButton = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                                if (radioButton != null) {
                                                    i11 = AbstractC6918a0.radioThemeLight;
                                                    RadioButton radioButton2 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                                    if (radioButton2 != null) {
                                                        i11 = AbstractC6918a0.radioThemeSystem;
                                                        RadioButton radioButton3 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                                        if (radioButton3 != null) {
                                                            return new C29840hc(view, roundCornerImageView, roundCornerImageView2, roundCornerImageView3, listItemSetting, listItemSetting2, listItemSetting3, linearLayout, linearLayout2, linearLayout3, linearLayout4, radioButton, radioButton2, radioButton3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29840hc m148044b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_theme_v2_view, viewGroup);
            return m148043a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138048p;
    }
}
