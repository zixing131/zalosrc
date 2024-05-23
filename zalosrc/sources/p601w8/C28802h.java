package p601w8;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;
import p540u8.InterfaceC27097a;
import p540u8.InterfaceC27098b;
import p601w8.C28802h;

/* renamed from: w8.h */
/* loaded from: classes.dex */
public class C28802h {

    /* renamed from: a */
    private final Map f133469a;

    /* renamed from: b */
    private final Map f133470b;

    /* renamed from: c */
    private final InterfaceC26584c f133471c;

    /* renamed from: w8.h$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC27098b {

        /* renamed from: d */
        private static final InterfaceC26584c f133472d = new InterfaceC26584c() { // from class: w8.g
            @Override // p520t8.InterfaceC26584c
            /* renamed from: a */
            public final void mo480a(Object obj, Object obj2) {
                C28802h.a.m144065e(obj, (InterfaceC26585d) obj2);
            }
        };

        /* renamed from: a */
        private final Map f133473a = new HashMap();

        /* renamed from: b */
        private final Map f133474b = new HashMap();

        /* renamed from: c */
        private InterfaceC26584c f133475c = f133472d;

        /* renamed from: e */
        public static /* synthetic */ void m144065e(Object obj, InterfaceC26585d interfaceC26585d) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C28802h m144066c() {
            return new C28802h(new HashMap(this.f133473a), new HashMap(this.f133474b), this.f133475c);
        }

        /* renamed from: d */
        public a m144067d(InterfaceC27097a interfaceC27097a) {
            interfaceC27097a.mo479a(this);
            return this;
        }

        @Override // p540u8.InterfaceC27098b
        /* renamed from: f */
        public a mo725a(Class cls, InterfaceC26584c interfaceC26584c) {
            this.f133473a.put(cls, interfaceC26584c);
            this.f133474b.remove(cls);
            return this;
        }
    }

    C28802h(Map map, Map map2, InterfaceC26584c interfaceC26584c) {
        this.f133469a = map;
        this.f133470b = map2;
        this.f133471c = interfaceC26584c;
    }

    /* renamed from: a */
    public static a m144061a() {
        return new a();
    }

    /* renamed from: b */
    public void m144062b(Object obj, OutputStream outputStream) {
        new C28800f(outputStream, this.f133469a, this.f133470b, this.f133471c).m144060s(obj);
    }

    /* renamed from: c */
    public byte[] m144063c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m144062b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
