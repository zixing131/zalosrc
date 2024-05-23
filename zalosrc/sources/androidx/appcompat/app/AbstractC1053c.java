package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p665y0.C30240b;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1053c {

    /* renamed from: p */
    private static int f3839p = -100;

    /* renamed from: q */
    private static final C30240b f3840q = new C30240b();

    /* renamed from: r */
    private static final Object f3841r = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m4877c(AbstractC1053c abstractC1053c) {
        synchronized (f3841r) {
            m4882y(abstractC1053c);
            f3840q.add(new WeakReference(abstractC1053c));
        }
    }

    /* renamed from: g */
    public static AbstractC1053c m4878g(Activity activity, InterfaceC1052b interfaceC1052b) {
        return new AppCompatDelegateImpl(activity, interfaceC1052b);
    }

    /* renamed from: h */
    public static AbstractC1053c m4879h(Dialog dialog, InterfaceC1052b interfaceC1052b) {
        return new AppCompatDelegateImpl(dialog, interfaceC1052b);
    }

    /* renamed from: j */
    public static int m4880j() {
        return f3839p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m4881x(AbstractC1053c abstractC1053c) {
        synchronized (f3841r) {
            m4882y(abstractC1053c);
        }
    }

    /* renamed from: y */
    private static void m4882y(AbstractC1053c abstractC1053c) {
        synchronized (f3841r) {
            try {
                Iterator it = f3840q.iterator();
                while (it.hasNext()) {
                    AbstractC1053c abstractC1053c2 = (AbstractC1053c) ((WeakReference) it.next()).get();
                    if (abstractC1053c2 == abstractC1053c || abstractC1053c2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: A */
    public abstract void mo4785A(int i11);

    /* renamed from: B */
    public abstract void mo4786B(View view);

    /* renamed from: C */
    public abstract void mo4787C(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: D */
    public abstract void mo4788D(int i11);

    /* renamed from: E */
    public abstract void mo4790E(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo4808d(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: e */
    public void m4883e(Context context) {
    }

    /* renamed from: f */
    public Context mo4811f(Context context) {
        m4883e(context);
        return context;
    }

    /* renamed from: i */
    public abstract View mo4813i(int i11);

    /* renamed from: k */
    public abstract int mo4814k();

    /* renamed from: l */
    public abstract MenuInflater mo4815l();

    /* renamed from: m */
    public abstract ActionBar mo4816m();

    /* renamed from: n */
    public abstract void mo4818n();

    /* renamed from: o */
    public abstract void mo4820o();

    /* renamed from: p */
    public abstract void mo4822p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo4824q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo4825r();

    /* renamed from: s */
    public abstract void mo4827s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo4829t();

    /* renamed from: u */
    public abstract void mo4830u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo4832v();

    /* renamed from: w */
    public abstract void mo4834w();

    /* renamed from: z */
    public abstract boolean mo4837z(int i11);
}
