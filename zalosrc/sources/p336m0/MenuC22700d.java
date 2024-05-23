package p336m0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p225i1.InterfaceMenuC20183a;

/* renamed from: m0.d */
/* loaded from: classes2.dex */
public class MenuC22700d extends AbstractC22698b implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC20183a f111228d;

    public MenuC22700d(Context context, InterfaceMenuC20183a interfaceMenuC20183a) {
        super(context);
        if (interfaceMenuC20183a != null) {
            this.f111228d = interfaceMenuC20183a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m117391c(this.f111228d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f111228d.addIntentOptions(i11, i12, i13, componentName, intentArr, intent, i14, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i15 = 0; i15 < length; i15++) {
                menuItemArr[i15] = m117391c(menuItemArr2[i15]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m117392d(this.f111228d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m117393e();
        this.f111228d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f111228d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i11) {
        return m117391c(this.f111228d.findItem(i11));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i11) {
        return m117391c(this.f111228d.getItem(i11));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f111228d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return this.f111228d.isShortcutKey(i11, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i11, int i12) {
        return this.f111228d.performIdentifierAction(i11, i12);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        return this.f111228d.performShortcut(i11, keyEvent, i12);
    }

    @Override // android.view.Menu
    public void removeGroup(int i11) {
        m117394f(i11);
        this.f111228d.removeGroup(i11);
    }

    @Override // android.view.Menu
    public void removeItem(int i11) {
        m117395g(i11);
        this.f111228d.removeItem(i11);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        this.f111228d.setGroupCheckable(i11, z11, z12);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i11, boolean z11) {
        this.f111228d.setGroupEnabled(i11, z11);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i11, boolean z11) {
        this.f111228d.setGroupVisible(i11, z11);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f111228d.setQwertyMode(z11);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f111228d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i11) {
        return m117391c(this.f111228d.add(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11) {
        return m117392d(this.f111228d.addSubMenu(i11));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return m117391c(this.f111228d.add(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        return m117392d(this.f111228d.addSubMenu(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, int i14) {
        return m117391c(this.f111228d.add(i11, i12, i13, i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return m117392d(this.f111228d.addSubMenu(i11, i12, i13, i14));
    }
}
