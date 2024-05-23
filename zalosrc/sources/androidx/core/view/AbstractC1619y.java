package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import p225i1.InterfaceMenuItemC20184b;

/* renamed from: androidx.core.view.y */
/* loaded from: classes2.dex */
public abstract class AbstractC1619y {

    /* renamed from: androidx.core.view.y$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static int m8259a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        static CharSequence m8260b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        static ColorStateList m8261c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        static PorterDuff.Mode m8262d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        static int m8263e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        static CharSequence m8264f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        static MenuItem m8265g(MenuItem menuItem, char c11, int i11) {
            return menuItem.setAlphabeticShortcut(c11, i11);
        }

        /* renamed from: h */
        static MenuItem m8266h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        static MenuItem m8267i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        static MenuItem m8268j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        static MenuItem m8269k(MenuItem menuItem, char c11, int i11) {
            return menuItem.setNumericShortcut(c11, i11);
        }

        /* renamed from: l */
        static MenuItem m8270l(MenuItem menuItem, char c11, char c12, int i11, int i12) {
            return menuItem.setShortcut(c11, c12, i11, i12);
        }

        /* renamed from: m */
        static MenuItem m8271m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m8252a(MenuItem menuItem, AbstractC1530b abstractC1530b) {
        if (menuItem instanceof InterfaceMenuItemC20184b) {
            return ((InterfaceMenuItemC20184b) menuItem).mo5106b(abstractC1530b);
        }
        return menuItem;
    }

    /* renamed from: b */
    public static void m8253b(MenuItem menuItem, char c11, int i11) {
        if (menuItem instanceof InterfaceMenuItemC20184b) {
            ((InterfaceMenuItemC20184b) menuItem).setAlphabeticShortcut(c11, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m8265g(menuItem, c11, i11);
        }
    }

    /* renamed from: c */
    public static void m8254c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC20184b) {
            ((InterfaceMenuItemC20184b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m8266h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m8255d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC20184b) {
            ((InterfaceMenuItemC20184b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m8267i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m8256e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC20184b) {
            ((InterfaceMenuItemC20184b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m8268j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m8257f(MenuItem menuItem, char c11, int i11) {
        if (menuItem instanceof InterfaceMenuItemC20184b) {
            ((InterfaceMenuItemC20184b) menuItem).setNumericShortcut(c11, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m8269k(menuItem, c11, i11);
        }
    }

    /* renamed from: g */
    public static void m8258g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC20184b) {
            ((InterfaceMenuItemC20184b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m8271m(menuItem, charSequence);
        }
    }
}
