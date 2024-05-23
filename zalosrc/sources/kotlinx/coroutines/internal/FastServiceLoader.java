package kotlinx.coroutines.internal;

import bn0.AbstractC2933b;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fn0.AbstractC19074t;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import pm0.AbstractC24845f;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;

/* loaded from: classes7.dex */
public final class FastServiceLoader {

    /* renamed from: a */
    public static final FastServiceLoader f107372a = new FastServiceLoader();

    private FastServiceLoader() {
    }

    /* renamed from: a */
    private final Object m113627a(String str, ClassLoader classLoader, Class cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final List m113628b(Class cls, ClassLoader classLoader) {
        List m131185M0;
        try {
            return m113632d(cls, classLoader);
        } catch (Throwable unused) {
            m131185M0 = AbstractC25332a0.m131185M0(ServiceLoader.load(cls, classLoader));
            return m131185M0;
        }
    }

    /* renamed from: e */
    private final List m113629e(URL url) {
        boolean m127120J;
        BufferedReader bufferedReader;
        String m127146M0;
        String m127160T0;
        String m127146M02;
        String url2 = url.toString();
        m127120J = AbstractC24341v.m127120J(url2, "jar", false, 2, null);
        if (m127120J) {
            m127146M0 = AbstractC24342w.m127146M0(url2, "jar:file:", null, 2, null);
            m127160T0 = AbstractC24342w.m127160T0(m127146M0, '!', null, 2, null);
            m127146M02 = AbstractC24342w.m127146M0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(m127160T0, false);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m127146M02)), "UTF-8"));
                try {
                    List m113630f = f107372a.m113630f(bufferedReader);
                    AbstractC2933b.m13890a(bufferedReader, null);
                    jarFile.close();
                    return m113630f;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC24845f.m129182a(th2, th4);
                        throw th2;
                    }
                }
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
            try {
                List m113630f2 = f107372a.m113630f(bufferedReader);
                AbstractC2933b.m13890a(bufferedReader, null);
                return m113630f2;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } finally {
                }
            }
        }
    }

    /* renamed from: f */
    private final List m113630f(BufferedReader bufferedReader) {
        List m131185M0;
        String m127162U0;
        CharSequence m127168X0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                m131185M0 = AbstractC25332a0.m131185M0(linkedHashSet);
                return m131185M0;
            }
            m127162U0 = AbstractC24342w.m127162U0(readLine, "#", null, 2, null);
            m127168X0 = AbstractC24342w.m127168X0(m127162U0);
            String obj = m127168X0.toString();
            for (int i11 = 0; i11 < obj.length(); i11++) {
                char charAt = obj.charAt(i11);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    /* renamed from: c */
    public final List m113631c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!FastServiceLoaderKt.m113633a()) {
            return m113628b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return m113628b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final List m113632d(Class cls, ClassLoader classLoader) {
        Set m131189Q0;
        int m131511r;
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        AbstractC19074t.m100207e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25378x.m131548x(arrayList, f107372a.m113629e((URL) it.next()));
        }
        m131189Q0 = AbstractC25332a0.m131189Q0(arrayList);
        if (!m131189Q0.isEmpty()) {
            Set set = m131189Q0;
            m131511r = AbstractC25370t.m131511r(set, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f107372a.m113627a((String) it2.next(), classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
