package p731zx;

import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;
import p115dy.EnumC18118t;

/* renamed from: zx.l */
/* loaded from: classes4.dex */
public abstract class AbstractC32582l {

    /* renamed from: a */
    private static final int f150562a = AbstractC23222t7.f112567j0;

    /* renamed from: b */
    private static final int f150563b = AbstractC23222t7.f112539R;

    /* renamed from: c */
    private static final int f150564c = AbstractC23222t7.f112514B;

    /* renamed from: zx.l$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f150565a;

        static {
            int[] iArr = new int[EnumC18118t.values().length];
            try {
                iArr[EnumC18118t.f91727p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18118t.f91729r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18118t.f91728q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f150565a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m157713a(ListItem listItem, EnumC18118t enumC18118t) {
        AbstractC19074t.m100208f(listItem, "listItem");
        AbstractC19074t.m100208f(enumC18118t, "dividerMode");
        int i11 = a.f150565a[enumC18118t.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    listItem.m90592m(true);
                    listItem.m90591l(0, 0, 0, 0);
                    return;
                }
                return;
            }
            listItem.m90592m(true);
            listItem.m90591l(f150562a, 0, 0, 0);
            return;
        }
        listItem.m90592m(false);
    }

    /* renamed from: b */
    public static final int m157714b() {
        return f150564c;
    }

    /* renamed from: c */
    public static final int m157715c() {
        return f150563b;
    }
}
