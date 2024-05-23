package p310l0;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p225i1.InterfaceMenuC20183a;
import p225i1.InterfaceMenuItemC20184b;
import p310l0.AbstractC21981b;
import p336m0.MenuC22700d;
import p336m0.MenuItemC22699c;
import p665y0.C30245g;

/* renamed from: l0.f */
/* loaded from: classes2.dex */
public class C21985f extends ActionMode {

    /* renamed from: a */
    final Context f108253a;

    /* renamed from: b */
    final AbstractC21981b f108254b;

    /* renamed from: l0.f$a */
    /* loaded from: classes2.dex */
    public static class a implements AbstractC21981b.a {

        /* renamed from: a */
        final ActionMode.Callback f108255a;

        /* renamed from: b */
        final Context f108256b;

        /* renamed from: c */
        final ArrayList f108257c = new ArrayList();

        /* renamed from: d */
        final C30245g f108258d = new C30245g();

        public a(Context context, ActionMode.Callback callback) {
            this.f108256b = context;
            this.f108255a = callback;
        }

        /* renamed from: f */
        private Menu m114803f(Menu menu) {
            Menu menu2 = (Menu) this.f108258d.get(menu);
            if (menu2 == null) {
                MenuC22700d menuC22700d = new MenuC22700d(this.f108256b, (InterfaceMenuC20183a) menu);
                this.f108258d.put(menu, menuC22700d);
                return menuC22700d;
            }
            return menu2;
        }

        @Override // p310l0.AbstractC21981b.a
        /* renamed from: a */
        public boolean mo4852a(AbstractC21981b abstractC21981b, MenuItem menuItem) {
            return this.f108255a.onActionItemClicked(m114804e(abstractC21981b), new MenuItemC22699c(this.f108256b, (InterfaceMenuItemC20184b) menuItem));
        }

        @Override // p310l0.AbstractC21981b.a
        /* renamed from: b */
        public boolean mo4853b(AbstractC21981b abstractC21981b, Menu menu) {
            return this.f108255a.onCreateActionMode(m114804e(abstractC21981b), m114803f(menu));
        }

        @Override // p310l0.AbstractC21981b.a
        /* renamed from: c */
        public boolean mo4854c(AbstractC21981b abstractC21981b, Menu menu) {
            return this.f108255a.onPrepareActionMode(m114804e(abstractC21981b), m114803f(menu));
        }

        @Override // p310l0.AbstractC21981b.a
        /* renamed from: d */
        public void mo4855d(AbstractC21981b abstractC21981b) {
            this.f108255a.onDestroyActionMode(m114804e(abstractC21981b));
        }

        /* renamed from: e */
        public ActionMode m114804e(AbstractC21981b abstractC21981b) {
            int size = this.f108257c.size();
            for (int i11 = 0; i11 < size; i11++) {
                C21985f c21985f = (C21985f) this.f108257c.get(i11);
                if (c21985f != null && c21985f.f108254b == abstractC21981b) {
                    return c21985f;
                }
            }
            C21985f c21985f2 = new C21985f(this.f108256b, abstractC21981b);
            this.f108257c.add(c21985f2);
            return c21985f2;
        }
    }

    public C21985f(Context context, AbstractC21981b abstractC21981b) {
        this.f108253a = context;
        this.f108254b = abstractC21981b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f108254b.mo4954c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f108254b.mo4955d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC22700d(this.f108253a, (InterfaceMenuC20183a) this.f108254b.mo4956e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f108254b.mo4957f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f108254b.mo4958g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f108254b.m114795h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f108254b.mo4959i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f108254b.m114796j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f108254b.mo4960k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f108254b.mo4961l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f108254b.mo4962m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f108254b.mo4964o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f108254b.m114797p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f108254b.mo4966r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z11) {
        this.f108254b.mo4967s(z11);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i11) {
        this.f108254b.mo4963n(i11);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i11) {
        this.f108254b.mo4965q(i11);
    }
}
