package uy;

import android.graphics.Bitmap;
import com.zing.zalo.qrdetection.QRClassifierKt;
import com.zing.zalo.qrdetection.YuvImageHelperKt;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import me0.AbstractC23044d5;
import org.tensorflow.lite.InterfaceC24498e;
import pm0.C24848g0;
import qm0.AbstractC25358n;

/* renamed from: uy.a */
/* loaded from: classes4.dex */
public final class C27384a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private ByteBuffer f129002a;

    /* renamed from: b */
    private ByteBuffer f129003b;

    /* renamed from: c */
    private ByteBuffer f129004c;

    /* renamed from: d */
    private ByteBuffer f129005d;

    /* renamed from: e */
    private ByteBuffer f129006e;

    /* renamed from: f */
    private int f129007f;

    /* renamed from: g */
    private int f129008g;

    /* renamed from: h */
    private int f129009h;

    /* renamed from: i */
    private int f129010i;

    /* renamed from: j */
    private int f129011j;

    /* renamed from: k */
    private int f129012k;

    /* renamed from: l */
    private int f129013l;

    /* renamed from: m */
    private boolean f129014m;

    /* renamed from: n */
    private InterfaceC24498e f129015n;

    /* renamed from: o */
    private final float[] f129016o;

    /* renamed from: p */
    private long f129017p;

    /* renamed from: q */
    private long f129018q;

    /* renamed from: r */
    private final Object f129019r;

    /* renamed from: uy.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C27384a m140301a() {
            AbstractC19060k abstractC19060k = null;
            try {
                EnumC16739a enumC16739a = EnumC16739a.f84892i0;
                if (!AbstractC23044d5.m118229b(enumC16739a)) {
                    AbstractC23044d5.m118231d(CoreUtility.getAppContext(), enumC16739a);
                }
                if (!AbstractC23044d5.m118229b(enumC16739a)) {
                    return null;
                }
                return new C27384a(abstractC19060k);
            } catch (Throwable th2) {
                AbstractC20110a.f98889a.mo104552e(th2);
                return null;
            }
        }
    }

    public /* synthetic */ C27384a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: d */
    private final void m140290d() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1);
        AbstractC19074t.m100207e(allocateDirect, "allocateDirect(1)");
        this.f129002a = allocateDirect;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(1);
        AbstractC19074t.m100207e(allocateDirect2, "allocateDirect(1)");
        this.f129003b = allocateDirect2;
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(1);
        AbstractC19074t.m100207e(allocateDirect3, "allocateDirect(1)");
        this.f129004c = allocateDirect3;
        ByteBuffer allocateDirect4 = ByteBuffer.allocateDirect(1);
        AbstractC19074t.m100207e(allocateDirect4, "allocateDirect(1)");
        this.f129005d = allocateDirect4;
        ByteBuffer allocateDirect5 = ByteBuffer.allocateDirect(1);
        AbstractC19074t.m100207e(allocateDirect5, "allocateDirect(1)");
        this.f129006e = allocateDirect5;
    }

    /* renamed from: a */
    public final float m140291a(Bitmap bitmap) {
        float m131355C;
        AbstractC19074t.m100208f(bitmap, "bitmap");
        synchronized (this.f129019r) {
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.f129009h, this.f129010i, false);
            AbstractC19074t.m100207e(createScaledBitmap, "createScaledBitmap(bitmap, modelExpectedWidth, modelExpectedHeight, false)");
            this.f129006e.position(0);
            QRClassifierKt.normalizePixelValueFromBitmap(createScaledBitmap, this.f129006e, 255.0f, 0.0f);
            C24848g0 c24848g0 = C24848g0.f119245a;
            m140297h(System.currentTimeMillis() - currentTimeMillis);
            long currentTimeMillis2 = System.currentTimeMillis();
            InterfaceC24498e interfaceC24498e = this.f129015n;
            if (interfaceC24498e != null) {
                interfaceC24498e.m127821B(this.f129006e, this.f129016o);
            }
            m140296g(System.currentTimeMillis() - currentTimeMillis2);
            m131355C = AbstractC25358n.m131355C(this.f129016o);
        }
        return m131355C;
    }

    /* renamed from: b */
    public final float m140292b(byte[] bArr) {
        float m131355C;
        AbstractC19074t.m100208f(bArr, "nv21Data");
        synchronized (this.f129019r) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int i11 = this.f129007f * this.f129008g;
                int i12 = this.f129009h;
                int i13 = this.f129010i;
                if (i11 < i12 * i13) {
                    int i14 = ((i12 * i13) * 3) / 2;
                    if (this.f129004c.capacity() < i14) {
                        ByteBuffer order = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
                        AbstractC19074t.m100207e(order, "allocateDirect(yuvImageSize)\n                        .order(ByteOrder.nativeOrder())");
                        this.f129004c = order;
                    }
                } else {
                    this.f129004c = this.f129002a;
                }
                this.f129002a.position(0);
                this.f129002a.put(bArr);
                this.f129002a.position(0);
                if (this.f129014m) {
                    YuvImageHelperKt.m49648d(this.f129003b, this.f129002a, this.f129007f, this.f129008g);
                    YuvImageHelperKt.m49645a(this.f129002a, this.f129003b, this.f129007f, this.f129008g, this.f129011j);
                } else {
                    YuvImageHelperKt.m49648d(this.f129002a, this.f129003b, this.f129007f, this.f129008g);
                }
                YuvImageHelperKt.m49646b(this.f129003b, this.f129012k, this.f129013l, this.f129004c, this.f129009h, this.f129010i);
                YuvImageHelperKt.m49647c(this.f129004c, this.f129005d, this.f129009h, this.f129010i);
                this.f129005d.position(0);
                this.f129006e.position(0);
                QRClassifierKt.normalizePixelValue(this.f129005d, this.f129006e, 255.0f, 0.0f, this.f129009h, this.f129010i);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m140297h(System.currentTimeMillis() - currentTimeMillis);
                long currentTimeMillis2 = System.currentTimeMillis();
                InterfaceC24498e interfaceC24498e = this.f129015n;
                if (interfaceC24498e != null) {
                    interfaceC24498e.m127821B(this.f129006e, this.f129016o);
                }
                m140296g(System.currentTimeMillis() - currentTimeMillis2);
                m131355C = AbstractC25358n.m131355C(this.f129016o);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m131355C;
    }

    /* renamed from: c */
    public final void m140293c() {
        InterfaceC24498e interfaceC24498e = this.f129015n;
        if (interfaceC24498e != null) {
            interfaceC24498e.close();
        }
        m140290d();
    }

    /* renamed from: e */
    public final long m140294e() {
        return this.f129018q;
    }

    /* renamed from: f */
    public final long m140295f() {
        return this.f129017p;
    }

    /* renamed from: g */
    public final void m140296g(long j11) {
        this.f129018q = j11;
    }

    /* renamed from: h */
    public final void m140297h(long j11) {
        this.f129017p = j11;
    }

    /* renamed from: i */
    public final void m140298i(int i11, int i12, boolean z11, int i13) {
        int i14 = ((i11 * i12) * 3) / 2;
        ByteBuffer order = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order, "allocateDirect(yuvImageSize)\n            .order(ByteOrder.nativeOrder())");
        this.f129002a = order;
        ByteBuffer order2 = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order2, "allocateDirect(yuvImageSize)\n            .order(ByteOrder.nativeOrder())");
        this.f129003b = order2;
        this.f129007f = i11;
        this.f129008g = i12;
        this.f129011j = i13;
        this.f129012k = i11;
        this.f129013l = i12;
        this.f129014m = z11;
        if (z11) {
            if (i13 == 90 || i13 == 270) {
                this.f129012k = i12;
                this.f129013l = i11;
            }
        }
    }

    /* renamed from: j */
    public final void m140299j(InterfaceC24498e interfaceC24498e) {
        AbstractC19074t.m100208f(interfaceC24498e, "interpreter");
        InterfaceC24498e interfaceC24498e2 = this.f129015n;
        if (interfaceC24498e2 != null) {
            interfaceC24498e2.close();
        }
        this.f129015n = interfaceC24498e;
    }

    /* renamed from: k */
    public final void m140300k(int i11, int i12) {
        int i13 = i11 * i12;
        ByteBuffer order = ByteBuffer.allocateDirect(i13 * 4).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order, "allocateDirect(modelExpectedWidth * modelExpectedHeight * 4)\n            .order(ByteOrder.nativeOrder())");
        this.f129005d = order;
        ByteBuffer order2 = ByteBuffer.allocateDirect(i13 * 12).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order2, "allocateDirect(modelExpectedWidth * modelExpectedHeight * FLOAT_TYPE_SIZE * PIXEL_SIZE)\n            .order(ByteOrder.nativeOrder())");
        this.f129006e = order2;
        this.f129009h = i11;
        this.f129010i = i12;
    }

    private C27384a() {
        ByteBuffer order = ByteBuffer.allocateDirect(1).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order, "allocateDirect(1)\n        .order(ByteOrder.nativeOrder())");
        this.f129002a = order;
        ByteBuffer order2 = ByteBuffer.allocateDirect(1).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order2, "allocateDirect(1)\n        .order(ByteOrder.nativeOrder())");
        this.f129003b = order2;
        ByteBuffer order3 = ByteBuffer.allocateDirect(1).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order3, "allocateDirect(1)\n        .order(ByteOrder.nativeOrder())");
        this.f129004c = order3;
        ByteBuffer order4 = ByteBuffer.allocateDirect(1).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order4, "allocateDirect(1)\n        .order(ByteOrder.nativeOrder())");
        this.f129005d = order4;
        ByteBuffer order5 = ByteBuffer.allocateDirect(1).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order5, "allocateDirect(1)\n        .order(ByteOrder.nativeOrder())");
        this.f129006e = order5;
        this.f129016o = new float[]{0.0f};
        this.f129019r = new Object();
    }
}
