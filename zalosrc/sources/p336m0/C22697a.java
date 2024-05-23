package p336m0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1530b;
import p225i1.InterfaceMenuItemC20184b;

/* renamed from: m0.a */
/* loaded from: classes2.dex */
public class C22697a implements InterfaceMenuItemC20184b {

    /* renamed from: a */
    private final int f111194a;

    /* renamed from: b */
    private final int f111195b;

    /* renamed from: c */
    private final int f111196c;

    /* renamed from: d */
    private CharSequence f111197d;

    /* renamed from: e */
    private CharSequence f111198e;

    /* renamed from: f */
    private Intent f111199f;

    /* renamed from: g */
    private char f111200g;

    /* renamed from: i */
    private char f111202i;

    /* renamed from: k */
    private Drawable f111204k;

    /* renamed from: l */
    private Context f111205l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f111206m;

    /* renamed from: n */
    private CharSequence f111207n;

    /* renamed from: o */
    private CharSequence f111208o;

    /* renamed from: h */
    private int f111201h = 4096;

    /* renamed from: j */
    private int f111203j = 4096;

    /* renamed from: p */
    private ColorStateList f111209p = null;

    /* renamed from: q */
    private PorterDuff.Mode f111210q = null;

    /* renamed from: r */
    private boolean f111211r = false;

    /* renamed from: s */
    private boolean f111212s = false;

    /* renamed from: t */
    private int f111213t = 16;

    public C22697a(Context context, int i11, int i12, int i13, int i14, CharSequence charSequence) {
        this.f111205l = context;
        this.f111194a = i12;
        this.f111195b = i11;
        this.f111196c = i14;
        this.f111197d = charSequence;
    }

    /* renamed from: c */
    private void m117387c() {
        Drawable drawable = this.f111204k;
        if (drawable != null) {
            if (this.f111211r || this.f111212s) {
                Drawable m7200r = AbstractC1414a.m7200r(drawable);
                this.f111204k = m7200r;
                Drawable mutate = m7200r.mutate();
                this.f111204k = mutate;
                if (this.f111211r) {
                    AbstractC1414a.m7197o(mutate, this.f111209p);
                }
                if (this.f111212s) {
                    AbstractC1414a.m7198p(this.f111204k, this.f111210q);
                }
            }
        }
    }

    @Override // p225i1.InterfaceMenuItemC20184b
    /* renamed from: a */
    public AbstractC1530b mo5105a() {
        return null;
    }

    @Override // p225i1.InterfaceMenuItemC20184b
    /* renamed from: b */
    public InterfaceMenuItemC20184b mo5106b(AbstractC1530b abstractC1530b) {
        throw new UnsupportedOperationException();
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC20184b setActionView(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC20184b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC20184b setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f111203j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f111202i;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f111207n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f111195b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f111204k;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f111209p;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f111210q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f111199f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f111194a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f111201h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f111200g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f111196c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f111197d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f111198e;
        return charSequence != null ? charSequence : this.f111197d;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f111208o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f111213t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f111213t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f111213t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f111213t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11) {
        this.f111202i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z11) {
        this.f111213t = (z11 ? 1 : 0) | (this.f111213t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z11) {
        this.f111213t = (z11 ? 2 : 0) | (this.f111213t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC20184b setContentDescription(CharSequence charSequence) {
        this.f111207n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z11) {
        this.f111213t = (z11 ? 16 : 0) | (this.f111213t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f111204k = drawable;
        m117387c();
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f111209p = colorStateList;
        this.f111211r = true;
        m117387c();
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f111210q = mode;
        this.f111212s = true;
        m117387c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f111199f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11) {
        this.f111200g = c11;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f111206m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12) {
        this.f111200g = c11;
        this.f111202i = Character.toLowerCase(c12);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public void setShowAsAction(int i11) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f111197d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f111198e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC20184b setTooltipText(CharSequence charSequence) {
        this.f111208o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z11) {
        this.f111213t = (this.f111213t & 8) | (z11 ? 0 : 8);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        this.f111202i = Character.toLowerCase(c11);
        this.f111203j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i11) {
        this.f111204k = AbstractC1388a.m6964f(this.f111205l, i11);
        m117387c();
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c11, int i11) {
        this.f111200g = c11;
        this.f111201h = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f111200g = c11;
        this.f111201h = KeyEvent.normalizeMetaState(i11);
        this.f111202i = Character.toLowerCase(c12);
        this.f111203j = KeyEvent.normalizeMetaState(i12);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i11) {
        this.f111197d = this.f111205l.getResources().getString(i11);
        return this;
    }
}
