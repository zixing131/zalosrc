package p704z4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p538u5.HandlerC27038e;
import p665y0.C30239a;

/* renamed from: z4.p0 */
/* loaded from: classes2.dex */
public final class C31247p0 extends Fragment implements InterfaceC31224e {

    /* renamed from: q0 */
    private static final WeakHashMap f144264q0 = new WeakHashMap();

    /* renamed from: n0 */
    private final Map f144265n0 = Collections.synchronizedMap(new C30239a());

    /* renamed from: o0 */
    private int f144266o0 = 0;

    /* renamed from: p0 */
    private Bundle f144267p0;

    /* renamed from: n1 */
    public static C31247p0 m152118n1(FragmentActivity fragmentActivity) {
        C31247p0 c31247p0;
        WeakHashMap weakHashMap = f144264q0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (c31247p0 = (C31247p0) weakReference.get()) != null) {
            return c31247p0;
        }
        try {
            C31247p0 c31247p02 = (C31247p0) fragmentActivity.m8906Z1().mo8993d("SupportLifecycleFragmentImpl");
            if (c31247p02 == null || c31247p02.m8811O()) {
                c31247p02 = new C31247p0();
                fragmentActivity.m8906Z1().mo8990a().m9139b(c31247p02, "SupportLifecycleFragmentImpl").mo8935e();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(c31247p02));
            return c31247p02;
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: S */
    public final void mo8819S(int i11, int i12, Intent intent) {
        super.mo8819S(i11, i12, intent);
        Iterator it = this.f144265n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19291e(i11, i12, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: X */
    public final void mo8829X(Bundle bundle) {
        Bundle bundle2;
        super.mo8829X(bundle);
        this.f144266o0 = 1;
        this.f144267p0 = bundle;
        for (Map.Entry entry : this.f144265n0.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo19292f(bundle2);
        }
    }

    @Override // p704z4.InterfaceC31224e
    /* renamed from: a */
    public final void mo19564a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f144265n0.containsKey(str)) {
            this.f144265n0.put(str, lifecycleCallback);
            if (this.f144266o0 > 0) {
                new HandlerC27038e(Looper.getMainLooper()).post(new RunnableC31245o0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // p704z4.InterfaceC31224e
    /* renamed from: b */
    public final LifecycleCallback mo19565b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f144265n0.get(str));
    }

    @Override // p704z4.InterfaceC31224e
    /* renamed from: c */
    public final /* synthetic */ Activity mo19566c() {
        return m8852h();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: c0 */
    public final void mo8839c0() {
        super.mo8839c0();
        this.f144266o0 = 5;
        Iterator it = this.f144265n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m19293g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e */
    public final void mo8844e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo8844e(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f144265n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19289a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s0 */
    public final void mo8879s0() {
        super.mo8879s0();
        this.f144266o0 = 3;
        Iterator it = this.f144265n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19294h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public final void mo8881t0(Bundle bundle) {
        super.mo8881t0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f144265n0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo19295i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u0 */
    public final void mo8883u0() {
        super.mo8883u0();
        this.f144266o0 = 2;
        Iterator it = this.f144265n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19296j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: v0 */
    public final void mo8885v0() {
        super.mo8885v0();
        this.f144266o0 = 4;
        Iterator it = this.f144265n0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo19297k();
        }
    }
}
