package oe0;

import android.content.Context;
import com.zing.zalo.MainApplication;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: oe0.b */
/* loaded from: classes4.dex */
public final class C24243b {

    /* renamed from: a */
    public static final C24243b f117090a = new C24243b();

    /* renamed from: b */
    private static Object f117091b;

    /* renamed from: c */
    private static Class f117092c;

    /* renamed from: d */
    private static Method f117093d;

    /* renamed from: e */
    private static Class f117094e;

    /* renamed from: f */
    private static Method f117095f;

    /* renamed from: g */
    private static final InterfaceC24854k f117096g;

    /* renamed from: oe0.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f117097q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            Method method;
            boolean z11 = false;
            try {
                Class<?> cls = Class.forName("com.samsung.android.content.clipboard.SemClipboardManager");
                Class<?> cls2 = Class.forName("com.samsung.android.content.clipboard.data.SemClipData");
                C24243b c24243b = C24243b.f117090a;
                C24243b.f117091b = MainApplication.Companion.m35500c().getSystemService("semclipboard");
                C24243b.f117092c = Class.forName("com.samsung.android.content.clipboard.data.SemImageClipData");
                Class cls3 = C24243b.f117092c;
                if (cls3 != null) {
                    method = cls3.getDeclaredMethod("setImagePath", String.class);
                } else {
                    method = null;
                }
                C24243b.f117093d = method;
                Class<?> cls4 = Class.forName("com.samsung.android.content.clipboard.SemClipboardManager$OnAddClipResultListener");
                C24243b.f117095f = cls.getDeclaredMethod("addClip", Context.class, cls2, cls4);
                C24243b.f117094e = cls4;
                z11 = true;
            } catch (Exception unused) {
                C24243b.f117091b = null;
                C24243b.f117092c = null;
                C24243b.f117093d = null;
                C24243b.f117094e = null;
                C24243b.f117095f = null;
            }
            return Boolean.valueOf(z11);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f117097q);
        f117096g = m129210a;
    }

    private C24243b() {
    }

    /* renamed from: i */
    private final Object m126571i(final String str, Class cls, final ClipboardManagerOnPrimaryClipChangedListenerC23245w.b bVar) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: oe0.a
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    C24848g0 m126572j;
                    m126572j = C24243b.m126572j(ClipboardManagerOnPrimaryClipChangedListenerC23245w.b.this, str, obj, method, objArr);
                    return m126572j;
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final C24848g0 m126572j(ClipboardManagerOnPrimaryClipChangedListenerC23245w.b bVar, String str, Object obj, Method method, Object[] objArr) {
        Integer num;
        AbstractC19074t.m100208f(bVar, "$listener");
        AbstractC19074t.m100208f(str, "$path");
        if (AbstractC19074t.m100204b(method.getName(), "onSuccess")) {
            f117090a.m126575m(bVar);
        } else if (AbstractC19074t.m100204b(method.getName(), "onFailure")) {
            int i11 = 1;
            try {
                Object obj2 = objArr[0];
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                }
            } catch (Exception unused) {
            }
            f117090a.m126574l(str, i11, bVar);
        }
        return C24848g0.f119245a;
    }

    /* renamed from: k */
    private final boolean m126573k() {
        return ((Boolean) f117096g.getValue()).booleanValue();
    }

    /* renamed from: l */
    private final void m126574l(String str, int i11, ClipboardManagerOnPrimaryClipChangedListenerC23245w.b bVar) {
        String str2;
        if (i11 == 2) {
            bVar.mo119780b(false);
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                str2 = "Unknown reason";
            } else {
                str2 = "Not have permission";
            }
        } else {
            str2 = "Path " + str + " is invalid";
        }
        bVar.mo119779a(ClipboardManagerOnPrimaryClipChangedListenerC23245w.a.f112638r, "SemClipboard: " + str2, true);
    }

    /* renamed from: m */
    private final void m126575m(ClipboardManagerOnPrimaryClipChangedListenerC23245w.b bVar) {
        bVar.mo119780b(false);
    }

    /* renamed from: h */
    public final boolean m126576h(Context context, String str, ClipboardManagerOnPrimaryClipChangedListenerC23245w.b bVar) {
        Object obj;
        Method method;
        Object m126571i;
        Method method2;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(bVar, "listener");
        if (!m126573k()) {
            return false;
        }
        try {
            Class cls = f117092c;
            if (cls != null) {
                obj = cls.newInstance();
            } else {
                obj = null;
            }
            if (obj != null && (method = f117093d) != null) {
                method.invoke(obj, str);
                Class cls2 = f117094e;
                if (cls2 != null && (m126571i = m126571i(str, cls2, bVar)) != null && (method2 = f117095f) != null) {
                    method2.invoke(f117091b, context, obj, m126571i);
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
