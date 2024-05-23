package p234ia;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;

/* renamed from: ia.m */
/* loaded from: classes.dex */
public class C20470m {

    /* renamed from: b */
    public static final C3339c f100700b = C3339c.m16821e(C20470m.class).m16841b(C3355r.m16909k(C20464i.class)).m16841b(C3355r.m16909k(Context.class)).m16845f(new InterfaceC3345h() { // from class: ia.e0
        @Override // p052c8.InterfaceC3345h
        /* renamed from: a */
        public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
            return new C20470m((Context) interfaceC3342e.mo16847a(Context.class));
        }
    }).m16843d();

    /* renamed from: a */
    protected final Context f100701a;

    public C20470m(Context context) {
        this.f100701a = context;
    }

    /* renamed from: a */
    public synchronized String m106515a() {
        String string = m106516b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m106516b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    /* renamed from: b */
    protected final SharedPreferences m106516b() {
        return this.f100701a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
