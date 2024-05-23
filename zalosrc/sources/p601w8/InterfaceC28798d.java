package p601w8;

/* renamed from: w8.d */
/* loaded from: classes.dex */
public @interface InterfaceC28798d {

    /* renamed from: w8.d$a */
    /* loaded from: classes.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
