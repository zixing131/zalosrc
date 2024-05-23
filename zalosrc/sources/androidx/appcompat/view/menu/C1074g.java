package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1530b;
import p175g0.AbstractC19185h;
import p193h0.AbstractC19694b;
import p225i1.InterfaceMenuItemC20184b;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes2.dex */
public final class C1074g implements InterfaceMenuItemC20184b {

    /* renamed from: A */
    private View f4044A;

    /* renamed from: B */
    private AbstractC1530b f4045B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f4046C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f4048E;

    /* renamed from: a */
    private final int f4049a;

    /* renamed from: b */
    private final int f4050b;

    /* renamed from: c */
    private final int f4051c;

    /* renamed from: d */
    private final int f4052d;

    /* renamed from: e */
    private CharSequence f4053e;

    /* renamed from: f */
    private CharSequence f4054f;

    /* renamed from: g */
    private Intent f4055g;

    /* renamed from: h */
    private char f4056h;

    /* renamed from: j */
    private char f4058j;

    /* renamed from: l */
    private Drawable f4060l;

    /* renamed from: n */
    C1072e f4062n;

    /* renamed from: o */
    private SubMenuC1080m f4063o;

    /* renamed from: p */
    private Runnable f4064p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f4065q;

    /* renamed from: r */
    private CharSequence f4066r;

    /* renamed from: s */
    private CharSequence f4067s;

    /* renamed from: z */
    private int f4074z;

    /* renamed from: i */
    private int f4057i = 4096;

    /* renamed from: k */
    private int f4059k = 4096;

    /* renamed from: m */
    private int f4061m = 0;

    /* renamed from: t */
    private ColorStateList f4068t = null;

    /* renamed from: u */
    private PorterDuff.Mode f4069u = null;

    /* renamed from: v */
    private boolean f4070v = false;

    /* renamed from: w */
    private boolean f4071w = false;

    /* renamed from: x */
    private boolean f4072x = false;

    /* renamed from: y */
    private int f4073y = 16;

    /* renamed from: D */
    private boolean f4047D = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes2.dex */
    class a implements AbstractC1530b.b {
        a() {
        }

        @Override // androidx.core.view.AbstractC1530b.b
        public void onActionProviderVisibilityChanged(boolean z11) {
            C1074g c1074g = C1074g.this;
            c1074g.f4062n.m5059L(c1074g);
        }
    }

    public C1074g(C1072e c1072e, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        this.f4062n = c1072e;
        this.f4049a = i12;
        this.f4050b = i11;
        this.f4051c = i13;
        this.f4052d = i14;
        this.f4053e = charSequence;
        this.f4074z = i15;
    }

    /* renamed from: d */
    private static void m5101d(StringBuilder sb2, int i11, int i12, String str) {
        if ((i11 & i12) == i12) {
            sb2.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m5102e(Drawable drawable) {
        if (drawable != null && this.f4072x && (this.f4070v || this.f4071w)) {
            drawable = AbstractC1414a.m7200r(drawable).mutate();
            if (this.f4070v) {
                AbstractC1414a.m7197o(drawable, this.f4068t);
            }
            if (this.f4071w) {
                AbstractC1414a.m7198p(drawable, this.f4069u);
            }
            this.f4072x = false;
        }
        return drawable;
    }

    /* renamed from: A */
    public boolean m5103A() {
        if (this.f4062n.mo5057J() && m5109g() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m5104B() {
        return (this.f4074z & 4) == 4;
    }

    @Override // p225i1.InterfaceMenuItemC20184b
    /* renamed from: a */
    public AbstractC1530b mo5105a() {
        return this.f4045B;
    }

    @Override // p225i1.InterfaceMenuItemC20184b
    /* renamed from: b */
    public InterfaceMenuItemC20184b mo5106b(AbstractC1530b abstractC1530b) {
        AbstractC1530b abstractC1530b2 = this.f4045B;
        if (abstractC1530b2 != null) {
            abstractC1530b2.m7704g();
        }
        this.f4044A = null;
        this.f4045B = abstractC1530b;
        this.f4062n.mo5060M(true);
        AbstractC1530b abstractC1530b3 = this.f4045B;
        if (abstractC1530b3 != null) {
            abstractC1530b3.mo7706i(new a());
        }
        return this;
    }

    /* renamed from: c */
    public void m5107c() {
        this.f4062n.m5058K(this);
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f4074z & 8) == 0) {
            return false;
        }
        if (this.f4044A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4046C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f4062n.mo5082f(this);
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m5112j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4046C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f4062n.mo5086m(this);
    }

    /* renamed from: f */
    public int m5108f() {
        return this.f4052d;
    }

    /* renamed from: g */
    public char m5109g() {
        if (this.f4062n.mo5056I()) {
            return this.f4058j;
        }
        return this.f4056h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public View getActionView() {
        View view = this.f4044A;
        if (view != null) {
            return view;
        }
        AbstractC1530b abstractC1530b = this.f4045B;
        if (abstractC1530b != null) {
            View mo7700c = abstractC1530b.mo7700c(this);
            this.f4044A = mo7700c;
            return mo7700c;
        }
        return null;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f4059k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f4058j;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f4066r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f4050b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f4060l;
        if (drawable != null) {
            return m5102e(drawable);
        }
        if (this.f4061m != 0) {
            Drawable m103336d = AbstractC19694b.m103336d(this.f4062n.m5095w(), this.f4061m);
            this.f4061m = 0;
            this.f4060l = m103336d;
            return m5102e(m103336d);
        }
        return null;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f4068t;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f4069u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f4055g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f4049a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f4048E;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f4057i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f4056h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f4051c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f4063o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f4053e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4054f;
        return charSequence != null ? charSequence : this.f4053e;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f4067s;
    }

    /* renamed from: h */
    public String m5110h() {
        int i11;
        char m5109g = m5109g();
        if (m5109g == 0) {
            return "";
        }
        Resources resources = this.f4062n.m5095w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f4062n.m5095w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(AbstractC19185h.abc_prepend_shortcut_label));
        }
        if (this.f4062n.mo5056I()) {
            i11 = this.f4059k;
        } else {
            i11 = this.f4057i;
        }
        m5101d(sb2, i11, 65536, resources.getString(AbstractC19185h.abc_menu_meta_shortcut_label));
        m5101d(sb2, i11, 4096, resources.getString(AbstractC19185h.abc_menu_ctrl_shortcut_label));
        m5101d(sb2, i11, 2, resources.getString(AbstractC19185h.abc_menu_alt_shortcut_label));
        m5101d(sb2, i11, 1, resources.getString(AbstractC19185h.abc_menu_shift_shortcut_label));
        m5101d(sb2, i11, 4, resources.getString(AbstractC19185h.abc_menu_sym_shortcut_label));
        m5101d(sb2, i11, 8, resources.getString(AbstractC19185h.abc_menu_function_shortcut_label));
        if (m5109g != '\b') {
            if (m5109g != '\n') {
                if (m5109g != ' ') {
                    sb2.append(m5109g);
                } else {
                    sb2.append(resources.getString(AbstractC19185h.abc_menu_space_shortcut_label));
                }
            } else {
                sb2.append(resources.getString(AbstractC19185h.abc_menu_enter_shortcut_label));
            }
        } else {
            sb2.append(resources.getString(AbstractC19185h.abc_menu_delete_shortcut_label));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f4063o != null;
    }

    /* renamed from: i */
    public CharSequence m5111i(InterfaceC1078k.a aVar) {
        if (aVar != null && aVar.mo4974e()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f4047D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f4073y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f4073y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f4073y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1530b abstractC1530b = this.f4045B;
        if (abstractC1530b != null && abstractC1530b.mo7703f()) {
            if ((this.f4073y & 8) != 0 || !this.f4045B.mo7699b()) {
                return false;
            }
            return true;
        }
        if ((this.f4073y & 8) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m5112j() {
        AbstractC1530b abstractC1530b;
        if ((this.f4074z & 8) == 0) {
            return false;
        }
        if (this.f4044A == null && (abstractC1530b = this.f4045B) != null) {
            this.f4044A = abstractC1530b.mo7700c(this);
        }
        if (this.f4044A == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m5113k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f4065q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C1072e c1072e = this.f4062n;
        if (c1072e.mo5084h(c1072e, this)) {
            return true;
        }
        Runnable runnable = this.f4064p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f4055g != null) {
            try {
                this.f4062n.m5095w().startActivity(this.f4055g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        AbstractC1530b abstractC1530b = this.f4045B;
        if (abstractC1530b != null && abstractC1530b.mo7701d()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m5114l() {
        return (this.f4073y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m5115m() {
        return (this.f4073y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m5116n() {
        return (this.f4074z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m5117o() {
        return (this.f4074z & 2) == 2;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    /* renamed from: p */
    public InterfaceMenuItemC20184b setActionView(int i11) {
        Context m5095w = this.f4062n.m5095w();
        setActionView(LayoutInflater.from(m5095w).inflate(i11, (ViewGroup) new LinearLayout(m5095w), false));
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    /* renamed from: q */
    public InterfaceMenuItemC20184b setActionView(View view) {
        int i11;
        this.f4044A = view;
        this.f4045B = null;
        if (view != null && view.getId() == -1 && (i11 = this.f4049a) > 0) {
            view.setId(i11);
        }
        this.f4062n.m5058K(this);
        return this;
    }

    /* renamed from: r */
    public void m5120r(boolean z11) {
        this.f4047D = z11;
        this.f4062n.mo5060M(false);
    }

    /* renamed from: s */
    public void m5121s(boolean z11) {
        int i11;
        int i12 = this.f4073y;
        int i13 = i12 & (-3);
        if (z11) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int i14 = i11 | i13;
        this.f4073y = i14;
        if (i12 != i14) {
            this.f4062n.mo5060M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11) {
        if (this.f4058j == c11) {
            return this;
        }
        this.f4058j = Character.toLowerCase(c11);
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z11) {
        int i11 = this.f4073y;
        int i12 = (z11 ? 1 : 0) | (i11 & (-2));
        this.f4073y = i12;
        if (i11 != i12) {
            this.f4062n.mo5060M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z11) {
        if ((this.f4073y & 4) != 0) {
            this.f4062n.m5070X(this);
        } else {
            m5121s(z11);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z11) {
        if (z11) {
            this.f4073y |= 16;
        } else {
            this.f4073y &= -17;
        }
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f4061m = 0;
        this.f4060l = drawable;
        this.f4072x = true;
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4068t = colorStateList;
        this.f4070v = true;
        this.f4072x = true;
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4069u = mode;
        this.f4071w = true;
        this.f4072x = true;
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f4055g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11) {
        if (this.f4056h == c11) {
            return this;
        }
        this.f4056h = c11;
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4046C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4065q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12) {
        this.f4056h = c11;
        this.f4058j = Character.toLowerCase(c12);
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public void setShowAsAction(int i11) {
        int i12 = i11 & 3;
        if (i12 != 0 && i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4074z = i11;
        this.f4062n.m5058K(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f4053e = charSequence;
        this.f4062n.mo5060M(false);
        SubMenuC1080m subMenuC1080m = this.f4063o;
        if (subMenuC1080m != null) {
            subMenuC1080m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4054f = charSequence;
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z11) {
        if (m5127y(z11)) {
            this.f4062n.m5059L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m5122t(boolean z11) {
        this.f4073y = (z11 ? 4 : 0) | (this.f4073y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f4053e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m5123u(boolean z11) {
        if (z11) {
            this.f4073y |= 32;
        } else {
            this.f4073y &= -33;
        }
    }

    /* renamed from: v */
    public void m5124v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f4048E = contextMenuInfo;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    /* renamed from: w */
    public InterfaceMenuItemC20184b setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    /* renamed from: x */
    public void m5126x(SubMenuC1080m subMenuC1080m) {
        this.f4063o = subMenuC1080m;
        subMenuC1080m.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean m5127y(boolean z11) {
        int i11 = this.f4073y;
        int i12 = (z11 ? 0 : 8) | (i11 & (-9));
        this.f4073y = i12;
        return i11 != i12;
    }

    /* renamed from: z */
    public boolean m5128z() {
        return this.f4062n.m5051C();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC20184b setContentDescription(CharSequence charSequence) {
        this.f4066r = charSequence;
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i11) {
        this.f4060l = null;
        this.f4061m = i11;
        this.f4072x = true;
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c11, int i11) {
        if (this.f4056h == c11 && this.f4057i == i11) {
            return this;
        }
        this.f4056h = c11;
        this.f4057i = KeyEvent.normalizeMetaState(i11);
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC20184b setTooltipText(CharSequence charSequence) {
        this.f4067s = charSequence;
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        if (this.f4058j == c11 && this.f4059k == i11) {
            return this;
        }
        this.f4058j = Character.toLowerCase(c11);
        this.f4059k = KeyEvent.normalizeMetaState(i11);
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // p225i1.InterfaceMenuItemC20184b, android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f4056h = c11;
        this.f4057i = KeyEvent.normalizeMetaState(i11);
        this.f4058j = Character.toLowerCase(c12);
        this.f4059k = KeyEvent.normalizeMetaState(i12);
        this.f4062n.mo5060M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i11) {
        return setTitle(this.f4062n.m5095w().getString(i11));
    }
}
