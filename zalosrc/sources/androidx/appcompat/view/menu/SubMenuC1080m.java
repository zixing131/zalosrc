package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C1072e;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes2.dex */
public class SubMenuC1080m extends C1072e implements SubMenu {

    /* renamed from: B */
    private C1072e f4113B;

    /* renamed from: C */
    private C1074g f4114C;

    public SubMenuC1080m(Context context, C1072e c1072e, C1074g c1074g) {
        super(context);
        this.f4113B = c1072e;
        this.f4114C = c1074g;
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: F */
    public C1072e mo5053F() {
        return this.f4113B.mo5053F();
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: H */
    public boolean mo5055H() {
        return this.f4113B.mo5055H();
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: I */
    public boolean mo5056I() {
        return this.f4113B.mo5056I();
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: J */
    public boolean mo5057J() {
        return this.f4113B.mo5057J();
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: V */
    public void mo5068V(C1072e.a aVar) {
        this.f4113B.mo5068V(aVar);
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: f */
    public boolean mo5082f(C1074g c1074g) {
        return this.f4113B.mo5082f(c1074g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f4114C;
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: h */
    public boolean mo5084h(C1072e c1072e, MenuItem menuItem) {
        if (!super.mo5084h(c1072e, menuItem) && !this.f4113B.mo5084h(c1072e, menuItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: i0 */
    public Menu m5149i0() {
        return this.f4113B;
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: m */
    public boolean mo5086m(C1074g c1074g) {
        return this.f4113B.mo5086m(c1074g);
    }

    @Override // androidx.appcompat.view.menu.C1072e, android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.f4113B.setGroupDividerEnabled(z11);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m5072Z(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m5077c0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m5079d0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f4114C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C1072e, android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f4113B.setQwertyMode(z11);
    }

    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: v */
    public String mo5094v() {
        int i11;
        C1074g c1074g = this.f4114C;
        if (c1074g != null) {
            i11 = c1074g.getItemId();
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            return null;
        }
        return super.mo5094v() + ":" + i11;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i11) {
        return (SubMenu) super.m5071Y(i11);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i11) {
        return (SubMenu) super.m5075b0(i11);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i11) {
        this.f4114C.setIcon(i11);
        return this;
    }
}
