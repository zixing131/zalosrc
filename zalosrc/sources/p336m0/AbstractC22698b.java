package p336m0;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p225i1.InterfaceMenuItemC20184b;
import p665y0.C30245g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m0.b */
/* loaded from: classes2.dex */
public abstract class AbstractC22698b {

    /* renamed from: a */
    final Context f111214a;

    /* renamed from: b */
    private C30245g f111215b;

    /* renamed from: c */
    private C30245g f111216c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC22698b(Context context) {
        this.f111214a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m117391c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC20184b) {
            InterfaceMenuItemC20184b interfaceMenuItemC20184b = (InterfaceMenuItemC20184b) menuItem;
            if (this.f111215b == null) {
                this.f111215b = new C30245g();
            }
            MenuItem menuItem2 = (MenuItem) this.f111215b.get(menuItem);
            if (menuItem2 == null) {
                MenuItemC22699c menuItemC22699c = new MenuItemC22699c(this.f111214a, interfaceMenuItemC20184b);
                this.f111215b.put(interfaceMenuItemC20184b, menuItemC22699c);
                return menuItemC22699c;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m117392d(SubMenu subMenu) {
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m117393e() {
        C30245g c30245g = this.f111215b;
        if (c30245g != null) {
            c30245g.clear();
        }
        C30245g c30245g2 = this.f111216c;
        if (c30245g2 != null) {
            c30245g2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m117394f(int i11) {
        if (this.f111215b == null) {
            return;
        }
        int i12 = 0;
        while (i12 < this.f111215b.size()) {
            if (((InterfaceMenuItemC20184b) this.f111215b.m149163i(i12)).getGroupId() == i11) {
                this.f111215b.m149165l(i12);
                i12--;
            }
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m117395g(int i11) {
        if (this.f111215b == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f111215b.size(); i12++) {
            if (((InterfaceMenuItemC20184b) this.f111215b.m149163i(i12)).getItemId() == i11) {
                this.f111215b.m149165l(i12);
                return;
            }
        }
    }
}
