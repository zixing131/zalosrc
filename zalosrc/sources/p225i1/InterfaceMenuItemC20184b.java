package p225i1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.AbstractC1530b;

/* renamed from: i1.b */
/* loaded from: classes2.dex */
public interface InterfaceMenuItemC20184b extends MenuItem {
    /* renamed from: a */
    AbstractC1530b mo5105a();

    /* renamed from: b */
    InterfaceMenuItemC20184b mo5106b(AbstractC1530b abstractC1530b);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i11);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c11, int i11);

    @Override // android.view.MenuItem
    InterfaceMenuItemC20184b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c11, int i11);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c11, char c12, int i11, int i12);

    @Override // android.view.MenuItem
    void setShowAsAction(int i11);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i11);

    @Override // android.view.MenuItem
    InterfaceMenuItemC20184b setTooltipText(CharSequence charSequence);
}
