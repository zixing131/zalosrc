package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.util.AbstractC1487i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes2.dex */
public abstract class AbstractC1732f extends AbstractC1729c {

    /* renamed from: p */
    private final Activity f7041p;

    /* renamed from: q */
    private final Context f7042q;

    /* renamed from: r */
    private final Handler f7043r;

    /* renamed from: s */
    private final int f7044s;

    /* renamed from: t */
    final LayoutInflaterFactory2C1734h f7045t;

    public AbstractC1732f(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    /* renamed from: d */
    public Activity m8987d() {
        return this.f7041p;
    }

    /* renamed from: e */
    public Context m8988e() {
        return this.f7042q;
    }

    /* renamed from: f */
    public Handler m8989f() {
        return this.f7043r;
    }

    /* renamed from: g */
    public abstract void mo8912g(Fragment fragment);

    /* renamed from: h */
    public abstract void mo8913h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: i */
    public abstract Object mo8914i();

    /* renamed from: j */
    public abstract LayoutInflater mo8915j();

    /* renamed from: k */
    public abstract int mo8916k();

    /* renamed from: l */
    public abstract boolean mo8917l();

    /* renamed from: m */
    public abstract boolean mo8918m(Fragment fragment);

    /* renamed from: n */
    public abstract void mo8919n(Fragment fragment, Intent intent, int i11, Bundle bundle);

    /* renamed from: o */
    public abstract void mo8920o();

    AbstractC1732f(Activity activity, Context context, Handler handler, int i11) {
        this.f7045t = new LayoutInflaterFactory2C1734h();
        this.f7041p = activity;
        this.f7042q = (Context) AbstractC1487i.m7493h(context, "context == null");
        this.f7043r = (Handler) AbstractC1487i.m7493h(handler, "handler == null");
        this.f7044s = i11;
    }
}
