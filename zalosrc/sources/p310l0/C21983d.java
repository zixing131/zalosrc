package p310l0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p175g0.AbstractC19186i;

/* renamed from: l0.d */
/* loaded from: classes2.dex */
public class C21983d extends ContextWrapper {

    /* renamed from: a */
    private int f108241a;

    /* renamed from: b */
    private Resources.Theme f108242b;

    /* renamed from: c */
    private LayoutInflater f108243c;

    /* renamed from: d */
    private Configuration f108244d;

    /* renamed from: e */
    private Resources f108245e;

    public C21983d(Context context, int i11) {
        super(context);
        this.f108241a = i11;
    }

    /* renamed from: b */
    private Resources m114798b() {
        if (this.f108245e == null) {
            Configuration configuration = this.f108244d;
            if (configuration == null) {
                this.f108245e = super.getResources();
            } else {
                this.f108245e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f108245e;
    }

    /* renamed from: d */
    private void m114799d() {
        boolean z11;
        if (this.f108242b == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f108242b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f108242b.setTo(theme);
            }
        }
        m114802e(this.f108242b, this.f108241a, z11);
    }

    /* renamed from: a */
    public void m114800a(Configuration configuration) {
        if (this.f108245e == null) {
            if (this.f108244d == null) {
                this.f108244d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m114801c() {
        return this.f108241a;
    }

    /* renamed from: e */
    protected void m114802e(Resources.Theme theme, int i11, boolean z11) {
        theme.applyStyle(i11, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m114798b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f108243c == null) {
                this.f108243c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f108243c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f108242b;
        if (theme != null) {
            return theme;
        }
        if (this.f108241a == 0) {
            this.f108241a = AbstractC19186i.Theme_AppCompat_Light;
        }
        m114799d();
        return this.f108242b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        if (this.f108241a != i11) {
            this.f108241a = i11;
            m114799d();
        }
    }

    public C21983d(Context context, Resources.Theme theme) {
        super(context);
        this.f108242b = theme;
    }
}
