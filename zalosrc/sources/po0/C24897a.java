package po0;

import android.opengl.EGLContext;
import fn0.AbstractC19074t;
import java.lang.reflect.Field;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;

/* renamed from: po0.a */
/* loaded from: classes7.dex */
public final class C24897a {

    /* renamed from: a */
    public static final C24897a f119463a = new C24897a();

    private C24897a() {
    }

    /* renamed from: a */
    public final EGLContext m129464a(EglBase.Context context) {
        EglBase14.Context context2;
        AbstractC19074t.m100208f(context, "eglContext");
        if (context instanceof EglBase14.Context) {
            context2 = (EglBase14.Context) context;
        } else {
            context2 = null;
        }
        if (context2 == null) {
            return null;
        }
        Field declaredField = context2.getClass().getDeclaredField("egl14Context");
        AbstractC19074t.m100207e(declaredField, "getDeclaredField(...)");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(context2);
        if (!(obj instanceof EGLContext)) {
            return null;
        }
        return (EGLContext) obj;
    }
}
