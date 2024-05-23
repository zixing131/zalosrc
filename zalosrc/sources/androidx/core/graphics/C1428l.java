package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.AbstractC1398e;
import androidx.core.provider.AbstractC1460g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.l */
/* loaded from: classes2.dex */
public class C1428l extends C1426j {

    /* renamed from: g */
    protected final Class f6251g;

    /* renamed from: h */
    protected final Constructor f6252h;

    /* renamed from: i */
    protected final Method f6253i;

    /* renamed from: j */
    protected final Method f6254j;

    /* renamed from: k */
    protected final Method f6255k;

    /* renamed from: l */
    protected final Method f6256l;

    /* renamed from: m */
    protected final Method f6257m;

    public C1428l() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = m7287v();
            constructor = m7288w(cls);
            method = m7284s(cls);
            method2 = m7285t(cls);
            method3 = m7289x(cls);
            method4 = m7283r(cls);
            method5 = mo7286u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to collect necessary methods for class ");
            sb2.append(e11.getClass().getName());
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f6251g = cls;
        this.f6252h = constructor;
        this.f6253i = method;
        this.f6254j = method2;
        this.f6255k = method3;
        this.f6256l = method4;
        this.f6257m = method5;
    }

    /* renamed from: l */
    private Object m7275l() {
        try {
            return this.f6252h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private void m7276m(Object obj) {
        try {
            this.f6256l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    private boolean m7277n(Context context, Object obj, String str, int i11, int i12, int i13, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f6253i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m7278o(Object obj, ByteBuffer byteBuffer, int i11, int i12, int i13) {
        try {
            return ((Boolean) this.f6254j.invoke(obj, byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Integer.valueOf(i13))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m7279p(Object obj) {
        try {
            return ((Boolean) this.f6255k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    private boolean m7280q() {
        return this.f6253i != null;
    }

    @Override // androidx.core.graphics.C1426j, androidx.core.graphics.AbstractC1431o
    /* renamed from: a */
    public Typeface mo7269a(Context context, AbstractC1398e.c cVar, Resources resources, int i11) {
        if (!m7280q()) {
            return super.mo7269a(context, cVar, resources, i11);
        }
        Object m7275l = m7275l();
        if (m7275l == null) {
            return null;
        }
        for (AbstractC1398e.d dVar : cVar.m7059a()) {
            if (!m7277n(context, m7275l, dVar.m7060a(), dVar.m7062c(), dVar.m7064e(), dVar.m7065f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.m7063d()))) {
                m7276m(m7275l);
                return null;
            }
        }
        if (!m7279p(m7275l)) {
            return null;
        }
        return mo7282i(m7275l);
    }

    @Override // androidx.core.graphics.C1426j, androidx.core.graphics.AbstractC1431o
    /* renamed from: b */
    public Typeface mo7270b(Context context, CancellationSignal cancellationSignal, AbstractC1460g.b[] bVarArr, int i11) {
        Typeface mo7282i;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m7280q()) {
            AbstractC1460g.b mo7292g = mo7292g(bVarArr, i11);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo7292g.m7411d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo7292g.m7412e()).setItalic(mo7292g.m7413f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map m7307h = AbstractC1432p.m7307h(context, bVarArr, cancellationSignal);
        Object m7275l = m7275l();
        if (m7275l == null) {
            return null;
        }
        boolean z11 = false;
        for (AbstractC1460g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) m7307h.get(bVar.m7411d());
            if (byteBuffer != null) {
                if (!m7278o(m7275l, byteBuffer, bVar.m7410c(), bVar.m7412e(), bVar.m7413f() ? 1 : 0)) {
                    m7276m(m7275l);
                    return null;
                }
                z11 = true;
            }
        }
        if (!z11) {
            m7276m(m7275l);
            return null;
        }
        if (!m7279p(m7275l) || (mo7282i = mo7282i(m7275l)) == null) {
            return null;
        }
        return Typeface.create(mo7282i, i11);
    }

    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: d */
    public Typeface mo7281d(Context context, Resources resources, int i11, String str, int i12) {
        if (!m7280q()) {
            return super.mo7281d(context, resources, i11, str, i12);
        }
        Object m7275l = m7275l();
        if (m7275l == null) {
            return null;
        }
        if (!m7277n(context, m7275l, str, 0, -1, -1, null)) {
            m7276m(m7275l);
            return null;
        }
        if (!m7279p(m7275l)) {
            return null;
        }
        return mo7282i(m7275l);
    }

    /* renamed from: i */
    protected Typeface mo7282i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f6251g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f6257m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: r */
    protected Method m7283r(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: s */
    protected Method m7284s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: t */
    protected Method m7285t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: u */
    protected Method mo7286u(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: v */
    protected Class m7287v() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: w */
    protected Constructor m7288w(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: x */
    protected Method m7289x(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
