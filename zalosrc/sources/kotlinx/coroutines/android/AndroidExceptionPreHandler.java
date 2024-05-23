package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class AndroidExceptionPreHandler extends AbstractC27310a implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f105837l);
        this._preHandler = this;
    }

    /* renamed from: z0 */
    private final Method m112886z0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /* renamed from: G */
    public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
        Object obj;
        int i11 = Build.VERSION.SDK_INT;
        if (26 <= i11 && i11 < 28) {
            Method m112886z0 = m112886z0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (m112886z0 != null) {
                obj = m112886z0.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
