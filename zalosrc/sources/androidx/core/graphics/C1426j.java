package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.core.content.res.AbstractC1398e;
import androidx.core.provider.AbstractC1460g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.j */
/* loaded from: classes2.dex */
public class C1426j extends AbstractC1431o {

    /* renamed from: b */
    private static Class f6242b = null;

    /* renamed from: c */
    private static Constructor f6243c = null;

    /* renamed from: d */
    private static Method f6244d = null;

    /* renamed from: e */
    private static Method f6245e = null;

    /* renamed from: f */
    private static boolean f6246f = false;

    /* renamed from: h */
    private static boolean m7264h(Object obj, String str, int i11, boolean z11) {
        m7267k();
        try {
            return ((Boolean) f6244d.invoke(obj, str, Integer.valueOf(i11), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: i */
    private static Typeface m7265i(Object obj) {
        m7267k();
        try {
            Object newInstance = Array.newInstance((Class<?>) f6242b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f6245e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: j */
    private File m7266j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: k */
    private static void m7267k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f6246f) {
            return;
        }
        f6246f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f6243c = constructor;
        f6242b = cls;
        f6244d = method2;
        f6245e = method;
    }

    /* renamed from: l */
    private static Object m7268l() {
        m7267k();
        try {
            return f6243c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: a */
    public Typeface mo7269a(Context context, AbstractC1398e.c cVar, Resources resources, int i11) {
        Object m7268l = m7268l();
        for (AbstractC1398e.d dVar : cVar.m7059a()) {
            File m7304e = AbstractC1432p.m7304e(context);
            if (m7304e == null) {
                return null;
            }
            try {
                if (!AbstractC1432p.m7302c(m7304e, resources, dVar.m7061b())) {
                    return null;
                }
                if (!m7264h(m7268l, m7304e.getPath(), dVar.m7064e(), dVar.m7065f())) {
                    return null;
                }
                m7304e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m7304e.delete();
            }
        }
        return m7265i(m7268l);
    }

    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: b */
    public Typeface mo7270b(Context context, CancellationSignal cancellationSignal, AbstractC1460g.b[] bVarArr, int i11) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File m7266j = m7266j(openFileDescriptor);
                if (m7266j != null && m7266j.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m7266j);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface m7295c = super.m7295c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return m7295c;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
