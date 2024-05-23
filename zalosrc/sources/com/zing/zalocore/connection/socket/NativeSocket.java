package com.zing.zalocore.connection.socket;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.util.SparseArray;
import com.zing.zalo.utils.Keep;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NativeSocket {

    /* renamed from: A */
    static int f89281A = 0;

    /* renamed from: B */
    static long f89282B = 0;

    /* renamed from: y */
    private static String f89291y = null;

    /* renamed from: z */
    static boolean f89292z = true;

    /* renamed from: a */
    final Object f89293a = new Object();

    /* renamed from: b */
    volatile boolean f89294b = false;

    /* renamed from: c */
    private final int f89295c;

    /* renamed from: d */
    private int f89296d;

    /* renamed from: e */
    private List f89297e;

    /* renamed from: f */
    private int f89298f;

    /* renamed from: g */
    private String f89299g;

    /* renamed from: h */
    private String f89300h;

    /* renamed from: i */
    private String f89301i;

    /* renamed from: j */
    private int f89302j;

    /* renamed from: k */
    private int f89303k;

    /* renamed from: l */
    private long f89304l;

    /* renamed from: m */
    private long f89305m;

    /* renamed from: n */
    private String f89306n;

    /* renamed from: o */
    private String f89307o;

    /* renamed from: p */
    private String f89308p;

    /* renamed from: q */
    private String f89309q;

    /* renamed from: r */
    private String f89310r;

    /* renamed from: s */
    private String f89311s;

    /* renamed from: t */
    private String f89312t;

    /* renamed from: u */
    private String f89313u;

    /* renamed from: v */
    private int f89314v;

    /* renamed from: w */
    private int f89315w;

    /* renamed from: x */
    static final Object f89290x = new Object();

    /* renamed from: C */
    static final SparseArray f89283C = new SparseArray();

    /* renamed from: D */
    static volatile Handler f89284D = null;

    /* renamed from: E */
    private static boolean f89285E = false;

    /* renamed from: F */
    private static int f89286F = ZAbstractBase.ZVU_PROCESS_FLUSH;

    /* renamed from: G */
    private static int f89287G = ZAbstractBase.ZVU_PROCESS_FLUSH;

    /* renamed from: H */
    private static int f89288H = 0;

    /* renamed from: I */
    private static int f89289I = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalocore.connection.socket.NativeSocket$a */
    /* loaded from: classes7.dex */
    public class HandlerC17519a extends Handler {
        HandlerC17519a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11;
            int i12 = message.what;
            boolean z11 = false;
            int i13 = 0;
            z11 = false;
            if (i12 != 1000) {
                if (i12 == 2000) {
                    if (NativeSocket.m93216m() || AbstractC20626a.m107394j(CoreUtility.getAppContext())) {
                        i13 = 1;
                    }
                    NativeSocket.nativeConnectivityChange(i13, NativeSocket.f89281A);
                    return;
                }
                return;
            }
            if (CoreUtility.f89239o || (CoreUtility.m93148a() != null && CoreUtility.m93148a().mo100080h())) {
                z11 = true;
            }
            if (NativeSocket.f89292z != z11) {
                NativeSocket.f89292z = z11;
                if (z11) {
                    i11 = 103;
                } else {
                    i11 = 102;
                }
                NativeSocket.nativeChangedStateApplication(i11);
            }
        }
    }

    /* renamed from: com.zing.zalocore.connection.socket.NativeSocket$b */
    /* loaded from: classes7.dex */
    interface InterfaceC17520b {
        /* renamed from: a */
        void mo93252a();

        /* renamed from: b */
        void mo93253b();

        /* renamed from: c */
        void mo93254c();

        /* renamed from: c */
        void mo93255c(String str);

        /* renamed from: d */
        void mo93256d(RequestPacket requestPacket);

        /* renamed from: e */
        void mo93257e(int i11, String str);

        /* renamed from: f */
        void mo93258f(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, String str);

        /* renamed from: g */
        void mo93259g(String str, int i11, int i12, int i13, int i14, long j11, long j12, String str2);

        /* renamed from: h */
        void mo93260h();

        /* renamed from: i */
        void mo93261i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeSocket(int i11, InterfaceC17520b interfaceC17520b) {
        LoaderUtils.m93165a();
        this.f89295c = i11;
        SparseArray sparseArray = f89283C;
        synchronized (sparseArray) {
            sparseArray.append(i11, interfaceC17520b);
        }
        if (f89291y != null && LoaderUtils.m93166b()) {
            nativeSetUploadTypeConfig(f89291y);
            f89291y = null;
        }
    }

    /* renamed from: B */
    public static boolean m93204B() {
        return f89285E;
    }

    /* renamed from: G */
    public static void m93205G(int i11) {
        f89286F = i11;
        NativeE2ee.m93178j(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static void m93206I() {
        Handler m93217n = m93217n();
        if (m93217n != null) {
            m93217n.removeMessages(1000);
            m93217n.sendEmptyMessageDelayed(1000, 100L);
        }
    }

    /* renamed from: J */
    public static void m93207J(int i11) {
        f89287G = i11;
        NativeE2ee.m93184p(i11);
    }

    /* renamed from: N */
    public static void m93208N(String str) {
        if (!LoaderUtils.m93166b()) {
            f89291y = str;
        } else {
            nativeSetUploadTypeConfig(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m93209Q() {
        int i11;
        boolean z11 = false;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) CoreUtility.getAppContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 6) {
                        i11 = activeNetworkInfo.getSubtype();
                        f89281A = i11;
                        if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                            z11 = true;
                        }
                    }
                    i11 = 0;
                    f89281A = i11;
                    if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    }
                }
                if (activeNetworkInfo == null || f89281A < 0) {
                    f89281A = AbstractC20626a.m107387c();
                }
            } else {
                f89281A = AbstractC20626a.m107387c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        f89282B = System.currentTimeMillis();
        return z11;
    }

    /* renamed from: e */
    public static void m93212e(long j11, long j12, long j13) {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        nativeSetConfigTimeout(j11, j12, j13);
    }

    @Keep
    public static int getActiveNetworkType() {
        if (System.currentTimeMillis() - f89282B > 5000) {
            m93209Q();
        }
        return f89281A;
    }

    @Keep
    public static int getFdFromUri(byte[] bArr) {
        ParcelFileDescriptor open;
        int i11 = 0;
        if (bArr.length <= 0) {
            return 0;
        }
        try {
            String str = new String(bArr);
            if (str.startsWith("content://")) {
                open = CoreUtility.getAppContext().getContentResolver().openFileDescriptor(Uri.parse(str), "r");
            } else {
                open = ParcelFileDescriptor.open(new File(str), 268435456);
            }
            if (open == null) {
                return 0;
            }
            i11 = open.detachFd();
            open.close();
            return i11;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return i11;
        }
    }

    /* renamed from: h */
    public static void m93213h(String str, String str2) {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        nativeUpdateKSet(str, str2);
    }

    /* renamed from: k */
    public static void m93214k(boolean z11, int i11) {
        f89285E = z11;
        NativeE2ee.m93173e(z11, i11);
    }

    /* renamed from: l */
    public static void m93215l(boolean z11, long j11, boolean z12, long j12, boolean z13, long j13) {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        nativeSetChatReuseLinkConfig(z11, j11, z12, j12, z13, j13);
    }

    @Keep
    public static void logSocketDetail(byte[] bArr, int i11, int i12, int i13, int i14, long j11, long j12, byte[] bArr2) {
        InterfaceC17520b interfaceC17520b;
        AbstractC20110a.m104544m("QOS-Native log detail cmd:%d, ret code:%d", Integer.valueOf(i13), Integer.valueOf(i12));
        SparseArray sparseArray = f89283C;
        if (sparseArray.size() > 0 && (interfaceC17520b = (InterfaceC17520b) sparseArray.valueAt(0)) != null) {
            try {
                interfaceC17520b.mo93259g(new String(bArr), i11, i12, i13, i14, j11, j12, new String(bArr2));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    static /* synthetic */ boolean m93216m() {
        return m93209Q();
    }

    /* renamed from: n */
    static Handler m93217n() {
        if (f89284D == null) {
            synchronized (f89290x) {
                if (f89284D == null) {
                    try {
                        HandlerThread handlerThread = new HandlerThread("NativeSocket Handler", 10);
                        handlerThread.start();
                        f89284D = new HandlerC17519a(handlerThread.getLooper());
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            }
        }
        return f89284D;
    }

    private native int nativeCancelRequest(int i11, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeChangedStateApplication(int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeConnectivityChange(int i11, int i12);

    private native void nativeDisconnect(int i11, boolean z11);

    private native int nativeGetSeqId();

    private native void nativeInitSocket(int i11, int i12, int i13);

    private native int nativeSendRequest(int i11, Object obj, Object obj2);

    private static native void nativeSetChatReuseLinkConfig(boolean z11, long j11, boolean z12, long j12, boolean z13, long j13);

    private static native void nativeSetConfigTimeout(long j11, long j12, long j13);

    private static native void nativeSetPingConfig(boolean z11, int i11);

    private static native void nativeSetUploadTypeConfig(String str);

    private static native void nativeSetUseNewHandShake(int i11);

    private static native void nativeUpdateKSet(String str, String str2);

    private native void nativeUpdateLSers(int i11);

    private native void nativeUpdateTimeout(long j11, long j12);

    @Keep
    public static void onDisconnected(int i11) {
        InterfaceC17520b interfaceC17520b = (InterfaceC17520b) f89283C.get(i11);
        if (interfaceC17520b != null) {
            interfaceC17520b.mo93261i();
        }
    }

    @Keep
    public static void onReceiveHttpFailover(int i11, byte[] bArr) {
        InterfaceC17520b interfaceC17520b = (InterfaceC17520b) f89283C.get(i11);
        if (interfaceC17520b != null) {
            try {
                interfaceC17520b.mo93255c(new String(bArr));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Keep
    public static void onReceivePackage(int i11, Object obj) {
        if (obj instanceof RequestPacket) {
            RequestPacket requestPacket = (RequestPacket) obj;
            AbstractC20110a.m104544m("onReceivePackage:%d ,cmd:%d ,params:%s", Integer.valueOf(requestPacket.m93290l()), Short.valueOf(requestPacket.m93278a()), requestPacket.mo93287i());
            InterfaceC17520b interfaceC17520b = (InterfaceC17520b) f89283C.get(i11);
            if (interfaceC17520b != null) {
                interfaceC17520b.mo93256d(requestPacket);
            }
        }
    }

    @Keep
    public static void onRequestAutoLogin() {
        InterfaceC17520b interfaceC17520b = (InterfaceC17520b) f89283C.get(ZAbstractBase.ZVU_PROCESS_FLUSH);
        if (interfaceC17520b != null) {
            try {
                interfaceC17520b.mo93252a();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Keep
    public static void onRequestGetLSers() {
        InterfaceC17520b interfaceC17520b = (InterfaceC17520b) f89283C.get(ZAbstractBase.ZVU_PROCESS_FLUSH);
        if (interfaceC17520b != null) {
            try {
                interfaceC17520b.mo93260h();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Keep
    public static void onRequestUpdateKSet() {
        InterfaceC17520b interfaceC17520b = (InterfaceC17520b) f89283C.get(ZAbstractBase.ZVU_PROCESS_FLUSH);
        if (interfaceC17520b != null) {
            try {
                interfaceC17520b.mo93253b();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Keep
    public static void onStateChanged(int i11, int i12, byte[] bArr) {
        Object valueAt;
        String str;
        SparseArray sparseArray = f89283C;
        if (sparseArray.size() <= 0) {
            return;
        }
        AbstractC20110a.m104544m("onStateChanged type:%d, %d", Integer.valueOf(i11), Integer.valueOf(i12));
        if (i11 > 0) {
            valueAt = sparseArray.get(i11);
        } else {
            valueAt = sparseArray.valueAt(0);
        }
        InterfaceC17520b interfaceC17520b = (InterfaceC17520b) valueAt;
        if (interfaceC17520b != null) {
            if (bArr == null) {
                str = null;
            } else {
                try {
                    str = new String(bArr);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            interfaceC17520b.mo93257e(i12, str);
        }
    }

    /* renamed from: r */
    public static void m93218r(boolean z11, int i11) {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        nativeSetPingConfig(z11, i11);
    }

    @Keep
    public static void upDataInfoQOSItem(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr) {
        InterfaceC17520b interfaceC17520b;
        AbstractC20110a.m104544m("QOS-Native log static cmd:%d, ret code:%d", Integer.valueOf(i12), Integer.valueOf(i11));
        SparseArray sparseArray = f89283C;
        if (sparseArray.size() > 0 && (interfaceC17520b = (InterfaceC17520b) sparseArray.valueAt(0)) != null) {
            try {
                interfaceC17520b.mo93258f(z11, z12, i11, i12, i13, j11, j12, j13, new String(bArr));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: x */
    public static void m93219x(int i11) {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        f89289I = i11;
        nativeSetUseNewHandShake(i11);
    }

    /* renamed from: z */
    public static void m93220z(int i11) {
        f89288H = i11;
        NativeE2ee.m93171c(i11);
    }

    /* renamed from: A */
    public void m93221A(String str) {
        this.f89312t = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m93222C() {
        Handler m93217n = m93217n();
        if (m93217n != null) {
            m93217n.removeMessages(ZAbstractBase.ZVU_PROCESS_FLUSH);
            m93217n.sendEmptyMessageDelayed(ZAbstractBase.ZVU_PROCESS_FLUSH, 200L);
        }
    }

    /* renamed from: D */
    public void m93223D(int i11) {
        this.f89315w = i11;
    }

    /* renamed from: E */
    public void m93224E(String str) {
        this.f89313u = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m93225F() {
        if (this.f89294b) {
            synchronized (this.f89293a) {
                try {
                    if (this.f89294b) {
                        this.f89293a.notifyAll();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: H */
    public void m93226H(String str) {
        this.f89300h = str;
    }

    /* renamed from: K */
    public void m93227K(String str) {
        this.f89301i = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m93228L() {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        nativeUpdateLSers(this.f89295c);
    }

    /* renamed from: M */
    public void m93229M(int i11) {
        this.f89298f = i11;
    }

    /* renamed from: O */
    public void m93230O(int i11) {
        this.f89302j = i11;
    }

    /* renamed from: P */
    public void m93231P(String str) {
        this.f89309q = str;
    }

    /* renamed from: R */
    public void m93232R(int i11) {
        this.f89303k = i11;
    }

    /* renamed from: S */
    public void m93233S(String str) {
        this.f89306n = str;
    }

    /* renamed from: T */
    public void m93234T(String str) {
        this.f89307o = str;
    }

    /* renamed from: a */
    public int m93235a(long j11) {
        if (!LoaderUtils.m93166b()) {
            return -1;
        }
        AbstractC20110a.m104544m("cancelRequest type:%d ,regId:%d", Integer.valueOf(this.f89295c), Long.valueOf(j11));
        return nativeCancelRequest(this.f89295c, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m93236d(long j11, long j12) {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        AbstractC20110a.m104544m("updateTimeout type:%d ,regId:%d ,timeout:%d", Integer.valueOf(this.f89295c), Long.valueOf(j11), Long.valueOf(j12));
        nativeUpdateTimeout(j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m93237f(RequestPacket requestPacket, NativeRequestListener nativeRequestListener) {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        long nanoTime = System.nanoTime();
        AbstractC20110a.m104544m("sendRequest type:%d ,cmd:%d ,seqId:%d, timeout:%d", Integer.valueOf(this.f89295c), Short.valueOf(requestPacket.m93278a()), Integer.valueOf(requestPacket.m93290l()), Long.valueOf(requestPacket.m93288j()));
        nativeSendRequest(this.f89295c, requestPacket, nativeRequestListener);
        AbstractC20110a.m104544m("sendRequest completed seqId:%d , execute time:%d", Integer.valueOf(requestPacket.m93290l()), Long.valueOf(System.nanoTime() - nanoTime));
    }

    protected void finalize() {
        try {
            SparseArray sparseArray = f89283C;
            synchronized (sparseArray) {
                sparseArray.remove(this.f89295c);
            }
            m93242j(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public void m93238g(String str) {
        this.f89308p = str;
    }

    @Keep
    public int gCid() {
        return this.f89314v;
    }

    @Keep
    public int gE2e() {
        return f89285E ? 1 : 0;
    }

    @Keep
    public int gLac() {
        return this.f89315w;
    }

    @Keep
    public String gahk() {
        return this.f89308p;
    }

    @Keep
    public int gcuu() {
        return this.f89302j;
    }

    @Keep
    public String ghfeu() {
        return this.f89311s;
    }

    @Keep
    public String ghfu() {
        return this.f89310r;
    }

    @Keep
    /* renamed from: gi */
    public String m93239gi() {
        try {
            int i11 = this.f89296d;
            if (i11 >= 0 && i11 < this.f89297e.size()) {
                return ((NativeIPPort) this.f89297e.get(this.f89296d)).m93159a();
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Keep
    public String gim() {
        return this.f89299g;
    }

    @Keep
    public String gksid() {
        return this.f89312t;
    }

    @Keep
    public String gksv() {
        return this.f89313u;
    }

    @Keep
    public int glc() {
        return f89286F;
    }

    @Keep
    public int glcg() {
        return f89287G;
    }

    @Keep
    public String gmd() {
        return this.f89300h;
    }

    @Keep
    public int gmnc() {
        return this.f89298f;
    }

    @Keep
    /* renamed from: gp */
    public int m93240gp() {
        try {
            int i11 = this.f89296d;
            if (i11 >= 0 && i11 < this.f89297e.size()) {
                return ((NativeIPPort) this.f89297e.get(this.f89296d)).m93160b();
            }
            return 0;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    @Keep
    public long gpk() {
        try {
            int i11 = this.f89296d;
            if (i11 >= 0 && i11 < this.f89297e.size()) {
                return ((NativeIPPort) this.f89297e.get(this.f89296d)).m93161c();
            }
            return 0L;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    @Keep
    public long gprk() {
        return this.f89305m;
    }

    @Keep
    public String gpsk() {
        try {
            int i11 = this.f89296d;
            if (i11 >= 0 && i11 < this.f89297e.size()) {
                return ((NativeIPPort) this.f89297e.get(this.f89296d)).m93202e();
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Keep
    public long gpuk() {
        return this.f89304l;
    }

    @Keep
    public String gsk() {
        return this.f89301i;
    }

    @Keep
    public int gvc() {
        return this.f89303k;
    }

    @Keep
    public String gxedk() {
        return this.f89306n;
    }

    @Keep
    public String gxedtk() {
        return this.f89309q;
    }

    @Keep
    public String gxsk() {
        return this.f89307o;
    }

    @Keep
    public int hnp() {
        int i11 = this.f89296d + 1;
        this.f89296d = i11;
        if (i11 < this.f89297e.size()) {
            return 1;
        }
        this.f89296d = -1;
        return 0;
    }

    /* renamed from: i */
    public void m93241i(List list) {
        this.f89296d = -1;
        this.f89297e = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m93242j(boolean z11) {
        if (!LoaderUtils.m93166b()) {
            return;
        }
        nativeDisconnect(this.f89295c, z11);
        m93225F();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[Catch: all -> 0x0022, Exception -> 0x0024, TryCatch #2 {Exception -> 0x0024, blocks: (B:7:0x000c, B:9:0x0011, B:11:0x0017, B:15:0x0029, B:18:0x003b, B:20:0x004a, B:22:0x004f, B:23:0x0051, B:31:0x005e), top: B:6:0x000c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x0022, Exception -> 0x0024, TryCatch #2 {Exception -> 0x0024, blocks: (B:7:0x000c, B:9:0x0011, B:11:0x0017, B:15:0x0029, B:18:0x003b, B:20:0x004a, B:22:0x004f, B:23:0x0051, B:31:0x005e), top: B:6:0x000c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m93243o(int i11) {
        boolean z11;
        int i12;
        InterfaceC17520b interfaceC17520b;
        if (LoaderUtils.m93166b() && !this.f89294b) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (!CoreUtility.f89239o && (CoreUtility.m93148a() == null || !CoreUtility.m93148a().mo100080h())) {
                    z11 = false;
                    f89292z = z11;
                    m93209Q();
                    int i13 = this.f89295c;
                    int i14 = f89281A;
                    if (!f89292z) {
                        i12 = 103;
                    } else {
                        i12 = 102;
                    }
                    nativeInitSocket(i13, i14, i12);
                    interfaceC17520b = (InterfaceC17520b) f89283C.get(this.f89295c);
                    if (interfaceC17520b != null) {
                        interfaceC17520b.mo93254c();
                    }
                    if (i11 > 0) {
                        synchronized (this.f89293a) {
                            this.f89294b = true;
                            this.f89293a.wait(i11);
                        }
                    }
                }
                z11 = true;
                f89292z = z11;
                m93209Q();
                int i132 = this.f89295c;
                int i142 = f89281A;
                if (!f89292z) {
                }
                nativeInitSocket(i132, i142, i12);
                interfaceC17520b = (InterfaceC17520b) f89283C.get(this.f89295c);
                if (interfaceC17520b != null) {
                }
                if (i11 > 0) {
                }
            } finally {
                this.f89294b = false;
            }
        }
    }

    /* renamed from: p */
    public void m93244p(long j11) {
        this.f89305m = j11;
    }

    /* renamed from: q */
    public void m93245q(String str) {
        this.f89311s = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public int m93246s() {
        if (!LoaderUtils.m93166b()) {
            return -1;
        }
        return nativeGetSeqId();
    }

    /* renamed from: t */
    public void m93247t(int i11) {
        this.f89314v = i11;
    }

    /* renamed from: u */
    public void m93248u(long j11) {
        this.f89304l = j11;
    }

    /* renamed from: v */
    public void m93249v(String str) {
        this.f89310r = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public int m93250w() {
        return this.f89295c;
    }

    /* renamed from: y */
    public void m93251y(String str) {
        this.f89299g = str;
    }
}
