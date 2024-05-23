package dn0;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.InterfaceC19054h;
import mn0.InterfaceC23364b;

/* renamed from: dn0.a */
/* loaded from: classes.dex */
public abstract class AbstractC18031a {
    /* renamed from: a */
    public static final Class m95868a(InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(interfaceC23364b, "<this>");
        Class mo100159b = ((InterfaceC19054h) interfaceC23364b).mo100159b();
        AbstractC19074t.m100206d(mo100159b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return mo100159b;
    }

    /* renamed from: b */
    public static final Class m95869b(InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(interfaceC23364b, "<this>");
        Class mo100159b = ((InterfaceC19054h) interfaceC23364b).mo100159b();
        if (!mo100159b.isPrimitive()) {
            AbstractC19074t.m100206d(mo100159b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return mo100159b;
        }
        String name = mo100159b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    mo100159b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    mo100159b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    mo100159b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    mo100159b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    mo100159b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    mo100159b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    mo100159b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    mo100159b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    mo100159b = Short.class;
                    break;
                }
                break;
        }
        AbstractC19074t.m100206d(mo100159b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return mo100159b;
    }

    /* renamed from: c */
    public static final InterfaceC23364b m95870c(Class cls) {
        AbstractC19074t.m100208f(cls, "<this>");
        return AbstractC19061k0.m100169b(cls);
    }
}
