package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.InterfaceC2116n;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p378o2.C23987h;
import pm0.C24848g0;
import qm0.AbstractC25368s;

/* loaded from: classes2.dex */
public final class SidecarCompat implements InterfaceC2116n {

    /* renamed from: f */
    public static final C2087a f8936f = new C2087a(null);

    /* renamed from: a */
    private final SidecarInterface f8937a;

    /* renamed from: b */
    private final C2124v f8938b;

    /* renamed from: c */
    private final Map f8939c;

    /* renamed from: d */
    private final Map f8940d;

    /* renamed from: e */
    private InterfaceC2116n.a f8941e;

    /* loaded from: classes2.dex */
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a */
        private final C2124v f8942a;

        /* renamed from: b */
        private final SidecarInterface.SidecarCallback f8943b;

        /* renamed from: c */
        private final ReentrantLock f8944c;

        /* renamed from: d */
        private SidecarDeviceState f8945d;

        /* renamed from: e */
        private final WeakHashMap f8946e;

        public DistinctSidecarElementCallback(C2124v c2124v, SidecarInterface.SidecarCallback sidecarCallback) {
            AbstractC19074t.m100208f(c2124v, "sidecarAdapter");
            AbstractC19074t.m100208f(sidecarCallback, "callbackInterface");
            this.f8942a = c2124v;
            this.f8943b = sidecarCallback;
            this.f8944c = new ReentrantLock();
            this.f8946e = new WeakHashMap();
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            AbstractC19074t.m100208f(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f8944c;
            reentrantLock.lock();
            try {
                if (this.f8942a.m11406a(this.f8945d, sidecarDeviceState)) {
                    return;
                }
                this.f8945d = sidecarDeviceState;
                this.f8943b.onDeviceStateChanged(sidecarDeviceState);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            AbstractC19074t.m100208f(iBinder, "token");
            AbstractC19074t.m100208f(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.f8944c) {
                if (this.f8942a.m11407d((SidecarWindowLayoutInfo) this.f8946e.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f8943b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a */
        final /* synthetic */ SidecarCompat f8947a;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            AbstractC19074t.m100208f(sidecarCompat, "this$0");
            this.f8947a = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface m11315g;
            AbstractC19074t.m100208f(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = this.f8947a.f8939c.values();
            SidecarCompat sidecarCompat = this.f8947a;
            for (Activity activity : values) {
                IBinder m11319a = SidecarCompat.f8936f.m11319a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (m11319a != null && (m11315g = sidecarCompat.m11315g()) != null) {
                    sidecarWindowLayoutInfo = m11315g.getWindowLayoutInfo(m11319a);
                }
                InterfaceC2116n.a aVar = sidecarCompat.f8941e;
                if (aVar != null) {
                    aVar.mo11322a(activity, sidecarCompat.f8938b.m11408e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState deviceState;
            AbstractC19074t.m100208f(iBinder, "windowToken");
            AbstractC19074t.m100208f(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f8947a.f8939c.get(iBinder);
            if (activity != null) {
                C2124v c2124v = this.f8947a.f8938b;
                SidecarInterface m11315g = this.f8947a.m11315g();
                if (m11315g == null) {
                    deviceState = null;
                } else {
                    deviceState = m11315g.getDeviceState();
                }
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                C2102f0 m11408e = c2124v.m11408e(sidecarWindowLayoutInfo, deviceState);
                InterfaceC2116n.a aVar = this.f8947a.f8941e;
                if (aVar != null) {
                    aVar.mo11322a(activity, m11408e);
                }
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$a */
    /* loaded from: classes2.dex */
    public static final class C2087a {
        private C2087a() {
        }

        public /* synthetic */ C2087a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final IBinder m11319a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        /* renamed from: b */
        public final SidecarInterface m11320b(Context context) {
            AbstractC19074t.m100208f(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        /* renamed from: c */
        public final C23987h m11321c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return C23987h.f116079u.m125506b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$b */
    /* loaded from: classes2.dex */
    private static final class C2088b implements InterfaceC2116n.a {

        /* renamed from: a */
        private final InterfaceC2116n.a f8948a;

        /* renamed from: b */
        private final ReentrantLock f8949b;

        /* renamed from: c */
        private final WeakHashMap f8950c;

        public C2088b(InterfaceC2116n.a aVar) {
            AbstractC19074t.m100208f(aVar, "callbackInterface");
            this.f8948a = aVar;
            this.f8949b = new ReentrantLock();
            this.f8950c = new WeakHashMap();
        }

        @Override // androidx.window.layout.InterfaceC2116n.a
        /* renamed from: a */
        public void mo11322a(Activity activity, C2102f0 c2102f0) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(c2102f0, "newLayout");
            ReentrantLock reentrantLock = this.f8949b;
            reentrantLock.lock();
            try {
                if (AbstractC19074t.m100204b(c2102f0, (C2102f0) this.f8950c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.f8948a.mo11322a(activity, c2102f0);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$c */
    /* loaded from: classes2.dex */
    private static final class ViewOnAttachStateChangeListenerC2089c implements View.OnAttachStateChangeListener {

        /* renamed from: p */
        private final SidecarCompat f8951p;

        /* renamed from: q */
        private final WeakReference f8952q;

        public ViewOnAttachStateChangeListenerC2089c(SidecarCompat sidecarCompat, Activity activity) {
            AbstractC19074t.m100208f(sidecarCompat, "sidecarCompat");
            AbstractC19074t.m100208f(activity, "activity");
            this.f8951p = sidecarCompat;
            this.f8952q = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC19074t.m100208f(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f8952q.get();
            IBinder m11319a = SidecarCompat.f8936f.m11319a(activity);
            if (activity == null || m11319a == null) {
                return;
            }
            this.f8951p.m11317i(m11319a, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC19074t.m100208f(view, "view");
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$d */
    /* loaded from: classes2.dex */
    public static final class ComponentCallbacksC2090d implements ComponentCallbacks {

        /* renamed from: q */
        final /* synthetic */ Activity f8954q;

        ComponentCallbacksC2090d(Activity activity) {
            this.f8954q = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            AbstractC19074t.m100208f(configuration, "newConfig");
            InterfaceC2116n.a aVar = SidecarCompat.this.f8941e;
            if (aVar != null) {
                Activity activity = this.f8954q;
                aVar.mo11322a(activity, SidecarCompat.this.m11316h(activity));
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, C2124v c2124v) {
        AbstractC19074t.m100208f(c2124v, "sidecarAdapter");
        this.f8937a = sidecarInterface;
        this.f8938b = c2124v;
        this.f8939c = new LinkedHashMap();
        this.f8940d = new LinkedHashMap();
    }

    /* renamed from: j */
    private final void m11310j(Activity activity) {
        if (this.f8940d.get(activity) == null) {
            ComponentCallbacksC2090d componentCallbacksC2090d = new ComponentCallbacksC2090d(activity);
            this.f8940d.put(activity, componentCallbacksC2090d);
            activity.registerComponentCallbacks(componentCallbacksC2090d);
        }
    }

    /* renamed from: k */
    private final void m11311k(Activity activity) {
        activity.unregisterComponentCallbacks((ComponentCallbacks) this.f8940d.get(activity));
        this.f8940d.remove(activity);
    }

    @Override // androidx.window.layout.InterfaceC2116n
    /* renamed from: a */
    public void mo11312a(InterfaceC2116n.a aVar) {
        AbstractC19074t.m100208f(aVar, "extensionCallback");
        this.f8941e = new C2088b(aVar);
        SidecarInterface sidecarInterface = this.f8937a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f8938b, new TranslatingCallback(this)));
        }
    }

    @Override // androidx.window.layout.InterfaceC2116n
    /* renamed from: b */
    public void mo11313b(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        IBinder m11319a = f8936f.m11319a(activity);
        if (m11319a != null) {
            m11317i(m11319a, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2089c(this, activity));
        }
    }

    @Override // androidx.window.layout.InterfaceC2116n
    /* renamed from: c */
    public void mo11314c(Activity activity) {
        boolean z11;
        SidecarInterface sidecarInterface;
        AbstractC19074t.m100208f(activity, "activity");
        IBinder m11319a = f8936f.m11319a(activity);
        if (m11319a == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f8937a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(m11319a);
        }
        m11311k(activity);
        if (this.f8939c.size() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f8939c.remove(m11319a);
        if (z11 && (sidecarInterface = this.f8937a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    /* renamed from: g */
    public final SidecarInterface m11315g() {
        return this.f8937a;
    }

    /* renamed from: h */
    public final C2102f0 m11316h(Activity activity) {
        SidecarWindowLayoutInfo windowLayoutInfo;
        List m131502j;
        AbstractC19074t.m100208f(activity, "activity");
        IBinder m11319a = f8936f.m11319a(activity);
        if (m11319a == null) {
            m131502j = AbstractC25368s.m131502j();
            return new C2102f0(m131502j);
        }
        SidecarInterface sidecarInterface = this.f8937a;
        SidecarDeviceState sidecarDeviceState = null;
        if (sidecarInterface == null) {
            windowLayoutInfo = null;
        } else {
            windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(m11319a);
        }
        C2124v c2124v = this.f8938b;
        SidecarInterface sidecarInterface2 = this.f8937a;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return c2124v.m11408e(windowLayoutInfo, sidecarDeviceState);
    }

    /* renamed from: i */
    public final void m11317i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        AbstractC19074t.m100208f(iBinder, "windowToken");
        AbstractC19074t.m100208f(activity, "activity");
        this.f8939c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f8937a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f8939c.size() == 1 && (sidecarInterface = this.f8937a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        InterfaceC2116n.a aVar = this.f8941e;
        if (aVar != null) {
            aVar.mo11322a(activity, m11316h(activity));
        }
        m11310j(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016e A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0020 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m11318l() {
        Class<?> cls;
        Method method;
        Class<?> returnType;
        Class cls2;
        Class<?> cls3;
        Method method2;
        Class<?> returnType2;
        Class<?> cls4;
        Method method3;
        Class<?> returnType3;
        Class<?> cls5;
        Method method4;
        try {
            SidecarInterface sidecarInterface = this.f8937a;
            Class<?> cls6 = null;
            if (sidecarInterface != null && (cls = sidecarInterface.getClass()) != null) {
                method = cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                if (method != null) {
                    returnType = null;
                } else {
                    returnType = method.getReturnType();
                }
                cls2 = Void.TYPE;
                if (!AbstractC19074t.m100204b(returnType, cls2)) {
                    SidecarInterface sidecarInterface2 = this.f8937a;
                    if (sidecarInterface2 != null) {
                        sidecarInterface2.getDeviceState();
                    }
                    SidecarInterface sidecarInterface3 = this.f8937a;
                    if (sidecarInterface3 != null) {
                        sidecarInterface3.onDeviceStateListenersChanged(true);
                    }
                    SidecarInterface sidecarInterface4 = this.f8937a;
                    if (sidecarInterface4 != null && (cls3 = sidecarInterface4.getClass()) != null) {
                        method2 = cls3.getMethod("getWindowLayoutInfo", IBinder.class);
                        if (method2 != null) {
                            returnType2 = null;
                        } else {
                            returnType2 = method2.getReturnType();
                        }
                        if (!AbstractC19074t.m100204b(returnType2, SidecarWindowLayoutInfo.class)) {
                            SidecarInterface sidecarInterface5 = this.f8937a;
                            if (sidecarInterface5 != null && (cls4 = sidecarInterface5.getClass()) != null) {
                                method3 = cls4.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                                if (method3 != null) {
                                    returnType3 = null;
                                } else {
                                    returnType3 = method3.getReturnType();
                                }
                                if (!AbstractC19074t.m100204b(returnType3, cls2)) {
                                    SidecarInterface sidecarInterface6 = this.f8937a;
                                    if (sidecarInterface6 != null && (cls5 = sidecarInterface6.getClass()) != null) {
                                        method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                                        if (method4 == null) {
                                            cls6 = method4.getReturnType();
                                        }
                                        if (!AbstractC19074t.m100204b(cls6, cls2)) {
                                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                                            try {
                                                sidecarDeviceState.posture = 3;
                                            } catch (NoSuchFieldError unused) {
                                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                                                if (invoke != null) {
                                                    if (((Integer) invoke).intValue() != 3) {
                                                        throw new Exception("Invalid device posture getter/setter");
                                                    }
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                            }
                                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                                            Rect rect = sidecarDisplayFeature.getRect();
                                            AbstractC19074t.m100207e(rect, "displayFeature.rect");
                                            sidecarDisplayFeature.setRect(rect);
                                            sidecarDisplayFeature.getType();
                                            sidecarDisplayFeature.setType(1);
                                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                                            try {
                                                List list = sidecarWindowLayoutInfo.displayFeatures;
                                            } catch (NoSuchFieldError unused2) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(sidecarDisplayFeature);
                                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                                                if (invoke2 != null) {
                                                    if (!AbstractC19074t.m100204b(arrayList, (List) invoke2)) {
                                                        throw new Exception("Invalid display feature getter/setter");
                                                    }
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                                                }
                                            }
                                            return true;
                                        }
                                        throw new NoSuchMethodException(AbstractC19074t.m100216n("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", cls6));
                                    }
                                    method4 = null;
                                    if (method4 == null) {
                                    }
                                    if (!AbstractC19074t.m100204b(cls6, cls2)) {
                                    }
                                } else {
                                    throw new NoSuchMethodException(AbstractC19074t.m100216n("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType3));
                                }
                            }
                            method3 = null;
                            if (method3 != null) {
                            }
                            if (!AbstractC19074t.m100204b(returnType3, cls2)) {
                            }
                        } else {
                            throw new NoSuchMethodException(AbstractC19074t.m100216n("Illegal return type for 'getWindowLayoutInfo': ", returnType2));
                        }
                    }
                    method2 = null;
                    if (method2 != null) {
                    }
                    if (!AbstractC19074t.m100204b(returnType2, SidecarWindowLayoutInfo.class)) {
                    }
                } else {
                    throw new NoSuchMethodException(AbstractC19074t.m100216n("Illegal return type for 'setSidecarCallback': ", returnType));
                }
            }
            method = null;
            if (method != null) {
            }
            cls2 = Void.TYPE;
            if (!AbstractC19074t.m100204b(returnType, cls2)) {
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f8936f.m11320b(context), new C2124v(null, 1, null));
        AbstractC19074t.m100208f(context, "context");
    }
}
