package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.AbstractC1398e;
import androidx.core.provider.AbstractC1460g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p665y0.C30245g;

/* renamed from: androidx.core.graphics.k */
/* loaded from: classes2.dex */
class C1427k extends AbstractC1431o {

    /* renamed from: b */
    private static final Class f6247b;

    /* renamed from: c */
    private static final Constructor f6248c;

    /* renamed from: d */
    private static final Method f6249d;

    /* renamed from: e */
    private static final Method f6250e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f6248c = constructor;
        f6247b = cls;
        f6249d = method2;
        f6250e = method;
    }

    /* renamed from: h */
    private static boolean m7271h(Object obj, ByteBuffer byteBuffer, int i11, int i12, boolean z11) {
        try {
            return ((Boolean) f6249d.invoke(obj, byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    private static Typeface m7272i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f6247b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f6250e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m7273j() {
        return f6249d != null;
    }

    /* renamed from: k */
    private static Object m7274k() {
        try {
            return f6248c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: a */
    public Typeface mo7269a(Context context, AbstractC1398e.c cVar, Resources resources, int i11) {
        Object m7274k = m7274k();
        if (m7274k == null) {
            return null;
        }
        for (AbstractC1398e.d dVar : cVar.m7059a()) {
            ByteBuffer m7301b = AbstractC1432p.m7301b(context, resources, dVar.m7061b());
            if (m7301b == null || !m7271h(m7274k, m7301b, dVar.m7062c(), dVar.m7064e(), dVar.m7065f())) {
                return null;
            }
        }
        return m7272i(m7274k);
    }

    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: b */
    public Typeface mo7270b(Context context, CancellationSignal cancellationSignal, AbstractC1460g.b[] bVarArr, int i11) {
        Object m7274k = m7274k();
        if (m7274k == null) {
            return null;
        }
        C30245g c30245g = new C30245g();
        for (AbstractC1460g.b bVar : bVarArr) {
            Uri m7411d = bVar.m7411d();
            ByteBuffer byteBuffer = (ByteBuffer) c30245g.get(m7411d);
            if (byteBuffer == null) {
                byteBuffer = AbstractC1432p.m7305f(context, cancellationSignal, m7411d);
                c30245g.put(m7411d, byteBuffer);
            }
            if (byteBuffer == null || !m7271h(m7274k, byteBuffer, bVar.m7410c(), bVar.m7412e(), bVar.m7413f())) {
                return null;
            }
        }
        Typeface m7272i = m7272i(m7274k);
        if (m7272i == null) {
            return null;
        }
        return Typeface.create(m7272i, i11);
    }
}
