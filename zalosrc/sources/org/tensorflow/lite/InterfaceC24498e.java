package org.tensorflow.lite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: org.tensorflow.lite.e */
/* loaded from: classes7.dex */
public interface InterfaceC24498e extends AutoCloseable {
    /* renamed from: B */
    void m127821B(Object obj, Object obj2);

    /* renamed from: C0 */
    InterfaceC24500h m127822C0(int i11);

    /* renamed from: Y */
    InterfaceC24500h m127823Y(int i11);

    @Override // java.lang.AutoCloseable
    void close();

    /* renamed from: t0 */
    void m127824t0();

    /* renamed from: org.tensorflow.lite.e$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        EnumC32920a f118054a;

        /* renamed from: b */
        int f118055b;

        /* renamed from: c */
        Boolean f118056c;

        /* renamed from: d */
        Boolean f118057d;

        /* renamed from: e */
        final List f118058e;

        /* renamed from: org.tensorflow.lite.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public enum EnumC32920a {
            FROM_APPLICATION_ONLY,
            FROM_SYSTEM_ONLY,
            PREFER_SYSTEM_OVER_APPLICATION
        }

        public a() {
            this.f118054a = EnumC32920a.FROM_APPLICATION_ONLY;
            this.f118055b = -1;
            this.f118058e = new ArrayList();
        }

        /* renamed from: a */
        public List m127825a() {
            return Collections.unmodifiableList(this.f118058e);
        }

        /* renamed from: b */
        public int m127826b() {
            return this.f118055b;
        }

        /* renamed from: c */
        public boolean m127827c() {
            Boolean bool = this.f118056c;
            if (bool != null && bool.booleanValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean m127828d() {
            Boolean bool = this.f118057d;
            if (bool != null && bool.booleanValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public a m127829e(int i11) {
            this.f118055b = i11;
            return this;
        }

        /* renamed from: f */
        public a m127830f(EnumC32920a enumC32920a) {
            this.f118054a = enumC32920a;
            return this;
        }

        public a(a aVar) {
            this.f118054a = EnumC32920a.FROM_APPLICATION_ONLY;
            this.f118055b = -1;
            this.f118055b = aVar.f118055b;
            this.f118056c = aVar.f118056c;
            this.f118057d = aVar.f118057d;
            this.f118058e = new ArrayList(aVar.f118058e);
            this.f118054a = aVar.f118054a;
        }
    }
}
