package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1530b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p225i1.InterfaceMenuC20183a;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes2.dex */
public class C1072e implements InterfaceMenuC20183a {

    /* renamed from: A */
    private static final int[] f4013A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f4014a;

    /* renamed from: b */
    private final Resources f4015b;

    /* renamed from: c */
    private boolean f4016c;

    /* renamed from: d */
    private boolean f4017d;

    /* renamed from: e */
    private a f4018e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f4026m;

    /* renamed from: n */
    CharSequence f4027n;

    /* renamed from: o */
    Drawable f4028o;

    /* renamed from: p */
    View f4029p;

    /* renamed from: x */
    private C1074g f4037x;

    /* renamed from: z */
    private boolean f4039z;

    /* renamed from: l */
    private int f4025l = 0;

    /* renamed from: q */
    private boolean f4030q = false;

    /* renamed from: r */
    private boolean f4031r = false;

    /* renamed from: s */
    private boolean f4032s = false;

    /* renamed from: t */
    private boolean f4033t = false;

    /* renamed from: u */
    private boolean f4034u = false;

    /* renamed from: v */
    private ArrayList f4035v = new ArrayList();

    /* renamed from: w */
    private CopyOnWriteArrayList f4036w = new CopyOnWriteArrayList();

    /* renamed from: y */
    private boolean f4038y = false;

    /* renamed from: f */
    private ArrayList f4019f = new ArrayList();

    /* renamed from: g */
    private ArrayList f4020g = new ArrayList();

    /* renamed from: h */
    private boolean f4021h = true;

    /* renamed from: i */
    private ArrayList f4022i = new ArrayList();

    /* renamed from: j */
    private ArrayList f4023j = new ArrayList();

    /* renamed from: k */
    private boolean f4024k = true;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        boolean mo4805a(C1072e c1072e, MenuItem menuItem);

        /* renamed from: b */
        void mo4807b(C1072e c1072e);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: c */
        boolean mo4979c(C1074g c1074g);
    }

    public C1072e(Context context) {
        this.f4014a = context;
        this.f4015b = context.getResources();
        m5042f0(true);
    }

    /* renamed from: D */
    private static int m5039D(int i11) {
        int i12 = ((-65536) & i11) >> 16;
        if (i12 >= 0) {
            int[] iArr = f4013A;
            if (i12 < iArr.length) {
                return (i11 & 65535) | (iArr[i12] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m5040P(int i11, boolean z11) {
        if (i11 >= 0 && i11 < this.f4019f.size()) {
            this.f4019f.remove(i11);
            if (z11) {
                mo5060M(true);
            }
        }
    }

    /* renamed from: a0 */
    private void m5041a0(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        Resources m5052E = m5052E();
        if (view != null) {
            this.f4029p = view;
            this.f4027n = null;
            this.f4028o = null;
        } else {
            if (i11 > 0) {
                this.f4027n = m5052E.getText(i11);
            } else if (charSequence != null) {
                this.f4027n = charSequence;
            }
            if (i12 > 0) {
                this.f4028o = AbstractC1388a.m6964f(m5095w(), i12);
            } else if (drawable != null) {
                this.f4028o = drawable;
            }
            this.f4029p = null;
        }
        mo5060M(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:            if (androidx.core.view.AbstractC1587p0.m8130f(android.view.ViewConfiguration.get(r2.f4014a), r2.f4014a) != false) goto L20;     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m5042f0(boolean z11) {
        boolean z12;
        if (z11) {
            z12 = true;
            if (this.f4015b.getConfiguration().keyboard != 1) {
            }
        }
        z12 = false;
        this.f4017d = z12;
    }

    /* renamed from: g */
    private C1074g m5043g(int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        return new C1074g(this, i11, i12, i13, i14, charSequence, i15);
    }

    /* renamed from: i */
    private void m5044i(boolean z11) {
        if (this.f4036w.isEmpty()) {
            return;
        }
        m5085h0();
        Iterator it = this.f4036w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1077j interfaceC1077j = (InterfaceC1077j) weakReference.get();
            if (interfaceC1077j == null) {
                this.f4036w.remove(weakReference);
            } else {
                interfaceC1077j.mo4995l(z11);
            }
        }
        m5083g0();
    }

    /* renamed from: j */
    private void m5045j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f4036w.isEmpty()) {
            Iterator it = this.f4036w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1077j interfaceC1077j = (InterfaceC1077j) weakReference.get();
                if (interfaceC1077j == null) {
                    this.f4036w.remove(weakReference);
                } else {
                    int mo4991f = interfaceC1077j.mo4991f();
                    if (mo4991f > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(mo4991f)) != null) {
                        interfaceC1077j.mo5015i(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m5046k(Bundle bundle) {
        Parcelable mo5016k;
        if (this.f4036w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = this.f4036w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1077j interfaceC1077j = (InterfaceC1077j) weakReference.get();
            if (interfaceC1077j == null) {
                this.f4036w.remove(weakReference);
            } else {
                int mo4991f = interfaceC1077j.mo4991f();
                if (mo4991f > 0 && (mo5016k = interfaceC1077j.mo5016k()) != null) {
                    sparseArray.put(mo4991f, mo5016k);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: l */
    private boolean m5047l(SubMenuC1080m subMenuC1080m, InterfaceC1077j interfaceC1077j) {
        boolean z11 = false;
        if (this.f4036w.isEmpty()) {
            return false;
        }
        if (interfaceC1077j != null) {
            z11 = interfaceC1077j.mo4994j(subMenuC1080m);
        }
        Iterator it = this.f4036w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1077j interfaceC1077j2 = (InterfaceC1077j) weakReference.get();
            if (interfaceC1077j2 == null) {
                this.f4036w.remove(weakReference);
            } else if (!z11) {
                z11 = interfaceC1077j2.mo4994j(subMenuC1080m);
            }
        }
        return z11;
    }

    /* renamed from: p */
    private static int m5048p(ArrayList arrayList, int i11) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C1074g) arrayList.get(size)).m5108f() <= i11) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View m5049A() {
        return this.f4029p;
    }

    /* renamed from: B */
    public ArrayList m5050B() {
        m5092t();
        return this.f4023j;
    }

    /* renamed from: C */
    public boolean m5051C() {
        return this.f4033t;
    }

    /* renamed from: E */
    Resources m5052E() {
        return this.f4015b;
    }

    /* renamed from: F */
    public C1072e mo5053F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList m5054G() {
        if (!this.f4021h) {
            return this.f4020g;
        }
        this.f4020g.clear();
        int size = this.f4019f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1074g c1074g = (C1074g) this.f4019f.get(i11);
            if (c1074g.isVisible()) {
                this.f4020g.add(c1074g);
            }
        }
        this.f4021h = false;
        this.f4024k = true;
        return this.f4020g;
    }

    /* renamed from: H */
    public boolean mo5055H() {
        return this.f4038y;
    }

    /* renamed from: I */
    public boolean mo5056I() {
        return this.f4016c;
    }

    /* renamed from: J */
    public boolean mo5057J() {
        return this.f4017d;
    }

    /* renamed from: K */
    public void m5058K(C1074g c1074g) {
        this.f4024k = true;
        mo5060M(true);
    }

    /* renamed from: L */
    public void m5059L(C1074g c1074g) {
        this.f4021h = true;
        mo5060M(true);
    }

    /* renamed from: M */
    public void mo5060M(boolean z11) {
        if (!this.f4030q) {
            if (z11) {
                this.f4021h = true;
                this.f4024k = true;
            }
            m5044i(z11);
            return;
        }
        this.f4031r = true;
        if (z11) {
            this.f4032s = true;
        }
    }

    /* renamed from: N */
    public boolean m5061N(MenuItem menuItem, int i11) {
        return m5062O(menuItem, null, i11);
    }

    /* renamed from: O */
    public boolean m5062O(MenuItem menuItem, InterfaceC1077j interfaceC1077j, int i11) {
        boolean z11;
        C1074g c1074g = (C1074g) menuItem;
        if (c1074g == null || !c1074g.isEnabled()) {
            return false;
        }
        boolean m5113k = c1074g.m5113k();
        AbstractC1530b mo5105a = c1074g.mo5105a();
        if (mo5105a != null && mo5105a.mo7698a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1074g.m5112j()) {
            m5113k |= c1074g.expandActionView();
            if (m5113k) {
                m5080e(true);
            }
        } else if (!c1074g.hasSubMenu() && !z11) {
            if ((i11 & 1) == 0) {
                m5080e(true);
            }
        } else {
            if ((i11 & 4) == 0) {
                m5080e(false);
            }
            if (!c1074g.hasSubMenu()) {
                c1074g.m5126x(new SubMenuC1080m(m5095w(), this, c1074g));
            }
            SubMenuC1080m subMenuC1080m = (SubMenuC1080m) c1074g.getSubMenu();
            if (z11) {
                mo5105a.mo7702e(subMenuC1080m);
            }
            m5113k |= m5047l(subMenuC1080m, interfaceC1077j);
            if (!m5113k) {
                m5080e(true);
            }
        }
        return m5113k;
    }

    /* renamed from: Q */
    public void m5063Q(InterfaceC1077j interfaceC1077j) {
        Iterator it = this.f4036w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1077j interfaceC1077j2 = (InterfaceC1077j) weakReference.get();
            if (interfaceC1077j2 == null || interfaceC1077j2 == interfaceC1077j) {
                this.f4036w.remove(weakReference);
            }
        }
    }

    /* renamed from: R */
    public void m5064R(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo5094v());
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1080m) item.getSubMenu()).m5064R(bundle);
            }
        }
        int i12 = bundle.getInt("android:menu:expandedactionview");
        if (i12 > 0 && (findItem = findItem(i12)) != null) {
            findItem.expandActionView();
        }
    }

    /* renamed from: S */
    public void m5065S(Bundle bundle) {
        m5045j(bundle);
    }

    /* renamed from: T */
    public void m5066T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1080m) item.getSubMenu()).m5066T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo5094v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void m5067U(Bundle bundle) {
        m5046k(bundle);
    }

    /* renamed from: V */
    public void mo5068V(a aVar) {
        this.f4018e = aVar;
    }

    /* renamed from: W */
    public C1072e m5069W(int i11) {
        this.f4025l = i11;
        return this;
    }

    /* renamed from: X */
    public void m5070X(MenuItem menuItem) {
        boolean z11;
        int groupId = menuItem.getGroupId();
        int size = this.f4019f.size();
        m5085h0();
        for (int i11 = 0; i11 < size; i11++) {
            C1074g c1074g = (C1074g) this.f4019f.get(i11);
            if (c1074g.getGroupId() == groupId && c1074g.m5115m() && c1074g.isCheckable()) {
                if (c1074g == menuItem) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c1074g.m5121s(z11);
            }
        }
        m5083g0();
    }

    /* renamed from: Y */
    public C1072e m5071Y(int i11) {
        m5041a0(0, null, i11, null, null);
        return this;
    }

    /* renamed from: Z */
    public C1072e m5072Z(Drawable drawable) {
        m5041a0(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: a */
    public MenuItem mo5073a(int i11, int i12, int i13, CharSequence charSequence) {
        int m5039D = m5039D(i13);
        C1074g m5043g = m5043g(i11, i12, i13, m5039D, charSequence, this.f4025l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f4026m;
        if (contextMenuInfo != null) {
            m5043g.m5124v(contextMenuInfo);
        }
        ArrayList arrayList = this.f4019f;
        arrayList.add(m5048p(arrayList, m5039D), m5043g);
        mo5060M(true);
        return m5043g;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo5073a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        Intent intent2;
        int i16;
        PackageManager packageManager = this.f4014a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i15 = queryIntentActivityOptions.size();
        } else {
            i15 = 0;
        }
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i17 = 0; i17 < i15; i17++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i17);
            int i18 = resolveInfo.specificIndex;
            if (i18 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i18];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i11, i12, i13, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i16 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i16] = intent4;
            }
        }
        return i15;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m5074b(InterfaceC1077j interfaceC1077j) {
        m5076c(interfaceC1077j, this.f4014a);
    }

    /* renamed from: b0 */
    public C1072e m5075b0(int i11) {
        m5041a0(i11, null, 0, null, null);
        return this;
    }

    /* renamed from: c */
    public void m5076c(InterfaceC1077j interfaceC1077j, Context context) {
        this.f4036w.add(new WeakReference(interfaceC1077j));
        interfaceC1077j.mo4997o(context, this);
        this.f4024k = true;
    }

    /* renamed from: c0 */
    public C1072e m5077c0(CharSequence charSequence) {
        m5041a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C1074g c1074g = this.f4037x;
        if (c1074g != null) {
            mo5082f(c1074g);
        }
        this.f4019f.clear();
        mo5060M(true);
    }

    public void clearHeader() {
        this.f4028o = null;
        this.f4027n = null;
        this.f4029p = null;
        mo5060M(false);
    }

    @Override // android.view.Menu
    public void close() {
        m5080e(true);
    }

    /* renamed from: d */
    public void m5078d() {
        a aVar = this.f4018e;
        if (aVar != null) {
            aVar.mo4807b(this);
        }
    }

    /* renamed from: d0 */
    public C1072e m5079d0(View view) {
        m5041a0(0, null, 0, null, view);
        return this;
    }

    /* renamed from: e */
    public final void m5080e(boolean z11) {
        if (this.f4034u) {
            return;
        }
        this.f4034u = true;
        Iterator it = this.f4036w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1077j interfaceC1077j = (InterfaceC1077j) weakReference.get();
            if (interfaceC1077j == null) {
                this.f4036w.remove(weakReference);
            } else {
                interfaceC1077j.mo4988c(this, z11);
            }
        }
        this.f4034u = false;
    }

    /* renamed from: e0 */
    public void m5081e0(boolean z11) {
        this.f4039z = z11;
    }

    /* renamed from: f */
    public boolean mo5082f(C1074g c1074g) {
        boolean z11 = false;
        if (!this.f4036w.isEmpty() && this.f4037x == c1074g) {
            m5085h0();
            Iterator it = this.f4036w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1077j interfaceC1077j = (InterfaceC1077j) weakReference.get();
                if (interfaceC1077j == null) {
                    this.f4036w.remove(weakReference);
                } else {
                    z11 = interfaceC1077j.mo4996n(this, c1074g);
                    if (z11) {
                        break;
                    }
                }
            }
            m5083g0();
            if (z11) {
                this.f4037x = null;
            }
        }
        return z11;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i11) {
        MenuItem findItem;
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            C1074g c1074g = (C1074g) this.f4019f.get(i12);
            if (c1074g.getItemId() == i11) {
                return c1074g;
            }
            if (c1074g.hasSubMenu() && (findItem = c1074g.getSubMenu().findItem(i11)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void m5083g0() {
        this.f4030q = false;
        if (this.f4031r) {
            this.f4031r = false;
            mo5060M(this.f4032s);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i11) {
        return (MenuItem) this.f4019f.get(i11);
    }

    /* renamed from: h */
    public boolean mo5084h(C1072e c1072e, MenuItem menuItem) {
        a aVar = this.f4018e;
        if (aVar != null && aVar.mo4805a(c1072e, menuItem)) {
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    public void m5085h0() {
        if (this.f4030q) {
            return;
        }
        this.f4030q = true;
        this.f4031r = false;
        this.f4032s = false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f4039z) {
            return true;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C1074g) this.f4019f.get(i11)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        if (m5090r(i11, keyEvent) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo5086m(C1074g c1074g) {
        boolean z11 = false;
        if (this.f4036w.isEmpty()) {
            return false;
        }
        m5085h0();
        Iterator it = this.f4036w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1077j interfaceC1077j = (InterfaceC1077j) weakReference.get();
            if (interfaceC1077j == null) {
                this.f4036w.remove(weakReference);
            } else {
                z11 = interfaceC1077j.mo4992g(this, c1074g);
                if (z11) {
                    break;
                }
            }
        }
        m5083g0();
        if (z11) {
            this.f4037x = c1074g;
        }
        return z11;
    }

    /* renamed from: n */
    public int m5087n(int i11) {
        return m5088o(i11, 0);
    }

    /* renamed from: o */
    public int m5088o(int i11, int i12) {
        int size = size();
        if (i12 < 0) {
            i12 = 0;
        }
        while (i12 < size) {
            if (((C1074g) this.f4019f.get(i12)).getGroupId() == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i11, int i12) {
        return m5061N(findItem(i11), i12);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        boolean z11;
        C1074g m5090r = m5090r(i11, keyEvent);
        if (m5090r != null) {
            z11 = m5061N(m5090r, i12);
        } else {
            z11 = false;
        }
        if ((i12 & 2) != 0) {
            m5080e(true);
        }
        return z11;
    }

    /* renamed from: q */
    public int m5089q(int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((C1074g) this.f4019f.get(i12)).getItemId() == i11) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: r */
    C1074g m5090r(int i11, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList arrayList = this.f4035v;
        arrayList.clear();
        m5091s(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1074g) arrayList.get(0);
        }
        boolean mo5056I = mo5056I();
        for (int i12 = 0; i12 < size; i12++) {
            C1074g c1074g = (C1074g) arrayList.get(i12);
            if (mo5056I) {
                numericShortcut = c1074g.getAlphabeticShortcut();
            } else {
                numericShortcut = c1074g.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (mo5056I && numericShortcut == '\b' && i11 == 67))) {
                return c1074g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i11) {
        int m5087n = m5087n(i11);
        if (m5087n >= 0) {
            int size = this.f4019f.size() - m5087n;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size || ((C1074g) this.f4019f.get(m5087n)).getGroupId() != i11) {
                    break;
                }
                m5040P(m5087n, false);
                i12 = i13;
            }
            mo5060M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i11) {
        m5040P(m5089q(i11), true);
    }

    /* renamed from: s */
    void m5091s(List list, int i11, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean mo5056I = mo5056I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i11 != 67) {
            return;
        }
        int size = this.f4019f.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1074g c1074g = (C1074g) this.f4019f.get(i12);
            if (c1074g.hasSubMenu()) {
                ((C1072e) c1074g.getSubMenu()).m5091s(list, i11, keyEvent);
            }
            if (mo5056I) {
                numericShortcut = c1074g.getAlphabeticShortcut();
            } else {
                numericShortcut = c1074g.getNumericShortcut();
            }
            if (mo5056I) {
                numericModifiers = c1074g.getAlphabeticModifiers();
            } else {
                numericModifiers = c1074g.getNumericModifiers();
            }
            if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (mo5056I && numericShortcut == '\b' && i11 == 67)) && c1074g.isEnabled()) {
                    list.add(c1074g);
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        int size = this.f4019f.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1074g c1074g = (C1074g) this.f4019f.get(i12);
            if (c1074g.getGroupId() == i11) {
                c1074g.m5122t(z12);
                c1074g.setCheckable(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.f4038y = z11;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i11, boolean z11) {
        int size = this.f4019f.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1074g c1074g = (C1074g) this.f4019f.get(i12);
            if (c1074g.getGroupId() == i11) {
                c1074g.setEnabled(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i11, boolean z11) {
        int size = this.f4019f.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            C1074g c1074g = (C1074g) this.f4019f.get(i12);
            if (c1074g.getGroupId() == i11 && c1074g.m5127y(z11)) {
                z12 = true;
            }
        }
        if (z12) {
            mo5060M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f4016c = z11;
        mo5060M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f4019f.size();
    }

    /* renamed from: t */
    public void m5092t() {
        ArrayList m5054G = m5054G();
        if (!this.f4024k) {
            return;
        }
        Iterator it = this.f4036w.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1077j interfaceC1077j = (InterfaceC1077j) weakReference.get();
            if (interfaceC1077j == null) {
                this.f4036w.remove(weakReference);
            } else {
                z11 |= interfaceC1077j.mo5017m();
            }
        }
        if (z11) {
            this.f4022i.clear();
            this.f4023j.clear();
            int size = m5054G.size();
            for (int i11 = 0; i11 < size; i11++) {
                C1074g c1074g = (C1074g) m5054G.get(i11);
                if (c1074g.m5114l()) {
                    this.f4022i.add(c1074g);
                } else {
                    this.f4023j.add(c1074g);
                }
            }
        } else {
            this.f4022i.clear();
            this.f4023j.clear();
            this.f4023j.addAll(m5054G());
        }
        this.f4024k = false;
    }

    /* renamed from: u */
    public ArrayList m5093u() {
        m5092t();
        return this.f4022i;
    }

    /* renamed from: v */
    public String mo5094v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context m5095w() {
        return this.f4014a;
    }

    /* renamed from: x */
    public C1074g m5096x() {
        return this.f4037x;
    }

    /* renamed from: y */
    public Drawable m5097y() {
        return this.f4028o;
    }

    /* renamed from: z */
    public CharSequence m5098z() {
        return this.f4027n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11) {
        return mo5073a(0, 0, 0, this.f4015b.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, this.f4015b.getString(i11));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return mo5073a(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        C1074g c1074g = (C1074g) mo5073a(i11, i12, i13, charSequence);
        SubMenuC1080m subMenuC1080m = new SubMenuC1080m(this.f4014a, this, c1074g);
        c1074g.m5126x(subMenuC1080m);
        return subMenuC1080m;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, int i14) {
        return mo5073a(i11, i12, i13, this.f4015b.getString(i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, this.f4015b.getString(i14));
    }
}
