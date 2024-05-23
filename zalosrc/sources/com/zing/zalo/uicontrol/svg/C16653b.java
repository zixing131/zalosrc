package com.zing.zalo.uicontrol.svg;

/* renamed from: com.zing.zalo.uicontrol.svg.b */
/* loaded from: classes4.dex */
public class C16653b {

    /* renamed from: c */
    public static final C16653b f83986c = new C16653b(null, null);

    /* renamed from: d */
    public static final C16653b f83987d = new C16653b(a.None, null);

    /* renamed from: e */
    public static final C16653b f83988e;

    /* renamed from: f */
    public static final C16653b f83989f;

    /* renamed from: g */
    public static final C16653b f83990g;

    /* renamed from: h */
    public static final C16653b f83991h;

    /* renamed from: i */
    public static final C16653b f83992i;

    /* renamed from: j */
    public static final C16653b f83993j;

    /* renamed from: k */
    public static final C16653b f83994k;

    /* renamed from: a */
    private final a f83995a;

    /* renamed from: b */
    private final b f83996b;

    /* renamed from: com.zing.zalo.uicontrol.svg.b$a */
    /* loaded from: classes4.dex */
    public enum a {
        None,
        XMinYMin,
        XMidYMin,
        XMaxYMin,
        XMinYMid,
        XMidYMid,
        XMaxYMid,
        XMinYMax,
        XMidYMax,
        XMaxYMax
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.b$b */
    /* loaded from: classes4.dex */
    public enum b {
        Meet,
        Slice
    }

    static {
        a aVar = a.XMidYMid;
        b bVar = b.Meet;
        f83988e = new C16653b(aVar, bVar);
        a aVar2 = a.XMinYMin;
        f83989f = new C16653b(aVar2, bVar);
        f83990g = new C16653b(a.XMaxYMax, bVar);
        f83991h = new C16653b(a.XMidYMin, bVar);
        f83992i = new C16653b(a.XMidYMax, bVar);
        b bVar2 = b.Slice;
        f83993j = new C16653b(aVar, bVar2);
        f83994k = new C16653b(aVar2, bVar2);
    }

    public C16653b(a aVar, b bVar) {
        this.f83995a = aVar;
        this.f83996b = bVar;
    }

    /* renamed from: a */
    public a m88476a() {
        return this.f83995a;
    }

    /* renamed from: b */
    public b m88477b() {
        return this.f83996b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16653b c16653b = (C16653b) obj;
        if (this.f83995a == c16653b.f83995a && this.f83996b == c16653b.f83996b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
