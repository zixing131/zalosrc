package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p229i5.AbstractC20287h;
import p315l5.AbstractC22073a;
import p315l5.AbstractC22074b;
import p315l5.AbstractC22076d;
import p315l5.AbstractC22078f;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h */
    private static Boolean f16821h = null;

    /* renamed from: i */
    private static String f16822i = null;

    /* renamed from: j */
    private static boolean f16823j = false;

    /* renamed from: k */
    private static int f16824k = -1;

    /* renamed from: l */
    private static Boolean f16825l;

    /* renamed from: q */
    private static C4295m f16830q;

    /* renamed from: r */
    private static C4296n f16831r;

    /* renamed from: a */
    private final Context f16832a;

    /* renamed from: m */
    private static final ThreadLocal f16826m = new ThreadLocal();

    /* renamed from: n */
    private static final ThreadLocal f16827n = new C4284b();

    /* renamed from: o */
    private static final InterfaceC4282a.a f16828o = new C4285c();

    /* renamed from: b */
    public static final InterfaceC4282a f16815b = new C4286d();

    /* renamed from: c */
    public static final InterfaceC4282a f16816c = new C4287e();

    /* renamed from: d */
    public static final InterfaceC4282a f16817d = new C4288f();

    /* renamed from: e */
    public static final InterfaceC4282a f16818e = new C4289g();

    /* renamed from: f */
    public static final InterfaceC4282a f16819f = new C4290h();

    /* renamed from: g */
    public static final InterfaceC4282a f16820g = new C4291i();

    /* renamed from: p */
    public static final InterfaceC4282a f16829p = new C4292j();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, AbstractC22078f abstractC22078f) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th2, AbstractC22078f abstractC22078f) {
            super(str, th2);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4282a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            int mo19931a(Context context, String str, boolean z11);

            /* renamed from: b */
            int mo19932b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a */
            public int f16833a = 0;

            /* renamed from: b */
            public int f16834b = 0;

            /* renamed from: c */
            public int f16835c = 0;
        }

        /* renamed from: a */
        b mo19930a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC4205o.m19722k(context);
        this.f16832a = context;
    }

    /* renamed from: a */
    public static int m19918a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!AbstractC4199m.m19701a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Module descriptor id '");
                sb2.append(valueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            return 0;
        } catch (Exception e11) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e11.getMessage()));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m19919c(Context context, String str) {
        return m19921f(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b7  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule m19920e(Context context, InterfaceC4282a interfaceC4282a, String str) {
        long j11;
        Cursor cursor;
        Boolean bool;
        InterfaceC4271b m19935W4;
        DynamiteModule dynamiteModule;
        C4296n c4296n;
        boolean z11;
        Boolean valueOf;
        InterfaceC4271b m19940Q;
        ThreadLocal threadLocal = f16826m;
        C4293k c4293k = (C4293k) threadLocal.get();
        C4293k c4293k2 = new C4293k(null);
        threadLocal.set(c4293k2);
        ThreadLocal threadLocal2 = f16827n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            InterfaceC4282a.b mo19930a = interfaceC4282a.mo19930a(context, str, f16828o);
            int i11 = mo19930a.f16833a;
            int i12 = mo19930a.f16834b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i11);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i12);
            int i13 = mo19930a.f16835c;
            if (i13 != 0) {
                if (i13 == -1) {
                    try {
                        if (mo19930a.f16833a != 0) {
                            i13 = -1;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j11 = 0;
                        if (longValue != j11) {
                            f16827n.remove();
                        } else {
                            f16827n.set(Long.valueOf(longValue));
                        }
                        cursor = c4293k2.f16836a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f16826m.set(c4293k);
                        throw th;
                    }
                }
                if (i13 != 1 || mo19930a.f16834b != 0) {
                    if (i13 == -1) {
                        DynamiteModule m19923h = m19923h(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor2 = c4293k2.f16836a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(c4293k);
                        return m19923h;
                    }
                    if (i13 == 1) {
                        try {
                            int i14 = mo19930a.f16834b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (m19926k(context)) {
                                        bool = f16821h;
                                    } else {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i14);
                                        synchronized (DynamiteModule.class) {
                                            c4296n = f16831r;
                                        }
                                        if (c4296n != null) {
                                            C4293k c4293k3 = (C4293k) threadLocal.get();
                                            if (c4293k3 != null && c4293k3.f16836a != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor3 = c4293k3.f16836a;
                                                BinderC4273d.m19913I3(null);
                                                synchronized (DynamiteModule.class) {
                                                    if (f16824k >= 2) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    valueOf = Boolean.valueOf(z11);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    m19940Q = c4296n.m19939I3(BinderC4273d.m19913I3(applicationContext), str, i14, BinderC4273d.m19913I3(cursor3));
                                                } else {
                                                    m19940Q = c4296n.m19940Q(BinderC4273d.m19913I3(applicationContext), str, i14, BinderC4273d.m19913I3(cursor3));
                                                }
                                                Context context2 = (Context) BinderC4273d.m19914Q(m19940Q);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context", null);
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str);
                                        sb4.append(", version >= ");
                                        sb4.append(i14);
                                        C4295m m19927l = m19927l(context);
                                        if (m19927l != null) {
                                            int zze = m19927l.zze();
                                            if (zze >= 3) {
                                                C4293k c4293k4 = (C4293k) threadLocal.get();
                                                if (c4293k4 != null) {
                                                    m19935W4 = m19927l.m19936X4(BinderC4273d.m19913I3(context), str, i14, BinderC4273d.m19913I3(c4293k4.f16836a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                            } else if (zze == 2) {
                                                m19935W4 = m19927l.m19937Y4(BinderC4273d.m19913I3(context), str, i14);
                                            } else {
                                                m19935W4 = m19927l.m19935W4(BinderC4273d.m19913I3(context), str, i14);
                                            }
                                            Object m19914Q = BinderC4273d.m19914Q(m19935W4);
                                            if (m19914Q != null) {
                                                dynamiteModule = new DynamiteModule((Context) m19914Q);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor4 = c4293k2.f16836a;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    threadLocal.set(c4293k);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e11) {
                                throw new LoadingException("Failed to load remote module.", e11, null);
                            } catch (LoadingException e12) {
                                throw e12;
                            } catch (Throwable th3) {
                                AbstractC20287h.m105925a(context, th3);
                                throw new LoadingException("Failed to load remote module.", th3, null);
                            }
                        } catch (LoadingException e13) {
                            String message = e13.getMessage();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Failed to load remote module: ");
                            sb5.append(message);
                            int i15 = mo19930a.f16833a;
                            if (i15 != 0 && interfaceC4282a.mo19930a(context, str, new C4294l(i15, 0)).f16835c == -1) {
                                DynamiteModule m19923h2 = m19923h(context, str);
                                if (longValue == 0) {
                                    f16827n.remove();
                                } else {
                                    f16827n.set(Long.valueOf(longValue));
                                }
                                Cursor cursor5 = c4293k2.f16836a;
                                if (cursor5 != null) {
                                    cursor5.close();
                                }
                                f16826m.set(c4293k);
                                return m19923h2;
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e13, null);
                        }
                    }
                    throw new LoadingException("VersionPolicy returned invalid code:" + i13, null);
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + mo19930a.f16833a + " and remote version is " + mo19930a.f16834b + ".", null);
        } catch (Throwable th4) {
            th = th4;
            j11 = 0;
            if (longValue != j11) {
            }
            cursor = c4293k2.f16836a;
            if (cursor != null) {
            }
            f16826m.set(c4293k);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x014d, code lost:            if (m19925j(r11) != false) goto L248;     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x018f -> B:24:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0191 -> B:24:0x0194). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m19921f(Context context, String str, boolean z11) {
        Field declaredField;
        Throwable th2;
        RemoteException e11;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f16821h;
                Cursor cursor2 = null;
                int i11 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e12) {
                        String obj = e12.toString();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                m19924i(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!m19926k(context)) {
                                return 0;
                            }
                            if (!f16823j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m19922g = m19922g(context, str, z11, true);
                                        String str2 = f16822i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader m115216a = AbstractC22076d.m115216a();
                                            if (m115216a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    AbstractC22074b.m115215a();
                                                    String str3 = f16822i;
                                                    AbstractC4205o.m19722k(str3);
                                                    m115216a = AbstractC22073a.m115214a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f16822i;
                                                    AbstractC4205o.m19722k(str4);
                                                    m115216a = new C4283a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            m19924i(m115216a);
                                            declaredField.set(null, m115216a);
                                            f16821h = bool2;
                                            return m19922g;
                                        }
                                        return m19922g;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f16821h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m19922g(context, str, z11, false);
                    } catch (LoadingException e13) {
                        String message = e13.getMessage();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        return 0;
                    }
                }
                C4295m m19927l = m19927l(context);
                try {
                    if (m19927l != null) {
                        try {
                            int zze = m19927l.zze();
                            if (zze >= 3) {
                                C4293k c4293k = (C4293k) f16826m.get();
                                if (c4293k != null && (cursor = c4293k.f16836a) != null) {
                                    i11 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) BinderC4273d.m19914Q(m19927l.m19938Z4(BinderC4273d.m19913I3(context), str, z11, ((Long) f16827n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i12 = cursor3.getInt(0);
                                                if (i12 > 0) {
                                                }
                                                cursor2 = cursor3;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i11 = i12;
                                            }
                                        } catch (RemoteException e14) {
                                            e11 = e14;
                                            cursor2 = cursor3;
                                            String message2 = e11.getMessage();
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("Failed to retrieve remote module version: ");
                                            sb4.append(message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i11;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th2;
                                        }
                                    }
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else {
                                i11 = zze == 2 ? m19927l.m19933I3(BinderC4273d.m19913I3(context), str, z11) : m19927l.m19934Q(BinderC4273d.m19913I3(context), str, z11);
                            }
                        } catch (RemoteException e15) {
                            e11 = e15;
                        }
                    }
                    return i11;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } catch (Throwable th5) {
            AbstractC20287h.m105925a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:            r10.close();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m19922g(Context context, String str, boolean z11, boolean z12) {
        Throwable th2;
        Exception e11;
        ?? r02 = 0;
        try {
            try {
                long longValue = ((Long) f16827n.get()).longValue();
                ContentResolver contentResolver = context.getContentResolver();
                String str2 = "api_force_staging";
                boolean z13 = true;
                if (true != z11) {
                    str2 = "api";
                }
                Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z14 = false;
                            int i11 = query.getInt(0);
                            if (i11 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f16822i = query.getString(2);
                                        int columnIndex = query.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f16824k = query.getInt(columnIndex);
                                        }
                                        int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (query.getInt(columnIndex2) == 0) {
                                                z13 = false;
                                            }
                                            f16823j = z13;
                                            z14 = z13;
                                        }
                                    } finally {
                                    }
                                }
                                if (m19925j(query)) {
                                    query = null;
                                }
                            }
                            if (z12 && z14) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", null);
                            }
                            return i11;
                        }
                    } catch (Exception e12) {
                        e11 = e12;
                        if (e11 instanceof LoadingException) {
                            throw e11;
                        }
                        throw new LoadingException("V2 version check failed", e11, null);
                    }
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", null);
            } catch (Exception e13) {
                e11 = e13;
            } catch (Throwable th3) {
                th2 = th3;
                if (r02 != 0) {
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            r02 = context;
            if (r02 != 0) {
                r02.close();
            }
            throw th2;
        }
    }

    /* renamed from: h */
    private static DynamiteModule m19923h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: i */
    private static void m19924i(ClassLoader classLoader) {
        C4296n c4296n;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c4296n = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C4296n) {
                    c4296n = (C4296n) queryLocalInterface;
                } else {
                    c4296n = new C4296n(iBinder);
                }
            }
            f16831r = c4296n;
        } catch (ClassNotFoundException e11) {
            e = e11;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e12) {
            e = e12;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e13) {
            e = e13;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e15) {
            e = e15;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: j */
    private static boolean m19925j(Cursor cursor) {
        C4293k c4293k = (C4293k) f16826m.get();
        if (c4293k != null && c4293k.f16836a == null) {
            c4293k.f16836a = cursor;
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m19926k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f16825l)) {
            return true;
        }
        boolean z11 = false;
        if (f16825l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C4148b.m19567h().mo19201j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z11 = true;
            }
            Boolean valueOf = Boolean.valueOf(z11);
            f16825l = valueOf;
            z11 = valueOf.booleanValue();
            if (z11 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f16823j = true;
            }
        }
        return z11;
    }

    /* renamed from: l */
    private static C4295m m19927l(Context context) {
        C4295m c4295m;
        synchronized (DynamiteModule.class) {
            C4295m c4295m2 = f16830q;
            if (c4295m2 != null) {
                return c4295m2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c4295m = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof C4295m) {
                        c4295m = (C4295m) queryLocalInterface;
                    } else {
                        c4295m = new C4295m(iBinder);
                    }
                }
                if (c4295m != null) {
                    f16830q = c4295m;
                    return c4295m;
                }
            } catch (Exception e11) {
                String message = e11.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
            }
            return null;
        }
    }

    /* renamed from: b */
    public Context m19928b() {
        return this.f16832a;
    }

    /* renamed from: d */
    public IBinder m19929d(String str) {
        try {
            return (IBinder) this.f16832a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e11) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e11, null);
        }
    }
}
