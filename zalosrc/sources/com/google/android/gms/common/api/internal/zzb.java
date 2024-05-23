package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p538u5.HandlerC27038e;
import p665y0.C30239a;
import p704z4.InterfaceC31224e;

/* loaded from: classes2.dex */
public final class zzb extends Fragment implements InterfaceC31224e {

    /* renamed from: s */
    private static final WeakHashMap f16473s = new WeakHashMap();

    /* renamed from: p */
    private final Map f16474p = Collections.synchronizedMap(new C30239a());

    /* renamed from: q */
    private int f16475q = 0;

    /* renamed from: r */
    private Bundle f16476r;

    /* renamed from: f */
    public static zzb m19563f(Activity activity) {
        zzb zzbVar;
        WeakHashMap weakHashMap = f16473s;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzbVar = (zzb) weakReference.get()) != null) {
            return zzbVar;
        }
        try {
            zzb zzbVar2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzbVar2 == null || zzbVar2.isRemoving()) {
                zzbVar2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzbVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzbVar2));
            return zzbVar2;
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e11);
        }
    }

    @Override // p704z4.InterfaceC31224e
    /* renamed from: a */
    public final void mo19564a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f16474p.containsKey(str)) {
            this.f16474p.put(str, lifecycleCallback);
            if (this.f16475q > 0) {
                new HandlerC27038e(Looper.getMainLooper()).post(new RunnableC4133s1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // p704z4.InterfaceC31224e
    /* renamed from: b */
    public final LifecycleCallback mo19565b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f16474p.get(str));
    }

    @Override // p704z4.InterfaceC31224e
    /* renamed from: c */
    public final Activity mo19566c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f16474p.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19289a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        Iterator it = this.f16474p.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19291e(i11, i12, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f16475q = 1;
        this.f16476r = bundle;
        for (Map.Entry entry : this.f16474p.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo19292f(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f16475q = 5;
        Iterator it = this.f16474p.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m19293g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f16475q = 3;
        Iterator it = this.f16474p.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19294h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f16474p.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo19295i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f16475q = 2;
        Iterator it = this.f16474p.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19296j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f16475q = 4;
        Iterator it = this.f16474p.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19297k();
        }
    }
}
