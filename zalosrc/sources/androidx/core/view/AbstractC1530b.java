package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1530b {

    /* renamed from: a */
    private final Context f6474a;

    /* renamed from: b */
    private a f6475b;

    /* renamed from: c */
    private b f6476c;

    /* renamed from: androidx.core.view.b$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo5207a(boolean z11);
    }

    /* renamed from: androidx.core.view.b$b */
    /* loaded from: classes2.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z11);
    }

    public AbstractC1530b(Context context) {
        this.f6474a = context;
    }

    /* renamed from: a */
    public abstract boolean mo7698a();

    /* renamed from: b */
    public abstract boolean mo7699b();

    /* renamed from: c */
    public abstract View mo7700c(MenuItem menuItem);

    /* renamed from: d */
    public abstract boolean mo7701d();

    /* renamed from: e */
    public abstract void mo7702e(SubMenu subMenu);

    /* renamed from: f */
    public abstract boolean mo7703f();

    /* renamed from: g */
    public void m7704g() {
        this.f6476c = null;
        this.f6475b = null;
    }

    /* renamed from: h */
    public void m7705h(a aVar) {
        this.f6475b = aVar;
    }

    /* renamed from: i */
    public abstract void mo7706i(b bVar);

    /* renamed from: j */
    public void m7707j(boolean z11) {
        a aVar = this.f6475b;
        if (aVar != null) {
            aVar.mo5207a(z11);
        }
    }
}
