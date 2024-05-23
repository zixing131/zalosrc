package com.zing.zalo.nativecommon;

import ag0.AbstractC0837p0;
import com.zing.zalo.nativecommon.NetworkHelper;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NetworkHelper {

    /* renamed from: b */
    static volatile NetworkHelper f48388b;

    /* renamed from: a */
    private boolean f48389a = false;

    private native void DoCheckDomain(ArrayList<String> arrayList);

    private native void DoCheckIP(ArrayList<String> arrayList);

    private native void DoSetDNS(String str);

    private native void DoSetNetworkName(String str);

    private native void DoSetProxy(String str);

    private native void DoSetThreshold(boolean z11, boolean z12, int i11, int i12, int i13, boolean z13, boolean z14, boolean z15);

    private native void DoSetUploadUrl(String str);

    private native void DoStartNetworkHelper();

    private native void DoStopNetworkHelper();

    private native void DoUpdateAppState(int i11);

    private native void SetParamsForNative(String str, int i11, int i12, String str2);

    /* renamed from: k */
    public static synchronized NetworkHelper m48302k() {
        NetworkHelper networkHelper;
        synchronized (NetworkHelper.class) {
            try {
                if (f48388b == null) {
                    synchronized (NetworkHelper.class) {
                        try {
                            if (f48388b == null) {
                                AbstractC20110a.m104544m("create instance", new Object[0]);
                                try {
                                    NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84886c0);
                                } catch (Throwable unused) {
                                    NativeLoader.m89240s(CoreUtility.getAppContext(), EnumC16739a.f84886c0);
                                }
                                f48388b = new NetworkHelper();
                                f48388b.m48314n();
                            }
                        } finally {
                        }
                    }
                }
                networkHelper = f48388b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return networkHelper;
    }

    /* renamed from: l */
    public static boolean m48303l() {
        return f48388b != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m48304m() {
        try {
            if (f48388b != null) {
                boolean z11 = CoreUtility.f89239o;
                AbstractC20110a.m104544m("do update app state, state:%d", Integer.valueOf(z11 ? 1 : 0));
                f48388b.DoUpdateAppState(z11 ? 1 : 0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public void m48305b(ArrayList arrayList) {
        DoCheckDomain(arrayList);
    }

    /* renamed from: c */
    public void m48306c(ArrayList arrayList) {
        DoCheckIP(arrayList);
    }

    /* renamed from: d */
    public void m48307d(String str) {
        DoSetDNS(str);
    }

    /* renamed from: e */
    public void m48308e(String str) {
        DoSetNetworkName(str);
    }

    /* renamed from: f */
    public void m48309f(String str, int i11, int i12, String str2) {
        SetParamsForNative(str, i11, i12, str2);
    }

    /* renamed from: g */
    public void m48310g(String str) {
        DoSetProxy(str);
    }

    /* renamed from: h */
    public void m48311h(boolean z11, boolean z12, int i11, int i12, int i13, boolean z13, boolean z14, boolean z15) {
        DoSetThreshold(z11, z12, i11, i12, i13, z13, z14, z15);
    }

    /* renamed from: i */
    public void m48312i(String str) {
        DoSetUploadUrl(str);
    }

    /* renamed from: j */
    public synchronized void m48313j() {
        if (!this.f48389a) {
            AbstractC20110a.m104541j("Start network helper thread", new Object[0]);
            this.f48389a = true;
            DoStartNetworkHelper();
        }
    }

    /* renamed from: n */
    public void m48314n() {
        try {
            AbstractC20110a.m104544m("on update app state, state:%d", Integer.valueOf(CoreUtility.f89239o ? 1 : 0));
            AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: nw.b
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkHelper.m48304m();
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
