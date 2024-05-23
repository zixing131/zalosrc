package com.zing.zalocore.connection.socket;

import androidx.annotation.Keep;
import hm0.C20096c;
import ho0.AbstractC20110a;
import jm0.EnumC21297g;
import jm0.InterfaceC21299i;
import jm0.InterfaceC21303m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeHttp {

    /* renamed from: b */
    static NativeHttp f89265b = null;

    /* renamed from: c */
    private static boolean f89266c = true;

    /* renamed from: d */
    public static volatile boolean f89267d = false;

    /* renamed from: e */
    private static boolean f89268e = true;

    /* renamed from: f */
    public static volatile boolean f89269f = false;

    /* renamed from: a */
    int f89270a = 8;

    /* renamed from: com.zing.zalocore.connection.socket.NativeHttp$a */
    /* loaded from: classes7.dex */
    class C17516a extends NativeRequestListener {
        C17516a(int i11, int i12, InterfaceC21299i interfaceC21299i) {
            super(i11, i12, interfaceC21299i);
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onProgressUpdate(int i11) {
            if (this.f89279c instanceof InterfaceC21303m) {
                AbstractC20110a.m104544m("onProgressUpdate: %d ,percent: %d", Integer.valueOf(this.f89277a), Integer.valueOf(i11));
                try {
                    InterfaceC21299i interfaceC21299i = this.f89279c;
                    if (interfaceC21299i != null) {
                        ((InterfaceC21303m) interfaceC21299i).mo51590a(i11);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onRenewComplete(byte[] bArr, long j11) {
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onRequestComplete(byte[] bArr, int i11, long j11, long j12) {
            try {
                String str = new String(bArr);
                AbstractC20110a.m104544m("onRequestComplete Uploadhttp: %d json: %s", Integer.valueOf(i11), str);
                if (str.isEmpty()) {
                    str = "{}";
                }
                JSONObject jSONObject = new JSONObject(str);
                InterfaceC21299i interfaceC21299i = this.f89279c;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1343f(jSONObject);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                try {
                    InterfaceC21299i interfaceC21299i2 = this.f89279c;
                    if (interfaceC21299i2 != null) {
                        interfaceC21299i2.mo1342c(new C20096c(502, ""));
                    }
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onRequestFailed(int i11, byte[] bArr, int i12, long j11, long j12) {
            try {
                String str = new String(bArr);
                if (str.isEmpty()) {
                    InterfaceC21299i interfaceC21299i = this.f89279c;
                    if (interfaceC21299i != null) {
                        interfaceC21299i.mo1342c(new C20096c(i11, ""));
                    }
                } else {
                    new JSONObject(str);
                    InterfaceC21299i interfaceC21299i2 = this.f89279c;
                    if (interfaceC21299i2 != null) {
                        interfaceC21299i2.mo1342c(new C20096c(i11, str));
                    }
                }
            } catch (Exception unused) {
                InterfaceC21299i interfaceC21299i3 = this.f89279c;
                if (interfaceC21299i3 != null) {
                    interfaceC21299i3.mo1342c(new C20096c(i11, ""));
                }
            }
        }
    }

    /* renamed from: com.zing.zalocore.connection.socket.NativeHttp$b */
    /* loaded from: classes7.dex */
    class C17517b extends NativeRequestListener {
        C17517b(int i11, int i12, InterfaceC21299i interfaceC21299i) {
            super(i11, i12, interfaceC21299i);
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onProgressUpdate(int i11) {
            if (this.f89279c instanceof InterfaceC21303m) {
                AbstractC20110a.m104544m("onProgressUpdate: %d ,percent: %d", Integer.valueOf(this.f89277a), Integer.valueOf(i11));
                try {
                    InterfaceC21299i interfaceC21299i = this.f89279c;
                    if (interfaceC21299i != null) {
                        ((InterfaceC21303m) interfaceC21299i).mo51590a(i11);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onRenewComplete(byte[] bArr, long j11) {
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onRequestComplete(byte[] bArr, int i11, long j11, long j12) {
            try {
                String str = new String(bArr);
                AbstractC20110a.m104544m("onRequestComplete Uploadhttp Buffer: %d json: %s", Integer.valueOf(i11), str);
                if (str.isEmpty()) {
                    str = "{}";
                }
                JSONObject jSONObject = new JSONObject(str);
                InterfaceC21299i interfaceC21299i = this.f89279c;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1343f(jSONObject);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                try {
                    InterfaceC21299i interfaceC21299i2 = this.f89279c;
                    if (interfaceC21299i2 != null) {
                        interfaceC21299i2.mo1342c(new C20096c(502, ""));
                    }
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
            }
        }

        @Override // com.zing.zalocore.connection.socket.NativeRequestListener
        void onRequestFailed(int i11, byte[] bArr, int i12, long j11, long j12) {
            try {
                String str = new String(bArr);
                if (str.isEmpty()) {
                    InterfaceC21299i interfaceC21299i = this.f89279c;
                    if (interfaceC21299i != null) {
                        interfaceC21299i.mo1342c(new C20096c(i11, ""));
                    }
                } else {
                    new JSONObject(str);
                    InterfaceC21299i interfaceC21299i2 = this.f89279c;
                    if (interfaceC21299i2 != null) {
                        interfaceC21299i2.mo1342c(new C20096c(i11, str));
                    }
                }
            } catch (Exception unused) {
                InterfaceC21299i interfaceC21299i3 = this.f89279c;
                if (interfaceC21299i3 != null) {
                    interfaceC21299i3.mo1342c(new C20096c(i11, ""));
                }
            }
        }
    }

    NativeHttp() {
        LoaderUtils.m93165a();
    }

    /* renamed from: a */
    public static void m93186a(boolean z11) {
        f89267d = true;
        f89266c = z11;
    }

    /* renamed from: b */
    public static void m93187b(boolean z11) {
        f89269f = true;
        f89268e = z11;
    }

    @Keep
    private native void cancelNativeApiHttp(String str, int i11);

    @Keep
    private native void cancelNativeUploadHttp(int i11);

    /* renamed from: g */
    public static synchronized NativeHttp m93188g() {
        NativeHttp nativeHttp;
        synchronized (NativeHttp.class) {
            try {
                if (f89265b == null) {
                    f89265b = new NativeHttp();
                }
                nativeHttp = f89265b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nativeHttp;
    }

    @Keep
    private native void nativeApiHttp(String str, int i11, Object obj, byte[] bArr, int i12, long j11, int i13, boolean z11, int i14, Object obj2);

    @Keep
    private native void nativeUploadHttp(String str, int i11, String str2, int i12, String str3, String str4, String str5, int i13, boolean z11, int i14, long j11, boolean z12, String str6, String str7, String str8, Object obj, Object obj2, Object obj3);

    @Keep
    private native void nativeUploadHttpBuffer(String str, int i11, byte[] bArr, String str2, String str3, String str4, String str5, boolean z11, boolean z12, Object obj, Object obj2, Object obj3);

    /* renamed from: c */
    public void m93189c(String str, int i11, Object obj, byte[] bArr, int i12, long j11, int i13, boolean z11, int i14, RequestDownloadListener requestDownloadListener) {
        if (!LoaderUtils.m93166b()) {
            if (requestDownloadListener != null) {
                requestDownloadListener.onDownloadFail(new C20096c(502, "not load lib"));
                return;
            }
            return;
        }
        nativeApiHttp(str, i11, obj, bArr, i12, j11, i13, z11, i14, requestDownloadListener);
    }

    /* renamed from: d */
    public void m93190d(String str, int i11) {
        cancelNativeApiHttp(str, i11);
    }

    /* renamed from: e */
    public void m93191e(int i11) {
        cancelNativeUploadHttp(i11);
    }

    /* renamed from: f */
    public int m93192f(EnumC21297g enumC21297g) {
        if (enumC21297g != EnumC21297g.DEFAULT && enumC21297g != EnumC21297g.WITHOUT_AUTHENTICATION_INFO) {
            if (enumC21297g == EnumC21297g.ENCRYPT_PARAMETER) {
                return 2;
            }
            return 0;
        }
        return 1;
    }

    /* renamed from: h */
    public void m93193h(String str, int i11, String str2, int i12, String str3, String str4, String str5, int i13, boolean z11, int i14, long j11, boolean z12, String str6, String str7, String str8, Object obj, Object obj2, InterfaceC21299i interfaceC21299i) {
        if (!LoaderUtils.m93166b()) {
            if (interfaceC21299i != null) {
                interfaceC21299i.mo1342c(new C20096c(502, "not load lib"));
                return;
            }
            return;
        }
        nativeUploadHttp(str, i11, str2, i12, str3, str4, str5, i13, z11, i14, j11, z12, str6, str7, str8, obj, obj2, new C17516a(i12, i11, interfaceC21299i));
    }

    /* renamed from: i */
    public void m93194i(String str, int i11, byte[] bArr, String str2, String str3, String str4, String str5, boolean z11, boolean z12, Object obj, Object obj2, InterfaceC21299i interfaceC21299i) {
        if (!LoaderUtils.m93166b()) {
            if (interfaceC21299i != null) {
                interfaceC21299i.mo1342c(new C20096c(502, "not load lib"));
                return;
            }
            return;
        }
        nativeUploadHttpBuffer(str, i11, bArr, str2, str3, str4, str5, z11, z12, obj, obj2, new C17517b(0, i11, interfaceC21299i));
    }
}
