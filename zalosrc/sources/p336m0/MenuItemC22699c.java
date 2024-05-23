package p336m0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1530b;
import java.lang.reflect.Method;
import p225i1.InterfaceMenuItemC20184b;
import p310l0.InterfaceC21982c;

/* renamed from: m0.c */
/* loaded from: classes2.dex */
public class MenuItemC22699c extends AbstractC22698b implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC20184b f111217d;

    /* renamed from: e */
    private Method f111218e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0.c$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC1530b {

        /* renamed from: d */
        final ActionProvider f111219d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f111219d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1530b
        /* renamed from: a */
        public boolean mo7698a() {
            return this.f111219d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1530b
        /* renamed from: d */
        public boolean mo7701d() {
            return this.f111219d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1530b
        /* renamed from: e */
        public void mo7702e(SubMenu subMenu) {
            this.f111219d.onPrepareSubMenu(MenuItemC22699c.this.m117392d(subMenu));
        }
    }

    /* renamed from: m0.c$b */
    /* loaded from: classes2.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private AbstractC1530b.b f111221f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC1530b
        /* renamed from: b */
        public boolean mo7699b() {
            return this.f111219d.isVisible();
        }

        @Override // androidx.core.view.AbstractC1530b
        /* renamed from: c */
        public View mo7700c(MenuItem menuItem) {
            return this.f111219d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1530b
        /* renamed from: f */
        public boolean mo7703f() {
            return this.f111219d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1530b
        /* renamed from: i */
        public void mo7706i(AbstractC1530b.b bVar) {
            b bVar2;
            this.f111221f = bVar;
            ActionProvider actionProvider = this.f111219d;
            if (bVar != null) {
                bVar2 = this;
            } else {
                bVar2 = null;
            }
            actionProvider.setVisibilityListener(bVar2);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z11) {
            AbstractC1530b.b bVar = this.f111221f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z11);
            }
        }
    }

    /* renamed from: m0.c$c */
    /* loaded from: classes2.dex */
    static class c extends FrameLayout implements InterfaceC21982c {

        /* renamed from: p */
        final CollapsibleActionView f111223p;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f111223p = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p310l0.InterfaceC21982c
        /* renamed from: a */
        public void mo5369a() {
            this.f111223p.onActionViewExpanded();
        }

        /* renamed from: b */
        View m117397b() {
            return (View) this.f111223p;
        }

        @Override // p310l0.InterfaceC21982c
        /* renamed from: d */
        public void mo5373d() {
            this.f111223p.onActionViewCollapsed();
        }
    }

    /* renamed from: m0.c$d */
    /* loaded from: classes2.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f111224a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f111224a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f111224a.onMenuItemActionCollapse(MenuItemC22699c.this.m117391c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f111224a.onMenuItemActionExpand(MenuItemC22699c.this.m117391c(menuItem));
        }
    }

    /* renamed from: m0.c$e */
    /* loaded from: classes2.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f111226a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f111226a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f111226a.onMenuItemClick(MenuItemC22699c.this.m117391c(menuItem));
        }
    }

    public MenuItemC22699c(Context context, InterfaceMenuItemC20184b interfaceMenuItemC20184b) {
        super(context);
        if (interfaceMenuItemC20184b != null) {
            this.f111217d = interfaceMenuItemC20184b;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f111217d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f111217d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1530b mo5105a = this.f111217d.mo5105a();
        if (mo5105a instanceof a) {
            return ((a) mo5105a).f111219d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f111217d.getActionView();
        if (actionView instanceof c) {
            return ((c) actionView).m117397b();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f111217d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f111217d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f111217d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f111217d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f111217d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f111217d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f111217d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f111217d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f111217d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f111217d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f111217d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f111217d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f111217d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m117392d(this.f111217d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f111217d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f111217d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f111217d.getTooltipText();
    }

    /* renamed from: h */
    public void m117396h(boolean z11) {
        try {
            if (this.f111218e == null) {
                this.f111218e = this.f111217d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f111218e.invoke(this.f111217d, Boolean.valueOf(z11));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f111217d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f111217d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f111217d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f111217d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f111217d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f111217d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f111214a, actionProvider);
        InterfaceMenuItemC20184b interfaceMenuItemC20184b = this.f111217d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC20184b.mo5106b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f111217d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11) {
        this.f111217d.setAlphabeticShortcut(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z11) {
        this.f111217d.setCheckable(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z11) {
        this.f111217d.setChecked(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f111217d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z11) {
        this.f111217d.setEnabled(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f111217d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f111217d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f111217d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f111217d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11) {
        this.f111217d.setNumericShortcut(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        d dVar;
        InterfaceMenuItemC20184b interfaceMenuItemC20184b = this.f111217d;
        if (onActionExpandListener != null) {
            dVar = new d(onActionExpandListener);
        } else {
            dVar = null;
        }
        interfaceMenuItemC20184b.setOnActionExpandListener(dVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        e eVar;
        InterfaceMenuItemC20184b interfaceMenuItemC20184b = this.f111217d;
        if (onMenuItemClickListener != null) {
            eVar = new e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        interfaceMenuItemC20184b.setOnMenuItemClickListener(eVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12) {
        this.f111217d.setShortcut(c11, c12);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i11) {
        this.f111217d.setShowAsAction(i11);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i11) {
        this.f111217d.setShowAsActionFlags(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f111217d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f111217d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f111217d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z11) {
        return this.f111217d.setVisible(z11);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        this.f111217d.setAlphabeticShortcut(c11, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i11) {
        this.f111217d.setIcon(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11, int i11) {
        this.f111217d.setNumericShortcut(c11, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f111217d.setShortcut(c11, c12, i11, i12);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i11) {
        this.f111217d.setTitle(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i11) {
        this.f111217d.setActionView(i11);
        View actionView = this.f111217d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f111217d.setActionView(new c(actionView));
        }
        return this;
    }
}
